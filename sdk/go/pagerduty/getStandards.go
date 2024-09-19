// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about the [standards](https://developer.pagerduty.com/api-reference/dbed9a0ff9355-list-standards) applicable to
// the PagerDuty account.
//
// ## Example Usage
//
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
//			_, err := pagerduty.GetStandards(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetStandards(ctx *pulumi.Context, args *GetStandardsArgs, opts ...pulumi.InvokeOption) (*GetStandardsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStandardsResult
	err := ctx.Invoke("pagerduty:index/getStandards:getStandards", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStandards.
type GetStandardsArgs struct {
	// Filter by `resourceType` the received standards. Allowed values are `technicalService`.
	ResourceType *string `pulumi:"resourceType"`
}

// A collection of values returned by getStandards.
type GetStandardsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Specifies the type of resource to which the standard applies.
	ResourceType *string `pulumi:"resourceType"`
	// The list of standards defined.
	Standards []GetStandardsStandard `pulumi:"standards"`
}

func GetStandardsOutput(ctx *pulumi.Context, args GetStandardsOutputArgs, opts ...pulumi.InvokeOption) GetStandardsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStandardsResultOutput, error) {
			args := v.(GetStandardsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetStandardsResult
			secret, err := ctx.InvokePackageRaw("pagerduty:index/getStandards:getStandards", args, &rv, "", opts...)
			if err != nil {
				return GetStandardsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetStandardsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetStandardsResultOutput), nil
			}
			return output, nil
		}).(GetStandardsResultOutput)
}

// A collection of arguments for invoking getStandards.
type GetStandardsOutputArgs struct {
	// Filter by `resourceType` the received standards. Allowed values are `technicalService`.
	ResourceType pulumi.StringPtrInput `pulumi:"resourceType"`
}

func (GetStandardsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStandardsArgs)(nil)).Elem()
}

// A collection of values returned by getStandards.
type GetStandardsResultOutput struct{ *pulumi.OutputState }

func (GetStandardsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStandardsResult)(nil)).Elem()
}

func (o GetStandardsResultOutput) ToGetStandardsResultOutput() GetStandardsResultOutput {
	return o
}

func (o GetStandardsResultOutput) ToGetStandardsResultOutputWithContext(ctx context.Context) GetStandardsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetStandardsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStandardsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Specifies the type of resource to which the standard applies.
func (o GetStandardsResultOutput) ResourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStandardsResult) *string { return v.ResourceType }).(pulumi.StringPtrOutput)
}

// The list of standards defined.
func (o GetStandardsResultOutput) Standards() GetStandardsStandardArrayOutput {
	return o.ApplyT(func(v GetStandardsResult) []GetStandardsStandard { return v.Standards }).(GetStandardsStandardArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStandardsResultOutput{})
}
