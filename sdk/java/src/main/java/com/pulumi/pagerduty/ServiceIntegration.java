// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.ServiceIntegrationArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.ServiceIntegrationState;
import com.pulumi.pagerduty.outputs.ServiceIntegrationEmailFilter;
import com.pulumi.pagerduty.outputs.ServiceIntegrationEmailParser;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A [service integration](&lt;https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1services~1%!B(MISSING)id%!D(MISSING)~1integrations/post&gt;) is an integration that belongs to a service.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.EscalationPolicy;
 * import com.pulumi.pagerduty.EscalationPolicyArgs;
 * import com.pulumi.pagerduty.inputs.EscalationPolicyRuleArgs;
 * import com.pulumi.pagerduty.Service;
 * import com.pulumi.pagerduty.ServiceArgs;
 * import com.pulumi.pagerduty.ServiceIntegration;
 * import com.pulumi.pagerduty.ServiceIntegrationArgs;
 * import com.pulumi.pagerduty.PagerdutyFunctions;
 * import com.pulumi.pagerduty.inputs.GetVendorArgs;
 * import com.pulumi.pagerduty.inputs.ServiceIntegrationEmailFilterArgs;
 * import com.pulumi.pagerduty.inputs.ServiceIntegrationEmailParserArgs;
 * import com.pulumi.pagerduty.inputs.ServiceIntegrationEmailParserMatchPredicateArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleUser = new User(&#34;exampleUser&#34;, UserArgs.builder()        
 *             .email(&#34;125.greenholt.earline@graham.name&#34;)
 *             .teams(pagerduty_team.example().id())
 *             .build());
 * 
 *         var foo = new EscalationPolicy(&#34;foo&#34;, EscalationPolicyArgs.builder()        
 *             .numLoops(2)
 *             .rules(EscalationPolicyRuleArgs.builder()
 *                 .escalationDelayInMinutes(10)
 *                 .targets(EscalationPolicyRuleTargetArgs.builder()
 *                     .type(&#34;user&#34;)
 *                     .id(exampleUser.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .autoResolveTimeout(14400)
 *             .acknowledgementTimeout(600)
 *             .escalationPolicy(pagerduty_escalation_policy.example().id())
 *             .build());
 * 
 *         var exampleServiceIntegration = new ServiceIntegration(&#34;exampleServiceIntegration&#34;, ServiceIntegrationArgs.builder()        
 *             .type(&#34;generic_events_api_inbound_integration&#34;)
 *             .service(exampleService.id())
 *             .build());
 * 
 *         var apiv2 = new ServiceIntegration(&#34;apiv2&#34;, ServiceIntegrationArgs.builder()        
 *             .type(&#34;events_api_v2_inbound_integration&#34;)
 *             .service(exampleService.id())
 *             .build());
 * 
 *         var emailX = new ServiceIntegration(&#34;emailX&#34;, ServiceIntegrationArgs.builder()        
 *             .type(&#34;generic_email_inbound_integration&#34;)
 *             .integrationEmail(&#34;ecommerce@subdomain.pagerduty.com&#34;)
 *             .service(exampleService.id())
 *             .build());
 * 
 *         final var datadogVendor = PagerdutyFunctions.getVendor(GetVendorArgs.builder()
 *             .name(&#34;Datadog&#34;)
 *             .build());
 * 
 *         var datadogServiceIntegration = new ServiceIntegration(&#34;datadogServiceIntegration&#34;, ServiceIntegrationArgs.builder()        
 *             .service(exampleService.id())
 *             .vendor(datadogVendor.applyValue(getVendorResult -&gt; getVendorResult.id()))
 *             .build());
 * 
 *         final var cloudwatchVendor = PagerdutyFunctions.getVendor(GetVendorArgs.builder()
 *             .name(&#34;Cloudwatch&#34;)
 *             .build());
 * 
 *         var cloudwatchServiceIntegration = new ServiceIntegration(&#34;cloudwatchServiceIntegration&#34;, ServiceIntegrationArgs.builder()        
 *             .service(exampleService.id())
 *             .vendor(cloudwatchVendor.applyValue(getVendorResult -&gt; getVendorResult.id()))
 *             .build());
 * 
 *         final var emailVendor = PagerdutyFunctions.getVendor(GetVendorArgs.builder()
 *             .name(&#34;Email&#34;)
 *             .build());
 * 
 *         var emailServiceIntegration = new ServiceIntegration(&#34;emailServiceIntegration&#34;, ServiceIntegrationArgs.builder()        
 *             .service(exampleService.id())
 *             .vendor(emailVendor.applyValue(getVendorResult -&gt; getVendorResult.id()))
 *             .integrationEmail(&#34;s1@your_account.pagerduty.com&#34;)
 *             .emailIncidentCreation(&#34;use_rules&#34;)
 *             .emailFilterMode(&#34;and-rules-email&#34;)
 *             .emailFilters(            
 *                 ServiceIntegrationEmailFilterArgs.builder()
 *                     .bodyMode(&#34;always&#34;)
 *                     .bodyRegex(null)
 *                     .fromEmailMode(&#34;match&#34;)
 *                     .fromEmailRegex(&#34;(@foo.test*)&#34;)
 *                     .subjectMode(&#34;match&#34;)
 *                     .subjectRegex(&#34;(CRITICAL*)&#34;)
 *                     .build(),
 *                 ServiceIntegrationEmailFilterArgs.builder()
 *                     .bodyMode(&#34;always&#34;)
 *                     .bodyRegex(null)
 *                     .fromEmailMode(&#34;match&#34;)
 *                     .fromEmailRegex(&#34;(@bar.com*)&#34;)
 *                     .subjectMode(&#34;match&#34;)
 *                     .subjectRegex(&#34;(CRITICAL*)&#34;)
 *                     .build())
 *             .emailParsers(ServiceIntegrationEmailParserArgs.builder()
 *                 .action(&#34;resolve&#34;)
 *                 .matchPredicate(ServiceIntegrationEmailParserMatchPredicateArgs.builder()
 *                     .type(&#34;any&#34;)
 *                     .predicates(                    
 *                         ServiceIntegrationEmailParserMatchPredicatePredicateArgs.builder()
 *                             .matcher(&#34;foo&#34;)
 *                             .part(&#34;subject&#34;)
 *                             .type(&#34;contains&#34;)
 *                             .build(),
 *                         ServiceIntegrationEmailParserMatchPredicatePredicateArgs.builder()
 *                             .type(&#34;not&#34;)
 *                             .predicates(ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs.builder()
 *                                 .matcher(&#34;(bar*)&#34;)
 *                                 .part(&#34;body&#34;)
 *                                 .type(&#34;regex&#34;)
 *                                 .build())
 *                             .build())
 *                     .build())
 *                 .valueExtractors(                
 *                     ServiceIntegrationEmailParserValueExtractorArgs.builder()
 *                         .endsBefore(&#34;end&#34;)
 *                         .part(&#34;subject&#34;)
 *                         .startsAfter(&#34;start&#34;)
 *                         .type(&#34;between&#34;)
 *                         .valueName(&#34;incident_key&#34;)
 *                         .build(),
 *                     ServiceIntegrationEmailParserValueExtractorArgs.builder()
 *                         .endsBefore(&#34;end&#34;)
 *                         .part(&#34;subject&#34;)
 *                         .startsAfter(&#34;start&#34;)
 *                         .type(&#34;between&#34;)
 *                         .valueName(&#34;FieldName1&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Services can be imported using their related `service` id and service integration `id` separated by a dot, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/serviceIntegration:ServiceIntegration main PLSSSSS.PLIIIII
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/serviceIntegration:ServiceIntegration")
public class ServiceIntegration extends com.pulumi.resources.CustomResource {
    /**
     * Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
     * 
     */
    @Export(name="emailFilterMode", refs={String.class}, tree="[0]")
    private Output<String> emailFilterMode;

    /**
     * @return Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
     * 
     */
    public Output<String> emailFilterMode() {
        return this.emailFilterMode;
    }
    @Export(name="emailFilters", refs={List.class,ServiceIntegrationEmailFilter.class}, tree="[0,1]")
    private Output<List<ServiceIntegrationEmailFilter>> emailFilters;

    public Output<List<ServiceIntegrationEmailFilter>> emailFilters() {
        return this.emailFilters;
    }
    /**
     * Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
     * 
     */
    @Export(name="emailIncidentCreation", refs={String.class}, tree="[0]")
    private Output<String> emailIncidentCreation;

    /**
     * @return Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
     * 
     */
    public Output<String> emailIncidentCreation() {
        return this.emailIncidentCreation;
    }
    @Export(name="emailParsers", refs={List.class,ServiceIntegrationEmailParser.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceIntegrationEmailParser>> emailParsers;

    public Output<Optional<List<ServiceIntegrationEmailParser>>> emailParsers() {
        return Codegen.optional(this.emailParsers);
    }
    /**
     * Can be `open_new_incident` or `discard`.
     * 
     */
    @Export(name="emailParsingFallback", refs={String.class}, tree="[0]")
    private Output<String> emailParsingFallback;

    /**
     * @return Can be `open_new_incident` or `discard`.
     * 
     */
    public Output<String> emailParsingFallback() {
        return this.emailParsingFallback;
    }
    /**
     * URL at which the entity is uniquely displayed in the Web app.
     * 
     */
    @Export(name="htmlUrl", refs={String.class}, tree="[0]")
    private Output<String> htmlUrl;

    /**
     * @return URL at which the entity is uniquely displayed in the Web app.
     * 
     */
    public Output<String> htmlUrl() {
        return this.htmlUrl;
    }
    /**
     * This is the unique fully-qualified email address used for routing emails to this integration for processing.
     * 
     */
    @Export(name="integrationEmail", refs={String.class}, tree="[0]")
    private Output<String> integrationEmail;

    /**
     * @return This is the unique fully-qualified email address used for routing emails to this integration for processing.
     * 
     */
    public Output<String> integrationEmail() {
        return this.integrationEmail;
    }
    /**
     * (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     * 
     */
    @Export(name="integrationKey", refs={String.class}, tree="[0]")
    private Output<String> integrationKey;

    /**
     * @return (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     * 
     */
    public Output<String> integrationKey() {
        return this.integrationKey;
    }
    /**
     * The name of the service integration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the service integration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the service the integration should belong to.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The ID of the service the integration should belong to.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * The service type. Can be:
     * `aws_cloudwatch_inbound_integration`,
     * `cloudkick_inbound_integration`,
     * `event_transformer_api_inbound_integration`,
     * `events_api_v2_inbound_integration` (requires service `alert_creation` to be `create_alerts_and_incidents`),
     * `generic_email_inbound_integration`,
     * `generic_events_api_inbound_integration`,
     * `keynote_inbound_integration`,
     * `nagios_inbound_integration`,
     * `pingdom_inbound_integration`or `sql_monitor_inbound_integration`.
     * 
     * **Note:** This is meant for **generic** service integrations.
     * To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The service type. Can be:
     * `aws_cloudwatch_inbound_integration`,
     * `cloudkick_inbound_integration`,
     * `event_transformer_api_inbound_integration`,
     * `events_api_v2_inbound_integration` (requires service `alert_creation` to be `create_alerts_and_incidents`),
     * `generic_email_inbound_integration`,
     * `generic_events_api_inbound_integration`,
     * `keynote_inbound_integration`,
     * `nagios_inbound_integration`,
     * `pingdom_inbound_integration`or `sql_monitor_inbound_integration`.
     * 
     * **Note:** This is meant for **generic** service integrations.
     * To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
     * 
     */
    @Export(name="vendor", refs={String.class}, tree="[0]")
    private Output<String> vendor;

    /**
     * @return The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
     * 
     */
    public Output<String> vendor() {
        return this.vendor;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceIntegration(String name) {
        this(name, ServiceIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceIntegration(String name, ServiceIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceIntegration(String name, ServiceIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/serviceIntegration:ServiceIntegration", name, args == null ? ServiceIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceIntegration(String name, Output<String> id, @Nullable ServiceIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/serviceIntegration:ServiceIntegration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServiceIntegration get(String name, Output<String> id, @Nullable ServiceIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceIntegration(name, id, state, options);
    }
}
