// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.EventOrchestrationServiceSetRuleActionsAutomationActionHeader;
import com.pulumi.pagerduty.outputs.EventOrchestrationServiceSetRuleActionsAutomationActionParameter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventOrchestrationServiceSetRuleActionsAutomationAction {
    /**
     * @return When true, PagerDuty&#39;s servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
     * 
     */
    private @Nullable Boolean autoSend;
    /**
     * @return Specify custom key/value pairs that&#39;ll be sent with the webhook request as request headers.
     * 
     */
    private @Nullable List<EventOrchestrationServiceSetRuleActionsAutomationActionHeader> headers;
    /**
     * @return The name of the variable
     * 
     */
    private String name;
    /**
     * @return Specify custom key/value pairs that&#39;ll be included in the webhook request&#39;s JSON payload.
     * 
     */
    private @Nullable List<EventOrchestrationServiceSetRuleActionsAutomationActionParameter> parameters;
    /**
     * @return The API endpoint where PagerDuty&#39;s servers will send the webhook request.
     * 
     */
    private String url;

    private EventOrchestrationServiceSetRuleActionsAutomationAction() {}
    /**
     * @return When true, PagerDuty&#39;s servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website and mobile app.
     * 
     */
    public Optional<Boolean> autoSend() {
        return Optional.ofNullable(this.autoSend);
    }
    /**
     * @return Specify custom key/value pairs that&#39;ll be sent with the webhook request as request headers.
     * 
     */
    public List<EventOrchestrationServiceSetRuleActionsAutomationActionHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return The name of the variable
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specify custom key/value pairs that&#39;ll be included in the webhook request&#39;s JSON payload.
     * 
     */
    public List<EventOrchestrationServiceSetRuleActionsAutomationActionParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * @return The API endpoint where PagerDuty&#39;s servers will send the webhook request.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationServiceSetRuleActionsAutomationAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoSend;
        private @Nullable List<EventOrchestrationServiceSetRuleActionsAutomationActionHeader> headers;
        private String name;
        private @Nullable List<EventOrchestrationServiceSetRuleActionsAutomationActionParameter> parameters;
        private String url;
        public Builder() {}
        public Builder(EventOrchestrationServiceSetRuleActionsAutomationAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoSend = defaults.autoSend;
    	      this.headers = defaults.headers;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder autoSend(@Nullable Boolean autoSend) {
            this.autoSend = autoSend;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<EventOrchestrationServiceSetRuleActionsAutomationActionHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(EventOrchestrationServiceSetRuleActionsAutomationActionHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable List<EventOrchestrationServiceSetRuleActionsAutomationActionParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(EventOrchestrationServiceSetRuleActionsAutomationActionParameter... parameters) {
            return parameters(List.of(parameters));
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public EventOrchestrationServiceSetRuleActionsAutomationAction build() {
            final var _resultValue = new EventOrchestrationServiceSetRuleActionsAutomationAction();
            _resultValue.autoSend = autoSend;
            _resultValue.headers = headers;
            _resultValue.name = name;
            _resultValue.parameters = parameters;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
