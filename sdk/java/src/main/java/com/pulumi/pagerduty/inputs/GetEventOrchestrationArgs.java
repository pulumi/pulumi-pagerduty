// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.GetEventOrchestrationIntegrationDetailArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventOrchestrationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationArgs Empty = new GetEventOrchestrationArgs();

    /**
     * An integration for the Event Orchestration.
     * 
     */
    @Import(name="integrationDetail")
    private @Nullable Output<List<GetEventOrchestrationIntegrationDetailArgs>> integrationDetail;

    /**
     * @return An integration for the Event Orchestration.
     * 
     */
    public Optional<Output<List<GetEventOrchestrationIntegrationDetailArgs>>> integrationDetail() {
        return Optional.ofNullable(this.integrationDetail);
    }

    /**
     * The name of the Global Event orchestration to find in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Global Event orchestration to find in the PagerDuty API.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetEventOrchestrationArgs() {}

    private GetEventOrchestrationArgs(GetEventOrchestrationArgs $) {
        this.integrationDetail = $.integrationDetail;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventOrchestrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventOrchestrationArgs $;

        public Builder() {
            $ = new GetEventOrchestrationArgs();
        }

        public Builder(GetEventOrchestrationArgs defaults) {
            $ = new GetEventOrchestrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationDetail An integration for the Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder integrationDetail(@Nullable Output<List<GetEventOrchestrationIntegrationDetailArgs>> integrationDetail) {
            $.integrationDetail = integrationDetail;
            return this;
        }

        /**
         * @param integrationDetail An integration for the Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder integrationDetail(List<GetEventOrchestrationIntegrationDetailArgs> integrationDetail) {
            return integrationDetail(Output.of(integrationDetail));
        }

        /**
         * @param integrationDetail An integration for the Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder integrationDetail(GetEventOrchestrationIntegrationDetailArgs... integrationDetail) {
            return integrationDetail(List.of(integrationDetail));
        }

        /**
         * @param name The name of the Global Event orchestration to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Global Event orchestration to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetEventOrchestrationArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetEventOrchestrationArgs", "name");
            }
            return $;
        }
    }

}