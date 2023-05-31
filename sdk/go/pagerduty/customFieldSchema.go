// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> This Resource is no longer functional. Documentation is left here for the purpose of documenting migration steps.
//
// A [Custom Field Schema](https://support.pagerduty.com/docs/custom-fields#schemas) is a set of Custom Fields which can be set on an incident.
//
// ## Migration
//
// This resource has no currently functional counterpart. Custom Fields on Incidents are now applied globally
// to incidents within an account and have no notion of a Field Schema.
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
//			_, err = pagerduty.NewCustomFieldSchema(ctx, "mySchema", &pagerduty.CustomFieldSchemaArgs{
//				Description: pulumi.String("Fields used on incidents"),
//				Title:       pulumi.String("My Schema"),
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
// Fields schemas can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/customFieldSchema:CustomFieldSchema my_schema PLBP09X
//
// ```
type CustomFieldSchema struct {
	pulumi.CustomResourceState

	// The description of the field schema.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The title of the field schema.
	Title pulumi.StringOutput `pulumi:"title"`
}

// NewCustomFieldSchema registers a new resource with the given unique name, arguments, and options.
func NewCustomFieldSchema(ctx *pulumi.Context,
	name string, args *CustomFieldSchemaArgs, opts ...pulumi.ResourceOption) (*CustomFieldSchema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	var resource CustomFieldSchema
	err := ctx.RegisterResource("pagerduty:index/customFieldSchema:CustomFieldSchema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomFieldSchema gets an existing CustomFieldSchema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomFieldSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomFieldSchemaState, opts ...pulumi.ResourceOption) (*CustomFieldSchema, error) {
	var resource CustomFieldSchema
	err := ctx.ReadResource("pagerduty:index/customFieldSchema:CustomFieldSchema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomFieldSchema resources.
type customFieldSchemaState struct {
	// The description of the field schema.
	Description *string `pulumi:"description"`
	// The title of the field schema.
	Title *string `pulumi:"title"`
}

type CustomFieldSchemaState struct {
	// The description of the field schema.
	Description pulumi.StringPtrInput
	// The title of the field schema.
	Title pulumi.StringPtrInput
}

func (CustomFieldSchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*customFieldSchemaState)(nil)).Elem()
}

type customFieldSchemaArgs struct {
	// The description of the field schema.
	Description *string `pulumi:"description"`
	// The title of the field schema.
	Title string `pulumi:"title"`
}

// The set of arguments for constructing a CustomFieldSchema resource.
type CustomFieldSchemaArgs struct {
	// The description of the field schema.
	Description pulumi.StringPtrInput
	// The title of the field schema.
	Title pulumi.StringInput
}

func (CustomFieldSchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customFieldSchemaArgs)(nil)).Elem()
}

type CustomFieldSchemaInput interface {
	pulumi.Input

	ToCustomFieldSchemaOutput() CustomFieldSchemaOutput
	ToCustomFieldSchemaOutputWithContext(ctx context.Context) CustomFieldSchemaOutput
}

func (*CustomFieldSchema) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomFieldSchema)(nil)).Elem()
}

func (i *CustomFieldSchema) ToCustomFieldSchemaOutput() CustomFieldSchemaOutput {
	return i.ToCustomFieldSchemaOutputWithContext(context.Background())
}

func (i *CustomFieldSchema) ToCustomFieldSchemaOutputWithContext(ctx context.Context) CustomFieldSchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldSchemaOutput)
}

// CustomFieldSchemaArrayInput is an input type that accepts CustomFieldSchemaArray and CustomFieldSchemaArrayOutput values.
// You can construct a concrete instance of `CustomFieldSchemaArrayInput` via:
//
//	CustomFieldSchemaArray{ CustomFieldSchemaArgs{...} }
type CustomFieldSchemaArrayInput interface {
	pulumi.Input

	ToCustomFieldSchemaArrayOutput() CustomFieldSchemaArrayOutput
	ToCustomFieldSchemaArrayOutputWithContext(context.Context) CustomFieldSchemaArrayOutput
}

type CustomFieldSchemaArray []CustomFieldSchemaInput

func (CustomFieldSchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomFieldSchema)(nil)).Elem()
}

