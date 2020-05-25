# Pagerduty Resource Provider

The Pagerduty Resource Provider lets you manage Pagerduty resources.

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

- `auth0:domain` - (Required) Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
- `auth0:client_id` - (Required) Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
- `auth0:client_secret` - (Required) Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
- `auth0:debug` - (Optional) Indicates whether or not to turn on debug mode.

## Reference

For further information, please visit [the Auth0 provider docs](https://www.pulumi.com/docs/intro/cloud-providers/auth0) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/auth0).
