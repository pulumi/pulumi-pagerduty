# WARNING: This file is autogenerated - changes will be overwritten if not made via https://github.com/pulumi/ci-mgmt

PACK := pagerduty
ORG := pulumi
PROJECT := github.com/$(ORG)/pulumi-$(PACK)
PROVIDER_PATH := provider/v3
VERSION_PATH := $(PROVIDER_PATH)/pkg/version.Version
TFGEN := pulumi-tfgen-$(PACK)
PROVIDER := pulumi-resource-$(PACK)
VERSION := $(shell pulumictl get version)
JAVA_GEN := pulumi-java-gen
JAVA_GEN_VERSION := v0.5.4
TESTPARALLELISM := 10
WORKING_DIR := $(shell pwd)

development: install_plugins provider build_sdks install_sdks

build: install_plugins provider build_sdks install_sdks

build_sdks: build_nodejs build_python build_go build_dotnet build_java

install_go_sdk:

install_java_sdk:

install_python_sdk:

install_sdks: install_dotnet_sdk install_python_sdk install_nodejs_sdk install_java_sdk

only_build: build

build_dotnet: DOTNET_VERSION := $(shell pulumictl get version --language dotnet)
build_dotnet: upstream
	pulumictl get version --language dotnet
	$(WORKING_DIR)/bin/$(TFGEN) dotnet --out sdk/dotnet/
	cd sdk/dotnet/ && \
		echo "module fake_dotnet_module // Exclude this directory from Go tools\n\ngo 1.17" > go.mod && \
		echo "$(DOTNET_VERSION)" >version.txt && \
		dotnet build /p:Version=$(DOTNET_VERSION)

build_go: upstream
	$(WORKING_DIR)/bin/$(TFGEN) go --out sdk/go/
	cd sdk && go list `grep -e "^module" go.mod | cut -d ' ' -f 2`/go/... | xargs go build

build_java: PACKAGE_VERSION := $(shell pulumictl get version --language generic)
build_java: bin/pulumi-java-gen upstream
	$(WORKING_DIR)/bin/$(JAVA_GEN) generate --schema provider/cmd/$(PROVIDER)/schema.json --out sdk/java  --build gradle-nexus
	cd sdk/java/ && \
		echo "module fake_java_module // Exclude this directory from Go tools\n\ngo 1.17" > go.mod && \
		gradle --console=plain build

build_nodejs: VERSION := $(shell pulumictl get version --language javascript)
build_nodejs: upstream
	$(WORKING_DIR)/bin/$(TFGEN) nodejs --out sdk/nodejs/
	cd sdk/nodejs/ && \
		echo "module fake_nodejs_module // Exclude this directory from Go tools\n\ngo 1.17" > go.mod && \
		yarn install && \
		yarn run tsc && \
		cp ../../README.md ../../LICENSE* package.json yarn.lock ./bin/ && \
		sed -i.bak -e "s/\$${VERSION}/$(VERSION)/g" ./bin/package.json

build_python: PYPI_VERSION := $(shell pulumictl get version --language python)
build_python: upstream
	$(WORKING_DIR)/bin/$(TFGEN) python --out sdk/python/
	cd sdk/python/ && \
		echo "module fake_python_module // Exclude this directory from Go tools\n\ngo 1.17" > go.mod && \
		cp ../../README.md . && \
		python3 setup.py clean --all 2>/dev/null && \
		rm -rf ./bin/ ../python.bin/ && cp -R . ../python.bin && mv ../python.bin ./bin && \
		sed -i.bak -e 's/^VERSION = .*/VERSION = "$(PYPI_VERSION)"/g' -e 's/^PLUGIN_VERSION = .*/PLUGIN_VERSION = "$(VERSION)"/g' ./bin/setup.py && \
		rm ./bin/setup.py.bak && rm ./bin/go.mod && \
		cd ./bin && python3 setup.py build sdist

clean:
	rm -rf sdk/{dotnet,nodejs,go,python}

cleanup:
	rm -r $(WORKING_DIR)/bin
	rm -f provider/cmd/$(PROVIDER)/schema.go

