// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutomationActionsActionActionDataReference {
    /**
     * @return (Optional) The command to execute the script with.
     * 
     */
    private String invocationCommand;
    /**
     * @return (Optional) The arguments to pass to the Process Automation job execution.
     * 
     */
    private String processAutomationJobArguments;
    /**
     * @return (Required for `process_automation` action_type) The ID of the Process Automation job to execute.
     * 
     */
    private String processAutomationJobId;
    /**
     * @return (Optional) The expression that filters on which nodes a Process Automation Job executes [Learn more](https://docs.rundeck.com/docs/manual/05-nodes.html#node-filtering).
     * 
     */
    private String processAutomationNodeFilter;
    /**
     * @return (Required for `script` action_type) Body of the script to be executed on the Runner. Max length is 16777215 characters.
     * 
     */
    private String script;

    private GetAutomationActionsActionActionDataReference() {}
    /**
     * @return (Optional) The command to execute the script with.
     * 
     */
    public String invocationCommand() {
        return this.invocationCommand;
    }
    /**
     * @return (Optional) The arguments to pass to the Process Automation job execution.
     * 
     */
    public String processAutomationJobArguments() {
        return this.processAutomationJobArguments;
    }
    /**
     * @return (Required for `process_automation` action_type) The ID of the Process Automation job to execute.
     * 
     */
    public String processAutomationJobId() {
        return this.processAutomationJobId;
    }
    /**
     * @return (Optional) The expression that filters on which nodes a Process Automation Job executes [Learn more](https://docs.rundeck.com/docs/manual/05-nodes.html#node-filtering).
     * 
     */
    public String processAutomationNodeFilter() {
        return this.processAutomationNodeFilter;
    }
    /**
     * @return (Required for `script` action_type) Body of the script to be executed on the Runner. Max length is 16777215 characters.
     * 
     */
    public String script() {
        return this.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutomationActionsActionActionDataReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String invocationCommand;
        private String processAutomationJobArguments;
        private String processAutomationJobId;
        private String processAutomationNodeFilter;
        private String script;
        public Builder() {}
        public Builder(GetAutomationActionsActionActionDataReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invocationCommand = defaults.invocationCommand;
    	      this.processAutomationJobArguments = defaults.processAutomationJobArguments;
    	      this.processAutomationJobId = defaults.processAutomationJobId;
    	      this.processAutomationNodeFilter = defaults.processAutomationNodeFilter;
    	      this.script = defaults.script;
        }

        @CustomType.Setter
        public Builder invocationCommand(String invocationCommand) {
            if (invocationCommand == null) {
              throw new MissingRequiredPropertyException("GetAutomationActionsActionActionDataReference", "invocationCommand");
            }
            this.invocationCommand = invocationCommand;
            return this;
        }
        @CustomType.Setter
        public Builder processAutomationJobArguments(String processAutomationJobArguments) {
            if (processAutomationJobArguments == null) {
              throw new MissingRequiredPropertyException("GetAutomationActionsActionActionDataReference", "processAutomationJobArguments");
            }
            this.processAutomationJobArguments = processAutomationJobArguments;
            return this;
        }
        @CustomType.Setter
        public Builder processAutomationJobId(String processAutomationJobId) {
            if (processAutomationJobId == null) {
              throw new MissingRequiredPropertyException("GetAutomationActionsActionActionDataReference", "processAutomationJobId");
            }
            this.processAutomationJobId = processAutomationJobId;
            return this;
        }
        @CustomType.Setter
        public Builder processAutomationNodeFilter(String processAutomationNodeFilter) {
            if (processAutomationNodeFilter == null) {
              throw new MissingRequiredPropertyException("GetAutomationActionsActionActionDataReference", "processAutomationNodeFilter");
            }
            this.processAutomationNodeFilter = processAutomationNodeFilter;
            return this;
        }
        @CustomType.Setter
        public Builder script(String script) {
            if (script == null) {
              throw new MissingRequiredPropertyException("GetAutomationActionsActionActionDataReference", "script");
            }
            this.script = script;
            return this;
        }
        public GetAutomationActionsActionActionDataReference build() {
            final var _resultValue = new GetAutomationActionsActionActionDataReference();
            _resultValue.invocationCommand = invocationCommand;
            _resultValue.processAutomationJobArguments = processAutomationJobArguments;
            _resultValue.processAutomationJobId = processAutomationJobId;
            _resultValue.processAutomationNodeFilter = processAutomationNodeFilter;
            _resultValue.script = script;
            return _resultValue;
        }
    }
}
