// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
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
//			example, err := pagerduty.NewService(ctx, "example", &pagerduty.ServiceArgs{
//				Name:                   pulumi.String("Checkout API Service"),
//				AutoResolveTimeout:     pulumi.String("14400"),
//				AcknowledgementTimeout: pulumi.String("600"),
//				EscalationPolicy:       pulumi.Any(examplePagerdutyEscalationPolicy.Id),
//				AlertCreation:          pulumi.String("create_alerts_and_incidents"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceEventRule(ctx, "foo", &pagerduty.ServiceEventRuleArgs{
//				Service:  example.ID(),
//				Position: pulumi.Int(0),
//				Disabled: pulumi.Bool(true),
//				Conditions: &pagerduty.ServiceEventRuleConditionsArgs{
//					Operator: pulumi.String("and"),
//					Subconditions: pagerduty.ServiceEventRuleConditionsSubconditionArray{
//						&pagerduty.ServiceEventRuleConditionsSubconditionArgs{
//							Operator: pulumi.String("contains"),
//							Parameters: pagerduty.ServiceEventRuleConditionsSubconditionParameterArray{
//								&pagerduty.ServiceEventRuleConditionsSubconditionParameterArgs{
//									Value: pulumi.String("disk space"),
//									Path:  pulumi.String("summary"),
//								},
//							},
//						},
//					},
//				},
//				Variables: pagerduty.ServiceEventRuleVariableArray{
//					&pagerduty.ServiceEventRuleVariableArgs{
//						Type: pulumi.String("regex"),
//						Name: pulumi.String("Src"),
//						Parameters: pagerduty.ServiceEventRuleVariableParameterArray{
//							&pagerduty.ServiceEventRuleVariableParameterArgs{
//								Value: pulumi.String("(.*)"),
//								Path:  pulumi.String("source"),
//							},
//						},
//					},
//				},
//				Actions: &pagerduty.ServiceEventRuleActionsArgs{
//					Annotates: pagerduty.ServiceEventRuleActionsAnnotateArray{
//						&pagerduty.ServiceEventRuleActionsAnnotateArgs{
//							Value: pulumi.String("From Terraform"),
//						},
//					},
//					Extractions: pagerduty.ServiceEventRuleActionsExtractionArray{
//						&pagerduty.ServiceEventRuleActionsExtractionArgs{
//							Target: pulumi.String("dedup_key"),
//							Source: pulumi.String("source"),
//							Regex:  pulumi.String("(.*)"),
//						},
//						&pagerduty.ServiceEventRuleActionsExtractionArgs{
//							Target:   pulumi.String("summary"),
//							Template: pulumi.String("Warning: Disk Space Low on {{Src}}"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceEventRule(ctx, "bar", &pagerduty.ServiceEventRuleArgs{
//				Service:  pulumi.Any(fooPagerdutyService.Id),
//				Position: pulumi.Int(1),
//				Disabled: pulumi.Bool(true),
//				Conditions: &pagerduty.ServiceEventRuleConditionsArgs{
//					Operator: pulumi.String("and"),
//					Subconditions: pagerduty.ServiceEventRuleConditionsSubconditionArray{
//						&pagerduty.ServiceEventRuleConditionsSubconditionArgs{
//							Operator: pulumi.String("contains"),
//							Parameters: pagerduty.ServiceEventRuleConditionsSubconditionParameterArray{
//								&pagerduty.ServiceEventRuleConditionsSubconditionParameterArgs{
//									Value: pulumi.String("cpu spike"),
//									Path:  pulumi.String("summary"),
//								},
//							},
//						},
//					},
//				},
//				Actions: &pagerduty.ServiceEventRuleActionsArgs{
//					Annotates: pagerduty.ServiceEventRuleActionsAnnotateArray{
//						&pagerduty.ServiceEventRuleActionsAnnotateArgs{
//							Value: pulumi.String("From Terraform"),
//						},
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
// Service event rules can be imported using using the related `service` id and the `service_event_rule` id separated by a dot, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/serviceEventRule:ServiceEventRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
// ```
type ServiceEventRule struct {
	pulumi.CustomResourceState

	// Actions to apply to an event if the conditions match.
	Actions ServiceEventRuleActionsPtrOutput `pulumi:"actions"`
	// Conditions evaluated to check if an event matches this event rule.
	Conditions ServiceEventRuleConditionsPtrOutput `pulumi:"conditions"`
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// Position/index of the rule within the service.
	Position pulumi.IntPtrOutput `pulumi:"position"`
	// The ID of the service that the rule belongs to.
	Service pulumi.StringOutput `pulumi:"service"`
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame ServiceEventRuleTimeFramePtrOutput `pulumi:"timeFrame"`
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables ServiceEventRuleVariableArrayOutput `pulumi:"variables"`
}

