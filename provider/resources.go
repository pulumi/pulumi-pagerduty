// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package pagerduty

import (
	"fmt"
	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"
	"path/filepath"
	"strings"
	_ "time/tzdata"
	"unicode"

	"github.com/PagerDuty/terraform-provider-pagerduty/pagerduty"
	"github.com/pulumi/pulumi-pagerduty/provider/v3/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "pagerduty"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// managedByPulumi is a default used for some managed resources, in the absence of something more meaningful.
var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(pagerduty.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "pagerduty",
		Description: "A Pulumi package for creating and managing pagerduty cloud resources.",
		Keywords:    []string{"pulumi", "pagerduty"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "PagerDuty",
		Repository:  "https://github.com/pulumi/pulumi-pagerduty",
		Config: map[string]*tfbridge.SchemaInfo{
			"skip_credentials_validation": {
				Type: "boolean",
				Default: &tfbridge.DefaultInfo{
					Value: false,
				},
			},
		},
		UpstreamRepoPath: "./upstream",
		Resources: map[string]*tfbridge.ResourceInfo{
			"pagerduty_business_service": {
				Tok: makeResource(mainMod, "BusinessService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_escalation_policy": {
				Tok: makeResource(mainMod, "EscalationPolicy"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_extension_servicenow": {Tok: makeResource(mainMod, "ExtensionServiceNow")},
			"pagerduty_maintenance_window": {
				Tok: makeResource(mainMod, "MaintenanceWindow"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_schedule": {
				Tok: makeResource(mainMod, "Schedule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_service": {
				Tok: makeResource(mainMod, "Service"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_team": {
				Tok: makeResource(mainMod, "Team"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_user": {
				Tok: makeResource(mainMod, "User"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_response_play": {
				Tok: makeResource(mainMod, "ResponsePlay"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_custom_field": {
				Tok: makeResource(mainMod, "CustomField"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// This field cannot be correctly auto-named. By
					// mentioning it explicitly, we disable
					// AutoNaming.
					"name": tfbridge.AutoNameWithCustomOptions("name", tfbridge.AutoNameOptions{
						Separator: "_",
						Transform: customNameTransform,
					}),
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"pagerduty_event_orchestration": {
				Tok: tfbridge.MakeDataSource("pagerduty", mainMod, "getEventOrchestration"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"integration": {
						Name: "integrationDetail",
					},
				},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	err := x.ComputeDefaults(&prov, x.TokensSingleModule("pagerduty_",
		mainMod, x.MakeStandardToken(mainPkg)))
	contract.AssertNoErrorf(err, "computing defaults failed")
	err = x.AutoAliasing(&prov, prov.GetMetadata())
	contract.

		// CustomField.name can only contain 'a'-'z' '0'-'9' and '_'.
		//
		// Non-conforming runes are replaced with '_'.
		AssertNoErrorf(err, "auto aliasing apply failed")

	prov.SetAutonaming(255, "-")

	return prov
}

func customNameTransform(s string) string {
	str := []rune(strings.ToLower(s))
	for i, v := range str {
		if (v >= 'a' && v <= 'z') ||
			(v >= '0' && v <= '9') {
			continue
		}
		str[i] = '_'
	}
	return string(str)
}

//go:embed cmd/pulumi-resource-pagerduty/bridge-metadata.json
var metadata []byte
