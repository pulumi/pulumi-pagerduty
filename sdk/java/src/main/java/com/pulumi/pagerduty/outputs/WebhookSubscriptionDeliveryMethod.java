// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.WebhookSubscriptionDeliveryMethodCustomHeader;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookSubscriptionDeliveryMethod {
    /**
     * @return The custom_header of a webhook subscription define any optional headers that will be passed along with the payload to the destination URL.
     * 
     */
    private @Nullable List<WebhookSubscriptionDeliveryMethodCustomHeader> customHeaders;
    /**
     * @return Whether this webhook subscription is temporarily disabled. Becomes true if the delivery method URL is repeatedly rejected by the server.
     * 
     */
    private @Nullable Boolean temporarilyDisabled;
    /**
     * @return Indicates the type of the delivery method. Allowed and default value: `http_delivery_method`.
     * 
     */
    private @Nullable String type;
    /**
     * @return The destination URL for webhook delivery.
     * 
     */
    private @Nullable String url;

    private WebhookSubscriptionDeliveryMethod() {}
    /**
     * @return The custom_header of a webhook subscription define any optional headers that will be passed along with the payload to the destination URL.
     * 
     */
    public List<WebhookSubscriptionDeliveryMethodCustomHeader> customHeaders() {
        return this.customHeaders == null ? List.of() : this.customHeaders;
    }
    /**
     * @return Whether this webhook subscription is temporarily disabled. Becomes true if the delivery method URL is repeatedly rejected by the server.
     * 
     */
    public Optional<Boolean> temporarilyDisabled() {
        return Optional.ofNullable(this.temporarilyDisabled);
    }
    /**
     * @return Indicates the type of the delivery method. Allowed and default value: `http_delivery_method`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The destination URL for webhook delivery.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookSubscriptionDeliveryMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<WebhookSubscriptionDeliveryMethodCustomHeader> customHeaders;
        private @Nullable Boolean temporarilyDisabled;
        private @Nullable String type;
        private @Nullable String url;
        public Builder() {}
        public Builder(WebhookSubscriptionDeliveryMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.temporarilyDisabled = defaults.temporarilyDisabled;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder customHeaders(@Nullable List<WebhookSubscriptionDeliveryMethodCustomHeader> customHeaders) {

            this.customHeaders = customHeaders;
            return this;
        }
        public Builder customHeaders(WebhookSubscriptionDeliveryMethodCustomHeader... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }
        @CustomType.Setter
        public Builder temporarilyDisabled(@Nullable Boolean temporarilyDisabled) {

            this.temporarilyDisabled = temporarilyDisabled;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public WebhookSubscriptionDeliveryMethod build() {
            final var _resultValue = new WebhookSubscriptionDeliveryMethod();
            _resultValue.customHeaders = customHeaders;
            _resultValue.temporarilyDisabled = temporarilyDisabled;
            _resultValue.type = type;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
