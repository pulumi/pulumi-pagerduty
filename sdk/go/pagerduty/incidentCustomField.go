// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// An [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents) defines a field which can be set on incidents in the target account.
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
//			_, err := pagerduty.NewIncidentCustomField(ctx, "csImpact", &pagerduty.IncidentCustomFieldArgs{
//				DataType:  pulumi.String("string"),
//				FieldType: pulumi.String("single_value"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewIncidentCustomField(ctx, "sreEnvironment", &pagerduty.IncidentCustomFieldArgs{
//				DataType:  pulumi.String("string"),
//				FieldType: pulumi.String("single_value_fixed"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Fields can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/incidentCustomField:IncidentCustomField sre_environment PLBP09X
//
// ```
type IncidentCustomField struct {
	pulumi.CustomResourceState

	// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	DataType     pulumi.StringOutput    `pulumi:"dataType"`
	DefaultValue pulumi.StringPtrOutput `pulumi:"defaultValue"`
	Description  pulumi.StringPtrOutput `pulumi:"description"`
	DisplayName  pulumi.StringOutput    `pulumi:"displayName"`
	// The field type of the field. Must be one of `singleValue`, `singleValueFixed`, `multiValue`, or `multiValueFixed`.
	FieldType pulumi.StringOutput `pulumi:"fieldType"`
	// The name of the field.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewIncidentCustomField registers a new resource with the given unique name, arguments, and options.
func NewIncidentCustomField(ctx *pulumi.Context,
	name string, args *IncidentCustomFieldArgs, opts ...pulumi.ResourceOption) (*IncidentCustomField, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataType == nil {
		return nil, errors.New("invalid value for required argument 'DataType'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.FieldType == nil {
		return nil, errors.New("invalid value for required argument 'FieldType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IncidentCustomField
	err := ctx.RegisterResource("pagerduty:index/incidentCustomField:IncidentCustomField", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIncidentCustomField gets an existing IncidentCustomField resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIncidentCustomField(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IncidentCustomFieldState, opts ...pulumi.ResourceOption) (*IncidentCustomField, error) {
	var resource IncidentCustomField
	err := ctx.ReadResource("pagerduty:index/incidentCustomField:IncidentCustomField", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IncidentCustomField resources.
type incidentCustomFieldState struct {
	// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	DataType     *string `pulumi:"dataType"`
	DefaultValue *string `pulumi:"defaultValue"`
	Description  *string `pulumi:"description"`
	DisplayName  *string `pulumi:"displayName"`
	// The field type of the field. Must be one of `singleValue`, `singleValueFixed`, `multiValue`, or `multiValueFixed`.
	FieldType *string `pulumi:"fieldType"`
	// The name of the field.
	Name *string `pulumi:"name"`
}

type IncidentCustomFieldState struct {
	// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	DataType     pulumi.StringPtrInput
	DefaultValue pulumi.StringPtrInput
	Description  pulumi.StringPtrInput
	DisplayName  pulumi.StringPtrInput
	// The field type of the field. Must be one of `singleValue`, `singleValueFixed`, `multiValue`, or `multiValueFixed`.
	FieldType pulumi.StringPtrInput
	// The name of the field.
	Name pulumi.StringPtrInput
}

func (IncidentCustomFieldState) ElementType() reflect.Type {
	return reflect.TypeOf((*incidentCustomFieldState)(nil)).Elem()
}

type incidentCustomFieldArgs struct {
	// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	DataType     string  `pulumi:"dataType"`
	DefaultValue *string `pulumi:"defaultValue"`
	Description  *string `pulumi:"description"`
	DisplayName  string  `pulumi:"displayName"`
	// The field type of the field. Must be one of `singleValue`, `singleValueFixed`, `multiValue`, or `multiValueFixed`.
	FieldType string `pulumi:"fieldType"`
	// The name of the field.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a IncidentCustomField resource.
type IncidentCustomFieldArgs struct {
	// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	DataType     pulumi.StringInput
	DefaultValue pulumi.StringPtrInput
	Description  pulumi.StringPtrInput
	DisplayName  pulumi.StringInput
	// The field type of the field. Must be one of `singleValue`, `singleValueFixed`, `multiValue`, or `multiValueFixed`.
	FieldType pulumi.StringInput
	// The name of the field.
	Name pulumi.StringPtrInput
}

func (IncidentCustomFieldArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*incidentCustomFieldArgs)(nil)).Elem()
}

type IncidentCustomFieldInput interface {
	pulumi.Input

	ToIncidentCustomFieldOutput() IncidentCustomFieldOutput
	ToIncidentCustomFieldOutputWithContext(ctx context.Context) IncidentCustomFieldOutput
}

func (*IncidentCustomField) ElementType() reflect.Type {
	return reflect.TypeOf((**IncidentCustomField)(nil)).Elem()
}

func (i *IncidentCustomField) ToIncidentCustomFieldOutput() IncidentCustomFieldOutput {
	return i.ToIncidentCustomFieldOutputWithContext(context.Background())
}

func (i *IncidentCustomField) ToIncidentCustomFieldOutputWithContext(ctx context.Context) IncidentCustomFieldOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentCustomFieldOutput)
}

func (i *IncidentCustomField) ToOutput(ctx context.Context) pulumix.Output[*IncidentCustomField] {
	return pulumix.Output[*IncidentCustomField]{
		OutputState: i.ToIncidentCustomFieldOutputWithContext(ctx).OutputState,
	}
}

// IncidentCustomFieldArrayInput is an input type that accepts IncidentCustomFieldArray and IncidentCustomFieldArrayOutput values.
// You can construct a concrete instance of `IncidentCustomFieldArrayInput` via:
//
//	IncidentCustomFieldArray{ IncidentCustomFieldArgs{...} }
type IncidentCustomFieldArrayInput interface {
	pulumi.Input

	ToIncidentCustomFieldArrayOutput() IncidentCustomFieldArrayOutput
	ToIncidentCustomFieldArrayOutputWithContext(context.Context) IncidentCustomFieldArrayOutput
}

type IncidentCustomFieldArray []IncidentCustomFieldInput

func (IncidentCustomFieldArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IncidentCustomField)(nil)).Elem()
}

func (i IncidentCustomFieldArray) ToIncidentCustomFieldArrayOutput() IncidentCustomFieldArrayOutput {
	return i.ToIncidentCustomFieldArrayOutputWithContext(context.Background())
}

func (i IncidentCustomFieldArray) ToIncidentCustomFieldArrayOutputWithContext(ctx context.Context) IncidentCustomFieldArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentCustomFieldArrayOutput)
}

func (i IncidentCustomFieldArray) ToOutput(ctx context.Context) pulumix.Output[[]*IncidentCustomField] {
	return pulumix.Output[[]*IncidentCustomField]{
		OutputState: i.ToIncidentCustomFieldArrayOutputWithContext(ctx).OutputState,
	}
}

// IncidentCustomFieldMapInput is an input type that accepts IncidentCustomFieldMap and IncidentCustomFieldMapOutput values.
// You can construct a concrete instance of `IncidentCustomFieldMapInput` via:
//
//	IncidentCustomFieldMap{ "key": IncidentCustomFieldArgs{...} }
type IncidentCustomFieldMapInput interface {
	pulumi.Input

	ToIncidentCustomFieldMapOutput() IncidentCustomFieldMapOutput
	ToIncidentCustomFieldMapOutputWithContext(context.Context) IncidentCustomFieldMapOutput
}

type IncidentCustomFieldMap map[string]IncidentCustomFieldInput

func (IncidentCustomFieldMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IncidentCustomField)(nil)).Elem()
}

