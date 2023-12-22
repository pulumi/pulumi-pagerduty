// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTeamMembersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamMembersPlainArgs Empty = new GetTeamMembersPlainArgs();

    /**
     * The ID of the team to find in the PagerDuty API.
     * 
     */
    @Import(name="teamId", required=true)
    private String teamId;

    /**
     * @return The ID of the team to find in the PagerDuty API.
     * 
     */
    public String teamId() {
        return this.teamId;
    }

    private GetTeamMembersPlainArgs() {}

    private GetTeamMembersPlainArgs(GetTeamMembersPlainArgs $) {
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamMembersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamMembersPlainArgs $;

        public Builder() {
            $ = new GetTeamMembersPlainArgs();
        }

        public Builder(GetTeamMembersPlainArgs defaults) {
            $ = new GetTeamMembersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param teamId The ID of the team to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            $.teamId = teamId;
            return this;
        }

        public GetTeamMembersPlainArgs build() {
            $.teamId = Objects.requireNonNull($.teamId, "expected parameter 'teamId' to be non-null");
            return $;
        }
    }

}
