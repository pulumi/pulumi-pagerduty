// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVendorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVendorPlainArgs Empty = new GetVendorPlainArgs();

    /**
     * The vendor name to use to find a vendor in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The vendor name to use to find a vendor in the PagerDuty API.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetVendorPlainArgs() {}

    private GetVendorPlainArgs(GetVendorPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVendorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVendorPlainArgs $;

        public Builder() {
            $ = new GetVendorPlainArgs();
        }

        public Builder(GetVendorPlainArgs defaults) {
            $ = new GetVendorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The vendor name to use to find a vendor in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetVendorPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
