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

// An [user handoff notification rule](https://developer.pagerduty.com/api-reference/f2ab7a3c1418a-create-a-user-handoff-notification-rule) is a rule that specifies how a user should be notified when they are handed off an incident.
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
//			example, err := pagerduty.NewUser(ctx, "example", &pagerduty.UserArgs{
//				Name:  pulumi.String("Earline Greenholt"),
//				Email: pulumi.String("125.greenholt.earline@foo.test"),
//			})
//			if err != nil {
//				return err
//			}
//			phone, err := pagerduty.NewUserContactMethod(ctx, "phone", &pagerduty.UserContactMethodArgs{
//				UserId:      example.ID(),
//				Type:        pulumi.String("phone_contact_method"),
//				CountryCode: pulumi.Int(1),
//				Address:     pulumi.String("2025550199"),
//				Label:       pulumi.String("Work"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewUserHandoffNotificationRule(ctx, "example-oncall-offcall", &pagerduty.UserHandoffNotificationRuleArgs{
//				UserId:                 example.ID(),
//				HandoffType:            pulumi.String("both"),
//				NotifyAdvanceInMinutes: pulumi.Int(180),
//				ContactMethod: &pagerduty.UserHandoffNotificationRuleContactMethodArgs{
//					Id:   phone.ID(),
//					Type: phone.Type,
//				},
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
// User handoff notification rules can be imported using the `user_id` and `id` separated by a dot, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/userHandoffNotificationRule:UserHandoffNotificationRule main PX4IAP4.PULREBP
// ```
type UserHandoffNotificationRule struct {
	pulumi.CustomResourceState

	// The contact method to notify the user. Contact method documented below.
	ContactMethod UserHandoffNotificationRuleContactMethodOutput `pulumi:"contactMethod"`
	// The type of handoff to notify the user about. Possible values are `oncall`, `offcall`, `both`.
	HandoffType pulumi.StringOutput `pulumi:"handoffType"`
	// The number of minutes before the handoff that the user should be notified. Must be a positive integer greater than or equal to 0.
	NotifyAdvanceInMinutes pulumi.IntOutput `pulumi:"notifyAdvanceInMinutes"`
	// The ID of the user.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserHandoffNotificationRule registers a new resource with the given unique name, arguments, and options.
func NewUserHandoffNotificationRule(ctx *pulumi.Context,
	name string, args *UserHandoffNotificationRuleArgs, opts ...pulumi.ResourceOption) (*UserHandoffNotificationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContactMethod == nil {
		return nil, errors.New("invalid value for required argument 'ContactMethod'")
	}
	if args.NotifyAdvanceInMinutes == nil {
		return nil, errors.New("invalid value for required argument 'NotifyAdvanceInMinutes'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserHandoffNotificationRule
	err := ctx.RegisterResource("pagerduty:index/userHandoffNotificationRule:UserHandoffNotificationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserHandoffNotificationRule gets an existing UserHandoffNotificationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserHandoffNotificationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserHandoffNotificationRuleState, opts ...pulumi.ResourceOption) (*UserHandoffNotificationRule, error) {
	var resource UserHandoffNotificationRule
	err := ctx.ReadResource("pagerduty:index/userHandoffNotificationRule:UserHandoffNotificationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserHandoffNotificationRule resources.
type userHandoffNotificationRuleState struct {
	// The contact method to notify the user. Contact method documented below.
	ContactMethod *UserHandoffNotificationRuleContactMethod `pulumi:"contactMethod"`
	// The type of handoff to notify the user about. Possible values are `oncall`, `offcall`, `both`.
	HandoffType *string `pulumi:"handoffType"`
	// The number of minutes before the handoff that the user should be notified. Must be a positive integer greater than or equal to 0.
	NotifyAdvanceInMinutes *int `pulumi:"notifyAdvanceInMinutes"`
	// The ID of the user.
	UserId *string `pulumi:"userId"`
}

type UserHandoffNotificationRuleState struct {
	// The contact method to notify the user. Contact method documented below.
	ContactMethod UserHandoffNotificationRuleContactMethodPtrInput
	// The type of handoff to notify the user about. Possible values are `oncall`, `offcall`, `both`.
	HandoffType pulumi.StringPtrInput
	// The number of minutes before the handoff that the user should be notified. Must be a positive integer greater than or equal to 0.
	NotifyAdvanceInMinutes pulumi.IntPtrInput
	// The ID of the user.
	UserId pulumi.StringPtrInput
}

func (UserHandoffNotificationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*userHandoffNotificationRuleState)(nil)).Elem()
}

type userHandoffNotificationRuleArgs struct {
	// The contact method to notify the user. Contact method documented below.
	ContactMethod UserHandoffNotificationRuleContactMethod `pulumi:"contactMethod"`
	// The type of handoff to notify the user about. Possible values are `oncall`, `offcall`, `both`.
	HandoffType *string `pulumi:"handoffType"`
	// The number of minutes before the handoff that the user should be notified. Must be a positive integer greater than or equal to 0.
	NotifyAdvanceInMinutes int `pulumi:"notifyAdvanceInMinutes"`
	// The ID of the user.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserHandoffNotificationRule resource.
type UserHandoffNotificationRuleArgs struct {
	// The contact method to notify the user. Contact method documented below.
	ContactMethod UserHandoffNotificationRuleContactMethodInput
	// The type of handoff to notify the user about. Possible values are `oncall`, `offcall`, `both`.
	HandoffType pulumi.StringPtrInput
	// The number of minutes before the handoff that the user should be notified. Must be a positive integer greater than or equal to 0.
	NotifyAdvanceInMinutes pulumi.IntInput
	// The ID of the user.
	UserId pulumi.StringInput
}

func (UserHandoffNotificationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userHandoffNotificationRuleArgs)(nil)).Elem()
}

type UserHandoffNotificationRuleInput interface {
	pulumi.Input

	ToUserHandoffNotificationRuleOutput() UserHandoffNotificationRuleOutput
	ToUserHandoffNotificationRuleOutputWithContext(ctx context.Context) UserHandoffNotificationRuleOutput
}

func (*UserHandoffNotificationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**UserHandoffNotificationRule)(nil)).Elem()
}

func (i *UserHandoffNotificationRule) ToUserHandoffNotificationRuleOutput() UserHandoffNotificationRuleOutput {
	return i.ToUserHandoffNotificationRuleOutputWithContext(context.Background())
}

func (i *UserHandoffNotificationRule) ToUserHandoffNotificationRuleOutputWithContext(ctx context.Context) UserHandoffNotificationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserHandoffNotificationRuleOutput)
}

