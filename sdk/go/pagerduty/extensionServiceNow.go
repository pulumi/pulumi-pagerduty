// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A special case for [extension](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1extensions/post) for ServiceNow.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/v2/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		webhook, err := pagerduty.GetExtensionSchema(ctx, &pagerduty.GetExtensionSchemaArgs{
// 			Name: "Generic V2 Webhook",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleUser, err := pagerduty.NewUser(ctx, "exampleUser", &pagerduty.UserArgs{
// 			Email: pulumi.String("howard.james@example.domain"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleEscalationPolicy, err := pagerduty.NewEscalationPolicy(ctx, "exampleEscalationPolicy", &pagerduty.EscalationPolicyArgs{
// 			NumLoops: pulumi.Int(2),
// 			Rules: pagerduty.EscalationPolicyRuleArray{
// 				&pagerduty.EscalationPolicyRuleArgs{
// 					EscalationDelayInMinutes: pulumi.Int(10),
// 					Targets: pagerduty.EscalationPolicyRuleTargetArray{
// 						&pagerduty.EscalationPolicyRuleTargetArgs{
// 							Type: pulumi.String("user"),
// 							Id:   exampleUser.ID(),
// 						},
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleService, err := pagerduty.NewService(ctx, "exampleService", &pagerduty.ServiceArgs{
// 			AutoResolveTimeout:     pulumi.String("14400"),
// 			AcknowledgementTimeout: pulumi.String("600"),
// 			EscalationPolicy:       exampleEscalationPolicy.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewExtensionServiceNow(ctx, "snow", &pagerduty.ExtensionServiceNowArgs{
// 			ExtensionSchema: pulumi.String(webhook.Id),
// 			ExtensionObjects: pulumi.StringArray{
// 				exampleService.ID(),
// 			},
// 			SnowUser:     pulumi.String("meeps"),
// 			SnowPassword: pulumi.String("zorz"),
// 			SyncOptions:  pulumi.String("manual_sync"),
// 			Target:       pulumi.String("https://foo.servicenow.com/webhook_foo"),
// 			TaskType:     pulumi.String("incident"),
// 			Referer:      pulumi.String("None"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Extensions can be imported using the id.e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/extensionServiceNow:ExtensionServiceNow main PLBP09X
// ```
type ExtensionServiceNow struct {
	pulumi.CustomResourceState

	EndpointUrl pulumi.StringPtrOutput `pulumi:"endpointUrl"`
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects pulumi.StringArrayOutput `pulumi:"extensionObjects"`
	// This is the schema for this extension.
	ExtensionSchema pulumi.StringOutput `pulumi:"extensionSchema"`
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringOutput `pulumi:"htmlUrl"`
	// The name of the service extension.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ServiceNow referer.
	Referer pulumi.StringOutput `pulumi:"referer"`
	// The ServiceNow password.
	SnowPassword pulumi.StringOutput `pulumi:"snowPassword"`
	// The ServiceNow username.
	SnowUser pulumi.StringOutput `pulumi:"snowUser"`
	// The ServiceNow sync option.
	SyncOptions pulumi.StringOutput `pulumi:"syncOptions"`
	// Target Webhook URL
	Target pulumi.StringOutput `pulumi:"target"`
	// The ServiceNow task type, typically `incident`.
	TaskType pulumi.StringOutput `pulumi:"taskType"`
	Type     pulumi.StringOutput `pulumi:"type"`
}

// NewExtensionServiceNow registers a new resource with the given unique name, arguments, and options.
func NewExtensionServiceNow(ctx *pulumi.Context,
	name string, args *ExtensionServiceNowArgs, opts ...pulumi.ResourceOption) (*ExtensionServiceNow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExtensionObjects == nil {
		return nil, errors.New("invalid value for required argument 'ExtensionObjects'")
	}
	if args.ExtensionSchema == nil {
		return nil, errors.New("invalid value for required argument 'ExtensionSchema'")
	}
	if args.Referer == nil {
		return nil, errors.New("invalid value for required argument 'Referer'")
	}
	if args.SnowPassword == nil {
		return nil, errors.New("invalid value for required argument 'SnowPassword'")
	}
	if args.SnowUser == nil {
		return nil, errors.New("invalid value for required argument 'SnowUser'")
	}
	if args.SyncOptions == nil {
		return nil, errors.New("invalid value for required argument 'SyncOptions'")
	}
	if args.Target == nil {
		return nil, errors.New("invalid value for required argument 'Target'")
	}
	if args.TaskType == nil {
		return nil, errors.New("invalid value for required argument 'TaskType'")
	}
	var resource ExtensionServiceNow
	err := ctx.RegisterResource("pagerduty:index/extensionServiceNow:ExtensionServiceNow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExtensionServiceNow gets an existing ExtensionServiceNow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExtensionServiceNow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExtensionServiceNowState, opts ...pulumi.ResourceOption) (*ExtensionServiceNow, error) {
	var resource ExtensionServiceNow
	err := ctx.ReadResource("pagerduty:index/extensionServiceNow:ExtensionServiceNow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExtensionServiceNow resources.
type extensionServiceNowState struct {
	EndpointUrl *string `pulumi:"endpointUrl"`
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects []string `pulumi:"extensionObjects"`
	// This is the schema for this extension.
	ExtensionSchema *string `pulumi:"extensionSchema"`
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl *string `pulumi:"htmlUrl"`
	// The name of the service extension.
	Name *string `pulumi:"name"`
	// The ServiceNow referer.
	Referer *string `pulumi:"referer"`
	// The ServiceNow password.
	SnowPassword *string `pulumi:"snowPassword"`
	// The ServiceNow username.
	SnowUser *string `pulumi:"snowUser"`
	// The ServiceNow sync option.
	SyncOptions *string `pulumi:"syncOptions"`
	// Target Webhook URL
	Target *string `pulumi:"target"`
	// The ServiceNow task type, typically `incident`.
	TaskType *string `pulumi:"taskType"`
	Type     *string `pulumi:"type"`
}

type ExtensionServiceNowState struct {
	EndpointUrl pulumi.StringPtrInput
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects pulumi.StringArrayInput
	// This is the schema for this extension.
	ExtensionSchema pulumi.StringPtrInput
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringPtrInput
	// The name of the service extension.
	Name pulumi.StringPtrInput
	// The ServiceNow referer.
	Referer pulumi.StringPtrInput
	// The ServiceNow password.
	SnowPassword pulumi.StringPtrInput
	// The ServiceNow username.
	SnowUser pulumi.StringPtrInput
	// The ServiceNow sync option.
	SyncOptions pulumi.StringPtrInput
	// Target Webhook URL
	Target pulumi.StringPtrInput
	// The ServiceNow task type, typically `incident`.
	TaskType pulumi.StringPtrInput
	Type     pulumi.StringPtrInput
}

func (ExtensionServiceNowState) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionServiceNowState)(nil)).Elem()
}

type extensionServiceNowArgs struct {
	EndpointUrl *string `pulumi:"endpointUrl"`
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects []string `pulumi:"extensionObjects"`
	// This is the schema for this extension.
	ExtensionSchema string `pulumi:"extensionSchema"`
	// The name of the service extension.
	Name *string `pulumi:"name"`
	// The ServiceNow referer.
	Referer string `pulumi:"referer"`
	// The ServiceNow password.
	SnowPassword string `pulumi:"snowPassword"`
	// The ServiceNow username.
	SnowUser string `pulumi:"snowUser"`
	// The ServiceNow sync option.
	SyncOptions string `pulumi:"syncOptions"`
	// Target Webhook URL
	Target string `pulumi:"target"`
	// The ServiceNow task type, typically `incident`.
	TaskType string  `pulumi:"taskType"`
	Type     *string `pulumi:"type"`
}

// The set of arguments for constructing a ExtensionServiceNow resource.
type ExtensionServiceNowArgs struct {
	EndpointUrl pulumi.StringPtrInput
	// This is the objects for which the extension applies (An array of service ids).
	ExtensionObjects pulumi.StringArrayInput
	// This is the schema for this extension.
	ExtensionSchema pulumi.StringInput
	// The name of the service extension.
	Name pulumi.StringPtrInput
	// The ServiceNow referer.
	Referer pulumi.StringInput
	// The ServiceNow password.
	SnowPassword pulumi.StringInput
	// The ServiceNow username.
	SnowUser pulumi.StringInput
	// The ServiceNow sync option.
	SyncOptions pulumi.StringInput
	// Target Webhook URL
	Target pulumi.StringInput
	// The ServiceNow task type, typically `incident`.
	TaskType pulumi.StringInput
	Type     pulumi.StringPtrInput
}

func (ExtensionServiceNowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionServiceNowArgs)(nil)).Elem()
}

