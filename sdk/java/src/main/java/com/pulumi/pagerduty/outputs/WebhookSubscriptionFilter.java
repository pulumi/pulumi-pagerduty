// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookSubscriptionFilter {
    /**
     * @return The id of the object being used as the filter. This field is required for all filter types except account_reference.
     * 
     */
    private @Nullable String id;
    /**
     * @return The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
     * 
     */
    private String type;

    private WebhookSubscriptionFilter() {}
    /**
     * @return The id of the object being used as the filter. This field is required for all filter types except account_reference.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookSubscriptionFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private String type;
        public Builder() {}
        public Builder(WebhookSubscriptionFilter defaults) {
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public WebhookSubscriptionFilter build() {
            final var o = new WebhookSubscriptionFilter();
            o.id = id;
            o.type = type;
            return o;
        }
    }
}
