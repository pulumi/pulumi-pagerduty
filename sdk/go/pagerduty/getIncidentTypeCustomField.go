// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupIncidentTypeCustomField(ctx *pulumi.Context, args *LookupIncidentTypeCustomFieldArgs, opts ...pulumi.InvokeOption) (*LookupIncidentTypeCustomFieldResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupIncidentTypeCustomFieldResult
	err := ctx.Invoke("pagerduty:index/getIncidentTypeCustomField:getIncidentTypeCustomField", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIncidentTypeCustomField.
type LookupIncidentTypeCustomFieldArgs struct {
	DisplayName  string `pulumi:"displayName"`
	IncidentType string `pulumi:"incidentType"`
}

// A collection of values returned by getIncidentTypeCustomField.
type LookupIncidentTypeCustomFieldResult struct {
	DataType     string                                  `pulumi:"dataType"`
	DefaultValue string                                  `pulumi:"defaultValue"`
	Description  string                                  `pulumi:"description"`
	DisplayName  string                                  `pulumi:"displayName"`
	Enabled      bool                                    `pulumi:"enabled"`
	FieldOptions []GetIncidentTypeCustomFieldFieldOption `pulumi:"fieldOptions"`
	FieldType    string                                  `pulumi:"fieldType"`
	Id           string                                  `pulumi:"id"`
	IncidentType string                                  `pulumi:"incidentType"`
	Name         string                                  `pulumi:"name"`
	Self         string                                  `pulumi:"self"`
	Summary      string                                  `pulumi:"summary"`
	Type         string                                  `pulumi:"type"`
}

func LookupIncidentTypeCustomFieldOutput(ctx *pulumi.Context, args LookupIncidentTypeCustomFieldOutputArgs, opts ...pulumi.InvokeOption) LookupIncidentTypeCustomFieldResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupIncidentTypeCustomFieldResultOutput, error) {
			args := v.(LookupIncidentTypeCustomFieldArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("pagerduty:index/getIncidentTypeCustomField:getIncidentTypeCustomField", args, LookupIncidentTypeCustomFieldResultOutput{}, options).(LookupIncidentTypeCustomFieldResultOutput), nil
		}).(LookupIncidentTypeCustomFieldResultOutput)
}

// A collection of arguments for invoking getIncidentTypeCustomField.
type LookupIncidentTypeCustomFieldOutputArgs struct {
	DisplayName  pulumi.StringInput `pulumi:"displayName"`
	IncidentType pulumi.StringInput `pulumi:"incidentType"`
}

func (LookupIncidentTypeCustomFieldOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIncidentTypeCustomFieldArgs)(nil)).Elem()
}

// A collection of values returned by getIncidentTypeCustomField.
type LookupIncidentTypeCustomFieldResultOutput struct{ *pulumi.OutputState }

func (LookupIncidentTypeCustomFieldResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIncidentTypeCustomFieldResult)(nil)).Elem()
}

func (o LookupIncidentTypeCustomFieldResultOutput) ToLookupIncidentTypeCustomFieldResultOutput() LookupIncidentTypeCustomFieldResultOutput {
	return o
}

func (o LookupIncidentTypeCustomFieldResultOutput) ToLookupIncidentTypeCustomFieldResultOutputWithContext(ctx context.Context) LookupIncidentTypeCustomFieldResultOutput {
	return o
}

func (o LookupIncidentTypeCustomFieldResultOutput) DataType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.DataType }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) DefaultValue() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.DefaultValue }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) FieldOptions() GetIncidentTypeCustomFieldFieldOptionArrayOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) []GetIncidentTypeCustomFieldFieldOption {
		return v.FieldOptions
	}).(GetIncidentTypeCustomFieldFieldOptionArrayOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) FieldType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.FieldType }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) IncidentType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.IncidentType }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) Self() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.Self }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) Summary() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.Summary }).(pulumi.StringOutput)
}

func (o LookupIncidentTypeCustomFieldResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentTypeCustomFieldResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIncidentTypeCustomFieldResultOutput{})
}
