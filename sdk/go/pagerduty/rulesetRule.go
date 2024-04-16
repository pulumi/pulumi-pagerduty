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

// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty"
//	"github.com/pulumi/pulumi-time/sdk/go/time"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			foo, err := pagerduty.NewTeam(ctx, "foo", &pagerduty.TeamArgs{
//				Name: pulumi.String("Engineering (Seattle)"),
//			})
//			if err != nil {
//				return err
//			}
//			fooRuleset, err := pagerduty.NewRuleset(ctx, "foo", &pagerduty.RulesetArgs{
//				Name: pulumi.String("Primary Ruleset"),
//				Team: &pagerduty.RulesetTeamArgs{
//					Id: foo.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// The pagerduty_ruleset_rule.foo rule defined below
//			// repeats daily from 9:30am - 11:30am using the America/New_York timezone.
//			// Thus it requires a time_static instance to represent 9:30am on an arbitrary date in that timezone.
//			// April 11th, 2019 was EDT (UTC-4) https://www.timeanddate.com/worldclock/converter.html?iso=20190411T133000&p1=179
//			easternTimeAt0930, err := time.NewStatic(ctx, "eastern_time_at_0930", &time.StaticArgs{
//				Rfc3339: pulumi.String("2019-04-11T09:30:00-04:00"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewRulesetRule(ctx, "foo", &pagerduty.RulesetRuleArgs{
//				Ruleset:  fooRuleset.ID(),
//				Position: pulumi.Int(0),
//				Disabled: pulumi.Bool(false),
//				TimeFrame: &pagerduty.RulesetRuleTimeFrameArgs{
//					ScheduledWeeklies: pagerduty.RulesetRuleTimeFrameScheduledWeeklyArray{
//						&pagerduty.RulesetRuleTimeFrameScheduledWeeklyArgs{
//							Weekdays: pulumi.IntArray{
//								pulumi.Int(2),
//								pulumi.Int(4),
//								pulumi.Int(6),
//							},
//							StartTime: easternTimeAt0930.Unix.ApplyT(func(unix int) (float64, error) {
//								return unix * 1000, nil
//							}).(pulumi.Float64Output),
//							Duration: 2 * 60 * 60 * 1000,
//							Timezone: pulumi.String("America/New_York"),
//						},
//					},
//				},
//				Conditions: &pagerduty.RulesetRuleConditionsArgs{
//					Operator: pulumi.String("and"),
//					Subconditions: pagerduty.RulesetRuleConditionsSubconditionArray{
//						&pagerduty.RulesetRuleConditionsSubconditionArgs{
//							Operator: pulumi.String("contains"),
//							Parameters: pagerduty.RulesetRuleConditionsSubconditionParameterArray{
//								&pagerduty.RulesetRuleConditionsSubconditionParameterArgs{
//									Value: pulumi.String("disk space"),
//									Path:  pulumi.String("payload.summary"),
//								},
//							},
//						},
//						&pagerduty.RulesetRuleConditionsSubconditionArgs{
//							Operator: pulumi.String("contains"),
//							Parameters: pagerduty.RulesetRuleConditionsSubconditionParameterArray{
//								&pagerduty.RulesetRuleConditionsSubconditionParameterArgs{
//									Value: pulumi.String("db"),
//									Path:  pulumi.String("payload.source"),
//								},
//							},
//						},
//					},
//				},
//				Variables: pagerduty.RulesetRuleVariableArray{
//					&pagerduty.RulesetRuleVariableArgs{
//						Type: pulumi.String("regex"),
//						Name: pulumi.String("Src"),
//						Parameters: pagerduty.RulesetRuleVariableParameterArray{
//							&pagerduty.RulesetRuleVariableParameterArgs{
//								Value: pulumi.String("(.*)"),
//								Path:  pulumi.String("payload.source"),
//							},
//						},
//					},
//				},
//				Actions: &pagerduty.RulesetRuleActionsArgs{
//					Routes: pagerduty.RulesetRuleActionsRouteArray{
//						&pagerduty.RulesetRuleActionsRouteArgs{
//							Value: pulumi.Any(fooPagerdutyService.Id),
//						},
//					},
//					Severities: pagerduty.RulesetRuleActionsSeverityArray{
//						&pagerduty.RulesetRuleActionsSeverityArgs{
//							Value: pulumi.String("warning"),
//						},
//					},
//					Annotates: pagerduty.RulesetRuleActionsAnnotateArray{
//						&pagerduty.RulesetRuleActionsAnnotateArgs{
//							Value: pulumi.String("From Terraform"),
//						},
//					},
//					Extractions: pagerduty.RulesetRuleActionsExtractionArray{
//						&pagerduty.RulesetRuleActionsExtractionArgs{
//							Target: pulumi.String("dedup_key"),
//							Source: pulumi.String("details.host"),
//							Regex:  pulumi.String("(.*)"),
//						},
//						&pagerduty.RulesetRuleActionsExtractionArgs{
//							Target:   pulumi.String("summary"),
//							Template: pulumi.String("Warning: Disk Space Low on {{Src}}"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewRulesetRule(ctx, "catch_all", &pagerduty.RulesetRuleArgs{
//				Ruleset:  fooRuleset.ID(),
//				Position: pulumi.Int(1),
//				CatchAll: pulumi.Bool(true),
//				Actions: &pagerduty.RulesetRuleActionsArgs{
//					Annotates: pagerduty.RulesetRuleActionsAnnotateArray{
//						&pagerduty.RulesetRuleActionsAnnotateArgs{
//							Value: pulumi.String("From Terraform"),
//						},
//					},
//					Suppresses: pagerduty.RulesetRuleActionsSuppressArray{
//						&pagerduty.RulesetRuleActionsSuppressArgs{
//							Value: pulumi.Bool(true),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Ruleset rules can be imported using the related `ruleset` ID and the `ruleset_rule` ID separated by a dot, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/rulesetRule:RulesetRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
// ```
type RulesetRule struct {
	pulumi.CustomResourceState

	// Actions to apply to an event if the conditions match.
	Actions RulesetRuleActionsPtrOutput `pulumi:"actions"`
	// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
	CatchAll pulumi.BoolPtrOutput `pulumi:"catchAll"`
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
	Conditions RulesetRuleConditionsPtrOutput `pulumi:"conditions"`
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// Position/index of the rule within the ruleset.
	Position pulumi.IntPtrOutput `pulumi:"position"`
	// The ID of the ruleset that the rule belongs to.
	Ruleset pulumi.StringOutput `pulumi:"ruleset"`
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame RulesetRuleTimeFramePtrOutput `pulumi:"timeFrame"`
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables RulesetRuleVariableArrayOutput `pulumi:"variables"`
}

