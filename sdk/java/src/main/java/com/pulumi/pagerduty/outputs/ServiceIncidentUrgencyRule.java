// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.ServiceIncidentUrgencyRuleDuringSupportHours;
import com.pulumi.pagerduty.outputs.ServiceIncidentUrgencyRuleOutsideSupportHours;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIncidentUrgencyRule {
    private @Nullable ServiceIncidentUrgencyRuleDuringSupportHours duringSupportHours;
    private @Nullable ServiceIncidentUrgencyRuleOutsideSupportHours outsideSupportHours;
    /**
     * @return The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
     * 
     */
    private String type;
    private @Nullable String urgency;

    private ServiceIncidentUrgencyRule() {}
    public Optional<ServiceIncidentUrgencyRuleDuringSupportHours> duringSupportHours() {
        return Optional.ofNullable(this.duringSupportHours);
    }
    public Optional<ServiceIncidentUrgencyRuleOutsideSupportHours> outsideSupportHours() {
        return Optional.ofNullable(this.outsideSupportHours);
    }
    /**
     * @return The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
     * 
     */
    public String type() {
        return this.type;
    }
    public Optional<String> urgency() {
        return Optional.ofNullable(this.urgency);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIncidentUrgencyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServiceIncidentUrgencyRuleDuringSupportHours duringSupportHours;
        private @Nullable ServiceIncidentUrgencyRuleOutsideSupportHours outsideSupportHours;
        private String type;
        private @Nullable String urgency;
        public Builder() {}
        public Builder(ServiceIncidentUrgencyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duringSupportHours = defaults.duringSupportHours;
    	      this.outsideSupportHours = defaults.outsideSupportHours;
    	      this.type = defaults.type;
    	      this.urgency = defaults.urgency;
        }

        @CustomType.Setter
        public Builder duringSupportHours(@Nullable ServiceIncidentUrgencyRuleDuringSupportHours duringSupportHours) {

            this.duringSupportHours = duringSupportHours;
            return this;
        }
        @CustomType.Setter
        public Builder outsideSupportHours(@Nullable ServiceIncidentUrgencyRuleOutsideSupportHours outsideSupportHours) {

            this.outsideSupportHours = outsideSupportHours;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ServiceIncidentUrgencyRule", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder urgency(@Nullable String urgency) {

            this.urgency = urgency;
            return this;
        }
        public ServiceIncidentUrgencyRule build() {
            final var _resultValue = new ServiceIncidentUrgencyRule();
            _resultValue.duringSupportHours = duringSupportHours;
            _resultValue.outsideSupportHours = outsideSupportHours;
            _resultValue.type = type;
            _resultValue.urgency = urgency;
            return _resultValue;
        }
    }
}
