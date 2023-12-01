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

// A [service integration](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1services~1%7Bid%7D~1integrations/post) is an integration that belongs to a service.
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
//			exampleUser, err := pagerduty.NewUser(ctx, "exampleUser", &pagerduty.UserArgs{
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//				Teams: pulumi.StringArray{
//					pagerduty_team.Example.Id,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEscalationPolicy(ctx, "foo", &pagerduty.EscalationPolicyArgs{
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("user"),
//								Id:   exampleUser.ID(),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleService, err := pagerduty.NewService(ctx, "exampleService", &pagerduty.ServiceArgs{
//				AutoResolveTimeout:     pulumi.String("14400"),
//				AcknowledgementTimeout: pulumi.String("600"),
//				EscalationPolicy:       pulumi.Any(pagerduty_escalation_policy.Example.Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceIntegration(ctx, "exampleServiceIntegration", &pagerduty.ServiceIntegrationArgs{
//				Type:    pulumi.String("generic_events_api_inbound_integration"),
//				Service: exampleService.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceIntegration(ctx, "apiv2", &pagerduty.ServiceIntegrationArgs{
//				Type:    pulumi.String("events_api_v2_inbound_integration"),
//				Service: exampleService.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceIntegration(ctx, "emailX", &pagerduty.ServiceIntegrationArgs{
//				Type:             pulumi.String("generic_email_inbound_integration"),
//				IntegrationEmail: pulumi.String("ecommerce@subdomain.pagerduty.com"),
//				Service:          exampleService.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			datadogVendor, err := pagerduty.GetVendor(ctx, &pagerduty.GetVendorArgs{
//				Name: "Datadog",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceIntegration(ctx, "datadogServiceIntegration", &pagerduty.ServiceIntegrationArgs{
//				Service: exampleService.ID(),
//				Vendor:  *pulumi.String(datadogVendor.Id),
//			})
//			if err != nil {
//				return err
//			}
//			cloudwatchVendor, err := pagerduty.GetVendor(ctx, &pagerduty.GetVendorArgs{
//				Name: "Cloudwatch",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceIntegration(ctx, "cloudwatchServiceIntegration", &pagerduty.ServiceIntegrationArgs{
//				Service: exampleService.ID(),
//				Vendor:  *pulumi.String(cloudwatchVendor.Id),
//			})
//			if err != nil {
//				return err
//			}
//			emailVendor, err := pagerduty.GetVendor(ctx, &pagerduty.GetVendorArgs{
//				Name: "Email",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceIntegration(ctx, "emailServiceIntegration", &pagerduty.ServiceIntegrationArgs{
//				Service:               exampleService.ID(),
//				Vendor:                *pulumi.String(emailVendor.Id),
//				IntegrationEmail:      pulumi.String("s1@your_account.pagerduty.com"),
//				EmailIncidentCreation: pulumi.String("use_rules"),
//				EmailFilterMode:       pulumi.String("and-rules-email"),
//				EmailFilters: pagerduty.ServiceIntegrationEmailFilterArray{
//					&pagerduty.ServiceIntegrationEmailFilterArgs{
//						BodyMode:       pulumi.String("always"),
//						BodyRegex:      nil,
//						FromEmailMode:  pulumi.String("match"),
//						FromEmailRegex: pulumi.String("(@foo.test*)"),
//						SubjectMode:    pulumi.String("match"),
//						SubjectRegex:   pulumi.String("(CRITICAL*)"),
//					},
//					&pagerduty.ServiceIntegrationEmailFilterArgs{
//						BodyMode:       pulumi.String("always"),
//						BodyRegex:      nil,
//						FromEmailMode:  pulumi.String("match"),
//						FromEmailRegex: pulumi.String("(@bar.com*)"),
//						SubjectMode:    pulumi.String("match"),
//						SubjectRegex:   pulumi.String("(CRITICAL*)"),
//					},
//				},
//				EmailParsers: pagerduty.ServiceIntegrationEmailParserArray{
//					&pagerduty.ServiceIntegrationEmailParserArgs{
//						Action: pulumi.String("resolve"),
//						MatchPredicate: &pagerduty.ServiceIntegrationEmailParserMatchPredicateArgs{
//							Type: pulumi.String("any"),
//							Predicates: pagerduty.ServiceIntegrationEmailParserMatchPredicatePredicateArray{
//								&pagerduty.ServiceIntegrationEmailParserMatchPredicatePredicateArgs{
//									Matcher: pulumi.String("foo"),
//									Part:    pulumi.String("subject"),
//									Type:    pulumi.String("contains"),
//								},
//								&pagerduty.ServiceIntegrationEmailParserMatchPredicatePredicateArgs{
//									Type: pulumi.String("not"),
//									Predicates: pagerduty.ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArray{
//										&pagerduty.ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs{
//											Matcher: pulumi.String("(bar*)"),
//											Part:    pulumi.String("body"),
//											Type:    pulumi.String("regex"),
//										},
//									},
//								},
//							},
//						},
//						ValueExtractors: pagerduty.ServiceIntegrationEmailParserValueExtractorArray{
//							&pagerduty.ServiceIntegrationEmailParserValueExtractorArgs{
//								EndsBefore:  pulumi.String("end"),
//								Part:        pulumi.String("subject"),
//								StartsAfter: pulumi.String("start"),
//								Type:        pulumi.String("between"),
//								ValueName:   pulumi.String("incident_key"),
//							},
//							&pagerduty.ServiceIntegrationEmailParserValueExtractorArgs{
//								EndsBefore:  pulumi.String("end"),
//								Part:        pulumi.String("subject"),
//								StartsAfter: pulumi.String("start"),
//								Type:        pulumi.String("between"),
//								ValueName:   pulumi.String("FieldName1"),
//							},
//						},
//					},
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
// Services can be imported using their related `service` id and service integration `id` separated by a dot, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/serviceIntegration:ServiceIntegration main PLSSSSS.PLIIIII
//
// ```
type ServiceIntegration struct {
	pulumi.CustomResourceState

	// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
	EmailFilterMode pulumi.StringOutput                      `pulumi:"emailFilterMode"`
	EmailFilters    ServiceIntegrationEmailFilterArrayOutput `pulumi:"emailFilters"`
	// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
	EmailIncidentCreation pulumi.StringOutput                      `pulumi:"emailIncidentCreation"`
	EmailParsers          ServiceIntegrationEmailParserArrayOutput `pulumi:"emailParsers"`
	// Can be `openNewIncident` or `discard`.
	EmailParsingFallback pulumi.StringOutput `pulumi:"emailParsingFallback"`
	// URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl pulumi.StringOutput `pulumi:"htmlUrl"`
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail pulumi.StringOutput `pulumi:"integrationEmail"`
	// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	//
	// Deprecated: Assignments or updates to this attribute are not supported by Service Integrations API, it is a read-only value. Input support will be dropped in upcomming major release
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
	//
	// **Note:** This is meant for **generic** service integrations.
	// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
	Type pulumi.StringOutput `pulumi:"type"`
	// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
	EmailFilterMode *string                         `pulumi:"emailFilterMode"`
	EmailFilters    []ServiceIntegrationEmailFilter `pulumi:"emailFilters"`
	// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
	EmailIncidentCreation *string                         `pulumi:"emailIncidentCreation"`
	EmailParsers          []ServiceIntegrationEmailParser `pulumi:"emailParsers"`
	// Can be `openNewIncident` or `discard`.
	EmailParsingFallback *string `pulumi:"emailParsingFallback"`
	// URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl *string `pulumi:"htmlUrl"`
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail *string `pulumi:"integrationEmail"`
	// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	//
	// Deprecated: Assignments or updates to this attribute are not supported by Service Integrations API, it is a read-only value. Input support will be dropped in upcomming major release
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
	//
	// **Note:** This is meant for **generic** service integrations.
	// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
	Type *string `pulumi:"type"`
	// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
	Vendor *string `pulumi:"vendor"`
}

