// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.TeamMembershipArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.TeamMembershipState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.TeamArgs;
 * import com.pulumi.pagerduty.TeamMembership;
 * import com.pulumi.pagerduty.TeamMembershipArgs;
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
 *         var foo = new User("foo", UserArgs.builder()
 *             .name("foo")
 *             .email("foo{@literal @}bar.com")
 *             .build());
 * 
 *         var fooTeam = new Team("fooTeam", TeamArgs.builder()
 *             .name("foo")
 *             .description("foo")
 *             .build());
 * 
 *         var fooTeamMembership = new TeamMembership("fooTeamMembership", TeamMembershipArgs.builder()
 *             .userId(foo.id())
 *             .teamId(fooTeam.id())
 *             .role("manager")
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
 * Team memberships can be imported using the `user_id` and `team_id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/teamMembership:TeamMembership main PLBP09X:PLB09Z
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/teamMembership:TeamMembership")
public class TeamMembership extends com.pulumi.resources.CustomResource {
    /**
     * The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
     * These roles match up to user roles in the following ways:
     * * User role of `user` is a Team role of `manager`
     * * User role of `limited_user` is a Team role of `responder`
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> role;

    /**
     * @return The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.\
     * These roles match up to user roles in the following ways:
     * * User role of `user` is a Team role of `manager`
     * * User role of `limited_user` is a Team role of `responder`
     * 
     */
    public Output<Optional<String>> role() {
        return Codegen.optional(this.role);
    }
    /**
     * The ID of the team in which the user will belong.
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output<String> teamId;

    /**
     * @return The ID of the team in which the user will belong.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }
    /**
     * The ID of the user to add to the team.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The ID of the user to add to the team.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamMembership(String name) {
        this(name, TeamMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamMembership(String name, TeamMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamMembership(String name, TeamMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/teamMembership:TeamMembership", name, args == null ? TeamMembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TeamMembership(String name, Output<String> id, @Nullable TeamMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/teamMembership:TeamMembership", name, state, makeResourceOptions(options, id));
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
    public static TeamMembership get(String name, Output<String> id, @Nullable TeamMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamMembership(name, id, state, options);
    }
}
