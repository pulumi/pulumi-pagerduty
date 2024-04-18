// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwMA-assign-tags) is applied to Escalation Policies, Teams or Users and can be used to filter them.
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
//			example, err := pagerduty.NewTag(ctx, "example", &pagerduty.TagArgs{
//				Label: pulumi.String("API"),
//			})
//			if err != nil {
//				return err
//			}
//			engteam, err := pagerduty.NewTeam(ctx, "engteam", &pagerduty.TeamArgs{
//				Name: pulumi.String("Engineering"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewTagAssignment(ctx, "example", &pagerduty.TagAssignmentArgs{
//				TagId:      example.ID(),
//				EntityType: pulumi.String("teams"),
//				EntityId:   engteam.ID(),
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
//
// ## Import
//
// Tag assignments can be imported using the `id` which is constructed by taking the `entity` Type, `entity` ID and the `tag` ID separated by a dot, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/tagAssignment:TagAssignment main users.P7HHMVK.PYC7IQQ
// ```
type TagAssignment struct {
	pulumi.CustomResourceState

	// The ID of the entity.
	EntityId pulumi.StringOutput `pulumi:"entityId"`
	// Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
	EntityType pulumi.StringOutput `pulumi:"entityType"`
	// The ID of the tag.
	TagId pulumi.StringOutput `pulumi:"tagId"`
}

// NewTagAssignment registers a new resource with the given unique name, arguments, and options.
func NewTagAssignment(ctx *pulumi.Context,
	name string, args *TagAssignmentArgs, opts ...pulumi.ResourceOption) (*TagAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EntityId == nil {
		return nil, errors.New("invalid value for required argument 'EntityId'")
	}
	if args.EntityType == nil {
		return nil, errors.New("invalid value for required argument 'EntityType'")
	}
	if args.TagId == nil {
		return nil, errors.New("invalid value for required argument 'TagId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TagAssignment
	err := ctx.RegisterResource("pagerduty:index/tagAssignment:TagAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTagAssignment gets an existing TagAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTagAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagAssignmentState, opts ...pulumi.ResourceOption) (*TagAssignment, error) {
	var resource TagAssignment
	err := ctx.ReadResource("pagerduty:index/tagAssignment:TagAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TagAssignment resources.
type tagAssignmentState struct {
	// The ID of the entity.
	EntityId *string `pulumi:"entityId"`
	// Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
	EntityType *string `pulumi:"entityType"`
	// The ID of the tag.
	TagId *string `pulumi:"tagId"`
}

type TagAssignmentState struct {
	// The ID of the entity.
	EntityId pulumi.StringPtrInput
	// Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
	EntityType pulumi.StringPtrInput
	// The ID of the tag.
	TagId pulumi.StringPtrInput
}

func (TagAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagAssignmentState)(nil)).Elem()
}

type tagAssignmentArgs struct {
	// The ID of the entity.
	EntityId string `pulumi:"entityId"`
	// Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
	EntityType string `pulumi:"entityType"`
	// The ID of the tag.
	TagId string `pulumi:"tagId"`
}

// The set of arguments for constructing a TagAssignment resource.
type TagAssignmentArgs struct {
	// The ID of the entity.
	EntityId pulumi.StringInput
	// Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
	EntityType pulumi.StringInput
	// The ID of the tag.
	TagId pulumi.StringInput
}

func (TagAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagAssignmentArgs)(nil)).Elem()
}

type TagAssignmentInput interface {
	pulumi.Input

	ToTagAssignmentOutput() TagAssignmentOutput
	ToTagAssignmentOutputWithContext(ctx context.Context) TagAssignmentOutput
}

func (*TagAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**TagAssignment)(nil)).Elem()
}

func (i *TagAssignment) ToTagAssignmentOutput() TagAssignmentOutput {
	return i.ToTagAssignmentOutputWithContext(context.Background())
}

func (i *TagAssignment) ToTagAssignmentOutputWithContext(ctx context.Context) TagAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagAssignmentOutput)
}

// TagAssignmentArrayInput is an input type that accepts TagAssignmentArray and TagAssignmentArrayOutput values.
// You can construct a concrete instance of `TagAssignmentArrayInput` via:
//
//	TagAssignmentArray{ TagAssignmentArgs{...} }
type TagAssignmentArrayInput interface {
	pulumi.Input

	ToTagAssignmentArrayOutput() TagAssignmentArrayOutput
	ToTagAssignmentArrayOutputWithContext(context.Context) TagAssignmentArrayOutput
}

