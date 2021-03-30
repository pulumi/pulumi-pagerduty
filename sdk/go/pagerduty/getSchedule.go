// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to get information about a specific [schedule](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Schedules/get_schedules) that you can use for other PagerDuty resources.
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
// 		test, err := pagerduty.LookupSchedule(ctx, &pagerduty.LookupScheduleArgs{
// 			Name: "Daily Engineering Rotation",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewEscalationPolicy(ctx, "foo", &pagerduty.EscalationPolicyArgs{
// 			NumLoops: pulumi.Int(2),
// 			Rules: pagerduty.EscalationPolicyRuleArray{
// 				&pagerduty.EscalationPolicyRuleArgs{
// 					EscalationDelayInMinutes: pulumi.Int(10),
// 					Targets: pagerduty.EscalationPolicyRuleTargetArray{
// 						&pagerduty.EscalationPolicyRuleTargetArgs{
// 							Type: pulumi.String("schedule"),
// 							Id:   pulumi.String(test.Id),
// 						},
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
func LookupSchedule(ctx *pulumi.Context, args *LookupScheduleArgs, opts ...pulumi.InvokeOption) (*LookupScheduleResult, error) {
	var rv LookupScheduleResult
	err := ctx.Invoke("pagerduty:index/getSchedule:getSchedule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchedule.
type LookupScheduleArgs struct {
	// The name to use to find a schedule in the PagerDuty API.
	Name string `pulumi:"name"`
}

// A collection of values returned by getSchedule.
type LookupScheduleResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The short name of the found schedule.
	Name string `pulumi:"name"`
}
