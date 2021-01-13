// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// *NOTE: The `EventRule` resource has been deprecated in favor the the Ruleset and RulesetRule resources. Please use the `ruleset` based resources for working with Event Rules.*
//
// An [event rule](https://v2.developer.pagerduty.com/docs/global-event-rules-api) determines what happens to an event that is sent to PagerDuty by monitoring tools and other integrations.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"encoding/json"
//
// 	"github.com/pulumi/pulumi-pagerduty/sdk/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		tmpJSON0, err := json.Marshal([][]string{
// 			[]string{
// 				"route",
// 				"P5DTL0K",
// 			},
// 			[]string{
// 				"severity",
// 				"warning",
// 			},
// 			[]string{
// 				"annotate",
// 				"2 Managed by terraform",
// 			},
// 			[]string{
// 				"priority",
// 				"PL451DT",
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json0 := string(tmpJSON0)
// 		tmpJSON1, err := json.Marshal([]interface{}{
// 			"and",
// 			[]interface{}{
// 				"contains",
// 				[]string{
// 					"path",
// 					"payload",
// 					"source",
// 				},
// 				"website",
// 			},
// 			[]interface{}{
// 				"contains",
// 				[]string{
// 					"path",
// 					"headers",
// 					"from",
// 					"0",
// 					"address",
// 				},
// 				"homer",
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json1 := string(tmpJSON1)
// 		tmpJSON2, err := json.Marshal([][]interface{}{
// 			[]interface{}{
// 				"scheduled-weekly",
// 				1565392127032,
// 				3600000,
// 				"America/Los_Angeles",
// 				[]float64{
// 					1,
// 					2,
// 					3,
// 					5,
// 					7,
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json2 := string(tmpJSON2)
// 		_, err := pagerduty.NewEventRule(ctx, "second", &pagerduty.EventRuleArgs{
// 			ActionJson:            pulumi.String(json0),
// 			ConditionJson:         pulumi.String(json1),
// 			AdvancedConditionJson: pulumi.String(json2),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		tmpJSON3, err := json.Marshal([][]string{
// 			[]string{
// 				"route",
// 				"P5DTL0K",
// 			},
// 			[]string{
// 				"severity",
// 				"warning",
// 			},
// 			[]string{
// 				"annotate",
// 				"3 Managed by terraform",
// 			},
// 			[]string{
// 				"priority",
// 				"PL451DT",
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json3 := string(tmpJSON3)
// 		tmpJSON4, err := json.Marshal([]interface{}{
// 			"and",
// 			[]interface{}{
// 				"contains",
// 				[]string{
// 					"path",
// 					"payload",
// 					"source",
// 				},
// 				"website",
// 			},
// 			[]interface{}{
// 				"contains",
// 				[]string{
// 					"path",
// 					"headers",
// 					"from",
// 					"0",
// 					"address",
// 				},
// 				"homer",
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json4 := string(tmpJSON4)
// 		_, err = pagerduty.NewEventRule(ctx, "third", &pagerduty.EventRuleArgs{
// 			ActionJson:    pulumi.String(json3),
// 			ConditionJson: pulumi.String(json4),
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			pagerduty_event_rule.Two,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Event rules can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/eventRule:EventRule main 19acac92-027a-4ea0-b06c-bbf516519601
// ```
type EventRule struct {
	pulumi.CustomResourceState

	// A list of one or more actions for each rule. Each action within the list is itself a list.
	ActionJson pulumi.StringOutput `pulumi:"actionJson"`
	// Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://v2.developer.pagerduty.com/docs/global-event-rules-api#section-advanced-condition) in the PagerDuty API documentation.
	AdvancedConditionJson pulumi.StringPtrOutput `pulumi:"advancedConditionJson"`
	// A boolean that indicates whether the rule is a catch all for the account. This field is read-only through the PagerDuty API.
	CatchAll pulumi.BoolOutput `pulumi:"catchAll"`
	// Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
	ConditionJson pulumi.StringOutput `pulumi:"conditionJson"`
}

