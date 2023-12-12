// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.GetAutomationActionsActionActionDataReference;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAutomationActionsActionResult {
    /**
     * @return (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
     * 
     */
    private String actionClassification;
    /**
     * @return Action Data block. Action Data is documented below.
     * 
     */
    private List<GetAutomationActionsActionActionDataReference> actionDataReferences;
    /**
     * @return The type of the action. The only allowed values are `process_automation` and `script`.
     * 
     */
    private String actionType;
    /**
     * @return The time action was created. Represented as an ISO 8601 timestamp.
     * 
     */
    private String creationTime;
    /**
     * @return (Optional) The description of the action.
     * 
     */
    private String description;
    /**
     * @return The ID of the action.
     * 
     */
    private String id;
    /**
     * @return (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     * 
     */
    private String modifyTime;
    /**
     * @return The name of the action.
     * 
     */
    private String name;
    /**
     * @return (Optional) The Process Automation Actions runner to associate the action with.
     * 
     */
    private String runnerId;
    /**
     * @return (Optional) The type of the runner associated with the action.
     * 
     */
    private String runnerType;
    /**
     * @return The type of object. The value returned will be `action`.
     * 
     */
    private String type;

    private GetAutomationActionsActionResult() {}
    /**
     * @return (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
     * 
     */
    public String actionClassification() {
        return this.actionClassification;
    }
    /**
     * @return Action Data block. Action Data is documented below.
     * 
     */
    public List<GetAutomationActionsActionActionDataReference> actionDataReferences() {
        return this.actionDataReferences;
    }
    /**
     * @return The type of the action. The only allowed values are `process_automation` and `script`.
     * 
     */
    public String actionType() {
        return this.actionType;
    }
    /**
     * @return The time action was created. Represented as an ISO 8601 timestamp.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return (Optional) The description of the action.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the action.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     * 
     */
    public String modifyTime() {
        return this.modifyTime;
    }
    /**
     * @return The name of the action.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional) The Process Automation Actions runner to associate the action with.
     * 
     */
    public String runnerId() {
        return this.runnerId;
    }
    /**
     * @return (Optional) The type of the runner associated with the action.
     * 
     */
    public String runnerType() {
        return this.runnerType;
    }
    /**
     * @return The type of object. The value returned will be `action`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutomationActionsActionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actionClassification;
        private List<GetAutomationActionsActionActionDataReference> actionDataReferences;
        private String actionType;
        private String creationTime;
        private String description;
        private String id;
        private String modifyTime;
        private String name;
        private String runnerId;
        private String runnerType;
        private String type;
        public Builder() {}
        public Builder(GetAutomationActionsActionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionClassification = defaults.actionClassification;
    	      this.actionDataReferences = defaults.actionDataReferences;
    	      this.actionType = defaults.actionType;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.modifyTime = defaults.modifyTime;
    	      this.name = defaults.name;
    	      this.runnerId = defaults.runnerId;
    	      this.runnerType = defaults.runnerType;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder actionClassification(String actionClassification) {
            this.actionClassification = Objects.requireNonNull(actionClassification);
            return this;
        }
        @CustomType.Setter
        public Builder actionDataReferences(List<GetAutomationActionsActionActionDataReference> actionDataReferences) {
            this.actionDataReferences = Objects.requireNonNull(actionDataReferences);
            return this;
        }
        public Builder actionDataReferences(GetAutomationActionsActionActionDataReference... actionDataReferences) {
            return actionDataReferences(List.of(actionDataReferences));
        }
        @CustomType.Setter
        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = Objects.requireNonNull(modifyTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder runnerId(String runnerId) {
            this.runnerId = Objects.requireNonNull(runnerId);
            return this;
        }
        @CustomType.Setter
        public Builder runnerType(String runnerType) {
            this.runnerType = Objects.requireNonNull(runnerType);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAutomationActionsActionResult build() {
            final var _resultValue = new GetAutomationActionsActionResult();
            _resultValue.actionClassification = actionClassification;
            _resultValue.actionDataReferences = actionDataReferences;
            _resultValue.actionType = actionType;
            _resultValue.creationTime = creationTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.modifyTime = modifyTime;
            _resultValue.name = name;
            _resultValue.runnerId = runnerId;
            _resultValue.runnerType = runnerType;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
