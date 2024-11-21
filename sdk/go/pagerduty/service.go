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

// A [service](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE5Nw-create-a-service) represents something you monitor (like a web service, email service, or database service). It is a container for related incidents that associates them with escalation policies.
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
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//			})
//			if err != nil {
//				return err
//			}
//			foo, err := pagerduty.NewEscalationPolicy(ctx, "foo", &pagerduty.EscalationPolicyArgs{
//				Name:     pulumi.String("Engineering Escalation Policy"),
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("user_reference"),
//								Id:   example.ID(),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewService(ctx, "example", &pagerduty.ServiceArgs{
//				Name:                   pulumi.String("My Web App"),
//				AutoResolveTimeout:     pulumi.String("14400"),
//				AcknowledgementTimeout: pulumi.String("600"),
//				EscalationPolicy:       foo.ID(),
//				AlertCreation:          pulumi.String("create_alerts_and_incidents"),
//				AutoPauseNotificationsParameters: &pagerduty.ServiceAutoPauseNotificationsParametersArgs{
//					Enabled: pulumi.Bool(true),
//					Timeout: pulumi.Int(300),
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
// Services can be imported using the `id`, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/service:Service main PLBP09X
// ```
type Service struct {
	pulumi.CustomResourceState

	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
	AcknowledgementTimeout pulumi.StringPtrOutput `pulumi:"acknowledgementTimeout"`
	// (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service.
	AlertCreation pulumi.StringPtrOutput `pulumi:"alertCreation"`
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.type`
	AlertGrouping pulumi.StringOutput `pulumi:"alertGrouping"`
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident. Instructions on how to migrate this configuration to `AlertGroupingSetting` resource can be found here.
	//
	// Deprecated: Use a resource `AlertGroupingSetting` instead.
	// Follow the migration guide at https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/resources/alert_grouping_setting#migration-from-alert_grouping_parameters
	AlertGroupingParameters ServiceAlertGroupingParametersOutput `pulumi:"alertGroupingParameters"`
	// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.config.timeout`
	AlertGroupingTimeout pulumi.StringOutput `pulumi:"alertGroupingTimeout"`
	// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
	AutoPauseNotificationsParameters ServiceAutoPauseNotificationsParametersOutput `pulumi:"autoPauseNotificationsParameters"`
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout pulumi.StringPtrOutput `pulumi:"autoResolveTimeout"`
	// Creation timestamp of the service.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// A human-friendly description of the service.
	// If not set, a placeholder of "Managed by Pulumi" will be set.
	Description pulumi.StringOutput `pulumi:"description"`
	// The escalation policy used by this service.
	EscalationPolicy pulumi.StringOutput `pulumi:"escalationPolicy"`
	// URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl             pulumi.StringOutput              `pulumi:"htmlUrl"`
	IncidentUrgencyRule ServiceIncidentUrgencyRuleOutput `pulumi:"incidentUrgencyRule"`
	// Last incident timestamp of the service.
	LastIncidentTimestamp pulumi.StringOutput `pulumi:"lastIncidentTimestamp"`
	// The name of the service.
	Name pulumi.StringOutput `pulumi:"name"`
	// (Deprecated) The response play used by this service.
	ResponsePlay     pulumi.StringOutput               `pulumi:"responsePlay"`
	ScheduledActions ServiceScheduledActionArrayOutput `pulumi:"scheduledActions"`
	// The status of the service.
	Status       pulumi.StringOutput          `pulumi:"status"`
	SupportHours ServiceSupportHoursPtrOutput `pulumi:"supportHours"`
	// The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
	Type pulumi.StringOutput `pulumi:"type"`
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
	AcknowledgementTimeout *string `pulumi:"acknowledgementTimeout"`
	// (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service.
	AlertCreation *string `pulumi:"alertCreation"`
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.type`
	AlertGrouping *string `pulumi:"alertGrouping"`
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident. Instructions on how to migrate this configuration to `AlertGroupingSetting` resource can be found here.
	//
	// Deprecated: Use a resource `AlertGroupingSetting` instead.
	// Follow the migration guide at https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/resources/alert_grouping_setting#migration-from-alert_grouping_parameters
	AlertGroupingParameters *ServiceAlertGroupingParameters `pulumi:"alertGroupingParameters"`
	// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.config.timeout`
	AlertGroupingTimeout *string `pulumi:"alertGroupingTimeout"`
	// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
	AutoPauseNotificationsParameters *ServiceAutoPauseNotificationsParameters `pulumi:"autoPauseNotificationsParameters"`
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout *string `pulumi:"autoResolveTimeout"`
	// Creation timestamp of the service.
	CreatedAt *string `pulumi:"createdAt"`
	// A human-friendly description of the service.
	// If not set, a placeholder of "Managed by Pulumi" will be set.
	Description *string `pulumi:"description"`
	// The escalation policy used by this service.
	EscalationPolicy *string `pulumi:"escalationPolicy"`
	// URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl             *string                     `pulumi:"htmlUrl"`
	IncidentUrgencyRule *ServiceIncidentUrgencyRule `pulumi:"incidentUrgencyRule"`
	// Last incident timestamp of the service.
	LastIncidentTimestamp *string `pulumi:"lastIncidentTimestamp"`
	// The name of the service.
	Name *string `pulumi:"name"`
	// (Deprecated) The response play used by this service.
	ResponsePlay     *string                  `pulumi:"responsePlay"`
	ScheduledActions []ServiceScheduledAction `pulumi:"scheduledActions"`
	// The status of the service.
	Status       *string              `pulumi:"status"`
	SupportHours *ServiceSupportHours `pulumi:"supportHours"`
	// The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
	Type *string `pulumi:"type"`
}

