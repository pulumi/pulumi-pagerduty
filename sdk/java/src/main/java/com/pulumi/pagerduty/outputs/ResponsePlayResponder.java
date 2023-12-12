// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.ResponsePlayResponderEscalationRule;
import com.pulumi.pagerduty.outputs.ResponsePlayResponderService;
import com.pulumi.pagerduty.outputs.ResponsePlayResponderTeam;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponsePlayResponder {
    /**
     * @return Description of escalation policy
     * 
     */
    private @Nullable String description;
    /**
     * @return The escalation rules
     * 
     */
    private @Nullable List<ResponsePlayResponderEscalationRule> escalationRules;
    /**
     * @return ID of the user defined as the responder
     * 
     */
    private @Nullable String id;
    /**
     * @return Name of the escalation policy
     * 
     */
    private @Nullable String name;
    /**
     * @return The number of times the escalation policy will repeat after reaching the end of its escalation.
     * 
     */
    private @Nullable Integer numLoops;
    /**
     * @return Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to &#34;if_has_services&#34;. Could be &#34;if_has_services&#34;, &#34;always
     * 
     */
    private @Nullable String onCallHandoffNotifications;
    /**
     * @return There can be multiple services associated with a policy.
     * 
     */
    private @Nullable List<ResponsePlayResponderService> services;
    /**
     * @return Teams associated with the policy. Account must have the `teams` ability to use this parameter. There can be multiple teams associated with a policy.
     * 
     */
    private @Nullable List<ResponsePlayResponderTeam> teams;
    /**
     * @return Type of object of the target. Supported types are `user_reference`, `schedule_reference`.
     * 
     */
    private @Nullable String type;

    private ResponsePlayResponder() {}
    /**
     * @return Description of escalation policy
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The escalation rules
     * 
     */
    public List<ResponsePlayResponderEscalationRule> escalationRules() {
        return this.escalationRules == null ? List.of() : this.escalationRules;
    }
    /**
     * @return ID of the user defined as the responder
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the escalation policy
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The number of times the escalation policy will repeat after reaching the end of its escalation.
     * 
     */
    public Optional<Integer> numLoops() {
        return Optional.ofNullable(this.numLoops);
    }
    /**
     * @return Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to &#34;if_has_services&#34;. Could be &#34;if_has_services&#34;, &#34;always
     * 
     */
    public Optional<String> onCallHandoffNotifications() {
        return Optional.ofNullable(this.onCallHandoffNotifications);
    }
    /**
     * @return There can be multiple services associated with a policy.
     * 
     */
    public List<ResponsePlayResponderService> services() {
        return this.services == null ? List.of() : this.services;
    }
    /**
     * @return Teams associated with the policy. Account must have the `teams` ability to use this parameter. There can be multiple teams associated with a policy.
     * 
     */
    public List<ResponsePlayResponderTeam> teams() {
        return this.teams == null ? List.of() : this.teams;
    }
    /**
     * @return Type of object of the target. Supported types are `user_reference`, `schedule_reference`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlayResponder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<ResponsePlayResponderEscalationRule> escalationRules;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer numLoops;
        private @Nullable String onCallHandoffNotifications;
        private @Nullable List<ResponsePlayResponderService> services;
        private @Nullable List<ResponsePlayResponderTeam> teams;
        private @Nullable String type;
        public Builder() {}
        public Builder(ResponsePlayResponder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.escalationRules = defaults.escalationRules;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.numLoops = defaults.numLoops;
    	      this.onCallHandoffNotifications = defaults.onCallHandoffNotifications;
    	      this.services = defaults.services;
    	      this.teams = defaults.teams;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder escalationRules(@Nullable List<ResponsePlayResponderEscalationRule> escalationRules) {
            this.escalationRules = escalationRules;
            return this;
        }
        public Builder escalationRules(ResponsePlayResponderEscalationRule... escalationRules) {
            return escalationRules(List.of(escalationRules));
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder numLoops(@Nullable Integer numLoops) {
            this.numLoops = numLoops;
            return this;
        }
        @CustomType.Setter
        public Builder onCallHandoffNotifications(@Nullable String onCallHandoffNotifications) {
            this.onCallHandoffNotifications = onCallHandoffNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder services(@Nullable List<ResponsePlayResponderService> services) {
            this.services = services;
            return this;
        }
        public Builder services(ResponsePlayResponderService... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder teams(@Nullable List<ResponsePlayResponderTeam> teams) {
            this.teams = teams;
            return this;
        }
        public Builder teams(ResponsePlayResponderTeam... teams) {
            return teams(List.of(teams));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ResponsePlayResponder build() {
            final var _resultValue = new ResponsePlayResponder();
            _resultValue.description = description;
            _resultValue.escalationRules = escalationRules;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.numLoops = numLoops;
            _resultValue.onCallHandoffNotifications = onCallHandoffNotifications;
            _resultValue.services = services;
            _resultValue.teams = teams;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
