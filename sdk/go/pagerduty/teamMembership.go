// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [team membership](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1teams~1%7Bid%7D~1users~1%7Buser_id%7D/put) manages memberships within a team.
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
// 		fooUser, err := pagerduty.NewUser(ctx, "fooUser", &pagerduty.UserArgs{
// 			Email: pulumi.String("foo@bar.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		fooTeam, err := pagerduty.NewTeam(ctx, "fooTeam", &pagerduty.TeamArgs{
// 			Description: pulumi.String("foo"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewTeamMembership(ctx, "fooTeamMembership", &pagerduty.TeamMembershipArgs{
// 			UserId: fooUser.ID(),
// 			TeamId: fooTeam.ID(),
// 			Role:   pulumi.String("manager"),
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
// Team memberships can be imported using the `user_id` and `team_id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/teamMembership:TeamMembership main PLBP09X:PLB09Z
// ```
type TeamMembership struct {
	pulumi.CustomResourceState

	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
	// These roles match up to user roles in the following ways:
	// * User role of `user` is a Team role of `manager`
	// * User role of `limitedUser` is a Team role of `responder`
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// The ID of the team in which the user will belong.
	TeamId pulumi.StringOutput `pulumi:"teamId"`
	// The ID of the user to add to the team.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewTeamMembership registers a new resource with the given unique name, arguments, and options.
func NewTeamMembership(ctx *pulumi.Context,
	name string, args *TeamMembershipArgs, opts ...pulumi.ResourceOption) (*TeamMembership, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TeamId == nil {
		return nil, errors.New("invalid value for required argument 'TeamId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	var resource TeamMembership
	err := ctx.RegisterResource("pagerduty:index/teamMembership:TeamMembership", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamMembership gets an existing TeamMembership resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamMembership(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamMembershipState, opts ...pulumi.ResourceOption) (*TeamMembership, error) {
	var resource TeamMembership
	err := ctx.ReadResource("pagerduty:index/teamMembership:TeamMembership", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamMembership resources.
type teamMembershipState struct {
	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
	// These roles match up to user roles in the following ways:
	// * User role of `user` is a Team role of `manager`
	// * User role of `limitedUser` is a Team role of `responder`
	Role *string `pulumi:"role"`
	// The ID of the team in which the user will belong.
	TeamId *string `pulumi:"teamId"`
	// The ID of the user to add to the team.
	UserId *string `pulumi:"userId"`
}

type TeamMembershipState struct {
	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
	// These roles match up to user roles in the following ways:
	// * User role of `user` is a Team role of `manager`
	// * User role of `limitedUser` is a Team role of `responder`
	Role pulumi.StringPtrInput
	// The ID of the team in which the user will belong.
	TeamId pulumi.StringPtrInput
	// The ID of the user to add to the team.
	UserId pulumi.StringPtrInput
}

func (TeamMembershipState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamMembershipState)(nil)).Elem()
}

type teamMembershipArgs struct {
	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
	// These roles match up to user roles in the following ways:
	// * User role of `user` is a Team role of `manager`
	// * User role of `limitedUser` is a Team role of `responder`
	Role *string `pulumi:"role"`
	// The ID of the team in which the user will belong.
	TeamId string `pulumi:"teamId"`
	// The ID of the user to add to the team.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a TeamMembership resource.
type TeamMembershipArgs struct {
	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
	// These roles match up to user roles in the following ways:
	// * User role of `user` is a Team role of `manager`
	// * User role of `limitedUser` is a Team role of `responder`
	Role pulumi.StringPtrInput
	// The ID of the team in which the user will belong.
	TeamId pulumi.StringInput
	// The ID of the user to add to the team.
	UserId pulumi.StringInput
}

func (TeamMembershipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamMembershipArgs)(nil)).Elem()
}

type TeamMembershipInput interface {
	pulumi.Input

	ToTeamMembershipOutput() TeamMembershipOutput
	ToTeamMembershipOutputWithContext(ctx context.Context) TeamMembershipOutput
}

func (*TeamMembership) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamMembership)(nil)).Elem()
}

func (i *TeamMembership) ToTeamMembershipOutput() TeamMembershipOutput {
	return i.ToTeamMembershipOutputWithContext(context.Background())
}

func (i *TeamMembership) ToTeamMembershipOutputWithContext(ctx context.Context) TeamMembershipOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamMembershipOutput)
}

