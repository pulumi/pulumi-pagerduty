// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtensionServiceNowArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionServiceNowArgs Empty = new ExtensionServiceNowArgs();

    @Import(name="endpointUrl")
    private @Nullable Output<String> endpointUrl;

    public Optional<Output<String>> endpointUrl() {
        return Optional.ofNullable(this.endpointUrl);
    }

    /**
     * This is the objects for which the extension applies (An array of service ids).
     * 
     */
    @Import(name="extensionObjects", required=true)
    private Output<List<String>> extensionObjects;

    /**
     * @return This is the objects for which the extension applies (An array of service ids).
     * 
     */
    public Output<List<String>> extensionObjects() {
        return this.extensionObjects;
    }

    /**
     * This is the schema for this extension.
     * 
     */
    @Import(name="extensionSchema", required=true)
    private Output<String> extensionSchema;

    /**
     * @return This is the schema for this extension.
     * 
     */
    public Output<String> extensionSchema() {
        return this.extensionSchema;
    }

    /**
     * The name of the service extension.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the service extension.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ServiceNow referer.
     * 
     */
    @Import(name="referer", required=true)
    private Output<String> referer;

    /**
     * @return The ServiceNow referer.
     * 
     */
    public Output<String> referer() {
        return this.referer;
    }

    /**
     * The ServiceNow password.
     * 
     */
    @Import(name="snowPassword", required=true)
    private Output<String> snowPassword;

    /**
     * @return The ServiceNow password.
     * 
     */
    public Output<String> snowPassword() {
        return this.snowPassword;
    }

    /**
     * The ServiceNow username.
     * 
     */
    @Import(name="snowUser", required=true)
    private Output<String> snowUser;

    /**
     * @return The ServiceNow username.
     * 
     */
    public Output<String> snowUser() {
        return this.snowUser;
    }

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     * 
     */
    @Import(name="summary")
    private @Nullable Output<String> summary;

    /**
     * @return A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     * 
     */
    public Optional<Output<String>> summary() {
        return Optional.ofNullable(this.summary);
    }

    /**
     * The ServiceNow sync option.
     * 
     */
    @Import(name="syncOptions", required=true)
    private Output<String> syncOptions;

    /**
     * @return The ServiceNow sync option.
     * 
     */
    public Output<String> syncOptions() {
        return this.syncOptions;
    }

    /**
     * Target Webhook URL.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return Target Webhook URL.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     * The ServiceNow task type, typically `incident`.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return The ServiceNow task type, typically `incident`.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ExtensionServiceNowArgs() {}

    private ExtensionServiceNowArgs(ExtensionServiceNowArgs $) {
        this.endpointUrl = $.endpointUrl;
        this.extensionObjects = $.extensionObjects;
        this.extensionSchema = $.extensionSchema;
        this.name = $.name;
        this.referer = $.referer;
        this.snowPassword = $.snowPassword;
        this.snowUser = $.snowUser;
        this.summary = $.summary;
        this.syncOptions = $.syncOptions;
        this.target = $.target;
        this.taskType = $.taskType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionServiceNowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionServiceNowArgs $;

        public Builder() {
            $ = new ExtensionServiceNowArgs();
        }

        public Builder(ExtensionServiceNowArgs defaults) {
            $ = new ExtensionServiceNowArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointUrl(@Nullable Output<String> endpointUrl) {
            $.endpointUrl = endpointUrl;
            return this;
        }

        public Builder endpointUrl(String endpointUrl) {
            return endpointUrl(Output.of(endpointUrl));
        }

        /**
         * @param extensionObjects This is the objects for which the extension applies (An array of service ids).
         * 
         * @return builder
         * 
         */
        public Builder extensionObjects(Output<List<String>> extensionObjects) {
            $.extensionObjects = extensionObjects;
            return this;
        }

        /**
         * @param extensionObjects This is the objects for which the extension applies (An array of service ids).
         * 
         * @return builder
         * 
         */
        public Builder extensionObjects(List<String> extensionObjects) {
            return extensionObjects(Output.of(extensionObjects));
        }

        /**
         * @param extensionObjects This is the objects for which the extension applies (An array of service ids).
         * 
         * @return builder
         * 
         */
        public Builder extensionObjects(String... extensionObjects) {
            return extensionObjects(List.of(extensionObjects));
        }

        /**
         * @param extensionSchema This is the schema for this extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionSchema(Output<String> extensionSchema) {
            $.extensionSchema = extensionSchema;
            return this;
        }

        /**
         * @param extensionSchema This is the schema for this extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionSchema(String extensionSchema) {
            return extensionSchema(Output.of(extensionSchema));
        }

        /**
         * @param name The name of the service extension.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the service extension.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param referer The ServiceNow referer.
         * 
         * @return builder
         * 
         */
        public Builder referer(Output<String> referer) {
            $.referer = referer;
            return this;
        }

        /**
         * @param referer The ServiceNow referer.
         * 
         * @return builder
         * 
         */
        public Builder referer(String referer) {
            return referer(Output.of(referer));
        }

        /**
         * @param snowPassword The ServiceNow password.
         * 
         * @return builder
         * 
         */
        public Builder snowPassword(Output<String> snowPassword) {
            $.snowPassword = snowPassword;
            return this;
        }

        /**
         * @param snowPassword The ServiceNow password.
         * 
         * @return builder
         * 
         */
        public Builder snowPassword(String snowPassword) {
            return snowPassword(Output.of(snowPassword));
        }

        /**
         * @param snowUser The ServiceNow username.
         * 
         * @return builder
         * 
         */
        public Builder snowUser(Output<String> snowUser) {
            $.snowUser = snowUser;
            return this;
        }

        /**
         * @param snowUser The ServiceNow username.
         * 
         * @return builder
         * 
         */
        public Builder snowUser(String snowUser) {
            return snowUser(Output.of(snowUser));
        }

        /**
         * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
         * 
         * @return builder
         * 
         */
        public Builder summary(@Nullable Output<String> summary) {
            $.summary = summary;
            return this;
        }

        /**
         * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
         * 
         * @return builder
         * 
         */
        public Builder summary(String summary) {
            return summary(Output.of(summary));
        }

        /**
         * @param syncOptions The ServiceNow sync option.
         * 
         * @return builder
         * 
         */
        public Builder syncOptions(Output<String> syncOptions) {
            $.syncOptions = syncOptions;
            return this;
        }

        /**
         * @param syncOptions The ServiceNow sync option.
         * 
         * @return builder
         * 
         */
        public Builder syncOptions(String syncOptions) {
            return syncOptions(Output.of(syncOptions));
        }

        /**
         * @param target Target Webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Target Webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param taskType The ServiceNow task type, typically `incident`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType The ServiceNow task type, typically `incident`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ExtensionServiceNowArgs build() {
            $.extensionObjects = Objects.requireNonNull($.extensionObjects, "expected parameter 'extensionObjects' to be non-null");
            $.extensionSchema = Objects.requireNonNull($.extensionSchema, "expected parameter 'extensionSchema' to be non-null");
            $.referer = Objects.requireNonNull($.referer, "expected parameter 'referer' to be non-null");
            $.snowPassword = Objects.requireNonNull($.snowPassword, "expected parameter 'snowPassword' to be non-null");
            $.snowUser = Objects.requireNonNull($.snowUser, "expected parameter 'snowUser' to be non-null");
            $.syncOptions = Objects.requireNonNull($.syncOptions, "expected parameter 'syncOptions' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.taskType = Objects.requireNonNull($.taskType, "expected parameter 'taskType' to be non-null");
            return $;
        }
    }

}
