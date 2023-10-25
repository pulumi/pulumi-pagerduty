// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// A [notification rule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODI0NQ-create-a-user-notification-rule) configures where and when a PagerDuty user is notified when a triggered incident is assigned to them. Unique notification rules can be created for both high and low-urgency incidents.
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
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//			})
//			if err != nil {
//				return err
//			}
//			email, err := pagerduty.NewUserContactMethod(ctx, "email", &pagerduty.UserContactMethodArgs{
//				UserId:  example.ID(),
//				Type:    pulumi.String("email_contact_method"),
//				Address: pulumi.String("foo@bar.com"),
//				Label:   pulumi.String("Work"),
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
//			sms, err := pagerduty.NewUserContactMethod(ctx, "sms", &pagerduty.UserContactMethodArgs{
//				UserId:      example.ID(),
//				Type:        pulumi.String("sms_contact_method"),
//				CountryCode: pulumi.Int(1),
//				Address:     pulumi.String("2025550199"),
//				Label:       pulumi.String("Work"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewUserNotificationRule(ctx, "highUrgencyPhone", &pagerduty.UserNotificationRuleArgs{
//				UserId:              example.ID(),
//				StartDelayInMinutes: pulumi.Int(1),
//				Urgency:             pulumi.String("high"),
//				ContactMethod: pulumi.StringMap{
//					"type": pulumi.String("phone_contact_method"),
//					"id":   phone.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewUserNotificationRule(ctx, "lowUrgencyEmail", &pagerduty.UserNotificationRuleArgs{
//				UserId:              example.ID(),
//				StartDelayInMinutes: pulumi.Int(1),
//				Urgency:             pulumi.String("low"),
//				ContactMethod: pulumi.StringMap{
//					"type": pulumi.String("email_contact_method"),
//					"id":   email.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewUserNotificationRule(ctx, "lowUrgencySms", &pagerduty.UserNotificationRuleArgs{
//				UserId:              example.ID(),
//				StartDelayInMinutes: pulumi.Int(10),
//				Urgency:             pulumi.String("low"),
//				ContactMethod: pulumi.StringMap{
//					"type": pulumi.String("sms_contact_method"),
//					"id":   sms.ID(),
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
// User notification rules can be imported using the `user_id` and the `id`, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/userNotificationRule:UserNotificationRule main PXPGF42:PPSCXAN
//
// ```
type UserNotificationRule struct {
	pulumi.CustomResourceState

	// A contact method block, configured as a block described below.
	ContactMethod pulumi.StringMapOutput `pulumi:"contactMethod"`
	// The delay before firing the rule, in minutes.
	StartDelayInMinutes pulumi.IntOutput `pulumi:"startDelayInMinutes"`
	// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
	Urgency pulumi.StringOutput `pulumi:"urgency"`
	// The ID of the user.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserNotificationRule registers a new resource with the given unique name, arguments, and options.
func NewUserNotificationRule(ctx *pulumi.Context,
	name string, args *UserNotificationRuleArgs, opts ...pulumi.ResourceOption) (*UserNotificationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContactMethod == nil {
		return nil, errors.New("invalid value for required argument 'ContactMethod'")
	}
	if args.StartDelayInMinutes == nil {
		return nil, errors.New("invalid value for required argument 'StartDelayInMinutes'")
	}
	if args.Urgency == nil {
		return nil, errors.New("invalid value for required argument 'Urgency'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserNotificationRule
	err := ctx.RegisterResource("pagerduty:index/userNotificationRule:UserNotificationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserNotificationRule gets an existing UserNotificationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserNotificationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserNotificationRuleState, opts ...pulumi.ResourceOption) (*UserNotificationRule, error) {
	var resource UserNotificationRule
	err := ctx.ReadResource("pagerduty:index/userNotificationRule:UserNotificationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserNotificationRule resources.
type userNotificationRuleState struct {
	// A contact method block, configured as a block described below.
	ContactMethod map[string]string `pulumi:"contactMethod"`
	// The delay before firing the rule, in minutes.
	StartDelayInMinutes *int `pulumi:"startDelayInMinutes"`
	// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
	Urgency *string `pulumi:"urgency"`
	// The ID of the user.
	UserId *string `pulumi:"userId"`
}

type UserNotificationRuleState struct {
	// A contact method block, configured as a block described below.
	ContactMethod pulumi.StringMapInput
	// The delay before firing the rule, in minutes.
	StartDelayInMinutes pulumi.IntPtrInput
	// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
	Urgency pulumi.StringPtrInput
	// The ID of the user.
	UserId pulumi.StringPtrInput
}

func (UserNotificationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*userNotificationRuleState)(nil)).Elem()
}

type userNotificationRuleArgs struct {
	// A contact method block, configured as a block described below.
	ContactMethod map[string]string `pulumi:"contactMethod"`
	// The delay before firing the rule, in minutes.
	StartDelayInMinutes int `pulumi:"startDelayInMinutes"`
	// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
	Urgency string `pulumi:"urgency"`
	// The ID of the user.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserNotificationRule resource.
type UserNotificationRuleArgs struct {
	// A contact method block, configured as a block described below.
	ContactMethod pulumi.StringMapInput
	// The delay before firing the rule, in minutes.
	StartDelayInMinutes pulumi.IntInput
	// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
	Urgency pulumi.StringInput
	// The ID of the user.
	UserId pulumi.StringInput
}

func (UserNotificationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userNotificationRuleArgs)(nil)).Elem()
}

type UserNotificationRuleInput interface {
	pulumi.Input

	ToUserNotificationRuleOutput() UserNotificationRuleOutput
	ToUserNotificationRuleOutputWithContext(ctx context.Context) UserNotificationRuleOutput
}

func (*UserNotificationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**UserNotificationRule)(nil)).Elem()
}

func (i *UserNotificationRule) ToUserNotificationRuleOutput() UserNotificationRuleOutput {
	return i.ToUserNotificationRuleOutputWithContext(context.Background())
}

func (i *UserNotificationRule) ToUserNotificationRuleOutputWithContext(ctx context.Context) UserNotificationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserNotificationRuleOutput)
}