func (i CustomFieldSchemaArray) ToCustomFieldSchemaArrayOutput() CustomFieldSchemaArrayOutput {
	return i.ToCustomFieldSchemaArrayOutputWithContext(context.Background())
}

func (i CustomFieldSchemaArray) ToCustomFieldSchemaArrayOutputWithContext(ctx context.Context) CustomFieldSchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldSchemaArrayOutput)
}

// CustomFieldSchemaMapInput is an input type that accepts CustomFieldSchemaMap and CustomFieldSchemaMapOutput values.
// You can construct a concrete instance of `CustomFieldSchemaMapInput` via:
//
//	CustomFieldSchemaMap{ "key": CustomFieldSchemaArgs{...} }
type CustomFieldSchemaMapInput interface {
	pulumi.Input

	ToCustomFieldSchemaMapOutput() CustomFieldSchemaMapOutput
	ToCustomFieldSchemaMapOutputWithContext(context.Context) CustomFieldSchemaMapOutput
}

type CustomFieldSchemaMap map[string]CustomFieldSchemaInput

func (CustomFieldSchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomFieldSchema)(nil)).Elem()
}

func (i CustomFieldSchemaMap) ToCustomFieldSchemaMapOutput() CustomFieldSchemaMapOutput {
	return i.ToCustomFieldSchemaMapOutputWithContext(context.Background())
}

func (i CustomFieldSchemaMap) ToCustomFieldSchemaMapOutputWithContext(ctx context.Context) CustomFieldSchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomFieldSchemaMapOutput)
}

type CustomFieldSchemaOutput struct{ *pulumi.OutputState }

func (CustomFieldSchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomFieldSchema)(nil)).Elem()
}

func (o CustomFieldSchemaOutput) ToCustomFieldSchemaOutput() CustomFieldSchemaOutput {
	return o
}

func (o CustomFieldSchemaOutput) ToCustomFieldSchemaOutputWithContext(ctx context.Context) CustomFieldSchemaOutput {
	return o
}

// The description of the field schema.
func (o CustomFieldSchemaOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomFieldSchema) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The title of the field schema.
func (o CustomFieldSchemaOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomFieldSchema) pulumi.StringOutput { return v.Title }).(pulumi.StringOutput)
}

type CustomFieldSchemaArrayOutput struct{ *pulumi.OutputState }

func (CustomFieldSchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomFieldSchema)(nil)).Elem()
}

func (o CustomFieldSchemaArrayOutput) ToCustomFieldSchemaArrayOutput() CustomFieldSchemaArrayOutput {
	return o
}

func (o CustomFieldSchemaArrayOutput) ToCustomFieldSchemaArrayOutputWithContext(ctx context.Context) CustomFieldSchemaArrayOutput {
	return o
}

func (o CustomFieldSchemaArrayOutput) Index(i pulumi.IntInput) CustomFieldSchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomFieldSchema {
		return vs[0].([]*CustomFieldSchema)[vs[1].(int)]
	}).(CustomFieldSchemaOutput)
}

type CustomFieldSchemaMapOutput struct{ *pulumi.OutputState }

func (CustomFieldSchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomFieldSchema)(nil)).Elem()
}

func (o CustomFieldSchemaMapOutput) ToCustomFieldSchemaMapOutput() CustomFieldSchemaMapOutput {
	return o
}

func (o CustomFieldSchemaMapOutput) ToCustomFieldSchemaMapOutputWithContext(ctx context.Context) CustomFieldSchemaMapOutput {
	return o
}

func (o CustomFieldSchemaMapOutput) MapIndex(k pulumi.StringInput) CustomFieldSchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomFieldSchema {
		return vs[0].(map[string]*CustomFieldSchema)[vs[1].(string)]
	}).(CustomFieldSchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldSchemaInput)(nil)).Elem(), &CustomFieldSchema{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldSchemaArrayInput)(nil)).Elem(), CustomFieldSchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomFieldSchemaMapInput)(nil)).Elem(), CustomFieldSchemaMap{})
	pulumi.RegisterOutputType(CustomFieldSchemaOutput{})
	pulumi.RegisterOutputType(CustomFieldSchemaArrayOutput{})
	pulumi.RegisterOutputType(CustomFieldSchemaMapOutput{})
}
