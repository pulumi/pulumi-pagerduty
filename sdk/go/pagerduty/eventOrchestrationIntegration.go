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

// An Event Orchestration Integration allows you to create and manage multiple Integrations (and Routing Keys) per Event Orchestration _and_ will allow you to move (migrate) Integrations _between_ two Event Orchestrations.
//
// ## Example of configuring an Integration for an Event Orchestration
//
// This example shows creating `Event Orchestration` and `Team` resources followed by creating an Event Orchestration Integration to handle Events sent to that Event Orchestration.
//
// > When a new Event Orchestration is created there will be one Integration (and Routing Key) included by default. Example below shows how to create an extra Integration associated with this Event Orchestration.
//
// <!--Start PulumiCodeChooser -->
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
//			databaseTeam, err := pagerduty.NewTeam(ctx, "database_team", &pagerduty.TeamArgs{
//				Name: pulumi.String("Database Team"),
//			})
//			if err != nil {
//				return err
//			}
//			eventOrchestration, err := pagerduty.NewEventOrchestration(ctx, "event_orchestration", &pagerduty.EventOrchestrationArgs{
//				Name: pulumi.String("Example Orchestration"),
//				Team: databaseTeam.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestrationIntegration(ctx, "integration", &pagerduty.EventOrchestrationIntegrationArgs{
//				EventOrchestration: eventOrchestration.ID(),
//				Label:              pulumi.String("Example integration"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Event Orchestration Integration can be imported using colon-separated IDs, which is the combination of the Event Orchestration ID followed by the Event Orchestration Integration ID, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration integration 19acac92-027a-4ea0-b06c-bbf516519601:1b49abe7-26db-4439-a715-c6d883acfb3e
// ```
type EventOrchestrationIntegration struct {
	pulumi.CustomResourceState

	// ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
	EventOrchestration pulumi.StringOutput `pulumi:"eventOrchestration"`
	// Name/description of the Integration.
	Label      pulumi.StringOutput                               `pulumi:"label"`
	Parameters EventOrchestrationIntegrationParameterArrayOutput `pulumi:"parameters"`
}

// NewEventOrchestrationIntegration registers a new resource with the given unique name, arguments, and options.
func NewEventOrchestrationIntegration(ctx *pulumi.Context,
	name string, args *EventOrchestrationIntegrationArgs, opts ...pulumi.ResourceOption) (*EventOrchestrationIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EventOrchestration == nil {
		return nil, errors.New("invalid value for required argument 'EventOrchestration'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventOrchestrationIntegration
	err := ctx.RegisterResource("pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventOrchestrationIntegration gets an existing EventOrchestrationIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventOrchestrationIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventOrchestrationIntegrationState, opts ...pulumi.ResourceOption) (*EventOrchestrationIntegration, error) {
	var resource EventOrchestrationIntegration
	err := ctx.ReadResource("pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventOrchestrationIntegration resources.
type eventOrchestrationIntegrationState struct {
	// ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
	EventOrchestration *string `pulumi:"eventOrchestration"`
	// Name/description of the Integration.
	Label      *string                                  `pulumi:"label"`
	Parameters []EventOrchestrationIntegrationParameter `pulumi:"parameters"`
}

type EventOrchestrationIntegrationState struct {
	// ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
	EventOrchestration pulumi.StringPtrInput
	// Name/description of the Integration.
	Label      pulumi.StringPtrInput
	Parameters EventOrchestrationIntegrationParameterArrayInput
}

func (EventOrchestrationIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationIntegrationState)(nil)).Elem()
}

type eventOrchestrationIntegrationArgs struct {
	// ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
	EventOrchestration string `pulumi:"eventOrchestration"`
	// Name/description of the Integration.
	Label string `pulumi:"label"`
}

// The set of arguments for constructing a EventOrchestrationIntegration resource.
type EventOrchestrationIntegrationArgs struct {
	// ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
	EventOrchestration pulumi.StringInput
	// Name/description of the Integration.
	Label pulumi.StringInput
}

func (EventOrchestrationIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationIntegrationArgs)(nil)).Elem()
}

type EventOrchestrationIntegrationInput interface {
	pulumi.Input

	ToEventOrchestrationIntegrationOutput() EventOrchestrationIntegrationOutput
	ToEventOrchestrationIntegrationOutputWithContext(ctx context.Context) EventOrchestrationIntegrationOutput
}

func (*EventOrchestrationIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationIntegration)(nil)).Elem()
}

func (i *EventOrchestrationIntegration) ToEventOrchestrationIntegrationOutput() EventOrchestrationIntegrationOutput {
	return i.ToEventOrchestrationIntegrationOutputWithContext(context.Background())
}

func (i *EventOrchestrationIntegration) ToEventOrchestrationIntegrationOutputWithContext(ctx context.Context) EventOrchestrationIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationIntegrationOutput)
}

// EventOrchestrationIntegrationArrayInput is an input type that accepts EventOrchestrationIntegrationArray and EventOrchestrationIntegrationArrayOutput values.
// You can construct a concrete instance of `EventOrchestrationIntegrationArrayInput` via:
//
//	EventOrchestrationIntegrationArray{ EventOrchestrationIntegrationArgs{...} }
type EventOrchestrationIntegrationArrayInput interface {
	pulumi.Input

	ToEventOrchestrationIntegrationArrayOutput() EventOrchestrationIntegrationArrayOutput
	ToEventOrchestrationIntegrationArrayOutputWithContext(context.Context) EventOrchestrationIntegrationArrayOutput
}

