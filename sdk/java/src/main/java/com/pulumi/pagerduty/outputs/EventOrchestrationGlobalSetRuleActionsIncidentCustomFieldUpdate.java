// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate {
    /**
     * @return The custom field id
     * 
     */
    private String id;
    /**
     * @return The value to assign to this custom field
     * 
     */
    private String value;

    private EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate() {}
    /**
     * @return The custom field id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The value to assign to this custom field
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String value;
        public Builder() {}
        public Builder(EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate", "value");
            }
            this.value = value;
            return this;
        }
        public EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate build() {
            final var _resultValue = new EventOrchestrationGlobalSetRuleActionsIncidentCustomFieldUpdate();
            _resultValue.id = id;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
