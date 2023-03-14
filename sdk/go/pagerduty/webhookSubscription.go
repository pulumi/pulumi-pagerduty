// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [webhook subscription](https://developer.pagerduty.com/docs/ZG9jOjExMDI5NTkw-v3-overview) allow you to receive HTTP callbacks when incidents are created, updated and deleted. These are also known as V3 Webhooks.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := pagerduty.LookupService(ctx, &pagerduty.LookupServiceArgs{
//				Name: "My Service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewWebhookSubscription(ctx, "foo", &pagerduty.WebhookSubscriptionArgs{
//				DeliveryMethods: pagerduty.WebhookSubscriptionDeliveryMethodArray{
//					&pagerduty.WebhookSubscriptionDeliveryMethodArgs{
//						Type: pulumi.String("http_delivery_method"),
//						Url:  pulumi.String("https://example.com/receive_a_pagerduty_webhook"),
//						CustomHeaders: pagerduty.WebhookSubscriptionDeliveryMethodCustomHeaderArray{
//							&pagerduty.WebhookSubscriptionDeliveryMethodCustomHeaderArgs{
//								Name:  pulumi.String("X-Foo"),
//								Value: pulumi.String("foo"),
//							},
//							&pagerduty.WebhookSubscriptionDeliveryMethodCustomHeaderArgs{
//								Name:  pulumi.String("X-Bar"),
//								Value: pulumi.String("bar"),
//							},
//						},
//					},
//				},
//				Description: pulumi.String("%s"),
//				Events: pulumi.StringArray{
//					pulumi.String("incident.acknowledged"),
//					pulumi.String("incident.annotated"),
//					pulumi.String("incident.delegated"),
//					pulumi.String("incident.escalated"),
//					pulumi.String("incident.priority_updated"),
//					pulumi.String("incident.reassigned"),
//					pulumi.String("incident.reopened"),
//					pulumi.String("incident.resolved"),
//					pulumi.String("incident.responder.added"),
//					pulumi.String("incident.responder.replied"),
//					pulumi.String("incident.status_update_published"),
//					pulumi.String("incident.triggered"),
//					pulumi.String("incident.unacknowledged"),
//				},
//				Active: pulumi.Bool(true),
//				Filters: pagerduty.WebhookSubscriptionFilterArray{
//					&pagerduty.WebhookSubscriptionFilterArgs{
//						Id:   *pulumi.String(example.Id),
//						Type: pulumi.String("service_reference"),
//					},
//				},
//				Type: pulumi.String("webhook_subscription"),
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
// Webhook Subscriptions can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/webhookSubscription:WebhookSubscription main PUABCDL
//
// ```
type WebhookSubscription struct {
	pulumi.CustomResourceState

	// Determines whether the subscription will produce webhook events.
	Active pulumi.BoolOutput `pulumi:"active"`
	// The object describing where to send the webhooks.
	DeliveryMethods WebhookSubscriptionDeliveryMethodArrayOutput `pulumi:"deliveryMethods"`
	// A short description of the webhook subscription
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A set of outbound event types the webhook will receive. The follow event types are possible:
	// * `incident.acknowledged`
	// * `incident.annotated`
	// * `incident.delegated`
	// * `incident.escalated`
	// * `incident.priority_updated`
	// * `incident.reassigned`
	// * `incident.reopened`
	// * `incident.resolved`
	// * `incident.responder.added`
	// * `incident.responder.replied`
	// * `incident.status_update_published`
	// * `incident.triggered`
	// * `incident.unacknowledged`
	Events pulumi.StringArrayOutput `pulumi:"events"`
	// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `serviceReference`, `teamReference` and `accountReference`.
	Filters WebhookSubscriptionFilterArrayOutput `pulumi:"filters"`
	// The type indicating the schema of the object. The provider sets this as `webhookSubscription`, which is currently the only acceptable value.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewWebhookSubscription registers a new resource with the given unique name, arguments, and options.
func NewWebhookSubscription(ctx *pulumi.Context,
	name string, args *WebhookSubscriptionArgs, opts ...pulumi.ResourceOption) (*WebhookSubscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeliveryMethods == nil {
		return nil, errors.New("invalid value for required argument 'DeliveryMethods'")
	}
	if args.Events == nil {
		return nil, errors.New("invalid value for required argument 'Events'")
	}
	if args.Filters == nil {
		return nil, errors.New("invalid value for required argument 'Filters'")
	}
	var resource WebhookSubscription
	err := ctx.RegisterResource("pagerduty:index/webhookSubscription:WebhookSubscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebhookSubscription gets an existing WebhookSubscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebhookSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebhookSubscriptionState, opts ...pulumi.ResourceOption) (*WebhookSubscription, error) {
	var resource WebhookSubscription
	err := ctx.ReadResource("pagerduty:index/webhookSubscription:WebhookSubscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WebhookSubscription resources.
type webhookSubscriptionState struct {
	// Determines whether the subscription will produce webhook events.
	Active *bool `pulumi:"active"`
	// The object describing where to send the webhooks.
	DeliveryMethods []WebhookSubscriptionDeliveryMethod `pulumi:"deliveryMethods"`
	// A short description of the webhook subscription
	Description *string `pulumi:"description"`
	// A set of outbound event types the webhook will receive. The follow event types are possible:
	// * `incident.acknowledged`
	// * `incident.annotated`
	// * `incident.delegated`
	// * `incident.escalated`
	// * `incident.priority_updated`
	// * `incident.reassigned`
	// * `incident.reopened`
	// * `incident.resolved`
	// * `incident.responder.added`
	// * `incident.responder.replied`
	// * `incident.status_update_published`
	// * `incident.triggered`
	// * `incident.unacknowledged`
	Events []string `pulumi:"events"`
	// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `serviceReference`, `teamReference` and `accountReference`.
	Filters []WebhookSubscriptionFilter `pulumi:"filters"`
	// The type indicating the schema of the object. The provider sets this as `webhookSubscription`, which is currently the only acceptable value.
	Type *string `pulumi:"type"`
}

type WebhookSubscriptionState struct {
	// Determines whether the subscription will produce webhook events.
	Active pulumi.BoolPtrInput
	// The object describing where to send the webhooks.
	DeliveryMethods WebhookSubscriptionDeliveryMethodArrayInput
	// A short description of the webhook subscription
	Description pulumi.StringPtrInput
	// A set of outbound event types the webhook will receive. The follow event types are possible:
	// * `incident.acknowledged`
	// * `incident.annotated`
	// * `incident.delegated`
	// * `incident.escalated`
	// * `incident.priority_updated`
	// * `incident.reassigned`
	// * `incident.reopened`
	// * `incident.resolved`
	// * `incident.responder.added`
	// * `incident.responder.replied`
	// * `incident.status_update_published`
	// * `incident.triggered`
	// * `incident.unacknowledged`
	Events pulumi.StringArrayInput
	// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `serviceReference`, `teamReference` and `accountReference`.
	Filters WebhookSubscriptionFilterArrayInput
	// The type indicating the schema of the object. The provider sets this as `webhookSubscription`, which is currently the only acceptable value.
	Type pulumi.StringPtrInput
}

func (WebhookSubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookSubscriptionState)(nil)).Elem()
}

type webhookSubscriptionArgs struct {
	// Determines whether the subscription will produce webhook events.
	Active *bool `pulumi:"active"`
	// The object describing where to send the webhooks.
	DeliveryMethods []WebhookSubscriptionDeliveryMethod `pulumi:"deliveryMethods"`
	// A short description of the webhook subscription
	Description *string `pulumi:"description"`
	// A set of outbound event types the webhook will receive. The follow event types are possible:
	// * `incident.acknowledged`
	// * `incident.annotated`
	// * `incident.delegated`
	// * `incident.escalated`
	// * `incident.priority_updated`
	// * `incident.reassigned`
	// * `incident.reopened`
	// * `incident.resolved`
	// * `incident.responder.added`
	// * `incident.responder.replied`
	// * `incident.status_update_published`
	// * `incident.triggered`
	// * `incident.unacknowledged`
	Events []string `pulumi:"events"`
	// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `serviceReference`, `teamReference` and `accountReference`.
	Filters []WebhookSubscriptionFilter `pulumi:"filters"`
	// The type indicating the schema of the object. The provider sets this as `webhookSubscription`, which is currently the only acceptable value.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a WebhookSubscription resource.
type WebhookSubscriptionArgs struct {
	// Determines whether the subscription will produce webhook events.
	Active pulumi.BoolPtrInput
	// The object describing where to send the webhooks.
	DeliveryMethods WebhookSubscriptionDeliveryMethodArrayInput
	// A short description of the webhook subscription
	Description pulumi.StringPtrInput
	// A set of outbound event types the webhook will receive. The follow event types are possible:
	// * `incident.acknowledged`
	// * `incident.annotated`
	// * `incident.delegated`
	// * `incident.escalated`
	// * `incident.priority_updated`
	// * `incident.reassigned`
	// * `incident.reopened`
	// * `incident.resolved`
	// * `incident.responder.added`
	// * `incident.responder.replied`
	// * `incident.status_update_published`
	// * `incident.triggered`
	// * `incident.unacknowledged`
	Events pulumi.StringArrayInput
	// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `serviceReference`, `teamReference` and `accountReference`.
	Filters WebhookSubscriptionFilterArrayInput
	// The type indicating the schema of the object. The provider sets this as `webhookSubscription`, which is currently the only acceptable value.
	Type pulumi.StringPtrInput
}

func (WebhookSubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookSubscriptionArgs)(nil)).Elem()
}

type WebhookSubscriptionInput interface {
	pulumi.Input

	ToWebhookSubscriptionOutput() WebhookSubscriptionOutput
	ToWebhookSubscriptionOutputWithContext(ctx context.Context) WebhookSubscriptionOutput
}

func (*WebhookSubscription) ElementType() reflect.Type {
	return reflect.TypeOf((**WebhookSubscription)(nil)).Elem()
}

func (i *WebhookSubscription) ToWebhookSubscriptionOutput() WebhookSubscriptionOutput {
	return i.ToWebhookSubscriptionOutputWithContext(context.Background())
}

func (i *WebhookSubscription) ToWebhookSubscriptionOutputWithContext(ctx context.Context) WebhookSubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookSubscriptionOutput)
}

