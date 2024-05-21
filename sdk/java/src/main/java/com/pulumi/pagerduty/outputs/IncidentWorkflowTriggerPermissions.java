// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IncidentWorkflowTriggerPermissions {
    /**
     * @return If `true`, indicates that the Trigger can only be started by authorized Users. If `false` (default), any user can start this Trigger. Applicable only to `manual`-type triggers.
     * 
     */
    private @Nullable Boolean restricted;
    /**
     * @return The ID of the Team whose members can manually start this Trigger. Required and allowed only if `restricted` is `true`.
     * 
     */
    private @Nullable String teamId;

    private IncidentWorkflowTriggerPermissions() {}
    /**
     * @return If `true`, indicates that the Trigger can only be started by authorized Users. If `false` (default), any user can start this Trigger. Applicable only to `manual`-type triggers.
     * 
     */
    public Optional<Boolean> restricted() {
        return Optional.ofNullable(this.restricted);
    }
    /**
     * @return The ID of the Team whose members can manually start this Trigger. Required and allowed only if `restricted` is `true`.
     * 
     */
    public Optional<String> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentWorkflowTriggerPermissions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean restricted;
        private @Nullable String teamId;
        public Builder() {}
        public Builder(IncidentWorkflowTriggerPermissions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restricted = defaults.restricted;
    	      this.teamId = defaults.teamId;
        }

        @CustomType.Setter
        public Builder restricted(@Nullable Boolean restricted) {

            this.restricted = restricted;
            return this;
        }
        @CustomType.Setter
        public Builder teamId(@Nullable String teamId) {

            this.teamId = teamId;
            return this;
        }
        public IncidentWorkflowTriggerPermissions build() {
            final var _resultValue = new IncidentWorkflowTriggerPermissions();
            _resultValue.restricted = restricted;
            _resultValue.teamId = teamId;
            return _resultValue;
        }
    }
}