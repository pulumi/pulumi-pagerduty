// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEventOrchestrationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationsPlainArgs Empty = new GetEventOrchestrationsPlainArgs();

    /**
     * The regex name of Global Event Orchestrations to find in the PagerDuty API.
     * 
     */
    @Import(name="nameFilter", required=true)
    private String nameFilter;

    /**
     * @return The regex name of Global Event Orchestrations to find in the PagerDuty API.
     * 
     */
    public String nameFilter() {
        return this.nameFilter;
    }

    private GetEventOrchestrationsPlainArgs() {}

    private GetEventOrchestrationsPlainArgs(GetEventOrchestrationsPlainArgs $) {
        this.nameFilter = $.nameFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationsPlainArgs $;

        public Builder() {
            $ = new GetEventOrchestrationsPlainArgs();
        }

        public Builder(GetEventOrchestrationsPlainArgs defaults) {
            $ = new GetEventOrchestrationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nameFilter The regex name of Global Event Orchestrations to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder nameFilter(String nameFilter) {
            $.nameFilter = nameFilter;
            return this;
        }

        public GetEventOrchestrationsPlainArgs build() {
            if ($.nameFilter == null) {
                throw new MissingRequiredPropertyException("GetEventOrchestrationsPlainArgs", "nameFilter");
            }
            return $;
        }
    }

}
