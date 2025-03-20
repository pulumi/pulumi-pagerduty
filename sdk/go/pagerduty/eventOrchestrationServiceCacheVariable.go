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

// A [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) can be created on a Service Event Orchestration, in order to temporarily store event data to be referenced later within the Service Event Orchestration
//
// ## Example of configuring a Cache Variable for a Service Event Orchestration
//
// This example shows creating a service `Event Orchestration` and a `Cache Variable`. This Cache Variable will count and store the number of trigger events with 'database' in its title. Then all alerts sent to this Event Orchestration will have its severity upped to 'critical' if the count has reached at least 5 triggers within the last 1 minute.
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
//			databaseTeam, err := pagerduty.NewTeam(ctx, "database_team", &pagerduty.TeamArgs{
//				Name: pulumi.String("Database Team"),
//			})
//			if err != nil {
//				return err
//			}
//			user1, err := pagerduty.NewUser(ctx, "user_1", &pagerduty.UserArgs{
//				Name:  pulumi.String("Earline Greenholt"),
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//				Teams: pulumi.StringArray{
//					databaseTeam.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			dbEp, err := pagerduty.NewEscalationPolicy(ctx, "db_ep", &pagerduty.EscalationPolicyArgs{
//				Name:     pulumi.String("Database Escalation Policy"),
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("user"),
//								Id:   user1.ID(),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			svc, err := pagerduty.NewService(ctx, "svc", &pagerduty.ServiceArgs{
//				Name:                   pulumi.String("My Database Service"),
//				AutoResolveTimeout:     pulumi.String("14400"),
//				AcknowledgementTimeout: pulumi.String("600"),
//				EscalationPolicy:       dbEp.ID(),
//				AlertCreation:          pulumi.String("create_alerts_and_incidents"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestrationServiceCacheVariable(ctx, "num_db_triggers", &pagerduty.EventOrchestrationServiceCacheVariableArgs{
//				Service: svc.ID(),
//				Name:    pulumi.String("num_db_triggers"),
//				Conditions: pagerduty.EventOrchestrationServiceCacheVariableConditionArray{
//					&pagerduty.EventOrchestrationServiceCacheVariableConditionArgs{
//						Expression: pulumi.String("event.summary matches part 'database'"),
//					},
//				},
//				Configuration: &pagerduty.EventOrchestrationServiceCacheVariableConfigurationArgs{
//					Type:       pulumi.String("trigger_event_count"),
//					TtlSeconds: pulumi.Int(60),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestrationServiceCacheVariable(ctx, "is_maintenance", &pagerduty.EventOrchestrationServiceCacheVariableArgs{
//				Service: svc.ID(),
//				Name:    pulumi.String("is_maintenance"),
//				Configuration: &pagerduty.EventOrchestrationServiceCacheVariableConfigurationArgs{
//					Type:       pulumi.String("external_data"),
//					DataType:   pulumi.String("boolean"),
//					TtlSeconds: pulumi.Int(7200),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestrationService(ctx, "event_orchestration", &pagerduty.EventOrchestrationServiceArgs{
//				Service:                            svc.ID(),
//				EnableEventOrchestrationForService: pulumi.Bool(true),
//				Sets: pagerduty.EventOrchestrationServiceSetArray{
//					&pagerduty.EventOrchestrationServiceSetArgs{
//						Id: pulumi.String("start"),
//						Rules: pagerduty.EventOrchestrationServiceSetRuleArray{
//							&pagerduty.EventOrchestrationServiceSetRuleArgs{
//								Label: pulumi.String("Suppress alerts if the service is in maintenance"),
//								Conditions: pagerduty.EventOrchestrationServiceSetRuleConditionArray{
//									&pagerduty.EventOrchestrationServiceSetRuleConditionArgs{
//										Expression: pulumi.String("cache_var.is_maintenance == true"),
//									},
//								},
//								Actions: &pagerduty.EventOrchestrationServiceSetRuleActionsArgs{
//									Suppress: pulumi.Bool(true),
//								},
//							},
//							&pagerduty.EventOrchestrationServiceSetRuleArgs{
//								Label: pulumi.String("Set severity to critical if we see at least 5 triggers on the DB within the last 1 minute"),
//								Conditions: pagerduty.EventOrchestrationServiceSetRuleConditionArray{
//									&pagerduty.EventOrchestrationServiceSetRuleConditionArgs{
//										Expression: pulumi.String("cache_var.num_db_triggers >= 5"),
//									},
//								},
//								Actions: &pagerduty.EventOrchestrationServiceSetRuleActionsArgs{
//									Severity: pulumi.String("critical"),
//								},
//							},
//						},
//					},
//				},
//				CatchAll: &pagerduty.EventOrchestrationServiceCatchAllArgs{
//					Actions: &pagerduty.EventOrchestrationServiceCatchAllActionsArgs{},
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
// Cache Variables can be imported using colon-separated IDs, which is the combination of the Service Event Orchestration ID followed by the Cache Variable ID, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable cache_variable PLBP09X:138ed254-3444-44ad-8cc7-701d69def439
// ```
type EventOrchestrationServiceCacheVariable struct {
	pulumi.CustomResourceState

	// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recentValue` or `triggerEventCount`.
	Conditions EventOrchestrationServiceCacheVariableConditionArrayOutput `pulumi:"conditions"`
	// A configuration object to define what and how values will be stored in the Cache Variable.
	Configuration EventOrchestrationServiceCacheVariableConfigurationOutput `pulumi:"configuration"`
	// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// Name of the Cache Variable associated with the Service Event Orchestration.
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the Service Event Orchestration to which this Cache Variable belongs.
	Service pulumi.StringOutput `pulumi:"service"`
}

