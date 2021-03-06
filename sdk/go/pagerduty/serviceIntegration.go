// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [service integration](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Services/post_services_id_integrations) is an integration that belongs to a service.
//
// ## Import
//
// Services can be imported using their related `service` id and service integration `id` separated by a dot, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/serviceIntegration:ServiceIntegration main PLSSSSS.PLIIIII
// ```
type ServiceIntegration struct {
	pulumi.CustomResourceState

	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringOutput `pulumi:"htmlUrl"`
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail pulumi.StringOutput `pulumi:"integrationEmail"`
	// This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	IntegrationKey pulumi.StringOutput `pulumi:"integrationKey"`
	// The name of the service integration.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the service the integration should belong to.
	Service pulumi.StringOutput `pulumi:"service"`
	// The service type. Can be:
	// `awsCloudwatchInboundIntegration`,
	// `cloudkickInboundIntegration`,
	// `eventTransformerApiInboundIntegration`,
	// `eventsApiV2InboundIntegration` (requires service `alertCreation` to be `createAlertsAndIncidents`),
	// `genericEmailInboundIntegration`,
	// `genericEventsApiInboundIntegration`,
	// `keynoteInboundIntegration`,
	// `nagiosInboundIntegration`,
	// `pingdomInboundIntegration`or `sqlMonitorInboundIntegration`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
	Vendor pulumi.StringOutput `pulumi:"vendor"`
}

// NewServiceIntegration registers a new resource with the given unique name, arguments, and options.
func NewServiceIntegration(ctx *pulumi.Context,
	name string, args *ServiceIntegrationArgs, opts ...pulumi.ResourceOption) (*ServiceIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	var resource ServiceIntegration
	err := ctx.RegisterResource("pagerduty:index/serviceIntegration:ServiceIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceIntegration gets an existing ServiceIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceIntegrationState, opts ...pulumi.ResourceOption) (*ServiceIntegration, error) {
	var resource ServiceIntegration
	err := ctx.ReadResource("pagerduty:index/serviceIntegration:ServiceIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceIntegration resources.
type serviceIntegrationState struct {
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl *string `pulumi:"htmlUrl"`
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail *string `pulumi:"integrationEmail"`
	// This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	IntegrationKey *string `pulumi:"integrationKey"`
	// The name of the service integration.
	Name *string `pulumi:"name"`
	// The ID of the service the integration should belong to.
	Service *string `pulumi:"service"`
	// The service type. Can be:
	// `awsCloudwatchInboundIntegration`,
	// `cloudkickInboundIntegration`,
	// `eventTransformerApiInboundIntegration`,
	// `eventsApiV2InboundIntegration` (requires service `alertCreation` to be `createAlertsAndIncidents`),
	// `genericEmailInboundIntegration`,
	// `genericEventsApiInboundIntegration`,
	// `keynoteInboundIntegration`,
	// `nagiosInboundIntegration`,
	// `pingdomInboundIntegration`or `sqlMonitorInboundIntegration`.
	Type *string `pulumi:"type"`
	// The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
	Vendor *string `pulumi:"vendor"`
}

type ServiceIntegrationState struct {
	// URL at which the entity is uniquely displayed in the Web app
	HtmlUrl pulumi.StringPtrInput
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail pulumi.StringPtrInput
	// This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	IntegrationKey pulumi.StringPtrInput
	// The name of the service integration.
	Name pulumi.StringPtrInput
	// The ID of the service the integration should belong to.
	Service pulumi.StringPtrInput
	// The service type. Can be:
	// `awsCloudwatchInboundIntegration`,
	// `cloudkickInboundIntegration`,
	// `eventTransformerApiInboundIntegration`,
	// `eventsApiV2InboundIntegration` (requires service `alertCreation` to be `createAlertsAndIncidents`),
	// `genericEmailInboundIntegration`,
	// `genericEventsApiInboundIntegration`,
	// `keynoteInboundIntegration`,
	// `nagiosInboundIntegration`,
	// `pingdomInboundIntegration`or `sqlMonitorInboundIntegration`.
	Type pulumi.StringPtrInput
	// The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
	Vendor pulumi.StringPtrInput
}

func (ServiceIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIntegrationState)(nil)).Elem()
}

type serviceIntegrationArgs struct {
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail *string `pulumi:"integrationEmail"`
	// This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	IntegrationKey *string `pulumi:"integrationKey"`
	// The name of the service integration.
	Name *string `pulumi:"name"`
	// The ID of the service the integration should belong to.
	Service string `pulumi:"service"`
	// The service type. Can be:
	// `awsCloudwatchInboundIntegration`,
	// `cloudkickInboundIntegration`,
	// `eventTransformerApiInboundIntegration`,
	// `eventsApiV2InboundIntegration` (requires service `alertCreation` to be `createAlertsAndIncidents`),
	// `genericEmailInboundIntegration`,
	// `genericEventsApiInboundIntegration`,
	// `keynoteInboundIntegration`,
	// `nagiosInboundIntegration`,
	// `pingdomInboundIntegration`or `sqlMonitorInboundIntegration`.
	Type *string `pulumi:"type"`
	// The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
	Vendor *string `pulumi:"vendor"`
}

// The set of arguments for constructing a ServiceIntegration resource.
type ServiceIntegrationArgs struct {
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail pulumi.StringPtrInput
	// This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	IntegrationKey pulumi.StringPtrInput
	// The name of the service integration.
	Name pulumi.StringPtrInput
	// The ID of the service the integration should belong to.
	Service pulumi.StringInput
	// The service type. Can be:
	// `awsCloudwatchInboundIntegration`,
	// `cloudkickInboundIntegration`,
	// `eventTransformerApiInboundIntegration`,
	// `eventsApiV2InboundIntegration` (requires service `alertCreation` to be `createAlertsAndIncidents`),
	// `genericEmailInboundIntegration`,
	// `genericEventsApiInboundIntegration`,
	// `keynoteInboundIntegration`,
	// `nagiosInboundIntegration`,
	// `pingdomInboundIntegration`or `sqlMonitorInboundIntegration`.
	Type pulumi.StringPtrInput
	// The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
	Vendor pulumi.StringPtrInput
}

func (ServiceIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIntegrationArgs)(nil)).Elem()
}

