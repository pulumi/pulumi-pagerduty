// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIxNw-list-tags) is applied to Escalation Policies, Teams or Users and can be used to filter them.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := pagerduty.NewTag(ctx, "example", &pagerduty.TagArgs{
// 			Label: pulumi.String("Product"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Tags can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/tag:Tag main PLBP09X
// ```
type Tag struct {
	pulumi.CustomResourceState

	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringOutput `pulumi:"htmlUrl"`
	// The label of the tag.
	Label   pulumi.StringOutput `pulumi:"label"`
	Summary pulumi.StringOutput `pulumi:"summary"`
}

// NewTag registers a new resource with the given unique name, arguments, and options.
func NewTag(ctx *pulumi.Context,
	name string, args *TagArgs, opts ...pulumi.ResourceOption) (*Tag, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	var resource Tag
	err := ctx.RegisterResource("pagerduty:index/tag:Tag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTag gets an existing Tag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagState, opts ...pulumi.ResourceOption) (*Tag, error) {
	var resource Tag
	err := ctx.ReadResource("pagerduty:index/tag:Tag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tag resources.
type tagState struct {
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl *string `pulumi:"htmlUrl"`
	// The label of the tag.
	Label   *string `pulumi:"label"`
	Summary *string `pulumi:"summary"`
}

type TagState struct {
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringPtrInput
	// The label of the tag.
	Label   pulumi.StringPtrInput
	Summary pulumi.StringPtrInput
}

func (TagState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagState)(nil)).Elem()
}

type tagArgs struct {
	// The label of the tag.
	Label string `pulumi:"label"`
}

// The set of arguments for constructing a Tag resource.
type TagArgs struct {
	// The label of the tag.
	Label pulumi.StringInput
}

func (TagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagArgs)(nil)).Elem()
}

type TagInput interface {
	pulumi.Input

	ToTagOutput() TagOutput
	ToTagOutputWithContext(ctx context.Context) TagOutput
}

func (*Tag) ElementType() reflect.Type {
	return reflect.TypeOf((*Tag)(nil))
}

func (i *Tag) ToTagOutput() TagOutput {
	return i.ToTagOutputWithContext(context.Background())
}

func (i *Tag) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagOutput)
}

func (i *Tag) ToTagPtrOutput() TagPtrOutput {
	return i.ToTagPtrOutputWithContext(context.Background())
}

func (i *Tag) ToTagPtrOutputWithContext(ctx context.Context) TagPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagPtrOutput)
}

type TagPtrInput interface {
	pulumi.Input

	ToTagPtrOutput() TagPtrOutput
	ToTagPtrOutputWithContext(ctx context.Context) TagPtrOutput
}

type tagPtrType TagArgs

func (*tagPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil))
}

func (i *tagPtrType) ToTagPtrOutput() TagPtrOutput {
	return i.ToTagPtrOutputWithContext(context.Background())
}

func (i *tagPtrType) ToTagPtrOutputWithContext(ctx context.Context) TagPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagPtrOutput)
}

// TagArrayInput is an input type that accepts TagArray and TagArrayOutput values.
// You can construct a concrete instance of `TagArrayInput` via:
//
//          TagArray{ TagArgs{...} }
type TagArrayInput interface {
	pulumi.Input

	ToTagArrayOutput() TagArrayOutput
	ToTagArrayOutputWithContext(context.Context) TagArrayOutput
}

type TagArray []TagInput

func (TagArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Tag)(nil))
}

func (i TagArray) ToTagArrayOutput() TagArrayOutput {
	return i.ToTagArrayOutputWithContext(context.Background())
}

func (i TagArray) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagArrayOutput)
}

// TagMapInput is an input type that accepts TagMap and TagMapOutput values.
// You can construct a concrete instance of `TagMapInput` via:
//
//          TagMap{ "key": TagArgs{...} }
type TagMapInput interface {
	pulumi.Input

	ToTagMapOutput() TagMapOutput
	ToTagMapOutputWithContext(context.Context) TagMapOutput
}

type TagMap map[string]TagInput

func (TagMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Tag)(nil))
}

func (i TagMap) ToTagMapOutput() TagMapOutput {
	return i.ToTagMapOutputWithContext(context.Background())
}

func (i TagMap) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagMapOutput)
}

type TagOutput struct {
	*pulumi.OutputState
}

func (TagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Tag)(nil))
}

func (o TagOutput) ToTagOutput() TagOutput {
	return o
}

func (o TagOutput) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return o
}

func (o TagOutput) ToTagPtrOutput() TagPtrOutput {
	return o.ToTagPtrOutputWithContext(context.Background())
}

func (o TagOutput) ToTagPtrOutputWithContext(ctx context.Context) TagPtrOutput {
	return o.ApplyT(func(v Tag) *Tag {
		return &v
	}).(TagPtrOutput)
}

type TagPtrOutput struct {
	*pulumi.OutputState
}

func (TagPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil))
}

func (o TagPtrOutput) ToTagPtrOutput() TagPtrOutput {
	return o
}

func (o TagPtrOutput) ToTagPtrOutputWithContext(ctx context.Context) TagPtrOutput {
	return o
}

type TagArrayOutput struct{ *pulumi.OutputState }

func (TagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Tag)(nil))
}

func (o TagArrayOutput) ToTagArrayOutput() TagArrayOutput {
	return o
}

func (o TagArrayOutput) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return o
}

func (o TagArrayOutput) Index(i pulumi.IntInput) TagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Tag {
		return vs[0].([]Tag)[vs[1].(int)]
	}).(TagOutput)
}

type TagMapOutput struct{ *pulumi.OutputState }

func (TagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Tag)(nil))
}

func (o TagMapOutput) ToTagMapOutput() TagMapOutput {
	return o
}

func (o TagMapOutput) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return o
}

func (o TagMapOutput) MapIndex(k pulumi.StringInput) TagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Tag {
		return vs[0].(map[string]Tag)[vs[1].(string)]
	}).(TagOutput)
}

func init() {
	pulumi.RegisterOutputType(TagOutput{})
	pulumi.RegisterOutputType(TagPtrOutput{})
	pulumi.RegisterOutputType(TagArrayOutput{})
	pulumi.RegisterOutputType(TagMapOutput{})
}
