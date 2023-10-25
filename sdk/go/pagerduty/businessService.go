// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// A [business service](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODExNg-create-a-business-service) allows you to model capabilities that span multiple technical services and that may be owned by several different teams.
//
// ## Import
//
// Services can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/businessService:BusinessService main PLBP09X
//
// ```
type BusinessService struct {
	pulumi.CustomResourceState

	Description pulumi.StringOutput `pulumi:"description"`
	// A URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl pulumi.StringOutput `pulumi:"htmlUrl"`
	// The name of the business service.
	Name pulumi.StringOutput `pulumi:"name"`
	// The owner of the business service.
	PointOfContact pulumi.StringPtrOutput `pulumi:"pointOfContact"`
	// The API show URL at which the object is accessible.
	Self pulumi.StringOutput `pulumi:"self"`
	// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
	Summary pulumi.StringOutput `pulumi:"summary"`
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

	if args.Description == nil {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// A URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl *string `pulumi:"htmlUrl"`
	// The name of the business service.
	Name *string `pulumi:"name"`
	// The owner of the business service.
	PointOfContact *string `pulumi:"pointOfContact"`
	// The API show URL at which the object is accessible.
	Self *string `pulumi:"self"`
	// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
	Summary *string `pulumi:"summary"`
	// ID of the team that owns the business service.
	Team *string `pulumi:"team"`
	// **Deprecated** (Optional) Default (and only supported) value is `businessService`.
	//
	// Deprecated: This will change to a computed resource in the next major release.
	Type *string `pulumi:"type"`
}

type BusinessServiceState struct {
	Description pulumi.StringPtrInput
	// A URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl pulumi.StringPtrInput
	// The name of the business service.
	Name pulumi.StringPtrInput
	// The owner of the business service.
	PointOfContact pulumi.StringPtrInput
	// The API show URL at which the object is accessible.
	Self pulumi.StringPtrInput
	// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
	Summary pulumi.StringPtrInput
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

func (i *BusinessService) ToOutput(ctx context.Context) pulumix.Output[*BusinessService] {
	return pulumix.Output[*BusinessService]{
		OutputState: i.ToBusinessServiceOutputWithContext(ctx).OutputState,
	}
}

// BusinessServiceArrayInput is an input type that accepts BusinessServiceArray and BusinessServiceArrayOutput values.
// You can construct a concrete instance of `BusinessServiceArrayInput` via:
//
//	BusinessServiceArray{ BusinessServiceArgs{...} }
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

func (i BusinessServiceArray) ToOutput(ctx context.Context) pulumix.Output[[]*BusinessService] {
	return pulumix.Output[[]*BusinessService]{
		OutputState: i.ToBusinessServiceArrayOutputWithContext(ctx).OutputState,
	}
}

// BusinessServiceMapInput is an input type that accepts BusinessServiceMap and BusinessServiceMapOutput values.
// You can construct a concrete instance of `BusinessServiceMapInput` via:
//
//	BusinessServiceMap{ "key": BusinessServiceArgs{...} }
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

func (i BusinessServiceMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*BusinessService] {
	return pulumix.Output[map[string]*BusinessService]{
		OutputState: i.ToBusinessServiceMapOutputWithContext(ctx).OutputState,
	}
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

func (o BusinessServiceOutput) ToOutput(ctx context.Context) pulumix.Output[*BusinessService] {
	return pulumix.Output[*BusinessService]{
		OutputState: o.OutputState,
	}
}

func (o BusinessServiceOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessService) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// A URL at which the entity is uniquely displayed in the Web app.
func (o BusinessServiceOutput) HtmlUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessService) pulumi.StringOutput { return v.HtmlUrl }).(pulumi.StringOutput)
}

// The name of the business service.
func (o BusinessServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessService) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The owner of the business service.
func (o BusinessServiceOutput) PointOfContact() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BusinessService) pulumi.StringPtrOutput { return v.PointOfContact }).(pulumi.StringPtrOutput)
}

// The API show URL at which the object is accessible.
func (o BusinessServiceOutput) Self() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessService) pulumi.StringOutput { return v.Self }).(pulumi.StringOutput)
}

// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
func (o BusinessServiceOutput) Summary() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessService) pulumi.StringOutput { return v.Summary }).(pulumi.StringOutput)
}

// ID of the team that owns the business service.
func (o BusinessServiceOutput) Team() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BusinessService) pulumi.StringPtrOutput { return v.Team }).(pulumi.StringPtrOutput)
}

// **Deprecated** (Optional) Default (and only supported) value is `businessService`.
//
// Deprecated: This will change to a computed resource in the next major release.
func (o BusinessServiceOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BusinessService) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
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

func (o BusinessServiceArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*BusinessService] {
	return pulumix.Output[[]*BusinessService]{
		OutputState: o.OutputState,
	}
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

func (o BusinessServiceMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*BusinessService] {
	return pulumix.Output[map[string]*BusinessService]{
		OutputState: o.OutputState,
	}
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