type TagAssignmentArray []TagAssignmentInput

func (TagAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagAssignment)(nil)).Elem()
}

func (i TagAssignmentArray) ToTagAssignmentArrayOutput() TagAssignmentArrayOutput {
	return i.ToTagAssignmentArrayOutputWithContext(context.Background())
}

func (i TagAssignmentArray) ToTagAssignmentArrayOutputWithContext(ctx context.Context) TagAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagAssignmentArrayOutput)
}

// TagAssignmentMapInput is an input type that accepts TagAssignmentMap and TagAssignmentMapOutput values.
// You can construct a concrete instance of `TagAssignmentMapInput` via:
//
//	TagAssignmentMap{ "key": TagAssignmentArgs{...} }
type TagAssignmentMapInput interface {
	pulumi.Input

	ToTagAssignmentMapOutput() TagAssignmentMapOutput
	ToTagAssignmentMapOutputWithContext(context.Context) TagAssignmentMapOutput
}

type TagAssignmentMap map[string]TagAssignmentInput

func (TagAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagAssignment)(nil)).Elem()
}

func (i TagAssignmentMap) ToTagAssignmentMapOutput() TagAssignmentMapOutput {
	return i.ToTagAssignmentMapOutputWithContext(context.Background())
}

func (i TagAssignmentMap) ToTagAssignmentMapOutputWithContext(ctx context.Context) TagAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagAssignmentMapOutput)
}

type TagAssignmentOutput struct{ *pulumi.OutputState }

func (TagAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TagAssignment)(nil)).Elem()
}

func (o TagAssignmentOutput) ToTagAssignmentOutput() TagAssignmentOutput {
	return o
}

func (o TagAssignmentOutput) ToTagAssignmentOutputWithContext(ctx context.Context) TagAssignmentOutput {
	return o
}

// The ID of the entity.
func (o TagAssignmentOutput) EntityId() pulumi.StringOutput {
	return o.ApplyT(func(v *TagAssignment) pulumi.StringOutput { return v.EntityId }).(pulumi.StringOutput)
}

// Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalationPolicies`.
func (o TagAssignmentOutput) EntityType() pulumi.StringOutput {
	return o.ApplyT(func(v *TagAssignment) pulumi.StringOutput { return v.EntityType }).(pulumi.StringOutput)
}

// The ID of the tag.
func (o TagAssignmentOutput) TagId() pulumi.StringOutput {
	return o.ApplyT(func(v *TagAssignment) pulumi.StringOutput { return v.TagId }).(pulumi.StringOutput)
}

type TagAssignmentArrayOutput struct{ *pulumi.OutputState }

func (TagAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagAssignment)(nil)).Elem()
}

func (o TagAssignmentArrayOutput) ToTagAssignmentArrayOutput() TagAssignmentArrayOutput {
	return o
}

func (o TagAssignmentArrayOutput) ToTagAssignmentArrayOutputWithContext(ctx context.Context) TagAssignmentArrayOutput {
	return o
}

func (o TagAssignmentArrayOutput) Index(i pulumi.IntInput) TagAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TagAssignment {
		return vs[0].([]*TagAssignment)[vs[1].(int)]
	}).(TagAssignmentOutput)
}

type TagAssignmentMapOutput struct{ *pulumi.OutputState }

func (TagAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagAssignment)(nil)).Elem()
}

func (o TagAssignmentMapOutput) ToTagAssignmentMapOutput() TagAssignmentMapOutput {
	return o
}

func (o TagAssignmentMapOutput) ToTagAssignmentMapOutputWithContext(ctx context.Context) TagAssignmentMapOutput {
	return o
}

func (o TagAssignmentMapOutput) MapIndex(k pulumi.StringInput) TagAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TagAssignment {
		return vs[0].(map[string]*TagAssignment)[vs[1].(string)]
	}).(TagAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagAssignmentInput)(nil)).Elem(), &TagAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagAssignmentArrayInput)(nil)).Elem(), TagAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagAssignmentMapInput)(nil)).Elem(), TagAssignmentMap{})
	pulumi.RegisterOutputType(TagAssignmentOutput{})
	pulumi.RegisterOutputType(TagAssignmentArrayOutput{})
	pulumi.RegisterOutputType(TagAssignmentMapOutput{})
}
