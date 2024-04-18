// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.IncidentWorkflowArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.IncidentWorkflowState;
import com.pulumi.pagerduty.outputs.IncidentWorkflowStep;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) is a series of steps which can be executed on an incident.
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
 * import com.pulumi.pagerduty.IncidentWorkflow;
 * import com.pulumi.pagerduty.IncidentWorkflowArgs;
 * import com.pulumi.pagerduty.inputs.IncidentWorkflowStepArgs;
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
 *         var myFirstWorkflow = new IncidentWorkflow(&#34;myFirstWorkflow&#34;, IncidentWorkflowArgs.builder()        
 *             .name(&#34;Example Incident Workflow&#34;)
 *             .description(&#34;This Incident Workflow is an example&#34;)
 *             .steps(IncidentWorkflowStepArgs.builder()
 *                 .name(&#34;Send Status Update&#34;)
 *                 .action(&#34;pagerduty.com:incident-workflows:send-status-update:1&#34;)
 *                 .inputs(IncidentWorkflowStepInputArgs.builder()
 *                     .name(&#34;Message&#34;)
 *                     .value(&#34;Example status message sent on {{current_date}}&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Incident workflows can be imported using the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/incidentWorkflow:IncidentWorkflow major_incident_workflow PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/incidentWorkflow:IncidentWorkflow")
public class IncidentWorkflow extends com.pulumi.resources.CustomResource {
    /**
     * The description of the workflow.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the workflow.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the workflow.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the workflow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The steps in the workflow.
     * 
     */
    @Export(name="steps", refs={List.class,IncidentWorkflowStep.class}, tree="[0,1]")
    private Output<List<IncidentWorkflowStep>> steps;

    /**
     * @return The steps in the workflow.
     * 
     */
    public Output<List<IncidentWorkflowStep>> steps() {
        return this.steps;
    }
    /**
     * A team ID. If specified then workflow edit permissions will be scoped to members of this team.
     * 
     */
    @Export(name="team", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> team;

    /**
     * @return A team ID. If specified then workflow edit permissions will be scoped to members of this team.
     * 
     */
    public Output<Optional<String>> team() {
        return Codegen.optional(this.team);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IncidentWorkflow(String name) {
        this(name, IncidentWorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IncidentWorkflow(String name, @Nullable IncidentWorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IncidentWorkflow(String name, @Nullable IncidentWorkflowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/incidentWorkflow:IncidentWorkflow", name, args == null ? IncidentWorkflowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IncidentWorkflow(String name, Output<String> id, @Nullable IncidentWorkflowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/incidentWorkflow:IncidentWorkflow", name, state, makeResourceOptions(options, id));
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
    public static IncidentWorkflow get(String name, Output<String> id, @Nullable IncidentWorkflowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IncidentWorkflow(name, id, state, options);
    }
}