// NewRulesetRule registers a new resource with the given unique name, arguments, and options.
func NewRulesetRule(ctx *pulumi.Context,
	name string, args *RulesetRuleArgs, opts ...pulumi.ResourceOption) (*RulesetRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Ruleset == nil {
		return nil, errors.New("invalid value for required argument 'Ruleset'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RulesetRule
	err := ctx.RegisterResource("pagerduty:index/rulesetRule:RulesetRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRulesetRule gets an existing RulesetRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRulesetRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RulesetRuleState, opts ...pulumi.ResourceOption) (*RulesetRule, error) {
	var resource RulesetRule
	err := ctx.ReadResource("pagerduty:index/rulesetRule:RulesetRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RulesetRule resources.
type rulesetRuleState struct {
	// Actions to apply to an event if the conditions match.
	Actions *RulesetRuleActions `pulumi:"actions"`
	// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
	CatchAll *bool `pulumi:"catchAll"`
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
	Conditions *RulesetRuleConditions `pulumi:"conditions"`
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled *bool `pulumi:"disabled"`
	// Position/index of the rule within the ruleset.
	Position *int `pulumi:"position"`
	// The ID of the ruleset that the rule belongs to.
	Ruleset *string `pulumi:"ruleset"`
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame *RulesetRuleTimeFrame `pulumi:"timeFrame"`
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables []RulesetRuleVariable `pulumi:"variables"`
}

type RulesetRuleState struct {
	// Actions to apply to an event if the conditions match.
	Actions RulesetRuleActionsPtrInput
	// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
	CatchAll pulumi.BoolPtrInput
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
	Conditions RulesetRuleConditionsPtrInput
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrInput
	// Position/index of the rule within the ruleset.
	Position pulumi.IntPtrInput
	// The ID of the ruleset that the rule belongs to.
	Ruleset pulumi.StringPtrInput
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame RulesetRuleTimeFramePtrInput
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables RulesetRuleVariableArrayInput
}

func (RulesetRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesetRuleState)(nil)).Elem()
}

type rulesetRuleArgs struct {
	// Actions to apply to an event if the conditions match.
	Actions *RulesetRuleActions `pulumi:"actions"`
	// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
	CatchAll *bool `pulumi:"catchAll"`
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
	Conditions *RulesetRuleConditions `pulumi:"conditions"`
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled *bool `pulumi:"disabled"`
	// Position/index of the rule within the ruleset.
	Position *int `pulumi:"position"`
	// The ID of the ruleset that the rule belongs to.
	Ruleset string `pulumi:"ruleset"`
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame *RulesetRuleTimeFrame `pulumi:"timeFrame"`
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables []RulesetRuleVariable `pulumi:"variables"`
}

// The set of arguments for constructing a RulesetRule resource.
type RulesetRuleArgs struct {
	// Actions to apply to an event if the conditions match.
	Actions RulesetRuleActionsPtrInput
	// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
	CatchAll pulumi.BoolPtrInput
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
	Conditions RulesetRuleConditionsPtrInput
	// Indicates whether the rule is disabled and would therefore not be evaluated.
	Disabled pulumi.BoolPtrInput
	// Position/index of the rule within the ruleset.
	Position pulumi.IntPtrInput
	// The ID of the ruleset that the rule belongs to.
	Ruleset pulumi.StringInput
	// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
	TimeFrame RulesetRuleTimeFramePtrInput
	// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
	Variables RulesetRuleVariableArrayInput
}

func (RulesetRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesetRuleArgs)(nil)).Elem()
}

type RulesetRuleInput interface {
	pulumi.Input

	ToRulesetRuleOutput() RulesetRuleOutput
	ToRulesetRuleOutputWithContext(ctx context.Context) RulesetRuleOutput
}

func (*RulesetRule) ElementType() reflect.Type {
	return reflect.TypeOf((**RulesetRule)(nil)).Elem()
}

func (i *RulesetRule) ToRulesetRuleOutput() RulesetRuleOutput {
	return i.ToRulesetRuleOutputWithContext(context.Background())
}

func (i *RulesetRule) ToRulesetRuleOutputWithContext(ctx context.Context) RulesetRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetRuleOutput)
}