func (i *UserNotificationRule) ToOutput(ctx context.Context) pulumix.Output[*UserNotificationRule] {
	return pulumix.Output[*UserNotificationRule]{
		OutputState: i.ToUserNotificationRuleOutputWithContext(ctx).OutputState,
	}
}

// UserNotificationRuleArrayInput is an input type that accepts UserNotificationRuleArray and UserNotificationRuleArrayOutput values.
// You can construct a concrete instance of `UserNotificationRuleArrayInput` via:
//
//	UserNotificationRuleArray{ UserNotificationRuleArgs{...} }
type UserNotificationRuleArrayInput interface {
	pulumi.Input

	ToUserNotificationRuleArrayOutput() UserNotificationRuleArrayOutput
	ToUserNotificationRuleArrayOutputWithContext(context.Context) UserNotificationRuleArrayOutput
}

type UserNotificationRuleArray []UserNotificationRuleInput

func (UserNotificationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserNotificationRule)(nil)).Elem()
}

func (i UserNotificationRuleArray) ToUserNotificationRuleArrayOutput() UserNotificationRuleArrayOutput {
	return i.ToUserNotificationRuleArrayOutputWithContext(context.Background())
}

func (i UserNotificationRuleArray) ToUserNotificationRuleArrayOutputWithContext(ctx context.Context) UserNotificationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserNotificationRuleArrayOutput)
}

func (i UserNotificationRuleArray) ToOutput(ctx context.Context) pulumix.Output[[]*UserNotificationRule] {
	return pulumix.Output[[]*UserNotificationRule]{
		OutputState: i.ToUserNotificationRuleArrayOutputWithContext(ctx).OutputState,
	}
}

// UserNotificationRuleMapInput is an input type that accepts UserNotificationRuleMap and UserNotificationRuleMapOutput values.
// You can construct a concrete instance of `UserNotificationRuleMapInput` via:
//
//	UserNotificationRuleMap{ "key": UserNotificationRuleArgs{...} }
type UserNotificationRuleMapInput interface {
	pulumi.Input

	ToUserNotificationRuleMapOutput() UserNotificationRuleMapOutput
	ToUserNotificationRuleMapOutputWithContext(context.Context) UserNotificationRuleMapOutput
}

type UserNotificationRuleMap map[string]UserNotificationRuleInput

func (UserNotificationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserNotificationRule)(nil)).Elem()
}

