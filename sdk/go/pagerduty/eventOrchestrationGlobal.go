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
// Global Orchestration can be imported using the `id` of the Event Orchestration, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal global 1b49abe7-26db-4439-a715-c6d883acfb3e
//
// ```
type EventOrchestrationGlobal struct {
	pulumi.CustomResourceState

	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationGlobalCatchAllOutput `pulumi:"catchAll"`
	// ID of the Event Orchestration to which this Global Orchestration belongs to.
	EventOrchestration pulumi.StringOutput `pulumi:"eventOrchestration"`
	// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationGlobalSetArrayOutput `pulumi:"sets"`
}

// NewEventOrchestrationGlobal registers a new resource with the given unique name, arguments, and options.
func NewEventOrchestrationGlobal(ctx *pulumi.Context,
	name string, args *EventOrchestrationGlobalArgs, opts ...pulumi.ResourceOption) (*EventOrchestrationGlobal, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatchAll == nil {
		return nil, errors.New("invalid value for required argument 'CatchAll'")
	}
	if args.EventOrchestration == nil {
		return nil, errors.New("invalid value for required argument 'EventOrchestration'")
	}
	if args.Sets == nil {
		return nil, errors.New("invalid value for required argument 'Sets'")
	}
	var resource EventOrchestrationGlobal
	err := ctx.RegisterResource("pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventOrchestrationGlobal gets an existing EventOrchestrationGlobal resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventOrchestrationGlobal(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventOrchestrationGlobalState, opts ...pulumi.ResourceOption) (*EventOrchestrationGlobal, error) {
	var resource EventOrchestrationGlobal
	err := ctx.ReadResource("pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventOrchestrationGlobal resources.
type eventOrchestrationGlobalState struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll *EventOrchestrationGlobalCatchAll `pulumi:"catchAll"`
	// ID of the Event Orchestration to which this Global Orchestration belongs to.
	EventOrchestration *string `pulumi:"eventOrchestration"`
	// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets []EventOrchestrationGlobalSet `pulumi:"sets"`
}

type EventOrchestrationGlobalState struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationGlobalCatchAllPtrInput
	// ID of the Event Orchestration to which this Global Orchestration belongs to.
	EventOrchestration pulumi.StringPtrInput
	// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationGlobalSetArrayInput
}

func (EventOrchestrationGlobalState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationGlobalState)(nil)).Elem()
}

type eventOrchestrationGlobalArgs struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationGlobalCatchAll `pulumi:"catchAll"`
	// ID of the Event Orchestration to which this Global Orchestration belongs to.
	EventOrchestration string `pulumi:"eventOrchestration"`
	// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets []EventOrchestrationGlobalSet `pulumi:"sets"`
}

// The set of arguments for constructing a EventOrchestrationGlobal resource.
type EventOrchestrationGlobalArgs struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationGlobalCatchAllInput
	// ID of the Event Orchestration to which this Global Orchestration belongs to.
	EventOrchestration pulumi.StringInput
	// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationGlobalSetArrayInput
}

func (EventOrchestrationGlobalArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationGlobalArgs)(nil)).Elem()
}

type EventOrchestrationGlobalInput interface {
	pulumi.Input

	ToEventOrchestrationGlobalOutput() EventOrchestrationGlobalOutput
	ToEventOrchestrationGlobalOutputWithContext(ctx context.Context) EventOrchestrationGlobalOutput
}

func (*EventOrchestrationGlobal) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationGlobal)(nil)).Elem()
}

func (i *EventOrchestrationGlobal) ToEventOrchestrationGlobalOutput() EventOrchestrationGlobalOutput {
	return i.ToEventOrchestrationGlobalOutputWithContext(context.Background())
}

func (i *EventOrchestrationGlobal) ToEventOrchestrationGlobalOutputWithContext(ctx context.Context) EventOrchestrationGlobalOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationGlobalOutput)
}

// EventOrchestrationGlobalArrayInput is an input type that accepts EventOrchestrationGlobalArray and EventOrchestrationGlobalArrayOutput values.
// You can construct a concrete instance of `EventOrchestrationGlobalArrayInput` via:
//
//	EventOrchestrationGlobalArray{ EventOrchestrationGlobalArgs{...} }
type EventOrchestrationGlobalArrayInput interface {
	pulumi.Input

	ToEventOrchestrationGlobalArrayOutput() EventOrchestrationGlobalArrayOutput
	ToEventOrchestrationGlobalArrayOutputWithContext(context.Context) EventOrchestrationGlobalArrayOutput
}

type EventOrchestrationGlobalArray []EventOrchestrationGlobalInput

func (EventOrchestrationGlobalArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationGlobal)(nil)).Elem()
}

func (i EventOrchestrationGlobalArray) ToEventOrchestrationGlobalArrayOutput() EventOrchestrationGlobalArrayOutput {
	return i.ToEventOrchestrationGlobalArrayOutputWithContext(context.Background())
}

