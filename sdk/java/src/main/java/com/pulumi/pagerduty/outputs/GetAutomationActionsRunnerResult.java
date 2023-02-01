// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutomationActionsRunnerResult {
    /**
     * @return The time runner was created. Represented as an ISO 8601 timestamp.
     * 
     */
    private String creationTime;
    /**
     * @return (Optional) The description of the runner.
     * 
     */
    private String description;
    /**
     * @return The ID of the found runner.
     * 
     */
    private String id;
    /**
     * @return (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     * 
     */
    private String lastSeen;
    /**
     * @return The name of the found runner.
     * 
     */
    private String name;
    /**
     * @return (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
     * 
     */
    private String runbookBaseUri;
    /**
     * @return The type of runner. Allowed values are `sidecar` and `runbook`.
     * 
     */
    private String runnerType;
    /**
     * @return The type of object. The value returned will be `runner`.
     * 
     */
    private String type;

    private GetAutomationActionsRunnerResult() {}
    /**
     * @return The time runner was created. Represented as an ISO 8601 timestamp.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return (Optional) The description of the runner.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the found runner.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     * 
     */
    public String lastSeen() {
        return this.lastSeen;
    }
    /**
     * @return The name of the found runner.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
     * 
     */
    public String runbookBaseUri() {
        return this.runbookBaseUri;
    }
    /**
     * @return The type of runner. Allowed values are `sidecar` and `runbook`.
     * 
     */
    public String runnerType() {
        return this.runnerType;
    }
    /**
     * @return The type of object. The value returned will be `runner`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutomationActionsRunnerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String creationTime;
        private String description;
        private String id;
        private String lastSeen;
        private String name;
        private String runbookBaseUri;
        private String runnerType;
        private String type;
        public Builder() {}
        public Builder(GetAutomationActionsRunnerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastSeen = defaults.lastSeen;
    	      this.name = defaults.name;
    	      this.runbookBaseUri = defaults.runbookBaseUri;
    	      this.runnerType = defaults.runnerType;
    	      this.type = defaults.type;
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
        public Builder lastSeen(String lastSeen) {
            this.lastSeen = Objects.requireNonNull(lastSeen);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder runbookBaseUri(String runbookBaseUri) {
            this.runbookBaseUri = Objects.requireNonNull(runbookBaseUri);
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
        public GetAutomationActionsRunnerResult build() {
            final var o = new GetAutomationActionsRunnerResult();
            o.creationTime = creationTime;
            o.description = description;
            o.id = id;
            o.lastSeen = lastSeen;
            o.name = name;
            o.runbookBaseUri = runbookBaseUri;
            o.runnerType = runnerType;
            o.type = type;
            return o;
        }
    }
}