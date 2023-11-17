// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IncidentCustomFieldState extends com.pulumi.resources.ResourceArgs {

    public static final IncidentCustomFieldState Empty = new IncidentCustomFieldState();

    /**
     * The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    /**
     * @return The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * The default value to set when new incidents are created. Always specified as a string.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    /**
     * @return The default value to set when new incidents are created. Always specified as a string.
     * 
     */
    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * The description of the field.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the field.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the field.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the field.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
     * 
     */
    @Import(name="fieldType")
    private @Nullable Output<String> fieldType;

    /**
     * @return The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
     * 
     */
    public Optional<Output<String>> fieldType() {
        return Optional.ofNullable(this.fieldType);
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

    private IncidentCustomFieldState() {}

    private IncidentCustomFieldState(IncidentCustomFieldState $) {
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
    public static Builder builder(IncidentCustomFieldState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentCustomFieldState $;

        public Builder() {
            $ = new IncidentCustomFieldState();
        }

        public Builder(IncidentCustomFieldState defaults) {
            $ = new IncidentCustomFieldState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataType The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable Output<String> dataType) {
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

        /**
         * @param defaultValue The default value to set when new incidents are created. Always specified as a string.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue The default value to set when new incidents are created. Always specified as a string.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param description The description of the field.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the field.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the field.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the field.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param fieldType The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
         * 
         * @return builder
         * 
         */
        public Builder fieldType(@Nullable Output<String> fieldType) {
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

        public IncidentCustomFieldState build() {
            return $;
        }
    }

}