// NewServiceEventRule registers a new resource with the given unique name, arguments, and options.
func NewServiceEventRule(ctx *pulumi.Context,
	name string, args *ServiceEventRuleArgs, opts ...pulumi.ResourceOption) (*ServiceEventRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceEventRule
	err := ctx.RegisterResource("pagerduty:index/serviceEventRule:ServiceEventRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceEventRule gets an existing ServiceEventRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceEventRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceEventRuleState, opts ...pulumi.ResourceOption) (*ServiceEventRule, error) {
	var resource ServiceEventRule
	err := ctx.ReadResource("pagerduty:index/serviceEventRule:ServiceEventRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceEventRule resources.
type serviceEventRuleState struct {
	// Actions to apply to an event if the conditions match.
	Actions *ServiceEventRuleActions `pulumi:"actions"`
	// Conditions evaluated to check if an event matches this event rule.
	Conditions *ServiceEventRuleConditions `pulumi:"conditions"`
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled *bool `pulumi:"disabled"`
	// Position/index of the rule within the service.
	Position *int `pulumi:"position"`
	// The ID of the service that the rule belongs to.
	Service *string `pulumi:"service"`
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame *ServiceEventRuleTimeFrame `pulumi:"timeFrame"`
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables []ServiceEventRuleVariable `pulumi:"variables"`
}

type ServiceEventRuleState struct {
	// Actions to apply to an event if the conditions match.
	Actions ServiceEventRuleActionsPtrInput
	// Conditions evaluated to check if an event matches this event rule.
	Conditions ServiceEventRuleConditionsPtrInput
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrInput
	// Position/index of the rule within the service.
	Position pulumi.IntPtrInput
	// The ID of the service that the rule belongs to.
	Service pulumi.StringPtrInput
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame ServiceEventRuleTimeFramePtrInput
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables ServiceEventRuleVariableArrayInput
}

func (ServiceEventRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceEventRuleState)(nil)).Elem()
}

type serviceEventRuleArgs struct {
	// Actions to apply to an event if the conditions match.
	Actions *ServiceEventRuleActions `pulumi:"actions"`
	// Conditions evaluated to check if an event matches this event rule.
	Conditions *ServiceEventRuleConditions `pulumi:"conditions"`
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled *bool `pulumi:"disabled"`
	// Position/index of the rule within the service.
	Position *int `pulumi:"position"`
	// The ID of the service that the rule belongs to.
	Service string `pulumi:"service"`
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame *ServiceEventRuleTimeFrame `pulumi:"timeFrame"`
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables []ServiceEventRuleVariable `pulumi:"variables"`
}

// The set of arguments for constructing a ServiceEventRule resource.
type ServiceEventRuleArgs struct {
	// Actions to apply to an event if the conditions match.
	Actions ServiceEventRuleActionsPtrInput
	// Conditions evaluated to check if an event matches this event rule.
	Conditions ServiceEventRuleConditionsPtrInput
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrInput
	// Position/index of the rule within the service.
	Position pulumi.IntPtrInput
	// The ID of the service that the rule belongs to.
	Service pulumi.StringInput
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame ServiceEventRuleTimeFramePtrInput
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables ServiceEventRuleVariableArrayInput
}

func (ServiceEventRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceEventRuleArgs)(nil)).Elem()
}

type ServiceEventRuleInput interface {
	pulumi.Input

	ToServiceEventRuleOutput() ServiceEventRuleOutput
	ToServiceEventRuleOutputWithContext(ctx context.Context) ServiceEventRuleOutput
}

func (*ServiceEventRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceEventRule)(nil)).Elem()
}

func (i *ServiceEventRule) ToServiceEventRuleOutput() ServiceEventRuleOutput {
	return i.ToServiceEventRuleOutputWithContext(context.Background())
}

func (i *ServiceEventRule) ToServiceEventRuleOutputWithContext(ctx context.Context) ServiceEventRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceEventRuleOutput)
}

// ServiceEventRuleArrayInput is an input type that accepts ServiceEventRuleArray and ServiceEventRuleArrayOutput values.
// You can construct a concrete instance of `ServiceEventRuleArrayInput` via:
//
//	ServiceEventRuleArray{ ServiceEventRuleArgs{...} }
type ServiceEventRuleArrayInput interface {
	pulumi.Input

	ToServiceEventRuleArrayOutput() ServiceEventRuleArrayOutput
	ToServiceEventRuleArrayOutputWithContext(context.Context) ServiceEventRuleArrayOutput
}

type ServiceEventRuleArray []ServiceEventRuleInput

func (ServiceEventRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceEventRule)(nil)).Elem()
}

func (i ServiceEventRuleArray) ToServiceEventRuleArrayOutput() ServiceEventRuleArrayOutput {
	return i.ToServiceEventRuleArrayOutputWithContext(context.Background())
}

func (i ServiceEventRuleArray) ToServiceEventRuleArrayOutputWithContext(ctx context.Context) ServiceEventRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceEventRuleArrayOutput)
}

