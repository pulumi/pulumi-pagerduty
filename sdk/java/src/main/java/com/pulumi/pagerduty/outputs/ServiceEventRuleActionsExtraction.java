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
    private final @Nullable String regex;
    /**
     * @return Field where the data is being copied from. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     * 
     */
    private final @Nullable String source;
    /**
     * @return Field where the data is being copied to. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     * 
     */
    private final @Nullable String target;
    /**
     * @return A customized field message. This can also include variables extracted from the payload by using string interpolation.
     * 
     */
    private final @Nullable String template;

    @CustomType.Constructor
    private ServiceEventRuleActionsExtraction(
        @CustomType.Parameter("regex") @Nullable String regex,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("target") @Nullable String target,
        @CustomType.Parameter("template") @Nullable String template) {
        this.regex = regex;
        this.source = source;
        this.target = target;
        this.template = template;
    }

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

    public static final class Builder {
        private @Nullable String regex;
        private @Nullable String source;
        private @Nullable String target;
        private @Nullable String template;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEventRuleActionsExtraction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.template = defaults.template;
        }

        public Builder regex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public Builder template(@Nullable String template) {
            this.template = template;
            return this;
        }        public ServiceEventRuleActionsExtraction build() {
            return new ServiceEventRuleActionsExtraction(regex, source, target, template);
        }
    }
}
