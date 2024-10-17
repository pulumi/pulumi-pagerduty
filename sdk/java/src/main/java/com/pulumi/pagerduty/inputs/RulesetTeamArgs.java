// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RulesetTeamArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetTeamArgs Empty = new RulesetTeamArgs();

    /**
     * The ID of the ruleset.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the ruleset.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private RulesetTeamArgs() {}

    private RulesetTeamArgs(RulesetTeamArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetTeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetTeamArgs $;

        public Builder() {
            $ = new RulesetTeamArgs();
        }

        public Builder(RulesetTeamArgs defaults) {
            $ = new RulesetTeamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public RulesetTeamArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("RulesetTeamArgs", "id");
            }
            return $;
        }
    }

}