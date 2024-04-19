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
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//				Teams: pulumi.StringArray{
//					examplePagerdutyTeam.Id,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleEscalationPolicy, err := pagerduty.NewEscalationPolicy(ctx, "example", &pagerduty.EscalationPolicyArgs{
//				Name:     pulumi.String("Engineering Escalation Policy"),
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("user"),
//								Id:   example.ID(),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewResponsePlay(ctx, "example", &pagerduty.ResponsePlayArgs{
//				Name: pulumi.String("My Response Play"),
//				From: example.Email,
//				Responders: pagerduty.ResponsePlayResponderArray{
//					&pagerduty.ResponsePlayResponderArgs{
//						Type: pulumi.String("escalation_policy_reference"),
//						Id:   exampleEscalationPolicy.ID(),
//					},
//				},
//				Subscribers: pagerduty.ResponsePlaySubscriberArray{
//					&pagerduty.ResponsePlaySubscriberArgs{
//						Type: pulumi.String("user_reference"),
//						Id:   example.ID(),
//					},
//				},
//				Runnability: pulumi.String("services"),
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
// Response Plays can be imported using the `id.from(email)`, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/responsePlay:ResponsePlay main 16208303-022b-f745-f2f5-560e537a2a74.user@email.com
// ```
type ResponsePlay struct {
	pulumi.CustomResourceState

	// The telephone number that will be set as the conference number for any incident on which this response play is run.
	ConferenceNumber pulumi.StringPtrOutput `pulumi:"conferenceNumber"`
	// The URL that will be set as the conference URL for any incident on which this response play is run.
	ConferenceUrl pulumi.StringPtrOutput `pulumi:"conferenceUrl"`
	Description   pulumi.StringOutput    `pulumi:"description"`
	// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
	From pulumi.StringOutput `pulumi:"from"`
	// The name of the response play.
	Name pulumi.StringOutput `pulumi:"name"`
	// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
	Responders ResponsePlayResponderArrayOutput `pulumi:"responders"`
	// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
	RespondersMessage pulumi.StringPtrOutput `pulumi:"respondersMessage"`
	// String representing how this response play is allowed to be run. Valid options are:
	Runnability pulumi.StringPtrOutput `pulumi:"runnability"`
	// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
	Subscribers ResponsePlaySubscriberArrayOutput `pulumi:"subscribers"`
	// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
	SubscribersMessage pulumi.StringPtrOutput `pulumi:"subscribersMessage"`
	// The ID of the team associated with the response play.
	Team pulumi.StringPtrOutput `pulumi:"team"`
	// A string that determines the schema of the object. If not set, the default value is "responsePlay".
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewResponsePlay registers a new resource with the given unique name, arguments, and options.
func NewResponsePlay(ctx *pulumi.Context,
	name string, args *ResponsePlayArgs, opts ...pulumi.ResourceOption) (*ResponsePlay, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.From == nil {
		return nil, errors.New("invalid value for required argument 'From'")
	}
	if args.Description == nil {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResponsePlay
	err := ctx.RegisterResource("pagerduty:index/responsePlay:ResponsePlay", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResponsePlay gets an existing ResponsePlay resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResponsePlay(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResponsePlayState, opts ...pulumi.ResourceOption) (*ResponsePlay, error) {
	var resource ResponsePlay
	err := ctx.ReadResource("pagerduty:index/responsePlay:ResponsePlay", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResponsePlay resources.
type responsePlayState struct {
	// The telephone number that will be set as the conference number for any incident on which this response play is run.
	ConferenceNumber *string `pulumi:"conferenceNumber"`
	// The URL that will be set as the conference URL for any incident on which this response play is run.
	ConferenceUrl *string `pulumi:"conferenceUrl"`
	Description   *string `pulumi:"description"`
	// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
	From *string `pulumi:"from"`
	// The name of the response play.
	Name *string `pulumi:"name"`
	// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
	Responders []ResponsePlayResponder `pulumi:"responders"`
	// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
	RespondersMessage *string `pulumi:"respondersMessage"`
	// String representing how this response play is allowed to be run. Valid options are:
	Runnability *string `pulumi:"runnability"`
	// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
	Subscribers []ResponsePlaySubscriber `pulumi:"subscribers"`
	// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
	SubscribersMessage *string `pulumi:"subscribersMessage"`
	// The ID of the team associated with the response play.
	Team *string `pulumi:"team"`
	// A string that determines the schema of the object. If not set, the default value is "responsePlay".
	Type *string `pulumi:"type"`
}

type ResponsePlayState struct {
	// The telephone number that will be set as the conference number for any incident on which this response play is run.
	ConferenceNumber pulumi.StringPtrInput
	// The URL that will be set as the conference URL for any incident on which this response play is run.
	ConferenceUrl pulumi.StringPtrInput
	Description   pulumi.StringPtrInput
	// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
	From pulumi.StringPtrInput
	// The name of the response play.
	Name pulumi.StringPtrInput
	// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
	Responders ResponsePlayResponderArrayInput
	// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
	RespondersMessage pulumi.StringPtrInput
	// String representing how this response play is allowed to be run. Valid options are:
	Runnability pulumi.StringPtrInput
	// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
	Subscribers ResponsePlaySubscriberArrayInput
	// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
	SubscribersMessage pulumi.StringPtrInput
	// The ID of the team associated with the response play.
	Team pulumi.StringPtrInput
	// A string that determines the schema of the object. If not set, the default value is "responsePlay".
	Type pulumi.StringPtrInput
}

func (ResponsePlayState) ElementType() reflect.Type {
	return reflect.TypeOf((*responsePlayState)(nil)).Elem()
}

type responsePlayArgs struct {
	// The telephone number that will be set as the conference number for any incident on which this response play is run.
	ConferenceNumber *string `pulumi:"conferenceNumber"`
	// The URL that will be set as the conference URL for any incident on which this response play is run.
	ConferenceUrl *string `pulumi:"conferenceUrl"`
	Description   *string `pulumi:"description"`
	// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
	From string `pulumi:"from"`
	// The name of the response play.
	Name *string `pulumi:"name"`
	// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
	Responders []ResponsePlayResponder `pulumi:"responders"`
	// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
	RespondersMessage *string `pulumi:"respondersMessage"`
	// String representing how this response play is allowed to be run. Valid options are:
	Runnability *string `pulumi:"runnability"`
	// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
	Subscribers []ResponsePlaySubscriber `pulumi:"subscribers"`
	// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
	SubscribersMessage *string `pulumi:"subscribersMessage"`
	// The ID of the team associated with the response play.
	Team *string `pulumi:"team"`
	// A string that determines the schema of the object. If not set, the default value is "responsePlay".
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a ResponsePlay resource.
type ResponsePlayArgs struct {
	// The telephone number that will be set as the conference number for any incident on which this response play is run.
	ConferenceNumber pulumi.StringPtrInput
	// The URL that will be set as the conference URL for any incident on which this response play is run.
	ConferenceUrl pulumi.StringPtrInput
	Description   pulumi.StringPtrInput
	// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
	From pulumi.StringInput
	// The name of the response play.
	Name pulumi.StringPtrInput
	// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
	Responders ResponsePlayResponderArrayInput
	// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
	RespondersMessage pulumi.StringPtrInput
	// String representing how this response play is allowed to be run. Valid options are:
	Runnability pulumi.StringPtrInput
	// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
	Subscribers ResponsePlaySubscriberArrayInput
	// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
	SubscribersMessage pulumi.StringPtrInput
	// The ID of the team associated with the response play.
	Team pulumi.StringPtrInput
	// A string that determines the schema of the object. If not set, the default value is "responsePlay".
	Type pulumi.StringPtrInput
}

func (ResponsePlayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*responsePlayArgs)(nil)).Elem()
}

type ResponsePlayInput interface {
	pulumi.Input

	ToResponsePlayOutput() ResponsePlayOutput
	ToResponsePlayOutputWithContext(ctx context.Context) ResponsePlayOutput
}

func (*ResponsePlay) ElementType() reflect.Type {
	return reflect.TypeOf((**ResponsePlay)(nil)).Elem()
}

func (i *ResponsePlay) ToResponsePlayOutput() ResponsePlayOutput {
	return i.ToResponsePlayOutputWithContext(context.Background())
}

func (i *ResponsePlay) ToResponsePlayOutputWithContext(ctx context.Context) ResponsePlayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResponsePlayOutput)
}

// ResponsePlayArrayInput is an input type that accepts ResponsePlayArray and ResponsePlayArrayOutput values.
// You can construct a concrete instance of `ResponsePlayArrayInput` via:
//
//	ResponsePlayArray{ ResponsePlayArgs{...} }
type ResponsePlayArrayInput interface {
	pulumi.Input

	ToResponsePlayArrayOutput() ResponsePlayArrayOutput
	ToResponsePlayArrayOutputWithContext(context.Context) ResponsePlayArrayOutput
}

type ResponsePlayArray []ResponsePlayInput

func (ResponsePlayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResponsePlay)(nil)).Elem()
}

func (i ResponsePlayArray) ToResponsePlayArrayOutput() ResponsePlayArrayOutput {
	return i.ToResponsePlayArrayOutputWithContext(context.Background())
}

func (i ResponsePlayArray) ToResponsePlayArrayOutputWithContext(ctx context.Context) ResponsePlayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResponsePlayArrayOutput)
}