func (i IncidentCustomFieldMap) ToIncidentCustomFieldMapOutput() IncidentCustomFieldMapOutput {
	return i.ToIncidentCustomFieldMapOutputWithContext(context.Background())
}

func (i IncidentCustomFieldMap) ToIncidentCustomFieldMapOutputWithContext(ctx context.Context) IncidentCustomFieldMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentCustomFieldMapOutput)
}

func (i IncidentCustomFieldMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*IncidentCustomField] {
	return pulumix.Output[map[string]*IncidentCustomField]{
		OutputState: i.ToIncidentCustomFieldMapOutputWithContext(ctx).OutputState,
	}
}

type IncidentCustomFieldOutput struct{ *pulumi.OutputState }

func (IncidentCustomFieldOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IncidentCustomField)(nil)).Elem()
}

func (o IncidentCustomFieldOutput) ToIncidentCustomFieldOutput() IncidentCustomFieldOutput {
	return o
}

func (o IncidentCustomFieldOutput) ToIncidentCustomFieldOutputWithContext(ctx context.Context) IncidentCustomFieldOutput {
	return o
}

func (o IncidentCustomFieldOutput) ToOutput(ctx context.Context) pulumix.Output[*IncidentCustomField] {
	return pulumix.Output[*IncidentCustomField]{
		OutputState: o.OutputState,
	}
}

// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
func (o IncidentCustomFieldOutput) DataType() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentCustomField) pulumi.StringOutput { return v.DataType }).(pulumi.StringOutput)
}

func (o IncidentCustomFieldOutput) DefaultValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IncidentCustomField) pulumi.StringPtrOutput { return v.DefaultValue }).(pulumi.StringPtrOutput)
}

func (o IncidentCustomFieldOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IncidentCustomField) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o IncidentCustomFieldOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentCustomField) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The field type of the field. Must be one of `singleValue`, `singleValueFixed`, `multiValue`, or `multiValueFixed`.
func (o IncidentCustomFieldOutput) FieldType() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentCustomField) pulumi.StringOutput { return v.FieldType }).(pulumi.StringOutput)
}

// The name of the field.
func (o IncidentCustomFieldOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentCustomField) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type IncidentCustomFieldArrayOutput struct{ *pulumi.OutputState }

func (IncidentCustomFieldArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IncidentCustomField)(nil)).Elem()
}

func (o IncidentCustomFieldArrayOutput) ToIncidentCustomFieldArrayOutput() IncidentCustomFieldArrayOutput {
	return o
}

func (o IncidentCustomFieldArrayOutput) ToIncidentCustomFieldArrayOutputWithContext(ctx context.Context) IncidentCustomFieldArrayOutput {
	return o
}

func (o IncidentCustomFieldArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*IncidentCustomField] {
	return pulumix.Output[[]*IncidentCustomField]{
		OutputState: o.OutputState,
	}
}

func (o IncidentCustomFieldArrayOutput) Index(i pulumi.IntInput) IncidentCustomFieldOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IncidentCustomField {
		return vs[0].([]*IncidentCustomField)[vs[1].(int)]
	}).(IncidentCustomFieldOutput)
}

type IncidentCustomFieldMapOutput struct{ *pulumi.OutputState }

func (IncidentCustomFieldMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IncidentCustomField)(nil)).Elem()
}

func (o IncidentCustomFieldMapOutput) ToIncidentCustomFieldMapOutput() IncidentCustomFieldMapOutput {
	return o
}

func (o IncidentCustomFieldMapOutput) ToIncidentCustomFieldMapOutputWithContext(ctx context.Context) IncidentCustomFieldMapOutput {
	return o
}

func (o IncidentCustomFieldMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*IncidentCustomField] {
	return pulumix.Output[map[string]*IncidentCustomField]{
		OutputState: o.OutputState,
	}
}

func (o IncidentCustomFieldMapOutput) MapIndex(k pulumi.StringInput) IncidentCustomFieldOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IncidentCustomField {
		return vs[0].(map[string]*IncidentCustomField)[vs[1].(string)]
	}).(IncidentCustomFieldOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentCustomFieldInput)(nil)).Elem(), &IncidentCustomField{})
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentCustomFieldArrayInput)(nil)).Elem(), IncidentCustomFieldArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentCustomFieldMapInput)(nil)).Elem(), IncidentCustomFieldMap{})
	pulumi.RegisterOutputType(IncidentCustomFieldOutput{})
	pulumi.RegisterOutputType(IncidentCustomFieldArrayOutput{})
	pulumi.RegisterOutputType(IncidentCustomFieldMapOutput{})
}
