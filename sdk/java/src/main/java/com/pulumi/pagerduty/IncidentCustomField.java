// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.IncidentCustomFieldArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.IncidentCustomFieldState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents) defines a field which can be set on incidents in the target account.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.IncidentCustomField;
 * import com.pulumi.pagerduty.IncidentCustomFieldArgs;
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
 *         var csImpact = new IncidentCustomField(&#34;csImpact&#34;, IncidentCustomFieldArgs.builder()        
 *             .dataType(&#34;string&#34;)
 *             .fieldType(&#34;single_value&#34;)
 *             .build());
 * 
 *         var sreEnvironment = new IncidentCustomField(&#34;sreEnvironment&#34;, IncidentCustomFieldArgs.builder()        
 *             .dataType(&#34;string&#34;)
 *             .fieldType(&#34;single_value_fixed&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Fields can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/incidentCustomField:IncidentCustomField sre_environment PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/incidentCustomField:IncidentCustomField")
public class IncidentCustomField extends com.pulumi.resources.CustomResource {
    /**
     * The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    @Export(name="dataType", refs={String.class}, tree="[0]")
    private Output<String> dataType;

    /**
     * @return The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
     * 
     */
    public Output<String> dataType() {
        return this.dataType;
    }
    @Export(name="defaultValue", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultValue;

    public Output<Optional<String>> defaultValue() {
        return Codegen.optional(this.defaultValue);
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
     * 
     */
    @Export(name="fieldType", refs={String.class}, tree="[0]")
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
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the field.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IncidentCustomField(String name) {
        this(name, IncidentCustomFieldArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IncidentCustomField(String name, IncidentCustomFieldArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IncidentCustomField(String name, IncidentCustomFieldArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/incidentCustomField:IncidentCustomField", name, args == null ? IncidentCustomFieldArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IncidentCustomField(String name, Output<String> id, @Nullable IncidentCustomFieldState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/incidentCustomField:IncidentCustomField", name, state, makeResourceOptions(options, id));
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
    public static IncidentCustomField get(String name, Output<String> id, @Nullable IncidentCustomFieldState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IncidentCustomField(name, id, state, options);
    }
}
