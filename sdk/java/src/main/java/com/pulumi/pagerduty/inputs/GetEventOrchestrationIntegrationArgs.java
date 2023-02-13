// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.GetEventOrchestrationIntegrationParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetEventOrchestrationIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetEventOrchestrationIntegrationArgs Empty = new GetEventOrchestrationIntegrationArgs();

    /**
     * ID of the integration
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of the integration
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="parameters", required=true)
    private Output<List<GetEventOrchestrationIntegrationParameterArgs>> parameters;

    public Output<List<GetEventOrchestrationIntegrationParameterArgs>> parameters() {
        return this.parameters;
    }

    private GetEventOrchestrationIntegrationArgs() {}

    private GetEventOrchestrationIntegrationArgs(GetEventOrchestrationIntegrationArgs $) {
        this.id = $.id;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationIntegrationArgs $;

        public Builder() {
            $ = new GetEventOrchestrationIntegrationArgs();
        }

        public Builder(GetEventOrchestrationIntegrationArgs defaults) {
            $ = new GetEventOrchestrationIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the integration
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the integration
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder parameters(Output<List<GetEventOrchestrationIntegrationParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<GetEventOrchestrationIntegrationParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(GetEventOrchestrationIntegrationParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public GetEventOrchestrationIntegrationArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
