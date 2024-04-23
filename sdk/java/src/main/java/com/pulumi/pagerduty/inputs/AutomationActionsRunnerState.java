// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationActionsRunnerState extends com.pulumi.resources.ResourceArgs {

    public static final AutomationActionsRunnerState Empty = new AutomationActionsRunnerState();

    /**
     * The time runner was created. Represented as an ISO 8601 timestamp.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<String> creationTime;

    /**
     * @return The time runner was created. Represented as an ISO 8601 timestamp.
     * 
     */
    public Optional<Output<String>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     * 
     */
    @Import(name="lastSeen")
    private @Nullable Output<String> lastSeen;

    /**
     * @return (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     * 
     */
    public Optional<Output<String>> lastSeen() {
        return Optional.ofNullable(this.lastSeen);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="runbookApiKey")
    private @Nullable Output<String> runbookApiKey;

    public Optional<Output<String>> runbookApiKey() {
        return Optional.ofNullable(this.runbookApiKey);
    }

    @Import(name="runbookBaseUri")
    private @Nullable Output<String> runbookBaseUri;

    public Optional<Output<String>> runbookBaseUri() {
        return Optional.ofNullable(this.runbookBaseUri);
    }

    @Import(name="runnerType")
    private @Nullable Output<String> runnerType;

    public Optional<Output<String>> runnerType() {
        return Optional.ofNullable(this.runnerType);
    }

    /**
     * The type of object. The value returned will be `runner`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of object. The value returned will be `runner`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AutomationActionsRunnerState() {}

    private AutomationActionsRunnerState(AutomationActionsRunnerState $) {
        this.creationTime = $.creationTime;
        this.description = $.description;
        this.lastSeen = $.lastSeen;
        this.name = $.name;
        this.runbookApiKey = $.runbookApiKey;
        this.runbookBaseUri = $.runbookBaseUri;
        this.runnerType = $.runnerType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationActionsRunnerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationActionsRunnerState $;

        public Builder() {
            $ = new AutomationActionsRunnerState();
        }

        public Builder(AutomationActionsRunnerState defaults) {
            $ = new AutomationActionsRunnerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationTime The time runner was created. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<String> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The time runner was created. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            return creationTime(Output.of(creationTime));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param lastSeen (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder lastSeen(@Nullable Output<String> lastSeen) {
            $.lastSeen = lastSeen;
            return this;
        }

        /**
         * @param lastSeen (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder lastSeen(String lastSeen) {
            return lastSeen(Output.of(lastSeen));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder runbookApiKey(@Nullable Output<String> runbookApiKey) {
            $.runbookApiKey = runbookApiKey;
            return this;
        }

        public Builder runbookApiKey(String runbookApiKey) {
            return runbookApiKey(Output.of(runbookApiKey));
        }

        public Builder runbookBaseUri(@Nullable Output<String> runbookBaseUri) {
            $.runbookBaseUri = runbookBaseUri;
            return this;
        }

        public Builder runbookBaseUri(String runbookBaseUri) {
            return runbookBaseUri(Output.of(runbookBaseUri));
        }

        public Builder runnerType(@Nullable Output<String> runnerType) {
            $.runnerType = runnerType;
            return this;
        }

        public Builder runnerType(String runnerType) {
            return runnerType(Output.of(runnerType));
        }

        /**
         * @param type The type of object. The value returned will be `runner`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of object. The value returned will be `runner`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AutomationActionsRunnerState build() {
            return $;
        }
    }

}