// RulesetRuleArrayInput is an input type that accepts RulesetRuleArray and RulesetRuleArrayOutput values.
// You can construct a concrete instance of `RulesetRuleArrayInput` via:
//
//	RulesetRuleArray{ RulesetRuleArgs{...} }
type RulesetRuleArrayInput interface {
	pulumi.Input

	ToRulesetRuleArrayOutput() RulesetRuleArrayOutput
	ToRulesetRuleArrayOutputWithContext(context.Context) RulesetRuleArrayOutput
}

type RulesetRuleArray []RulesetRuleInput

func (RulesetRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RulesetRule)(nil)).Elem()
}

func (i RulesetRuleArray) ToRulesetRuleArrayOutput() RulesetRuleArrayOutput {
	return i.ToRulesetRuleArrayOutputWithContext(context.Background())
}

func (i RulesetRuleArray) ToRulesetRuleArrayOutputWithContext(ctx context.Context) RulesetRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetRuleArrayOutput)
}

// RulesetRuleMapInput is an input type that accepts RulesetRuleMap and RulesetRuleMapOutput values.
// You can construct a concrete instance of `RulesetRuleMapInput` via:
//
//	RulesetRuleMap{ "key": RulesetRuleArgs{...} }
type RulesetRuleMapInput interface {
	pulumi.Input

	ToRulesetRuleMapOutput() RulesetRuleMapOutput
	ToRulesetRuleMapOutputWithContext(context.Context) RulesetRuleMapOutput
}

type RulesetRuleMap map[string]RulesetRuleInput

func (RulesetRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RulesetRule)(nil)).Elem()
}

func (i RulesetRuleMap) ToRulesetRuleMapOutput() RulesetRuleMapOutput {
	return i.ToRulesetRuleMapOutputWithContext(context.Background())
}