type EventOrchestrationIntegrationArray []EventOrchestrationIntegrationInput

func (EventOrchestrationIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationIntegration)(nil)).Elem()
}

func (i EventOrchestrationIntegrationArray) ToEventOrchestrationIntegrationArrayOutput() EventOrchestrationIntegrationArrayOutput {
	return i.ToEventOrchestrationIntegrationArrayOutputWithContext(context.Background())
}

func (i EventOrchestrationIntegrationArray) ToEventOrchestrationIntegrationArrayOutputWithContext(ctx context.Context) EventOrchestrationIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationIntegrationArrayOutput)
}

// EventOrchestrationIntegrationMapInput is an input type that accepts EventOrchestrationIntegrationMap and EventOrchestrationIntegrationMapOutput values.
// You can construct a concrete instance of `EventOrchestrationIntegrationMapInput` via:
//
//	EventOrchestrationIntegrationMap{ "key": EventOrchestrationIntegrationArgs{...} }
type EventOrchestrationIntegrationMapInput interface {
	pulumi.Input

	ToEventOrchestrationIntegrationMapOutput() EventOrchestrationIntegrationMapOutput
	ToEventOrchestrationIntegrationMapOutputWithContext(context.Context) EventOrchestrationIntegrationMapOutput
}

type EventOrchestrationIntegrationMap map[string]EventOrchestrationIntegrationInput

func (EventOrchestrationIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationIntegration)(nil)).Elem()
}

func (i EventOrchestrationIntegrationMap) ToEventOrchestrationIntegrationMapOutput() EventOrchestrationIntegrationMapOutput {
	return i.ToEventOrchestrationIntegrationMapOutputWithContext(context.Background())
}

func (i EventOrchestrationIntegrationMap) ToEventOrchestrationIntegrationMapOutputWithContext(ctx context.Context) EventOrchestrationIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationIntegrationMapOutput)
}

type EventOrchestrationIntegrationOutput struct{ *pulumi.OutputState }

func (EventOrchestrationIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationIntegration)(nil)).Elem()
}

func (o EventOrchestrationIntegrationOutput) ToEventOrchestrationIntegrationOutput() EventOrchestrationIntegrationOutput {
	return o
}

func (o EventOrchestrationIntegrationOutput) ToEventOrchestrationIntegrationOutputWithContext(ctx context.Context) EventOrchestrationIntegrationOutput {
	return o
}

// ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
func (o EventOrchestrationIntegrationOutput) EventOrchestration() pulumi.StringOutput {
	return o.ApplyT(func(v *EventOrchestrationIntegration) pulumi.StringOutput { return v.EventOrchestration }).(pulumi.StringOutput)
}

// Name/description of the Integration.
func (o EventOrchestrationIntegrationOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *EventOrchestrationIntegration) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

func (o EventOrchestrationIntegrationOutput) Parameters() EventOrchestrationIntegrationParameterArrayOutput {
	return o.ApplyT(func(v *EventOrchestrationIntegration) EventOrchestrationIntegrationParameterArrayOutput {
		return v.Parameters
	}).(EventOrchestrationIntegrationParameterArrayOutput)
}

type EventOrchestrationIntegrationArrayOutput struct{ *pulumi.OutputState }

func (EventOrchestrationIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationIntegration)(nil)).Elem()
}

func (o EventOrchestrationIntegrationArrayOutput) ToEventOrchestrationIntegrationArrayOutput() EventOrchestrationIntegrationArrayOutput {
	return o
}

func (o EventOrchestrationIntegrationArrayOutput) ToEventOrchestrationIntegrationArrayOutputWithContext(ctx context.Context) EventOrchestrationIntegrationArrayOutput {
	return o
}

func (o EventOrchestrationIntegrationArrayOutput) Index(i pulumi.IntInput) EventOrchestrationIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventOrchestrationIntegration {
		return vs[0].([]*EventOrchestrationIntegration)[vs[1].(int)]
	}).(EventOrchestrationIntegrationOutput)
}

type EventOrchestrationIntegrationMapOutput struct{ *pulumi.OutputState }

func (EventOrchestrationIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationIntegration)(nil)).Elem()
}

func (o EventOrchestrationIntegrationMapOutput) ToEventOrchestrationIntegrationMapOutput() EventOrchestrationIntegrationMapOutput {
	return o
}

func (o EventOrchestrationIntegrationMapOutput) ToEventOrchestrationIntegrationMapOutputWithContext(ctx context.Context) EventOrchestrationIntegrationMapOutput {
	return o
}

func (o EventOrchestrationIntegrationMapOutput) MapIndex(k pulumi.StringInput) EventOrchestrationIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventOrchestrationIntegration {
		return vs[0].(map[string]*EventOrchestrationIntegration)[vs[1].(string)]
	}).(EventOrchestrationIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationIntegrationInput)(nil)).Elem(), &EventOrchestrationIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationIntegrationArrayInput)(nil)).Elem(), EventOrchestrationIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationIntegrationMapInput)(nil)).Elem(), EventOrchestrationIntegrationMap{})
	pulumi.RegisterOutputType(EventOrchestrationIntegrationOutput{})
	pulumi.RegisterOutputType(EventOrchestrationIntegrationArrayOutput{})
	pulumi.RegisterOutputType(EventOrchestrationIntegrationMapOutput{})
}