// WebhookSubscriptionArrayInput is an input type that accepts WebhookSubscriptionArray and WebhookSubscriptionArrayOutput values.
// You can construct a concrete instance of `WebhookSubscriptionArrayInput` via:
//
//	WebhookSubscriptionArray{ WebhookSubscriptionArgs{...} }
type WebhookSubscriptionArrayInput interface {
	pulumi.Input

	ToWebhookSubscriptionArrayOutput() WebhookSubscriptionArrayOutput
	ToWebhookSubscriptionArrayOutputWithContext(context.Context) WebhookSubscriptionArrayOutput
}

type WebhookSubscriptionArray []WebhookSubscriptionInput

func (WebhookSubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebhookSubscription)(nil)).Elem()
}

func (i WebhookSubscriptionArray) ToWebhookSubscriptionArrayOutput() WebhookSubscriptionArrayOutput {
	return i.ToWebhookSubscriptionArrayOutputWithContext(context.Background())
}

func (i WebhookSubscriptionArray) ToWebhookSubscriptionArrayOutputWithContext(ctx context.Context) WebhookSubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookSubscriptionArrayOutput)
}

// WebhookSubscriptionMapInput is an input type that accepts WebhookSubscriptionMap and WebhookSubscriptionMapOutput values.
// You can construct a concrete instance of `WebhookSubscriptionMapInput` via:
//
//	WebhookSubscriptionMap{ "key": WebhookSubscriptionArgs{...} }
type WebhookSubscriptionMapInput interface {
	pulumi.Input

	ToWebhookSubscriptionMapOutput() WebhookSubscriptionMapOutput
	ToWebhookSubscriptionMapOutputWithContext(context.Context) WebhookSubscriptionMapOutput
}