finish-patch:
	@if [ ! -z "$$(cd upstream && git status --porcelain)" ]; then echo "Please commit your changes before finishing the patch"; exit 1; fi
	@cd upstream && \
		git format-patch HEAD~ -o ../patches --start-number $$(($$(ls ../patches | wc -l | xargs)+1))

help:
	@grep '^[^.#]\+:\s\+.*#' Makefile | \
	sed "s/\(.\+\):\s*\(.*\) #\s*\(.*\)/`printf "\033[93m"`\1`printf "\033[0m"`	\3 [\2]/" | \
	expand -t20

install_dotnet_sdk:
	mkdir -p $(WORKING_DIR)/nuget
	find . -name '*.nupkg' -print -exec cp -p {} $(WORKING_DIR)/nuget \;

install_nodejs_sdk:
	yarn link --cwd $(WORKING_DIR)/sdk/nodejs/bin

install_plugins:
	[ -x "$(shell command -v pulumi 2>/dev/null)" ] || curl -fsSL https://get.pulumi.com | sh

lint_provider: provider
	cd provider && golangci-lint run -c ../.golangci.yml

provider: tfgen install_plugins
	(cd provider && go build -p 1 -o $(WORKING_DIR)/bin/$(PROVIDER) -ldflags "-X $(PROJECT)/$(VERSION_PATH)=$(VERSION)" $(PROJECT)/$(PROVIDER_PATH)/cmd/$(PROVIDER))

start-patch: upstream
ifeq ("$(wildcard upstream)","")
	@echo "No upstream found, so upstream can't be patched"
	@exit 1
else
	# To add an additional patch:
	#
	#	1. Run this command (`make start-patch`).
	#
	#	2. Edit the `upstream` repo, making whatever changes you want to appear in the new
	#	patch. It's fine to edit multiple files.
	#
	#	3. Commit your changes. The slugified first line of your commit description will
	#	be used to generate the patch file name. Only the diff from the latest commit will
	#	end up in the final patch.
	#
	#	4. Run `make finish-patch`.
	#
	# It is safe to run `make start-patch` as many times as you want, but any changes
	# might be reverted until `make finish-patch` is run.
	@cd upstream && git commit --quiet -m "existing patches"
endif

test:
	cd examples && go test -v -tags=all -parallel $(TESTPARALLELISM) -timeout 2h

tfgen: install_plugins upstream
	(cd provider && go build -p 1 -o $(WORKING_DIR)/bin/$(TFGEN) -ldflags "-X $(PROJECT)/$(VERSION_PATH)=$(VERSION)" $(PROJECT)/$(PROVIDER_PATH)/cmd/$(TFGEN))
	$(WORKING_DIR)/bin/$(TFGEN) schema --out provider/cmd/$(PROVIDER)
	(cd provider && VERSION=$(VERSION) go generate cmd/$(PROVIDER)/main.go)

upstream:
ifeq ("$(wildcard upstream)","")
	# upstream doesn't exist, so skip
else ifeq ("$(wildcard patches/*.patch)","")
	# upstream exists, but patches don't exist. This is probably an error.
	@echo "No patches found within the patch operation"
	@echo "patches were expected because upstream exists"
	@exit 1
else
	# Checkout the submodule at the pinned commit.
	# `--force`: If the submodule is at a different commit, move it to the pinned commit.
	# `--init`: If the submodule is not initialized, initialize it.
	git submodule update --force --init
	# Iterating over the patches folder in sorted order,
	# apply the patch using a 3-way merge strategy. This mirrors the default behavior of `git merge`
	cd upstream && \
		for patch in $(sort $(wildcard patches/*.patch)); do git apply --3way ../$$patch || exit 1; done
endif

bin/pulumi-java-gen:
	$(shell pulumictl download-binary -n pulumi-language-java -v $(JAVA_GEN_VERSION) -r pulumi/pulumi-java)

.PHONY: development build build_sdks install_go_sdk install_java_sdk install_python_sdk install_sdks only_build build_dotnet build_go build_java build_nodejs build_python clean cleanup finish-patch help install_dotnet_sdk install_nodejs_sdk install_plugins lint_provider provider start-patch test tfgen upstream