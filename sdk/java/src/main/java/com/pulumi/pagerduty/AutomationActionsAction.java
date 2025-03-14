// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.AutomationActionsActionArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.AutomationActionsActionState;
import com.pulumi.pagerduty.outputs.AutomationActionsActionActionDataReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Automation Actions [action](https://developer.pagerduty.com/api-reference/d64584a4371d3-create-an-automation-action) invokes jobs and workflows that are staged in Runbook Automation or Process Automation. It may also execute a command line script run by a Process Automation runner installed in your infrastructure.
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
 * import com.pulumi.pagerduty.AutomationActionsAction;
 * import com.pulumi.pagerduty.AutomationActionsActionArgs;
 * import com.pulumi.pagerduty.inputs.AutomationActionsActionActionDataReferenceArgs;
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
 *         var paActionExample = new AutomationActionsAction("paActionExample", AutomationActionsActionArgs.builder()
 *             .name("PA Action created via TF")
 *             .description("Description of the PA Action created via TF")
 *             .actionType("process_automation")
 *             .actionDataReference(AutomationActionsActionActionDataReferenceArgs.builder()
 *                 .processAutomationJobId("P123456")
 *                 .build())
 *             .build());
 * 
 *         var scriptActionExample = new AutomationActionsAction("scriptActionExample", AutomationActionsActionArgs.builder()
 *             .name("Script Action created via TF")
 *             .description("Description of the Script Action created via TF")
 *             .actionType("script")
 *             .actionDataReference(AutomationActionsActionActionDataReferenceArgs.builder()
 *                 .script("print(\"Hello from a Python script!\")")
 *                 .invocationCommand("/usr/local/bin/python3")
 *                 .build())
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
 * Actions can be imported using the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/automationActionsAction:AutomationActionsAction example 01DER7CUUBF7TH4116K0M4WKPU
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/automationActionsAction:AutomationActionsAction")
public class AutomationActionsAction extends com.pulumi.resources.CustomResource {
    /**
     * The category of the action. The only allowed values are `diagnostic` and `remediation`.
     * 
     */
    @Export(name="actionClassification", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> actionClassification;

    /**
     * @return The category of the action. The only allowed values are `diagnostic` and `remediation`.
     * 
     */
    public Output<Optional<String>> actionClassification() {
        return Codegen.optional(this.actionClassification);
    }
    /**
     * Action Data block. Action Data is documented below.
     * 
     */
    @Export(name="actionDataReference", refs={AutomationActionsActionActionDataReference.class}, tree="[0]")
    private Output<AutomationActionsActionActionDataReference> actionDataReference;

    /**
     * @return Action Data block. Action Data is documented below.
     * 
     */
    public Output<AutomationActionsActionActionDataReference> actionDataReference() {
        return this.actionDataReference;
    }
    /**
     * The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
     * 
     */
    @Export(name="actionType", refs={String.class}, tree="[0]")
    private Output<String> actionType;

    /**
     * @return The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }
    @Export(name="allowInvocationFromEventOrchestration", refs={String.class}, tree="[0]")
    private Output<String> allowInvocationFromEventOrchestration;

    public Output<String> allowInvocationFromEventOrchestration() {
        return this.allowInvocationFromEventOrchestration;
    }
    @Export(name="allowInvocationManually", refs={String.class}, tree="[0]")
    private Output<String> allowInvocationManually;

    public Output<String> allowInvocationManually() {
        return this.allowInvocationManually;
    }
    /**
     * The time action was created. Represented as an ISO 8601 timestamp.
     * 
     */
    @Export(name="creationTime", refs={String.class}, tree="[0]")
    private Output<String> creationTime;

    /**
     * @return The time action was created. Represented as an ISO 8601 timestamp.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The description of the action. Max length is 1024 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the action. Max length is 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="mapToAllServices", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> mapToAllServices;

    public Output<Boolean> mapToAllServices() {
        return this.mapToAllServices;
    }
    /**
     * (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     * 
     */
    @Export(name="modifyTime", refs={String.class}, tree="[0]")
    private Output<String> modifyTime;

    /**
     * @return (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     * 
     */
    public Output<String> modifyTime() {
        return this.modifyTime;
    }
    /**
     * The name of the action. Max length is 255 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the action. Max length is 255 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="onlyInvocableOnUnresolvedIncidents", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> onlyInvocableOnUnresolvedIncidents;

    public Output<Boolean> onlyInvocableOnUnresolvedIncidents() {
        return this.onlyInvocableOnUnresolvedIncidents;
    }
    /**
     * The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
     * 
     */
    @Export(name="runnerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runnerId;

    /**
     * @return The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
     * 
     */
    public Output<Optional<String>> runnerId() {
        return Codegen.optional(this.runnerId);
    }
    /**
     * (Optional) The type of the runner associated with the action.
     * 
     */
    @Export(name="runnerType", refs={String.class}, tree="[0]")
    private Output<String> runnerType;

    /**
     * @return (Optional) The type of the runner associated with the action.
     * 
     */
    public Output<String> runnerType() {
        return this.runnerType;
    }
    /**
     * The type of object. The value returned will be `action`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of object. The value returned will be `action`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutomationActionsAction(java.lang.String name) {
        this(name, AutomationActionsActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutomationActionsAction(java.lang.String name, AutomationActionsActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutomationActionsAction(java.lang.String name, AutomationActionsActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsAction:AutomationActionsAction", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AutomationActionsAction(java.lang.String name, Output<java.lang.String> id, @Nullable AutomationActionsActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsAction:AutomationActionsAction", name, state, makeResourceOptions(options, id), false);
    }

    private static AutomationActionsActionArgs makeArgs(AutomationActionsActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AutomationActionsActionArgs.Empty : args;
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
    public static AutomationActionsAction get(java.lang.String name, Output<java.lang.String> id, @Nullable AutomationActionsActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutomationActionsAction(name, id, state, options);
    }
}
