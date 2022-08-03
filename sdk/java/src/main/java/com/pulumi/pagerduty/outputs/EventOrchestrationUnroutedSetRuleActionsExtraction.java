// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventOrchestrationUnroutedSetRuleActionsExtraction {
    /**
     * @return A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against field specified via the `source` argument. If the regex contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used. This field can be ignored for `template` based extractions.
     * 
     */
    private final @Nullable String regex;
    /**
     * @return The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths) like `event.summary` and you can reference previously-defined variables using a path like `variables.hostname`. This field can be ignored for `template` based extractions.
     * 
     */
    private final @Nullable String source;
    /**
     * @return The PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) field that will be set with the value from the `template` or based on `regex` and `source` fields.
     * 
     */
    private final String target;
    /**
     * @return A string that will be used to populate the `target` field. You can reference variables or event data within your template using double curly braces. For example:
     * * Use variables named `ip` and `subnet` with a template like: `{{variables.ip}}/{{variables.subnet}}`
     * * Combine the event severity &amp; summary with template like: `{{event.severity}}:{{event.summary}}`
     * 
     */
    private final @Nullable String template;

    @CustomType.Constructor
    private EventOrchestrationUnroutedSetRuleActionsExtraction(
        @CustomType.Parameter("regex") @Nullable String regex,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("template") @Nullable String template) {
        this.regex = regex;
        this.source = source;
        this.target = target;
        this.template = template;
    }

    /**
     * @return A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against field specified via the `source` argument. If the regex contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used. This field can be ignored for `template` based extractions.
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * @return The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths) like `event.summary` and you can reference previously-defined variables using a path like `variables.hostname`. This field can be ignored for `template` based extractions.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return The PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) field that will be set with the value from the `template` or based on `regex` and `source` fields.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return A string that will be used to populate the `target` field. You can reference variables or event data within your template using double curly braces. For example:
     * * Use variables named `ip` and `subnet` with a template like: `{{variables.ip}}/{{variables.subnet}}`
     * * Combine the event severity &amp; summary with template like: `{{event.severity}}:{{event.summary}}`
     * 
     */
    public Optional<String> template() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventOrchestrationUnroutedSetRuleActionsExtraction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String regex;
        private @Nullable String source;
        private String target;
        private @Nullable String template;

        public Builder() {
    	      // Empty
        }

        public Builder(EventOrchestrationUnroutedSetRuleActionsExtraction defaults) {
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
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder template(@Nullable String template) {
            this.template = template;
            return this;
        }        public EventOrchestrationUnroutedSetRuleActionsExtraction build() {
            return new EventOrchestrationUnroutedSetRuleActionsExtraction(regex, source, target, template);
        }
    }
}
