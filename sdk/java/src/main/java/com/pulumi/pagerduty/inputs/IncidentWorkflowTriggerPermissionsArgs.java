// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IncidentWorkflowTriggerPermissionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final IncidentWorkflowTriggerPermissionsArgs Empty = new IncidentWorkflowTriggerPermissionsArgs();

    /**
     * If `true`, indicates that the Trigger can only be started by authorized Users. If `false` (default), any user can start this Trigger. Applicable only to `manual`-type triggers.
     * 
     */
    @Import(name="restricted")
    private @Nullable Output<Boolean> restricted;

    /**
     * @return If `true`, indicates that the Trigger can only be started by authorized Users. If `false` (default), any user can start this Trigger. Applicable only to `manual`-type triggers.
     * 
     */
    public Optional<Output<Boolean>> restricted() {
        return Optional.ofNullable(this.restricted);
    }

    /**
     * The ID of the Team whose members can manually start this Trigger. Required and allowed only if `restricted` is `true`.
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return The ID of the Team whose members can manually start this Trigger. Required and allowed only if `restricted` is `true`.
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private IncidentWorkflowTriggerPermissionsArgs() {}

    private IncidentWorkflowTriggerPermissionsArgs(IncidentWorkflowTriggerPermissionsArgs $) {
        this.restricted = $.restricted;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IncidentWorkflowTriggerPermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentWorkflowTriggerPermissionsArgs $;

        public Builder() {
            $ = new IncidentWorkflowTriggerPermissionsArgs();
        }

        public Builder(IncidentWorkflowTriggerPermissionsArgs defaults) {
            $ = new IncidentWorkflowTriggerPermissionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param restricted If `true`, indicates that the Trigger can only be started by authorized Users. If `false` (default), any user can start this Trigger. Applicable only to `manual`-type triggers.
         * 
         * @return builder
         * 
         */
        public Builder restricted(@Nullable Output<Boolean> restricted) {
            $.restricted = restricted;
            return this;
        }

        /**
         * @param restricted If `true`, indicates that the Trigger can only be started by authorized Users. If `false` (default), any user can start this Trigger. Applicable only to `manual`-type triggers.
         * 
         * @return builder
         * 
         */
        public Builder restricted(Boolean restricted) {
            return restricted(Output.of(restricted));
        }

        /**
         * @param teamId The ID of the Team whose members can manually start this Trigger. Required and allowed only if `restricted` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId The ID of the Team whose members can manually start this Trigger. Required and allowed only if `restricted` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public IncidentWorkflowTriggerPermissionsArgs build() {
            return $;
        }
    }

}
