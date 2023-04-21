// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [Custom Field](https://support.pagerduty.com/docs/custom-fields) is a resuable element which can be added to Custom Field Schemas.
//
// > The Custom Fields feature is currently available in Early Access.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pagerduty.NewCustomField(ctx, "csImpact", &pagerduty.CustomFieldArgs{
//				Datatype: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewCustomField(ctx, "sreEnvironment", &pagerduty.CustomFieldArgs{
//				Datatype:     pulumi.String("string"),
//				FixedOptions: pulumi.Bool(true),
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
//	$ pulumi import pagerduty:index/customField:CustomField sre_environment PLBP09X
//
// ```
type CustomField struct {
	pulumi.CustomResourceState

	// The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	Datatype    pulumi.StringOutput    `pulumi:"datatype"`
	Description pulumi.StringPtrOutput `pulumi:"description"`
	DisplayName pulumi.StringOutput    `pulumi:"displayName"`
	// True if the field can only accept values from a set of options.
	FixedOptions pulumi.BoolPtrOutput `pulumi:"fixedOptions"`
	// True if the field can accept multiple values.
	MultiValue pulumi.BoolPtrOutput `pulumi:"multiValue"`
	// The name of the field.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewCustomField registers a new resource with the given unique name, arguments, and options.
func NewCustomField(ctx *pulumi.Context,
	name string, args *CustomFieldArgs, opts ...pulumi.ResourceOption) (*CustomField, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Datatype == nil {
		return nil, errors.New("invalid value for required argument 'Datatype'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	var resource CustomField
	err := ctx.RegisterResource("pagerduty:index/customField:CustomField", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomField gets an existing CustomField resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomField(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomFieldState, opts ...pulumi.ResourceOption) (*CustomField, error) {
	var resource CustomField
	err := ctx.ReadResource("pagerduty:index/customField:CustomField", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomField resources.
type customFieldState struct {
	// The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	Datatype    *string `pulumi:"datatype"`
	Description *string `pulumi:"description"`
	DisplayName *string `pulumi:"displayName"`
	// True if the field can only accept values from a set of options.
	FixedOptions *bool `pulumi:"fixedOptions"`
	// True if the field can accept multiple values.
	MultiValue *bool `pulumi:"multiValue"`
	// The name of the field.
	Name *string `pulumi:"name"`
}

type CustomFieldState struct {
	// The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	Datatype    pulumi.StringPtrInput
	Description pulumi.StringPtrInput
	DisplayName pulumi.StringPtrInput
	// True if the field can only accept values from a set of options.
	FixedOptions pulumi.BoolPtrInput
	// True if the field can accept multiple values.
	MultiValue pulumi.BoolPtrInput
	// The name of the field.
	Name pulumi.StringPtrInput
}

func (CustomFieldState) ElementType() reflect.Type {
	return reflect.TypeOf((*customFieldState)(nil)).Elem()
}

type customFieldArgs struct {
	// The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	Datatype    string  `pulumi:"datatype"`
	Description *string `pulumi:"description"`
	DisplayName string  `pulumi:"displayName"`
	// True if the field can only accept values from a set of options.
	FixedOptions *bool `pulumi:"fixedOptions"`
	// True if the field can accept multiple values.
	MultiValue *bool `pulumi:"multiValue"`
	// The name of the field.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a CustomField resource.
type CustomFieldArgs struct {
	// The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
	Datatype    pulumi.StringInput
	Description pulumi.StringPtrInput
	DisplayName pulumi.StringInput
	// True if the field can only accept values from a set of options.
	FixedOptions pulumi.BoolPtrInput
	// True if the field can accept multiple values.
	MultiValue pulumi.BoolPtrInput
	// The name of the field.
	Name pulumi.StringPtrInput
}

func (CustomFieldArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customFieldArgs)(nil)).Elem()
}

type CustomFieldInput interface {
	pulumi.Input

	ToCustomFieldOutput() CustomFieldOutput
	ToCustomFieldOutputWithContext(ctx context.Context) CustomFieldOutput
}

func (*CustomField) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomField)(nil)).Elem()
}

func (i *CustomField) ToCustomFieldOutput() CustomFieldOutput {
	return i.ToCustomFieldOutputWithContext(context.Background())
}

func (i *CustomField) ToCustomFieldOutputWithContext(ctx context.Context) CustomFieldOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldOutput)
}

// CustomFieldArrayInput is an input type that accepts CustomFieldArray and CustomFieldArrayOutput values.
// You can construct a concrete instance of `CustomFieldArrayInput` via:
//
//	CustomFieldArray{ CustomFieldArgs{...} }
type CustomFieldArrayInput interface {
	pulumi.Input

	ToCustomFieldArrayOutput() CustomFieldArrayOutput
	ToCustomFieldArrayOutputWithContext(context.Context) CustomFieldArrayOutput
}

type CustomFieldArray []CustomFieldInput

func (CustomFieldArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomField)(nil)).Elem()
}

