// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to get information about a specific [team](https://v1.developer.pagerduty.com/documentation/rest/teams/list) that you can use for other PagerDuty resources.
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
// 		me, err := pagerduty.LookupUser(ctx, &pagerduty.LookupUserArgs{
// 			Email: "me@example.com",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		devops, err := pagerduty.LookupTeam(ctx, &pagerduty.LookupTeamArgs{
// 			Name: "devops",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewEscalationPolicy(ctx, "foo", &pagerduty.EscalationPolicyArgs{
// 			NumLoops: pulumi.Int(2),
// 			Teams: pulumi.StringArray{
// 				pulumi.String(devops.Id),
// 			},
// 			Rules: pagerduty.EscalationPolicyRuleArray{
// 				&pagerduty.EscalationPolicyRuleArgs{
// 					EscalationDelayInMinutes: pulumi.Int(10),
// 					Targets: pagerduty.EscalationPolicyRuleTargetArray{
// 						&pagerduty.EscalationPolicyRuleTargetArgs{
// 							Type: pulumi.String("user"),
// 							Id:   pulumi.String(me.Id),
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
func LookupTeam(ctx *pulumi.Context, args *LookupTeamArgs, opts ...pulumi.InvokeOption) (*LookupTeamResult, error) {
	var rv LookupTeamResult
	err := ctx.Invoke("pagerduty:index/getTeam:getTeam", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTeam.
type LookupTeamArgs struct {
	// The name of the team to find in the PagerDuty API.
	Name string `pulumi:"name"`
	// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
	Parent *string `pulumi:"parent"`
}

// A collection of values returned by getTeam.
type LookupTeamResult struct {
	// A description of the found team.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the found team.
	Name string `pulumi:"name"`
	// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
	Parent *string `pulumi:"parent"`
}
