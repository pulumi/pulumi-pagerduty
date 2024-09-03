// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.ServiceAlertGroupingParametersArgs;
import com.pulumi.pagerduty.inputs.ServiceAutoPauseNotificationsParametersArgs;
import com.pulumi.pagerduty.inputs.ServiceIncidentUrgencyRuleArgs;
import com.pulumi.pagerduty.inputs.ServiceScheduledActionArgs;
import com.pulumi.pagerduty.inputs.ServiceSupportHoursArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `&#34;null&#34;` string.  If not passed in, will default to &#39;&#34;1800&#34;&#39;.
     * 
     */
    @Import(name="acknowledgementTimeout")
    private @Nullable Output<String> acknowledgementTimeout;

    /**
     * @return Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `&#34;null&#34;` string.  If not passed in, will default to &#39;&#34;1800&#34;&#39;.
     * 
     */
    public Optional<Output<String>> acknowledgementTimeout() {
        return Optional.ofNullable(this.acknowledgementTimeout);
    }

    /**
     * (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details &lt;https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service&gt;.
     * 
     */
    @Import(name="alertCreation")
    private @Nullable Output<String> alertCreation;

    /**
     * @return (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details &lt;https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service&gt;.
     * 
     */
    public Optional<Output<String>> alertCreation() {
        return Optional.ofNullable(this.alertCreation);
    }

    /**
     * (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
     * 
     * @deprecated
     * Use `alert_grouping_parameters.type`
     * 
     */
    @Deprecated /* Use `alert_grouping_parameters.type` */
    @Import(name="alertGrouping")
    private @Nullable Output<String> alertGrouping;

    /**
     * @return (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
     * 
     * @deprecated
     * Use `alert_grouping_parameters.type`
     * 
     */
    @Deprecated /* Use `alert_grouping_parameters.type` */
    public Optional<Output<String>> alertGrouping() {
        return Optional.ofNullable(this.alertGrouping);
    }

    /**
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
     * 
     */
    @Import(name="alertGroupingParameters")
    private @Nullable Output<ServiceAlertGroupingParametersArgs> alertGroupingParameters;

    /**
     * @return Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
     * 
     */
    public Optional<Output<ServiceAlertGroupingParametersArgs>> alertGroupingParameters() {
        return Optional.ofNullable(this.alertGroupingParameters);
    }

    /**
     * (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
     * 
     * @deprecated
     * Use `alert_grouping_parameters.config.timeout`
     * 
     */
    @Deprecated /* Use `alert_grouping_parameters.config.timeout` */
    @Import(name="alertGroupingTimeout")
    private @Nullable Output<String> alertGroupingTimeout;

    /**
     * @return (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
     * 
     * @deprecated
     * Use `alert_grouping_parameters.config.timeout`
     * 
     */
    @Deprecated /* Use `alert_grouping_parameters.config.timeout` */
    public Optional<Output<String>> alertGroupingTimeout() {
        return Optional.ofNullable(this.alertGroupingTimeout);
    }

    /**
     * Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
     * 
     */
    @Import(name="autoPauseNotificationsParameters")
    private @Nullable Output<ServiceAutoPauseNotificationsParametersArgs> autoPauseNotificationsParameters;

    /**
     * @return Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
     * 
     */
    public Optional<Output<ServiceAutoPauseNotificationsParametersArgs>> autoPauseNotificationsParameters() {
        return Optional.ofNullable(this.autoPauseNotificationsParameters);
    }

    /**
     * Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `&#34;null&#34;` string.
     * 
     */
    @Import(name="autoResolveTimeout")
    private @Nullable Output<String> autoResolveTimeout;

    /**
     * @return Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `&#34;null&#34;` string.
     * 
     */
    public Optional<Output<String>> autoResolveTimeout() {
        return Optional.ofNullable(this.autoResolveTimeout);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The escalation policy used by this service.
     * 
     */
    @Import(name="escalationPolicy", required=true)
    private Output<String> escalationPolicy;

    /**
     * @return The escalation policy used by this service.
     * 
     */
    public Output<String> escalationPolicy() {
        return this.escalationPolicy;
    }

    @Import(name="incidentUrgencyRule")
    private @Nullable Output<ServiceIncidentUrgencyRuleArgs> incidentUrgencyRule;

    public Optional<Output<ServiceIncidentUrgencyRuleArgs>> incidentUrgencyRule() {
        return Optional.ofNullable(this.incidentUrgencyRule);
    }

    /**
     * The name of the service.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the service.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The response play used by this service.
     * 
     */
    @Import(name="responsePlay")
    private @Nullable Output<String> responsePlay;

    /**
     * @return The response play used by this service.
     * 
     */
    public Optional<Output<String>> responsePlay() {
        return Optional.ofNullable(this.responsePlay);
    }

    @Import(name="scheduledActions")
    private @Nullable Output<List<ServiceScheduledActionArgs>> scheduledActions;

    public Optional<Output<List<ServiceScheduledActionArgs>>> scheduledActions() {
        return Optional.ofNullable(this.scheduledActions);
    }

    @Import(name="supportHours")
    private @Nullable Output<ServiceSupportHoursArgs> supportHours;

    public Optional<Output<ServiceSupportHoursArgs>> supportHours() {
        return Optional.ofNullable(this.supportHours);
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.acknowledgementTimeout = $.acknowledgementTimeout;
        this.alertCreation = $.alertCreation;
        this.alertGrouping = $.alertGrouping;
        this.alertGroupingParameters = $.alertGroupingParameters;
        this.alertGroupingTimeout = $.alertGroupingTimeout;
        this.autoPauseNotificationsParameters = $.autoPauseNotificationsParameters;
        this.autoResolveTimeout = $.autoResolveTimeout;
        this.description = $.description;
        this.escalationPolicy = $.escalationPolicy;
        this.incidentUrgencyRule = $.incidentUrgencyRule;
        this.name = $.name;
        this.responsePlay = $.responsePlay;
        this.scheduledActions = $.scheduledActions;
        this.supportHours = $.supportHours;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acknowledgementTimeout Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `&#34;null&#34;` string.  If not passed in, will default to &#39;&#34;1800&#34;&#39;.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementTimeout(@Nullable Output<String> acknowledgementTimeout) {
            $.acknowledgementTimeout = acknowledgementTimeout;
            return this;
        }

        /**
         * @param acknowledgementTimeout Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `&#34;null&#34;` string.  If not passed in, will default to &#39;&#34;1800&#34;&#39;.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementTimeout(String acknowledgementTimeout) {
            return acknowledgementTimeout(Output.of(acknowledgementTimeout));
        }

        /**
         * @param alertCreation (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details &lt;https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service&gt;.
         * 
         * @return builder
         * 
         */
        public Builder alertCreation(@Nullable Output<String> alertCreation) {
            $.alertCreation = alertCreation;
            return this;
        }

        /**
         * @param alertCreation (Deprecated) This attribute has been deprecated as all services will be migrated to use alerts and incidents. The incident only service setting will be no longer available and this attribute will be removed in an upcoming version. See knowledge base for details &lt;https://support.pagerduty.com/docs/alerts#enable-and-disable-alerts-on-a-service&gt;.
         * 
         * @return builder
         * 
         */
        public Builder alertCreation(String alertCreation) {
            return alertCreation(Output.of(alertCreation));
        }

        /**
         * @param alertGrouping (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
         * 
         * @return builder
         * 
         * @deprecated
         * Use `alert_grouping_parameters.type`
         * 
         */
        @Deprecated /* Use `alert_grouping_parameters.type` */
        public Builder alertGrouping(@Nullable Output<String> alertGrouping) {
            $.alertGrouping = alertGrouping;
            return this;
        }

        /**
         * @param alertGrouping (Deprecated) Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan. This field is deprecated, use `alert_grouping_parameters.type` instead,
         * 
         * @return builder
         * 
         * @deprecated
         * Use `alert_grouping_parameters.type`
         * 
         */
        @Deprecated /* Use `alert_grouping_parameters.type` */
        public Builder alertGrouping(String alertGrouping) {
            return alertGrouping(Output.of(alertGrouping));
        }

        /**
         * @param alertGroupingParameters Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
         * 
         * @return builder
         * 
         */
        public Builder alertGroupingParameters(@Nullable Output<ServiceAlertGroupingParametersArgs> alertGroupingParameters) {
            $.alertGroupingParameters = alertGroupingParameters;
            return this;
        }

        /**
         * @param alertGroupingParameters Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident.
         * 
         * @return builder
         * 
         */
        public Builder alertGroupingParameters(ServiceAlertGroupingParametersArgs alertGroupingParameters) {
            return alertGroupingParameters(Output.of(alertGroupingParameters));
        }

        /**
         * @param alertGroupingTimeout (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
         * 
         * @return builder
         * 
         * @deprecated
         * Use `alert_grouping_parameters.config.timeout`
         * 
         */
        @Deprecated /* Use `alert_grouping_parameters.config.timeout` */
        public Builder alertGroupingTimeout(@Nullable Output<String> alertGroupingTimeout) {
            $.alertGroupingTimeout = alertGroupingTimeout;
            return this;
        }

        /**
         * @param alertGroupingTimeout (Deprecated) The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`. This field is deprecated, use `alert_grouping_parameters.config.timeout` instead,
         * 
         * @return builder
         * 
         * @deprecated
         * Use `alert_grouping_parameters.config.timeout`
         * 
         */
        @Deprecated /* Use `alert_grouping_parameters.config.timeout` */
        public Builder alertGroupingTimeout(String alertGroupingTimeout) {
            return alertGroupingTimeout(Output.of(alertGroupingTimeout));
        }

        /**
         * @param autoPauseNotificationsParameters Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
         * 
         * @return builder
         * 
         */
        public Builder autoPauseNotificationsParameters(@Nullable Output<ServiceAutoPauseNotificationsParametersArgs> autoPauseNotificationsParameters) {
            $.autoPauseNotificationsParameters = autoPauseNotificationsParameters;
            return this;
        }

        /**
         * @param autoPauseNotificationsParameters Defines how alerts on this service are automatically suspended for a period of time before triggering, when identified as likely being transient. Note that automatically pausing notifications is only available on certain plans as mentioned [here](https://support.pagerduty.com/docs/auto-pause-incident-notifications).
         * 
         * @return builder
         * 
         */
        public Builder autoPauseNotificationsParameters(ServiceAutoPauseNotificationsParametersArgs autoPauseNotificationsParameters) {
            return autoPauseNotificationsParameters(Output.of(autoPauseNotificationsParameters));
        }

        /**
         * @param autoResolveTimeout Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `&#34;null&#34;` string.
         * 
         * @return builder
         * 
         */
        public Builder autoResolveTimeout(@Nullable Output<String> autoResolveTimeout) {
            $.autoResolveTimeout = autoResolveTimeout;
            return this;
        }

        /**
         * @param autoResolveTimeout Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `&#34;null&#34;` string.
         * 
         * @return builder
         * 
         */
        public Builder autoResolveTimeout(String autoResolveTimeout) {
            return autoResolveTimeout(Output.of(autoResolveTimeout));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param escalationPolicy The escalation policy used by this service.
         * 
         * @return builder
         * 
         */
        public Builder escalationPolicy(Output<String> escalationPolicy) {
            $.escalationPolicy = escalationPolicy;
            return this;
        }

        /**
         * @param escalationPolicy The escalation policy used by this service.
         * 
         * @return builder
         * 
         */
        public Builder escalationPolicy(String escalationPolicy) {
            return escalationPolicy(Output.of(escalationPolicy));
        }

        public Builder incidentUrgencyRule(@Nullable Output<ServiceIncidentUrgencyRuleArgs> incidentUrgencyRule) {
            $.incidentUrgencyRule = incidentUrgencyRule;
            return this;
        }

        public Builder incidentUrgencyRule(ServiceIncidentUrgencyRuleArgs incidentUrgencyRule) {
            return incidentUrgencyRule(Output.of(incidentUrgencyRule));
        }

        /**
         * @param name The name of the service.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param responsePlay The response play used by this service.
         * 
         * @return builder
         * 
         */
        public Builder responsePlay(@Nullable Output<String> responsePlay) {
            $.responsePlay = responsePlay;
            return this;
        }

        /**
         * @param responsePlay The response play used by this service.
         * 
         * @return builder
         * 
         */
        public Builder responsePlay(String responsePlay) {
            return responsePlay(Output.of(responsePlay));
        }

        public Builder scheduledActions(@Nullable Output<List<ServiceScheduledActionArgs>> scheduledActions) {
            $.scheduledActions = scheduledActions;
            return this;
        }

        public Builder scheduledActions(List<ServiceScheduledActionArgs> scheduledActions) {
            return scheduledActions(Output.of(scheduledActions));
        }

        public Builder scheduledActions(ServiceScheduledActionArgs... scheduledActions) {
            return scheduledActions(List.of(scheduledActions));
        }

        public Builder supportHours(@Nullable Output<ServiceSupportHoursArgs> supportHours) {
            $.supportHours = supportHours;
            return this;
        }

        public Builder supportHours(ServiceSupportHoursArgs supportHours) {
            return supportHours(Output.of(supportHours));
        }

        public ServiceArgs build() {
            $.description = Codegen.stringProp("description").output().arg($.description).def("Managed by Pulumi").getNullable();
            if ($.escalationPolicy == null) {
                throw new MissingRequiredPropertyException("ServiceArgs", "escalationPolicy");
            }
            return $;
        }
    }

}
