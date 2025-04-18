// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.GetEventOrchestrationIntegrationDetail;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventOrchestrationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationPlainArgs Empty = new GetEventOrchestrationPlainArgs();

    /**
     * A list of integrations for the Event Orchestration.
     * 
     */
    @Import(name="integrationDetail")
    private @Nullable List<GetEventOrchestrationIntegrationDetail> integrationDetail;

    /**
     * @return A list of integrations for the Event Orchestration.
     * 
     */
    public Optional<List<GetEventOrchestrationIntegrationDetail>> integrationDetail() {
        return Optional.ofNullable(this.integrationDetail);
    }

    /**
     * The name of the Global Event Orchestration to find in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Global Event Orchestration to find in the PagerDuty API.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetEventOrchestrationPlainArgs() {}

    private GetEventOrchestrationPlainArgs(GetEventOrchestrationPlainArgs $) {
        this.integrationDetail = $.integrationDetail;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationPlainArgs $;

        public Builder() {
            $ = new GetEventOrchestrationPlainArgs();
        }

        public Builder(GetEventOrchestrationPlainArgs defaults) {
            $ = new GetEventOrchestrationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationDetail A list of integrations for the Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder integrationDetail(@Nullable List<GetEventOrchestrationIntegrationDetail> integrationDetail) {
            $.integrationDetail = integrationDetail;
            return this;
        }

        /**
         * @param integrationDetail A list of integrations for the Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder integrationDetail(GetEventOrchestrationIntegrationDetail... integrationDetail) {
            return integrationDetail(List.of(integrationDetail));
        }

        /**
         * @param name The name of the Global Event Orchestration to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetEventOrchestrationPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetEventOrchestrationPlainArgs", "name");
            }
            return $;
        }
    }

}
