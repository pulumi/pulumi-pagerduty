// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEventOrchestrationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationsArgs Empty = new GetEventOrchestrationsArgs();

    /**
     * The regex name of Global Event orchestrations to find in the PagerDuty API.
     * 
     */
    @Import(name="nameFilter", required=true)
    private Output<String> nameFilter;

    /**
     * @return The regex name of Global Event orchestrations to find in the PagerDuty API.
     * 
     */
    public Output<String> nameFilter() {
        return this.nameFilter;
    }

    private GetEventOrchestrationsArgs() {}

    private GetEventOrchestrationsArgs(GetEventOrchestrationsArgs $) {
        this.nameFilter = $.nameFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationsArgs $;

        public Builder() {
            $ = new GetEventOrchestrationsArgs();
        }

        public Builder(GetEventOrchestrationsArgs defaults) {
            $ = new GetEventOrchestrationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nameFilter The regex name of Global Event orchestrations to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder nameFilter(Output<String> nameFilter) {
            $.nameFilter = nameFilter;
            return this;
        }

        /**
         * @param nameFilter The regex name of Global Event orchestrations to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder nameFilter(String nameFilter) {
            return nameFilter(Output.of(nameFilter));
        }

        public GetEventOrchestrationsArgs build() {
            if ($.nameFilter == null) {
                throw new MissingRequiredPropertyException("GetEventOrchestrationsArgs", "nameFilter");
            }
            return $;
        }
    }

}