// ResponsePlayMapInput is an input type that accepts ResponsePlayMap and ResponsePlayMapOutput values.
// You can construct a concrete instance of `ResponsePlayMapInput` via:
//
//	ResponsePlayMap{ "key": ResponsePlayArgs{...} }
type ResponsePlayMapInput interface {
	pulumi.Input

	ToResponsePlayMapOutput() ResponsePlayMapOutput
	ToResponsePlayMapOutputWithContext(context.Context) ResponsePlayMapOutput
}

type ResponsePlayMap map[string]ResponsePlayInput

func (ResponsePlayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResponsePlay)(nil)).Elem()
}

func (i ResponsePlayMap) ToResponsePlayMapOutput() ResponsePlayMapOutput {
	return i.ToResponsePlayMapOutputWithContext(context.Background())
}

func (i ResponsePlayMap) ToResponsePlayMapOutputWithContext(ctx context.Context) ResponsePlayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResponsePlayMapOutput)
}

type ResponsePlayOutput struct{ *pulumi.OutputState }

func (ResponsePlayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResponsePlay)(nil)).Elem()
}

func (o ResponsePlayOutput) ToResponsePlayOutput() ResponsePlayOutput {
	return o
}

func (o ResponsePlayOutput) ToResponsePlayOutputWithContext(ctx context.Context) ResponsePlayOutput {
	return o
}

