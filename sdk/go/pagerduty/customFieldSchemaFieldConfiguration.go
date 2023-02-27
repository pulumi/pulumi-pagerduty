// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [Custom Field Configuration](https://support.pagerduty.com/docs/custom-fields#associate-schemas-with-services) is a declaration of a specific Custom Field in a specific Custom Field Schema.
//
// > The Custom Fields feature is currently available in Early Access.
type CustomFieldSchemaFieldConfiguration struct {
	pulumi.CustomResourceState

	// The default value for the field.
	DefaultValue pulumi.StringPtrOutput `pulumi:"defaultValue"`
	// The datatype of the default value.
	DefaultValueDatatype pulumi.StringPtrOutput `pulumi:"defaultValueDatatype"`
	// Whether or not the default value is multi-valued.
	DefaultValueMultiValue pulumi.BoolPtrOutput `pulumi:"defaultValueMultiValue"`
	// The ID of the field.
	Field pulumi.StringOutput `pulumi:"field"`
	// True if the field is required
	Required pulumi.BoolPtrOutput `pulumi:"required"`
	// The ID of the schema.
	Schema pulumi.StringOutput `pulumi:"schema"`
}

// NewCustomFieldSchemaFieldConfiguration registers a new resource with the given unique name, arguments, and options.
func NewCustomFieldSchemaFieldConfiguration(ctx *pulumi.Context,
	name string, args *CustomFieldSchemaFieldConfigurationArgs, opts ...pulumi.ResourceOption) (*CustomFieldSchemaFieldConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Field == nil {
		return nil, errors.New("invalid value for required argument 'Field'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	var resource CustomFieldSchemaFieldConfiguration
	err := ctx.RegisterResource("pagerduty:index/customFieldSchemaFieldConfiguration:CustomFieldSchemaFieldConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomFieldSchemaFieldConfiguration gets an existing CustomFieldSchemaFieldConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomFieldSchemaFieldConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomFieldSchemaFieldConfigurationState, opts ...pulumi.ResourceOption) (*CustomFieldSchemaFieldConfiguration, error) {
	var resource CustomFieldSchemaFieldConfiguration
	err := ctx.ReadResource("pagerduty:index/customFieldSchemaFieldConfiguration:CustomFieldSchemaFieldConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomFieldSchemaFieldConfiguration resources.
type customFieldSchemaFieldConfigurationState struct {
	// The default value for the field.
	DefaultValue *string `pulumi:"defaultValue"`
	// The datatype of the default value.
	DefaultValueDatatype *string `pulumi:"defaultValueDatatype"`
	// Whether or not the default value is multi-valued.
	DefaultValueMultiValue *bool `pulumi:"defaultValueMultiValue"`
	// The ID of the field.
	Field *string `pulumi:"field"`
	// True if the field is required
	Required *bool `pulumi:"required"`
	// The ID of the schema.
	Schema *string `pulumi:"schema"`
}

type CustomFieldSchemaFieldConfigurationState struct {
	// The default value for the field.
	DefaultValue pulumi.StringPtrInput
	// The datatype of the default value.
	DefaultValueDatatype pulumi.StringPtrInput
	// Whether or not the default value is multi-valued.
	DefaultValueMultiValue pulumi.BoolPtrInput
	// The ID of the field.
	Field pulumi.StringPtrInput
	// True if the field is required
	Required pulumi.BoolPtrInput
	// The ID of the schema.
	Schema pulumi.StringPtrInput
}

func (CustomFieldSchemaFieldConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*customFieldSchemaFieldConfigurationState)(nil)).Elem()
}

type customFieldSchemaFieldConfigurationArgs struct {
	// The default value for the field.
	DefaultValue *string `pulumi:"defaultValue"`
	// The datatype of the default value.
	DefaultValueDatatype *string `pulumi:"defaultValueDatatype"`
	// Whether or not the default value is multi-valued.
	DefaultValueMultiValue *bool `pulumi:"defaultValueMultiValue"`
	// The ID of the field.
	Field string `pulumi:"field"`
	// True if the field is required
	Required *bool `pulumi:"required"`
	// The ID of the schema.
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a CustomFieldSchemaFieldConfiguration resource.
type CustomFieldSchemaFieldConfigurationArgs struct {
	// The default value for the field.
	DefaultValue pulumi.StringPtrInput
	// The datatype of the default value.
	DefaultValueDatatype pulumi.StringPtrInput
	// Whether or not the default value is multi-valued.
	DefaultValueMultiValue pulumi.BoolPtrInput
	// The ID of the field.
	Field pulumi.StringInput
	// True if the field is required
	Required pulumi.BoolPtrInput
	// The ID of the schema.
	Schema pulumi.StringInput
}

func (CustomFieldSchemaFieldConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customFieldSchemaFieldConfigurationArgs)(nil)).Elem()
}

type CustomFieldSchemaFieldConfigurationInput interface {
	pulumi.Input

	ToCustomFieldSchemaFieldConfigurationOutput() CustomFieldSchemaFieldConfigurationOutput
	ToCustomFieldSchemaFieldConfigurationOutputWithContext(ctx context.Context) CustomFieldSchemaFieldConfigurationOutput
}

func (*CustomFieldSchemaFieldConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomFieldSchemaFieldConfiguration)(nil)).Elem()
}

