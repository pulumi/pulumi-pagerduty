// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationGlobalCatchAllActionsExtractionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationGlobalCatchAllActionsExtractionArgs Empty = new EventOrchestrationGlobalCatchAllActionsExtractionArgs();

    /**
     * A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against field specified via the `source` argument. If the regex contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used. This field can be ignored for `template` based extractions.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<String> regex;

    /**
     * @return A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against field specified via the `source` argument. If the regex contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used. This field can be ignored for `template` based extractions.
     * 
     */
    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths) like `event.summary` and you can reference previously-defined variables using a path like `variables.hostname`. This field can be ignored for `template` based extractions.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths) like `event.summary` and you can reference previously-defined variables using a path like `variables.hostname`. This field can be ignored for `template` based extractions.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) field that will be set with the value from the `template` or based on `regex` and `source` fields.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return The PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) field that will be set with the value from the `template` or based on `regex` and `source` fields.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     * A string that will be used to populate the `target` field. You can reference variables or event data within your template using double curly braces. For example:
     * * Use variables named `ip` and `subnet` with a template like: `{{variables.ip}}/{{variables.subnet}}`
     * * Combine the event severity &amp; summary with template like: `{{event.severity}}:{{event.summary}}`
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return A string that will be used to populate the `target` field. You can reference variables or event data within your template using double curly braces. For example:
     * * Use variables named `ip` and `subnet` with a template like: `{{variables.ip}}/{{variables.subnet}}`
     * * Combine the event severity &amp; summary with template like: `{{event.severity}}:{{event.summary}}`
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    private EventOrchestrationGlobalCatchAllActionsExtractionArgs() {}

    private EventOrchestrationGlobalCatchAllActionsExtractionArgs(EventOrchestrationGlobalCatchAllActionsExtractionArgs $) {
        this.regex = $.regex;
        this.source = $.source;
        this.target = $.target;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationGlobalCatchAllActionsExtractionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationGlobalCatchAllActionsExtractionArgs $;

        public Builder() {
            $ = new EventOrchestrationGlobalCatchAllActionsExtractionArgs();
        }

        public Builder(EventOrchestrationGlobalCatchAllActionsExtractionArgs defaults) {
            $ = new EventOrchestrationGlobalCatchAllActionsExtractionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regex A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against field specified via the `source` argument. If the regex contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used. This field can be ignored for `template` based extractions.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against field specified via the `source` argument. If the regex contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used. This field can be ignored for `template` based extractions.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        /**
         * @param source The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths) like `event.summary` and you can reference previously-defined variables using a path like `variables.hostname`. This field can be ignored for `template` based extractions.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths) like `event.summary` and you can reference previously-defined variables using a path like `variables.hostname`. This field can be ignored for `template` based extractions.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param target The PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) field that will be set with the value from the `template` or based on `regex` and `source` fields.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) field that will be set with the value from the `template` or based on `regex` and `source` fields.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param template A string that will be used to populate the `target` field. You can reference variables or event data within your template using double curly braces. For example:
         * * Use variables named `ip` and `subnet` with a template like: `{{variables.ip}}/{{variables.subnet}}`
         * * Combine the event severity &amp; summary with template like: `{{event.severity}}:{{event.summary}}`
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template A string that will be used to populate the `target` field. You can reference variables or event data within your template using double curly braces. For example:
         * * Use variables named `ip` and `subnet` with a template like: `{{variables.ip}}/{{variables.subnet}}`
         * * Combine the event severity &amp; summary with template like: `{{event.severity}}:{{event.summary}}`
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        public EventOrchestrationGlobalCatchAllActionsExtractionArgs build() {
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
