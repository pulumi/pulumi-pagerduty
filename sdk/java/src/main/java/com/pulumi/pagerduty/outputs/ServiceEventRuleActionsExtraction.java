// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceEventRuleActionsExtraction {
    /**
     * @return The conditions that need to be met for the extraction to happen. Must use valid [RE2 regular expression syntax](https://github.com/google/re2/wiki/Syntax).
     * 
     */
    private @Nullable String regex;
    /**
     * @return Field where the data is being copied from. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     * 
     */
    private @Nullable String source;
    /**
     * @return Field where the data is being copied to. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     * 
     */
    private @Nullable String target;
    /**
     * @return A customized field message. This can also include variables extracted from the payload by using string interpolation.
     * 
     */
    private @Nullable String template;

    private ServiceEventRuleActionsExtraction() {}
    /**
     * @return The conditions that need to be met for the extraction to happen. Must use valid [RE2 regular expression syntax](https://github.com/google/re2/wiki/Syntax).
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * @return Field where the data is being copied from. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return Field where the data is being copied to. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * @return A customized field message. This can also include variables extracted from the payload by using string interpolation.
     * 
     */
    public Optional<String> template() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEventRuleActionsExtraction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String regex;
        private @Nullable String source;
        private @Nullable String target;
        private @Nullable String template;
        public Builder() {}
        public Builder(ServiceEventRuleActionsExtraction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.template = defaults.template;
        }

        @CustomType.Setter
        public Builder regex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable String template) {
            this.template = template;
            return this;
        }
        public ServiceEventRuleActionsExtraction build() {
            final var o = new ServiceEventRuleActionsExtraction();
            o.regex = regex;
            o.source = source;
            o.target = target;
            o.template = template;
            return o;
        }
    }
}