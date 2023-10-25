// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to get information about a specific [priority](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE2NA-list-priorities) that you can use for other PagerDuty resources. A priority is a label representing the importance and impact of an incident. This feature is only available on Standard and Enterprise plans.
func GetPriority(ctx *pulumi.Context, args *GetPriorityArgs, opts ...pulumi.InvokeOption) (*GetPriorityResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
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

func GetPriorityOutput(ctx *pulumi.Context, args GetPriorityOutputArgs, opts ...pulumi.InvokeOption) GetPriorityResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPriorityResult, error) {
			args := v.(GetPriorityArgs)
			r, err := GetPriority(ctx, &args, opts...)
			var s GetPriorityResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPriorityResultOutput)
}

// A collection of arguments for invoking getPriority.
type GetPriorityOutputArgs struct {
	// The name of the priority to find in the PagerDuty API.
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetPriorityOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPriorityArgs)(nil)).Elem()
}

// A collection of values returned by getPriority.
type GetPriorityResultOutput struct{ *pulumi.OutputState }

func (GetPriorityResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPriorityResult)(nil)).Elem()
}

func (o GetPriorityResultOutput) ToGetPriorityResultOutput() GetPriorityResultOutput {
	return o
}

func (o GetPriorityResultOutput) ToGetPriorityResultOutputWithContext(ctx context.Context) GetPriorityResultOutput {
	return o
}

func (o GetPriorityResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetPriorityResult] {
	return pulumix.Output[GetPriorityResult]{
		OutputState: o.OutputState,
	}
}

// A description of the found priority.
func (o GetPriorityResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetPriorityResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPriorityResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPriorityResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the found priority.
func (o GetPriorityResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetPriorityResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPriorityResultOutput{})
}
