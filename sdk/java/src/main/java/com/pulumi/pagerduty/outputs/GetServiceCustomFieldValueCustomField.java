// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceCustomFieldValueCustomField {
    /**
     * @return The kind of data the custom field is allowed to contain. Can be one of: `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    private String dataType;
    /**
     * @return A description of the data this field contains.
     * 
     */
    private String description;
    /**
     * @return The human-readable name of the custom field.
     * 
     */
    private String displayName;
    /**
     * @return The type of field. Can be one of: `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
     * 
     */
    private String fieldType;
    /**
     * @return The ID of the custom field.
     * 
     */
    private String id;
    /**
     * @return The name of the custom field.
     * 
     */
    private String name;
    /**
     * @return The type of the reference, typically &#34;field_value&#34;.
     * 
     */
    private String type;
    /**
     * @return The value of the custom field. This is a JSON-encoded string matching the field&#39;s data type.
     * 
     */
    private String value;

    private GetServiceCustomFieldValueCustomField() {}
    /**
     * @return The kind of data the custom field is allowed to contain. Can be one of: `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    public String dataType() {
        return this.dataType;
    }
    /**
     * @return A description of the data this field contains.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The human-readable name of the custom field.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The type of field. Can be one of: `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
     * 
     */
    public String fieldType() {
        return this.fieldType;
    }
    /**
     * @return The ID of the custom field.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the custom field.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of the reference, typically &#34;field_value&#34;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value of the custom field. This is a JSON-encoded string matching the field&#39;s data type.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceCustomFieldValueCustomField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dataType;
        private String description;
        private String displayName;
        private String fieldType;
        private String id;
        private String name;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetServiceCustomFieldValueCustomField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fieldType = defaults.fieldType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder dataType(String dataType) {
            if (dataType == null) {
              throw new MissingRequiredPropertyException("GetServiceCustomFieldValueCustomField", "dataType");
            }
            this.dataType = dataType;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetServiceCustomFieldValueCustomField", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetServiceCustomFieldValueCustomField", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder fieldType(String fieldType) {
            if (fieldType == null) {
              throw new MissingRequiredPropertyException("GetServiceCustomFieldValueCustomField", "fieldType");
            }
            this.fieldType = fieldType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceCustomFieldValueCustomField", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServiceCustomFieldValueCustomField", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceCustomFieldValueCustomField", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetServiceCustomFieldValueCustomField", "value");
            }
            this.value = value;
            return this;
        }
        public GetServiceCustomFieldValueCustomField build() {
            final var _resultValue = new GetServiceCustomFieldValueCustomField();
            _resultValue.dataType = dataType;
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.fieldType = fieldType;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
