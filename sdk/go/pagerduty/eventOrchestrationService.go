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

// A [Service Orchestration](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.
//
// > If you have a Service that uses [Service Event Rules](https://support.pagerduty.com/docs/rulesets#service-event-rules), you can switch to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) at any time setting the attribute `enableEventOrchestrationForService` to `true`. Please read the [Switch to Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#switch-to-service-orchestrations) instructions for more information.
//
// ## Example of configuring a Service Orchestration
//
// This example shows creating `Team`, `User`, `Escalation Policy`, and `Service` resources followed by creating a Service Orchestration to handle Events sent to that Service.
//
// This example also shows using the getPriority and EscalationPolicy data sources to configure `priority` and `escalationPolicy` actions for a rule.
//
// This example shows a Service Orchestration that has nested sets: a rule in the "start" set has a `routeTo` action pointing at the "step-two" set.
//
// The `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set. In this example the `catchAll` doesn't have any `actions` so it'll leave events as-is.
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
//			engineering, err := pagerduty.NewTeam(ctx, "engineering", &pagerduty.TeamArgs{
//				Name: pulumi.String("Engineering"),
//			})
//			if err != nil {
//				return err
//			}
//			example, err := pagerduty.NewUser(ctx, "example", &pagerduty.UserArgs{
//				Name:  pulumi.String("Earline Greenholt"),
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewTeamMembership(ctx, "foo", &pagerduty.TeamMembershipArgs{
//				UserId: example.ID(),
//				TeamId: engineering.ID(),
//				Role:   pulumi.String("manager"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleEscalationPolicy, err := pagerduty.NewEscalationPolicy(ctx, "example", &pagerduty.EscalationPolicyArgs{
//				Name:     pulumi.String("Engineering Escalation Policy"),
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("user_reference"),
//								Id:   example.ID(),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleService, err := pagerduty.NewService(ctx, "example", &pagerduty.ServiceArgs{
//				Name:                   pulumi.String("My Web App"),
//				AutoResolveTimeout:     pulumi.String("14400"),
//				AcknowledgementTimeout: pulumi.String("600"),
//				EscalationPolicy:       exampleEscalationPolicy.ID(),
//				AlertCreation:          pulumi.String("create_alerts_and_incidents"),
//			})
//			if err != nil {
//				return err
//			}
//			csImpact, err := pagerduty.NewIncidentCustomField(ctx, "cs_impact", &pagerduty.IncidentCustomFieldArgs{
//				Name:      pulumi.String("impact"),
//				DataType:  pulumi.String("string"),
//				FieldType: pulumi.String("single_value"),
//			})
//			if err != nil {
//				return err
//			}
//			p1, err := pagerduty.GetPriority(ctx, &pagerduty.GetPriorityArgs{
//				Name: "P1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			sreEscPolicy, err := pagerduty.LookupEscalationPolicy(ctx, &pagerduty.LookupEscalationPolicyArgs{
//				Name: "SRE Escalation Policy",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestrationService(ctx, "www", &pagerduty.EventOrchestrationServiceArgs{
//				Service:                            exampleService.ID(),
//				EnableEventOrchestrationForService: pulumi.Bool(true),
//				Sets: pagerduty.EventOrchestrationServiceSetArray{
//					&pagerduty.EventOrchestrationServiceSetArgs{
//						Id: pulumi.String("start"),
//						Rules: pagerduty.EventOrchestrationServiceSetRuleArray{
//							&pagerduty.EventOrchestrationServiceSetRuleArgs{
//								Label: pulumi.String("Always apply some consistent event transformations to all events"),
//								Actions: &pagerduty.EventOrchestrationServiceSetRuleActionsArgs{
//									Variables: pagerduty.EventOrchestrationServiceSetRuleActionsVariableArray{
//										&pagerduty.EventOrchestrationServiceSetRuleActionsVariableArgs{
//											Name:  pulumi.String("hostname"),
//											Path:  pulumi.String("event.component"),
//											Value: pulumi.String("hostname: (.*)"),
//											Type:  pulumi.String("regex"),
//										},
//									},
//									Extractions: pagerduty.EventOrchestrationServiceSetRuleActionsExtractionArray{
//										&pagerduty.EventOrchestrationServiceSetRuleActionsExtractionArgs{
//											Template: pulumi.String("{{variables.hostname}}"),
//											Target:   pulumi.String("event.custom_details.hostname"),
//										},
//										&pagerduty.EventOrchestrationServiceSetRuleActionsExtractionArgs{
//											Source: pulumi.String("event.source"),
//											Regex:  pulumi.String("www (.*) service"),
//											Target: pulumi.String("event.source"),
//										},
//									},
//									RouteTo: pulumi.String("step-two"),
//								},
//							},
//						},
//					},
//					&pagerduty.EventOrchestrationServiceSetArgs{
//						Id: pulumi.String("step-two"),
//						Rules: pagerduty.EventOrchestrationServiceSetRuleArray{
//							&pagerduty.EventOrchestrationServiceSetRuleArgs{
//								Label: pulumi.String("All critical alerts should be treated as P1 incident"),
//								Conditions: pagerduty.EventOrchestrationServiceSetRuleConditionArray{
//									&pagerduty.EventOrchestrationServiceSetRuleConditionArgs{
//										Expression: pulumi.String("event.severity matches 'critical'"),
//									},
//								},
//								Actions: &pagerduty.EventOrchestrationServiceSetRuleActionsArgs{
//									Annotate: pulumi.String("Please use our P1 runbook: https://docs.test/p1-runbook"),
//									Priority: pulumi.String(p1.Id),
//									IncidentCustomFieldUpdates: pagerduty.EventOrchestrationServiceSetRuleActionsIncidentCustomFieldUpdateArray{
//										&pagerduty.EventOrchestrationServiceSetRuleActionsIncidentCustomFieldUpdateArgs{
//											Id:    csImpact.ID(),
//											Value: pulumi.String("High Impact"),
//										},
//									},
//								},
//							},
//							&pagerduty.EventOrchestrationServiceSetRuleArgs{
//								Label: pulumi.String("If any of the API apps are unavailable, page the SRE team"),
//								Conditions: pagerduty.EventOrchestrationServiceSetRuleConditionArray{
//									&pagerduty.EventOrchestrationServiceSetRuleConditionArgs{
//										Expression: pulumi.String("event.custom_details.service_name matches part '-api' and event.custom_details.status_code matches '502'"),
//									},
//								},
//								Actions: &pagerduty.EventOrchestrationServiceSetRuleActionsArgs{
//									EscalationPolicy: pulumi.String(sreEscPolicy.Id),
//								},
//							},
//							&pagerduty.EventOrchestrationServiceSetRuleArgs{
//								Label: pulumi.String("If there's something wrong on the canary let the team know about it in our deployments Slack channel"),
//								Conditions: pagerduty.EventOrchestrationServiceSetRuleConditionArray{
//									&pagerduty.EventOrchestrationServiceSetRuleConditionArgs{
//										Expression: pulumi.String("event.custom_details.hostname matches part 'canary'"),
//									},
//								},
//								Actions: &pagerduty.EventOrchestrationServiceSetRuleActionsArgs{
//									AutomationAction: &pagerduty.EventOrchestrationServiceSetRuleActionsAutomationActionArgs{
//										Name:     pulumi.String("Canary Slack Notification"),
//										Url:      pulumi.String("https://our-slack-listerner.test/canary-notification"),
//										AutoSend: pulumi.Bool(true),
//										Parameters: pagerduty.EventOrchestrationServiceSetRuleActionsAutomationActionParameterArray{
//											&pagerduty.EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs{
//												Key:   pulumi.String("channel"),
//												Value: pulumi.String("#my-team-channel"),
//											},
//											&pagerduty.EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs{
//												Key:   pulumi.String("message"),
//												Value: pulumi.String("something is wrong with the canary deployment"),
//											},
//										},
//										Headers: pagerduty.EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArray{
//											&pagerduty.EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs{
//												Key:   pulumi.String("X-Notification-Source"),
//												Value: pulumi.String("PagerDuty Incident Webhook"),
//											},
//										},
//									},
//								},
//							},
//							&pagerduty.EventOrchestrationServiceSetRuleArgs{
//								Label: pulumi.String("Never bother the on-call for info-level events outside of work hours"),
//								Conditions: pagerduty.EventOrchestrationServiceSetRuleConditionArray{
//									&pagerduty.EventOrchestrationServiceSetRuleConditionArgs{
//										Expression: pulumi.String("event.severity matches 'info' and not (now in Mon,Tue,Wed,Thu,Fri 09:00:00 to 17:00:00 America/Los_Angeles)"),
//									},
//								},
//								Actions: &pagerduty.EventOrchestrationServiceSetRuleActionsArgs{
//									Suppress: pulumi.Bool(true),
//								},
//							},
//						},
//					},
//				},
//				CatchAll: &pagerduty.EventOrchestrationServiceCatchAllArgs{
//					Actions: nil,
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
// Service Orchestration can be imported using the `id` of the Service, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/eventOrchestrationService:EventOrchestrationService service PFEODA7
// ```
type EventOrchestrationService struct {
	pulumi.CustomResourceState

	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationServiceCatchAllOutput `pulumi:"catchAll"`
	// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
	EnableEventOrchestrationForService pulumi.BoolOutput `pulumi:"enableEventOrchestrationForService"`
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
	EnableEventOrchestrationForService *bool `pulumi:"enableEventOrchestrationForService"`
	// ID of the Service to which this Service Orchestration belongs to.
	Service *string `pulumi:"service"`
	// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets []EventOrchestrationServiceSet `pulumi:"sets"`
}

type EventOrchestrationServiceState struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationServiceCatchAllPtrInput
	// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
	EnableEventOrchestrationForService pulumi.BoolPtrInput
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
	// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
	EnableEventOrchestrationForService *bool `pulumi:"enableEventOrchestrationForService"`
	// ID of the Service to which this Service Orchestration belongs to.
	Service string `pulumi:"service"`
	// A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
	Sets []EventOrchestrationServiceSet `pulumi:"sets"`
}

// The set of arguments for constructing a EventOrchestrationService resource.
type EventOrchestrationServiceArgs struct {
	// the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
	CatchAll EventOrchestrationServiceCatchAllInput
	// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
	EnableEventOrchestrationForService pulumi.BoolPtrInput
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

// Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
func (o EventOrchestrationServiceOutput) EnableEventOrchestrationForService() pulumi.BoolOutput {
	return o.ApplyT(func(v *EventOrchestrationService) pulumi.BoolOutput { return v.EnableEventOrchestrationForService }).(pulumi.BoolOutput)
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