// NewEventOrchestrationServiceCacheVariable registers a new resource with the given unique name, arguments, and options.
func NewEventOrchestrationServiceCacheVariable(ctx *pulumi.Context,
	name string, args *EventOrchestrationServiceCacheVariableArgs, opts ...pulumi.ResourceOption) (*EventOrchestrationServiceCacheVariable, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Configuration == nil {
		return nil, errors.New("invalid value for required argument 'Configuration'")
	}
	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventOrchestrationServiceCacheVariable
	err := ctx.RegisterResource("pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventOrchestrationServiceCacheVariable gets an existing EventOrchestrationServiceCacheVariable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventOrchestrationServiceCacheVariable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventOrchestrationServiceCacheVariableState, opts ...pulumi.ResourceOption) (*EventOrchestrationServiceCacheVariable, error) {
	var resource EventOrchestrationServiceCacheVariable
	err := ctx.ReadResource("pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventOrchestrationServiceCacheVariable resources.
type eventOrchestrationServiceCacheVariableState struct {
	// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recentValue` or `triggerEventCount`.
	Conditions []EventOrchestrationServiceCacheVariableCondition `pulumi:"conditions"`
	// A configuration object to define what and how values will be stored in the Cache Variable.
	Configuration *EventOrchestrationServiceCacheVariableConfiguration `pulumi:"configuration"`
	// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
	Disabled *bool `pulumi:"disabled"`
	// Name of the Cache Variable associated with the Service Event Orchestration.
	Name *string `pulumi:"name"`
	// ID of the Service Event Orchestration to which this Cache Variable belongs.
	Service *string `pulumi:"service"`
}

type EventOrchestrationServiceCacheVariableState struct {
	// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recentValue` or `triggerEventCount`.
	Conditions EventOrchestrationServiceCacheVariableConditionArrayInput
	// A configuration object to define what and how values will be stored in the Cache Variable.
	Configuration EventOrchestrationServiceCacheVariableConfigurationPtrInput
	// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrInput
	// Name of the Cache Variable associated with the Service Event Orchestration.
	Name pulumi.StringPtrInput
	// ID of the Service Event Orchestration to which this Cache Variable belongs.
	Service pulumi.StringPtrInput
}

func (EventOrchestrationServiceCacheVariableState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationServiceCacheVariableState)(nil)).Elem()
}

type eventOrchestrationServiceCacheVariableArgs struct {
	// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recentValue` or `triggerEventCount`.
	Conditions []EventOrchestrationServiceCacheVariableCondition `pulumi:"conditions"`
	// A configuration object to define what and how values will be stored in the Cache Variable.
	Configuration EventOrchestrationServiceCacheVariableConfiguration `pulumi:"configuration"`
	// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
	Disabled *bool `pulumi:"disabled"`
	// Name of the Cache Variable associated with the Service Event Orchestration.
	Name *string `pulumi:"name"`
	// ID of the Service Event Orchestration to which this Cache Variable belongs.
	Service string `pulumi:"service"`
}

// The set of arguments for constructing a EventOrchestrationServiceCacheVariable resource.
type EventOrchestrationServiceCacheVariableArgs struct {
	// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recentValue` or `triggerEventCount`.
	Conditions EventOrchestrationServiceCacheVariableConditionArrayInput
	// A configuration object to define what and how values will be stored in the Cache Variable.
	Configuration EventOrchestrationServiceCacheVariableConfigurationInput
	// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrInput
	// Name of the Cache Variable associated with the Service Event Orchestration.
	Name pulumi.StringPtrInput
	// ID of the Service Event Orchestration to which this Cache Variable belongs.
	Service pulumi.StringInput
}

func (EventOrchestrationServiceCacheVariableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventOrchestrationServiceCacheVariableArgs)(nil)).Elem()
}

