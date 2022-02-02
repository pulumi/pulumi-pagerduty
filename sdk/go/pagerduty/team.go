// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [team](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1teams/get) is a collection of users and escalation policies that represent a group of people within an organization.
//
// The account must have the `teams` ability to use the following resource.
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
// 		parent, err := pagerduty.NewTeam(ctx, "parent", &pagerduty.TeamArgs{
// 			Description: pulumi.String("Product and Engineering"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewTeam(ctx, "example", &pagerduty.TeamArgs{
// 			Description: pulumi.String("All engineering"),
// 			Parent:      parent.ID(),
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
// Teams can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/team:Team main PLBP09X
// ```
type Team struct {
	pulumi.CustomResourceState

	Description pulumi.StringOutput `pulumi:"description"`
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

	if isZero(args.Description) {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
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
	return reflect.TypeOf((**Team)(nil)).Elem()
}

func (i *Team) ToTeamOutput() TeamOutput {
	return i.ToTeamOutputWithContext(context.Background())
}

func (i *Team) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamOutput)
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
	return reflect.TypeOf((*[]*Team)(nil)).Elem()
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
	return reflect.TypeOf((*map[string]*Team)(nil)).Elem()
}

func (i TeamMap) ToTeamMapOutput() TeamMapOutput {
	return i.ToTeamMapOutputWithContext(context.Background())
}

func (i TeamMap) ToTeamMapOutputWithContext(ctx context.Context) TeamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamMapOutput)
}

type TeamOutput struct{ *pulumi.OutputState }

func (TeamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Team)(nil)).Elem()
}

func (o TeamOutput) ToTeamOutput() TeamOutput {
	return o
}

func (o TeamOutput) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return o
}

type TeamArrayOutput struct{ *pulumi.OutputState }

func (TeamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Team)(nil)).Elem()
}

func (o TeamArrayOutput) ToTeamArrayOutput() TeamArrayOutput {
	return o
}

func (o TeamArrayOutput) ToTeamArrayOutputWithContext(ctx context.Context) TeamArrayOutput {
	return o
}

func (o TeamArrayOutput) Index(i pulumi.IntInput) TeamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Team {
		return vs[0].([]*Team)[vs[1].(int)]
	}).(TeamOutput)
}

type TeamMapOutput struct{ *pulumi.OutputState }

func (TeamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Team)(nil)).Elem()
}

func (o TeamMapOutput) ToTeamMapOutput() TeamMapOutput {
	return o
}

func (o TeamMapOutput) ToTeamMapOutputWithContext(ctx context.Context) TeamMapOutput {
	return o
}

func (o TeamMapOutput) MapIndex(k pulumi.StringInput) TeamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Team {
		return vs[0].(map[string]*Team)[vs[1].(string)]
	}).(TeamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamInput)(nil)).Elem(), &Team{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamArrayInput)(nil)).Elem(), TeamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamMapInput)(nil)).Elem(), TeamMap{})
	pulumi.RegisterOutputType(TeamOutput{})
	pulumi.RegisterOutputType(TeamArrayOutput{})
	pulumi.RegisterOutputType(TeamMapOutput{})
}
