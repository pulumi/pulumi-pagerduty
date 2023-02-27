// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomFieldSchemaAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final CustomFieldSchemaAssignmentState Empty = new CustomFieldSchemaAssignmentState();

    /**
     * The id of the field schema.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The id of the field schema.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * The id of the service.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The id of the service.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private CustomFieldSchemaAssignmentState() {}

    private CustomFieldSchemaAssignmentState(CustomFieldSchemaAssignmentState $) {
        this.schema = $.schema;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomFieldSchemaAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomFieldSchemaAssignmentState $;

        public Builder() {
            $ = new CustomFieldSchemaAssignmentState();
        }

        public Builder(CustomFieldSchemaAssignmentState defaults) {
            $ = new CustomFieldSchemaAssignmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param schema The id of the field schema.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The id of the field schema.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param service The id of the service.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The id of the service.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public CustomFieldSchemaAssignmentState build() {
            return $;
        }
    }

}
