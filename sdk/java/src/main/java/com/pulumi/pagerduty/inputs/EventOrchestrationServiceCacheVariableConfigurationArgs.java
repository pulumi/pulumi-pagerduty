// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventOrchestrationServiceCacheVariableConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventOrchestrationServiceCacheVariableConfigurationArgs Empty = new EventOrchestrationServiceCacheVariableConfigurationArgs();

    /**
     * A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against the field specified via the `source` argument. This field is only used when `type` is `recent_value`
     * 
     */
    @Import(name="regex")
    private @Nullable Output<String> regex;

    /**
     * @return A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against the field specified via the `source` argument. This field is only used when `type` is `recent_value`
     * 
     */
    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths). This field is only used when `type` is `recent_value`
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths). This field is only used when `type` is `recent_value`
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The number of seconds indicating how long to count incoming trigger events for. This field is only used when `type` is `trigger_event_count`
     * 
     */
    @Import(name="ttlSeconds")
    private @Nullable Output<Integer> ttlSeconds;

    /**
     * @return The number of seconds indicating how long to count incoming trigger events for. This field is only used when `type` is `trigger_event_count`
     * 
     */
    public Optional<Output<Integer>> ttlSeconds() {
        return Optional.ofNullable(this.ttlSeconds);
    }

    /**
     * The [type of value](https://support.pagerduty.com/docs/event-orchestration-variables) to store into the Cache Variable. Can be one of: `recent_value` or `trigger_event_count`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The [type of value](https://support.pagerduty.com/docs/event-orchestration-variables) to store into the Cache Variable. Can be one of: `recent_value` or `trigger_event_count`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private EventOrchestrationServiceCacheVariableConfigurationArgs() {}

    private EventOrchestrationServiceCacheVariableConfigurationArgs(EventOrchestrationServiceCacheVariableConfigurationArgs $) {
        this.regex = $.regex;
        this.source = $.source;
        this.ttlSeconds = $.ttlSeconds;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventOrchestrationServiceCacheVariableConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventOrchestrationServiceCacheVariableConfigurationArgs $;

        public Builder() {
            $ = new EventOrchestrationServiceCacheVariableConfigurationArgs();
        }

        public Builder(EventOrchestrationServiceCacheVariableConfigurationArgs defaults) {
            $ = new EventOrchestrationServiceCacheVariableConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regex A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against the field specified via the `source` argument. This field is only used when `type` is `recent_value`
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against the field specified via the `source` argument. This field is only used when `type` is `recent_value`
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        /**
         * @param source The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths). This field is only used when `type` is `recent_value`
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths). This field is only used when `type` is `recent_value`
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param ttlSeconds The number of seconds indicating how long to count incoming trigger events for. This field is only used when `type` is `trigger_event_count`
         * 
         * @return builder
         * 
         */
        public Builder ttlSeconds(@Nullable Output<Integer> ttlSeconds) {
            $.ttlSeconds = ttlSeconds;
            return this;
        }

        /**
         * @param ttlSeconds The number of seconds indicating how long to count incoming trigger events for. This field is only used when `type` is `trigger_event_count`
         * 
         * @return builder
         * 
         */
        public Builder ttlSeconds(Integer ttlSeconds) {
            return ttlSeconds(Output.of(ttlSeconds));
        }

        /**
         * @param type The [type of value](https://support.pagerduty.com/docs/event-orchestration-variables) to store into the Cache Variable. Can be one of: `recent_value` or `trigger_event_count`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The [type of value](https://support.pagerduty.com/docs/event-orchestration-variables) to store into the Cache Variable. Can be one of: `recent_value` or `trigger_event_count`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public EventOrchestrationServiceCacheVariableConfigurationArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("EventOrchestrationServiceCacheVariableConfigurationArgs", "type");
            }
            return $;
        }
    }

}
