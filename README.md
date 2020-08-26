[![Actions Status](https://github.com/pulumi/pulumi-pagerduty/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-pagerduty/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fpagerduty.svg)](https://www.npmjs.com/package/@pulumi/pagerduty)
[![Python version](https://badge.fury.io/py/pulumi-pagerduty.svg)](https://pypi.org/project/pulumi-pagerduty)
[![NuGet version](https://badge.fury.io/nu/pulumi.pagerduty.svg)](https://badge.fury.io/nu/pulumi.pagerduty)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-pagerduty/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-pagerduty/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-pagerduty/blob/master/LICENSE)

# PagerDuty Resource Provider

The PagerDuty Resource Provider lets you manage PagerDuty resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/pagerduty

or `yarn`:

    $ yarn add @pulumi/pagerduty

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_pagerduty

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-pagerduty/sdk/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Pagerduty

## Configuration

The following configuration points are available:

- `pagerduty:token` - (Required) The v2 authorization token. It can also be sourced from the `PAGERDUTY_TOKEN` 
  environment variable. See [API Documentation](https://v2.developer.pagerduty.com/docs/authentication) for more information.
- `pageduty:skipCredentialsValidation` - (Optional) Skip validation of the token against the PagerDuty API.

## Reference

For further information, please visit [the PagerDuty provider docs](https://www.pulumi.com/docs/intro/cloud-providers/pagerduty)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/pagerduty).
