// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pagerduty.inputs.SlackConnectionConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlackConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final SlackConnectionState Empty = new SlackConnectionState();

    /**
     * The ID of a Slack channel in the workspace.
     * 
     */
    @Import(name="channelId")
    private @Nullable Output<String> channelId;

    /**
     * @return The ID of a Slack channel in the workspace.
     * 
     */
    public Optional<Output<String>> channelId() {
        return Optional.ofNullable(this.channelId);
    }

    @Import(name="channelName")
    private @Nullable Output<String> channelName;

    public Optional<Output<String>> channelName() {
        return Optional.ofNullable(this.channelName);
    }

    /**
     * Configuration options for the Slack connection that provide options to filter events.
     * 
     */
    @Import(name="configs")
    private @Nullable Output<List<SlackConnectionConfigArgs>> configs;

    /**
     * @return Configuration options for the Slack connection that provide options to filter events.
     * 
     */
    public Optional<Output<List<SlackConnectionConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    /**
     * Type of notification. Either `responder` or `stakeholder`.
     * 
     */
    @Import(name="notificationType")
    private @Nullable Output<String> notificationType;

    /**
     * @return Type of notification. Either `responder` or `stakeholder`.
     * 
     */
    public Optional<Output<String>> notificationType() {
        return Optional.ofNullable(this.notificationType);
    }

    /**
     * The ID of the source in PagerDuty. Valid sources are services or teams.
     * 
     */
    @Import(name="sourceId")
    private @Nullable Output<String> sourceId;

    /**
     * @return The ID of the source in PagerDuty. Valid sources are services or teams.
     * 
     */
    public Optional<Output<String>> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }

    @Import(name="sourceName")
    private @Nullable Output<String> sourceName;

    public Optional<Output<String>> sourceName() {
        return Optional.ofNullable(this.sourceName);
    }

    /**
     * The type of the source. Either `team_reference` or `service_reference`.
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    /**
     * @return The type of the source. Either `team_reference` or `service_reference`.
     * 
     */
    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    /**
     * The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private SlackConnectionState() {}

    private SlackConnectionState(SlackConnectionState $) {
        this.channelId = $.channelId;
        this.channelName = $.channelName;
        this.configs = $.configs;
        this.notificationType = $.notificationType;
        this.sourceId = $.sourceId;
        this.sourceName = $.sourceName;
        this.sourceType = $.sourceType;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlackConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlackConnectionState $;

        public Builder() {
            $ = new SlackConnectionState();
        }

        public Builder(SlackConnectionState defaults) {
            $ = new SlackConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelId The ID of a Slack channel in the workspace.
         * 
         * @return builder
         * 
         */
        public Builder channelId(@Nullable Output<String> channelId) {
            $.channelId = channelId;
            return this;
        }

        /**
         * @param channelId The ID of a Slack channel in the workspace.
         * 
         * @return builder
         * 
         */
        public Builder channelId(String channelId) {
            return channelId(Output.of(channelId));
        }

        public Builder channelName(@Nullable Output<String> channelName) {
            $.channelName = channelName;
            return this;
        }

        public Builder channelName(String channelName) {
            return channelName(Output.of(channelName));
        }

        /**
         * @param configs Configuration options for the Slack connection that provide options to filter events.
         * 
         * @return builder
         * 
         */
        public Builder configs(@Nullable Output<List<SlackConnectionConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        /**
         * @param configs Configuration options for the Slack connection that provide options to filter events.
         * 
         * @return builder
         * 
         */
        public Builder configs(List<SlackConnectionConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        /**
         * @param configs Configuration options for the Slack connection that provide options to filter events.
         * 
         * @return builder
         * 
         */
        public Builder configs(SlackConnectionConfigArgs... configs) {
            return configs(List.of(configs));
        }

        /**
         * @param notificationType Type of notification. Either `responder` or `stakeholder`.
         * 
         * @return builder
         * 
         */
        public Builder notificationType(@Nullable Output<String> notificationType) {
            $.notificationType = notificationType;
            return this;
        }

        /**
         * @param notificationType Type of notification. Either `responder` or `stakeholder`.
         * 
         * @return builder
         * 
         */
        public Builder notificationType(String notificationType) {
            return notificationType(Output.of(notificationType));
        }

        /**
         * @param sourceId The ID of the source in PagerDuty. Valid sources are services or teams.
         * 
         * @return builder
         * 
         */
        public Builder sourceId(@Nullable Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        /**
         * @param sourceId The ID of the source in PagerDuty. Valid sources are services or teams.
         * 
         * @return builder
         * 
         */
        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public Builder sourceName(@Nullable Output<String> sourceName) {
            $.sourceName = sourceName;
            return this;
        }

        public Builder sourceName(String sourceName) {
            return sourceName(Output.of(sourceName));
        }

        /**
         * @param sourceType The type of the source. Either `team_reference` or `service_reference`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The type of the source. Either `team_reference` or `service_reference`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        /**
         * @param workspaceId The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public SlackConnectionState build() {
            return $;
        }
    }

}