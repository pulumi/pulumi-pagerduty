// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetIncidentWorkflowPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIncidentWorkflowPlainArgs Empty = new GetIncidentWorkflowPlainArgs();

    /**
     * The name of the workflow.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the workflow.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetIncidentWorkflowPlainArgs() {}

    private GetIncidentWorkflowPlainArgs(GetIncidentWorkflowPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIncidentWorkflowPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIncidentWorkflowPlainArgs $;

        public Builder() {
            $ = new GetIncidentWorkflowPlainArgs();
        }

        public Builder(GetIncidentWorkflowPlainArgs defaults) {
            $ = new GetIncidentWorkflowPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetIncidentWorkflowPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetIncidentWorkflowPlainArgs", "name");
            }
            return $;
        }
    }

}