type ServiceState struct {
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
	AcknowledgementTimeout pulumi.StringPtrInput
	// (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service.
	AlertCreation pulumi.StringPtrInput
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.type`
	AlertGrouping pulumi.StringPtrInput
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident. Instructions on how to migrate this configuration to `AlertGroupingSetting` resource can be found here.
	//
	// Deprecated: Use a resource `AlertGroupingSetting` instead.
	// Follow the migration guide at https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/resources/alert_grouping_setting#migration-from-alert_grouping_parameters
	AlertGroupingParameters ServiceAlertGroupingParametersPtrInput
	// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.config.timeout`
	AlertGroupingTimeout pulumi.StringPtrInput
	// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
	AutoPauseNotificationsParameters ServiceAutoPauseNotificationsParametersPtrInput
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout pulumi.StringPtrInput
	// Creation timestamp of the service.
	CreatedAt pulumi.StringPtrInput
	// A human-friendly description of the service.
	// If not set, a placeholder of "Managed by Pulumi" will be set.
	Description pulumi.StringPtrInput
	// The escalation policy used by this service.
	EscalationPolicy pulumi.StringPtrInput
	// URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl             pulumi.StringPtrInput
	IncidentUrgencyRule ServiceIncidentUrgencyRulePtrInput
	// Last incident timestamp of the service.
	LastIncidentTimestamp pulumi.StringPtrInput
	// The name of the service.
	Name pulumi.StringPtrInput
	// (Deprecated) The response play used by this service.
	ResponsePlay     pulumi.StringPtrInput
	ScheduledActions ServiceScheduledActionArrayInput
	// The status of the service.
	Status       pulumi.StringPtrInput
	SupportHours ServiceSupportHoursPtrInput
	// The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
	Type pulumi.StringPtrInput
}

func (ServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceState)(nil)).Elem()
}

type serviceArgs struct {
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
	AcknowledgementTimeout *string `pulumi:"acknowledgementTimeout"`
	// (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service.
	AlertCreation *string `pulumi:"alertCreation"`
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.type`
	AlertGrouping *string `pulumi:"alertGrouping"`
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident. Instructions on how to migrate this configuration to `AlertGroupingSetting` resource can be found here.
	//
	// Deprecated: Use a resource `AlertGroupingSetting` instead.
	// Follow the migration guide at https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/resources/alert_grouping_setting#migration-from-alert_grouping_parameters
	AlertGroupingParameters *ServiceAlertGroupingParameters `pulumi:"alertGroupingParameters"`
	// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.config.timeout`
	AlertGroupingTimeout *string `pulumi:"alertGroupingTimeout"`
	// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
	AutoPauseNotificationsParameters *ServiceAutoPauseNotificationsParameters `pulumi:"autoPauseNotificationsParameters"`
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout *string `pulumi:"autoResolveTimeout"`
	// A human-friendly description of the service.
	// If not set, a placeholder of "Managed by Pulumi" will be set.
	Description *string `pulumi:"description"`
	// The escalation policy used by this service.
	EscalationPolicy    string                      `pulumi:"escalationPolicy"`
	IncidentUrgencyRule *ServiceIncidentUrgencyRule `pulumi:"incidentUrgencyRule"`
	// The name of the service.
	Name *string `pulumi:"name"`
	// (Deprecated) The response play used by this service.
	ResponsePlay     *string                  `pulumi:"responsePlay"`
	ScheduledActions []ServiceScheduledAction `pulumi:"scheduledActions"`
	SupportHours     *ServiceSupportHours     `pulumi:"supportHours"`
}

