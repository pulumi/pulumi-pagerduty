// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [user](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users) that you can use for other PagerDuty resources.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/v2/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
// 		_, err = pagerduty.NewEscalationPolicy(ctx, "foo", &pagerduty.EscalationPolicyArgs{
// 			NumLoops: pulumi.Int(2),
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
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	var rv LookupUserResult
	err := ctx.Invoke("pagerduty:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// The email to use to find a user in the PagerDuty API.
	Email string `pulumi:"email"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	Email string `pulumi:"email"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The short name of the found user.
	Name string `pulumi:"name"`
}
