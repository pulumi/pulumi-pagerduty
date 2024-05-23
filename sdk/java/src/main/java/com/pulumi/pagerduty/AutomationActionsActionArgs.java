// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.AutomationActionsActionActionDataReferenceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationActionsActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationActionsActionArgs Empty = new AutomationActionsActionArgs();

    /**
     * The category of the action. The only allowed values are `diagnostic` and `remediation`.
     * 
     */
    @Import(name="actionClassification")
    private @Nullable Output<String> actionClassification;

    /**
     * @return The category of the action. The only allowed values are `diagnostic` and `remediation`.
     * 
     */
    public Optional<Output<String>> actionClassification() {
        return Optional.ofNullable(this.actionClassification);
    }

    /**
     * Action Data block. Action Data is documented below.
     * 
     */
    @Import(name="actionDataReference", required=true)
    private Output<AutomationActionsActionActionDataReferenceArgs> actionDataReference;

    /**
     * @return Action Data block. Action Data is documented below.
     * 
     */
    public Output<AutomationActionsActionActionDataReferenceArgs> actionDataReference() {
        return this.actionDataReference;
    }

    /**
     * The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
     * 
     */
    @Import(name="actionType", required=true)
    private Output<String> actionType;

    /**
     * @return The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }

    /**
     * The time action was created. Represented as an ISO 8601 timestamp.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<String> creationTime;

    /**
     * @return The time action was created. Represented as an ISO 8601 timestamp.
     * 
     */
    public Optional<Output<String>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * The description of the action. Max length is 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the action. Max length is 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     * 
     */
    @Import(name="modifyTime")
    private @Nullable Output<String> modifyTime;

    /**
     * @return (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     * 
     */
    public Optional<Output<String>> modifyTime() {
        return Optional.ofNullable(this.modifyTime);
    }

    /**
     * The name of the action. Max length is 255 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the action. Max length is 255 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
     * 
     */
    @Import(name="runnerId")
    private @Nullable Output<String> runnerId;

    /**
     * @return The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
     * 
     */
    public Optional<Output<String>> runnerId() {
        return Optional.ofNullable(this.runnerId);
    }

    /**
     * (Optional) The type of the runner associated with the action.
     * 
     */
    @Import(name="runnerType")
    private @Nullable Output<String> runnerType;

    /**
     * @return (Optional) The type of the runner associated with the action.
     * 
     */
    public Optional<Output<String>> runnerType() {
        return Optional.ofNullable(this.runnerType);
    }

    /**
     * The type of object. The value returned will be `action`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of object. The value returned will be `action`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AutomationActionsActionArgs() {}

    private AutomationActionsActionArgs(AutomationActionsActionArgs $) {
        this.actionClassification = $.actionClassification;
        this.actionDataReference = $.actionDataReference;
        this.actionType = $.actionType;
        this.creationTime = $.creationTime;
        this.description = $.description;
        this.modifyTime = $.modifyTime;
        this.name = $.name;
        this.runnerId = $.runnerId;
        this.runnerType = $.runnerType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationActionsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationActionsActionArgs $;

        public Builder() {
            $ = new AutomationActionsActionArgs();
        }

        public Builder(AutomationActionsActionArgs defaults) {
            $ = new AutomationActionsActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionClassification The category of the action. The only allowed values are `diagnostic` and `remediation`.
         * 
         * @return builder
         * 
         */
        public Builder actionClassification(@Nullable Output<String> actionClassification) {
            $.actionClassification = actionClassification;
            return this;
        }

        /**
         * @param actionClassification The category of the action. The only allowed values are `diagnostic` and `remediation`.
         * 
         * @return builder
         * 
         */
        public Builder actionClassification(String actionClassification) {
            return actionClassification(Output.of(actionClassification));
        }

        /**
         * @param actionDataReference Action Data block. Action Data is documented below.
         * 
         * @return builder
         * 
         */
        public Builder actionDataReference(Output<AutomationActionsActionActionDataReferenceArgs> actionDataReference) {
            $.actionDataReference = actionDataReference;
            return this;
        }

        /**
         * @param actionDataReference Action Data block. Action Data is documented below.
         * 
         * @return builder
         * 
         */
        public Builder actionDataReference(AutomationActionsActionActionDataReferenceArgs actionDataReference) {
            return actionDataReference(Output.of(actionDataReference));
        }

        /**
         * @param actionType The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
         * 
         * @return builder
         * 
         */
        public Builder actionType(Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        /**
         * @param creationTime The time action was created. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<String> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The time action was created. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param description The description of the action. Max length is 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the action. Max length is 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param modifyTime (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder modifyTime(@Nullable Output<String> modifyTime) {
            $.modifyTime = modifyTime;
            return this;
        }

        /**
         * @param modifyTime (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder modifyTime(String modifyTime) {
            return modifyTime(Output.of(modifyTime));
        }

        /**
         * @param name The name of the action. Max length is 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the action. Max length is 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runnerId The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
         * 
         * @return builder
         * 
         */
        public Builder runnerId(@Nullable Output<String> runnerId) {
            $.runnerId = runnerId;
            return this;
        }

        /**
         * @param runnerId The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
         * 
         * @return builder
         * 
         */
        public Builder runnerId(String runnerId) {
            return runnerId(Output.of(runnerId));
        }

        /**
         * @param runnerType (Optional) The type of the runner associated with the action.
         * 
         * @return builder
         * 
         */
        public Builder runnerType(@Nullable Output<String> runnerType) {
            $.runnerType = runnerType;
            return this;
        }

        /**
         * @param runnerType (Optional) The type of the runner associated with the action.
         * 
         * @return builder
         * 
         */
        public Builder runnerType(String runnerType) {
            return runnerType(Output.of(runnerType));
        }

        /**
         * @param type The type of object. The value returned will be `action`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of object. The value returned will be `action`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AutomationActionsActionArgs build() {
            if ($.actionDataReference == null) {
                throw new MissingRequiredPropertyException("AutomationActionsActionArgs", "actionDataReference");
            }
            if ($.actionType == null) {
                throw new MissingRequiredPropertyException("AutomationActionsActionArgs", "actionType");
            }
            return $;
        }
    }

}