// The set of arguments for constructing a Service resource.
type ServiceArgs struct {
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
	AcknowledgementTimeout pulumi.StringPtrInput
	// (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service.
	AlertCreation pulumi.StringPtrInput
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.type`
	AlertGrouping pulumi.StringPtrInput
	// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident. Instructions on how to migrate this configuration to `AlertGroupingSetting` resource can be found here.
	//
	// Deprecated: Use a resource `AlertGroupingSetting` instead.
	// Follow the migration guide at https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/resources/alert_grouping_setting#migration-from-alert_grouping_parameters
	AlertGroupingParameters ServiceAlertGroupingParametersPtrInput
	// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
	//
	// Deprecated: Use `alert_grouping_parameters.config.timeout`
	AlertGroupingTimeout pulumi.StringPtrInput
	// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
	AutoPauseNotificationsParameters ServiceAutoPauseNotificationsParametersPtrInput
	// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
	AutoResolveTimeout pulumi.StringPtrInput
	// A human-friendly description of the service.
	// If not set, a placeholder of "Managed by Pulumi" will be set.
	Description pulumi.StringPtrInput
	// The escalation policy used by this service.
	EscalationPolicy    pulumi.StringInput
	IncidentUrgencyRule ServiceIncidentUrgencyRulePtrInput
	// The name of the service.
	Name pulumi.StringPtrInput
	// (Deprecated) The response play used by this service.
	ResponsePlay     pulumi.StringPtrInput
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
	return reflect.TypeOf((**Service)(nil)).Elem()
}

func (i *Service) ToServiceOutput() ServiceOutput {
	return i.ToServiceOutputWithContext(context.Background())
}

func (i *Service) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOutput)
}

// ServiceArrayInput is an input type that accepts ServiceArray and ServiceArrayOutput values.
// You can construct a concrete instance of `ServiceArrayInput` via:
//
//	ServiceArray{ ServiceArgs{...} }
type ServiceArrayInput interface {
	pulumi.Input

	ToServiceArrayOutput() ServiceArrayOutput
	ToServiceArrayOutputWithContext(context.Context) ServiceArrayOutput
}

type ServiceArray []ServiceInput

func (ServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Service)(nil)).Elem()
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
//	ServiceMap{ "key": ServiceArgs{...} }
type ServiceMapInput interface {
	pulumi.Input

	ToServiceMapOutput() ServiceMapOutput
	ToServiceMapOutputWithContext(context.Context) ServiceMapOutput
}

type ServiceMap map[string]ServiceInput

func (ServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Service)(nil)).Elem()
}

func (i ServiceMap) ToServiceMapOutput() ServiceMapOutput {
	return i.ToServiceMapOutputWithContext(context.Background())
}

func (i ServiceMap) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMapOutput)
}

type ServiceOutput struct{ *pulumi.OutputState }

func (ServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil)).Elem()
}

func (o ServiceOutput) ToServiceOutput() ServiceOutput {
	return o
}

func (o ServiceOutput) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return o
}

// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.  If not passed in, will default to '"1800"'.
func (o ServiceOutput) AcknowledgementTimeout() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.AcknowledgementTimeout }).(pulumi.StringPtrOutput)
}

// (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service.
func (o ServiceOutput) AlertCreation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.AlertCreation }).(pulumi.StringPtrOutput)
}

// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
//
// Deprecated: Use `alert_grouping_parameters.type`
func (o ServiceOutput) AlertGrouping() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.AlertGrouping }).(pulumi.StringOutput)
}

// (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident. Instructions on how to migrate this configuration to `AlertGroupingSetting` resource can be found here.
//
// Deprecated: Use a resource `AlertGroupingSetting` instead.
// Follow the migration guide at https://registry.terraform.io/providers/PagerDuty/pagerduty/latest/docs/resources/alert_grouping_setting#migration-from-alert_grouping_parameters
func (o ServiceOutput) AlertGroupingParameters() ServiceAlertGroupingParametersOutput {
	return o.ApplyT(func(v *Service) ServiceAlertGroupingParametersOutput { return v.AlertGroupingParameters }).(ServiceAlertGroupingParametersOutput)
}

// (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
//
// Deprecated: Use `alert_grouping_parameters.config.timeout`
func (o ServiceOutput) AlertGroupingTimeout() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.AlertGroupingTimeout }).(pulumi.StringOutput)
}

// Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
func (o ServiceOutput) AutoPauseNotificationsParameters() ServiceAutoPauseNotificationsParametersOutput {
	return o.ApplyT(func(v *Service) ServiceAutoPauseNotificationsParametersOutput {
		return v.AutoPauseNotificationsParameters
	}).(ServiceAutoPauseNotificationsParametersOutput)
}

// Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
func (o ServiceOutput) AutoResolveTimeout() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.AutoResolveTimeout }).(pulumi.StringPtrOutput)
}

// Creation timestamp of the service.
func (o ServiceOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// A human-friendly description of the service.
// If not set, a placeholder of "Managed by Pulumi" will be set.
func (o ServiceOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The escalation policy used by this service.
func (o ServiceOutput) EscalationPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.EscalationPolicy }).(pulumi.StringOutput)
}

// URL at which the entity is uniquely displayed in the Web app.
func (o ServiceOutput) HtmlUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.HtmlUrl }).(pulumi.StringOutput)
}

func (o ServiceOutput) IncidentUrgencyRule() ServiceIncidentUrgencyRuleOutput {
	return o.ApplyT(func(v *Service) ServiceIncidentUrgencyRuleOutput { return v.IncidentUrgencyRule }).(ServiceIncidentUrgencyRuleOutput)
}

// Last incident timestamp of the service.
func (o ServiceOutput) LastIncidentTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.LastIncidentTimestamp }).(pulumi.StringOutput)
}

// The name of the service.
func (o ServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (Deprecated) The response play used by this service.
func (o ServiceOutput) ResponsePlay() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.ResponsePlay }).(pulumi.StringOutput)
}

func (o ServiceOutput) ScheduledActions() ServiceScheduledActionArrayOutput {
	return o.ApplyT(func(v *Service) ServiceScheduledActionArrayOutput { return v.ScheduledActions }).(ServiceScheduledActionArrayOutput)
}

// The status of the service.
func (o ServiceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

func (o ServiceOutput) SupportHours() ServiceSupportHoursPtrOutput {
	return o.ApplyT(func(v *Service) ServiceSupportHoursPtrOutput { return v.SupportHours }).(ServiceSupportHoursPtrOutput)
}

// The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
func (o ServiceOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ServiceArrayOutput struct{ *pulumi.OutputState }

func (ServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Service)(nil)).Elem()
}

func (o ServiceArrayOutput) ToServiceArrayOutput() ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) Index(i pulumi.IntInput) ServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Service {
		return vs[0].([]*Service)[vs[1].(int)]
	}).(ServiceOutput)
}

type ServiceMapOutput struct{ *pulumi.OutputState }

func (ServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Service)(nil)).Elem()
}

func (o ServiceMapOutput) ToServiceMapOutput() ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) MapIndex(k pulumi.StringInput) ServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Service {
		return vs[0].(map[string]*Service)[vs[1].(string)]
	}).(ServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceInput)(nil)).Elem(), &Service{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceArrayInput)(nil)).Elem(), ServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceMapInput)(nil)).Elem(), ServiceMap{})
	pulumi.RegisterOutputType(ServiceOutput{})
	pulumi.RegisterOutputType(ServiceArrayOutput{})
	pulumi.RegisterOutputType(ServiceMapOutput{})
}
