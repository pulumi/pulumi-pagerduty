// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An Unrouted Orchestration allows users to create a set of Event Rules that will be evaluated against all events that don't match any rules in the Orchestration's Router.
//
// The Unrouted Orchestration evaluates events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.
//
// ## Example of configuring Unrouted Rules for an Orchestration
//
// In this example of an Unrouted Orchestration, the rule matches only if the condition is matched.
// Alerts created for events that do not match the rule will have severity level set to `info` as defined in `catchAll` block.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pagerduty.NewEventOrchestrationUnrouted(ctx, "unrouted", &pagerduty.EventOrchestrationUnroutedArgs{
//				EventOrchestration: pulumi.Any(pagerduty_event_orchestration.My_monitor.Id),
//				Sets: pagerduty.EventOrchestrationUnroutedSetArray{
//					&pagerduty.EventOrchestrationUnroutedSetArgs{
//						Id: pulumi.String("start"),
//						Rules: pagerduty.EventOrchestrationUnroutedSetRuleArray{
//							&pagerduty.EventOrchestrationUnroutedSetRuleArgs{
//								Label: pulumi.String("Update the summary of un-matched Critical alerts so they're easier to spot"),
//								Conditions: pagerduty.EventOrchestrationUnroutedSetRuleConditionArray{
//									&pagerduty.EventOrchestrationUnroutedSetRuleConditionArgs{
//										Expression: pulumi.String("event.severity matches 'critical'"),
//									},
//								},
//								Actions: &pagerduty.EventOrchestrationUnroutedSetRuleActionsArgs{
//									Severity: pulumi.String("critical"),
//									Extractions: pagerduty.EventOrchestrationUnroutedSetRuleActionsExtractionArray{
//										&pagerduty.EventOrchestrationUnroutedSetRuleActionsExtractionArgs{
//											Target:   pulumi.String("event.summary"),
//											Template: pulumi.String("[Critical Unrouted] {{event.summary}}"),
//										},
//									},
//								},
//							},
//						},
//					},
//				},
//				CatchAll: &pagerduty.EventOrchestrationUnroutedCatchAllArgs{
//					Actions: &pagerduty.EventOrchestrationUnroutedCatchAllActionsArgs{
//						Severity: pulumi.String("info"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Unrouted Orchestration can be imported using the `id` of the Event Orchestration, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted unrouted 1b49abe7-26db-4439-a715-c6d883acfb3e
//
// ```
type EventOrchestrationUnrouted struct {
	pulumi.CustomResourceState

	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationUnroutedCatchAllOutput `pulumi:"catchAll"`
	// The Event Orchestration to which this Unrouted Orchestration belongs to.
	EventOrchestration pulumi.StringOutput `pulumi:"eventOrchestration"`
	// An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationUnroutedSetArrayOutput `pulumi:"sets"`
}

// NewEventOrchestrationUnrouted registers a new resource with the given unique name, arguments, and options.
func NewEventOrchestrationUnrouted(ctx *pulumi.Context,
	name string, args *EventOrchestrationUnroutedArgs, opts ...pulumi.ResourceOption) (*EventOrchestrationUnrouted, error) {
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
	var resource EventOrchestrationUnrouted
	err := ctx.RegisterResource("pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventOrchestrationUnrouted gets an existing EventOrchestrationUnrouted resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventOrchestrationUnrouted(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventOrchestrationUnroutedState, opts ...pulumi.ResourceOption) (*EventOrchestrationUnrouted, error) {
	var resource EventOrchestrationUnrouted
	err := ctx.ReadResource("pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventOrchestrationUnrouted resources.
type eventOrchestrationUnroutedState struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll *EventOrchestrationUnroutedCatchAll `pulumi:"catchAll"`
	// The Event Orchestration to which this Unrouted Orchestration belongs to.
	EventOrchestration *string `pulumi:"eventOrchestration"`
	// An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets []EventOrchestrationUnroutedSet `pulumi:"sets"`
}

type EventOrchestrationUnroutedState struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationUnroutedCatchAllPtrInput
	// The Event Orchestration to which this Unrouted Orchestration belongs to.
	EventOrchestration pulumi.StringPtrInput
	// An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationUnroutedSetArrayInput
}

func (EventOrchestrationUnroutedState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationUnroutedState)(nil)).Elem()
}

