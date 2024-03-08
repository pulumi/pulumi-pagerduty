// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [team's members][1].
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			devops, err := pagerduty.LookupTeam(ctx, &pagerduty.LookupTeamArgs{
//				Name: "devops",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.GetTeamMembers(ctx, &pagerduty.GetTeamMembersArgs{
//				TeamId: devops.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetTeamMembers(ctx *pulumi.Context, args *GetTeamMembersArgs, opts ...pulumi.InvokeOption) (*GetTeamMembersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTeamMembersResult
	err := ctx.Invoke("pagerduty:index/getTeamMembers:getTeamMembers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTeamMembers.
type GetTeamMembersArgs struct {
	// The ID of the team to find in the PagerDuty API.
	TeamId string `pulumi:"teamId"`
}

// A collection of values returned by getTeamMembers.
type GetTeamMembersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The users of the found team.
	Members []GetTeamMembersMember `pulumi:"members"`
	TeamId  string                 `pulumi:"teamId"`
}

func GetTeamMembersOutput(ctx *pulumi.Context, args GetTeamMembersOutputArgs, opts ...pulumi.InvokeOption) GetTeamMembersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTeamMembersResult, error) {
			args := v.(GetTeamMembersArgs)
			r, err := GetTeamMembers(ctx, &args, opts...)
			var s GetTeamMembersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTeamMembersResultOutput)
}

// A collection of arguments for invoking getTeamMembers.
type GetTeamMembersOutputArgs struct {
	// The ID of the team to find in the PagerDuty API.
	TeamId pulumi.StringInput `pulumi:"teamId"`
}

func (GetTeamMembersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTeamMembersArgs)(nil)).Elem()
}

// A collection of values returned by getTeamMembers.
type GetTeamMembersResultOutput struct{ *pulumi.OutputState }

func (GetTeamMembersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTeamMembersResult)(nil)).Elem()
}

func (o GetTeamMembersResultOutput) ToGetTeamMembersResultOutput() GetTeamMembersResultOutput {
	return o
}

func (o GetTeamMembersResultOutput) ToGetTeamMembersResultOutputWithContext(ctx context.Context) GetTeamMembersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTeamMembersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTeamMembersResult) string { return v.Id }).(pulumi.StringOutput)
}

// The users of the found team.
func (o GetTeamMembersResultOutput) Members() GetTeamMembersMemberArrayOutput {
	return o.ApplyT(func(v GetTeamMembersResult) []GetTeamMembersMember { return v.Members }).(GetTeamMembersMemberArrayOutput)
}

func (o GetTeamMembersResultOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTeamMembersResult) string { return v.TeamId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTeamMembersResultOutput{})
}