// UserHandoffNotificationRuleArrayInput is an input type that accepts UserHandoffNotificationRuleArray and UserHandoffNotificationRuleArrayOutput values.
// You can construct a concrete instance of `UserHandoffNotificationRuleArrayInput` via:
//
//	UserHandoffNotificationRuleArray{ UserHandoffNotificationRuleArgs{...} }
type UserHandoffNotificationRuleArrayInput interface {
	pulumi.Input

	ToUserHandoffNotificationRuleArrayOutput() UserHandoffNotificationRuleArrayOutput
	ToUserHandoffNotificationRuleArrayOutputWithContext(context.Context) UserHandoffNotificationRuleArrayOutput
}

type UserHandoffNotificationRuleArray []UserHandoffNotificationRuleInput

func (UserHandoffNotificationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserHandoffNotificationRule)(nil)).Elem()
}

func (i UserHandoffNotificationRuleArray) ToUserHandoffNotificationRuleArrayOutput() UserHandoffNotificationRuleArrayOutput {
	return i.ToUserHandoffNotificationRuleArrayOutputWithContext(context.Background())
}

func (i UserHandoffNotificationRuleArray) ToUserHandoffNotificationRuleArrayOutputWithContext(ctx context.Context) UserHandoffNotificationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserHandoffNotificationRuleArrayOutput)
}

// UserHandoffNotificationRuleMapInput is an input type that accepts UserHandoffNotificationRuleMap and UserHandoffNotificationRuleMapOutput values.
// You can construct a concrete instance of `UserHandoffNotificationRuleMapInput` via:
//
//	UserHandoffNotificationRuleMap{ "key": UserHandoffNotificationRuleArgs{...} }
type UserHandoffNotificationRuleMapInput interface {
	pulumi.Input

	ToUserHandoffNotificationRuleMapOutput() UserHandoffNotificationRuleMapOutput
	ToUserHandoffNotificationRuleMapOutputWithContext(context.Context) UserHandoffNotificationRuleMapOutput
}

type UserHandoffNotificationRuleMap map[string]UserHandoffNotificationRuleInput

func (UserHandoffNotificationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserHandoffNotificationRule)(nil)).Elem()
}