// TeamMembershipArrayInput is an input type that accepts TeamMembershipArray and TeamMembershipArrayOutput values.
// You can construct a concrete instance of `TeamMembershipArrayInput` via:
//
//          TeamMembershipArray{ TeamMembershipArgs{...} }
type TeamMembershipArrayInput interface {
	pulumi.Input

	ToTeamMembershipArrayOutput() TeamMembershipArrayOutput
	ToTeamMembershipArrayOutputWithContext(context.Context) TeamMembershipArrayOutput
}

type TeamMembershipArray []TeamMembershipInput

func (TeamMembershipArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamMembership)(nil)).Elem()
}

func (i TeamMembershipArray) ToTeamMembershipArrayOutput() TeamMembershipArrayOutput {
	return i.ToTeamMembershipArrayOutputWithContext(context.Background())
}

func (i TeamMembershipArray) ToTeamMembershipArrayOutputWithContext(ctx context.Context) TeamMembershipArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamMembershipArrayOutput)
}

// TeamMembershipMapInput is an input type that accepts TeamMembershipMap and TeamMembershipMapOutput values.
// You can construct a concrete instance of `TeamMembershipMapInput` via:
//
//          TeamMembershipMap{ "key": TeamMembershipArgs{...} }
type TeamMembershipMapInput interface {
	pulumi.Input

	ToTeamMembershipMapOutput() TeamMembershipMapOutput
	ToTeamMembershipMapOutputWithContext(context.Context) TeamMembershipMapOutput
}

type TeamMembershipMap map[string]TeamMembershipInput

func (TeamMembershipMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamMembership)(nil)).Elem()
}

func (i TeamMembershipMap) ToTeamMembershipMapOutput() TeamMembershipMapOutput {
	return i.ToTeamMembershipMapOutputWithContext(context.Background())
}

func (i TeamMembershipMap) ToTeamMembershipMapOutputWithContext(ctx context.Context) TeamMembershipMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamMembershipMapOutput)
}

type TeamMembershipOutput struct{ *pulumi.OutputState }

func (TeamMembershipOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamMembership)(nil)).Elem()
}

func (o TeamMembershipOutput) ToTeamMembershipOutput() TeamMembershipOutput {
	return o
}

func (o TeamMembershipOutput) ToTeamMembershipOutputWithContext(ctx context.Context) TeamMembershipOutput {
	return o
}

type TeamMembershipArrayOutput struct{ *pulumi.OutputState }

func (TeamMembershipArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamMembership)(nil)).Elem()
}

func (o TeamMembershipArrayOutput) ToTeamMembershipArrayOutput() TeamMembershipArrayOutput {
	return o
}

func (o TeamMembershipArrayOutput) ToTeamMembershipArrayOutputWithContext(ctx context.Context) TeamMembershipArrayOutput {
	return o
}

func (o TeamMembershipArrayOutput) Index(i pulumi.IntInput) TeamMembershipOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamMembership {
		return vs[0].([]*TeamMembership)[vs[1].(int)]
	}).(TeamMembershipOutput)
}

type TeamMembershipMapOutput struct{ *pulumi.OutputState }

func (TeamMembershipMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamMembership)(nil)).Elem()
}

func (o TeamMembershipMapOutput) ToTeamMembershipMapOutput() TeamMembershipMapOutput {
	return o
}

func (o TeamMembershipMapOutput) ToTeamMembershipMapOutputWithContext(ctx context.Context) TeamMembershipMapOutput {
	return o
}

func (o TeamMembershipMapOutput) MapIndex(k pulumi.StringInput) TeamMembershipOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamMembership {
		return vs[0].(map[string]*TeamMembership)[vs[1].(string)]
	}).(TeamMembershipOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamMembershipInput)(nil)).Elem(), &TeamMembership{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamMembershipArrayInput)(nil)).Elem(), TeamMembershipArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamMembershipMapInput)(nil)).Elem(), TeamMembershipMap{})
	pulumi.RegisterOutputType(TeamMembershipOutput{})
	pulumi.RegisterOutputType(TeamMembershipArrayOutput{})
	pulumi.RegisterOutputType(TeamMembershipMapOutput{})
}