func (i *CustomFieldSchemaFieldConfiguration) ToCustomFieldSchemaFieldConfigurationOutput() CustomFieldSchemaFieldConfigurationOutput {
	return i.ToCustomFieldSchemaFieldConfigurationOutputWithContext(context.Background())
}

func (i *CustomFieldSchemaFieldConfiguration) ToCustomFieldSchemaFieldConfigurationOutputWithContext(ctx context.Context) CustomFieldSchemaFieldConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldSchemaFieldConfigurationOutput)
}

// CustomFieldSchemaFieldConfigurationArrayInput is an input type that accepts CustomFieldSchemaFieldConfigurationArray and CustomFieldSchemaFieldConfigurationArrayOutput values.
// You can construct a concrete instance of `CustomFieldSchemaFieldConfigurationArrayInput` via:
//
//	CustomFieldSchemaFieldConfigurationArray{ CustomFieldSchemaFieldConfigurationArgs{...} }
type CustomFieldSchemaFieldConfigurationArrayInput interface {
	pulumi.Input

	ToCustomFieldSchemaFieldConfigurationArrayOutput() CustomFieldSchemaFieldConfigurationArrayOutput
	ToCustomFieldSchemaFieldConfigurationArrayOutputWithContext(context.Context) CustomFieldSchemaFieldConfigurationArrayOutput
}

type CustomFieldSchemaFieldConfigurationArray []CustomFieldSchemaFieldConfigurationInput

func (CustomFieldSchemaFieldConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomFieldSchemaFieldConfiguration)(nil)).Elem()
}

func (i CustomFieldSchemaFieldConfigurationArray) ToCustomFieldSchemaFieldConfigurationArrayOutput() CustomFieldSchemaFieldConfigurationArrayOutput {
	return i.ToCustomFieldSchemaFieldConfigurationArrayOutputWithContext(context.Background())
}

func (i CustomFieldSchemaFieldConfigurationArray) ToCustomFieldSchemaFieldConfigurationArrayOutputWithContext(ctx context.Context) CustomFieldSchemaFieldConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldSchemaFieldConfigurationArrayOutput)
}

// CustomFieldSchemaFieldConfigurationMapInput is an input type that accepts CustomFieldSchemaFieldConfigurationMap and CustomFieldSchemaFieldConfigurationMapOutput values.
// You can construct a concrete instance of `CustomFieldSchemaFieldConfigurationMapInput` via:
//
//	CustomFieldSchemaFieldConfigurationMap{ "key": CustomFieldSchemaFieldConfigurationArgs{...} }
type CustomFieldSchemaFieldConfigurationMapInput interface {
	pulumi.Input

	ToCustomFieldSchemaFieldConfigurationMapOutput() CustomFieldSchemaFieldConfigurationMapOutput
	ToCustomFieldSchemaFieldConfigurationMapOutputWithContext(context.Context) CustomFieldSchemaFieldConfigurationMapOutput
}

type CustomFieldSchemaFieldConfigurationMap map[string]CustomFieldSchemaFieldConfigurationInput

func (CustomFieldSchemaFieldConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomFieldSchemaFieldConfiguration)(nil)).Elem()
}

func (i CustomFieldSchemaFieldConfigurationMap) ToCustomFieldSchemaFieldConfigurationMapOutput() CustomFieldSchemaFieldConfigurationMapOutput {
	return i.ToCustomFieldSchemaFieldConfigurationMapOutputWithContext(context.Background())
}

func (i CustomFieldSchemaFieldConfigurationMap) ToCustomFieldSchemaFieldConfigurationMapOutputWithContext(ctx context.Context) CustomFieldSchemaFieldConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldSchemaFieldConfigurationMapOutput)
}

type CustomFieldSchemaFieldConfigurationOutput struct{ *pulumi.OutputState }

func (CustomFieldSchemaFieldConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomFieldSchemaFieldConfiguration)(nil)).Elem()
}

