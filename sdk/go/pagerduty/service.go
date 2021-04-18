// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [service](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Services/get_services) represents something you monitor (like a web service, email service, or database service). It is a container for related incidents that associates them with escalation policies.
//
// ## Import
//
// Services can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/service:Service main PLBP09X
// ```
type Service struct {
	pulumi.CustomResourceState

	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.
	AcknowledgementTimeout pulumi.StringPtrOutput `pulumi:"acknowledgementTimeout"`
	// Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "createIncidents" is default: events will create an incident that cannot be merged. Value "createAlertsAndIncidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
	AlertCreation pulumi.StringPtrOutput `pulumi:"alertCreation"`
	// Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan.
	AlertGrouping pulumi.StringPtrOutput `pulumi:"alertGrouping"`
	// The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
	AlertGroupingTimeout pulumi.IntPtrOutput `pulumi:"alertGroupingTimeout"`
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout pulumi.StringPtrOutput `pulumi:"autoResolveTimeout"`
	CreatedAt          pulumi.StringOutput    `pulumi:"createdAt"`
	Description        pulumi.StringOutput    `pulumi:"description"`
	// The escalation policy used by this service.
	EscalationPolicy      pulumi.StringOutput              `pulumi:"escalationPolicy"`
	HtmlUrl               pulumi.StringOutput              `pulumi:"htmlUrl"`
	IncidentUrgencyRule   ServiceIncidentUrgencyRuleOutput `pulumi:"incidentUrgencyRule"`
	LastIncidentTimestamp pulumi.StringOutput              `pulumi:"lastIncidentTimestamp"`
	// The name of the service.
	Name             pulumi.StringOutput               `pulumi:"name"`
	ScheduledActions ServiceScheduledActionArrayOutput `pulumi:"scheduledActions"`
	Status           pulumi.StringOutput               `pulumi:"status"`
	SupportHours     ServiceSupportHoursPtrOutput      `pulumi:"supportHours"`
}

// NewService registers a new resource with the given unique name, arguments, and options.
func NewService(ctx *pulumi.Context,
	name string, args *ServiceArgs, opts ...pulumi.ResourceOption) (*Service, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EscalationPolicy == nil {
		return nil, errors.New("invalid value for required argument 'EscalationPolicy'")
	}
	if args.Description == nil {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	var resource Service
	err := ctx.RegisterResource("pagerduty:index/service:Service", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetService gets an existing Service resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceState, opts ...pulumi.ResourceOption) (*Service, error) {
	var resource Service
	err := ctx.ReadResource("pagerduty:index/service:Service", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Service resources.
type serviceState struct {
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.
	AcknowledgementTimeout *string `pulumi:"acknowledgementTimeout"`
	// Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "createIncidents" is default: events will create an incident that cannot be merged. Value "createAlertsAndIncidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
	AlertCreation *string `pulumi:"alertCreation"`
	// Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan.
	AlertGrouping *string `pulumi:"alertGrouping"`
	// The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
	AlertGroupingTimeout *int `pulumi:"alertGroupingTimeout"`
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout *string `pulumi:"autoResolveTimeout"`
	CreatedAt          *string `pulumi:"createdAt"`
	Description        *string `pulumi:"description"`
	// The escalation policy used by this service.
	EscalationPolicy      *string                     `pulumi:"escalationPolicy"`
	HtmlUrl               *string                     `pulumi:"htmlUrl"`
	IncidentUrgencyRule   *ServiceIncidentUrgencyRule `pulumi:"incidentUrgencyRule"`
	LastIncidentTimestamp *string                     `pulumi:"lastIncidentTimestamp"`
	// The name of the service.
	Name             *string                  `pulumi:"name"`
	ScheduledActions []ServiceScheduledAction `pulumi:"scheduledActions"`
	Status           *string                  `pulumi:"status"`
	SupportHours     *ServiceSupportHours     `pulumi:"supportHours"`
}

type ServiceState struct {
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.
	AcknowledgementTimeout pulumi.StringPtrInput
	// Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "createIncidents" is default: events will create an incident that cannot be merged. Value "createAlertsAndIncidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
	AlertCreation pulumi.StringPtrInput
	// Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan.
	AlertGrouping pulumi.StringPtrInput
	// The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
	AlertGroupingTimeout pulumi.IntPtrInput
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout pulumi.StringPtrInput
	CreatedAt          pulumi.StringPtrInput
	Description        pulumi.StringPtrInput
	// The escalation policy used by this service.
	EscalationPolicy      pulumi.StringPtrInput
	HtmlUrl               pulumi.StringPtrInput
	IncidentUrgencyRule   ServiceIncidentUrgencyRulePtrInput
	LastIncidentTimestamp pulumi.StringPtrInput
	// The name of the service.
	Name             pulumi.StringPtrInput
	ScheduledActions ServiceScheduledActionArrayInput
	Status           pulumi.StringPtrInput
	SupportHours     ServiceSupportHoursPtrInput
}

func (ServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceState)(nil)).Elem()
}

type serviceArgs struct {
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.
	AcknowledgementTimeout *string `pulumi:"acknowledgementTimeout"`
	// Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "createIncidents" is default: events will create an incident that cannot be merged. Value "createAlertsAndIncidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
	AlertCreation *string `pulumi:"alertCreation"`
	// Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan.
	AlertGrouping *string `pulumi:"alertGrouping"`
	// The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
	AlertGroupingTimeout *int `pulumi:"alertGroupingTimeout"`
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout *string `pulumi:"autoResolveTimeout"`
	Description        *string `pulumi:"description"`
	// The escalation policy used by this service.
	EscalationPolicy    string                      `pulumi:"escalationPolicy"`
	IncidentUrgencyRule *ServiceIncidentUrgencyRule `pulumi:"incidentUrgencyRule"`
	// The name of the service.
	Name             *string                  `pulumi:"name"`
	ScheduledActions []ServiceScheduledAction `pulumi:"scheduledActions"`
	SupportHours     *ServiceSupportHours     `pulumi:"supportHours"`
}

// The set of arguments for constructing a Service resource.
type ServiceArgs struct {
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.
	AcknowledgementTimeout pulumi.StringPtrInput
	// Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "createIncidents" is default: events will create an incident that cannot be merged. Value "createAlertsAndIncidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
	AlertCreation pulumi.StringPtrInput
	// Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan.
	AlertGrouping pulumi.StringPtrInput
	// The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
	AlertGroupingTimeout pulumi.IntPtrInput
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout pulumi.StringPtrInput
	Description        pulumi.StringPtrInput
	// The escalation policy used by this service.
	EscalationPolicy    pulumi.StringInput
	IncidentUrgencyRule ServiceIncidentUrgencyRulePtrInput
	// The name of the service.
	Name             pulumi.StringPtrInput
	ScheduledActions ServiceScheduledActionArrayInput
	SupportHours     ServiceSupportHoursPtrInput
}

func (ServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceArgs)(nil)).Elem()
}

