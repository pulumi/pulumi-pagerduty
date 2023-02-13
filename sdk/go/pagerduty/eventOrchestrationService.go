// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Service Orchestration can be imported using the `id` of the Service, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/eventOrchestrationService:EventOrchestrationService service PFEODA7
//
// ```
type EventOrchestrationService struct {
	pulumi.CustomResourceState

	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationServiceCatchAllOutput `pulumi:"catchAll"`
	// ID of the Service to which this Service Orchestration belongs to.
	Service pulumi.StringOutput `pulumi:"service"`
	// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationServiceSetArrayOutput `pulumi:"sets"`
}

// NewEventOrchestrationService registers a new resource with the given unique name, arguments, and options.
func NewEventOrchestrationService(ctx *pulumi.Context,
	name string, args *EventOrchestrationServiceArgs, opts ...pulumi.ResourceOption) (*EventOrchestrationService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatchAll == nil {
		return nil, errors.New("invalid value for required argument 'CatchAll'")
	}
	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	if args.Sets == nil {
		return nil, errors.New("invalid value for required argument 'Sets'")
	}
	var resource EventOrchestrationService
	err := ctx.RegisterResource("pagerduty:index/eventOrchestrationService:EventOrchestrationService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventOrchestrationService gets an existing EventOrchestrationService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventOrchestrationService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventOrchestrationServiceState, opts ...pulumi.ResourceOption) (*EventOrchestrationService, error) {
	var resource EventOrchestrationService
	err := ctx.ReadResource("pagerduty:index/eventOrchestrationService:EventOrchestrationService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventOrchestrationService resources.
type eventOrchestrationServiceState struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll *EventOrchestrationServiceCatchAll `pulumi:"catchAll"`
	// ID of the Service to which this Service Orchestration belongs to.
	Service *string `pulumi:"service"`
	// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets []EventOrchestrationServiceSet `pulumi:"sets"`
}

type EventOrchestrationServiceState struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationServiceCatchAllPtrInput
	// ID of the Service to which this Service Orchestration belongs to.
	Service pulumi.StringPtrInput
	// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationServiceSetArrayInput
}

func (EventOrchestrationServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationServiceState)(nil)).Elem()
}

type eventOrchestrationServiceArgs struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationServiceCatchAll `pulumi:"catchAll"`
	// ID of the Service to which this Service Orchestration belongs to.
	Service string `pulumi:"service"`
	// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets []EventOrchestrationServiceSet `pulumi:"sets"`
}

// The set of arguments for constructing a EventOrchestrationService resource.
type EventOrchestrationServiceArgs struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationServiceCatchAllInput
	// ID of the Service to which this Service Orchestration belongs to.
	Service pulumi.StringInput
	// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationServiceSetArrayInput
}

func (EventOrchestrationServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationServiceArgs)(nil)).Elem()
}

type EventOrchestrationServiceInput interface {
	pulumi.Input

	ToEventOrchestrationServiceOutput() EventOrchestrationServiceOutput
	ToEventOrchestrationServiceOutputWithContext(ctx context.Context) EventOrchestrationServiceOutput
}

func (*EventOrchestrationService) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationService)(nil)).Elem()
}

func (i *EventOrchestrationService) ToEventOrchestrationServiceOutput() EventOrchestrationServiceOutput {
	return i.ToEventOrchestrationServiceOutputWithContext(context.Background())
}

func (i *EventOrchestrationService) ToEventOrchestrationServiceOutputWithContext(ctx context.Context) EventOrchestrationServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationServiceOutput)
}

// EventOrchestrationServiceArrayInput is an input type that accepts EventOrchestrationServiceArray and EventOrchestrationServiceArrayOutput values.
// You can construct a concrete instance of `EventOrchestrationServiceArrayInput` via:
//
//	EventOrchestrationServiceArray{ EventOrchestrationServiceArgs{...} }
type EventOrchestrationServiceArrayInput interface {
	pulumi.Input

	ToEventOrchestrationServiceArrayOutput() EventOrchestrationServiceArrayOutput
	ToEventOrchestrationServiceArrayOutputWithContext(context.Context) EventOrchestrationServiceArrayOutput
}

type EventOrchestrationServiceArray []EventOrchestrationServiceInput

func (EventOrchestrationServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationService)(nil)).Elem()
}

func (i EventOrchestrationServiceArray) ToEventOrchestrationServiceArrayOutput() EventOrchestrationServiceArrayOutput {
	return i.ToEventOrchestrationServiceArrayOutputWithContext(context.Background())
}