func (i UserNotificationRuleMap) ToUserNotificationRuleMapOutput() UserNotificationRuleMapOutput {
	return i.ToUserNotificationRuleMapOutputWithContext(context.Background())
}

func (i UserNotificationRuleMap) ToUserNotificationRuleMapOutputWithContext(ctx context.Context) UserNotificationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserNotificationRuleMapOutput)
}

func (i UserNotificationRuleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*UserNotificationRule] {
	return pulumix.Output[map[string]*UserNotificationRule]{
		OutputState: i.ToUserNotificationRuleMapOutputWithContext(ctx).OutputState,
	}
}

type UserNotificationRuleOutput struct{ *pulumi.OutputState }

func (UserNotificationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserNotificationRule)(nil)).Elem()
}

func (o UserNotificationRuleOutput) ToUserNotificationRuleOutput() UserNotificationRuleOutput {
	return o
}

func (o UserNotificationRuleOutput) ToUserNotificationRuleOutputWithContext(ctx context.Context) UserNotificationRuleOutput {
	return o
}

func (o UserNotificationRuleOutput) ToOutput(ctx context.Context) pulumix.Output[*UserNotificationRule] {
	return pulumix.Output[*UserNotificationRule]{
		OutputState: o.OutputState,
	}
}

// A contact method block, configured as a block described below.
func (o UserNotificationRuleOutput) ContactMethod() pulumi.StringMapOutput {
	return o.ApplyT(func(v *UserNotificationRule) pulumi.StringMapOutput { return v.ContactMethod }).(pulumi.StringMapOutput)
}

// The delay before firing the rule, in minutes.
func (o UserNotificationRuleOutput) StartDelayInMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *UserNotificationRule) pulumi.IntOutput { return v.StartDelayInMinutes }).(pulumi.IntOutput)
}

// Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
func (o UserNotificationRuleOutput) Urgency() pulumi.StringOutput {
	return o.ApplyT(func(v *UserNotificationRule) pulumi.StringOutput { return v.Urgency }).(pulumi.StringOutput)
}

// The ID of the user.
func (o UserNotificationRuleOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserNotificationRule) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserNotificationRuleArrayOutput struct{ *pulumi.OutputState }

func (UserNotificationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserNotificationRule)(nil)).Elem()
}

func (o UserNotificationRuleArrayOutput) ToUserNotificationRuleArrayOutput() UserNotificationRuleArrayOutput {
	return o
}

func (o UserNotificationRuleArrayOutput) ToUserNotificationRuleArrayOutputWithContext(ctx context.Context) UserNotificationRuleArrayOutput {
	return o
}

func (o UserNotificationRuleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*UserNotificationRule] {
	return pulumix.Output[[]*UserNotificationRule]{
		OutputState: o.OutputState,
	}
}

func (o UserNotificationRuleArrayOutput) Index(i pulumi.IntInput) UserNotificationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserNotificationRule {
		return vs[0].([]*UserNotificationRule)[vs[1].(int)]
	}).(UserNotificationRuleOutput)
}

type UserNotificationRuleMapOutput struct{ *pulumi.OutputState }

func (UserNotificationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserNotificationRule)(nil)).Elem()
}

func (o UserNotificationRuleMapOutput) ToUserNotificationRuleMapOutput() UserNotificationRuleMapOutput {
	return o
}

func (o UserNotificationRuleMapOutput) ToUserNotificationRuleMapOutputWithContext(ctx context.Context) UserNotificationRuleMapOutput {
	return o
}

func (o UserNotificationRuleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*UserNotificationRule] {
	return pulumix.Output[map[string]*UserNotificationRule]{
		OutputState: o.OutputState,
	}
}

func (o UserNotificationRuleMapOutput) MapIndex(k pulumi.StringInput) UserNotificationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserNotificationRule {
		return vs[0].(map[string]*UserNotificationRule)[vs[1].(string)]
	}).(UserNotificationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserNotificationRuleInput)(nil)).Elem(), &UserNotificationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserNotificationRuleArrayInput)(nil)).Elem(), UserNotificationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserNotificationRuleMapInput)(nil)).Elem(), UserNotificationRuleMap{})
	pulumi.RegisterOutputType(UserNotificationRuleOutput{})
	pulumi.RegisterOutputType(UserNotificationRuleArrayOutput{})
	pulumi.RegisterOutputType(UserNotificationRuleMapOutput{})
}
