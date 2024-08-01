// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An Orchestration Router allows users to create a set of Event Rules. The Router evaluates events sent to this Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in the `catchAll` or to the "Unrouted" Orchestration if no service is specified.
//
// ## Example of configuring Router rules for an Orchestration
//
// In this example the user has defined the Router with three rules. The first rule configures a dynamic route: any event containing a value in its `pdServiceId` custom detail will be routed to the Service with the ID specified by that value. The other rules route events matching a condition to specific services.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			database, err := pagerduty.LookupService(ctx, &pagerduty.LookupServiceArgs{
//				Name: "Primary Data Store",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			www, err := pagerduty.LookupService(ctx, &pagerduty.LookupServiceArgs{
//				Name: "Web Server App",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestrationRouter(ctx, "router", &pagerduty.EventOrchestrationRouterArgs{
//				EventOrchestration: pulumi.Any(myMonitor.Id),
//				Set: &pagerduty.EventOrchestrationRouterSetArgs{
//					Id: pulumi.String("start"),
//					Rules: pagerduty.EventOrchestrationRouterSetRuleArray{
//						&pagerduty.EventOrchestrationRouterSetRuleArgs{
//							Label: pulumi.String("Dynamically route events related to specific PagerDuty services"),
//							Actions: &pagerduty.EventOrchestrationRouterSetRuleActionsArgs{
//								DynamicRouteTos: pagerduty.EventOrchestrationRouterSetRuleActionsDynamicRouteToArray{
//									&pagerduty.EventOrchestrationRouterSetRuleActionsDynamicRouteToArgs{
//										LookupBy: pulumi.String("service_id"),
//										Source:   pulumi.String("event.custom_details.pd_service_id"),
//										Regex:    pulumi.String("(.*)"),
//									},
//								},
//							},
//						},
//						&pagerduty.EventOrchestrationRouterSetRuleArgs{
//							Label: pulumi.String("Events relating to our relational database"),
//							Conditions: pagerduty.EventOrchestrationRouterSetRuleConditionArray{
//								&pagerduty.EventOrchestrationRouterSetRuleConditionArgs{
//									Expression: pulumi.String("event.summary matches part 'database'"),
//								},
//								&pagerduty.EventOrchestrationRouterSetRuleConditionArgs{
//									Expression: pulumi.String("event.source matches regex 'db[0-9]+-server'"),
//								},
//							},
//							Actions: &pagerduty.EventOrchestrationRouterSetRuleActionsArgs{
//								RouteTo: pulumi.String(database.Id),
//							},
//						},
//						&pagerduty.EventOrchestrationRouterSetRuleArgs{
//							Conditions: pagerduty.EventOrchestrationRouterSetRuleConditionArray{
//								&pagerduty.EventOrchestrationRouterSetRuleConditionArgs{
//									Expression: pulumi.String("event.summary matches part 'www'"),
//								},
//							},
//							Actions: &pagerduty.EventOrchestrationRouterSetRuleActionsArgs{
//								RouteTo: pulumi.String(www.Id),
//							},
//						},
//					},
//				},
//				CatchAll: &pagerduty.EventOrchestrationRouterCatchAllArgs{
//					Actions: &pagerduty.EventOrchestrationRouterCatchAllActionsArgs{
//						RouteTo: pulumi.String("unrouted"),
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
// Router can be imported using the `id` of the Event Orchestration, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter router 1b49abe7-26db-4439-a715-c6d883acfb3e
// ```
type EventOrchestrationRouter struct {
	pulumi.CustomResourceState

	// When none of the rules match an event, the event will be routed according to the catchAll settings.
	CatchAll EventOrchestrationRouterCatchAllOutput `pulumi:"catchAll"`
	// ID of the Event Orchestration to which the Router belongs.
	EventOrchestration pulumi.StringOutput `pulumi:"eventOrchestration"`
	// The Router contains a single set of rules  (the "start" set).
	Set EventOrchestrationRouterSetOutput `pulumi:"set"`
}

