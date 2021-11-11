// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [contact method](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1users~1%7Bid%7D~1contact_methods~1%7Bcontact_method_id%7D/get) of a PagerDuty [user](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1users~1%7Bid%7D/get) that you can use for other PagerDuty resources.
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
// 		me, err := pagerduty.LookupUser(ctx, &GetUserArgs{
// 			Email: "me@example.com",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		phonePush, err := pagerduty.LookupUserContactMethod(ctx, &GetUserContactMethodArgs{
// 			UserId: me.Id,
// 			Type:   "push_notification_contact_method",
// 			Label:  "iPhone (John)",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewUserNotificationRule(ctx, "lowUrgencySms", &pagerduty.UserNotificationRuleArgs{
// 			UserId:              pulumi.String(me.Id),
// 			StartDelayInMinutes: pulumi.Int(5),
// 			Urgency:             pulumi.String("high"),
// 			ContactMethod: pulumi.StringMap{
// 				"type": pulumi.String("push_notification_contact_method"),
// 				"id":   pulumi.String(phonePush.Id),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupUserContactMethod(ctx *pulumi.Context, args *LookupUserContactMethodArgs, opts ...pulumi.InvokeOption) (*LookupUserContactMethodResult, error) {
	var rv LookupUserContactMethodResult
	err := ctx.Invoke("pagerduty:index/getUserContactMethod:getUserContactMethod", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUserContactMethod.
type LookupUserContactMethodArgs struct {
	// The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
	Label string `pulumi:"label"`
	// The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
	Type string `pulumi:"type"`
	// The ID of the user.
	UserId string `pulumi:"userId"`
}

// A collection of values returned by getUserContactMethod.
type LookupUserContactMethodResult struct {
	// The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
	Address string `pulumi:"address"`
	// If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it. (Phone and SMS contact methods only.)
	Blacklisted bool `pulumi:"blacklisted"`
	// The 1-to-3 digit country calling code. (Phone and SMS contact methods only.)
	CountryCode int `pulumi:"countryCode"`
	// Either `ios` or `android`, depending on the type of the device receiving notifications. (Push notification contact method only.)
	DeviceType string `pulumi:"deviceType"`
	// If true, this phone is capable of receiving SMS messages. (Phone and SMS contact methods only.)
	Enabled bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
	Label string `pulumi:"label"`
	// Send an abbreviated email message instead of the standard email output. (Email contact method only.)
	SendShortEmail bool `pulumi:"sendShortEmail"`
	// The type of the found contact method. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
	Type   string `pulumi:"type"`
	UserId string `pulumi:"userId"`
}

func LookupUserContactMethodOutput(ctx *pulumi.Context, args LookupUserContactMethodOutputArgs, opts ...pulumi.InvokeOption) LookupUserContactMethodResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserContactMethodResult, error) {
			args := v.(LookupUserContactMethodArgs)
			r, err := LookupUserContactMethod(ctx, &args, opts...)
			return *r, err
		}).(LookupUserContactMethodResultOutput)
}

// A collection of arguments for invoking getUserContactMethod.
type LookupUserContactMethodOutputArgs struct {
	// The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
	Label pulumi.StringInput `pulumi:"label"`
	// The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
	Type pulumi.StringInput `pulumi:"type"`
	// The ID of the user.
	UserId pulumi.StringInput `pulumi:"userId"`
}

func (LookupUserContactMethodOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserContactMethodArgs)(nil)).Elem()
}

// A collection of values returned by getUserContactMethod.
type LookupUserContactMethodResultOutput struct{ *pulumi.OutputState }

func (LookupUserContactMethodResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserContactMethodResult)(nil)).Elem()
}

func (o LookupUserContactMethodResultOutput) ToLookupUserContactMethodResultOutput() LookupUserContactMethodResultOutput {
	return o
}

func (o LookupUserContactMethodResultOutput) ToLookupUserContactMethodResultOutputWithContext(ctx context.Context) LookupUserContactMethodResultOutput {
	return o
}

// The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
func (o LookupUserContactMethodResultOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) string { return v.Address }).(pulumi.StringOutput)
}

// If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it. (Phone and SMS contact methods only.)
func (o LookupUserContactMethodResultOutput) Blacklisted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) bool { return v.Blacklisted }).(pulumi.BoolOutput)
}

// The 1-to-3 digit country calling code. (Phone and SMS contact methods only.)
func (o LookupUserContactMethodResultOutput) CountryCode() pulumi.IntOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) int { return v.CountryCode }).(pulumi.IntOutput)
}

// Either `ios` or `android`, depending on the type of the device receiving notifications. (Push notification contact method only.)
func (o LookupUserContactMethodResultOutput) DeviceType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) string { return v.DeviceType }).(pulumi.StringOutput)
}

// If true, this phone is capable of receiving SMS messages. (Phone and SMS contact methods only.)
func (o LookupUserContactMethodResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUserContactMethodResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) string { return v.Id }).(pulumi.StringOutput)
}

// The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
func (o LookupUserContactMethodResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) string { return v.Label }).(pulumi.StringOutput)
}

// Send an abbreviated email message instead of the standard email output. (Email contact method only.)
func (o LookupUserContactMethodResultOutput) SendShortEmail() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) bool { return v.SendShortEmail }).(pulumi.BoolOutput)
}

// The type of the found contact method. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
func (o LookupUserContactMethodResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o LookupUserContactMethodResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserContactMethodResult) string { return v.UserId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserContactMethodResultOutput{})
}
