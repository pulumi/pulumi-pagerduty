// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.IncidentCustomFieldOptionArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.IncidentCustomFieldOptionState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A Incident Custom Field Option is a specific value that can be used for an [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents) that only allow values from a set of fixed options,
 * i.e. has the `field_type` of `single_value_fixed` or `multi_value_fixed`.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.IncidentCustomField;
 * import com.pulumi.pagerduty.IncidentCustomFieldArgs;
 * import com.pulumi.pagerduty.IncidentCustomFieldOption;
 * import com.pulumi.pagerduty.IncidentCustomFieldOptionArgs;
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
 *         var sreEnvironment = new IncidentCustomField(&#34;sreEnvironment&#34;, IncidentCustomFieldArgs.builder()        
 *             .name(&#34;environment&#34;)
 *             .displayName(&#34;Environment&#34;)
 *             .dataType(&#34;string&#34;)
 *             .fieldType(&#34;single_value_fixed&#34;)
 *             .build());
 * 
 *         var devEnvironment = new IncidentCustomFieldOption(&#34;devEnvironment&#34;, IncidentCustomFieldOptionArgs.builder()        
 *             .field(sreEnvironment.id())
 *             .dataType(&#34;string&#34;)
 *             .value(&#34;dev&#34;)
 *             .build());
 * 
 *         var stageEnvironment = new IncidentCustomFieldOption(&#34;stageEnvironment&#34;, IncidentCustomFieldOptionArgs.builder()        
 *             .field(sreEnvironment.id())
 *             .dataType(&#34;string&#34;)
 *             .value(&#34;stage&#34;)
 *             .build());
 * 
 *         var prodEnvironment = new IncidentCustomFieldOption(&#34;prodEnvironment&#34;, IncidentCustomFieldOptionArgs.builder()        
 *             .field(sreEnvironment.id())
 *             .dataType(&#34;string&#34;)
 *             .value(&#34;prod&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="pagerduty:index/incidentCustomFieldOption:IncidentCustomFieldOption")
public class IncidentCustomFieldOption extends com.pulumi.resources.CustomResource {
    /**
     * The datatype of the field option. Only `string` is allowed here at present.
     * 
     */
    @Export(name="dataType", refs={String.class}, tree="[0]")
    private Output<String> dataType;

    /**
     * @return The datatype of the field option. Only `string` is allowed here at present.
     * 
     */
    public Output<String> dataType() {
        return this.dataType;
    }
    /**
     * The ID of the field.
     * 
     */
    @Export(name="field", refs={String.class}, tree="[0]")
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
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return The allowed value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IncidentCustomFieldOption(String name) {
        this(name, IncidentCustomFieldOptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IncidentCustomFieldOption(String name, IncidentCustomFieldOptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IncidentCustomFieldOption(String name, IncidentCustomFieldOptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/incidentCustomFieldOption:IncidentCustomFieldOption", name, args == null ? IncidentCustomFieldOptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IncidentCustomFieldOption(String name, Output<String> id, @Nullable IncidentCustomFieldOptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/incidentCustomFieldOption:IncidentCustomFieldOption", name, state, makeResourceOptions(options, id));
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
    public static IncidentCustomFieldOption get(String name, Output<String> id, @Nullable IncidentCustomFieldOptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IncidentCustomFieldOption(name, id, state, options);
    }
}
