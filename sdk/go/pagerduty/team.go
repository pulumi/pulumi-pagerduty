// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// A [team](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Teams/get_teams) is a collection of users and escalation policies that represent a group of people within an organization.
//
// The account must have the `teams` ability to use the following resource.
//
// ## Import
//
// Teams can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/team:Team main PLBP09X
// ```
type Team struct {
	pulumi.CustomResourceState

	Description pulumi.StringPtrOutput `pulumi:"description"`
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringOutput `pulumi:"htmlUrl"`
	// The name of the group.
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
	Parent pulumi.StringPtrOutput `pulumi:"parent"`
}

// NewTeam registers a new resource with the given unique name, arguments, and options.
func NewTeam(ctx *pulumi.Context,
	name string, args *TeamArgs, opts ...pulumi.ResourceOption) (*Team, error) {
	if args == nil {
		args = &TeamArgs{}
	}

	var resource Team
	err := ctx.RegisterResource("pagerduty:index/team:Team", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeam gets an existing Team resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeam(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamState, opts ...pulumi.ResourceOption) (*Team, error) {
	var resource Team
	err := ctx.ReadResource("pagerduty:index/team:Team", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Team resources.
type teamState struct {
	Description *string `pulumi:"description"`
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl *string `pulumi:"htmlUrl"`
	// The name of the group.
	Name *string `pulumi:"name"`
	// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
	Parent *string `pulumi:"parent"`
}

type TeamState struct {
	Description pulumi.StringPtrInput
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringPtrInput
	// The name of the group.
	Name pulumi.StringPtrInput
	// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
	Parent pulumi.StringPtrInput
}

func (TeamState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamState)(nil)).Elem()
}

type teamArgs struct {
	Description *string `pulumi:"description"`
	// The name of the group.
	Name *string `pulumi:"name"`
	// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
	Parent *string `pulumi:"parent"`
}

// The set of arguments for constructing a Team resource.
type TeamArgs struct {
	Description pulumi.StringPtrInput
	// The name of the group.
	Name pulumi.StringPtrInput
	// ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
	Parent pulumi.StringPtrInput
}

func (TeamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamArgs)(nil)).Elem()
}

type TeamInput interface {
	pulumi.Input

	ToTeamOutput() TeamOutput
	ToTeamOutputWithContext(ctx context.Context) TeamOutput
}

func (*Team) ElementType() reflect.Type {
	return reflect.TypeOf((*Team)(nil))
}

func (i *Team) ToTeamOutput() TeamOutput {
	return i.ToTeamOutputWithContext(context.Background())
}

func (i *Team) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamOutput)
}

func (i *Team) ToTeamPtrOutput() TeamPtrOutput {
	return i.ToTeamPtrOutputWithContext(context.Background())
}

func (i *Team) ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamPtrOutput)
}

type TeamPtrInput interface {
	pulumi.Input

	ToTeamPtrOutput() TeamPtrOutput
	ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput
}

type teamPtrType TeamArgs

func (*teamPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Team)(nil))
}

func (i *teamPtrType) ToTeamPtrOutput() TeamPtrOutput {
	return i.ToTeamPtrOutputWithContext(context.Background())
}

func (i *teamPtrType) ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamPtrOutput)
}

// TeamArrayInput is an input type that accepts TeamArray and TeamArrayOutput values.
// You can construct a concrete instance of `TeamArrayInput` via:
//
//          TeamArray{ TeamArgs{...} }
type TeamArrayInput interface {
	pulumi.Input

	ToTeamArrayOutput() TeamArrayOutput
	ToTeamArrayOutputWithContext(context.Context) TeamArrayOutput
}

type TeamArray []TeamInput

func (TeamArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Team)(nil))
}

func (i TeamArray) ToTeamArrayOutput() TeamArrayOutput {
	return i.ToTeamArrayOutputWithContext(context.Background())
}

func (i TeamArray) ToTeamArrayOutputWithContext(ctx context.Context) TeamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamArrayOutput)
}

// TeamMapInput is an input type that accepts TeamMap and TeamMapOutput values.
// You can construct a concrete instance of `TeamMapInput` via:
//
//          TeamMap{ "key": TeamArgs{...} }
type TeamMapInput interface {
	pulumi.Input

	ToTeamMapOutput() TeamMapOutput
	ToTeamMapOutputWithContext(context.Context) TeamMapOutput
}

type TeamMap map[string]TeamInput

func (TeamMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Team)(nil))
}

func (i TeamMap) ToTeamMapOutput() TeamMapOutput {
	return i.ToTeamMapOutputWithContext(context.Background())
}

func (i TeamMap) ToTeamMapOutputWithContext(ctx context.Context) TeamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamMapOutput)
}

type TeamOutput struct {
	*pulumi.OutputState
}

func (TeamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Team)(nil))
}

func (o TeamOutput) ToTeamOutput() TeamOutput {
	return o
}

func (o TeamOutput) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return o
}

func (o TeamOutput) ToTeamPtrOutput() TeamPtrOutput {
	return o.ToTeamPtrOutputWithContext(context.Background())
}

func (o TeamOutput) ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput {
	return o.ApplyT(func(v Team) *Team {
		return &v
	}).(TeamPtrOutput)
}

type TeamPtrOutput struct {
	*pulumi.OutputState
}

func (TeamPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Team)(nil))
}

func (o TeamPtrOutput) ToTeamPtrOutput() TeamPtrOutput {
	return o
}

func (o TeamPtrOutput) ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput {
	return o
}

type TeamArrayOutput struct{ *pulumi.OutputState }

func (TeamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Team)(nil))
}

func (o TeamArrayOutput) ToTeamArrayOutput() TeamArrayOutput {
	return o
}

func (o TeamArrayOutput) ToTeamArrayOutputWithContext(ctx context.Context) TeamArrayOutput {
	return o
}

func (o TeamArrayOutput) Index(i pulumi.IntInput) TeamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Team {
		return vs[0].([]Team)[vs[1].(int)]
	}).(TeamOutput)
}

type TeamMapOutput struct{ *pulumi.OutputState }

func (TeamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Team)(nil))
}

func (o TeamMapOutput) ToTeamMapOutput() TeamMapOutput {
	return o
}

func (o TeamMapOutput) ToTeamMapOutputWithContext(ctx context.Context) TeamMapOutput {
	return o
}

func (o TeamMapOutput) MapIndex(k pulumi.StringInput) TeamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Team {
		return vs[0].(map[string]Team)[vs[1].(string)]
	}).(TeamOutput)
}

func init() {
	pulumi.RegisterOutputType(TeamOutput{})
	pulumi.RegisterOutputType(TeamPtrOutput{})
	pulumi.RegisterOutputType(TeamArrayOutput{})
	pulumi.RegisterOutputType(TeamMapOutput{})
}
