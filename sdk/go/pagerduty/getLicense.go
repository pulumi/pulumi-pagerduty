// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to use a single purchased [license](https://developer.pagerduty.com/api-reference/4c10cb38f7381-list-licenses) to manage PagerDuty user resources. After applying changes to users' licenses, the `currentValue` and `allocationsAvailable` attributes of licenses will change.
//
// > It is preferred to set the `name` and `description` to their exact values or to set the `id`. However, this will require updating your configuration if the accounts products ever change. To avoid errors when account products change, you may set the `name` of a license to a valid substring such as `"Full User"` or `"Stakeholder"`.
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
//			_ := []string{
//				"owner",
//			}
//			fullUser, err := pagerduty.GetLicense(ctx, &pagerduty.GetLicenseArgs{
//				Name:        pulumi.StringRef("Full User"),
//				Description: pulumi.StringRef(""),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewUser(ctx, "example", &pagerduty.UserArgs{
//				Name:    pulumi.String("Earline Greenholt"),
//				Email:   pulumi.String("125.greenholt.earline@graham.name"),
//				License: pulumi.String(fullUser.Id),
//				Role:    pulumi.String("user"),
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
func GetLicense(ctx *pulumi.Context, args *GetLicenseArgs, opts ...pulumi.InvokeOption) (*GetLicenseResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLicenseResult
	err := ctx.Invoke("pagerduty:index/getLicense:getLicense", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLicense.
type GetLicenseArgs struct {
	// Available allocations to assign to users
	AllocationsAvailable *int `pulumi:"allocationsAvailable"`
	// The number of allocations already assigned to users
	CurrentValue *int `pulumi:"currentValue"`
	// Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
	Description *string `pulumi:"description"`
	HtmlUrl     *string `pulumi:"htmlUrl"`
	// Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
	Id *string `pulumi:"id"`
	// Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
	Name *string `pulumi:"name"`
	// The role group for the license that determines the available `validRoles`
	RoleGroup *string `pulumi:"roleGroup"`
	Self      *string `pulumi:"self"`
	// Summary of the license
	Summary *string `pulumi:"summary"`
	Type    *string `pulumi:"type"`
	// List of allowed roles that may be assigned to a user with this license
	ValidRoles []string `pulumi:"validRoles"`
}

// A collection of values returned by getLicense.
type GetLicenseResult struct {
	// Available allocations to assign to users
	AllocationsAvailable int `pulumi:"allocationsAvailable"`
	// The number of allocations already assigned to users
	CurrentValue int    `pulumi:"currentValue"`
	Description  string `pulumi:"description"`
	HtmlUrl      string `pulumi:"htmlUrl"`
	Id           string `pulumi:"id"`
	Name         string `pulumi:"name"`
	// The role group for the license that determines the available `validRoles`
	RoleGroup string `pulumi:"roleGroup"`
	Self      string `pulumi:"self"`
	// Summary of the license
	Summary string `pulumi:"summary"`
	Type    string `pulumi:"type"`
	// List of allowed roles that may be assigned to a user with this license
	ValidRoles []string `pulumi:"validRoles"`
}

func GetLicenseOutput(ctx *pulumi.Context, args GetLicenseOutputArgs, opts ...pulumi.InvokeOption) GetLicenseResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLicenseResult, error) {
			args := v.(GetLicenseArgs)
			r, err := GetLicense(ctx, &args, opts...)
			var s GetLicenseResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetLicenseResultOutput)
}

// A collection of arguments for invoking getLicense.
type GetLicenseOutputArgs struct {
	// Available allocations to assign to users
	AllocationsAvailable pulumi.IntPtrInput `pulumi:"allocationsAvailable"`
	// The number of allocations already assigned to users
	CurrentValue pulumi.IntPtrInput `pulumi:"currentValue"`
	// Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
	Description pulumi.StringPtrInput `pulumi:"description"`
	HtmlUrl     pulumi.StringPtrInput `pulumi:"htmlUrl"`
	// Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The role group for the license that determines the available `validRoles`
	RoleGroup pulumi.StringPtrInput `pulumi:"roleGroup"`
	Self      pulumi.StringPtrInput `pulumi:"self"`
	// Summary of the license
	Summary pulumi.StringPtrInput `pulumi:"summary"`
	Type    pulumi.StringPtrInput `pulumi:"type"`
	// List of allowed roles that may be assigned to a user with this license
	ValidRoles pulumi.StringArrayInput `pulumi:"validRoles"`
}

func (GetLicenseOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLicenseArgs)(nil)).Elem()
}

// A collection of values returned by getLicense.
type GetLicenseResultOutput struct{ *pulumi.OutputState }

func (GetLicenseResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLicenseResult)(nil)).Elem()
}

func (o GetLicenseResultOutput) ToGetLicenseResultOutput() GetLicenseResultOutput {
	return o
}

func (o GetLicenseResultOutput) ToGetLicenseResultOutputWithContext(ctx context.Context) GetLicenseResultOutput {
	return o
}

// Available allocations to assign to users
func (o GetLicenseResultOutput) AllocationsAvailable() pulumi.IntOutput {
	return o.ApplyT(func(v GetLicenseResult) int { return v.AllocationsAvailable }).(pulumi.IntOutput)
}

// The number of allocations already assigned to users
func (o GetLicenseResultOutput) CurrentValue() pulumi.IntOutput {
	return o.ApplyT(func(v GetLicenseResult) int { return v.CurrentValue }).(pulumi.IntOutput)
}

func (o GetLicenseResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicenseResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetLicenseResultOutput) HtmlUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicenseResult) string { return v.HtmlUrl }).(pulumi.StringOutput)
}

func (o GetLicenseResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicenseResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLicenseResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicenseResult) string { return v.Name }).(pulumi.StringOutput)
}

// The role group for the license that determines the available `validRoles`
func (o GetLicenseResultOutput) RoleGroup() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicenseResult) string { return v.RoleGroup }).(pulumi.StringOutput)
}

func (o GetLicenseResultOutput) Self() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicenseResult) string { return v.Self }).(pulumi.StringOutput)
}

// Summary of the license
func (o GetLicenseResultOutput) Summary() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicenseResult) string { return v.Summary }).(pulumi.StringOutput)
}

func (o GetLicenseResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicenseResult) string { return v.Type }).(pulumi.StringOutput)
}

// List of allowed roles that may be assigned to a user with this license
func (o GetLicenseResultOutput) ValidRoles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLicenseResult) []string { return v.ValidRoles }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLicenseResultOutput{})
}
