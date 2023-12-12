// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUsersUser {
    /**
     * @return The email to use to find a user in the PagerDuty API.
     * 
     */
    private String email;
    /**
     * @return The ID of the found user.
     * 
     */
    private String id;
    /**
     * @return The short name of the found user.
     * 
     */
    private String name;

    private GetUsersUser() {}
    /**
     * @return The email to use to find a user in the PagerDuty API.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The ID of the found user.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The short name of the found user.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetUsersUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetUsersUser build() {
            final var _resultValue = new GetUsersUser();
            _resultValue.email = email;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