func (i RulesetRuleMap) ToRulesetRuleMapOutputWithContext(ctx context.Context) RulesetRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetRuleMapOutput)
}

type RulesetRuleOutput struct{ *pulumi.OutputState }

func (RulesetRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RulesetRule)(nil)).Elem()
}

func (o RulesetRuleOutput) ToRulesetRuleOutput() RulesetRuleOutput {
	return o
}

func (o RulesetRuleOutput) ToRulesetRuleOutputWithContext(ctx context.Context) RulesetRuleOutput {
	return o
}

// Actions to apply to an event if the conditions match.
func (o RulesetRuleOutput) Actions() RulesetRuleActionsPtrOutput {
	return o.ApplyT(func(v *RulesetRule) RulesetRuleActionsPtrOutput { return v.Actions }).(RulesetRuleActionsPtrOutput)
}

// Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
func (o RulesetRuleOutput) CatchAll() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RulesetRule) pulumi.BoolPtrOutput { return v.CatchAll }).(pulumi.BoolPtrOutput)
}

// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
func (o RulesetRuleOutput) Conditions() RulesetRuleConditionsPtrOutput {
	return o.ApplyT(func(v *RulesetRule) RulesetRuleConditionsPtrOutput { return v.Conditions }).(RulesetRuleConditionsPtrOutput)
}

// Indicates whether the rule is disabled and would therefore not be evaluated.
func (o RulesetRuleOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RulesetRule) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// Position/index of the rule within the ruleset.
func (o RulesetRuleOutput) Position() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RulesetRule) pulumi.IntPtrOutput { return v.Position }).(pulumi.IntPtrOutput)
}

// The ID of the ruleset that the rule belongs to.
func (o RulesetRuleOutput) Ruleset() pulumi.StringOutput {
	return o.ApplyT(func(v *RulesetRule) pulumi.StringOutput { return v.Ruleset }).(pulumi.StringOutput)
}

// Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
func (o RulesetRuleOutput) TimeFrame() RulesetRuleTimeFramePtrOutput {
	return o.ApplyT(func(v *RulesetRule) RulesetRuleTimeFramePtrOutput { return v.TimeFrame }).(RulesetRuleTimeFramePtrOutput)
}

// Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
func (o RulesetRuleOutput) Variables() RulesetRuleVariableArrayOutput {
	return o.ApplyT(func(v *RulesetRule) RulesetRuleVariableArrayOutput { return v.Variables }).(RulesetRuleVariableArrayOutput)
}

type RulesetRuleArrayOutput struct{ *pulumi.OutputState }

func (RulesetRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RulesetRule)(nil)).Elem()
}

func (o RulesetRuleArrayOutput) ToRulesetRuleArrayOutput() RulesetRuleArrayOutput {
	return o
}

func (o RulesetRuleArrayOutput) ToRulesetRuleArrayOutputWithContext(ctx context.Context) RulesetRuleArrayOutput {
	return o
}

func (o RulesetRuleArrayOutput) Index(i pulumi.IntInput) RulesetRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RulesetRule {
		return vs[0].([]*RulesetRule)[vs[1].(int)]
	}).(RulesetRuleOutput)
}

type RulesetRuleMapOutput struct{ *pulumi.OutputState }

func (RulesetRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RulesetRule)(nil)).Elem()
}

func (o RulesetRuleMapOutput) ToRulesetRuleMapOutput() RulesetRuleMapOutput {
	return o
}

func (o RulesetRuleMapOutput) ToRulesetRuleMapOutputWithContext(ctx context.Context) RulesetRuleMapOutput {
	return o
}

func (o RulesetRuleMapOutput) MapIndex(k pulumi.StringInput) RulesetRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RulesetRule {
		return vs[0].(map[string]*RulesetRule)[vs[1].(string)]
	}).(RulesetRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetRuleInput)(nil)).Elem(), &RulesetRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetRuleArrayInput)(nil)).Elem(), RulesetRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetRuleMapInput)(nil)).Elem(), RulesetRuleMap{})
	pulumi.RegisterOutputType(RulesetRuleOutput{})
	pulumi.RegisterOutputType(RulesetRuleArrayOutput{})
	pulumi.RegisterOutputType(RulesetRuleMapOutput{})
}