type EventOrchestrationServiceCacheVariableInput interface {
	pulumi.Input

	ToEventOrchestrationServiceCacheVariableOutput() EventOrchestrationServiceCacheVariableOutput
	ToEventOrchestrationServiceCacheVariableOutputWithContext(ctx context.Context) EventOrchestrationServiceCacheVariableOutput
}

func (*EventOrchestrationServiceCacheVariable) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationServiceCacheVariable)(nil)).Elem()
}

func (i *EventOrchestrationServiceCacheVariable) ToEventOrchestrationServiceCacheVariableOutput() EventOrchestrationServiceCacheVariableOutput {
	return i.ToEventOrchestrationServiceCacheVariableOutputWithContext(context.Background())
}

func (i *EventOrchestrationServiceCacheVariable) ToEventOrchestrationServiceCacheVariableOutputWithContext(ctx context.Context) EventOrchestrationServiceCacheVariableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationServiceCacheVariableOutput)
}

// EventOrchestrationServiceCacheVariableArrayInput is an input type that accepts EventOrchestrationServiceCacheVariableArray and EventOrchestrationServiceCacheVariableArrayOutput values.
// You can construct a concrete instance of `EventOrchestrationServiceCacheVariableArrayInput` via:
//
//	EventOrchestrationServiceCacheVariableArray{ EventOrchestrationServiceCacheVariableArgs{...} }
type EventOrchestrationServiceCacheVariableArrayInput interface {
	pulumi.Input

	ToEventOrchestrationServiceCacheVariableArrayOutput() EventOrchestrationServiceCacheVariableArrayOutput
	ToEventOrchestrationServiceCacheVariableArrayOutputWithContext(context.Context) EventOrchestrationServiceCacheVariableArrayOutput
}

type EventOrchestrationServiceCacheVariableArray []EventOrchestrationServiceCacheVariableInput

func (EventOrchestrationServiceCacheVariableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationServiceCacheVariable)(nil)).Elem()
}

func (i EventOrchestrationServiceCacheVariableArray) ToEventOrchestrationServiceCacheVariableArrayOutput() EventOrchestrationServiceCacheVariableArrayOutput {
	return i.ToEventOrchestrationServiceCacheVariableArrayOutputWithContext(context.Background())
}

func (i EventOrchestrationServiceCacheVariableArray) ToEventOrchestrationServiceCacheVariableArrayOutputWithContext(ctx context.Context) EventOrchestrationServiceCacheVariableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationServiceCacheVariableArrayOutput)
}

// EventOrchestrationServiceCacheVariableMapInput is an input type that accepts EventOrchestrationServiceCacheVariableMap and EventOrchestrationServiceCacheVariableMapOutput values.
// You can construct a concrete instance of `EventOrchestrationServiceCacheVariableMapInput` via:
//
//	EventOrchestrationServiceCacheVariableMap{ "key": EventOrchestrationServiceCacheVariableArgs{...} }
type EventOrchestrationServiceCacheVariableMapInput interface {
	pulumi.Input

	ToEventOrchestrationServiceCacheVariableMapOutput() EventOrchestrationServiceCacheVariableMapOutput
	ToEventOrchestrationServiceCacheVariableMapOutputWithContext(context.Context) EventOrchestrationServiceCacheVariableMapOutput
}

type EventOrchestrationServiceCacheVariableMap map[string]EventOrchestrationServiceCacheVariableInput

func (EventOrchestrationServiceCacheVariableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationServiceCacheVariable)(nil)).Elem()
}

func (i EventOrchestrationServiceCacheVariableMap) ToEventOrchestrationServiceCacheVariableMapOutput() EventOrchestrationServiceCacheVariableMapOutput {
	return i.ToEventOrchestrationServiceCacheVariableMapOutputWithContext(context.Background())
}

func (i EventOrchestrationServiceCacheVariableMap) ToEventOrchestrationServiceCacheVariableMapOutputWithContext(ctx context.Context) EventOrchestrationServiceCacheVariableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventOrchestrationServiceCacheVariableMapOutput)
}

type EventOrchestrationServiceCacheVariableOutput struct{ *pulumi.OutputState }

func (EventOrchestrationServiceCacheVariableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventOrchestrationServiceCacheVariable)(nil)).Elem()
}

func (o EventOrchestrationServiceCacheVariableOutput) ToEventOrchestrationServiceCacheVariableOutput() EventOrchestrationServiceCacheVariableOutput {
	return o
}

func (o EventOrchestrationServiceCacheVariableOutput) ToEventOrchestrationServiceCacheVariableOutputWithContext(ctx context.Context) EventOrchestrationServiceCacheVariableOutput {
	return o
}

// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recentValue` or `triggerEventCount`.
func (o EventOrchestrationServiceCacheVariableOutput) Conditions() EventOrchestrationServiceCacheVariableConditionArrayOutput {
	return o.ApplyT(func(v *EventOrchestrationServiceCacheVariable) EventOrchestrationServiceCacheVariableConditionArrayOutput {
		return v.Conditions
	}).(EventOrchestrationServiceCacheVariableConditionArrayOutput)
}

// A configuration object to define what and how values will be stored in the Cache Variable.
func (o EventOrchestrationServiceCacheVariableOutput) Configuration() EventOrchestrationServiceCacheVariableConfigurationOutput {
	return o.ApplyT(func(v *EventOrchestrationServiceCacheVariable) EventOrchestrationServiceCacheVariableConfigurationOutput {
		return v.Configuration
	}).(EventOrchestrationServiceCacheVariableConfigurationOutput)
}

// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
func (o EventOrchestrationServiceCacheVariableOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventOrchestrationServiceCacheVariable) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// Name of the Cache Variable associated with the Service Event Orchestration.
func (o EventOrchestrationServiceCacheVariableOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventOrchestrationServiceCacheVariable) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the Service Event Orchestration to which this Cache Variable belongs.
func (o EventOrchestrationServiceCacheVariableOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *EventOrchestrationServiceCacheVariable) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

type EventOrchestrationServiceCacheVariableArrayOutput struct{ *pulumi.OutputState }

func (EventOrchestrationServiceCacheVariableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventOrchestrationServiceCacheVariable)(nil)).Elem()
}

func (o EventOrchestrationServiceCacheVariableArrayOutput) ToEventOrchestrationServiceCacheVariableArrayOutput() EventOrchestrationServiceCacheVariableArrayOutput {
	return o
}

func (o EventOrchestrationServiceCacheVariableArrayOutput) ToEventOrchestrationServiceCacheVariableArrayOutputWithContext(ctx context.Context) EventOrchestrationServiceCacheVariableArrayOutput {
	return o
}

func (o EventOrchestrationServiceCacheVariableArrayOutput) Index(i pulumi.IntInput) EventOrchestrationServiceCacheVariableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventOrchestrationServiceCacheVariable {
		return vs[0].([]*EventOrchestrationServiceCacheVariable)[vs[1].(int)]
	}).(EventOrchestrationServiceCacheVariableOutput)
}

type EventOrchestrationServiceCacheVariableMapOutput struct{ *pulumi.OutputState }

func (EventOrchestrationServiceCacheVariableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventOrchestrationServiceCacheVariable)(nil)).Elem()
}

func (o EventOrchestrationServiceCacheVariableMapOutput) ToEventOrchestrationServiceCacheVariableMapOutput() EventOrchestrationServiceCacheVariableMapOutput {
	return o
}

func (o EventOrchestrationServiceCacheVariableMapOutput) ToEventOrchestrationServiceCacheVariableMapOutputWithContext(ctx context.Context) EventOrchestrationServiceCacheVariableMapOutput {
	return o
}

func (o EventOrchestrationServiceCacheVariableMapOutput) MapIndex(k pulumi.StringInput) EventOrchestrationServiceCacheVariableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventOrchestrationServiceCacheVariable {
		return vs[0].(map[string]*EventOrchestrationServiceCacheVariable)[vs[1].(string)]
	}).(EventOrchestrationServiceCacheVariableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationServiceCacheVariableInput)(nil)).Elem(), &EventOrchestrationServiceCacheVariable{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationServiceCacheVariableArrayInput)(nil)).Elem(), EventOrchestrationServiceCacheVariableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventOrchestrationServiceCacheVariableMapInput)(nil)).Elem(), EventOrchestrationServiceCacheVariableMap{})
	pulumi.RegisterOutputType(EventOrchestrationServiceCacheVariableOutput{})
	pulumi.RegisterOutputType(EventOrchestrationServiceCacheVariableArrayOutput{})
	pulumi.RegisterOutputType(EventOrchestrationServiceCacheVariableMapOutput{})
}