type ServiceIntegrationInput interface {
	pulumi.Input

	ToServiceIntegrationOutput() ServiceIntegrationOutput
	ToServiceIntegrationOutputWithContext(ctx context.Context) ServiceIntegrationOutput
}

func (*ServiceIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceIntegration)(nil))
}

func (i *ServiceIntegration) ToServiceIntegrationOutput() ServiceIntegrationOutput {
	return i.ToServiceIntegrationOutputWithContext(context.Background())
}

func (i *ServiceIntegration) ToServiceIntegrationOutputWithContext(ctx context.Context) ServiceIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationOutput)
}

func (i *ServiceIntegration) ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput {
	return i.ToServiceIntegrationPtrOutputWithContext(context.Background())
}

func (i *ServiceIntegration) ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationPtrOutput)
}

type ServiceIntegrationPtrInput interface {
	pulumi.Input

	ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput
	ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput
}

type serviceIntegrationPtrType ServiceIntegrationArgs

func (*serviceIntegrationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIntegration)(nil))
}

func (i *serviceIntegrationPtrType) ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput {
	return i.ToServiceIntegrationPtrOutputWithContext(context.Background())
}

func (i *serviceIntegrationPtrType) ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationPtrOutput)
}

// ServiceIntegrationArrayInput is an input type that accepts ServiceIntegrationArray and ServiceIntegrationArrayOutput values.
// You can construct a concrete instance of `ServiceIntegrationArrayInput` via:
//
//          ServiceIntegrationArray{ ServiceIntegrationArgs{...} }
type ServiceIntegrationArrayInput interface {
	pulumi.Input

	ToServiceIntegrationArrayOutput() ServiceIntegrationArrayOutput
	ToServiceIntegrationArrayOutputWithContext(context.Context) ServiceIntegrationArrayOutput
}