type ExtensionServiceNowInput interface {
	pulumi.Input

	ToExtensionServiceNowOutput() ExtensionServiceNowOutput
	ToExtensionServiceNowOutputWithContext(ctx context.Context) ExtensionServiceNowOutput
}

func (*ExtensionServiceNow) ElementType() reflect.Type {
	return reflect.TypeOf((*ExtensionServiceNow)(nil))
}

func (i *ExtensionServiceNow) ToExtensionServiceNowOutput() ExtensionServiceNowOutput {
	return i.ToExtensionServiceNowOutputWithContext(context.Background())
}

func (i *ExtensionServiceNow) ToExtensionServiceNowOutputWithContext(ctx context.Context) ExtensionServiceNowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionServiceNowOutput)
}

func (i *ExtensionServiceNow) ToExtensionServiceNowPtrOutput() ExtensionServiceNowPtrOutput {
	return i.ToExtensionServiceNowPtrOutputWithContext(context.Background())
}

func (i *ExtensionServiceNow) ToExtensionServiceNowPtrOutputWithContext(ctx context.Context) ExtensionServiceNowPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionServiceNowPtrOutput)
}

type ExtensionServiceNowPtrInput interface {
	pulumi.Input

	ToExtensionServiceNowPtrOutput() ExtensionServiceNowPtrOutput
	ToExtensionServiceNowPtrOutputWithContext(ctx context.Context) ExtensionServiceNowPtrOutput
}

