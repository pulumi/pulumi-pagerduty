// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.GetEventOrchestrationIntegration;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventOrchestrationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventOrchestrationPlainArgs Empty = new GetEventOrchestrationPlainArgs();

    /**
     * An integration for the Event Orchestration.
     * 
     */
    @Import(name="integrations")
    private @Nullable List<GetEventOrchestrationIntegration> integrations;

    /**
     * @return An integration for the Event Orchestration.
     * 
     */
    public Optional<List<GetEventOrchestrationIntegration>> integrations() {
        return Optional.ofNullable(this.integrations);
    }

    /**
     * The name of the Global Event orchestration to find in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Global Event orchestration to find in the PagerDuty API.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetEventOrchestrationPlainArgs() {}

    private GetEventOrchestrationPlainArgs(GetEventOrchestrationPlainArgs $) {
        this.integrations = $.integrations;
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
         * @param integrations An integration for the Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder integrations(@Nullable List<GetEventOrchestrationIntegration> integrations) {
            $.integrations = integrations;
            return this;
        }

        /**
         * @param integrations An integration for the Event Orchestration.
         * 
         * @return builder
         * 
         */
        public Builder integrations(GetEventOrchestrationIntegration... integrations) {
            return integrations(List.of(integrations));
        }

        /**
         * @param name The name of the Global Event orchestration to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetEventOrchestrationPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}