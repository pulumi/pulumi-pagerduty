// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIntegrationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceIntegrationPlainArgs Empty = new GetServiceIntegrationPlainArgs();

    /**
     * The integration summary used to find the desired integration on the service.
     * 
     */
    @Import(name="integrationSummary", required=true)
    private String integrationSummary;

    /**
     * @return The integration summary used to find the desired integration on the service.
     * 
     */
    public String integrationSummary() {
        return this.integrationSummary;
    }

    /**
     * The service name to use to find a service in the PagerDuty API.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The service name to use to find a service in the PagerDuty API.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetServiceIntegrationPlainArgs() {}

    private GetServiceIntegrationPlainArgs(GetServiceIntegrationPlainArgs $) {
        this.integrationSummary = $.integrationSummary;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceIntegrationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceIntegrationPlainArgs $;

        public Builder() {
            $ = new GetServiceIntegrationPlainArgs();
        }

        public Builder(GetServiceIntegrationPlainArgs defaults) {
            $ = new GetServiceIntegrationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationSummary The integration summary used to find the desired integration on the service.
         * 
         * @return builder
         * 
         */
        public Builder integrationSummary(String integrationSummary) {
            $.integrationSummary = integrationSummary;
            return this;
        }

        /**
         * @param serviceName The service name to use to find a service in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetServiceIntegrationPlainArgs build() {
            if ($.integrationSummary == null) {
                throw new MissingRequiredPropertyException("GetServiceIntegrationPlainArgs", "integrationSummary");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetServiceIntegrationPlainArgs", "serviceName");
            }
            return $;
        }
    }

}
