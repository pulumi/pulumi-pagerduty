// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.GetEventOrchestrationIntegrationParameter;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetEventOrchestrationIntegration extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationIntegration Empty = new GetEventOrchestrationIntegration();

    /**
     * ID of the integration
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return ID of the integration
     * 
     */
    public String id() {
        return this.id;
    }

    @Import(name="parameters", required=true)
    private List<GetEventOrchestrationIntegrationParameter> parameters;

    public List<GetEventOrchestrationIntegrationParameter> parameters() {
        return this.parameters;
    }

    private GetEventOrchestrationIntegration() {}

    private GetEventOrchestrationIntegration(GetEventOrchestrationIntegration $) {
        this.id = $.id;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationIntegration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationIntegration $;

        public Builder() {
            $ = new GetEventOrchestrationIntegration();
        }

        public Builder(GetEventOrchestrationIntegration defaults) {
            $ = new GetEventOrchestrationIntegration(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the integration
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder parameters(List<GetEventOrchestrationIntegrationParameter> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(GetEventOrchestrationIntegrationParameter... parameters) {
            return parameters(List.of(parameters));
        }

        public GetEventOrchestrationIntegration build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