type ServiceInput interface {
	pulumi.Input

	ToServiceOutput() ServiceOutput
	ToServiceOutputWithContext(ctx context.Context) ServiceOutput
}

func (*Service) ElementType() reflect.Type {
	return reflect.TypeOf((*Service)(nil))
}

func (i *Service) ToServiceOutput() ServiceOutput {
	return i.ToServiceOutputWithContext(context.Background())
}

func (i *Service) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOutput)
}

func (i *Service) ToServicePtrOutput() ServicePtrOutput {
	return i.ToServicePtrOutputWithContext(context.Background())
}

func (i *Service) ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePtrOutput)
}

type ServicePtrInput interface {
	pulumi.Input

	ToServicePtrOutput() ServicePtrOutput
	ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput
}

type servicePtrType ServiceArgs

func (*servicePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil))
}

func (i *servicePtrType) ToServicePtrOutput() ServicePtrOutput {
	return i.ToServicePtrOutputWithContext(context.Background())
}

func (i *servicePtrType) ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePtrOutput)
}

// ServiceArrayInput is an input type that accepts ServiceArray and ServiceArrayOutput values.
// You can construct a concrete instance of `ServiceArrayInput` via:
//
//          ServiceArray{ ServiceArgs{...} }
type ServiceArrayInput interface {
	pulumi.Input

	ToServiceArrayOutput() ServiceArrayOutput
	ToServiceArrayOutputWithContext(context.Context) ServiceArrayOutput
}

type ServiceArray []ServiceInput

func (ServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Service)(nil))
}

func (i ServiceArray) ToServiceArrayOutput() ServiceArrayOutput {
	return i.ToServiceArrayOutputWithContext(context.Background())
}

func (i ServiceArray) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceArrayOutput)
}

// ServiceMapInput is an input type that accepts ServiceMap and ServiceMapOutput values.
// You can construct a concrete instance of `ServiceMapInput` via:
//
//          ServiceMap{ "key": ServiceArgs{...} }
type ServiceMapInput interface {
	pulumi.Input

	ToServiceMapOutput() ServiceMapOutput
	ToServiceMapOutputWithContext(context.Context) ServiceMapOutput
}

type ServiceMap map[string]ServiceInput

func (ServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Service)(nil))
}

func (i ServiceMap) ToServiceMapOutput() ServiceMapOutput {
	return i.ToServiceMapOutputWithContext(context.Background())
}

func (i ServiceMap) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMapOutput)
}

type ServiceOutput struct {
	*pulumi.OutputState
}

func (ServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Service)(nil))
}

func (o ServiceOutput) ToServiceOutput() ServiceOutput {
	return o
}

func (o ServiceOutput) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return o
}

func (o ServiceOutput) ToServicePtrOutput() ServicePtrOutput {
	return o.ToServicePtrOutputWithContext(context.Background())
}

func (o ServiceOutput) ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput {
	return o.ApplyT(func(v Service) *Service {
		return &v
	}).(ServicePtrOutput)
}

type ServicePtrOutput struct {
	*pulumi.OutputState
}

func (ServicePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil))
}

func (o ServicePtrOutput) ToServicePtrOutput() ServicePtrOutput {
	return o
}

func (o ServicePtrOutput) ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput {
	return o
}

type ServiceArrayOutput struct{ *pulumi.OutputState }

func (ServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Service)(nil))
}

func (o ServiceArrayOutput) ToServiceArrayOutput() ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) Index(i pulumi.IntInput) ServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Service {
		return vs[0].([]Service)[vs[1].(int)]
	}).(ServiceOutput)
}

type ServiceMapOutput struct{ *pulumi.OutputState }

func (ServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Service)(nil))
}

func (o ServiceMapOutput) ToServiceMapOutput() ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) MapIndex(k pulumi.StringInput) ServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Service {
		return vs[0].(map[string]Service)[vs[1].(string)]
	}).(ServiceOutput)
}

func init() {
	pulumi.RegisterOutputType(ServiceOutput{})
	pulumi.RegisterOutputType(ServicePtrOutput{})
	pulumi.RegisterOutputType(ServiceArrayOutput{})
	pulumi.RegisterOutputType(ServiceMapOutput{})
}
