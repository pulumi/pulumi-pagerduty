// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.ServiceDependencyDependencyArgs;
import java.util.Objects;


public final class ServiceDependencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceDependencyArgs Empty = new ServiceDependencyArgs();

    @Import(name="dependency", required=true)
    private Output<ServiceDependencyDependencyArgs> dependency;

    public Output<ServiceDependencyDependencyArgs> dependency() {
        return this.dependency;
    }

    private ServiceDependencyArgs() {}

    private ServiceDependencyArgs(ServiceDependencyArgs $) {
        this.dependency = $.dependency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceDependencyArgs $;

        public Builder() {
            $ = new ServiceDependencyArgs();
        }

        public Builder(ServiceDependencyArgs defaults) {
            $ = new ServiceDependencyArgs(Objects.requireNonNull(defaults));
        }

        public Builder dependency(Output<ServiceDependencyDependencyArgs> dependency) {
            $.dependency = dependency;
            return this;
        }

        public Builder dependency(ServiceDependencyDependencyArgs dependency) {
            return dependency(Output.of(dependency));
        }

        public ServiceDependencyArgs build() {
            if ($.dependency == null) {
                throw new MissingRequiredPropertyException("ServiceDependencyArgs", "dependency");
            }
            return $;
        }
    }

}