// The telephone number that will be set as the conference number for any incident on which this response play is run.
func (o ResponsePlayOutput) ConferenceNumber() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringPtrOutput { return v.ConferenceNumber }).(pulumi.StringPtrOutput)
}

// The URL that will be set as the conference URL for any incident on which this response play is run.
func (o ResponsePlayOutput) ConferenceUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringPtrOutput { return v.ConferenceUrl }).(pulumi.StringPtrOutput)
}

func (o ResponsePlayOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
func (o ResponsePlayOutput) From() pulumi.StringOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringOutput { return v.From }).(pulumi.StringOutput)
}

// The name of the response play.
func (o ResponsePlayOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
func (o ResponsePlayOutput) Responders() ResponsePlayResponderArrayOutput {
	return o.ApplyT(func(v *ResponsePlay) ResponsePlayResponderArrayOutput { return v.Responders }).(ResponsePlayResponderArrayOutput)
}

// The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
func (o ResponsePlayOutput) RespondersMessage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringPtrOutput { return v.RespondersMessage }).(pulumi.StringPtrOutput)
}

// String representing how this response play is allowed to be run. Valid options are:
func (o ResponsePlayOutput) Runnability() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringPtrOutput { return v.Runnability }).(pulumi.StringPtrOutput)
}

// A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
func (o ResponsePlayOutput) Subscribers() ResponsePlaySubscriberArrayOutput {
	return o.ApplyT(func(v *ResponsePlay) ResponsePlaySubscriberArrayOutput { return v.Subscribers }).(ResponsePlaySubscriberArrayOutput)
}

// The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
func (o ResponsePlayOutput) SubscribersMessage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringPtrOutput { return v.SubscribersMessage }).(pulumi.StringPtrOutput)
}

// The ID of the team associated with the response play.
func (o ResponsePlayOutput) Team() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringPtrOutput { return v.Team }).(pulumi.StringPtrOutput)
}

// A string that determines the schema of the object. If not set, the default value is "responsePlay".
func (o ResponsePlayOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResponsePlay) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type ResponsePlayArrayOutput struct{ *pulumi.OutputState }

func (ResponsePlayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResponsePlay)(nil)).Elem()
}

func (o ResponsePlayArrayOutput) ToResponsePlayArrayOutput() ResponsePlayArrayOutput {
	return o
}

func (o ResponsePlayArrayOutput) ToResponsePlayArrayOutputWithContext(ctx context.Context) ResponsePlayArrayOutput {
	return o
}

func (o ResponsePlayArrayOutput) Index(i pulumi.IntInput) ResponsePlayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResponsePlay {
		return vs[0].([]*ResponsePlay)[vs[1].(int)]
	}).(ResponsePlayOutput)
}

type ResponsePlayMapOutput struct{ *pulumi.OutputState }

func (ResponsePlayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResponsePlay)(nil)).Elem()
}

func (o ResponsePlayMapOutput) ToResponsePlayMapOutput() ResponsePlayMapOutput {
	return o
}

func (o ResponsePlayMapOutput) ToResponsePlayMapOutputWithContext(ctx context.Context) ResponsePlayMapOutput {
	return o
}

func (o ResponsePlayMapOutput) MapIndex(k pulumi.StringInput) ResponsePlayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResponsePlay {
		return vs[0].(map[string]*ResponsePlay)[vs[1].(string)]
	}).(ResponsePlayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResponsePlayInput)(nil)).Elem(), &ResponsePlay{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResponsePlayArrayInput)(nil)).Elem(), ResponsePlayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResponsePlayMapInput)(nil)).Elem(), ResponsePlayMap{})
	pulumi.RegisterOutputType(ResponsePlayOutput{})
	pulumi.RegisterOutputType(ResponsePlayArrayOutput{})
	pulumi.RegisterOutputType(ResponsePlayMapOutput{})
}
