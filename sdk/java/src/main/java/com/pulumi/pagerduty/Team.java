// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.TeamArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.TeamState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A [team](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIyMg-create-a-team) is a collection of users and escalation policies that represent a group of people within an organization.
 * 
 * The account must have the `teams` ability to use the following resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.TeamArgs;
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
 *         var parent = new Team("parent", TeamArgs.builder()        
 *             .name("Product Development")
 *             .description("Product and Engineering")
 *             .build());
 * 
 *         var example = new Team("example", TeamArgs.builder()        
 *             .name("Engineering")
 *             .description("All engineering")
 *             .parent(parent.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Teams can be imported using the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/team:Team main PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/team:Team")
public class Team extends com.pulumi.resources.CustomResource {
    @Export(name="defaultRole", refs={String.class}, tree="[0]")
    private Output<String> defaultRole;

    public Output<String> defaultRole() {
        return this.defaultRole;
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }
    /**
     * URL at which the entity is uniquely displayed in the Web app
     * 
     */
    @Export(name="htmlUrl", refs={String.class}, tree="[0]")
    private Output<String> htmlUrl;

    /**
     * @return URL at which the entity is uniquely displayed in the Web app
     * 
     */
    public Output<String> htmlUrl() {
        return this.htmlUrl;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="parent", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> parent;

    public Output<Optional<String>> parent() {
        return Codegen.optional(this.parent);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Team(String name) {
        this(name, TeamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Team(String name, @Nullable TeamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Team(String name, @Nullable TeamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/team:Team", name, args == null ? TeamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Team(String name, Output<String> id, @Nullable TeamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/team:Team", name, state, makeResourceOptions(options, id));
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
    public static Team get(String name, Output<String> id, @Nullable TeamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Team(name, id, state, options);
    }
}
