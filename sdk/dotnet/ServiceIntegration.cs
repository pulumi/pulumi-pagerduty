// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    /// <summary>
    /// A [service integration](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1services~1%7Bid%7D~1integrations/post) is an integration that belongs to a service.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Pagerduty.User("example", new()
    ///     {
    ///         Name = "Earline Greenholt",
    ///         Email = "125.greenholt.earline@graham.name",
    ///         Teams = new[]
    ///         {
    ///             examplePagerdutyTeam.Id,
    ///         },
    ///     });
    /// 
    ///     var foo = new Pagerduty.EscalationPolicy("foo", new()
    ///     {
    ///         Name = "Engineering Escalation Policy",
    ///         NumLoops = 2,
    ///         Rules = new[]
    ///         {
    ///             new Pagerduty.Inputs.EscalationPolicyRuleArgs
    ///             {
    ///                 EscalationDelayInMinutes = 10,
    ///                 Targets = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.EscalationPolicyRuleTargetArgs
    ///                     {
    ///                         Type = "user",
    ///                         Id = example.Id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleService = new Pagerduty.Service("example", new()
    ///     {
    ///         Name = "My Web App",
    ///         AutoResolveTimeout = "14400",
    ///         AcknowledgementTimeout = "600",
    ///         EscalationPolicy = examplePagerdutyEscalationPolicy.Id,
    ///     });
    /// 
    ///     var exampleServiceIntegration = new Pagerduty.ServiceIntegration("example", new()
    ///     {
    ///         Name = "Generic API Service Integration",
    ///         Type = "generic_events_api_inbound_integration",
    ///         Service = exampleService.Id,
    ///     });
    /// 
    ///     var apiv2 = new Pagerduty.ServiceIntegration("apiv2", new()
    ///     {
    ///         Name = "API V2",
    ///         Type = "events_api_v2_inbound_integration",
    ///         Service = exampleService.Id,
    ///     });
    /// 
    ///     var emailX = new Pagerduty.ServiceIntegration("email_x", new()
    ///     {
    ///         Name = "Email X",
    ///         Type = "generic_email_inbound_integration",
    ///         IntegrationEmail = "ecommerce@subdomain.pagerduty.com",
    ///         Service = exampleService.Id,
    ///     });
    /// 
    ///     var datadog = Pagerduty.GetVendor.Invoke(new()
    ///     {
    ///         Name = "Datadog",
    ///     });
    /// 
    ///     var datadogServiceIntegration = new Pagerduty.ServiceIntegration("datadog", new()
    ///     {
    ///         Name = datadog.Apply(getVendorResult =&gt; getVendorResult.Name),
    ///         Service = exampleService.Id,
    ///         Vendor = datadog.Apply(getVendorResult =&gt; getVendorResult.Id),
    ///     });
    /// 
    ///     var cloudwatch = Pagerduty.GetVendor.Invoke(new()
    ///     {
    ///         Name = "Cloudwatch",
    ///     });
    /// 
    ///     var cloudwatchServiceIntegration = new Pagerduty.ServiceIntegration("cloudwatch", new()
    ///     {
    ///         Name = cloudwatch.Apply(getVendorResult =&gt; getVendorResult.Name),
    ///         Service = exampleService.Id,
    ///         Vendor = cloudwatch.Apply(getVendorResult =&gt; getVendorResult.Id),
    ///     });
    /// 
    ///     var email = Pagerduty.GetVendor.Invoke(new()
    ///     {
    ///         Name = "Email",
    ///     });
    /// 
    ///     var emailServiceIntegration = new Pagerduty.ServiceIntegration("email", new()
    ///     {
    ///         Name = email.Apply(getVendorResult =&gt; getVendorResult.Name),
    ///         Service = exampleService.Id,
    ///         Vendor = email.Apply(getVendorResult =&gt; getVendorResult.Id),
    ///         IntegrationEmail = "s1@your_account.pagerduty.com",
    ///         EmailIncidentCreation = "use_rules",
    ///         EmailFilterMode = "and-rules-email",
    ///         EmailFilters = new[]
    ///         {
    ///             new Pagerduty.Inputs.ServiceIntegrationEmailFilterArgs
    ///             {
    ///                 BodyMode = "always",
    ///                 BodyRegex = null,
    ///                 FromEmailMode = "match",
    ///                 FromEmailRegex = "(@foo.test*)",
    ///                 SubjectMode = "match",
    ///                 SubjectRegex = "(CRITICAL*)",
    ///             },
    ///             new Pagerduty.Inputs.ServiceIntegrationEmailFilterArgs
    ///             {
    ///                 BodyMode = "always",
    ///                 BodyRegex = null,
    ///                 FromEmailMode = "match",
    ///                 FromEmailRegex = "(@bar.com*)",
    ///                 SubjectMode = "match",
    ///                 SubjectRegex = "(CRITICAL*)",
    ///             },
    ///         },
    ///         EmailParsers = new[]
    ///         {
    ///             new Pagerduty.Inputs.ServiceIntegrationEmailParserArgs
    ///             {
    ///                 Action = "resolve",
    ///                 MatchPredicate = new Pagerduty.Inputs.ServiceIntegrationEmailParserMatchPredicateArgs
    ///                 {
    ///                     Type = "any",
    ///                     Predicates = new[]
    ///                     {
    ///                         new Pagerduty.Inputs.ServiceIntegrationEmailParserMatchPredicatePredicateArgs
    ///                         {
    ///                             Matcher = "foo",
    ///                             Part = "subject",
    ///                             Type = "contains",
    ///                         },
    ///                         new Pagerduty.Inputs.ServiceIntegrationEmailParserMatchPredicatePredicateArgs
    ///                         {
    ///                             Type = "not",
    ///                             Predicates = new[]
    ///                             {
    ///                                 new Pagerduty.Inputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs
    ///                                 {
    ///                                     Matcher = "(bar*)",
    ///                                     Part = "body",
    ///                                     Type = "regex",
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 ValueExtractors = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.ServiceIntegrationEmailParserValueExtractorArgs
    ///                     {
    ///                         EndsBefore = "end",
    ///                         Part = "subject",
    ///                         StartsAfter = "start",
    ///                         Type = "between",
    ///                         ValueName = "incident_key",
    ///                     },
    ///                     new Pagerduty.Inputs.ServiceIntegrationEmailParserValueExtractorArgs
    ///                     {
    ///                         EndsBefore = "end",
    ///                         Part = "subject",
    ///                         StartsAfter = "start",
    ///                         Type = "between",
    ///                         ValueName = "FieldName1",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Services can be imported using their related `service` id and service integration `id` separated by a dot, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/serviceIntegration:ServiceIntegration main PLSSSSS.PLIIIII
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/serviceIntegration:ServiceIntegration")]
    public partial class ServiceIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
        /// </summary>
        [Output("emailFilterMode")]
        public Output<string> EmailFilterMode { get; private set; } = null!;

        [Output("emailFilters")]
        public Output<ImmutableArray<Outputs.ServiceIntegrationEmailFilter>> EmailFilters { get; private set; } = null!;

        /// <summary>
        /// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
        /// </summary>
        [Output("emailIncidentCreation")]
        public Output<string> EmailIncidentCreation { get; private set; } = null!;

        [Output("emailParsers")]
        public Output<ImmutableArray<Outputs.ServiceIntegrationEmailParser>> EmailParsers { get; private set; } = null!;

        /// <summary>
        /// Can be `open_new_incident` or `discard`.
        /// </summary>
        [Output("emailParsingFallback")]
        public Output<string> EmailParsingFallback { get; private set; } = null!;

        /// <summary>
        /// URL at which the entity is uniquely displayed in the Web app.
        /// </summary>
        [Output("htmlUrl")]
        public Output<string> HtmlUrl { get; private set; } = null!;

        /// <summary>
        /// This is the unique fully-qualified email address used for routing emails to this integration for processing.
        /// </summary>
        [Output("integrationEmail")]
        public Output<string> IntegrationEmail { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        /// </summary>
        [Output("integrationKey")]
        public Output<string> IntegrationKey { get; private set; } = null!;

        /// <summary>
        /// The name of the service integration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the service the integration should belong to.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;

        /// <summary>
        /// The service type. Can be:
        /// `aws_cloudwatch_inbound_integration`,
        /// `cloudkick_inbound_integration`,
        /// `event_transformer_api_inbound_integration`,
        /// `events_api_v2_inbound_integration` (requires service `alert_creation` to be `create_alerts_and_incidents`),
        /// `generic_email_inbound_integration`,
        /// `generic_events_api_inbound_integration`,
        /// `keynote_inbound_integration`,
        /// `nagios_inbound_integration`,
        /// `pingdom_inbound_integration`or `sql_monitor_inbound_integration`.
        /// 
        /// **Note:** This is meant for **generic** service integrations.
        /// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
        /// </summary>
        [Output("vendor")]
        public Output<string> Vendor { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceIntegration(string name, ServiceIntegrationArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/serviceIntegration:ServiceIntegration", name, args ?? new ServiceIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceIntegration(string name, Input<string> id, ServiceIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/serviceIntegration:ServiceIntegration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServiceIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceIntegration Get(string name, Input<string> id, ServiceIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceIntegration(name, id, state, options);
        }
    }

    public sealed class ServiceIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
        /// </summary>
        [Input("emailFilterMode")]
        public Input<string>? EmailFilterMode { get; set; }

        [Input("emailFilters")]
        private InputList<Inputs.ServiceIntegrationEmailFilterArgs>? _emailFilters;
        public InputList<Inputs.ServiceIntegrationEmailFilterArgs> EmailFilters
        {
            get => _emailFilters ?? (_emailFilters = new InputList<Inputs.ServiceIntegrationEmailFilterArgs>());
            set => _emailFilters = value;
        }

        /// <summary>
        /// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
        /// </summary>
        [Input("emailIncidentCreation")]
        public Input<string>? EmailIncidentCreation { get; set; }

        [Input("emailParsers")]
        private InputList<Inputs.ServiceIntegrationEmailParserArgs>? _emailParsers;
        public InputList<Inputs.ServiceIntegrationEmailParserArgs> EmailParsers
        {
            get => _emailParsers ?? (_emailParsers = new InputList<Inputs.ServiceIntegrationEmailParserArgs>());
            set => _emailParsers = value;
        }

        /// <summary>
        /// Can be `open_new_incident` or `discard`.
        /// </summary>
        [Input("emailParsingFallback")]
        public Input<string>? EmailParsingFallback { get; set; }

        /// <summary>
        /// This is the unique fully-qualified email address used for routing emails to this integration for processing.
        /// </summary>
        [Input("integrationEmail")]
        public Input<string>? IntegrationEmail { get; set; }

        /// <summary>
        /// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        /// </summary>
        [Input("integrationKey")]
        public Input<string>? IntegrationKey { get; set; }

        /// <summary>
        /// The name of the service integration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the service the integration should belong to.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        /// <summary>
        /// The service type. Can be:
        /// `aws_cloudwatch_inbound_integration`,
        /// `cloudkick_inbound_integration`,
        /// `event_transformer_api_inbound_integration`,
        /// `events_api_v2_inbound_integration` (requires service `alert_creation` to be `create_alerts_and_incidents`),
        /// `generic_email_inbound_integration`,
        /// `generic_events_api_inbound_integration`,
        /// `keynote_inbound_integration`,
        /// `nagios_inbound_integration`,
        /// `pingdom_inbound_integration`or `sql_monitor_inbound_integration`.
        /// 
        /// **Note:** This is meant for **generic** service integrations.
        /// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
        /// </summary>
        [Input("vendor")]
        public Input<string>? Vendor { get; set; }

        public ServiceIntegrationArgs()
        {
        }
        public static new ServiceIntegrationArgs Empty => new ServiceIntegrationArgs();
    }

    public sealed class ServiceIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
        /// </summary>
        [Input("emailFilterMode")]
        public Input<string>? EmailFilterMode { get; set; }

        [Input("emailFilters")]
        private InputList<Inputs.ServiceIntegrationEmailFilterGetArgs>? _emailFilters;
        public InputList<Inputs.ServiceIntegrationEmailFilterGetArgs> EmailFilters
        {
            get => _emailFilters ?? (_emailFilters = new InputList<Inputs.ServiceIntegrationEmailFilterGetArgs>());
            set => _emailFilters = value;
        }

        /// <summary>
        /// Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
        /// </summary>
        [Input("emailIncidentCreation")]
        public Input<string>? EmailIncidentCreation { get; set; }

        [Input("emailParsers")]
        private InputList<Inputs.ServiceIntegrationEmailParserGetArgs>? _emailParsers;
        public InputList<Inputs.ServiceIntegrationEmailParserGetArgs> EmailParsers
        {
            get => _emailParsers ?? (_emailParsers = new InputList<Inputs.ServiceIntegrationEmailParserGetArgs>());
            set => _emailParsers = value;
        }

        /// <summary>
        /// Can be `open_new_incident` or `discard`.
        /// </summary>
        [Input("emailParsingFallback")]
        public Input<string>? EmailParsingFallback { get; set; }

        /// <summary>
        /// URL at which the entity is uniquely displayed in the Web app.
        /// </summary>
        [Input("htmlUrl")]
        public Input<string>? HtmlUrl { get; set; }

        /// <summary>
        /// This is the unique fully-qualified email address used for routing emails to this integration for processing.
        /// </summary>
        [Input("integrationEmail")]
        public Input<string>? IntegrationEmail { get; set; }

        /// <summary>
        /// (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        /// </summary>
        [Input("integrationKey")]
        public Input<string>? IntegrationKey { get; set; }

        /// <summary>
        /// The name of the service integration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the service the integration should belong to.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        /// <summary>
        /// The service type. Can be:
        /// `aws_cloudwatch_inbound_integration`,
        /// `cloudkick_inbound_integration`,
        /// `event_transformer_api_inbound_integration`,
        /// `events_api_v2_inbound_integration` (requires service `alert_creation` to be `create_alerts_and_incidents`),
        /// `generic_email_inbound_integration`,
        /// `generic_events_api_inbound_integration`,
        /// `keynote_inbound_integration`,
        /// `nagios_inbound_integration`,
        /// `pingdom_inbound_integration`or `sql_monitor_inbound_integration`.
        /// 
        /// **Note:** This is meant for **generic** service integrations.
        /// To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
        /// </summary>
        [Input("vendor")]
        public Input<string>? Vendor { get; set; }

        public ServiceIntegrationState()
        {
        }
        public static new ServiceIntegrationState Empty => new ServiceIntegrationState();
    }
}
