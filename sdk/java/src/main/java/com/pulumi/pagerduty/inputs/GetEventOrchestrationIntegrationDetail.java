// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.GetEventOrchestrationIntegrationDetailParameter;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetEventOrchestrationIntegrationDetail extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationIntegrationDetail Empty = new GetEventOrchestrationIntegrationDetail();

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

    @Import(name="label", required=true)
    private String label;

    public String label() {
        return this.label;
    }

    @Import(name="parameters", required=true)
    private List<GetEventOrchestrationIntegrationDetailParameter> parameters;

    public List<GetEventOrchestrationIntegrationDetailParameter> parameters() {
        return this.parameters;
    }

    private GetEventOrchestrationIntegrationDetail() {}

    private GetEventOrchestrationIntegrationDetail(GetEventOrchestrationIntegrationDetail $) {
        this.id = $.id;
        this.label = $.label;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationIntegrationDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationIntegrationDetail $;

        public Builder() {
            $ = new GetEventOrchestrationIntegrationDetail();
        }

        public Builder(GetEventOrchestrationIntegrationDetail defaults) {
            $ = new GetEventOrchestrationIntegrationDetail(Objects.requireNonNull(defaults));
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

        public Builder label(String label) {
            $.label = label;
            return this;
        }

        public Builder parameters(List<GetEventOrchestrationIntegrationDetailParameter> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(GetEventOrchestrationIntegrationDetailParameter... parameters) {
            return parameters(List.of(parameters));
        }

        public GetEventOrchestrationIntegrationDetail build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}