type ServiceIntegrationState struct {
	// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
	EmailFilterMode pulumi.StringPtrInput
	EmailFilters    ServiceIntegrationEmailFilterArrayInput
	// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
	EmailIncidentCreation pulumi.StringPtrInput
	EmailParsers          ServiceIntegrationEmailParserArrayInput
	// Can be `openNewIncident` or `discard`.
	EmailParsingFallback pulumi.StringPtrInput
	// URL at which the entity is uniquely displayed in the Web app.
	HtmlUrl pulumi.StringPtrInput
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail pulumi.StringPtrInput
	// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	//
	// Deprecated: Assignments or updates to this attribute are not supported by Service Integrations API, it is a read-only value. Input support will be dropped in upcomming major release
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
	//
	// **Note:** This is meant for **generic** service integrations.
	// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
	Type pulumi.StringPtrInput
	// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
	Vendor pulumi.StringPtrInput
}

func (ServiceIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIntegrationState)(nil)).Elem()
}

type serviceIntegrationArgs struct {
	// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
	EmailFilterMode *string                         `pulumi:"emailFilterMode"`
	EmailFilters    []ServiceIntegrationEmailFilter `pulumi:"emailFilters"`
	// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
	EmailIncidentCreation *string                         `pulumi:"emailIncidentCreation"`
	EmailParsers          []ServiceIntegrationEmailParser `pulumi:"emailParsers"`
	// Can be `openNewIncident` or `discard`.
	EmailParsingFallback *string `pulumi:"emailParsingFallback"`
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail *string `pulumi:"integrationEmail"`
	// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	//
	// Deprecated: Assignments or updates to this attribute are not supported by Service Integrations API, it is a read-only value. Input support will be dropped in upcomming major release
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
	//
	// **Note:** This is meant for **generic** service integrations.
	// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
	Type *string `pulumi:"type"`
	// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
	Vendor *string `pulumi:"vendor"`
}

