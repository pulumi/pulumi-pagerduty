// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [service dependency](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE5Mg-associate-service-dependencies) is a relationship between two services that this service uses, or that are used by this service, and are critical for successful operation.
//
// ## Import
//
// Service dependencies can be imported using the related supporting service id, supporting service type (`business_service` or `service`) and the dependency id separated by a dot, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/serviceDependency:ServiceDependency main P4B2Z7G.business_service.D5RTHKRNGU4PYE90PJ
// ```
type ServiceDependency struct {
	pulumi.CustomResourceState

	// The relationship between the `supportingService` and `dependentService`. One and only one dependency block must be defined.
	Dependency ServiceDependencyDependencyPtrOutput `pulumi:"dependency"`
}

// NewServiceDependency registers a new resource with the given unique name, arguments, and options.
func NewServiceDependency(ctx *pulumi.Context,
	name string, args *ServiceDependencyArgs, opts ...pulumi.ResourceOption) (*ServiceDependency, error) {
	if args == nil {
		args = &ServiceDependencyArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceDependency
	err := ctx.RegisterResource("pagerduty:index/serviceDependency:ServiceDependency", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceDependency gets an existing ServiceDependency resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceDependency(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceDependencyState, opts ...pulumi.ResourceOption) (*ServiceDependency, error) {
	var resource ServiceDependency
	err := ctx.ReadResource("pagerduty:index/serviceDependency:ServiceDependency", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceDependency resources.
type serviceDependencyState struct {
	// The relationship between the `supportingService` and `dependentService`. One and only one dependency block must be defined.
	Dependency *ServiceDependencyDependency `pulumi:"dependency"`
}

type ServiceDependencyState struct {
	// The relationship between the `supportingService` and `dependentService`. One and only one dependency block must be defined.
	Dependency ServiceDependencyDependencyPtrInput
}

func (ServiceDependencyState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceDependencyState)(nil)).Elem()
}

type serviceDependencyArgs struct {
	// The relationship between the `supportingService` and `dependentService`. One and only one dependency block must be defined.
	Dependency *ServiceDependencyDependency `pulumi:"dependency"`
}

// The set of arguments for constructing a ServiceDependency resource.
type ServiceDependencyArgs struct {
	// The relationship between the `supportingService` and `dependentService`. One and only one dependency block must be defined.
	Dependency ServiceDependencyDependencyPtrInput
}

func (ServiceDependencyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceDependencyArgs)(nil)).Elem()
}

type ServiceDependencyInput interface {
	pulumi.Input

	ToServiceDependencyOutput() ServiceDependencyOutput
	ToServiceDependencyOutputWithContext(ctx context.Context) ServiceDependencyOutput
}

func (*ServiceDependency) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceDependency)(nil)).Elem()
}

func (i *ServiceDependency) ToServiceDependencyOutput() ServiceDependencyOutput {
	return i.ToServiceDependencyOutputWithContext(context.Background())
}

func (i *ServiceDependency) ToServiceDependencyOutputWithContext(ctx context.Context) ServiceDependencyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceDependencyOutput)
}

// ServiceDependencyArrayInput is an input type that accepts ServiceDependencyArray and ServiceDependencyArrayOutput values.
// You can construct a concrete instance of `ServiceDependencyArrayInput` via:
//
//	ServiceDependencyArray{ ServiceDependencyArgs{...} }
type ServiceDependencyArrayInput interface {
	pulumi.Input

	ToServiceDependencyArrayOutput() ServiceDependencyArrayOutput
	ToServiceDependencyArrayOutputWithContext(context.Context) ServiceDependencyArrayOutput
}

type ServiceDependencyArray []ServiceDependencyInput

func (ServiceDependencyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceDependency)(nil)).Elem()
}

func (i ServiceDependencyArray) ToServiceDependencyArrayOutput() ServiceDependencyArrayOutput {
	return i.ToServiceDependencyArrayOutputWithContext(context.Background())
}