type ServiceIntegrationArray []ServiceIntegrationInput

func (ServiceIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ServiceIntegration)(nil))
}

func (i ServiceIntegrationArray) ToServiceIntegrationArrayOutput() ServiceIntegrationArrayOutput {
	return i.ToServiceIntegrationArrayOutputWithContext(context.Background())
}

func (i ServiceIntegrationArray) ToServiceIntegrationArrayOutputWithContext(ctx context.Context) ServiceIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationArrayOutput)
}

// ServiceIntegrationMapInput is an input type that accepts ServiceIntegrationMap and ServiceIntegrationMapOutput values.
// You can construct a concrete instance of `ServiceIntegrationMapInput` via:
//
//          ServiceIntegrationMap{ "key": ServiceIntegrationArgs{...} }
type ServiceIntegrationMapInput interface {
	pulumi.Input

	ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput
	ToServiceIntegrationMapOutputWithContext(context.Context) ServiceIntegrationMapOutput
}

type ServiceIntegrationMap map[string]ServiceIntegrationInput

func (ServiceIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ServiceIntegration)(nil))
}

func (i ServiceIntegrationMap) ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput {
	return i.ToServiceIntegrationMapOutputWithContext(context.Background())
}

func (i ServiceIntegrationMap) ToServiceIntegrationMapOutputWithContext(ctx context.Context) ServiceIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationMapOutput)
}

type ServiceIntegrationOutput struct {
	*pulumi.OutputState
}

func (ServiceIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceIntegration)(nil))
}

func (o ServiceIntegrationOutput) ToServiceIntegrationOutput() ServiceIntegrationOutput {
	return o
}

func (o ServiceIntegrationOutput) ToServiceIntegrationOutputWithContext(ctx context.Context) ServiceIntegrationOutput {
	return o
}

func (o ServiceIntegrationOutput) ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput {
	return o.ToServiceIntegrationPtrOutputWithContext(context.Background())
}

func (o ServiceIntegrationOutput) ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput {
	return o.ApplyT(func(v ServiceIntegration) *ServiceIntegration {
		return &v
	}).(ServiceIntegrationPtrOutput)
}

type ServiceIntegrationPtrOutput struct {
	*pulumi.OutputState
}

func (ServiceIntegrationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIntegration)(nil))
}

func (o ServiceIntegrationPtrOutput) ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput {
	return o
}

func (o ServiceIntegrationPtrOutput) ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput {
	return o
}

type ServiceIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ServiceIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ServiceIntegration)(nil))
}

func (o ServiceIntegrationArrayOutput) ToServiceIntegrationArrayOutput() ServiceIntegrationArrayOutput {
	return o
}

func (o ServiceIntegrationArrayOutput) ToServiceIntegrationArrayOutputWithContext(ctx context.Context) ServiceIntegrationArrayOutput {
	return o
}

func (o ServiceIntegrationArrayOutput) Index(i pulumi.IntInput) ServiceIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ServiceIntegration {
		return vs[0].([]ServiceIntegration)[vs[1].(int)]
	}).(ServiceIntegrationOutput)
}

type ServiceIntegrationMapOutput struct{ *pulumi.OutputState }

func (ServiceIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ServiceIntegration)(nil))
}

func (o ServiceIntegrationMapOutput) ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput {
	return o
}

func (o ServiceIntegrationMapOutput) ToServiceIntegrationMapOutputWithContext(ctx context.Context) ServiceIntegrationMapOutput {
	return o
}

func (o ServiceIntegrationMapOutput) MapIndex(k pulumi.StringInput) ServiceIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ServiceIntegration {
		return vs[0].(map[string]ServiceIntegration)[vs[1].(string)]
	}).(ServiceIntegrationOutput)
}

func init() {
	pulumi.RegisterOutputType(ServiceIntegrationOutput{})
	pulumi.RegisterOutputType(ServiceIntegrationPtrOutput{})
	pulumi.RegisterOutputType(ServiceIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ServiceIntegrationMapOutput{})
}
