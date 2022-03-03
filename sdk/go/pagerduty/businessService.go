// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [business service](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1business_services/get) allows you to model capabilities that span multiple technical services and that may be owned by several different teams.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := pagerduty.NewBusinessService(ctx, "example", &pagerduty.BusinessServiceArgs{
// 			Description:    pulumi.String("A very descriptive description of this business service"),
// 			PointOfContact: pulumi.String("PagerDuty Admin"),
// 			Team:           pulumi.String("P37RSRS"),
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
// Services can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/businessService:BusinessService main PLBP09X
// ```
type BusinessService struct {
	pulumi.CustomResourceState

	Description pulumi.StringOutput `pulumi:"description"`
	HtmlUrl     pulumi.StringOutput `pulumi:"htmlUrl"`
	// The name of the business service.
	Name pulumi.StringOutput `pulumi:"name"`
	// The owner of the business service.
	PointOfContact pulumi.StringPtrOutput `pulumi:"pointOfContact"`
	Self           pulumi.StringOutput    `pulumi:"self"`
	Summary        pulumi.StringOutput    `pulumi:"summary"`
	// ID of the team that owns the business service.
	Team pulumi.StringPtrOutput `pulumi:"team"`
	// **Deprecated** (Optional) Default (and only supported) value is `businessService`.
	//
	// Deprecated: This will change to a computed resource in the next major release.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewBusinessService registers a new resource with the given unique name, arguments, and options.
func NewBusinessService(ctx *pulumi.Context,
	name string, args *BusinessServiceArgs, opts ...pulumi.ResourceOption) (*BusinessService, error) {
	if args == nil {
		args = &BusinessServiceArgs{}
	}

	if isZero(args.Description) {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	var resource BusinessService
	err := ctx.RegisterResource("pagerduty:index/businessService:BusinessService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBusinessService gets an existing BusinessService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBusinessService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BusinessServiceState, opts ...pulumi.ResourceOption) (*BusinessService, error) {
	var resource BusinessService
	err := ctx.ReadResource("pagerduty:index/businessService:BusinessService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BusinessService resources.
type businessServiceState struct {
	Description *string `pulumi:"description"`
	HtmlUrl     *string `pulumi:"htmlUrl"`
	// The name of the business service.
	Name *string `pulumi:"name"`
	// The owner of the business service.
	PointOfContact *string `pulumi:"pointOfContact"`
	Self           *string `pulumi:"self"`
	Summary        *string `pulumi:"summary"`
	// ID of the team that owns the business service.
	Team *string `pulumi:"team"`
	// **Deprecated** (Optional) Default (and only supported) value is `businessService`.
	//
	// Deprecated: This will change to a computed resource in the next major release.
	Type *string `pulumi:"type"`
}

type BusinessServiceState struct {
	Description pulumi.StringPtrInput
	HtmlUrl     pulumi.StringPtrInput
	// The name of the business service.
	Name pulumi.StringPtrInput
	// The owner of the business service.
	PointOfContact pulumi.StringPtrInput
	Self           pulumi.StringPtrInput
	Summary        pulumi.StringPtrInput
	// ID of the team that owns the business service.
	Team pulumi.StringPtrInput
	// **Deprecated** (Optional) Default (and only supported) value is `businessService`.
	//
	// Deprecated: This will change to a computed resource in the next major release.
	Type pulumi.StringPtrInput
}

func (BusinessServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*businessServiceState)(nil)).Elem()
}

type businessServiceArgs struct {
	Description *string `pulumi:"description"`
	// The name of the business service.
	Name *string `pulumi:"name"`
	// The owner of the business service.
	PointOfContact *string `pulumi:"pointOfContact"`
	// ID of the team that owns the business service.
	Team *string `pulumi:"team"`
	// **Deprecated** (Optional) Default (and only supported) value is `businessService`.
	//
	// Deprecated: This will change to a computed resource in the next major release.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a BusinessService resource.
type BusinessServiceArgs struct {
	Description pulumi.StringPtrInput
	// The name of the business service.
	Name pulumi.StringPtrInput
	// The owner of the business service.
	PointOfContact pulumi.StringPtrInput
	// ID of the team that owns the business service.
	Team pulumi.StringPtrInput
	// **Deprecated** (Optional) Default (and only supported) value is `businessService`.
	//
	// Deprecated: This will change to a computed resource in the next major release.
	Type pulumi.StringPtrInput
}

func (BusinessServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*businessServiceArgs)(nil)).Elem()
}

type BusinessServiceInput interface {
	pulumi.Input

	ToBusinessServiceOutput() BusinessServiceOutput
	ToBusinessServiceOutputWithContext(ctx context.Context) BusinessServiceOutput
}

func (*BusinessService) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessService)(nil)).Elem()
}

