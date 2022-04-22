// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [team](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1teams/get) that you can use for other PagerDuty resources.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		me, err := pagerduty.LookupUser(ctx, &GetUserArgs{
// 			Email: "me@example.com",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		devops, err := pagerduty.LookupTeam(ctx, &GetTeamArgs{
// 			Name: "devops",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewEscalationPolicy(ctx, "foo", &pagerduty.EscalationPolicyArgs{
// 			NumLoops: pulumi.Int(2),
// 			Teams: pulumi.String{
// 				devops.Id,
// 			},
// 			Rules: EscalationPolicyRuleArray{
// 				&EscalationPolicyRuleArgs{
// 					EscalationDelayInMinutes: pulumi.Int(10),
// 					Targets: EscalationPolicyRuleTargetArray{
// 						&EscalationPolicyRuleTargetArgs{
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

func LookupTeamOutput(ctx *pulumi.Context, args LookupTeamOutputArgs, opts ...pulumi.InvokeOption) LookupTeamResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTeamResult, error) {
			args := v.(LookupTeamArgs)
			r, err := LookupTeam(ctx, &args, opts...)
			var s LookupTeamResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTeamResultOutput)
}

// A collection of arguments for invoking getTeam.
type LookupTeamOutputArgs struct {
	// The name of the team to find in the PagerDuty API.
	Name pulumi.StringInput `pulumi:"name"`
	// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
	Parent pulumi.StringPtrInput `pulumi:"parent"`
}

func (LookupTeamOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTeamArgs)(nil)).Elem()
}

// A collection of values returned by getTeam.
type LookupTeamResultOutput struct{ *pulumi.OutputState }

func (LookupTeamResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTeamResult)(nil)).Elem()
}

func (o LookupTeamResultOutput) ToLookupTeamResultOutput() LookupTeamResultOutput {
	return o
}

func (o LookupTeamResultOutput) ToLookupTeamResultOutputWithContext(ctx context.Context) LookupTeamResultOutput {
	return o
}

// A description of the found team.
func (o LookupTeamResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTeamResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the found team.
func (o LookupTeamResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTeamResult) string { return v.Name }).(pulumi.StringOutput)
}

// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
func (o LookupTeamResultOutput) Parent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTeamResult) *string { return v.Parent }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTeamResultOutput{})
}