type extensionServiceNowPtrType ExtensionServiceNowArgs

func (*extensionServiceNowPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ExtensionServiceNow)(nil))
}

func (i *extensionServiceNowPtrType) ToExtensionServiceNowPtrOutput() ExtensionServiceNowPtrOutput {
	return i.ToExtensionServiceNowPtrOutputWithContext(context.Background())
}

func (i *extensionServiceNowPtrType) ToExtensionServiceNowPtrOutputWithContext(ctx context.Context) ExtensionServiceNowPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionServiceNowPtrOutput)
}

// ExtensionServiceNowArrayInput is an input type that accepts ExtensionServiceNowArray and ExtensionServiceNowArrayOutput values.
// You can construct a concrete instance of `ExtensionServiceNowArrayInput` via:
//
//          ExtensionServiceNowArray{ ExtensionServiceNowArgs{...} }
type ExtensionServiceNowArrayInput interface {
	pulumi.Input

	ToExtensionServiceNowArrayOutput() ExtensionServiceNowArrayOutput
	ToExtensionServiceNowArrayOutputWithContext(context.Context) ExtensionServiceNowArrayOutput
}

type ExtensionServiceNowArray []ExtensionServiceNowInput

func (ExtensionServiceNowArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ExtensionServiceNow)(nil))
}

func (i ExtensionServiceNowArray) ToExtensionServiceNowArrayOutput() ExtensionServiceNowArrayOutput {
	return i.ToExtensionServiceNowArrayOutputWithContext(context.Background())
}

func (i ExtensionServiceNowArray) ToExtensionServiceNowArrayOutputWithContext(ctx context.Context) ExtensionServiceNowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionServiceNowArrayOutput)
}

// ExtensionServiceNowMapInput is an input type that accepts ExtensionServiceNowMap and ExtensionServiceNowMapOutput values.
// You can construct a concrete instance of `ExtensionServiceNowMapInput` via:
//
//          ExtensionServiceNowMap{ "key": ExtensionServiceNowArgs{...} }
type ExtensionServiceNowMapInput interface {
	pulumi.Input

	ToExtensionServiceNowMapOutput() ExtensionServiceNowMapOutput
	ToExtensionServiceNowMapOutputWithContext(context.Context) ExtensionServiceNowMapOutput
}

