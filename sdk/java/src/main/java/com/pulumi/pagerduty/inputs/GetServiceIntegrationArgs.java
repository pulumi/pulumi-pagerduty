// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIntegrationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceIntegrationArgs Empty = new GetServiceIntegrationArgs();

    /**
     * The integration summary used to find the desired integration on the service.
     * 
     */
    @Import(name="integrationSummary", required=true)
    private Output<String> integrationSummary;

    /**
     * @return The integration summary used to find the desired integration on the service.
     * 
     */
    public Output<String> integrationSummary() {
        return this.integrationSummary;
    }

    /**
     * The service name to use to find a service in the PagerDuty API.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The service name to use to find a service in the PagerDuty API.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetServiceIntegrationArgs() {}

    private GetServiceIntegrationArgs(GetServiceIntegrationArgs $) {
        this.integrationSummary = $.integrationSummary;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceIntegrationArgs $;

        public Builder() {
            $ = new GetServiceIntegrationArgs();
        }

        public Builder(GetServiceIntegrationArgs defaults) {
            $ = new GetServiceIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationSummary The integration summary used to find the desired integration on the service.
         * 
         * @return builder
         * 
         */
        public Builder integrationSummary(Output<String> integrationSummary) {
            $.integrationSummary = integrationSummary;
            return this;
        }

        /**
         * @param integrationSummary The integration summary used to find the desired integration on the service.
         * 
         * @return builder
         * 
         */
        public Builder integrationSummary(String integrationSummary) {
            return integrationSummary(Output.of(integrationSummary));
        }

        /**
         * @param serviceName The service name to use to find a service in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name to use to find a service in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetServiceIntegrationArgs build() {
            $.integrationSummary = Objects.requireNonNull($.integrationSummary, "expected parameter 'integrationSummary' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
