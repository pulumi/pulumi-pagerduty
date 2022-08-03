// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponsePlayResponderTeam {
    /**
     * @return ID of the user defined as the responder
     * 
     */
    private final @Nullable String id;
    /**
     * @return A string that determines the schema of the object. If not set, the default value is &#34;response_play&#34;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ResponsePlayResponderTeam(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * @return ID of the user defined as the responder
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A string that determines the schema of the object. If not set, the default value is &#34;response_play&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlayResponderTeam defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlayResponderTeam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ResponsePlayResponderTeam build() {
            return new ResponsePlayResponderTeam(id, type);
        }
    }
}
