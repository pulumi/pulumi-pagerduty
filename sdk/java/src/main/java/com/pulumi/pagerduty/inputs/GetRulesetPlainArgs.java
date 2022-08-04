// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRulesetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesetPlainArgs Empty = new GetRulesetPlainArgs();

    /**
     * The name of the ruleset to find in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the ruleset to find in the PagerDuty API.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetRulesetPlainArgs() {}

    private GetRulesetPlainArgs(GetRulesetPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesetPlainArgs $;

        public Builder() {
            $ = new GetRulesetPlainArgs();
        }

        public Builder(GetRulesetPlainArgs defaults) {
            $ = new GetRulesetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the ruleset to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetRulesetPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
