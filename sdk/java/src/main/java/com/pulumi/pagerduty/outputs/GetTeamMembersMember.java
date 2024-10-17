// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTeamMembersMember {
    /**
     * @return The ID of the found user.
     * 
     */
    private String id;
    /**
     * @return The team role of the found user.
     * 
     */
    private String role;
    /**
     * @return A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to name, though it is not intended to be an identifier.
     * 
     */
    private String summary;
    /**
     * @return The type of object. The value returned will be `user_reference`. Can be used for passing to another object as dependency.
     * 
     */
    private String type;

    private GetTeamMembersMember() {}
    /**
     * @return The ID of the found user.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The team role of the found user.
     * 
     */
    public String role() {
        return this.role;
    }
    /**
     * @return A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to name, though it is not intended to be an identifier.
     * 
     */
    public String summary() {
        return this.summary;
    }
    /**
     * @return The type of object. The value returned will be `user_reference`. Can be used for passing to another object as dependency.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTeamMembersMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String role;
        private String summary;
        private String type;
        public Builder() {}
        public Builder(GetTeamMembersMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.role = defaults.role;
    	      this.summary = defaults.summary;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTeamMembersMember", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            if (role == null) {
              throw new MissingRequiredPropertyException("GetTeamMembersMember", "role");
            }
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder summary(String summary) {
            if (summary == null) {
              throw new MissingRequiredPropertyException("GetTeamMembersMember", "summary");
            }
            this.summary = summary;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetTeamMembersMember", "type");
            }
            this.type = type;
            return this;
        }
        public GetTeamMembersMember build() {
            final var _resultValue = new GetTeamMembersMember();
            _resultValue.id = id;
            _resultValue.role = role;
            _resultValue.summary = summary;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}