func (i UserHandoffNotificationRuleMap) ToUserHandoffNotificationRuleMapOutput() UserHandoffNotificationRuleMapOutput {
	return i.ToUserHandoffNotificationRuleMapOutputWithContext(context.Background())
}

func (i UserHandoffNotificationRuleMap) ToUserHandoffNotificationRuleMapOutputWithContext(ctx context.Context) UserHandoffNotificationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserHandoffNotificationRuleMapOutput)
}

type UserHandoffNotificationRuleOutput struct{ *pulumi.OutputState }

func (UserHandoffNotificationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserHandoffNotificationRule)(nil)).Elem()
}

func (o UserHandoffNotificationRuleOutput) ToUserHandoffNotificationRuleOutput() UserHandoffNotificationRuleOutput {
	return o
}

func (o UserHandoffNotificationRuleOutput) ToUserHandoffNotificationRuleOutputWithContext(ctx context.Context) UserHandoffNotificationRuleOutput {
	return o
}

// The contact method to notify the user. Contact method documented below.
func (o UserHandoffNotificationRuleOutput) ContactMethod() UserHandoffNotificationRuleContactMethodOutput {
	return o.ApplyT(func(v *UserHandoffNotificationRule) UserHandoffNotificationRuleContactMethodOutput {
		return v.ContactMethod
	}).(UserHandoffNotificationRuleContactMethodOutput)
}

// The type of handoff to notify the user about. Possible values are `oncall`, `offcall`, `both`.
func (o UserHandoffNotificationRuleOutput) HandoffType() pulumi.StringOutput {
	return o.ApplyT(func(v *UserHandoffNotificationRule) pulumi.StringOutput { return v.HandoffType }).(pulumi.StringOutput)
}

// The number of minutes before the handoff that the user should be notified. Must be a positive integer greater than or equal to 0.
func (o UserHandoffNotificationRuleOutput) NotifyAdvanceInMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *UserHandoffNotificationRule) pulumi.IntOutput { return v.NotifyAdvanceInMinutes }).(pulumi.IntOutput)
}

// The ID of the user.
func (o UserHandoffNotificationRuleOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserHandoffNotificationRule) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserHandoffNotificationRuleArrayOutput struct{ *pulumi.OutputState }

func (UserHandoffNotificationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserHandoffNotificationRule)(nil)).Elem()
}

func (o UserHandoffNotificationRuleArrayOutput) ToUserHandoffNotificationRuleArrayOutput() UserHandoffNotificationRuleArrayOutput {
	return o
}

func (o UserHandoffNotificationRuleArrayOutput) ToUserHandoffNotificationRuleArrayOutputWithContext(ctx context.Context) UserHandoffNotificationRuleArrayOutput {
	return o
}

func (o UserHandoffNotificationRuleArrayOutput) Index(i pulumi.IntInput) UserHandoffNotificationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserHandoffNotificationRule {
		return vs[0].([]*UserHandoffNotificationRule)[vs[1].(int)]
	}).(UserHandoffNotificationRuleOutput)
}

type UserHandoffNotificationRuleMapOutput struct{ *pulumi.OutputState }

func (UserHandoffNotificationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserHandoffNotificationRule)(nil)).Elem()
}

func (o UserHandoffNotificationRuleMapOutput) ToUserHandoffNotificationRuleMapOutput() UserHandoffNotificationRuleMapOutput {
	return o
}

func (o UserHandoffNotificationRuleMapOutput) ToUserHandoffNotificationRuleMapOutputWithContext(ctx context.Context) UserHandoffNotificationRuleMapOutput {
	return o
}

func (o UserHandoffNotificationRuleMapOutput) MapIndex(k pulumi.StringInput) UserHandoffNotificationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserHandoffNotificationRule {
		return vs[0].(map[string]*UserHandoffNotificationRule)[vs[1].(string)]
	}).(UserHandoffNotificationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserHandoffNotificationRuleInput)(nil)).Elem(), &UserHandoffNotificationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserHandoffNotificationRuleArrayInput)(nil)).Elem(), UserHandoffNotificationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserHandoffNotificationRuleMapInput)(nil)).Elem(), UserHandoffNotificationRuleMap{})
	pulumi.RegisterOutputType(UserHandoffNotificationRuleOutput{})
	pulumi.RegisterOutputType(UserHandoffNotificationRuleArrayOutput{})
	pulumi.RegisterOutputType(UserHandoffNotificationRuleMapOutput{})
}