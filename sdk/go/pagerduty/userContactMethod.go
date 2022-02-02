// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [contact method](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1users~1%7Bid%7D~1contact_methods/get) is a contact method for a PagerDuty user (email, phone or SMS).
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
// 		example, err := pagerduty.NewUser(ctx, "example", &pagerduty.UserArgs{
// 			Email: pulumi.String("125.greenholt.earline@graham.name"),
// 			Teams: pulumi.StringArray{
// 				pulumi.Any(pagerduty_team.Example.Id),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewUserContactMethod(ctx, "email", &pagerduty.UserContactMethodArgs{
// 			UserId:  example.ID(),
// 			Type:    pulumi.String("email_contact_method"),
// 			Address: pulumi.String("foo@bar.com"),
// 			Label:   pulumi.String("Work"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewUserContactMethod(ctx, "phone", &pagerduty.UserContactMethodArgs{
// 			UserId:      example.ID(),
// 			Type:        pulumi.String("phone_contact_method"),
// 			CountryCode: pulumi.Int(1),
// 			Address:     pulumi.String("2025550199"),
// 			Label:       pulumi.String("Work"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewUserContactMethod(ctx, "sms", &pagerduty.UserContactMethodArgs{
// 			UserId:      example.ID(),
// 			Type:        pulumi.String("sms_contact_method"),
// 			CountryCode: pulumi.Int(1),
// 			Address:     pulumi.String("2025550199"),
// 			Label:       pulumi.String("Work"),
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
// Contact methods can be imported using the `user_id` and the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/userContactMethod:UserContactMethod main PLBP09X:PLBP09X
// ```
type UserContactMethod struct {
	pulumi.CustomResourceState

	// The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
	Address pulumi.StringOutput `pulumi:"address"`
	// If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
	Blacklisted pulumi.BoolOutput `pulumi:"blacklisted"`
	// The 1-to-3 digit country calling code. Required when using `phoneContactMethod` or `smsContactMethod`.
	CountryCode pulumi.IntPtrOutput `pulumi:"countryCode"`
	// If true, this phone is capable of receiving SMS messages.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The label (e.g., "Work", "Mobile", etc.).
	Label pulumi.StringOutput `pulumi:"label"`
	// Send an abbreviated email message instead of the standard email output.
	SendShortEmail pulumi.BoolPtrOutput `pulumi:"sendShortEmail"`
	// The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
	Type pulumi.StringOutput `pulumi:"type"`
	// The ID of the user.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserContactMethod registers a new resource with the given unique name, arguments, and options.
func NewUserContactMethod(ctx *pulumi.Context,
	name string, args *UserContactMethodArgs, opts ...pulumi.ResourceOption) (*UserContactMethod, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Address == nil {
		return nil, errors.New("invalid value for required argument 'Address'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	var resource UserContactMethod
	err := ctx.RegisterResource("pagerduty:index/userContactMethod:UserContactMethod", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserContactMethod gets an existing UserContactMethod resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserContactMethod(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserContactMethodState, opts ...pulumi.ResourceOption) (*UserContactMethod, error) {
	var resource UserContactMethod
	err := ctx.ReadResource("pagerduty:index/userContactMethod:UserContactMethod", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserContactMethod resources.
type userContactMethodState struct {
	// The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
	Address *string `pulumi:"address"`
	// If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
	Blacklisted *bool `pulumi:"blacklisted"`
	// The 1-to-3 digit country calling code. Required when using `phoneContactMethod` or `smsContactMethod`.
	CountryCode *int `pulumi:"countryCode"`
	// If true, this phone is capable of receiving SMS messages.
	Enabled *bool `pulumi:"enabled"`
	// The label (e.g., "Work", "Mobile", etc.).
	Label *string `pulumi:"label"`
	// Send an abbreviated email message instead of the standard email output.
	SendShortEmail *bool `pulumi:"sendShortEmail"`
	// The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
	Type *string `pulumi:"type"`
	// The ID of the user.
	UserId *string `pulumi:"userId"`
}

type UserContactMethodState struct {
	// The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
	Address pulumi.StringPtrInput
	// If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
	Blacklisted pulumi.BoolPtrInput
	// The 1-to-3 digit country calling code. Required when using `phoneContactMethod` or `smsContactMethod`.
	CountryCode pulumi.IntPtrInput
	// If true, this phone is capable of receiving SMS messages.
	Enabled pulumi.BoolPtrInput
	// The label (e.g., "Work", "Mobile", etc.).
	Label pulumi.StringPtrInput
	// Send an abbreviated email message instead of the standard email output.
	SendShortEmail pulumi.BoolPtrInput
	// The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
	Type pulumi.StringPtrInput
	// The ID of the user.
	UserId pulumi.StringPtrInput
}

func (UserContactMethodState) ElementType() reflect.Type {
	return reflect.TypeOf((*userContactMethodState)(nil)).Elem()
}

type userContactMethodArgs struct {
	// The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
	Address string `pulumi:"address"`
	// The 1-to-3 digit country calling code. Required when using `phoneContactMethod` or `smsContactMethod`.
	CountryCode *int `pulumi:"countryCode"`
	// The label (e.g., "Work", "Mobile", etc.).
	Label string `pulumi:"label"`
	// Send an abbreviated email message instead of the standard email output.
	SendShortEmail *bool `pulumi:"sendShortEmail"`
	// The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
	Type string `pulumi:"type"`
	// The ID of the user.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserContactMethod resource.
type UserContactMethodArgs struct {
	// The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
	Address pulumi.StringInput
	// The 1-to-3 digit country calling code. Required when using `phoneContactMethod` or `smsContactMethod`.
	CountryCode pulumi.IntPtrInput
	// The label (e.g., "Work", "Mobile", etc.).
	Label pulumi.StringInput
	// Send an abbreviated email message instead of the standard email output.
	SendShortEmail pulumi.BoolPtrInput
	// The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
	Type pulumi.StringInput
	// The ID of the user.
	UserId pulumi.StringInput
}

func (UserContactMethodArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userContactMethodArgs)(nil)).Elem()
}

type UserContactMethodInput interface {
	pulumi.Input

	ToUserContactMethodOutput() UserContactMethodOutput
	ToUserContactMethodOutputWithContext(ctx context.Context) UserContactMethodOutput
}

func (*UserContactMethod) ElementType() reflect.Type {
	return reflect.TypeOf((**UserContactMethod)(nil)).Elem()
}

func (i *UserContactMethod) ToUserContactMethodOutput() UserContactMethodOutput {
	return i.ToUserContactMethodOutputWithContext(context.Background())
}

func (i *UserContactMethod) ToUserContactMethodOutputWithContext(ctx context.Context) UserContactMethodOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserContactMethodOutput)
}

// UserContactMethodArrayInput is an input type that accepts UserContactMethodArray and UserContactMethodArrayOutput values.
// You can construct a concrete instance of `UserContactMethodArrayInput` via:
//
//          UserContactMethodArray{ UserContactMethodArgs{...} }
type UserContactMethodArrayInput interface {
	pulumi.Input

	ToUserContactMethodArrayOutput() UserContactMethodArrayOutput
	ToUserContactMethodArrayOutputWithContext(context.Context) UserContactMethodArrayOutput
}

type UserContactMethodArray []UserContactMethodInput

func (UserContactMethodArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserContactMethod)(nil)).Elem()
}

func (i UserContactMethodArray) ToUserContactMethodArrayOutput() UserContactMethodArrayOutput {
	return i.ToUserContactMethodArrayOutputWithContext(context.Background())
}

func (i UserContactMethodArray) ToUserContactMethodArrayOutputWithContext(ctx context.Context) UserContactMethodArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserContactMethodArrayOutput)
}

