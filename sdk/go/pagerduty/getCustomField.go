// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// !> This Data Source is no longer functional. Documentation is left here for the purpose of documenting migration steps.
//
// Use this data source to get information about a specific [Custom Field](https://support.pagerduty.com/docs/custom-fields) that you can add to a custom field schema.
//
// ## Migration
//
// The `incidentCustomField` data source provides similar functionality
// with the same arguments and attributes. The key distinction is that while custom fields returned by this data source
// may have only applied to a subset of incidents within the account, custom fields returned by the `incidentCustomField`
// data source are applied to all incidents in the account.
func LookupCustomField(ctx *pulumi.Context, args *LookupCustomFieldArgs, opts ...pulumi.InvokeOption) (*LookupCustomFieldResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCustomFieldResult
	err := ctx.Invoke("pagerduty:index/getCustomField:getCustomField", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCustomField.
type LookupCustomFieldArgs struct {
	// The name of the field.
	Name string `pulumi:"name"`
}

// A collection of values returned by getCustomField.
type LookupCustomFieldResult struct {
	Datatype     string `pulumi:"datatype"`
	Description  string `pulumi:"description"`
	DisplayName  string `pulumi:"displayName"`
	FixedOptions bool   `pulumi:"fixedOptions"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	MultiValue bool   `pulumi:"multiValue"`
	Name       string `pulumi:"name"`
}

func LookupCustomFieldOutput(ctx *pulumi.Context, args LookupCustomFieldOutputArgs, opts ...pulumi.InvokeOption) LookupCustomFieldResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCustomFieldResult, error) {
			args := v.(LookupCustomFieldArgs)
			r, err := LookupCustomField(ctx, &args, opts...)
			var s LookupCustomFieldResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCustomFieldResultOutput)
}

// A collection of arguments for invoking getCustomField.
type LookupCustomFieldOutputArgs struct {
	// The name of the field.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupCustomFieldOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCustomFieldArgs)(nil)).Elem()
}

// A collection of values returned by getCustomField.
type LookupCustomFieldResultOutput struct{ *pulumi.OutputState }

func (LookupCustomFieldResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCustomFieldResult)(nil)).Elem()
}

func (o LookupCustomFieldResultOutput) ToLookupCustomFieldResultOutput() LookupCustomFieldResultOutput {
	return o
}

func (o LookupCustomFieldResultOutput) ToLookupCustomFieldResultOutputWithContext(ctx context.Context) LookupCustomFieldResultOutput {
	return o
}

func (o LookupCustomFieldResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupCustomFieldResult] {
	return pulumix.Output[LookupCustomFieldResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupCustomFieldResultOutput) Datatype() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomFieldResult) string { return v.Datatype }).(pulumi.StringOutput)
}

func (o LookupCustomFieldResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomFieldResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupCustomFieldResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomFieldResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupCustomFieldResultOutput) FixedOptions() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCustomFieldResult) bool { return v.FixedOptions }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCustomFieldResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomFieldResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCustomFieldResultOutput) MultiValue() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCustomFieldResult) bool { return v.MultiValue }).(pulumi.BoolOutput)
}

func (o LookupCustomFieldResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomFieldResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCustomFieldResultOutput{})
}
