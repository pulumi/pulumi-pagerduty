// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.GetEventOrchestrationGlobalCacheVariableCondition;
import com.pulumi.pagerduty.outputs.GetEventOrchestrationGlobalCacheVariableConfiguration;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEventOrchestrationGlobalCacheVariableResult {
    /**
     * @return Conditions to be evaluated in order to determine whether or not to update the Cache Variable&#39;s stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
     * 
     */
    private List<GetEventOrchestrationGlobalCacheVariableCondition> conditions;
    /**
     * @return A configuration object to define what and how values will be stored in the Cache Variable.
     * 
     */
    private List<GetEventOrchestrationGlobalCacheVariableConfiguration> configurations;
    /**
     * @return Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
     * 
     */
    private Boolean disabled;
    private String eventOrchestration;
    private @Nullable String id;
    private @Nullable String name;

    private GetEventOrchestrationGlobalCacheVariableResult() {}
    /**
     * @return Conditions to be evaluated in order to determine whether or not to update the Cache Variable&#39;s stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
     * 
     */
    public List<GetEventOrchestrationGlobalCacheVariableCondition> conditions() {
        return this.conditions;
    }
    /**
     * @return A configuration object to define what and how values will be stored in the Cache Variable.
     * 
     */
    public List<GetEventOrchestrationGlobalCacheVariableConfiguration> configurations() {
        return this.configurations;
    }
    /**
     * @return Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    public String eventOrchestration() {
        return this.eventOrchestration;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventOrchestrationGlobalCacheVariableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEventOrchestrationGlobalCacheVariableCondition> conditions;
        private List<GetEventOrchestrationGlobalCacheVariableConfiguration> configurations;
        private Boolean disabled;
        private String eventOrchestration;
        private @Nullable String id;
        private @Nullable String name;
        public Builder() {}
        public Builder(GetEventOrchestrationGlobalCacheVariableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.configurations = defaults.configurations;
    	      this.disabled = defaults.disabled;
    	      this.eventOrchestration = defaults.eventOrchestration;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder conditions(List<GetEventOrchestrationGlobalCacheVariableCondition> conditions) {
            if (conditions == null) {
              throw new MissingRequiredPropertyException("GetEventOrchestrationGlobalCacheVariableResult", "conditions");
            }
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(GetEventOrchestrationGlobalCacheVariableCondition... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder configurations(List<GetEventOrchestrationGlobalCacheVariableConfiguration> configurations) {
            if (configurations == null) {
              throw new MissingRequiredPropertyException("GetEventOrchestrationGlobalCacheVariableResult", "configurations");
            }
            this.configurations = configurations;
            return this;
        }
        public Builder configurations(GetEventOrchestrationGlobalCacheVariableConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetEventOrchestrationGlobalCacheVariableResult", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder eventOrchestration(String eventOrchestration) {
            if (eventOrchestration == null) {
              throw new MissingRequiredPropertyException("GetEventOrchestrationGlobalCacheVariableResult", "eventOrchestration");
            }
            this.eventOrchestration = eventOrchestration;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public GetEventOrchestrationGlobalCacheVariableResult build() {
            final var _resultValue = new GetEventOrchestrationGlobalCacheVariableResult();
            _resultValue.conditions = conditions;
            _resultValue.configurations = configurations;
            _resultValue.disabled = disabled;
            _resultValue.eventOrchestration = eventOrchestration;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
