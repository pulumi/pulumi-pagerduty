// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.AddonArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.AddonState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * With [add-ons](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwNQ-install-an-add-on), third-party developers can write their own add-ons to PagerDuty&#39;s UI. Given a configuration containing a src parameter, that URL will be embedded in an iframe on a page that&#39;s available to users from a drop-down menu.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.Addon;
 * import com.pulumi.pagerduty.AddonArgs;
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
 *         var example = new Addon(&#34;example&#34;, AddonArgs.builder()        
 *             .src(&#34;https://intranet.example.com/status&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Add-ons can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/addon:Addon example P3DH5M6
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/addon:Addon")
public class Addon extends com.pulumi.resources.CustomResource {
    /**
     * The name of the add-on.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the add-on.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
     * 
     */
    @Export(name="src", refs={String.class}, tree="[0]")
    private Output<String> src;

    /**
     * @return The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
     * 
     */
    public Output<String> src() {
        return this.src;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Addon(String name) {
        this(name, AddonArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Addon(String name, AddonArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Addon(String name, AddonArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/addon:Addon", name, args == null ? AddonArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Addon(String name, Output<String> id, @Nullable AddonState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/addon:Addon", name, state, makeResourceOptions(options, id));
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
    public static Addon get(String name, Output<String> id, @Nullable AddonState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Addon(name, id, state, options);
    }
}
