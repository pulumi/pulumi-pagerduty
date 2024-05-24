// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.AutomationActionsActionTeamAssociationArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.AutomationActionsActionTeamAssociationState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An Automation Actions [action association with a team](https://developer.pagerduty.com/api-reference/8f722dd91a4ba-associate-an-automation-action-with-a-team) configures the relation of a specific Action with a Team.
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
 * import com.pulumi.pagerduty.AutomationActionsAction;
 * import com.pulumi.pagerduty.AutomationActionsActionArgs;
 * import com.pulumi.pagerduty.inputs.AutomationActionsActionActionDataReferenceArgs;
 * import com.pulumi.pagerduty.AutomationActionsActionTeamAssociation;
 * import com.pulumi.pagerduty.AutomationActionsActionTeamAssociationArgs;
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
 *         var example = new Team("example", TeamArgs.builder()
 *             .name("Engineering")
 *             .description("All engineering")
 *             .build());
 * 
 *         var paActionExample = new AutomationActionsAction("paActionExample", AutomationActionsActionArgs.builder()
 *             .name("PA Action created via TF")
 *             .description("Description of the PA Action created via TF")
 *             .actionType("process_automation")
 *             .actionDataReference(AutomationActionsActionActionDataReferenceArgs.builder()
 *                 .processAutomationJobId("P123456")
 *                 .build())
 *             .build());
 * 
 *         var foo = new AutomationActionsActionTeamAssociation("foo", AutomationActionsActionTeamAssociationArgs.builder()
 *             .actionId(paActionExample.id())
 *             .teamId(example.id())
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
 * Action team association can be imported using the `action_id` and `team_id` separated by a colon, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation")
public class AutomationActionsActionTeamAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Id of the action.
     * 
     */
    @Export(name="actionId", refs={String.class}, tree="[0]")
    private Output<String> actionId;

    /**
     * @return Id of the action.
     * 
     */
    public Output<String> actionId() {
        return this.actionId;
    }
    /**
     * Id of the team associated to the action.
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output<String> teamId;

    /**
     * @return Id of the team associated to the action.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutomationActionsActionTeamAssociation(String name) {
        this(name, AutomationActionsActionTeamAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutomationActionsActionTeamAssociation(String name, AutomationActionsActionTeamAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutomationActionsActionTeamAssociation(String name, AutomationActionsActionTeamAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation", name, args == null ? AutomationActionsActionTeamAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutomationActionsActionTeamAssociation(String name, Output<String> id, @Nullable AutomationActionsActionTeamAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation", name, state, makeResourceOptions(options, id));
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
    public static AutomationActionsActionTeamAssociation get(String name, Output<String> id, @Nullable AutomationActionsActionTeamAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutomationActionsActionTeamAssociation(name, id, state, options);
    }
}
