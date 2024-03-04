// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStandardsResourceScoresPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStandardsResourceScoresPlainArgs Empty = new GetStandardsResourceScoresPlainArgs();

    /**
     * Identifier of said resource.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Identifier of said resource.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Type of the object the standards are associated to. Allowed values are `technical_services`.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return Type of the object the standards are associated to. Allowed values are `technical_services`.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    private GetStandardsResourceScoresPlainArgs() {}

    private GetStandardsResourceScoresPlainArgs(GetStandardsResourceScoresPlainArgs $) {
        this.id = $.id;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStandardsResourceScoresPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStandardsResourceScoresPlainArgs $;

        public Builder() {
            $ = new GetStandardsResourceScoresPlainArgs();
        }

        public Builder(GetStandardsResourceScoresPlainArgs defaults) {
            $ = new GetStandardsResourceScoresPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Identifier of said resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param resourceType Type of the object the standards are associated to. Allowed values are `technical_services`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public GetStandardsResourceScoresPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetStandardsResourceScoresPlainArgs", "id");
            }
            if ($.resourceType == null) {
                throw new MissingRequiredPropertyException("GetStandardsResourceScoresPlainArgs", "resourceType");
            }
            return $;
        }
    }

}
