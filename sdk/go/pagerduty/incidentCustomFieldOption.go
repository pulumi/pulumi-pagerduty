// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A Incident Custom Field Option is a specific value that can be used for an [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents) that only allow values from a set of fixed options,
// i.e. has the `fieldType` of `singleValueFixed` or `multiValueFixed`.
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
//			sreEnvironment, err := pagerduty.NewIncidentCustomField(ctx, "sre_environment", &pagerduty.IncidentCustomFieldArgs{
//				Name:        pulumi.String("environment"),
//				DisplayName: pulumi.String("Environment"),
//				DataType:    pulumi.String("string"),
//				FieldType:   pulumi.String("single_value_fixed"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewIncidentCustomFieldOption(ctx, "dev_environment", &pagerduty.IncidentCustomFieldOptionArgs{
//				Field:    sreEnvironment.ID(),
//				DataType: pulumi.String("string"),
//				Value:    pulumi.String("dev"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewIncidentCustomFieldOption(ctx, "stage_environment", &pagerduty.IncidentCustomFieldOptionArgs{
//				Field:    sreEnvironment.ID(),
//				DataType: pulumi.String("string"),
//				Value:    pulumi.String("stage"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewIncidentCustomFieldOption(ctx, "prod_environment", &pagerduty.IncidentCustomFieldOptionArgs{
//				Field:    sreEnvironment.ID(),
//				DataType: pulumi.String("string"),
//				Value:    pulumi.String("prod"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type IncidentCustomFieldOption struct {
	pulumi.CustomResourceState

	// The datatype of the field option. Only `string` is allowed here at present.
	DataType pulumi.StringOutput `pulumi:"dataType"`
	// The ID of the field.
	Field pulumi.StringOutput `pulumi:"field"`
	// The allowed value.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewIncidentCustomFieldOption registers a new resource with the given unique name, arguments, and options.
func NewIncidentCustomFieldOption(ctx *pulumi.Context,
	name string, args *IncidentCustomFieldOptionArgs, opts ...pulumi.ResourceOption) (*IncidentCustomFieldOption, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataType == nil {
		return nil, errors.New("invalid value for required argument 'DataType'")
	}
	if args.Field == nil {
		return nil, errors.New("invalid value for required argument 'Field'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IncidentCustomFieldOption
	err := ctx.RegisterResource("pagerduty:index/incidentCustomFieldOption:IncidentCustomFieldOption", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIncidentCustomFieldOption gets an existing IncidentCustomFieldOption resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIncidentCustomFieldOption(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IncidentCustomFieldOptionState, opts ...pulumi.ResourceOption) (*IncidentCustomFieldOption, error) {
	var resource IncidentCustomFieldOption
	err := ctx.ReadResource("pagerduty:index/incidentCustomFieldOption:IncidentCustomFieldOption", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IncidentCustomFieldOption resources.
type incidentCustomFieldOptionState struct {
	// The datatype of the field option. Only `string` is allowed here at present.
	DataType *string `pulumi:"dataType"`
	// The ID of the field.
	Field *string `pulumi:"field"`
	// The allowed value.
	Value *string `pulumi:"value"`
}

type IncidentCustomFieldOptionState struct {
	// The datatype of the field option. Only `string` is allowed here at present.
	DataType pulumi.StringPtrInput
	// The ID of the field.
	Field pulumi.StringPtrInput
	// The allowed value.
	Value pulumi.StringPtrInput
}

func (IncidentCustomFieldOptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*incidentCustomFieldOptionState)(nil)).Elem()
}

type incidentCustomFieldOptionArgs struct {
	// The datatype of the field option. Only `string` is allowed here at present.
	DataType string `pulumi:"dataType"`
	// The ID of the field.
	Field string `pulumi:"field"`
	// The allowed value.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a IncidentCustomFieldOption resource.
type IncidentCustomFieldOptionArgs struct {
	// The datatype of the field option. Only `string` is allowed here at present.
	DataType pulumi.StringInput
	// The ID of the field.
	Field pulumi.StringInput
	// The allowed value.
	Value pulumi.StringInput
}

func (IncidentCustomFieldOptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*incidentCustomFieldOptionArgs)(nil)).Elem()
}

type IncidentCustomFieldOptionInput interface {
	pulumi.Input

	ToIncidentCustomFieldOptionOutput() IncidentCustomFieldOptionOutput
	ToIncidentCustomFieldOptionOutputWithContext(ctx context.Context) IncidentCustomFieldOptionOutput
}

func (*IncidentCustomFieldOption) ElementType() reflect.Type {
	return reflect.TypeOf((**IncidentCustomFieldOption)(nil)).Elem()
}

func (i *IncidentCustomFieldOption) ToIncidentCustomFieldOptionOutput() IncidentCustomFieldOptionOutput {
	return i.ToIncidentCustomFieldOptionOutputWithContext(context.Background())
}

func (i *IncidentCustomFieldOption) ToIncidentCustomFieldOptionOutputWithContext(ctx context.Context) IncidentCustomFieldOptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentCustomFieldOptionOutput)
}

// IncidentCustomFieldOptionArrayInput is an input type that accepts IncidentCustomFieldOptionArray and IncidentCustomFieldOptionArrayOutput values.
// You can construct a concrete instance of `IncidentCustomFieldOptionArrayInput` via:
//
//	IncidentCustomFieldOptionArray{ IncidentCustomFieldOptionArgs{...} }
type IncidentCustomFieldOptionArrayInput interface {
	pulumi.Input

	ToIncidentCustomFieldOptionArrayOutput() IncidentCustomFieldOptionArrayOutput
	ToIncidentCustomFieldOptionArrayOutputWithContext(context.Context) IncidentCustomFieldOptionArrayOutput
}

type IncidentCustomFieldOptionArray []IncidentCustomFieldOptionInput

func (IncidentCustomFieldOptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IncidentCustomFieldOption)(nil)).Elem()
}