func (i CustomFieldArray) ToCustomFieldArrayOutput() CustomFieldArrayOutput {
	return i.ToCustomFieldArrayOutputWithContext(context.Background())
}

func (i CustomFieldArray) ToCustomFieldArrayOutputWithContext(ctx context.Context) CustomFieldArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldArrayOutput)
}

// CustomFieldMapInput is an input type that accepts CustomFieldMap and CustomFieldMapOutput values.
// You can construct a concrete instance of `CustomFieldMapInput` via:
//
//	CustomFieldMap{ "key": CustomFieldArgs{...} }
type CustomFieldMapInput interface {
	pulumi.Input

	ToCustomFieldMapOutput() CustomFieldMapOutput
	ToCustomFieldMapOutputWithContext(context.Context) CustomFieldMapOutput
}

type CustomFieldMap map[string]CustomFieldInput

func (CustomFieldMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomField)(nil)).Elem()
}

func (i CustomFieldMap) ToCustomFieldMapOutput() CustomFieldMapOutput {
	return i.ToCustomFieldMapOutputWithContext(context.Background())
}

func (i CustomFieldMap) ToCustomFieldMapOutputWithContext(ctx context.Context) CustomFieldMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldMapOutput)
}

type CustomFieldOutput struct{ *pulumi.OutputState }

func (CustomFieldOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomField)(nil)).Elem()
}

func (o CustomFieldOutput) ToCustomFieldOutput() CustomFieldOutput {
	return o
}

func (o CustomFieldOutput) ToCustomFieldOutputWithContext(ctx context.Context) CustomFieldOutput {
	return o
}

// The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
func (o CustomFieldOutput) Datatype() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomField) pulumi.StringOutput { return v.Datatype }).(pulumi.StringOutput)
}

func (o CustomFieldOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomField) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o CustomFieldOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomField) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// True if the field can only accept values from a set of options.
func (o CustomFieldOutput) FixedOptions() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CustomField) pulumi.BoolPtrOutput { return v.FixedOptions }).(pulumi.BoolPtrOutput)
}

// True if the field can accept multiple values.
func (o CustomFieldOutput) MultiValue() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CustomField) pulumi.BoolPtrOutput { return v.MultiValue }).(pulumi.BoolPtrOutput)
}

// The name of the field.
func (o CustomFieldOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomField) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type CustomFieldArrayOutput struct{ *pulumi.OutputState }

func (CustomFieldArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomField)(nil)).Elem()
}

func (o CustomFieldArrayOutput) ToCustomFieldArrayOutput() CustomFieldArrayOutput {
	return o
}

func (o CustomFieldArrayOutput) ToCustomFieldArrayOutputWithContext(ctx context.Context) CustomFieldArrayOutput {
	return o
}

func (o CustomFieldArrayOutput) Index(i pulumi.IntInput) CustomFieldOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomField {
		return vs[0].([]*CustomField)[vs[1].(int)]
	}).(CustomFieldOutput)
}

type CustomFieldMapOutput struct{ *pulumi.OutputState }

func (CustomFieldMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomField)(nil)).Elem()
}

func (o CustomFieldMapOutput) ToCustomFieldMapOutput() CustomFieldMapOutput {
	return o
}

func (o CustomFieldMapOutput) ToCustomFieldMapOutputWithContext(ctx context.Context) CustomFieldMapOutput {
	return o
}

func (o CustomFieldMapOutput) MapIndex(k pulumi.StringInput) CustomFieldOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomField {
		return vs[0].(map[string]*CustomField)[vs[1].(string)]
	}).(CustomFieldOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldInput)(nil)).Elem(), &CustomField{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldArrayInput)(nil)).Elem(), CustomFieldArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldMapInput)(nil)).Elem(), CustomFieldMap{})
	pulumi.RegisterOutputType(CustomFieldOutput{})
	pulumi.RegisterOutputType(CustomFieldArrayOutput{})
	pulumi.RegisterOutputType(CustomFieldMapOutput{})
}