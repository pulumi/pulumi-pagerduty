// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStandardsResourceScoresStandard {
    /**
     * @return Indicates whether the standard is currently active and applicable to the resource.
     * 
     */
    private Boolean active;
    /**
     * @return Provides a textual description of the standard.
     * 
     */
    private String description;
    /**
     * @return Identifier of said resource.
     * 
     */
    private String id;
    /**
     * @return The human-readable name of the standard.
     * 
     */
    private String name;
    /**
     * @return Indicates whether the resource complies to this standard.
     * 
     */
    private Boolean pass;
    /**
     * @return The type of the standard.
     * 
     */
    private String type;

    private GetStandardsResourceScoresStandard() {}
    /**
     * @return Indicates whether the standard is currently active and applicable to the resource.
     * 
     */
    public Boolean active() {
        return this.active;
    }
    /**
     * @return Provides a textual description of the standard.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Identifier of said resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The human-readable name of the standard.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates whether the resource complies to this standard.
     * 
     */
    public Boolean pass() {
        return this.pass;
    }
    /**
     * @return The type of the standard.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStandardsResourceScoresStandard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private String description;
        private String id;
        private String name;
        private Boolean pass;
        private String type;
        public Builder() {}
        public Builder(GetStandardsResourceScoresStandard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.pass = defaults.pass;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            if (active == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourceScoresStandard", "active");
            }
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourceScoresStandard", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourceScoresStandard", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourceScoresStandard", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pass(Boolean pass) {
            if (pass == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourceScoresStandard", "pass");
            }
            this.pass = pass;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourceScoresStandard", "type");
            }
            this.type = type;
            return this;
        }
        public GetStandardsResourceScoresStandard build() {
            final var _resultValue = new GetStandardsResourceScoresStandard();
            _resultValue.active = active;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.pass = pass;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