func (o CustomFieldSchemaFieldConfigurationOutput) ToCustomFieldSchemaFieldConfigurationOutput() CustomFieldSchemaFieldConfigurationOutput {
	return o
}

func (o CustomFieldSchemaFieldConfigurationOutput) ToCustomFieldSchemaFieldConfigurationOutputWithContext(ctx context.Context) CustomFieldSchemaFieldConfigurationOutput {
	return o
}

// The default value for the field.
func (o CustomFieldSchemaFieldConfigurationOutput) DefaultValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomFieldSchemaFieldConfiguration) pulumi.StringPtrOutput { return v.DefaultValue }).(pulumi.StringPtrOutput)
}

// The datatype of the default value.
func (o CustomFieldSchemaFieldConfigurationOutput) DefaultValueDatatype() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomFieldSchemaFieldConfiguration) pulumi.StringPtrOutput { return v.DefaultValueDatatype }).(pulumi.StringPtrOutput)
}

// Whether or not the default value is multi-valued.
func (o CustomFieldSchemaFieldConfigurationOutput) DefaultValueMultiValue() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CustomFieldSchemaFieldConfiguration) pulumi.BoolPtrOutput { return v.DefaultValueMultiValue }).(pulumi.BoolPtrOutput)
}

// The ID of the field.
func (o CustomFieldSchemaFieldConfigurationOutput) Field() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomFieldSchemaFieldConfiguration) pulumi.StringOutput { return v.Field }).(pulumi.StringOutput)
}

// True if the field is required
func (o CustomFieldSchemaFieldConfigurationOutput) Required() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CustomFieldSchemaFieldConfiguration) pulumi.BoolPtrOutput { return v.Required }).(pulumi.BoolPtrOutput)
}

// The ID of the schema.
func (o CustomFieldSchemaFieldConfigurationOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomFieldSchemaFieldConfiguration) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

type CustomFieldSchemaFieldConfigurationArrayOutput struct{ *pulumi.OutputState }

func (CustomFieldSchemaFieldConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomFieldSchemaFieldConfiguration)(nil)).Elem()
}

func (o CustomFieldSchemaFieldConfigurationArrayOutput) ToCustomFieldSchemaFieldConfigurationArrayOutput() CustomFieldSchemaFieldConfigurationArrayOutput {
	return o
}

func (o CustomFieldSchemaFieldConfigurationArrayOutput) ToCustomFieldSchemaFieldConfigurationArrayOutputWithContext(ctx context.Context) CustomFieldSchemaFieldConfigurationArrayOutput {
	return o
}

func (o CustomFieldSchemaFieldConfigurationArrayOutput) Index(i pulumi.IntInput) CustomFieldSchemaFieldConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomFieldSchemaFieldConfiguration {
		return vs[0].([]*CustomFieldSchemaFieldConfiguration)[vs[1].(int)]
	}).(CustomFieldSchemaFieldConfigurationOutput)
}

type CustomFieldSchemaFieldConfigurationMapOutput struct{ *pulumi.OutputState }

func (CustomFieldSchemaFieldConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomFieldSchemaFieldConfiguration)(nil)).Elem()
}

func (o CustomFieldSchemaFieldConfigurationMapOutput) ToCustomFieldSchemaFieldConfigurationMapOutput() CustomFieldSchemaFieldConfigurationMapOutput {
	return o
}

func (o CustomFieldSchemaFieldConfigurationMapOutput) ToCustomFieldSchemaFieldConfigurationMapOutputWithContext(ctx context.Context) CustomFieldSchemaFieldConfigurationMapOutput {
	return o
}

func (o CustomFieldSchemaFieldConfigurationMapOutput) MapIndex(k pulumi.StringInput) CustomFieldSchemaFieldConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomFieldSchemaFieldConfiguration {
		return vs[0].(map[string]*CustomFieldSchemaFieldConfiguration)[vs[1].(string)]
	}).(CustomFieldSchemaFieldConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldSchemaFieldConfigurationInput)(nil)).Elem(), &CustomFieldSchemaFieldConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldSchemaFieldConfigurationArrayInput)(nil)).Elem(), CustomFieldSchemaFieldConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldSchemaFieldConfigurationMapInput)(nil)).Elem(), CustomFieldSchemaFieldConfigurationMap{})
	pulumi.RegisterOutputType(CustomFieldSchemaFieldConfigurationOutput{})
	pulumi.RegisterOutputType(CustomFieldSchemaFieldConfigurationArrayOutput{})
	pulumi.RegisterOutputType(CustomFieldSchemaFieldConfigurationMapOutput{})
}
