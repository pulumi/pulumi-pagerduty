// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponsePlaySubscriber {
    /**
     * @return ID of the user defined as the responder
     * 
     */
    private @Nullable String id;
    /**
     * @return Should be set as `escalation_policy` for escalation policy responders.
     * 
     */
    private @Nullable String type;

    private ResponsePlaySubscriber() {}
    /**
     * @return ID of the user defined as the responder
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Should be set as `escalation_policy` for escalation policy responders.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlaySubscriber defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String type;
        public Builder() {}
        public Builder(ResponsePlaySubscriber defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ResponsePlaySubscriber build() {
            final var o = new ResponsePlaySubscriber();
            o.id = id;
            o.type = type;
            return o;
        }
    }
}
