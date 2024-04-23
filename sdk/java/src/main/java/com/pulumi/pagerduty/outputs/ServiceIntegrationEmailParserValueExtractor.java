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
public final class ServiceIntegrationEmailParserValueExtractor {
    private @Nullable String endsBefore;
    private String part;
    private @Nullable String regex;
    private @Nullable String startsAfter;
    private String type;
    private String valueName;

    private ServiceIntegrationEmailParserValueExtractor() {}
    public Optional<String> endsBefore() {
        return Optional.ofNullable(this.endsBefore);
    }
    public String part() {
        return this.part;
    }
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }
    public Optional<String> startsAfter() {
        return Optional.ofNullable(this.startsAfter);
    }
    public String type() {
        return this.type;
    }
    public String valueName() {
        return this.valueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationEmailParserValueExtractor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endsBefore;
        private String part;
        private @Nullable String regex;
        private @Nullable String startsAfter;
        private String type;
        private String valueName;
        public Builder() {}
        public Builder(ServiceIntegrationEmailParserValueExtractor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endsBefore = defaults.endsBefore;
    	      this.part = defaults.part;
    	      this.regex = defaults.regex;
    	      this.startsAfter = defaults.startsAfter;
    	      this.type = defaults.type;
    	      this.valueName = defaults.valueName;
        }

        @CustomType.Setter
        public Builder endsBefore(@Nullable String endsBefore) {

            this.endsBefore = endsBefore;
            return this;
        }
        @CustomType.Setter
        public Builder part(String part) {
            if (part == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEmailParserValueExtractor", "part");
            }
            this.part = part;
            return this;
        }
        @CustomType.Setter
        public Builder regex(@Nullable String regex) {

            this.regex = regex;
            return this;
        }
        @CustomType.Setter
        public Builder startsAfter(@Nullable String startsAfter) {

            this.startsAfter = startsAfter;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEmailParserValueExtractor", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder valueName(String valueName) {
            if (valueName == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEmailParserValueExtractor", "valueName");
            }
            this.valueName = valueName;
            return this;
        }
        public ServiceIntegrationEmailParserValueExtractor build() {
            final var _resultValue = new ServiceIntegrationEmailParserValueExtractor();
            _resultValue.endsBefore = endsBefore;
            _resultValue.part = part;
            _resultValue.regex = regex;
            _resultValue.startsAfter = startsAfter;
            _resultValue.type = type;
            _resultValue.valueName = valueName;
            return _resultValue;
        }
    }
}
