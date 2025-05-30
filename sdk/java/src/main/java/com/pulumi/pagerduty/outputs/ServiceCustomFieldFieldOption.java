// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceCustomFieldFieldOption {
    /**
     * @return Must be `string`.
     * 
     */
    private String dataType;
    /**
     * @return The ID of the service custom field.
     * 
     */
    private @Nullable String id;
    /**
     * @return The value of the option.
     * 
     */
    private String value;

    private ServiceCustomFieldFieldOption() {}
    /**
     * @return Must be `string`.
     * 
     */
    public String dataType() {
        return this.dataType;
    }
    /**
     * @return The ID of the service custom field.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The value of the option.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCustomFieldFieldOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dataType;
        private @Nullable String id;
        private String value;
        public Builder() {}
        public Builder(ServiceCustomFieldFieldOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.id = defaults.id;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder dataType(String dataType) {
            if (dataType == null) {
              throw new MissingRequiredPropertyException("ServiceCustomFieldFieldOption", "dataType");
            }
            this.dataType = dataType;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("ServiceCustomFieldFieldOption", "value");
            }
            this.value = value;
            return this;
        }
        public ServiceCustomFieldFieldOption build() {
            final var _resultValue = new ServiceCustomFieldFieldOption();
            _resultValue.dataType = dataType;
            _resultValue.id = id;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