func (i EventOrchestrationGlobalArray) ToEventOrchestrationGlobalArrayOutputWithContext(ctx context.Context) EventOrchestrationGlobalArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationGlobalArrayOutput)
}

// EventOrchestrationGlobalMapInput is an input type that accepts EventOrchestrationGlobalMap and EventOrchestrationGlobalMapOutput values.
// You can construct a concrete instance of `EventOrchestrationGlobalMapInput` via:
//
//	EventOrchestrationGlobalMap{ "key": EventOrchestrationGlobalArgs{...} }
type EventOrchestrationGlobalMapInput interface {
	pulumi.Input

	ToEventOrchestrationGlobalMapOutput() EventOrchestrationGlobalMapOutput
	ToEventOrchestrationGlobalMapOutputWithContext(context.Context) EventOrchestrationGlobalMapOutput
}

type EventOrchestrationGlobalMap map[string]EventOrchestrationGlobalInput

func (EventOrchestrationGlobalMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationGlobal)(nil)).Elem()
}

func (i EventOrchestrationGlobalMap) ToEventOrchestrationGlobalMapOutput() EventOrchestrationGlobalMapOutput {
	return i.ToEventOrchestrationGlobalMapOutputWithContext(context.Background())
}

func (i EventOrchestrationGlobalMap) ToEventOrchestrationGlobalMapOutputWithContext(ctx context.Context) EventOrchestrationGlobalMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationGlobalMapOutput)
}

type EventOrchestrationGlobalOutput struct{ *pulumi.OutputState }

func (EventOrchestrationGlobalOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationGlobal)(nil)).Elem()
}

func (o EventOrchestrationGlobalOutput) ToEventOrchestrationGlobalOutput() EventOrchestrationGlobalOutput {
	return o
}

func (o EventOrchestrationGlobalOutput) ToEventOrchestrationGlobalOutputWithContext(ctx context.Context) EventOrchestrationGlobalOutput {
	return o
}

// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
func (o EventOrchestrationGlobalOutput) CatchAll() EventOrchestrationGlobalCatchAllOutput {
	return o.ApplyT(func(v *EventOrchestrationGlobal) EventOrchestrationGlobalCatchAllOutput { return v.CatchAll }).(EventOrchestrationGlobalCatchAllOutput)
}

// ID of the Event Orchestration to which this Global Orchestration belongs to.
func (o EventOrchestrationGlobalOutput) EventOrchestration() pulumi.StringOutput {
	return o.ApplyT(func(v *EventOrchestrationGlobal) pulumi.StringOutput { return v.EventOrchestration }).(pulumi.StringOutput)
}

// A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
func (o EventOrchestrationGlobalOutput) Sets() EventOrchestrationGlobalSetArrayOutput {
	return o.ApplyT(func(v *EventOrchestrationGlobal) EventOrchestrationGlobalSetArrayOutput { return v.Sets }).(EventOrchestrationGlobalSetArrayOutput)
}

type EventOrchestrationGlobalArrayOutput struct{ *pulumi.OutputState }

func (EventOrchestrationGlobalArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationGlobal)(nil)).Elem()
}

func (o EventOrchestrationGlobalArrayOutput) ToEventOrchestrationGlobalArrayOutput() EventOrchestrationGlobalArrayOutput {
	return o
}

func (o EventOrchestrationGlobalArrayOutput) ToEventOrchestrationGlobalArrayOutputWithContext(ctx context.Context) EventOrchestrationGlobalArrayOutput {
	return o
}

func (o EventOrchestrationGlobalArrayOutput) Index(i pulumi.IntInput) EventOrchestrationGlobalOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventOrchestrationGlobal {
		return vs[0].([]*EventOrchestrationGlobal)[vs[1].(int)]
	}).(EventOrchestrationGlobalOutput)
}

type EventOrchestrationGlobalMapOutput struct{ *pulumi.OutputState }

func (EventOrchestrationGlobalMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationGlobal)(nil)).Elem()
}

func (o EventOrchestrationGlobalMapOutput) ToEventOrchestrationGlobalMapOutput() EventOrchestrationGlobalMapOutput {
	return o
}

func (o EventOrchestrationGlobalMapOutput) ToEventOrchestrationGlobalMapOutputWithContext(ctx context.Context) EventOrchestrationGlobalMapOutput {
	return o
}

func (o EventOrchestrationGlobalMapOutput) MapIndex(k pulumi.StringInput) EventOrchestrationGlobalOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventOrchestrationGlobal {
		return vs[0].(map[string]*EventOrchestrationGlobal)[vs[1].(string)]
	}).(EventOrchestrationGlobalOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationGlobalInput)(nil)).Elem(), &EventOrchestrationGlobal{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationGlobalArrayInput)(nil)).Elem(), EventOrchestrationGlobalArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationGlobalMapInput)(nil)).Elem(), EventOrchestrationGlobalMap{})
	pulumi.RegisterOutputType(EventOrchestrationGlobalOutput{})
	pulumi.RegisterOutputType(EventOrchestrationGlobalArrayOutput{})
	pulumi.RegisterOutputType(EventOrchestrationGlobalMapOutput{})
}