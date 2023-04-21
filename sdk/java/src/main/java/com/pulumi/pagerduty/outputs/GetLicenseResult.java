// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLicenseResult {
    /**
     * @return Available allocations to assign to users
     * 
     */
    private Integer allocationsAvailable;
    /**
     * @return The number of allocations already assigned to users
     * 
     */
    private Integer currentValue;
    private String description;
    private String htmlUrl;
    private String id;
    private String name;
    /**
     * @return The role group for the license that determines the available `valid_roles`
     * 
     */
    private String roleGroup;
    private String self;
    /**
     * @return Summary of the license
     * 
     */
    private String summary;
    private String type;
    /**
     * @return List of allowed roles that may be assigned to a user with this license
     * 
     */
    private List<String> validRoles;

    private GetLicenseResult() {}
    /**
     * @return Available allocations to assign to users
     * 
     */
    public Integer allocationsAvailable() {
        return this.allocationsAvailable;
    }
    /**
     * @return The number of allocations already assigned to users
     * 
     */
    public Integer currentValue() {
        return this.currentValue;
    }
    public String description() {
        return this.description;
    }
    public String htmlUrl() {
        return this.htmlUrl;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The role group for the license that determines the available `valid_roles`
     * 
     */
    public String roleGroup() {
        return this.roleGroup;
    }
    public String self() {
        return this.self;
    }
    /**
     * @return Summary of the license
     * 
     */
    public String summary() {
        return this.summary;
    }
    public String type() {
        return this.type;
    }
    /**
     * @return List of allowed roles that may be assigned to a user with this license
     * 
     */
    public List<String> validRoles() {
        return this.validRoles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicenseResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer allocationsAvailable;
        private Integer currentValue;
        private String description;
        private String htmlUrl;
        private String id;
        private String name;
        private String roleGroup;
        private String self;
        private String summary;
        private String type;
        private List<String> validRoles;
        public Builder() {}
        public Builder(GetLicenseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationsAvailable = defaults.allocationsAvailable;
    	      this.currentValue = defaults.currentValue;
    	      this.description = defaults.description;
    	      this.htmlUrl = defaults.htmlUrl;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.roleGroup = defaults.roleGroup;
    	      this.self = defaults.self;
    	      this.summary = defaults.summary;
    	      this.type = defaults.type;
    	      this.validRoles = defaults.validRoles;
        }

        @CustomType.Setter
        public Builder allocationsAvailable(Integer allocationsAvailable) {
            this.allocationsAvailable = Objects.requireNonNull(allocationsAvailable);
            return this;
        }
        @CustomType.Setter
        public Builder currentValue(Integer currentValue) {
            this.currentValue = Objects.requireNonNull(currentValue);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = Objects.requireNonNull(htmlUrl);
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
        @CustomType.Setter
        public Builder roleGroup(String roleGroup) {
            this.roleGroup = Objects.requireNonNull(roleGroup);
            return this;
        }
        @CustomType.Setter
        public Builder self(String self) {
            this.self = Objects.requireNonNull(self);
            return this;
        }
        @CustomType.Setter
        public Builder summary(String summary) {
            this.summary = Objects.requireNonNull(summary);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder validRoles(List<String> validRoles) {
            this.validRoles = Objects.requireNonNull(validRoles);
            return this;
        }
        public Builder validRoles(String... validRoles) {
            return validRoles(List.of(validRoles));
        }
        public GetLicenseResult build() {
            final var o = new GetLicenseResult();
            o.allocationsAvailable = allocationsAvailable;
            o.currentValue = currentValue;
            o.description = description;
            o.htmlUrl = htmlUrl;
            o.id = id;
            o.name = name;
            o.roleGroup = roleGroup;
            o.self = self;
            o.summary = summary;
            o.type = type;
            o.validRoles = validRoles;
            return o;
        }
    }
}