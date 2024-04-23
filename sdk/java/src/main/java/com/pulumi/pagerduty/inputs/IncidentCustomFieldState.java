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

    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
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

    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="fieldType")
    private @Nullable Output<String> fieldType;

    public Optional<Output<String>> fieldType() {
        return Optional.ofNullable(this.fieldType);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

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

        public Builder dataType(@Nullable Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

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

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder fieldType(@Nullable Output<String> fieldType) {
            $.fieldType = fieldType;
            return this;
        }

        public Builder fieldType(String fieldType) {
            return fieldType(Output.of(fieldType));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public IncidentCustomFieldState build() {
            return $;
        }
    }

}