// NewEventOrchestrationRouter registers a new resource with the given unique name, arguments, and options.
func NewEventOrchestrationRouter(ctx *pulumi.Context,
	name string, args *EventOrchestrationRouterArgs, opts ...pulumi.ResourceOption) (*EventOrchestrationRouter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatchAll == nil {
		return nil, errors.New("invalid value for required argument 'CatchAll'")
	}
	if args.EventOrchestration == nil {
		return nil, errors.New("invalid value for required argument 'EventOrchestration'")
	}
	if args.Set == nil {
		return nil, errors.New("invalid value for required argument 'Set'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventOrchestrationRouter
	err := ctx.RegisterResource("pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventOrchestrationRouter gets an existing EventOrchestrationRouter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventOrchestrationRouter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventOrchestrationRouterState, opts ...pulumi.ResourceOption) (*EventOrchestrationRouter, error) {
	var resource EventOrchestrationRouter
	err := ctx.ReadResource("pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventOrchestrationRouter resources.
type eventOrchestrationRouterState struct {
	// When none of the rules match an event, the event will be routed according to the catchAll settings.
	CatchAll *EventOrchestrationRouterCatchAll `pulumi:"catchAll"`
	// ID of the Event Orchestration to which the Router belongs.
	EventOrchestration *string `pulumi:"eventOrchestration"`
	// The Router contains a single set of rules  (the "start" set).
	Set *EventOrchestrationRouterSet `pulumi:"set"`
}

type EventOrchestrationRouterState struct {
	// When none of the rules match an event, the event will be routed according to the catchAll settings.
	CatchAll EventOrchestrationRouterCatchAllPtrInput
	// ID of the Event Orchestration to which the Router belongs.
	EventOrchestration pulumi.StringPtrInput
	// The Router contains a single set of rules  (the "start" set).
	Set EventOrchestrationRouterSetPtrInput
}

func (EventOrchestrationRouterState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationRouterState)(nil)).Elem()
}

type eventOrchestrationRouterArgs struct {
	// When none of the rules match an event, the event will be routed according to the catchAll settings.
	CatchAll EventOrchestrationRouterCatchAll `pulumi:"catchAll"`
	// ID of the Event Orchestration to which the Router belongs.
	EventOrchestration string `pulumi:"eventOrchestration"`
	// The Router contains a single set of rules  (the "start" set).
	Set EventOrchestrationRouterSet `pulumi:"set"`
}

// The set of arguments for constructing a EventOrchestrationRouter resource.
type EventOrchestrationRouterArgs struct {
	// When none of the rules match an event, the event will be routed according to the catchAll settings.
	CatchAll EventOrchestrationRouterCatchAllInput
	// ID of the Event Orchestration to which the Router belongs.
	EventOrchestration pulumi.StringInput
	// The Router contains a single set of rules  (the "start" set).
	Set EventOrchestrationRouterSetInput
}

func (EventOrchestrationRouterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationRouterArgs)(nil)).Elem()
}

type EventOrchestrationRouterInput interface {
	pulumi.Input

	ToEventOrchestrationRouterOutput() EventOrchestrationRouterOutput
	ToEventOrchestrationRouterOutputWithContext(ctx context.Context) EventOrchestrationRouterOutput
}

func (*EventOrchestrationRouter) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationRouter)(nil)).Elem()
}

func (i *EventOrchestrationRouter) ToEventOrchestrationRouterOutput() EventOrchestrationRouterOutput {
	return i.ToEventOrchestrationRouterOutputWithContext(context.Background())
}

func (i *EventOrchestrationRouter) ToEventOrchestrationRouterOutputWithContext(ctx context.Context) EventOrchestrationRouterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationRouterOutput)
}

// EventOrchestrationRouterArrayInput is an input type that accepts EventOrchestrationRouterArray and EventOrchestrationRouterArrayOutput values.
// You can construct a concrete instance of `EventOrchestrationRouterArrayInput` via:
//
//	EventOrchestrationRouterArray{ EventOrchestrationRouterArgs{...} }
type EventOrchestrationRouterArrayInput interface {
	pulumi.Input

	ToEventOrchestrationRouterArrayOutput() EventOrchestrationRouterArrayOutput
	ToEventOrchestrationRouterArrayOutputWithContext(context.Context) EventOrchestrationRouterArrayOutput
}

type EventOrchestrationRouterArray []EventOrchestrationRouterInput

func (EventOrchestrationRouterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationRouter)(nil)).Elem()
}

func (i EventOrchestrationRouterArray) ToEventOrchestrationRouterArrayOutput() EventOrchestrationRouterArrayOutput {
	return i.ToEventOrchestrationRouterArrayOutputWithContext(context.Background())
}

func (i EventOrchestrationRouterArray) ToEventOrchestrationRouterArrayOutputWithContext(ctx context.Context) EventOrchestrationRouterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationRouterArrayOutput)
}