type eventOrchestrationUnroutedArgs struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationUnroutedCatchAll `pulumi:"catchAll"`
	// The Event Orchestration to which this Unrouted Orchestration belongs to.
	EventOrchestration string `pulumi:"eventOrchestration"`
	// An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets []EventOrchestrationUnroutedSet `pulumi:"sets"`
}

// The set of arguments for constructing a EventOrchestrationUnrouted resource.
type EventOrchestrationUnroutedArgs struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationUnroutedCatchAllInput
	// The Event Orchestration to which this Unrouted Orchestration belongs to.
	EventOrchestration pulumi.StringInput
	// An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets EventOrchestrationUnroutedSetArrayInput
}

func (EventOrchestrationUnroutedArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationUnroutedArgs)(nil)).Elem()
}

type EventOrchestrationUnroutedInput interface {
	pulumi.Input

	ToEventOrchestrationUnroutedOutput() EventOrchestrationUnroutedOutput
	ToEventOrchestrationUnroutedOutputWithContext(ctx context.Context) EventOrchestrationUnroutedOutput
}

func (*EventOrchestrationUnrouted) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationUnrouted)(nil)).Elem()
}

func (i *EventOrchestrationUnrouted) ToEventOrchestrationUnroutedOutput() EventOrchestrationUnroutedOutput {
	return i.ToEventOrchestrationUnroutedOutputWithContext(context.Background())
}

func (i *EventOrchestrationUnrouted) ToEventOrchestrationUnroutedOutputWithContext(ctx context.Context) EventOrchestrationUnroutedOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationUnroutedOutput)
}

// EventOrchestrationUnroutedArrayInput is an input type that accepts EventOrchestrationUnroutedArray and EventOrchestrationUnroutedArrayOutput values.
// You can construct a concrete instance of `EventOrchestrationUnroutedArrayInput` via:
//
//	EventOrchestrationUnroutedArray{ EventOrchestrationUnroutedArgs{...} }
type EventOrchestrationUnroutedArrayInput interface {
	pulumi.Input

	ToEventOrchestrationUnroutedArrayOutput() EventOrchestrationUnroutedArrayOutput
	ToEventOrchestrationUnroutedArrayOutputWithContext(context.Context) EventOrchestrationUnroutedArrayOutput
}

type EventOrchestrationUnroutedArray []EventOrchestrationUnroutedInput

func (EventOrchestrationUnroutedArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationUnrouted)(nil)).Elem()
}

func (i EventOrchestrationUnroutedArray) ToEventOrchestrationUnroutedArrayOutput() EventOrchestrationUnroutedArrayOutput {
	return i.ToEventOrchestrationUnroutedArrayOutputWithContext(context.Background())
}

func (i EventOrchestrationUnroutedArray) ToEventOrchestrationUnroutedArrayOutputWithContext(ctx context.Context) EventOrchestrationUnroutedArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationUnroutedArrayOutput)
}

// EventOrchestrationUnroutedMapInput is an input type that accepts EventOrchestrationUnroutedMap and EventOrchestrationUnroutedMapOutput values.
// You can construct a concrete instance of `EventOrchestrationUnroutedMapInput` via:
//
//	EventOrchestrationUnroutedMap{ "key": EventOrchestrationUnroutedArgs{...} }
type EventOrchestrationUnroutedMapInput interface {
	pulumi.Input

	ToEventOrchestrationUnroutedMapOutput() EventOrchestrationUnroutedMapOutput
	ToEventOrchestrationUnroutedMapOutputWithContext(context.Context) EventOrchestrationUnroutedMapOutput
}

type EventOrchestrationUnroutedMap map[string]EventOrchestrationUnroutedInput

func (EventOrchestrationUnroutedMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationUnrouted)(nil)).Elem()
}

func (i EventOrchestrationUnroutedMap) ToEventOrchestrationUnroutedMapOutput() EventOrchestrationUnroutedMapOutput {
	return i.ToEventOrchestrationUnroutedMapOutputWithContext(context.Background())
}