type WebhookSubscriptionMap map[string]WebhookSubscriptionInput

func (WebhookSubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebhookSubscription)(nil)).Elem()
}

func (i WebhookSubscriptionMap) ToWebhookSubscriptionMapOutput() WebhookSubscriptionMapOutput {
	return i.ToWebhookSubscriptionMapOutputWithContext(context.Background())
}

func (i WebhookSubscriptionMap) ToWebhookSubscriptionMapOutputWithContext(ctx context.Context) WebhookSubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookSubscriptionMapOutput)
}

type WebhookSubscriptionOutput struct{ *pulumi.OutputState }

func (WebhookSubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WebhookSubscription)(nil)).Elem()
}

func (o WebhookSubscriptionOutput) ToWebhookSubscriptionOutput() WebhookSubscriptionOutput {
	return o
}

func (o WebhookSubscriptionOutput) ToWebhookSubscriptionOutputWithContext(ctx context.Context) WebhookSubscriptionOutput {
	return o
}

// Determines whether the subscription will produce webhook events.
func (o WebhookSubscriptionOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v *WebhookSubscription) pulumi.BoolOutput { return v.Active }).(pulumi.BoolOutput)
}

// The object describing where to send the webhooks.
func (o WebhookSubscriptionOutput) DeliveryMethods() WebhookSubscriptionDeliveryMethodArrayOutput {
	return o.ApplyT(func(v *WebhookSubscription) WebhookSubscriptionDeliveryMethodArrayOutput { return v.DeliveryMethods }).(WebhookSubscriptionDeliveryMethodArrayOutput)
}