type ExtensionServiceNowMap map[string]ExtensionServiceNowInput

func (ExtensionServiceNowMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ExtensionServiceNow)(nil))
}

func (i ExtensionServiceNowMap) ToExtensionServiceNowMapOutput() ExtensionServiceNowMapOutput {
	return i.ToExtensionServiceNowMapOutputWithContext(context.Background())
}

func (i ExtensionServiceNowMap) ToExtensionServiceNowMapOutputWithContext(ctx context.Context) ExtensionServiceNowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionServiceNowMapOutput)
}

type ExtensionServiceNowOutput struct {
	*pulumi.OutputState
}

func (ExtensionServiceNowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ExtensionServiceNow)(nil))
}

func (o ExtensionServiceNowOutput) ToExtensionServiceNowOutput() ExtensionServiceNowOutput {
	return o
}

func (o ExtensionServiceNowOutput) ToExtensionServiceNowOutputWithContext(ctx context.Context) ExtensionServiceNowOutput {
	return o
}

func (o ExtensionServiceNowOutput) ToExtensionServiceNowPtrOutput() ExtensionServiceNowPtrOutput {
	return o.ToExtensionServiceNowPtrOutputWithContext(context.Background())
}

func (o ExtensionServiceNowOutput) ToExtensionServiceNowPtrOutputWithContext(ctx context.Context) ExtensionServiceNowPtrOutput {
	return o.ApplyT(func(v ExtensionServiceNow) *ExtensionServiceNow {
		return &v
	}).(ExtensionServiceNowPtrOutput)
}

type ExtensionServiceNowPtrOutput struct {
	*pulumi.OutputState
}

func (ExtensionServiceNowPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExtensionServiceNow)(nil))
}

func (o ExtensionServiceNowPtrOutput) ToExtensionServiceNowPtrOutput() ExtensionServiceNowPtrOutput {
	return o
}

func (o ExtensionServiceNowPtrOutput) ToExtensionServiceNowPtrOutputWithContext(ctx context.Context) ExtensionServiceNowPtrOutput {
	return o
}

type ExtensionServiceNowArrayOutput struct{ *pulumi.OutputState }

func (ExtensionServiceNowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExtensionServiceNow)(nil))
}

func (o ExtensionServiceNowArrayOutput) ToExtensionServiceNowArrayOutput() ExtensionServiceNowArrayOutput {
	return o
}

func (o ExtensionServiceNowArrayOutput) ToExtensionServiceNowArrayOutputWithContext(ctx context.Context) ExtensionServiceNowArrayOutput {
	return o
}

func (o ExtensionServiceNowArrayOutput) Index(i pulumi.IntInput) ExtensionServiceNowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ExtensionServiceNow {
		return vs[0].([]ExtensionServiceNow)[vs[1].(int)]
	}).(ExtensionServiceNowOutput)
}

type ExtensionServiceNowMapOutput struct{ *pulumi.OutputState }

func (ExtensionServiceNowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ExtensionServiceNow)(nil))
}

func (o ExtensionServiceNowMapOutput) ToExtensionServiceNowMapOutput() ExtensionServiceNowMapOutput {
	return o
}

func (o ExtensionServiceNowMapOutput) ToExtensionServiceNowMapOutputWithContext(ctx context.Context) ExtensionServiceNowMapOutput {
	return o
}

func (o ExtensionServiceNowMapOutput) MapIndex(k pulumi.StringInput) ExtensionServiceNowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ExtensionServiceNow {
		return vs[0].(map[string]ExtensionServiceNow)[vs[1].(string)]
	}).(ExtensionServiceNowOutput)
}

func init() {
	pulumi.RegisterOutputType(ExtensionServiceNowOutput{})
	pulumi.RegisterOutputType(ExtensionServiceNowPtrOutput{})
	pulumi.RegisterOutputType(ExtensionServiceNowArrayOutput{})
	pulumi.RegisterOutputType(ExtensionServiceNowMapOutput{})
}
