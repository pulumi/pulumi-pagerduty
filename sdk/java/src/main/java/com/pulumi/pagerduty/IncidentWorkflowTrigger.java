// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.IncidentWorkflowTriggerArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.IncidentWorkflowTriggerState;
import com.pulumi.pagerduty.outputs.IncidentWorkflowTriggerPermissions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An [Incident Workflow Trigger](https://support.pagerduty.com/docs/incident-workflows#triggers) defines when and if an [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) will be triggered.
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
 * import com.pulumi.pagerduty.IncidentWorkflow;
 * import com.pulumi.pagerduty.IncidentWorkflowArgs;
 * import com.pulumi.pagerduty.inputs.IncidentWorkflowStepArgs;
 * import com.pulumi.pagerduty.PagerdutyFunctions;
 * import com.pulumi.pagerduty.inputs.GetServiceArgs;
 * import com.pulumi.pagerduty.IncidentWorkflowTrigger;
 * import com.pulumi.pagerduty.IncidentWorkflowTriggerArgs;
 * import com.pulumi.pagerduty.inputs.GetTeamArgs;
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
 *         var myFirstWorkflow = new IncidentWorkflow("myFirstWorkflow", IncidentWorkflowArgs.builder()
 *             .name("Example Incident Workflow")
 *             .description("This Incident Workflow is an example")
 *             .steps(IncidentWorkflowStepArgs.builder()
 *                 .name("Send Status Update")
 *                 .action("pagerduty.com:incident-workflows:send-status-update:1")
 *                 .inputs(IncidentWorkflowStepInputArgs.builder()
 *                     .name("Message")
 *                     .value("Example status message sent on {{current_date}}")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         final var firstService = PagerdutyFunctions.getService(GetServiceArgs.builder()
 *             .name("My First Service")
 *             .build());
 * 
 *         var automaticTrigger = new IncidentWorkflowTrigger("automaticTrigger", IncidentWorkflowTriggerArgs.builder()
 *             .type("conditional")
 *             .workflow(myFirstWorkflow.id())
 *             .services(firstServicePagerdutyService.id())
 *             .condition("incident.priority matches 'P1'")
 *             .subscribedToAllServices(false)
 *             .build());
 * 
 *         final var devops = PagerdutyFunctions.getTeam(GetTeamArgs.builder()
 *             .name("devops")
 *             .build());
 * 
 *         var manualTrigger = new IncidentWorkflowTrigger("manualTrigger", IncidentWorkflowTriggerArgs.builder()
 *             .type("manual")
 *             .workflow(myFirstWorkflow.id())
 *             .services(firstServicePagerdutyService.id())
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
 * Incident workflows can be imported using the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger pagerduty_incident_workflow_trigger PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger")
public class IncidentWorkflowTrigger extends com.pulumi.resources.CustomResource {
    /**
     * A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     * 
     */
    @Export(name="condition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> condition;

    /**
     * @return A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     * 
     */
    public Output<Optional<String>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * Indicates who can start this Trigger. Applicable only to `manual`-type triggers.
     * 
     */
    @Export(name="permissions", refs={IncidentWorkflowTriggerPermissions.class}, tree="[0]")
    private Output<IncidentWorkflowTriggerPermissions> permissions;

    /**
     * @return Indicates who can start this Trigger. Applicable only to `manual`-type triggers.
     * 
     */
    public Output<IncidentWorkflowTriggerPermissions> permissions() {
        return this.permissions;
    }
    /**
     * A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
     * 
     */
    @Export(name="services", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> services;

    /**
     * @return A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
     * 
     */
    public Output<Optional<List<String>>> services() {
        return Codegen.optional(this.services);
    }
    /**
     * Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
     * 
     */
    @Export(name="subscribedToAllServices", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> subscribedToAllServices;

    /**
     * @return Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
     * 
     */
    public Output<Boolean> subscribedToAllServices() {
        return this.subscribedToAllServices;
    }
    /**
     * [Updating causes resource replacement] May be either `manual` or `conditional`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return [Updating causes resource replacement] May be either `manual` or `conditional`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The workflow ID for the workflow to trigger.
     * 
     */
    @Export(name="workflow", refs={String.class}, tree="[0]")
    private Output<String> workflow;

    /**
     * @return The workflow ID for the workflow to trigger.
     * 
     */
    public Output<String> workflow() {
        return this.workflow;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IncidentWorkflowTrigger(String name) {
        this(name, IncidentWorkflowTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IncidentWorkflowTrigger(String name, IncidentWorkflowTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IncidentWorkflowTrigger(String name, IncidentWorkflowTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger", name, args == null ? IncidentWorkflowTriggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IncidentWorkflowTrigger(String name, Output<String> id, @Nullable IncidentWorkflowTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger", name, state, makeResourceOptions(options, id));
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
    public static IncidentWorkflowTrigger get(String name, Output<String> id, @Nullable IncidentWorkflowTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IncidentWorkflowTrigger(name, id, state, options);
    }
}
