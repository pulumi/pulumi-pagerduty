// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationActionsActionActionDataReference {
    /**
     * @return The command to execute the script with.
     * 
     */
    private @Nullable String invocationCommand;
    /**
     * @return The arguments to pass to the Process Automation job execution.
     * 
     */
    private @Nullable String processAutomationJobArguments;
    /**
     * @return The ID of the Process Automation job to execute.
     * 
     */
    private @Nullable String processAutomationJobId;
    /**
     * @return Body of the script to be executed on the Runner. Max length is 16777215 characters.
     * 
     */
    private @Nullable String script;

    private AutomationActionsActionActionDataReference() {}
    /**
     * @return The command to execute the script with.
     * 
     */
    public Optional<String> invocationCommand() {
        return Optional.ofNullable(this.invocationCommand);
    }
    /**
     * @return The arguments to pass to the Process Automation job execution.
     * 
     */
    public Optional<String> processAutomationJobArguments() {
        return Optional.ofNullable(this.processAutomationJobArguments);
    }
    /**
     * @return The ID of the Process Automation job to execute.
     * 
     */
    public Optional<String> processAutomationJobId() {
        return Optional.ofNullable(this.processAutomationJobId);
    }
    /**
     * @return Body of the script to be executed on the Runner. Max length is 16777215 characters.
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationActionsActionActionDataReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String invocationCommand;
        private @Nullable String processAutomationJobArguments;
        private @Nullable String processAutomationJobId;
        private @Nullable String script;
        public Builder() {}
        public Builder(AutomationActionsActionActionDataReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invocationCommand = defaults.invocationCommand;
    	      this.processAutomationJobArguments = defaults.processAutomationJobArguments;
    	      this.processAutomationJobId = defaults.processAutomationJobId;
    	      this.script = defaults.script;
        }

        @CustomType.Setter
        public Builder invocationCommand(@Nullable String invocationCommand) {
            this.invocationCommand = invocationCommand;
            return this;
        }
        @CustomType.Setter
        public Builder processAutomationJobArguments(@Nullable String processAutomationJobArguments) {
            this.processAutomationJobArguments = processAutomationJobArguments;
            return this;
        }
        @CustomType.Setter
        public Builder processAutomationJobId(@Nullable String processAutomationJobId) {
            this.processAutomationJobId = processAutomationJobId;
            return this;
        }
        @CustomType.Setter
        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }
        public AutomationActionsActionActionDataReference build() {
            final var o = new AutomationActionsActionActionDataReference();
            o.invocationCommand = invocationCommand;
            o.processAutomationJobArguments = processAutomationJobArguments;
            o.processAutomationJobId = processAutomationJobId;
            o.script = script;
            return o;
        }
    }
}