func (i EventOrchestrationServiceArray) ToEventOrchestrationServiceArrayOutputWithContext(ctx context.Context) EventOrchestrationServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationServiceArrayOutput)
}

// EventOrchestrationServiceMapInput is an input type that accepts EventOrchestrationServiceMap and EventOrchestrationServiceMapOutput values.
// You can construct a concrete instance of `EventOrchestrationServiceMapInput` via:
//
//	EventOrchestrationServiceMap{ "key": EventOrchestrationServiceArgs{...} }
type EventOrchestrationServiceMapInput interface {
	pulumi.Input

	ToEventOrchestrationServiceMapOutput() EventOrchestrationServiceMapOutput
	ToEventOrchestrationServiceMapOutputWithContext(context.Context) EventOrchestrationServiceMapOutput
}

type EventOrchestrationServiceMap map[string]EventOrchestrationServiceInput

func (EventOrchestrationServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationService)(nil)).Elem()
}

func (i EventOrchestrationServiceMap) ToEventOrchestrationServiceMapOutput() EventOrchestrationServiceMapOutput {
	return i.ToEventOrchestrationServiceMapOutputWithContext(context.Background())
}

func (i EventOrchestrationServiceMap) ToEventOrchestrationServiceMapOutputWithContext(ctx context.Context) EventOrchestrationServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationServiceMapOutput)
}

type EventOrchestrationServiceOutput struct{ *pulumi.OutputState }

func (EventOrchestrationServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationService)(nil)).Elem()
}

func (o EventOrchestrationServiceOutput) ToEventOrchestrationServiceOutput() EventOrchestrationServiceOutput {
	return o
}

func (o EventOrchestrationServiceOutput) ToEventOrchestrationServiceOutputWithContext(ctx context.Context) EventOrchestrationServiceOutput {
	return o
}

// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
func (o EventOrchestrationServiceOutput) CatchAll() EventOrchestrationServiceCatchAllOutput {
	return o.ApplyT(func(v *EventOrchestrationService) EventOrchestrationServiceCatchAllOutput { return v.CatchAll }).(EventOrchestrationServiceCatchAllOutput)
}

// ID of the Service to which this Service Orchestration belongs to.
func (o EventOrchestrationServiceOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *EventOrchestrationService) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
func (o EventOrchestrationServiceOutput) Sets() EventOrchestrationServiceSetArrayOutput {
	return o.ApplyT(func(v *EventOrchestrationService) EventOrchestrationServiceSetArrayOutput { return v.Sets }).(EventOrchestrationServiceSetArrayOutput)
}

type EventOrchestrationServiceArrayOutput struct{ *pulumi.OutputState }

func (EventOrchestrationServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationService)(nil)).Elem()
}

func (o EventOrchestrationServiceArrayOutput) ToEventOrchestrationServiceArrayOutput() EventOrchestrationServiceArrayOutput {
	return o
}

func (o EventOrchestrationServiceArrayOutput) ToEventOrchestrationServiceArrayOutputWithContext(ctx context.Context) EventOrchestrationServiceArrayOutput {
	return o
}

func (o EventOrchestrationServiceArrayOutput) Index(i pulumi.IntInput) EventOrchestrationServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventOrchestrationService {
		return vs[0].([]*EventOrchestrationService)[vs[1].(int)]
	}).(EventOrchestrationServiceOutput)
}

type EventOrchestrationServiceMapOutput struct{ *pulumi.OutputState }

func (EventOrchestrationServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationService)(nil)).Elem()
}

func (o EventOrchestrationServiceMapOutput) ToEventOrchestrationServiceMapOutput() EventOrchestrationServiceMapOutput {
	return o
}

func (o EventOrchestrationServiceMapOutput) ToEventOrchestrationServiceMapOutputWithContext(ctx context.Context) EventOrchestrationServiceMapOutput {
	return o
}

func (o EventOrchestrationServiceMapOutput) MapIndex(k pulumi.StringInput) EventOrchestrationServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventOrchestrationService {
		return vs[0].(map[string]*EventOrchestrationService)[vs[1].(string)]
	}).(EventOrchestrationServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationServiceInput)(nil)).Elem(), &EventOrchestrationService{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationServiceArrayInput)(nil)).Elem(), EventOrchestrationServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationServiceMapInput)(nil)).Elem(), EventOrchestrationServiceMap{})
	pulumi.RegisterOutputType(EventOrchestrationServiceOutput{})
	pulumi.RegisterOutputType(EventOrchestrationServiceArrayOutput{})
	pulumi.RegisterOutputType(EventOrchestrationServiceMapOutput{})
}
