// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponsePlayResponderEscalationRuleTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponsePlayResponderEscalationRuleTargetArgs Empty = new ResponsePlayResponderEscalationRuleTargetArgs();

    /**
     * The ID of the response play.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the response play.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ResponsePlayResponderEscalationRuleTargetArgs() {}

    private ResponsePlayResponderEscalationRuleTargetArgs(ResponsePlayResponderEscalationRuleTargetArgs $) {
        this.id = $.id;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePlayResponderEscalationRuleTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePlayResponderEscalationRuleTargetArgs $;

        public Builder() {
            $ = new ResponsePlayResponderEscalationRuleTargetArgs();
        }

        public Builder(ResponsePlayResponderEscalationRuleTargetArgs defaults) {
            $ = new ResponsePlayResponderEscalationRuleTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the response play.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the response play.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ResponsePlayResponderEscalationRuleTargetArgs build() {
            return $;
        }
    }

}
