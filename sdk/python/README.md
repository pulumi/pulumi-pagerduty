# Terraform Bridge Provider Boilerplate

This repository contains boilerplate code for building a new Pulumi provider which wraps an existing
Terraform provider, if the existing provider uses _Go Modules_.

Modify this README to describe:

- The type of resources the provider manages
- Add a build status image from Travis at the top of the README
- Update package names in the information below
- Add any important documentation of concepts (e.g. the "serverless" components in the AWS provider).

## Creating a Pulumi Terraform Bridge Provider

First, clone this repo with the name of the desired provider in place of `pagerduty`:

```
git clone https://github.com/pulumi/pulumi-tf-provider-boilerplate pulumi-pagerduty
```

Second, replace references to `pagerduty` with the name of your provider:

```
make prepare NAME=foo REPOSITORY=github.com/pulumi/pulumi-foo
```

Next, list the configuration points for the provider in the area of the README.


> Note: If the name of the desired Pulumi provider differs from the name of the Terraform provider, you will need to carefully distinguish between the references - see https://github.com/pulumi/pulumi-azure for an example.

### Add dependencies

In order to properly build the sdks, the following tools are expected:
- tf2pulumi (See the project's README for installation instructions: https://github.com/pulumi/tf2pulumi)
- pandoc (`brew install pandoc`)

In the root of the repository, run:

- `GO111MODULE=on go get github.com/pulumi/pulumi-terraform@master`
- `(cd provider && go get github.com/terraform-providers/terraform-provider-foo)`  (where `foo` is the name of the provider - note the parenthesis to run this in a subshell)
- `(cd provider && go mod vendor)`
- `make ensure`

### Build the provider:

- Edit `provider/resources.go` to map each resource, and specify provider information
- Enumerate any examples in `examples/examples_test.go`
- `make`

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/xyx

or `yarn`:

    $ yarn add @pulumi/xyx

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_xyx

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-pagerduty/sdk/go/...

## Configuration

The following configuration points are available for the `pagerduty` provider:

- `pagerduty:token` (environment: `PAGERDUTY_TOKEN`) - (Required) The v2 authorization token. It can also be sourced from the `PAGERDUTY_TOKEN` environment variable. See [API Documentation](https://v2.developer.pagerduty.com/docs/authentication) for more information.
- `pagerduty:skip_credentials_validation` - (Optional) Skip validation of the token against the PagerDuty API.

## Reference

For detailed reference documentation, please visit [the API docs][1].


[1]: https://pulumi.io/reference/pkg/nodejs/pulumi/x/
