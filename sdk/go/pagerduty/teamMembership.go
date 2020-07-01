// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// A [team membership](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Teams/put_teams_id_users_user_id) manages memberships within a team.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 			Role:   pulumi.String("manager"),
// 			TeamId: fooTeam.ID(),
// 			UserId: fooUser.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type TeamMembership struct {
	pulumi.CustomResourceState

	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// The ID of the team in which the user will belong.
	TeamId pulumi.StringOutput `pulumi:"teamId"`
	// The ID of the user to add to the team.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewTeamMembership registers a new resource with the given unique name, arguments, and options.
func NewTeamMembership(ctx *pulumi.Context,
	name string, args *TeamMembershipArgs, opts ...pulumi.ResourceOption) (*TeamMembership, error) {
	if args == nil || args.TeamId == nil {
		return nil, errors.New("missing required argument 'TeamId'")
	}
	if args == nil || args.UserId == nil {
		return nil, errors.New("missing required argument 'UserId'")
	}
	if args == nil {
		args = &TeamMembershipArgs{}
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
	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.
	Role *string `pulumi:"role"`
	// The ID of the team in which the user will belong.
	TeamId *string `pulumi:"teamId"`
	// The ID of the user to add to the team.
	UserId *string `pulumi:"userId"`
}

type TeamMembershipState struct {
	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.
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
	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.
	Role *string `pulumi:"role"`
	// The ID of the team in which the user will belong.
	TeamId string `pulumi:"teamId"`
	// The ID of the user to add to the team.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a TeamMembership resource.
type TeamMembershipArgs struct {
	// The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.
	Role pulumi.StringPtrInput
	// The ID of the team in which the user will belong.
	TeamId pulumi.StringInput
	// The ID of the user to add to the team.
	UserId pulumi.StringInput
}

func (TeamMembershipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamMembershipArgs)(nil)).Elem()
}
