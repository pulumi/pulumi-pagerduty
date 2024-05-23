// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventOrchestrationServiceCatchAllActionsAutomationActionHeader {
    /**
     * @return Name to identify the header
     * 
     */
    private String key;
    /**
     * @return Value of this header
     * 
     */
    private String value;

    private EventOrchestrationServiceCatchAllActionsAutomationActionHeader() {}
    /**
     * @return Name to identify the header
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Value of this header
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationServiceCatchAllActionsAutomationActionHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(EventOrchestrationServiceCatchAllActionsAutomationActionHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("EventOrchestrationServiceCatchAllActionsAutomationActionHeader", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("EventOrchestrationServiceCatchAllActionsAutomationActionHeader", "value");
            }
            this.value = value;
            return this;
        }
        public EventOrchestrationServiceCatchAllActionsAutomationActionHeader build() {
            final var _resultValue = new EventOrchestrationServiceCatchAllActionsAutomationActionHeader();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
