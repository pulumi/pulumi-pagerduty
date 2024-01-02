// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIncidentUrgencyRuleOutsideSupportHours {
    /**
     * @return The type of alert grouping; one of `intelligent`, `time` or `content_based`.
     * 
     */
    private @Nullable String type;
    /**
     * @return The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severity_based` Set&#39;s the urgency of the incident based on the severity set by the triggering monitoring tool.
     * 
     */
    private @Nullable String urgency;

    private ServiceIncidentUrgencyRuleOutsideSupportHours() {}
    /**
     * @return The type of alert grouping; one of `intelligent`, `time` or `content_based`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severity_based` Set&#39;s the urgency of the incident based on the severity set by the triggering monitoring tool.
     * 
     */
    public Optional<String> urgency() {
        return Optional.ofNullable(this.urgency);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIncidentUrgencyRuleOutsideSupportHours defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        private @Nullable String urgency;
        public Builder() {}
        public Builder(ServiceIncidentUrgencyRuleOutsideSupportHours defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.urgency = defaults.urgency;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder urgency(@Nullable String urgency) {

            this.urgency = urgency;
            return this;
        }
        public ServiceIncidentUrgencyRuleOutsideSupportHours build() {
            final var _resultValue = new ServiceIncidentUrgencyRuleOutsideSupportHours();
            _resultValue.type = type;
            _resultValue.urgency = urgency;
            return _resultValue;
        }
    }
}
