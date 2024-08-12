// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetScheduleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduleArgs Empty = new GetScheduleArgs();

    /**
     * The name to use to find a schedule in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name to use to find a schedule in the PagerDuty API.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetScheduleArgs() {}

    private GetScheduleArgs(GetScheduleArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduleArgs $;

        public Builder() {
            $ = new GetScheduleArgs();
        }

        public Builder(GetScheduleArgs defaults) {
            $ = new GetScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name to use to find a schedule in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to use to find a schedule in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetScheduleArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetScheduleArgs", "name");
            }
            return $;
        }
    }

}