func (i *BusinessService) ToBusinessServiceOutput() BusinessServiceOutput {
	return i.ToBusinessServiceOutputWithContext(context.Background())
}

func (i *BusinessService) ToBusinessServiceOutputWithContext(ctx context.Context) BusinessServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessServiceOutput)
}

// BusinessServiceArrayInput is an input type that accepts BusinessServiceArray and BusinessServiceArrayOutput values.
// You can construct a concrete instance of `BusinessServiceArrayInput` via:
//
//          BusinessServiceArray{ BusinessServiceArgs{...} }
type BusinessServiceArrayInput interface {
	pulumi.Input

	ToBusinessServiceArrayOutput() BusinessServiceArrayOutput
	ToBusinessServiceArrayOutputWithContext(context.Context) BusinessServiceArrayOutput
}

type BusinessServiceArray []BusinessServiceInput

func (BusinessServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessService)(nil)).Elem()
}

func (i BusinessServiceArray) ToBusinessServiceArrayOutput() BusinessServiceArrayOutput {
	return i.ToBusinessServiceArrayOutputWithContext(context.Background())
}

func (i BusinessServiceArray) ToBusinessServiceArrayOutputWithContext(ctx context.Context) BusinessServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessServiceArrayOutput)
}

// BusinessServiceMapInput is an input type that accepts BusinessServiceMap and BusinessServiceMapOutput values.
// You can construct a concrete instance of `BusinessServiceMapInput` via:
//
//          BusinessServiceMap{ "key": BusinessServiceArgs{...} }
type BusinessServiceMapInput interface {
	pulumi.Input

	ToBusinessServiceMapOutput() BusinessServiceMapOutput
	ToBusinessServiceMapOutputWithContext(context.Context) BusinessServiceMapOutput
}

type BusinessServiceMap map[string]BusinessServiceInput

func (BusinessServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessService)(nil)).Elem()
}

func (i BusinessServiceMap) ToBusinessServiceMapOutput() BusinessServiceMapOutput {
	return i.ToBusinessServiceMapOutputWithContext(context.Background())
}

func (i BusinessServiceMap) ToBusinessServiceMapOutputWithContext(ctx context.Context) BusinessServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessServiceMapOutput)
}

type BusinessServiceOutput struct{ *pulumi.OutputState }

func (BusinessServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessService)(nil)).Elem()
}

func (o BusinessServiceOutput) ToBusinessServiceOutput() BusinessServiceOutput {
	return o
}

func (o BusinessServiceOutput) ToBusinessServiceOutputWithContext(ctx context.Context) BusinessServiceOutput {
	return o
}

type BusinessServiceArrayOutput struct{ *pulumi.OutputState }

func (BusinessServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessService)(nil)).Elem()
}

func (o BusinessServiceArrayOutput) ToBusinessServiceArrayOutput() BusinessServiceArrayOutput {
	return o
}

func (o BusinessServiceArrayOutput) ToBusinessServiceArrayOutputWithContext(ctx context.Context) BusinessServiceArrayOutput {
	return o
}

func (o BusinessServiceArrayOutput) Index(i pulumi.IntInput) BusinessServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BusinessService {
		return vs[0].([]*BusinessService)[vs[1].(int)]
	}).(BusinessServiceOutput)
}

type BusinessServiceMapOutput struct{ *pulumi.OutputState }

func (BusinessServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessService)(nil)).Elem()
}

func (o BusinessServiceMapOutput) ToBusinessServiceMapOutput() BusinessServiceMapOutput {
	return o
}

func (o BusinessServiceMapOutput) ToBusinessServiceMapOutputWithContext(ctx context.Context) BusinessServiceMapOutput {
	return o
}

func (o BusinessServiceMapOutput) MapIndex(k pulumi.StringInput) BusinessServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BusinessService {
		return vs[0].(map[string]*BusinessService)[vs[1].(string)]
	}).(BusinessServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessServiceInput)(nil)).Elem(), &BusinessService{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessServiceArrayInput)(nil)).Elem(), BusinessServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessServiceMapInput)(nil)).Elem(), BusinessServiceMap{})
	pulumi.RegisterOutputType(BusinessServiceOutput{})
	pulumi.RegisterOutputType(BusinessServiceArrayOutput{})
	pulumi.RegisterOutputType(BusinessServiceMapOutput{})
}
