// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.AutomationActionsRunnerTeamAssociationArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.AutomationActionsRunnerTeamAssociationState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An Automation Actions [runner association with a team](https://developer.pagerduty.com/api-reference/f662de6271a6e-associate-a-runner-with-a-team) configures the relation of a specific Runner with a Team.
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
 * import com.pulumi.pagerduty.AutomationActionsRunner;
 * import com.pulumi.pagerduty.AutomationActionsRunnerArgs;
 * import com.pulumi.pagerduty.AutomationActionsRunnerTeamAssociation;
 * import com.pulumi.pagerduty.AutomationActionsRunnerTeamAssociationArgs;
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
 *         var teamEntEng = new Team("teamEntEng", TeamArgs.builder()
 *             .name("Enterprise Engineering")
 *             .description("Enterprise engineering")
 *             .build());
 * 
 *         var paRunbookRunner = new AutomationActionsRunner("paRunbookRunner", AutomationActionsRunnerArgs.builder()
 *             .name("Runner created via TF")
 *             .description("Description of the Runner created via TF")
 *             .runnerType("runbook")
 *             .runbookBaseUri("cat-cat")
 *             .runbookApiKey("cat-secret")
 *             .build());
 * 
 *         var paRunnerEntEngAssoc = new AutomationActionsRunnerTeamAssociation("paRunnerEntEngAssoc", AutomationActionsRunnerTeamAssociationArgs.builder()
 *             .runnerId(paRunbookRunner.id())
 *             .teamId(teamEntEng.id())
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
 * Runner team association can be imported using the `runner_id` and `team_id` separated by a colon, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation")
public class AutomationActionsRunnerTeamAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Id of the runner.
     * 
     */
    @Export(name="runnerId", refs={String.class}, tree="[0]")
    private Output<String> runnerId;

    /**
     * @return Id of the runner.
     * 
     */
    public Output<String> runnerId() {
        return this.runnerId;
    }
    /**
     * Id of the team associated with the runner.
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output<String> teamId;

    /**
     * @return Id of the team associated with the runner.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutomationActionsRunnerTeamAssociation(java.lang.String name) {
        this(name, AutomationActionsRunnerTeamAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutomationActionsRunnerTeamAssociation(java.lang.String name, AutomationActionsRunnerTeamAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutomationActionsRunnerTeamAssociation(java.lang.String name, AutomationActionsRunnerTeamAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AutomationActionsRunnerTeamAssociation(java.lang.String name, Output<java.lang.String> id, @Nullable AutomationActionsRunnerTeamAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation", name, state, makeResourceOptions(options, id), false);
    }

    private static AutomationActionsRunnerTeamAssociationArgs makeArgs(AutomationActionsRunnerTeamAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AutomationActionsRunnerTeamAssociationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static AutomationActionsRunnerTeamAssociation get(java.lang.String name, Output<java.lang.String> id, @Nullable AutomationActionsRunnerTeamAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutomationActionsRunnerTeamAssociation(name, id, state, options);
    }
}