// The set of arguments for constructing a ServiceIntegration resource.
type ServiceIntegrationArgs struct {
	// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
	EmailFilterMode pulumi.StringPtrInput
	EmailFilters    ServiceIntegrationEmailFilterArrayInput
	// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
	EmailIncidentCreation pulumi.StringPtrInput
	EmailParsers          ServiceIntegrationEmailParserArrayInput
	// Can be `openNewIncident` or `discard`.
	EmailParsingFallback pulumi.StringPtrInput
	// This is the unique fully-qualified email address used for routing emails to this integration for processing.
	IntegrationEmail pulumi.StringPtrInput
	// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
	//
	// Deprecated: Assignments or updates to this attribute are not supported by Service Integrations API, it is a read-only value. Input support will be dropped in upcomming major release
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
	//
	// **Note:** This is meant for **generic** service integrations.
	// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
	Type pulumi.StringPtrInput
	// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
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
	return reflect.TypeOf((**ServiceIntegration)(nil)).Elem()
}

func (i *ServiceIntegration) ToServiceIntegrationOutput() ServiceIntegrationOutput {
	return i.ToServiceIntegrationOutputWithContext(context.Background())
}

func (i *ServiceIntegration) ToServiceIntegrationOutputWithContext(ctx context.Context) ServiceIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationOutput)
}

// ServiceIntegrationArrayInput is an input type that accepts ServiceIntegrationArray and ServiceIntegrationArrayOutput values.
// You can construct a concrete instance of `ServiceIntegrationArrayInput` via:
//
//	ServiceIntegrationArray{ ServiceIntegrationArgs{...} }
type ServiceIntegrationArrayInput interface {
	pulumi.Input

	ToServiceIntegrationArrayOutput() ServiceIntegrationArrayOutput
	ToServiceIntegrationArrayOutputWithContext(context.Context) ServiceIntegrationArrayOutput
}

type ServiceIntegrationArray []ServiceIntegrationInput

func (ServiceIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceIntegration)(nil)).Elem()
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
//	ServiceIntegrationMap{ "key": ServiceIntegrationArgs{...} }
type ServiceIntegrationMapInput interface {
	pulumi.Input

	ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput
	ToServiceIntegrationMapOutputWithContext(context.Context) ServiceIntegrationMapOutput
}

type ServiceIntegrationMap map[string]ServiceIntegrationInput

func (ServiceIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceIntegration)(nil)).Elem()
}

func (i ServiceIntegrationMap) ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput {
	return i.ToServiceIntegrationMapOutputWithContext(context.Background())
}

func (i ServiceIntegrationMap) ToServiceIntegrationMapOutputWithContext(ctx context.Context) ServiceIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationMapOutput)
}

