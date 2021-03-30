// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// A [user](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users) is a member of a PagerDuty account that have the ability to interact with incidents and other data on the account.
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
// 		_, err := pagerduty.NewUser(ctx, "example", &pagerduty.UserArgs{
// 			Email: pulumi.String("125.greenholt.earline@graham.name"),
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
// Users can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/user:User main PLBP09X
// ```
type User struct {
	pulumi.CustomResourceState

	// The URL of the user's avatar.
	AvatarUrl pulumi.StringOutput `pulumi:"avatarUrl"`
	// The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
	Color       pulumi.StringOutput    `pulumi:"color"`
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The user's email address.
	Email pulumi.StringOutput `pulumi:"email"`
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringOutput `pulumi:"htmlUrl"`
	// If true, the user has an outstanding invitation.
	InvitationSent pulumi.BoolOutput `pulumi:"invitationSent"`
	// The user's title.
	JobTitle pulumi.StringPtrOutput `pulumi:"jobTitle"`
	// The name of the user.
	Name pulumi.StringOutput `pulumi:"name"`
	// The user role. Account must have the `readOnlyUsers` ability to set a user as a `readOnlyUser` or a `readOnlyLimitedUser`, and must have advanced permissions abilities to set a user as `observer` or `restrictedAccess`.  Can be `admin`, `limitedUser`, `observer`, `owner`, `readOnlyUser`, `readOnlyLimitedUser`, `restrictedAccess`, or `user`.
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// A list of teams the user should belong to. Please use `TeamMembership` instead.
	//
	// Deprecated: Use the 'pagerduty_team_membership' resource instead.
	Teams pulumi.StringArrayOutput `pulumi:"teams"`
	// The time zone of the user. Default is account default timezone.
	TimeZone pulumi.StringOutput `pulumi:"timeZone"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	var resource User
	err := ctx.RegisterResource("pagerduty:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("pagerduty:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// The URL of the user's avatar.
	AvatarUrl *string `pulumi:"avatarUrl"`
	// The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
	Color       *string `pulumi:"color"`
	Description *string `pulumi:"description"`
	// The user's email address.
	Email *string `pulumi:"email"`
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl *string `pulumi:"htmlUrl"`
	// If true, the user has an outstanding invitation.
	InvitationSent *bool `pulumi:"invitationSent"`
	// The user's title.
	JobTitle *string `pulumi:"jobTitle"`
	// The name of the user.
	Name *string `pulumi:"name"`
	// The user role. Account must have the `readOnlyUsers` ability to set a user as a `readOnlyUser` or a `readOnlyLimitedUser`, and must have advanced permissions abilities to set a user as `observer` or `restrictedAccess`.  Can be `admin`, `limitedUser`, `observer`, `owner`, `readOnlyUser`, `readOnlyLimitedUser`, `restrictedAccess`, or `user`.
	Role *string `pulumi:"role"`
	// A list of teams the user should belong to. Please use `TeamMembership` instead.
	//
	// Deprecated: Use the 'pagerduty_team_membership' resource instead.
	Teams []string `pulumi:"teams"`
	// The time zone of the user. Default is account default timezone.
	TimeZone *string `pulumi:"timeZone"`
}

type UserState struct {
	// The URL of the user's avatar.
	AvatarUrl pulumi.StringPtrInput
	// The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
	Color       pulumi.StringPtrInput
	Description pulumi.StringPtrInput
	// The user's email address.
	Email pulumi.StringPtrInput
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringPtrInput
	// If true, the user has an outstanding invitation.
	InvitationSent pulumi.BoolPtrInput
	// The user's title.
	JobTitle pulumi.StringPtrInput
	// The name of the user.
	Name pulumi.StringPtrInput
	// The user role. Account must have the `readOnlyUsers` ability to set a user as a `readOnlyUser` or a `readOnlyLimitedUser`, and must have advanced permissions abilities to set a user as `observer` or `restrictedAccess`.  Can be `admin`, `limitedUser`, `observer`, `owner`, `readOnlyUser`, `readOnlyLimitedUser`, `restrictedAccess`, or `user`.
	Role pulumi.StringPtrInput
	// A list of teams the user should belong to. Please use `TeamMembership` instead.
	//
	// Deprecated: Use the 'pagerduty_team_membership' resource instead.
	Teams pulumi.StringArrayInput
	// The time zone of the user. Default is account default timezone.
	TimeZone pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
	Color       *string `pulumi:"color"`
	Description *string `pulumi:"description"`
	// The user's email address.
	Email string `pulumi:"email"`
	// The user's title.
	JobTitle *string `pulumi:"jobTitle"`
	// The name of the user.
	Name *string `pulumi:"name"`
	// The user role. Account must have the `readOnlyUsers` ability to set a user as a `readOnlyUser` or a `readOnlyLimitedUser`, and must have advanced permissions abilities to set a user as `observer` or `restrictedAccess`.  Can be `admin`, `limitedUser`, `observer`, `owner`, `readOnlyUser`, `readOnlyLimitedUser`, `restrictedAccess`, or `user`.
	Role *string `pulumi:"role"`
	// A list of teams the user should belong to. Please use `TeamMembership` instead.
	//
	// Deprecated: Use the 'pagerduty_team_membership' resource instead.
	Teams []string `pulumi:"teams"`
	// The time zone of the user. Default is account default timezone.
	TimeZone *string `pulumi:"timeZone"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
	Color       pulumi.StringPtrInput
	Description pulumi.StringPtrInput
	// The user's email address.
	Email pulumi.StringInput
	// The user's title.
	JobTitle pulumi.StringPtrInput
	// The name of the user.
	Name pulumi.StringPtrInput
	// The user role. Account must have the `readOnlyUsers` ability to set a user as a `readOnlyUser` or a `readOnlyLimitedUser`, and must have advanced permissions abilities to set a user as `observer` or `restrictedAccess`.  Can be `admin`, `limitedUser`, `observer`, `owner`, `readOnlyUser`, `readOnlyLimitedUser`, `restrictedAccess`, or `user`.
	Role pulumi.StringPtrInput
	// A list of teams the user should belong to. Please use `TeamMembership` instead.
	//
	// Deprecated: Use the 'pagerduty_team_membership' resource instead.
	Teams pulumi.StringArrayInput
	// The time zone of the user. Default is account default timezone.
	TimeZone pulumi.StringPtrInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((*User)(nil))
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

func (i *User) ToUserPtrOutput() UserPtrOutput {
	return i.ToUserPtrOutputWithContext(context.Background())
}

func (i *User) ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPtrOutput)
}

type UserPtrInput interface {
	pulumi.Input

	ToUserPtrOutput() UserPtrOutput
	ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput
}

type userPtrType UserArgs

func (*userPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil))
}

func (i *userPtrType) ToUserPtrOutput() UserPtrOutput {
	return i.ToUserPtrOutputWithContext(context.Background())
}

func (i *userPtrType) ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPtrOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//          UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*User)(nil))
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//          UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*User)(nil))
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct {
	*pulumi.OutputState
}

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*User)(nil))
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

func (o UserOutput) ToUserPtrOutput() UserPtrOutput {
	return o.ToUserPtrOutputWithContext(context.Background())
}

func (o UserOutput) ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput {
	return o.ApplyT(func(v User) *User {
		return &v
	}).(UserPtrOutput)
}

type UserPtrOutput struct {
	*pulumi.OutputState
}

func (UserPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil))
}

func (o UserPtrOutput) ToUserPtrOutput() UserPtrOutput {
	return o
}

func (o UserPtrOutput) ToUserPtrOutputWithContext(ctx context.Context) UserPtrOutput {
	return o
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]User)(nil))
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) User {
		return vs[0].([]User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]User)(nil))
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) User {
		return vs[0].(map[string]User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserPtrOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
