// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.TagAssignmentArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.TagAssignmentState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwMA-assign-tags) is applied to Escalation Policies, Teams or Users and can be used to filter them.
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
 * import com.pulumi.pagerduty.Tag;
 * import com.pulumi.pagerduty.TagArgs;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.TeamArgs;
 * import com.pulumi.pagerduty.TagAssignment;
 * import com.pulumi.pagerduty.TagAssignmentArgs;
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
 *         var example = new Tag("example", TagArgs.builder()
 *             .label("API")
 *             .build());
 * 
 *         var engteam = new Team("engteam", TeamArgs.builder()
 *             .name("Engineering")
 *             .build());
 * 
 *         var exampleTagAssignment = new TagAssignment("exampleTagAssignment", TagAssignmentArgs.builder()
 *             .tagId(example.id())
 *             .entityType("teams")
 *             .entityId(engteam.id())
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
 * Tag assignments can be imported using the `id` which is constructed by taking the `entity` Type, `entity` ID and the `tag` ID separated by a dot, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/tagAssignment:TagAssignment main users.P7HHMVK.PYC7IQQ
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/tagAssignment:TagAssignment")
public class TagAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the entity.
     * 
     */
    @Export(name="entityId", refs={String.class}, tree="[0]")
    private Output<String> entityId;

    /**
     * @return The ID of the entity.
     * 
     */
    public Output<String> entityId() {
        return this.entityId;
    }
    /**
     * Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
     * 
     */
    @Export(name="entityType", refs={String.class}, tree="[0]")
    private Output<String> entityType;

    /**
     * @return Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
     * 
     */
    public Output<String> entityType() {
        return this.entityType;
    }
    /**
     * The ID of the tag.
     * 
     */
    @Export(name="tagId", refs={String.class}, tree="[0]")
    private Output<String> tagId;

    /**
     * @return The ID of the tag.
     * 
     */
    public Output<String> tagId() {
        return this.tagId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagAssignment(String name) {
        this(name, TagAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagAssignment(String name, TagAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagAssignment(String name, TagAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/tagAssignment:TagAssignment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private TagAssignment(String name, Output<String> id, @Nullable TagAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/tagAssignment:TagAssignment", name, state, makeResourceOptions(options, id));
    }

    private static TagAssignmentArgs makeArgs(TagAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TagAssignmentArgs.Empty : args;
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
    public static TagAssignment get(String name, Output<String> id, @Nullable TagAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TagAssignment(name, id, state, options);
    }
}
