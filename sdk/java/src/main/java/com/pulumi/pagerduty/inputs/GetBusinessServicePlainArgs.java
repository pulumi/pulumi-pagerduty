// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBusinessServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBusinessServicePlainArgs Empty = new GetBusinessServicePlainArgs();

    /**
     * The business service name to use to find a business service in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The business service name to use to find a business service in the PagerDuty API.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetBusinessServicePlainArgs() {}

    private GetBusinessServicePlainArgs(GetBusinessServicePlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBusinessServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBusinessServicePlainArgs $;

        public Builder() {
            $ = new GetBusinessServicePlainArgs();
        }

        public Builder(GetBusinessServicePlainArgs defaults) {
            $ = new GetBusinessServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The business service name to use to find a business service in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetBusinessServicePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