func (i ServiceDependencyArray) ToServiceDependencyArrayOutputWithContext(ctx context.Context) ServiceDependencyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceDependencyArrayOutput)
}

// ServiceDependencyMapInput is an input type that accepts ServiceDependencyMap and ServiceDependencyMapOutput values.
// You can construct a concrete instance of `ServiceDependencyMapInput` via:
//
//	ServiceDependencyMap{ "key": ServiceDependencyArgs{...} }
type ServiceDependencyMapInput interface {
	pulumi.Input

	ToServiceDependencyMapOutput() ServiceDependencyMapOutput
	ToServiceDependencyMapOutputWithContext(context.Context) ServiceDependencyMapOutput
}

type ServiceDependencyMap map[string]ServiceDependencyInput

func (ServiceDependencyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceDependency)(nil)).Elem()
}

func (i ServiceDependencyMap) ToServiceDependencyMapOutput() ServiceDependencyMapOutput {
	return i.ToServiceDependencyMapOutputWithContext(context.Background())
}

func (i ServiceDependencyMap) ToServiceDependencyMapOutputWithContext(ctx context.Context) ServiceDependencyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceDependencyMapOutput)
}

type ServiceDependencyOutput struct{ *pulumi.OutputState }

func (ServiceDependencyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceDependency)(nil)).Elem()
}

func (o ServiceDependencyOutput) ToServiceDependencyOutput() ServiceDependencyOutput {
	return o
}

func (o ServiceDependencyOutput) ToServiceDependencyOutputWithContext(ctx context.Context) ServiceDependencyOutput {
	return o
}

// The relationship between the `supportingService` and `dependentService`. One and only one dependency block must be defined.
func (o ServiceDependencyOutput) Dependency() ServiceDependencyDependencyPtrOutput {
	return o.ApplyT(func(v *ServiceDependency) ServiceDependencyDependencyPtrOutput { return v.Dependency }).(ServiceDependencyDependencyPtrOutput)
}

type ServiceDependencyArrayOutput struct{ *pulumi.OutputState }

func (ServiceDependencyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceDependency)(nil)).Elem()
}

func (o ServiceDependencyArrayOutput) ToServiceDependencyArrayOutput() ServiceDependencyArrayOutput {
	return o
}

func (o ServiceDependencyArrayOutput) ToServiceDependencyArrayOutputWithContext(ctx context.Context) ServiceDependencyArrayOutput {
	return o
}

func (o ServiceDependencyArrayOutput) Index(i pulumi.IntInput) ServiceDependencyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceDependency {
		return vs[0].([]*ServiceDependency)[vs[1].(int)]
	}).(ServiceDependencyOutput)
}

type ServiceDependencyMapOutput struct{ *pulumi.OutputState }

func (ServiceDependencyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceDependency)(nil)).Elem()
}

func (o ServiceDependencyMapOutput) ToServiceDependencyMapOutput() ServiceDependencyMapOutput {
	return o
}

func (o ServiceDependencyMapOutput) ToServiceDependencyMapOutputWithContext(ctx context.Context) ServiceDependencyMapOutput {
	return o
}

func (o ServiceDependencyMapOutput) MapIndex(k pulumi.StringInput) ServiceDependencyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceDependency {
		return vs[0].(map[string]*ServiceDependency)[vs[1].(string)]
	}).(ServiceDependencyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceDependencyInput)(nil)).Elem(), &ServiceDependency{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceDependencyArrayInput)(nil)).Elem(), ServiceDependencyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceDependencyMapInput)(nil)).Elem(), ServiceDependencyMap{})
	pulumi.RegisterOutputType(ServiceDependencyOutput{})
	pulumi.RegisterOutputType(ServiceDependencyArrayOutput{})
	pulumi.RegisterOutputType(ServiceDependencyMapOutput{})
}