func (i EventOrchestrationUnroutedMap) ToEventOrchestrationUnroutedMapOutputWithContext(ctx context.Context) EventOrchestrationUnroutedMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationUnroutedMapOutput)
}

type EventOrchestrationUnroutedOutput struct{ *pulumi.OutputState }

func (EventOrchestrationUnroutedOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationUnrouted)(nil)).Elem()
}

func (o EventOrchestrationUnroutedOutput) ToEventOrchestrationUnroutedOutput() EventOrchestrationUnroutedOutput {
	return o
}

func (o EventOrchestrationUnroutedOutput) ToEventOrchestrationUnroutedOutputWithContext(ctx context.Context) EventOrchestrationUnroutedOutput {
	return o
}

// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
func (o EventOrchestrationUnroutedOutput) CatchAll() EventOrchestrationUnroutedCatchAllOutput {
	return o.ApplyT(func(v *EventOrchestrationUnrouted) EventOrchestrationUnroutedCatchAllOutput { return v.CatchAll }).(EventOrchestrationUnroutedCatchAllOutput)
}

// The Event Orchestration to which this Unrouted Orchestration belongs to.
func (o EventOrchestrationUnroutedOutput) EventOrchestration() pulumi.StringOutput {
	return o.ApplyT(func(v *EventOrchestrationUnrouted) pulumi.StringOutput { return v.EventOrchestration }).(pulumi.StringOutput)
}

// An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
func (o EventOrchestrationUnroutedOutput) Sets() EventOrchestrationUnroutedSetArrayOutput {
	return o.ApplyT(func(v *EventOrchestrationUnrouted) EventOrchestrationUnroutedSetArrayOutput { return v.Sets }).(EventOrchestrationUnroutedSetArrayOutput)
}

type EventOrchestrationUnroutedArrayOutput struct{ *pulumi.OutputState }

func (EventOrchestrationUnroutedArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationUnrouted)(nil)).Elem()
}

func (o EventOrchestrationUnroutedArrayOutput) ToEventOrchestrationUnroutedArrayOutput() EventOrchestrationUnroutedArrayOutput {
	return o
}

func (o EventOrchestrationUnroutedArrayOutput) ToEventOrchestrationUnroutedArrayOutputWithContext(ctx context.Context) EventOrchestrationUnroutedArrayOutput {
	return o
}

func (o EventOrchestrationUnroutedArrayOutput) Index(i pulumi.IntInput) EventOrchestrationUnroutedOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventOrchestrationUnrouted {
		return vs[0].([]*EventOrchestrationUnrouted)[vs[1].(int)]
	}).(EventOrchestrationUnroutedOutput)
}

type EventOrchestrationUnroutedMapOutput struct{ *pulumi.OutputState }

func (EventOrchestrationUnroutedMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationUnrouted)(nil)).Elem()
}

func (o EventOrchestrationUnroutedMapOutput) ToEventOrchestrationUnroutedMapOutput() EventOrchestrationUnroutedMapOutput {
	return o
}

func (o EventOrchestrationUnroutedMapOutput) ToEventOrchestrationUnroutedMapOutputWithContext(ctx context.Context) EventOrchestrationUnroutedMapOutput {
	return o
}

func (o EventOrchestrationUnroutedMapOutput) MapIndex(k pulumi.StringInput) EventOrchestrationUnroutedOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventOrchestrationUnrouted {
		return vs[0].(map[string]*EventOrchestrationUnrouted)[vs[1].(string)]
	}).(EventOrchestrationUnroutedOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationUnroutedInput)(nil)).Elem(), &EventOrchestrationUnrouted{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationUnroutedArrayInput)(nil)).Elem(), EventOrchestrationUnroutedArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationUnroutedMapInput)(nil)).Elem(), EventOrchestrationUnroutedMap{})
	pulumi.RegisterOutputType(EventOrchestrationUnroutedOutput{})
	pulumi.RegisterOutputType(EventOrchestrationUnroutedArrayOutput{})
	pulumi.RegisterOutputType(EventOrchestrationUnroutedMapOutput{})
}
