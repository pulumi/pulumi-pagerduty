// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.CustomFieldSchemaFieldConfigurationArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.CustomFieldSchemaFieldConfigurationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; This Resource is no longer functional. Documentation is left here for the purpose of documenting migration steps.
 * 
 * A [Custom Field Configuration](https://support.pagerduty.com/docs/custom-fields#associate-schemas-with-services) is a declaration of a specific Custom Field in a specific Custom Field Schema.
 * 
 * ## Migration
 * 
 * This resource has no currently functional counterpart. Custom Fields on Incidents are now applied globally
 * to incidents within an account and have no notion of a Field Schema.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.CustomField;
 * import com.pulumi.pagerduty.CustomFieldArgs;
 * import com.pulumi.pagerduty.CustomFieldSchema;
 * import com.pulumi.pagerduty.CustomFieldSchemaArgs;
 * import com.pulumi.pagerduty.CustomFieldSchemaFieldConfiguration;
 * import com.pulumi.pagerduty.CustomFieldSchemaFieldConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var csImpact = new CustomField(&#34;csImpact&#34;, CustomFieldArgs.builder()        
 *             .datatype(&#34;string&#34;)
 *             .build());
 * 
 *         var mySchema = new CustomFieldSchema(&#34;mySchema&#34;, CustomFieldSchemaArgs.builder()        
 *             .title(&#34;My Schema&#34;)
 *             .description(&#34;Fields used on incidents&#34;)
 *             .build());
 * 
 *         var firstFieldConfiguration = new CustomFieldSchemaFieldConfiguration(&#34;firstFieldConfiguration&#34;, CustomFieldSchemaFieldConfigurationArgs.builder()        
 *             .schema(mySchema.id())
 *             .field(csImpact.id())
 *             .required(true)
 *             .defaultValue(&#34;none&#34;)
 *             .defaultValueDatatype(&#34;string&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/customFieldSchemaFieldConfiguration:CustomFieldSchemaFieldConfiguration")
public class CustomFieldSchemaFieldConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The default value for the field.
     * 
     */
    @Export(name="defaultValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultValue;

    /**
     * @return The default value for the field.
     * 
     */
    public Output<Optional<String>> defaultValue() {
        return Codegen.optional(this.defaultValue);
    }
    /**
     * The datatype of the default value.
     * 
     */
    @Export(name="defaultValueDatatype", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultValueDatatype;

    /**
     * @return The datatype of the default value.
     * 
     */
    public Output<Optional<String>> defaultValueDatatype() {
        return Codegen.optional(this.defaultValueDatatype);
    }
    /**
     * Whether or not the default value is multi-valued.
     * 
     */
    @Export(name="defaultValueMultiValue", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> defaultValueMultiValue;

    /**
     * @return Whether or not the default value is multi-valued.
     * 
     */
    public Output<Optional<Boolean>> defaultValueMultiValue() {
        return Codegen.optional(this.defaultValueMultiValue);
    }
    /**
     * The ID of the field.
     * 
     */
    @Export(name="field", type=String.class, parameters={})
    private Output<String> field;

    /**
     * @return The ID of the field.
     * 
     */
    public Output<String> field() {
        return this.field;
    }
    /**
     * True if the field is required
     * 
     */
    @Export(name="required", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> required;

    /**
     * @return True if the field is required
     * 
     */
    public Output<Optional<Boolean>> required() {
        return Codegen.optional(this.required);
    }
    /**
     * The ID of the schema.
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return The ID of the schema.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomFieldSchemaFieldConfiguration(String name) {
        this(name, CustomFieldSchemaFieldConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomFieldSchemaFieldConfiguration(String name, CustomFieldSchemaFieldConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomFieldSchemaFieldConfiguration(String name, CustomFieldSchemaFieldConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/customFieldSchemaFieldConfiguration:CustomFieldSchemaFieldConfiguration", name, args == null ? CustomFieldSchemaFieldConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomFieldSchemaFieldConfiguration(String name, Output<String> id, @Nullable CustomFieldSchemaFieldConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/customFieldSchemaFieldConfiguration:CustomFieldSchemaFieldConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CustomFieldSchemaFieldConfiguration get(String name, Output<String> id, @Nullable CustomFieldSchemaFieldConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomFieldSchemaFieldConfiguration(name, id, state, options);
    }
}
