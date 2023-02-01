// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.PagerdutyIncidentWorkflowTriggerArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.PagerdutyIncidentWorkflowTriggerState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An [Incident Workflow Trigger](https://support.pagerduty.com/docs/incident-workflows#triggers) defines when and if an [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) will be triggered.
 * 
 * &gt; The Incident Workflows feature is currently available in Early Access.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.PagerdutyIncidentWorkflow;
 * import com.pulumi.pagerduty.PagerdutyIncidentWorkflowArgs;
 * import com.pulumi.pagerduty.inputs.PagerdutyIncidentWorkflowStepArgs;
 * import com.pulumi.pagerduty.PagerdutyFunctions;
 * import com.pulumi.pagerduty.inputs.GetServiceArgs;
 * import com.pulumi.pagerduty.PagerdutyIncidentWorkflowTrigger;
 * import com.pulumi.pagerduty.PagerdutyIncidentWorkflowTriggerArgs;
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
 *         var myFirstWorkflow = new PagerdutyIncidentWorkflow(&#34;myFirstWorkflow&#34;, PagerdutyIncidentWorkflowArgs.builder()        
 *             .description(&#34;This Incident Workflow is an example&#34;)
 *             .steps(PagerdutyIncidentWorkflowStepArgs.builder()
 *                 .name(&#34;Send Status Update&#34;)
 *                 .action(&#34;pagerduty.com:incident-workflows:send-status-update:1&#34;)
 *                 .inputs(PagerdutyIncidentWorkflowStepInputArgs.builder()
 *                     .name(&#34;Message&#34;)
 *                     .value(&#34;Example status message sent on {{current_date}}&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         final var firstService = PagerdutyFunctions.getService(GetServiceArgs.builder()
 *             .name(&#34;My First Service&#34;)
 *             .build());
 * 
 *         var automaticTrigger = new PagerdutyIncidentWorkflowTrigger(&#34;automaticTrigger&#34;, PagerdutyIncidentWorkflowTriggerArgs.builder()        
 *             .type(&#34;conditional&#34;)
 *             .workflow(myFirstWorkflow.id())
 *             .services(pagerduty_service.first_service().id())
 *             .condition(&#34;incident.priority matches &#39;P1&#39;&#34;)
 *             .subscribedToAllServices(false)
 *             .build());
 * 
 *         final var devops = PagerdutyFunctions.getTeam(GetTeamArgs.builder()
 *             .name(&#34;devops&#34;)
 *             .build());
 * 
 *         var manualTrigger = new PagerdutyIncidentWorkflowTrigger(&#34;manualTrigger&#34;, PagerdutyIncidentWorkflowTriggerArgs.builder()        
 *             .type(&#34;manual&#34;)
 *             .workflow(myFirstWorkflow.id())
 *             .services(pagerduty_service.first_service().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Incident workflows can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/pagerdutyIncidentWorkflowTrigger:PagerdutyIncidentWorkflowTrigger pagerduty_incident_workflow_trigger PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/pagerdutyIncidentWorkflowTrigger:PagerdutyIncidentWorkflowTrigger")
public class PagerdutyIncidentWorkflowTrigger extends com.pulumi.resources.CustomResource {
    /**
     * A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     * 
     */
    @Export(name="condition", type=String.class, parameters={})
    private Output</* @Nullable */ String> condition;

    /**
     * @return A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     * 
     */
    public Output<Optional<String>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
     * 
     */
    @Export(name="services", type=List.class, parameters={String.class})
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
    @Export(name="subscribedToAllServices", type=Boolean.class, parameters={})
    private Output<Boolean> subscribedToAllServices;

    /**
     * @return Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
     * 
     */
    public Output<Boolean> subscribedToAllServices() {
        return this.subscribedToAllServices;
    }
    /**
     * May be either `manual` or `conditional`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return May be either `manual` or `conditional`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The workflow ID for the workflow to trigger.
     * 
     */
    @Export(name="workflow", type=String.class, parameters={})
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
    public PagerdutyIncidentWorkflowTrigger(String name) {
        this(name, PagerdutyIncidentWorkflowTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PagerdutyIncidentWorkflowTrigger(String name, PagerdutyIncidentWorkflowTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PagerdutyIncidentWorkflowTrigger(String name, PagerdutyIncidentWorkflowTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/pagerdutyIncidentWorkflowTrigger:PagerdutyIncidentWorkflowTrigger", name, args == null ? PagerdutyIncidentWorkflowTriggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PagerdutyIncidentWorkflowTrigger(String name, Output<String> id, @Nullable PagerdutyIncidentWorkflowTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/pagerdutyIncidentWorkflowTrigger:PagerdutyIncidentWorkflowTrigger", name, state, makeResourceOptions(options, id));
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
    public static PagerdutyIncidentWorkflowTrigger get(String name, Output<String> id, @Nullable PagerdutyIncidentWorkflowTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PagerdutyIncidentWorkflowTrigger(name, id, state, options);
    }
}
