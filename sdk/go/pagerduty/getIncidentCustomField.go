// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents).
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
//			environment, err := pagerduty.LookupIncidentCustomField(ctx, &pagerduty.LookupIncidentCustomFieldArgs{
//				Name: "environment",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewIncidentCustomFieldOption(ctx, "dev_environment", &pagerduty.IncidentCustomFieldOptionArgs{
//				Field:    pulumi.String(environment.Id),
//				Datatype: pulumi.String("string"),
//				Value:    pulumi.String("dev"),
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
func LookupIncidentCustomField(ctx *pulumi.Context, args *LookupIncidentCustomFieldArgs, opts ...pulumi.InvokeOption) (*LookupIncidentCustomFieldResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupIncidentCustomFieldResult
	err := ctx.Invoke("pagerduty:index/getIncidentCustomField:getIncidentCustomField", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIncidentCustomField.
type LookupIncidentCustomFieldArgs struct {
	// The name of the field.
	Name string `pulumi:"name"`
}

// A collection of values returned by getIncidentCustomField.
type LookupIncidentCustomFieldResult struct {
	DataType    string `pulumi:"dataType"`
	Description string `pulumi:"description"`
	DisplayName string `pulumi:"displayName"`
	FieldType   string `pulumi:"fieldType"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func LookupIncidentCustomFieldOutput(ctx *pulumi.Context, args LookupIncidentCustomFieldOutputArgs, opts ...pulumi.InvokeOption) LookupIncidentCustomFieldResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupIncidentCustomFieldResult, error) {
			args := v.(LookupIncidentCustomFieldArgs)
			r, err := LookupIncidentCustomField(ctx, &args, opts...)
			var s LookupIncidentCustomFieldResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupIncidentCustomFieldResultOutput)
}

// A collection of arguments for invoking getIncidentCustomField.
type LookupIncidentCustomFieldOutputArgs struct {
	// The name of the field.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupIncidentCustomFieldOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIncidentCustomFieldArgs)(nil)).Elem()
}

// A collection of values returned by getIncidentCustomField.
type LookupIncidentCustomFieldResultOutput struct{ *pulumi.OutputState }

func (LookupIncidentCustomFieldResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIncidentCustomFieldResult)(nil)).Elem()
}

func (o LookupIncidentCustomFieldResultOutput) ToLookupIncidentCustomFieldResultOutput() LookupIncidentCustomFieldResultOutput {
	return o
}

func (o LookupIncidentCustomFieldResultOutput) ToLookupIncidentCustomFieldResultOutputWithContext(ctx context.Context) LookupIncidentCustomFieldResultOutput {
	return o
}

func (o LookupIncidentCustomFieldResultOutput) DataType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentCustomFieldResult) string { return v.DataType }).(pulumi.StringOutput)
}

func (o LookupIncidentCustomFieldResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentCustomFieldResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupIncidentCustomFieldResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentCustomFieldResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupIncidentCustomFieldResultOutput) FieldType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentCustomFieldResult) string { return v.FieldType }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupIncidentCustomFieldResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentCustomFieldResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupIncidentCustomFieldResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentCustomFieldResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIncidentCustomFieldResultOutput{})
}