func (i IncidentCustomFieldOptionArray) ToIncidentCustomFieldOptionArrayOutput() IncidentCustomFieldOptionArrayOutput {
	return i.ToIncidentCustomFieldOptionArrayOutputWithContext(context.Background())
}

func (i IncidentCustomFieldOptionArray) ToIncidentCustomFieldOptionArrayOutputWithContext(ctx context.Context) IncidentCustomFieldOptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentCustomFieldOptionArrayOutput)
}

// IncidentCustomFieldOptionMapInput is an input type that accepts IncidentCustomFieldOptionMap and IncidentCustomFieldOptionMapOutput values.
// You can construct a concrete instance of `IncidentCustomFieldOptionMapInput` via:
//
//	IncidentCustomFieldOptionMap{ "key": IncidentCustomFieldOptionArgs{...} }
type IncidentCustomFieldOptionMapInput interface {
	pulumi.Input

	ToIncidentCustomFieldOptionMapOutput() IncidentCustomFieldOptionMapOutput
	ToIncidentCustomFieldOptionMapOutputWithContext(context.Context) IncidentCustomFieldOptionMapOutput
}

type IncidentCustomFieldOptionMap map[string]IncidentCustomFieldOptionInput

func (IncidentCustomFieldOptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IncidentCustomFieldOption)(nil)).Elem()
}

func (i IncidentCustomFieldOptionMap) ToIncidentCustomFieldOptionMapOutput() IncidentCustomFieldOptionMapOutput {
	return i.ToIncidentCustomFieldOptionMapOutputWithContext(context.Background())
}

func (i IncidentCustomFieldOptionMap) ToIncidentCustomFieldOptionMapOutputWithContext(ctx context.Context) IncidentCustomFieldOptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentCustomFieldOptionMapOutput)
}

type IncidentCustomFieldOptionOutput struct{ *pulumi.OutputState }

func (IncidentCustomFieldOptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IncidentCustomFieldOption)(nil)).Elem()
}

func (o IncidentCustomFieldOptionOutput) ToIncidentCustomFieldOptionOutput() IncidentCustomFieldOptionOutput {
	return o
}

func (o IncidentCustomFieldOptionOutput) ToIncidentCustomFieldOptionOutputWithContext(ctx context.Context) IncidentCustomFieldOptionOutput {
	return o
}

// The datatype of the field option. Only `string` is allowed here at present.
func (o IncidentCustomFieldOptionOutput) DataType() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentCustomFieldOption) pulumi.StringOutput { return v.DataType }).(pulumi.StringOutput)
}

// The ID of the field.
func (o IncidentCustomFieldOptionOutput) Field() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentCustomFieldOption) pulumi.StringOutput { return v.Field }).(pulumi.StringOutput)
}

// The allowed value.
func (o IncidentCustomFieldOptionOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentCustomFieldOption) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type IncidentCustomFieldOptionArrayOutput struct{ *pulumi.OutputState }

func (IncidentCustomFieldOptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IncidentCustomFieldOption)(nil)).Elem()
}

func (o IncidentCustomFieldOptionArrayOutput) ToIncidentCustomFieldOptionArrayOutput() IncidentCustomFieldOptionArrayOutput {
	return o
}

func (o IncidentCustomFieldOptionArrayOutput) ToIncidentCustomFieldOptionArrayOutputWithContext(ctx context.Context) IncidentCustomFieldOptionArrayOutput {
	return o
}

func (o IncidentCustomFieldOptionArrayOutput) Index(i pulumi.IntInput) IncidentCustomFieldOptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IncidentCustomFieldOption {
		return vs[0].([]*IncidentCustomFieldOption)[vs[1].(int)]
	}).(IncidentCustomFieldOptionOutput)
}

type IncidentCustomFieldOptionMapOutput struct{ *pulumi.OutputState }

func (IncidentCustomFieldOptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IncidentCustomFieldOption)(nil)).Elem()
}

func (o IncidentCustomFieldOptionMapOutput) ToIncidentCustomFieldOptionMapOutput() IncidentCustomFieldOptionMapOutput {
	return o
}

func (o IncidentCustomFieldOptionMapOutput) ToIncidentCustomFieldOptionMapOutputWithContext(ctx context.Context) IncidentCustomFieldOptionMapOutput {
	return o
}

func (o IncidentCustomFieldOptionMapOutput) MapIndex(k pulumi.StringInput) IncidentCustomFieldOptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IncidentCustomFieldOption {
		return vs[0].(map[string]*IncidentCustomFieldOption)[vs[1].(string)]
	}).(IncidentCustomFieldOptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentCustomFieldOptionInput)(nil)).Elem(), &IncidentCustomFieldOption{})
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentCustomFieldOptionArrayInput)(nil)).Elem(), IncidentCustomFieldOptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentCustomFieldOptionMapInput)(nil)).Elem(), IncidentCustomFieldOptionMap{})
	pulumi.RegisterOutputType(IncidentCustomFieldOptionOutput{})
	pulumi.RegisterOutputType(IncidentCustomFieldOptionArrayOutput{})
	pulumi.RegisterOutputType(IncidentCustomFieldOptionMapOutput{})
}
