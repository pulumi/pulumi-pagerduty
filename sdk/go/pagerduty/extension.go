// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// An [extension](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Extensions/post_extensions) can be associated with a service.
type Extension struct {
	pulumi.CustomResourceState

	// The configuration of the service extension as string containing plain JSON-encoded data.
	Config pulumi.StringPtrOutput `pulumi:"config"`
	// The url of the extension.\
	// **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpointUrl`, but one with named `Slack` accepts.
	EndpointUrl pulumi.StringPtrOutput `pulumi:"endpointUrl"`
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects pulumi.StringArrayOutput `pulumi:"extensionObjects"`
	// This is the schema for this extension.
	ExtensionSchema pulumi.StringOutput `pulumi:"extensionSchema"`
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringOutput `pulumi:"htmlUrl"`
	// The name of the service extension.
	Name pulumi.StringOutput `pulumi:"name"`
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewExtension registers a new resource with the given unique name, arguments, and options.
func NewExtension(ctx *pulumi.Context,
	name string, args *ExtensionArgs, opts ...pulumi.ResourceOption) (*Extension, error) {
	if args == nil || args.ExtensionObjects == nil {
		return nil, errors.New("missing required argument 'ExtensionObjects'")
	}
	if args == nil || args.ExtensionSchema == nil {
		return nil, errors.New("missing required argument 'ExtensionSchema'")
	}
	if args == nil {
		args = &ExtensionArgs{}
	}
	var resource Extension
	err := ctx.RegisterResource("pagerduty:index/extension:Extension", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExtension gets an existing Extension resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExtension(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExtensionState, opts ...pulumi.ResourceOption) (*Extension, error) {
	var resource Extension
	err := ctx.ReadResource("pagerduty:index/extension:Extension", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Extension resources.
type extensionState struct {
	// The configuration of the service extension as string containing plain JSON-encoded data.
	Config *string `pulumi:"config"`
	// The url of the extension.\
	// **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpointUrl`, but one with named `Slack` accepts.
	EndpointUrl *string `pulumi:"endpointUrl"`
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects []string `pulumi:"extensionObjects"`
	// This is the schema for this extension.
	ExtensionSchema *string `pulumi:"extensionSchema"`
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl *string `pulumi:"htmlUrl"`
	// The name of the service extension.
	Name *string `pulumi:"name"`
	Type *string `pulumi:"type"`
}

type ExtensionState struct {
	// The configuration of the service extension as string containing plain JSON-encoded data.
	Config pulumi.StringPtrInput
	// The url of the extension.\
	// **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpointUrl`, but one with named `Slack` accepts.
	EndpointUrl pulumi.StringPtrInput
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects pulumi.StringArrayInput
	// This is the schema for this extension.
	ExtensionSchema pulumi.StringPtrInput
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringPtrInput
	// The name of the service extension.
	Name pulumi.StringPtrInput
	Type pulumi.StringPtrInput
}

func (ExtensionState) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionState)(nil)).Elem()
}

type extensionArgs struct {
	// The configuration of the service extension as string containing plain JSON-encoded data.
	Config *string `pulumi:"config"`
	// The url of the extension.\
	// **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpointUrl`, but one with named `Slack` accepts.
	EndpointUrl *string `pulumi:"endpointUrl"`
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects []string `pulumi:"extensionObjects"`
	// This is the schema for this extension.
	ExtensionSchema string `pulumi:"extensionSchema"`
	// The name of the service extension.
	Name *string `pulumi:"name"`
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Extension resource.
type ExtensionArgs struct {
	// The configuration of the service extension as string containing plain JSON-encoded data.
	Config pulumi.StringPtrInput
	// The url of the extension.\
	// **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpointUrl`, but one with named `Slack` accepts.
	EndpointUrl pulumi.StringPtrInput
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects pulumi.StringArrayInput
	// This is the schema for this extension.
	ExtensionSchema pulumi.StringInput
	// The name of the service extension.
	Name pulumi.StringPtrInput
	Type pulumi.StringPtrInput
}

func (ExtensionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionArgs)(nil)).Elem()
}
