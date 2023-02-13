// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutomationActionsActionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutomationActionsActionArgs Empty = new GetAutomationActionsActionArgs();

    /**
     * (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
     * 
     */
    @Import(name="actionClassification")
    private @Nullable Output<String> actionClassification;

    /**
     * @return (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
     * 
     */
    public Optional<Output<String>> actionClassification() {
        return Optional.ofNullable(this.actionClassification);
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
     * (Optional) The description of the action.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Optional) The description of the action.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The id of the automation actions action in the PagerDuty API.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The id of the automation actions action in the PagerDuty API.
     * 
     */
    public Output<String> id() {
        return this.id;
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
     * (Optional) The Process Automation Actions runner to associate the action with.
     * 
     */
    @Import(name="runnerId")
    private @Nullable Output<String> runnerId;

    /**
     * @return (Optional) The Process Automation Actions runner to associate the action with.
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

    private GetAutomationActionsActionArgs() {}

    private GetAutomationActionsActionArgs(GetAutomationActionsActionArgs $) {
        this.actionClassification = $.actionClassification;
        this.creationTime = $.creationTime;
        this.description = $.description;
        this.id = $.id;
        this.modifyTime = $.modifyTime;
        this.runnerId = $.runnerId;
        this.runnerType = $.runnerType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutomationActionsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutomationActionsActionArgs $;

        public Builder() {
            $ = new GetAutomationActionsActionArgs();
        }

        public Builder(GetAutomationActionsActionArgs defaults) {
            $ = new GetAutomationActionsActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionClassification (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
         * 
         * @return builder
         * 
         */
        public Builder actionClassification(@Nullable Output<String> actionClassification) {
            $.actionClassification = actionClassification;
            return this;
        }

        /**
         * @param actionClassification (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
         * 
         * @return builder
         * 
         */
        public Builder actionClassification(String actionClassification) {
            return actionClassification(Output.of(actionClassification));
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
         * @param description (Optional) The description of the action.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Optional) The description of the action.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param id The id of the automation actions action in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the automation actions action in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
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
         * @param runnerId (Optional) The Process Automation Actions runner to associate the action with.
         * 
         * @return builder
         * 
         */
        public Builder runnerId(@Nullable Output<String> runnerId) {
            $.runnerId = runnerId;
            return this;
        }

        /**
         * @param runnerId (Optional) The Process Automation Actions runner to associate the action with.
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

        public GetAutomationActionsActionArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
