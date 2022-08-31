// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.TagArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.TagState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIxOA-create-a-tag) is applied to Escalation Policies, Teams or Users and can be used to filter them.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.Tag;
 * import com.pulumi.pagerduty.TagArgs;
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
 *         var example = new Tag(&#34;example&#34;, TagArgs.builder()        
 *             .label(&#34;Product&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Tags can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/tag:Tag main PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/tag:Tag")
public class Tag extends com.pulumi.resources.CustomResource {
    /**
     * URL at which the entity is uniquely displayed in the Web app.
     * 
     */
    @Export(name="htmlUrl", type=String.class, parameters={})
    private Output<String> htmlUrl;

    /**
     * @return URL at which the entity is uniquely displayed in the Web app.
     * 
     */
    public Output<String> htmlUrl() {
        return this.htmlUrl;
    }
    /**
     * The label of the tag.
     * 
     */
    @Export(name="label", type=String.class, parameters={})
    private Output<String> label;

    /**
     * @return The label of the tag.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    @Export(name="summary", type=String.class, parameters={})
    private Output<String> summary;

    public Output<String> summary() {
        return this.summary;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(String name, TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(String name, TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/tag:Tag", name, args == null ? TagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tag(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/tag:Tag", name, state, makeResourceOptions(options, id));
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
    public static Tag get(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}