// ServiceEventRuleMapInput is an input type that accepts ServiceEventRuleMap and ServiceEventRuleMapOutput values.
// You can construct a concrete instance of `ServiceEventRuleMapInput` via:
//
//	ServiceEventRuleMap{ "key": ServiceEventRuleArgs{...} }
type ServiceEventRuleMapInput interface {
	pulumi.Input

	ToServiceEventRuleMapOutput() ServiceEventRuleMapOutput
	ToServiceEventRuleMapOutputWithContext(context.Context) ServiceEventRuleMapOutput
}

type ServiceEventRuleMap map[string]ServiceEventRuleInput

func (ServiceEventRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceEventRule)(nil)).Elem()
}

func (i ServiceEventRuleMap) ToServiceEventRuleMapOutput() ServiceEventRuleMapOutput {
	return i.ToServiceEventRuleMapOutputWithContext(context.Background())
}

func (i ServiceEventRuleMap) ToServiceEventRuleMapOutputWithContext(ctx context.Context) ServiceEventRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceEventRuleMapOutput)
}

type ServiceEventRuleOutput struct{ *pulumi.OutputState }

func (ServiceEventRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceEventRule)(nil)).Elem()
}

func (o ServiceEventRuleOutput) ToServiceEventRuleOutput() ServiceEventRuleOutput {
	return o
}

func (o ServiceEventRuleOutput) ToServiceEventRuleOutputWithContext(ctx context.Context) ServiceEventRuleOutput {
	return o
}

// Actions to apply to an event if the conditions match.
func (o ServiceEventRuleOutput) Actions() ServiceEventRuleActionsPtrOutput {
	return o.ApplyT(func(v *ServiceEventRule) ServiceEventRuleActionsPtrOutput { return v.Actions }).(ServiceEventRuleActionsPtrOutput)
}

// Conditions evaluated to check if an event matches this event rule.
func (o ServiceEventRuleOutput) Conditions() ServiceEventRuleConditionsPtrOutput {
	return o.ApplyT(func(v *ServiceEventRule) ServiceEventRuleConditionsPtrOutput { return v.Conditions }).(ServiceEventRuleConditionsPtrOutput)
}

// Indicates whether the rule is disabled and would therefore not be evaluated.
func (o ServiceEventRuleOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceEventRule) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// Position/index of the rule within the service.
func (o ServiceEventRuleOutput) Position() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServiceEventRule) pulumi.IntPtrOutput { return v.Position }).(pulumi.IntPtrOutput)
}

// The ID of the service that the rule belongs to.
func (o ServiceEventRuleOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceEventRule) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
func (o ServiceEventRuleOutput) TimeFrame() ServiceEventRuleTimeFramePtrOutput {
	return o.ApplyT(func(v *ServiceEventRule) ServiceEventRuleTimeFramePtrOutput { return v.TimeFrame }).(ServiceEventRuleTimeFramePtrOutput)
}

// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
func (o ServiceEventRuleOutput) Variables() ServiceEventRuleVariableArrayOutput {
	return o.ApplyT(func(v *ServiceEventRule) ServiceEventRuleVariableArrayOutput { return v.Variables }).(ServiceEventRuleVariableArrayOutput)
}

type ServiceEventRuleArrayOutput struct{ *pulumi.OutputState }

func (ServiceEventRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceEventRule)(nil)).Elem()
}

func (o ServiceEventRuleArrayOutput) ToServiceEventRuleArrayOutput() ServiceEventRuleArrayOutput {
	return o
}

func (o ServiceEventRuleArrayOutput) ToServiceEventRuleArrayOutputWithContext(ctx context.Context) ServiceEventRuleArrayOutput {
	return o
}

func (o ServiceEventRuleArrayOutput) Index(i pulumi.IntInput) ServiceEventRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceEventRule {
		return vs[0].([]*ServiceEventRule)[vs[1].(int)]
	}).(ServiceEventRuleOutput)
}

type ServiceEventRuleMapOutput struct{ *pulumi.OutputState }

func (ServiceEventRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceEventRule)(nil)).Elem()
}

func (o ServiceEventRuleMapOutput) ToServiceEventRuleMapOutput() ServiceEventRuleMapOutput {
	return o
}

func (o ServiceEventRuleMapOutput) ToServiceEventRuleMapOutputWithContext(ctx context.Context) ServiceEventRuleMapOutput {
	return o
}

func (o ServiceEventRuleMapOutput) MapIndex(k pulumi.StringInput) ServiceEventRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceEventRule {
		return vs[0].(map[string]*ServiceEventRule)[vs[1].(string)]
	}).(ServiceEventRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceEventRuleInput)(nil)).Elem(), &ServiceEventRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceEventRuleArrayInput)(nil)).Elem(), ServiceEventRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceEventRuleMapInput)(nil)).Elem(), ServiceEventRuleMap{})
	pulumi.RegisterOutputType(ServiceEventRuleOutput{})
	pulumi.RegisterOutputType(ServiceEventRuleArrayOutput{})
	pulumi.RegisterOutputType(ServiceEventRuleMapOutput{})
}