type ServiceIntegrationOutput struct{ *pulumi.OutputState }

func (ServiceIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIntegration)(nil)).Elem()
}

func (o ServiceIntegrationOutput) ToServiceIntegrationOutput() ServiceIntegrationOutput {
	return o
}

func (o ServiceIntegrationOutput) ToServiceIntegrationOutputWithContext(ctx context.Context) ServiceIntegrationOutput {
	return o
}

// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
func (o ServiceIntegrationOutput) EmailFilterMode() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.EmailFilterMode }).(pulumi.StringOutput)
}

func (o ServiceIntegrationOutput) EmailFilters() ServiceIntegrationEmailFilterArrayOutput {
	return o.ApplyT(func(v *ServiceIntegration) ServiceIntegrationEmailFilterArrayOutput { return v.EmailFilters }).(ServiceIntegrationEmailFilterArrayOutput)
}

// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
func (o ServiceIntegrationOutput) EmailIncidentCreation() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.EmailIncidentCreation }).(pulumi.StringOutput)
}

func (o ServiceIntegrationOutput) EmailParsers() ServiceIntegrationEmailParserArrayOutput {
	return o.ApplyT(func(v *ServiceIntegration) ServiceIntegrationEmailParserArrayOutput { return v.EmailParsers }).(ServiceIntegrationEmailParserArrayOutput)
}

// Can be `openNewIncident` or `discard`.
func (o ServiceIntegrationOutput) EmailParsingFallback() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.EmailParsingFallback }).(pulumi.StringOutput)
}

// URL at which the entity is uniquely displayed in the Web app.
func (o ServiceIntegrationOutput) HtmlUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.HtmlUrl }).(pulumi.StringOutput)
}

// This is the unique fully-qualified email address used for routing emails to this integration for processing.
func (o ServiceIntegrationOutput) IntegrationEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.IntegrationEmail }).(pulumi.StringOutput)
}

// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
//
// Deprecated: Assignments or updates to this attribute are not supported by Service Integrations API, it is a read-only value. Input support will be dropped in upcomming major release
func (o ServiceIntegrationOutput) IntegrationKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.IntegrationKey }).(pulumi.StringOutput)
}

// The name of the service integration.
func (o ServiceIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the service the integration should belong to.
func (o ServiceIntegrationOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

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
//
// **Note:** This is meant for **generic** service integrations.
// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
func (o ServiceIntegrationOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
func (o ServiceIntegrationOutput) Vendor() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIntegration) pulumi.StringOutput { return v.Vendor }).(pulumi.StringOutput)
}

type ServiceIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ServiceIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceIntegration)(nil)).Elem()
}

func (o ServiceIntegrationArrayOutput) ToServiceIntegrationArrayOutput() ServiceIntegrationArrayOutput {
	return o
}

func (o ServiceIntegrationArrayOutput) ToServiceIntegrationArrayOutputWithContext(ctx context.Context) ServiceIntegrationArrayOutput {
	return o
}

func (o ServiceIntegrationArrayOutput) Index(i pulumi.IntInput) ServiceIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceIntegration {
		return vs[0].([]*ServiceIntegration)[vs[1].(int)]
	}).(ServiceIntegrationOutput)
}

type ServiceIntegrationMapOutput struct{ *pulumi.OutputState }

func (ServiceIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceIntegration)(nil)).Elem()
}

func (o ServiceIntegrationMapOutput) ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput {
	return o
}

func (o ServiceIntegrationMapOutput) ToServiceIntegrationMapOutputWithContext(ctx context.Context) ServiceIntegrationMapOutput {
	return o
}

func (o ServiceIntegrationMapOutput) MapIndex(k pulumi.StringInput) ServiceIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceIntegration {
		return vs[0].(map[string]*ServiceIntegration)[vs[1].(string)]
	}).(ServiceIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIntegrationInput)(nil)).Elem(), &ServiceIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIntegrationArrayInput)(nil)).Elem(), ServiceIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIntegrationMapInput)(nil)).Elem(), ServiceIntegrationMap{})
	pulumi.RegisterOutputType(ServiceIntegrationOutput{})
	pulumi.RegisterOutputType(ServiceIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ServiceIntegrationMapOutput{})
}
