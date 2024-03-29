// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutomationActionsRunnerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutomationActionsRunnerPlainArgs Empty = new GetAutomationActionsRunnerPlainArgs();

    /**
     * (Optional) The description of the runner.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return (Optional) The description of the runner.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The id of the automation actions runner in the PagerDuty API.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The id of the automation actions runner in the PagerDuty API.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     * 
     */
    @Import(name="lastSeen")
    private @Nullable String lastSeen;

    /**
     * @return (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     * 
     */
    public Optional<String> lastSeen() {
        return Optional.ofNullable(this.lastSeen);
    }

    /**
     * (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
     * 
     */
    @Import(name="runbookBaseUri")
    private @Nullable String runbookBaseUri;

    /**
     * @return (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
     * 
     */
    public Optional<String> runbookBaseUri() {
        return Optional.ofNullable(this.runbookBaseUri);
    }

    private GetAutomationActionsRunnerPlainArgs() {}

    private GetAutomationActionsRunnerPlainArgs(GetAutomationActionsRunnerPlainArgs $) {
        this.description = $.description;
        this.id = $.id;
        this.lastSeen = $.lastSeen;
        this.runbookBaseUri = $.runbookBaseUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutomationActionsRunnerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutomationActionsRunnerPlainArgs $;

        public Builder() {
            $ = new GetAutomationActionsRunnerPlainArgs();
        }

        public Builder(GetAutomationActionsRunnerPlainArgs defaults) {
            $ = new GetAutomationActionsRunnerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description (Optional) The description of the runner.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param id The id of the automation actions runner in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param lastSeen (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
         * 
         * @return builder
         * 
         */
        public Builder lastSeen(@Nullable String lastSeen) {
            $.lastSeen = lastSeen;
            return this;
        }

        /**
         * @param runbookBaseUri (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
         * 
         * @return builder
         * 
         */
        public Builder runbookBaseUri(@Nullable String runbookBaseUri) {
            $.runbookBaseUri = runbookBaseUri;
            return this;
        }

        public GetAutomationActionsRunnerPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetAutomationActionsRunnerPlainArgs", "id");
            }
            return $;
        }
    }

}
