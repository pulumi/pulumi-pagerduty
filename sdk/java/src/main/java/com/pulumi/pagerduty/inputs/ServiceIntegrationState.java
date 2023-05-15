// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.ServiceIntegrationEmailFilterArgs;
import com.pulumi.pagerduty.inputs.ServiceIntegrationEmailParserArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationState Empty = new ServiceIntegrationState();

    /**
     * Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
     * 
     */
    @Import(name="emailFilterMode")
    private @Nullable Output<String> emailFilterMode;

    /**
     * @return Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
     * 
     */
    public Optional<Output<String>> emailFilterMode() {
        return Optional.ofNullable(this.emailFilterMode);
    }

    @Import(name="emailFilters")
    private @Nullable Output<List<ServiceIntegrationEmailFilterArgs>> emailFilters;

    public Optional<Output<List<ServiceIntegrationEmailFilterArgs>>> emailFilters() {
        return Optional.ofNullable(this.emailFilters);
    }

    /**
     * Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
     * 
     */
    @Import(name="emailIncidentCreation")
    private @Nullable Output<String> emailIncidentCreation;

    /**
     * @return Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
     * 
     */
    public Optional<Output<String>> emailIncidentCreation() {
        return Optional.ofNullable(this.emailIncidentCreation);
    }

    @Import(name="emailParsers")
    private @Nullable Output<List<ServiceIntegrationEmailParserArgs>> emailParsers;

    public Optional<Output<List<ServiceIntegrationEmailParserArgs>>> emailParsers() {
        return Optional.ofNullable(this.emailParsers);
    }

    /**
     * Can be `open_new_incident` or `discard`.
     * 
     */
    @Import(name="emailParsingFallback")
    private @Nullable Output<String> emailParsingFallback;

    /**
     * @return Can be `open_new_incident` or `discard`.
     * 
     */
    public Optional<Output<String>> emailParsingFallback() {
        return Optional.ofNullable(this.emailParsingFallback);
    }

    /**
     * URL at which the entity is uniquely displayed in the Web app.
     * 
     */
    @Import(name="htmlUrl")
    private @Nullable Output<String> htmlUrl;

    /**
     * @return URL at which the entity is uniquely displayed in the Web app.
     * 
     */
    public Optional<Output<String>> htmlUrl() {
        return Optional.ofNullable(this.htmlUrl);
    }

    /**
     * This is the unique fully-qualified email address used for routing emails to this integration for processing.
     * 
     */
    @Import(name="integrationEmail")
    private @Nullable Output<String> integrationEmail;

    /**
     * @return This is the unique fully-qualified email address used for routing emails to this integration for processing.
     * 
     */
    public Optional<Output<String>> integrationEmail() {
        return Optional.ofNullable(this.integrationEmail);
    }

    /**
     * This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     * 
     */
    @Import(name="integrationKey")
    private @Nullable Output<String> integrationKey;

    /**
     * @return This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     * 
     */
    public Optional<Output<String>> integrationKey() {
        return Optional.ofNullable(this.integrationKey);
    }

    /**
     * The name of the service integration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the service integration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the service the integration should belong to.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The ID of the service the integration should belong to.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
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
    @Import(name="type")
    private @Nullable Output<String> type;

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
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
     * 
     */
    @Import(name="vendor")
    private @Nullable Output<String> vendor;

    /**
     * @return The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
     * 
     */
    public Optional<Output<String>> vendor() {
        return Optional.ofNullable(this.vendor);
    }

    private ServiceIntegrationState() {}

    private ServiceIntegrationState(ServiceIntegrationState $) {
        this.emailFilterMode = $.emailFilterMode;
        this.emailFilters = $.emailFilters;
        this.emailIncidentCreation = $.emailIncidentCreation;
        this.emailParsers = $.emailParsers;
        this.emailParsingFallback = $.emailParsingFallback;
        this.htmlUrl = $.htmlUrl;
        this.integrationEmail = $.integrationEmail;
        this.integrationKey = $.integrationKey;
        this.name = $.name;
        this.service = $.service;
        this.type = $.type;
        this.vendor = $.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationState $;

        public Builder() {
            $ = new ServiceIntegrationState();
        }

        public Builder(ServiceIntegrationState defaults) {
            $ = new ServiceIntegrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailFilterMode Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
         * 
         * @return builder
         * 
         */
        public Builder emailFilterMode(@Nullable Output<String> emailFilterMode) {
            $.emailFilterMode = emailFilterMode;
            return this;
        }

        /**
         * @param emailFilterMode Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
         * 
         * @return builder
         * 
         */
        public Builder emailFilterMode(String emailFilterMode) {
            return emailFilterMode(Output.of(emailFilterMode));
        }

        public Builder emailFilters(@Nullable Output<List<ServiceIntegrationEmailFilterArgs>> emailFilters) {
            $.emailFilters = emailFilters;
            return this;
        }

        public Builder emailFilters(List<ServiceIntegrationEmailFilterArgs> emailFilters) {
            return emailFilters(Output.of(emailFilters));
        }

        public Builder emailFilters(ServiceIntegrationEmailFilterArgs... emailFilters) {
            return emailFilters(List.of(emailFilters));
        }

        /**
         * @param emailIncidentCreation Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
         * 
         * @return builder
         * 
         */
        public Builder emailIncidentCreation(@Nullable Output<String> emailIncidentCreation) {
            $.emailIncidentCreation = emailIncidentCreation;
            return this;
        }

        /**
         * @param emailIncidentCreation Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `on_new_email`, `on_new_email_subject`, `only_if_no_open_incidents` or `use_rules`.
         * 
         * @return builder
         * 
         */
        public Builder emailIncidentCreation(String emailIncidentCreation) {
            return emailIncidentCreation(Output.of(emailIncidentCreation));
        }

        public Builder emailParsers(@Nullable Output<List<ServiceIntegrationEmailParserArgs>> emailParsers) {
            $.emailParsers = emailParsers;
            return this;
        }

        public Builder emailParsers(List<ServiceIntegrationEmailParserArgs> emailParsers) {
            return emailParsers(Output.of(emailParsers));
        }

        public Builder emailParsers(ServiceIntegrationEmailParserArgs... emailParsers) {
            return emailParsers(List.of(emailParsers));
        }

        /**
         * @param emailParsingFallback Can be `open_new_incident` or `discard`.
         * 
         * @return builder
         * 
         */
        public Builder emailParsingFallback(@Nullable Output<String> emailParsingFallback) {
            $.emailParsingFallback = emailParsingFallback;
            return this;
        }

        /**
         * @param emailParsingFallback Can be `open_new_incident` or `discard`.
         * 
         * @return builder
         * 
         */
        public Builder emailParsingFallback(String emailParsingFallback) {
            return emailParsingFallback(Output.of(emailParsingFallback));
        }

        /**
         * @param htmlUrl URL at which the entity is uniquely displayed in the Web app.
         * 
         * @return builder
         * 
         */
        public Builder htmlUrl(@Nullable Output<String> htmlUrl) {
            $.htmlUrl = htmlUrl;
            return this;
        }

        /**
         * @param htmlUrl URL at which the entity is uniquely displayed in the Web app.
         * 
         * @return builder
         * 
         */
        public Builder htmlUrl(String htmlUrl) {
            return htmlUrl(Output.of(htmlUrl));
        }

        /**
         * @param integrationEmail This is the unique fully-qualified email address used for routing emails to this integration for processing.
         * 
         * @return builder
         * 
         */
        public Builder integrationEmail(@Nullable Output<String> integrationEmail) {
            $.integrationEmail = integrationEmail;
            return this;
        }

        /**
         * @param integrationEmail This is the unique fully-qualified email address used for routing emails to this integration for processing.
         * 
         * @return builder
         * 
         */
        public Builder integrationEmail(String integrationEmail) {
            return integrationEmail(Output.of(integrationEmail));
        }

        /**
         * @param integrationKey This is the unique key used to route events to this integration when received via the PagerDuty Events API.
         * 
         * @return builder
         * 
         */
        public Builder integrationKey(@Nullable Output<String> integrationKey) {
            $.integrationKey = integrationKey;
            return this;
        }

        /**
         * @param integrationKey This is the unique key used to route events to this integration when received via the PagerDuty Events API.
         * 
         * @return builder
         * 
         */
        public Builder integrationKey(String integrationKey) {
            return integrationKey(Output.of(integrationKey));
        }

        /**
         * @param name The name of the service integration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the service integration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param service The ID of the service the integration should belong to.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The ID of the service the integration should belong to.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param type The service type. Can be:
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
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The service type. Can be:
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
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vendor The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
         * 
         * @return builder
         * 
         */
        public Builder vendor(@Nullable Output<String> vendor) {
            $.vendor = vendor;
            return this;
        }

        /**
         * @param vendor The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
         * 
         * @return builder
         * 
         */
        public Builder vendor(String vendor) {
            return vendor(Output.of(vendor));
        }

        public ServiceIntegrationState build() {
            return $;
        }
    }

}
