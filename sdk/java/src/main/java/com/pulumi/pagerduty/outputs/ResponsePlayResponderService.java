// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponsePlayResponderService {
    /**
     * @return The ID of the response play.
     * 
     */
    private @Nullable String id;
    /**
     * @return A string that determines the schema of the object. If not set, the default value is &#34;response_play&#34;.
     * 
     */
    private @Nullable String type;

    private ResponsePlayResponderService() {}
    /**
     * @return The ID of the response play.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A string that determines the schema of the object. If not set, the default value is &#34;response_play&#34;.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlayResponderService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String type;
        public Builder() {}
        public Builder(ResponsePlayResponderService defaults) {
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
        public ResponsePlayResponderService build() {
            final var _resultValue = new ResponsePlayResponderService();
            _resultValue.id = id;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