// UserContactMethodMapInput is an input type that accepts UserContactMethodMap and UserContactMethodMapOutput values.
// You can construct a concrete instance of `UserContactMethodMapInput` via:
//
//          UserContactMethodMap{ "key": UserContactMethodArgs{...} }
type UserContactMethodMapInput interface {
	pulumi.Input

	ToUserContactMethodMapOutput() UserContactMethodMapOutput
	ToUserContactMethodMapOutputWithContext(context.Context) UserContactMethodMapOutput
}

type UserContactMethodMap map[string]UserContactMethodInput

func (UserContactMethodMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserContactMethod)(nil)).Elem()
}

func (i UserContactMethodMap) ToUserContactMethodMapOutput() UserContactMethodMapOutput {
	return i.ToUserContactMethodMapOutputWithContext(context.Background())
}

func (i UserContactMethodMap) ToUserContactMethodMapOutputWithContext(ctx context.Context) UserContactMethodMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserContactMethodMapOutput)
}

type UserContactMethodOutput struct{ *pulumi.OutputState }

func (UserContactMethodOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserContactMethod)(nil)).Elem()
}

func (o UserContactMethodOutput) ToUserContactMethodOutput() UserContactMethodOutput {
	return o
}

func (o UserContactMethodOutput) ToUserContactMethodOutputWithContext(ctx context.Context) UserContactMethodOutput {
	return o
}

type UserContactMethodArrayOutput struct{ *pulumi.OutputState }

func (UserContactMethodArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserContactMethod)(nil)).Elem()
}

func (o UserContactMethodArrayOutput) ToUserContactMethodArrayOutput() UserContactMethodArrayOutput {
	return o
}

func (o UserContactMethodArrayOutput) ToUserContactMethodArrayOutputWithContext(ctx context.Context) UserContactMethodArrayOutput {
	return o
}

func (o UserContactMethodArrayOutput) Index(i pulumi.IntInput) UserContactMethodOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserContactMethod {
		return vs[0].([]*UserContactMethod)[vs[1].(int)]
	}).(UserContactMethodOutput)
}

type UserContactMethodMapOutput struct{ *pulumi.OutputState }

func (UserContactMethodMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserContactMethod)(nil)).Elem()
}

func (o UserContactMethodMapOutput) ToUserContactMethodMapOutput() UserContactMethodMapOutput {
	return o
}

func (o UserContactMethodMapOutput) ToUserContactMethodMapOutputWithContext(ctx context.Context) UserContactMethodMapOutput {
	return o
}

func (o UserContactMethodMapOutput) MapIndex(k pulumi.StringInput) UserContactMethodOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserContactMethod {
		return vs[0].(map[string]*UserContactMethod)[vs[1].(string)]
	}).(UserContactMethodOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserContactMethodInput)(nil)).Elem(), &UserContactMethod{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserContactMethodArrayInput)(nil)).Elem(), UserContactMethodArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserContactMethodMapInput)(nil)).Elem(), UserContactMethodMap{})
	pulumi.RegisterOutputType(UserContactMethodOutput{})
	pulumi.RegisterOutputType(UserContactMethodArrayOutput{})
	pulumi.RegisterOutputType(UserContactMethodMapOutput{})
}
