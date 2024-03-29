// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamMembershipState extends com.pulumi.resources.ResourceArgs {

    public static final TeamMembershipState Empty = new TeamMembershipState();

    /**
     * The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
     * These roles match up to user roles in the following ways:
     * * User role of `user` is a Team role of `manager`
     * * User role of `limited_user` is a Team role of `responder`
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
     * These roles match up to user roles in the following ways:
     * * User role of `user` is a Team role of `manager`
     * * User role of `limited_user` is a Team role of `responder`
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The ID of the team in which the user will belong.
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return The ID of the team in which the user will belong.
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    /**
     * The ID of the user to add to the team.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The ID of the user to add to the team.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private TeamMembershipState() {}

    private TeamMembershipState(TeamMembershipState $) {
        this.role = $.role;
        this.teamId = $.teamId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamMembershipState $;

        public Builder() {
            $ = new TeamMembershipState();
        }

        public Builder(TeamMembershipState defaults) {
            $ = new TeamMembershipState(Objects.requireNonNull(defaults));
        }

        /**
         * @param role The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
         * These roles match up to user roles in the following ways:
         * * User role of `user` is a Team role of `manager`
         * * User role of `limited_user` is a Team role of `responder`
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
         * These roles match up to user roles in the following ways:
         * * User role of `user` is a Team role of `manager`
         * * User role of `limited_user` is a Team role of `responder`
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param teamId The ID of the team in which the user will belong.
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId The ID of the team in which the user will belong.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        /**
         * @param userId The ID of the user to add to the team.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the user to add to the team.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public TeamMembershipState build() {
            return $;
        }
    }

}
