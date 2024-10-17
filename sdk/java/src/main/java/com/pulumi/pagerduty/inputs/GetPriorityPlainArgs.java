// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPriorityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPriorityPlainArgs Empty = new GetPriorityPlainArgs();

    /**
     * The name of the priority to find in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the priority to find in the PagerDuty API.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetPriorityPlainArgs() {}

    private GetPriorityPlainArgs(GetPriorityPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPriorityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPriorityPlainArgs $;

        public Builder() {
            $ = new GetPriorityPlainArgs();
        }

        public Builder(GetPriorityPlainArgs defaults) {
            $ = new GetPriorityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the priority to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetPriorityPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPriorityPlainArgs", "name");
            }
            return $;
        }
    }

}