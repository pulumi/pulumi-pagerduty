// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * The email to use to find a user in the PagerDuty API.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email to use to find a user in the PagerDuty API.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    private GetUserArgs() {}

    private GetUserArgs(GetUserArgs $) {
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserArgs $;

        public Builder() {
            $ = new GetUserArgs();
        }

        public Builder(GetUserArgs defaults) {
            $ = new GetUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email to use to find a user in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email to use to find a user in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public GetUserArgs build() {
            if ($.email == null) {
                throw new MissingRequiredPropertyException("GetUserArgs", "email");
            }
            return $;
        }
    }

}
