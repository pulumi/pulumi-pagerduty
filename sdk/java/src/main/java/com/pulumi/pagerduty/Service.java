// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.ServiceArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.ServiceState;
import com.pulumi.pagerduty.outputs.ServiceAlertGroupingParameters;
import com.pulumi.pagerduty.outputs.ServiceAutoPauseNotificationsParameters;
import com.pulumi.pagerduty.outputs.ServiceIncidentUrgencyRule;
import com.pulumi.pagerduty.outputs.ServiceScheduledAction;
import com.pulumi.pagerduty.outputs.ServiceSupportHours;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A [service](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE5Nw-create-a-service) represents something you monitor (like a web service, email service, or database service). It is a container for related incidents that associates them with escalation policies.
 * 
 * ## Example Usage
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
 * import com.pulumi.pagerduty.inputs.ServiceAutoPauseNotificationsParametersArgs;
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
 *             .build());
 * 
 *         var foo = new EscalationPolicy(&#34;foo&#34;, EscalationPolicyArgs.builder()        
 *             .numLoops(2)
 *             .rules(EscalationPolicyRuleArgs.builder()
 *                 .escalationDelayInMinutes(10)
 *                 .targets(EscalationPolicyRuleTargetArgs.builder()
 *                     .type(&#34;user_reference&#34;)
 *                     .id(exampleUser.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .autoResolveTimeout(14400)
 *             .acknowledgementTimeout(600)
 *             .escalationPolicy(foo.id())
 *             .alertCreation(&#34;create_alerts_and_incidents&#34;)
 *             .autoPauseNotificationsParameters(ServiceAutoPauseNotificationsParametersArgs.builder()
 *                 .enabled(true)
 *                 .timeout(300)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Services can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/service:Service main PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/service:Service")
public class Service extends com.pulumi.resources.CustomResource {
    /**
     * Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `&#34;null&#34;` string.  If not passed in, will default to &#39;&#34;1800&#34;&#39;.
     * 
     */
    @Export(name="acknowledgementTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> acknowledgementTimeout;

    /**
     * @return Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `&#34;null&#34;` string.  If not passed in, will default to &#39;&#34;1800&#34;&#39;.
     * 
     */
    public Output<Optional<String>> acknowledgementTimeout() {
        return Codegen.optional(this.acknowledgementTimeout);
    }
    /**
     * Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value &#34;create_incidents&#34; is default: events will create an incident that cannot be merged. Value &#34;create_alerts_and_incidents&#34; is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
     * 
     */
    @Export(name="alertCreation", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertCreation;

    /**
     * @return Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value &#34;create_incidents&#34; is default: events will create an incident that cannot be merged. Value &#34;create_alerts_and_incidents&#34; is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
     * 
     */
    public Output<Optional<String>> alertCreation() {
        return Codegen.optional(this.alertCreation);
    }
    /**
     * (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
     * 
     * @deprecated
     * Use `alert_grouping_parameters.type`
     * 
     */
    @Deprecated /* Use `alert_grouping_parameters.type` */
    @Export(name="alertGrouping", type=String.class, parameters={})
    private Output<String> alertGrouping;

    /**
     * @return (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
     * 
     */
    public Output<String> alertGrouping() {
        return this.alertGrouping;
    }
    /**
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
     * 
     */
    @Export(name="alertGroupingParameters", type=ServiceAlertGroupingParameters.class, parameters={})
    private Output</* @Nullable */ ServiceAlertGroupingParameters> alertGroupingParameters;

    /**
     * @return Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
     * 
     */
    public Output<Optional<ServiceAlertGroupingParameters>> alertGroupingParameters() {
        return Codegen.optional(this.alertGroupingParameters);
    }
    /**
     * (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
     * 
     * @deprecated
     * Use `alert_grouping_parameters.config.timeout`
     * 
     */
    @Deprecated /* Use `alert_grouping_parameters.config.timeout` */
    @Export(name="alertGroupingTimeout", type=String.class, parameters={})
    private Output<String> alertGroupingTimeout;

    /**
     * @return (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
     * 
     */
    public Output<String> alertGroupingTimeout() {
        return this.alertGroupingTimeout;
    }
    /**
     * Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
     * 
     */
    @Export(name="autoPauseNotificationsParameters", type=ServiceAutoPauseNotificationsParameters.class, parameters={})
    private Output<ServiceAutoPauseNotificationsParameters> autoPauseNotificationsParameters;

    /**
     * @return Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
     * 
     */
    public Output<ServiceAutoPauseNotificationsParameters> autoPauseNotificationsParameters() {
        return this.autoPauseNotificationsParameters;
    }
    /**
     * Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `&#34;null&#34;` string.
     * 
     */
    @Export(name="autoResolveTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoResolveTimeout;

    /**
     * @return Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `&#34;null&#34;` string.
     * 
     */
    public Output<Optional<String>> autoResolveTimeout() {
        return Codegen.optional(this.autoResolveTimeout);
    }
    /**
     * Creation timestamp of the service.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Creation timestamp of the service.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }
    /**
     * The escalation policy used by this service.
     * 
     */
    @Export(name="escalationPolicy", type=String.class, parameters={})
    private Output<String> escalationPolicy;

    /**
     * @return The escalation policy used by this service.
     * 
     */
    public Output<String> escalationPolicy() {
        return this.escalationPolicy;
    }
    /**
     * URL at which the entity is uniquely displayed in the Web app.
     * 
     */
    @Export(name="htmlUrl", type=String.class, parameters={})
    private Output<String> htmlUrl;

    /**
     * @return URL at which the entity is uniquely displayed in the Web app.
     * 
     */
    public Output<String> htmlUrl() {
        return this.htmlUrl;
    }
    @Export(name="incidentUrgencyRule", type=ServiceIncidentUrgencyRule.class, parameters={})
    private Output<ServiceIncidentUrgencyRule> incidentUrgencyRule;

    public Output<ServiceIncidentUrgencyRule> incidentUrgencyRule() {
        return this.incidentUrgencyRule;
    }
    /**
     * Last incident timestamp of the service.
     * 
     */
    @Export(name="lastIncidentTimestamp", type=String.class, parameters={})
    private Output<String> lastIncidentTimestamp;

    /**
     * @return Last incident timestamp of the service.
     * 
     */
    public Output<String> lastIncidentTimestamp() {
        return this.lastIncidentTimestamp;
    }
    /**
     * The name of the service.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The response play used by this service.
     * 
     */
    @Export(name="responsePlay", type=String.class, parameters={})
    private Output</* @Nullable */ String> responsePlay;

    /**
     * @return The response play used by this service.
     * 
     */
    public Output<Optional<String>> responsePlay() {
        return Codegen.optional(this.responsePlay);
    }
    @Export(name="scheduledActions", type=List.class, parameters={ServiceScheduledAction.class})
    private Output</* @Nullable */ List<ServiceScheduledAction>> scheduledActions;

    public Output<Optional<List<ServiceScheduledAction>>> scheduledActions() {
        return Codegen.optional(this.scheduledActions);
    }
    /**
     * The status of the service.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the service.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    @Export(name="supportHours", type=ServiceSupportHours.class, parameters={})
    private Output</* @Nullable */ ServiceSupportHours> supportHours;

    public Output<Optional<ServiceSupportHours>> supportHours() {
        return Codegen.optional(this.supportHours);
    }
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `content_based`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of alert grouping; one of `intelligent`, `time` or `content_based`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/service:Service", name, state, makeResourceOptions(options, id));
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
    public static Service get(String name, Output<String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}
