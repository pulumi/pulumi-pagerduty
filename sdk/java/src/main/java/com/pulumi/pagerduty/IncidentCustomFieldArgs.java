// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IncidentCustomFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final IncidentCustomFieldArgs Empty = new IncidentCustomFieldArgs();

    /**
     * The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    @Import(name="dataType", required=true)
    private Output<String> dataType;

    /**
     * @return The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    public Output<String> dataType() {
        return this.dataType;
    }

    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
     * 
     */
    @Import(name="fieldType", required=true)
    private Output<String> fieldType;

    /**
     * @return The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
     * 
     */
    public Output<String> fieldType() {
        return this.fieldType;
    }

    /**
     * The name of the field.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the field.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private IncidentCustomFieldArgs() {}

    private IncidentCustomFieldArgs(IncidentCustomFieldArgs $) {
        this.dataType = $.dataType;
        this.defaultValue = $.defaultValue;
        this.description = $.description;
        this.displayName = $.displayName;
        this.fieldType = $.fieldType;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IncidentCustomFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentCustomFieldArgs $;

        public Builder() {
            $ = new IncidentCustomFieldArgs();
        }

        public Builder(IncidentCustomFieldArgs defaults) {
            $ = new IncidentCustomFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataType The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
         * 
         * @return builder
         * 
         */
        public Builder dataType(Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
         * 
         * @return builder
         * 
         */
        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param fieldType The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
         * 
         * @return builder
         * 
         */
        public Builder fieldType(Output<String> fieldType) {
            $.fieldType = fieldType;
            return this;
        }

        /**
         * @param fieldType The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
         * 
         * @return builder
         * 
         */
        public Builder fieldType(String fieldType) {
            return fieldType(Output.of(fieldType));
        }

        /**
         * @param name The name of the field.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the field.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public IncidentCustomFieldArgs build() {
            $.dataType = Objects.requireNonNull($.dataType, "expected parameter 'dataType' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.fieldType = Objects.requireNonNull($.fieldType, "expected parameter 'fieldType' to be non-null");
            return $;
        }
    }

}
