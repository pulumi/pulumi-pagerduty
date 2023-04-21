// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CustomFieldOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomFieldOptionArgs Empty = new CustomFieldOptionArgs();

    /**
     * The datatype of the field option. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    @Import(name="datatype", required=true)
    private Output<String> datatype;

    /**
     * @return The datatype of the field option. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    public Output<String> datatype() {
        return this.datatype;
    }

    /**
     * The ID of the field.
     * 
     */
    @Import(name="field", required=true)
    private Output<String> field;

    /**
     * @return The ID of the field.
     * 
     */
    public Output<String> field() {
        return this.field;
    }

    /**
     * The allowed value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The allowed value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private CustomFieldOptionArgs() {}

    private CustomFieldOptionArgs(CustomFieldOptionArgs $) {
        this.datatype = $.datatype;
        this.field = $.field;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomFieldOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomFieldOptionArgs $;

        public Builder() {
            $ = new CustomFieldOptionArgs();
        }

        public Builder(CustomFieldOptionArgs defaults) {
            $ = new CustomFieldOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datatype The datatype of the field option. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
         * 
         * @return builder
         * 
         */
        public Builder datatype(Output<String> datatype) {
            $.datatype = datatype;
            return this;
        }

        /**
         * @param datatype The datatype of the field option. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
         * 
         * @return builder
         * 
         */
        public Builder datatype(String datatype) {
            return datatype(Output.of(datatype));
        }

        /**
         * @param field The ID of the field.
         * 
         * @return builder
         * 
         */
        public Builder field(Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field The ID of the field.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param value The allowed value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The allowed value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CustomFieldOptionArgs build() {
            $.datatype = Objects.requireNonNull($.datatype, "expected parameter 'datatype' to be non-null");
            $.field = Objects.requireNonNull($.field, "expected parameter 'field' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}