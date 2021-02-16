// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to get information about a specific [priority](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1priorities/get) that you can use for other PagerDuty resources.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := pagerduty.GetPriority(ctx, &pagerduty.GetPriorityArgs{
// 			Name: "P1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		fooRuleset, err := pagerduty.NewRuleset(ctx, "fooRuleset", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewRulesetRule(ctx, "fooRulesetRule", &pagerduty.RulesetRuleArgs{
// 			Ruleset:  fooRuleset.ID(),
// 			Position: pulumi.Int(0),
// 			Disabled: pulumi.Bool(false),
// 			Conditions: &pagerduty.RulesetRuleConditionsArgs{
// 				Operator: pulumi.String("and"),
// 				Subconditions: pagerduty.RulesetRuleConditionsSubconditionArray{
// 					&pagerduty.RulesetRuleConditionsSubconditionArgs{
// 						Operator: pulumi.String("contains"),
// 						Parameters: pagerduty.RulesetRuleConditionsSubconditionParameterArray{
// 							&pagerduty.RulesetRuleConditionsSubconditionParameterArgs{
// 								Value: pulumi.String("disk space"),
// 								Path:  pulumi.String("payload.summary"),
// 							},
// 						},
// 					},
// 					&pagerduty.RulesetRuleConditionsSubconditionArgs{
// 						Operator: pulumi.String("contains"),
// 						Parameters: pagerduty.RulesetRuleConditionsSubconditionParameterArray{
// 							&pagerduty.RulesetRuleConditionsSubconditionParameterArgs{
// 								Value: pulumi.String("db"),
// 								Path:  pulumi.String("payload.source"),
// 							},
// 						},
// 					},
// 				},
// 			},
// 			Actions: &pagerduty.RulesetRuleActionsArgs{
// 				Routes: pagerduty.RulesetRuleActionsRouteArray{
// 					&pagerduty.RulesetRuleActionsRouteArgs{
// 						Value: pulumi.String("P5DTL0K"),
// 					},
// 				},
// 				Priorities: pagerduty.RulesetRuleActionsPriorityArray{
// 					&pagerduty.RulesetRuleActionsPriorityArgs{
// 						Value: pulumi.Any(pagerduty_priority.P1.Id),
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetPriority(ctx *pulumi.Context, args *GetPriorityArgs, opts ...pulumi.InvokeOption) (*GetPriorityResult, error) {
	var rv GetPriorityResult
	err := ctx.Invoke("pagerduty:index/getPriority:getPriority", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPriority.
type GetPriorityArgs struct {
	// The name of the priority to find in the PagerDuty API.
	Name string `pulumi:"name"`
}

// A collection of values returned by getPriority.
type GetPriorityResult struct {
	// A description of the found priority.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the found priority.
	Name string `pulumi:"name"`
}
