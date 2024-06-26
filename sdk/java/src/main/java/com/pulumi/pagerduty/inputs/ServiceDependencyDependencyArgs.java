// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.ServiceDependencyDependencyDependentServiceArgs;
import com.pulumi.pagerduty.inputs.ServiceDependencyDependencySupportingServiceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceDependencyDependencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceDependencyDependencyArgs Empty = new ServiceDependencyDependencyArgs();

    /**
     * The service that dependents on the supporting service. Dependency dependent service documented below.
     * 
     */
    @Import(name="dependentServices")
    private @Nullable Output<List<ServiceDependencyDependencyDependentServiceArgs>> dependentServices;

    /**
     * @return The service that dependents on the supporting service. Dependency dependent service documented below.
     * 
     */
    public Optional<Output<List<ServiceDependencyDependencyDependentServiceArgs>>> dependentServices() {
        return Optional.ofNullable(this.dependentServices);
    }

    /**
     * The service that supports the dependent service. Dependency supporting service documented below.
     * 
     */
    @Import(name="supportingServices")
    private @Nullable Output<List<ServiceDependencyDependencySupportingServiceArgs>> supportingServices;

    /**
     * @return The service that supports the dependent service. Dependency supporting service documented below.
     * 
     */
    public Optional<Output<List<ServiceDependencyDependencySupportingServiceArgs>>> supportingServices() {
        return Optional.ofNullable(this.supportingServices);
    }

    /**
     * Can be `business_service`,  `service`, `business_service_reference` or `technical_service_reference`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Can be `business_service`,  `service`, `business_service_reference` or `technical_service_reference`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceDependencyDependencyArgs() {}

    private ServiceDependencyDependencyArgs(ServiceDependencyDependencyArgs $) {
        this.dependentServices = $.dependentServices;
        this.supportingServices = $.supportingServices;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceDependencyDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceDependencyDependencyArgs $;

        public Builder() {
            $ = new ServiceDependencyDependencyArgs();
        }

        public Builder(ServiceDependencyDependencyArgs defaults) {
            $ = new ServiceDependencyDependencyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dependentServices The service that dependents on the supporting service. Dependency dependent service documented below.
         * 
         * @return builder
         * 
         */
        public Builder dependentServices(@Nullable Output<List<ServiceDependencyDependencyDependentServiceArgs>> dependentServices) {
            $.dependentServices = dependentServices;
            return this;
        }

        /**
         * @param dependentServices The service that dependents on the supporting service. Dependency dependent service documented below.
         * 
         * @return builder
         * 
         */
        public Builder dependentServices(List<ServiceDependencyDependencyDependentServiceArgs> dependentServices) {
            return dependentServices(Output.of(dependentServices));
        }

        /**
         * @param dependentServices The service that dependents on the supporting service. Dependency dependent service documented below.
         * 
         * @return builder
         * 
         */
        public Builder dependentServices(ServiceDependencyDependencyDependentServiceArgs... dependentServices) {
            return dependentServices(List.of(dependentServices));
        }

        /**
         * @param supportingServices The service that supports the dependent service. Dependency supporting service documented below.
         * 
         * @return builder
         * 
         */
        public Builder supportingServices(@Nullable Output<List<ServiceDependencyDependencySupportingServiceArgs>> supportingServices) {
            $.supportingServices = supportingServices;
            return this;
        }

        /**
         * @param supportingServices The service that supports the dependent service. Dependency supporting service documented below.
         * 
         * @return builder
         * 
         */
        public Builder supportingServices(List<ServiceDependencyDependencySupportingServiceArgs> supportingServices) {
            return supportingServices(Output.of(supportingServices));
        }

        /**
         * @param supportingServices The service that supports the dependent service. Dependency supporting service documented below.
         * 
         * @return builder
         * 
         */
        public Builder supportingServices(ServiceDependencyDependencySupportingServiceArgs... supportingServices) {
            return supportingServices(List.of(supportingServices));
        }

        /**
         * @param type Can be `business_service`,  `service`, `business_service_reference` or `technical_service_reference`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Can be `business_service`,  `service`, `business_service_reference` or `technical_service_reference`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceDependencyDependencyArgs build() {
            return $;
        }
    }

}