// EventOrchestrationRouterMapInput is an input type that accepts EventOrchestrationRouterMap and EventOrchestrationRouterMapOutput values.
// You can construct a concrete instance of `EventOrchestrationRouterMapInput` via:
//
//	EventOrchestrationRouterMap{ "key": EventOrchestrationRouterArgs{...} }
type EventOrchestrationRouterMapInput interface {
	pulumi.Input

	ToEventOrchestrationRouterMapOutput() EventOrchestrationRouterMapOutput
	ToEventOrchestrationRouterMapOutputWithContext(context.Context) EventOrchestrationRouterMapOutput
}

type EventOrchestrationRouterMap map[string]EventOrchestrationRouterInput

func (EventOrchestrationRouterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationRouter)(nil)).Elem()
}

func (i EventOrchestrationRouterMap) ToEventOrchestrationRouterMapOutput() EventOrchestrationRouterMapOutput {
	return i.ToEventOrchestrationRouterMapOutputWithContext(context.Background())
}

func (i EventOrchestrationRouterMap) ToEventOrchestrationRouterMapOutputWithContext(ctx context.Context) EventOrchestrationRouterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationRouterMapOutput)
}

type EventOrchestrationRouterOutput struct{ *pulumi.OutputState }

func (EventOrchestrationRouterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationRouter)(nil)).Elem()
}

func (o EventOrchestrationRouterOutput) ToEventOrchestrationRouterOutput() EventOrchestrationRouterOutput {
	return o
}

func (o EventOrchestrationRouterOutput) ToEventOrchestrationRouterOutputWithContext(ctx context.Context) EventOrchestrationRouterOutput {
	return o
}

// When none of the rules match an event, the event will be routed according to the catchAll settings.
func (o EventOrchestrationRouterOutput) CatchAll() EventOrchestrationRouterCatchAllOutput {
	return o.ApplyT(func(v *EventOrchestrationRouter) EventOrchestrationRouterCatchAllOutput { return v.CatchAll }).(EventOrchestrationRouterCatchAllOutput)
}

// ID of the Event Orchestration to which the Router belongs.
func (o EventOrchestrationRouterOutput) EventOrchestration() pulumi.StringOutput {
	return o.ApplyT(func(v *EventOrchestrationRouter) pulumi.StringOutput { return v.EventOrchestration }).(pulumi.StringOutput)
}

// The Router contains a single set of rules  (the "start" set).
func (o EventOrchestrationRouterOutput) Set() EventOrchestrationRouterSetOutput {
	return o.ApplyT(func(v *EventOrchestrationRouter) EventOrchestrationRouterSetOutput { return v.Set }).(EventOrchestrationRouterSetOutput)
}

type EventOrchestrationRouterArrayOutput struct{ *pulumi.OutputState }

func (EventOrchestrationRouterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationRouter)(nil)).Elem()
}

func (o EventOrchestrationRouterArrayOutput) ToEventOrchestrationRouterArrayOutput() EventOrchestrationRouterArrayOutput {
	return o
}

func (o EventOrchestrationRouterArrayOutput) ToEventOrchestrationRouterArrayOutputWithContext(ctx context.Context) EventOrchestrationRouterArrayOutput {
	return o
}

func (o EventOrchestrationRouterArrayOutput) Index(i pulumi.IntInput) EventOrchestrationRouterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventOrchestrationRouter {
		return vs[0].([]*EventOrchestrationRouter)[vs[1].(int)]
	}).(EventOrchestrationRouterOutput)
}

type EventOrchestrationRouterMapOutput struct{ *pulumi.OutputState }

func (EventOrchestrationRouterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationRouter)(nil)).Elem()
}

func (o EventOrchestrationRouterMapOutput) ToEventOrchestrationRouterMapOutput() EventOrchestrationRouterMapOutput {
	return o
}

func (o EventOrchestrationRouterMapOutput) ToEventOrchestrationRouterMapOutputWithContext(ctx context.Context) EventOrchestrationRouterMapOutput {
	return o
}

func (o EventOrchestrationRouterMapOutput) MapIndex(k pulumi.StringInput) EventOrchestrationRouterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventOrchestrationRouter {
		return vs[0].(map[string]*EventOrchestrationRouter)[vs[1].(string)]
	}).(EventOrchestrationRouterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationRouterInput)(nil)).Elem(), &EventOrchestrationRouter{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationRouterArrayInput)(nil)).Elem(), EventOrchestrationRouterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationRouterMapInput)(nil)).Elem(), EventOrchestrationRouterMap{})
	pulumi.RegisterOutputType(EventOrchestrationRouterOutput{})
	pulumi.RegisterOutputType(EventOrchestrationRouterArrayOutput{})
	pulumi.RegisterOutputType(EventOrchestrationRouterMapOutput{})
}