// NewEventRule registers a new resource with the given unique name, arguments, and options.
func NewEventRule(ctx *pulumi.Context,
	name string, args *EventRuleArgs, opts ...pulumi.ResourceOption) (*EventRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionJson == nil {
		return nil, errors.New("invalid value for required argument 'ActionJson'")
	}
	if args.ConditionJson == nil {
		return nil, errors.New("invalid value for required argument 'ConditionJson'")
	}
	var resource EventRule
	err := ctx.RegisterResource("pagerduty:index/eventRule:EventRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventRule gets an existing EventRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventRuleState, opts ...pulumi.ResourceOption) (*EventRule, error) {
	var resource EventRule
	err := ctx.ReadResource("pagerduty:index/eventRule:EventRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventRule resources.
type eventRuleState struct {
	// A list of one or more actions for each rule. Each action within the list is itself a list.
	ActionJson *string `pulumi:"actionJson"`
	// Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://v2.developer.pagerduty.com/docs/global-event-rules-api#section-advanced-condition) in the PagerDuty API documentation.
	AdvancedConditionJson *string `pulumi:"advancedConditionJson"`
	// A boolean that indicates whether the rule is a catch all for the account. This field is read-only through the PagerDuty API.
	CatchAll *bool `pulumi:"catchAll"`
	// Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
	ConditionJson *string `pulumi:"conditionJson"`
}

type EventRuleState struct {
	// A list of one or more actions for each rule. Each action within the list is itself a list.
	ActionJson pulumi.StringPtrInput
	// Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://v2.developer.pagerduty.com/docs/global-event-rules-api#section-advanced-condition) in the PagerDuty API documentation.
	AdvancedConditionJson pulumi.StringPtrInput
	// A boolean that indicates whether the rule is a catch all for the account. This field is read-only through the PagerDuty API.
	CatchAll pulumi.BoolPtrInput
	// Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
	ConditionJson pulumi.StringPtrInput
}

func (EventRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventRuleState)(nil)).Elem()
}

type eventRuleArgs struct {
	// A list of one or more actions for each rule. Each action within the list is itself a list.
	ActionJson string `pulumi:"actionJson"`
	// Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://v2.developer.pagerduty.com/docs/global-event-rules-api#section-advanced-condition) in the PagerDuty API documentation.
	AdvancedConditionJson *string `pulumi:"advancedConditionJson"`
	// Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
	ConditionJson string `pulumi:"conditionJson"`
}

// The set of arguments for constructing a EventRule resource.
type EventRuleArgs struct {
	// A list of one or more actions for each rule. Each action within the list is itself a list.
	ActionJson pulumi.StringInput
	// Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://v2.developer.pagerduty.com/docs/global-event-rules-api#section-advanced-condition) in the PagerDuty API documentation.
	AdvancedConditionJson pulumi.StringPtrInput
	// Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
	ConditionJson pulumi.StringInput
}

func (EventRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventRuleArgs)(nil)).Elem()
}

type EventRuleInput interface {
	pulumi.Input

	ToEventRuleOutput() EventRuleOutput
	ToEventRuleOutputWithContext(ctx context.Context) EventRuleOutput
}

func (EventRule) ElementType() reflect.Type {
	return reflect.TypeOf((*EventRule)(nil)).Elem()
}

func (i EventRule) ToEventRuleOutput() EventRuleOutput {
	return i.ToEventRuleOutputWithContext(context.Background())
}

func (i EventRule) ToEventRuleOutputWithContext(ctx context.Context) EventRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventRuleOutput)
}

type EventRuleOutput struct {
	*pulumi.OutputState
}

func (EventRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EventRuleOutput)(nil)).Elem()
}

func (o EventRuleOutput) ToEventRuleOutput() EventRuleOutput {
	return o
}

func (o EventRuleOutput) ToEventRuleOutputWithContext(ctx context.Context) EventRuleOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(EventRuleOutput{})
}
