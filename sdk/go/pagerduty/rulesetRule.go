// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An [event rule](https://support.pagerduty.com/docs/rulesets#section-create-event-rules) allows you to set actions that should be taken on events that meet your designated rule criteria.
//
// ## Import
//
// Ruleset rules can be imported using using the related `ruleset` id and the `ruleset_rule` id separated by a dot, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/rulesetRule:RulesetRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
// ```
type RulesetRule struct {
	pulumi.CustomResourceState

	// Actions to apply to an event if the conditions match.
	Actions RulesetRuleActionsPtrOutput `pulumi:"actions"`
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
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
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
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
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
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
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
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
	// Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
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
	return reflect.TypeOf((*RulesetRule)(nil))
}

func (i *RulesetRule) ToRulesetRuleOutput() RulesetRuleOutput {
	return i.ToRulesetRuleOutputWithContext(context.Background())
}

func (i *RulesetRule) ToRulesetRuleOutputWithContext(ctx context.Context) RulesetRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetRuleOutput)
}

func (i *RulesetRule) ToRulesetRulePtrOutput() RulesetRulePtrOutput {
	return i.ToRulesetRulePtrOutputWithContext(context.Background())
}

func (i *RulesetRule) ToRulesetRulePtrOutputWithContext(ctx context.Context) RulesetRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetRulePtrOutput)
}

type RulesetRulePtrInput interface {
	pulumi.Input

	ToRulesetRulePtrOutput() RulesetRulePtrOutput
	ToRulesetRulePtrOutputWithContext(ctx context.Context) RulesetRulePtrOutput
}

type rulesetRulePtrType RulesetRuleArgs

func (*rulesetRulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RulesetRule)(nil))
}

func (i *rulesetRulePtrType) ToRulesetRulePtrOutput() RulesetRulePtrOutput {
	return i.ToRulesetRulePtrOutputWithContext(context.Background())
}

func (i *rulesetRulePtrType) ToRulesetRulePtrOutputWithContext(ctx context.Context) RulesetRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetRulePtrOutput)
}

// RulesetRuleArrayInput is an input type that accepts RulesetRuleArray and RulesetRuleArrayOutput values.
// You can construct a concrete instance of `RulesetRuleArrayInput` via:
//
//          RulesetRuleArray{ RulesetRuleArgs{...} }
type RulesetRuleArrayInput interface {
	pulumi.Input

	ToRulesetRuleArrayOutput() RulesetRuleArrayOutput
	ToRulesetRuleArrayOutputWithContext(context.Context) RulesetRuleArrayOutput
}

type RulesetRuleArray []RulesetRuleInput

func (RulesetRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*RulesetRule)(nil))
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
//          RulesetRuleMap{ "key": RulesetRuleArgs{...} }
type RulesetRuleMapInput interface {
	pulumi.Input

	ToRulesetRuleMapOutput() RulesetRuleMapOutput
	ToRulesetRuleMapOutputWithContext(context.Context) RulesetRuleMapOutput
}

type RulesetRuleMap map[string]RulesetRuleInput

func (RulesetRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*RulesetRule)(nil))
}

func (i RulesetRuleMap) ToRulesetRuleMapOutput() RulesetRuleMapOutput {
	return i.ToRulesetRuleMapOutputWithContext(context.Background())
}

func (i RulesetRuleMap) ToRulesetRuleMapOutputWithContext(ctx context.Context) RulesetRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetRuleMapOutput)
}

type RulesetRuleOutput struct {
	*pulumi.OutputState
}

func (RulesetRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RulesetRule)(nil))
}

func (o RulesetRuleOutput) ToRulesetRuleOutput() RulesetRuleOutput {
	return o
}

func (o RulesetRuleOutput) ToRulesetRuleOutputWithContext(ctx context.Context) RulesetRuleOutput {
	return o
}

func (o RulesetRuleOutput) ToRulesetRulePtrOutput() RulesetRulePtrOutput {
	return o.ToRulesetRulePtrOutputWithContext(context.Background())
}

func (o RulesetRuleOutput) ToRulesetRulePtrOutputWithContext(ctx context.Context) RulesetRulePtrOutput {
	return o.ApplyT(func(v RulesetRule) *RulesetRule {
		return &v
	}).(RulesetRulePtrOutput)
}

type RulesetRulePtrOutput struct {
	*pulumi.OutputState
}

func (RulesetRulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RulesetRule)(nil))
}

func (o RulesetRulePtrOutput) ToRulesetRulePtrOutput() RulesetRulePtrOutput {
	return o
}

func (o RulesetRulePtrOutput) ToRulesetRulePtrOutputWithContext(ctx context.Context) RulesetRulePtrOutput {
	return o
}

type RulesetRuleArrayOutput struct{ *pulumi.OutputState }

func (RulesetRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]RulesetRule)(nil))
}

func (o RulesetRuleArrayOutput) ToRulesetRuleArrayOutput() RulesetRuleArrayOutput {
	return o
}

func (o RulesetRuleArrayOutput) ToRulesetRuleArrayOutputWithContext(ctx context.Context) RulesetRuleArrayOutput {
	return o
}

func (o RulesetRuleArrayOutput) Index(i pulumi.IntInput) RulesetRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) RulesetRule {
		return vs[0].([]RulesetRule)[vs[1].(int)]
	}).(RulesetRuleOutput)
}

type RulesetRuleMapOutput struct{ *pulumi.OutputState }

func (RulesetRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]RulesetRule)(nil))
}

func (o RulesetRuleMapOutput) ToRulesetRuleMapOutput() RulesetRuleMapOutput {
	return o
}

func (o RulesetRuleMapOutput) ToRulesetRuleMapOutputWithContext(ctx context.Context) RulesetRuleMapOutput {
	return o
}

func (o RulesetRuleMapOutput) MapIndex(k pulumi.StringInput) RulesetRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) RulesetRule {
		return vs[0].(map[string]RulesetRule)[vs[1].(string)]
	}).(RulesetRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(RulesetRuleOutput{})
	pulumi.RegisterOutputType(RulesetRulePtrOutput{})
	pulumi.RegisterOutputType(RulesetRuleArrayOutput{})
	pulumi.RegisterOutputType(RulesetRuleMapOutput{})
}