// A short description of the webhook subscription
func (o WebhookSubscriptionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WebhookSubscription) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A set of outbound event types the webhook will receive. The follow event types are possible:
// * `incident.acknowledged`
// * `incident.annotated`
// * `incident.delegated`
// * `incident.escalated`
// * `incident.priority_updated`
// * `incident.reassigned`
// * `incident.reopened`
// * `incident.resolved`
// * `incident.responder.added`
// * `incident.responder.replied`
// * `incident.status_update_published`
// * `incident.triggered`
// * `incident.unacknowledged`
func (o WebhookSubscriptionOutput) Events() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WebhookSubscription) pulumi.StringArrayOutput { return v.Events }).(pulumi.StringArrayOutput)
}

// determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `serviceReference`, `teamReference` and `accountReference`.
func (o WebhookSubscriptionOutput) Filters() WebhookSubscriptionFilterArrayOutput {
	return o.ApplyT(func(v *WebhookSubscription) WebhookSubscriptionFilterArrayOutput { return v.Filters }).(WebhookSubscriptionFilterArrayOutput)
}

// The type indicating the schema of the object. The provider sets this as `webhookSubscription`, which is currently the only acceptable value.
func (o WebhookSubscriptionOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WebhookSubscription) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type WebhookSubscriptionArrayOutput struct{ *pulumi.OutputState }

func (WebhookSubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebhookSubscription)(nil)).Elem()
}

func (o WebhookSubscriptionArrayOutput) ToWebhookSubscriptionArrayOutput() WebhookSubscriptionArrayOutput {
	return o
}

func (o WebhookSubscriptionArrayOutput) ToWebhookSubscriptionArrayOutputWithContext(ctx context.Context) WebhookSubscriptionArrayOutput {
	return o
}

func (o WebhookSubscriptionArrayOutput) Index(i pulumi.IntInput) WebhookSubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WebhookSubscription {
		return vs[0].([]*WebhookSubscription)[vs[1].(int)]
	}).(WebhookSubscriptionOutput)
}

type WebhookSubscriptionMapOutput struct{ *pulumi.OutputState }

func (WebhookSubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebhookSubscription)(nil)).Elem()
}

func (o WebhookSubscriptionMapOutput) ToWebhookSubscriptionMapOutput() WebhookSubscriptionMapOutput {
	return o
}

func (o WebhookSubscriptionMapOutput) ToWebhookSubscriptionMapOutputWithContext(ctx context.Context) WebhookSubscriptionMapOutput {
	return o
}

func (o WebhookSubscriptionMapOutput) MapIndex(k pulumi.StringInput) WebhookSubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WebhookSubscription {
		return vs[0].(map[string]*WebhookSubscription)[vs[1].(string)]
	}).(WebhookSubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookSubscriptionInput)(nil)).Elem(), &WebhookSubscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookSubscriptionArrayInput)(nil)).Elem(), WebhookSubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookSubscriptionMapInput)(nil)).Elem(), WebhookSubscriptionMap{})
	pulumi.RegisterOutputType(WebhookSubscriptionOutput{})
	pulumi.RegisterOutputType(WebhookSubscriptionArrayOutput{})
	pulumi.RegisterOutputType(WebhookSubscriptionMapOutput{})
}
