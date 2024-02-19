// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.AutomationActionsRunnerArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.AutomationActionsRunnerState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Automation Actions [runner](https://developer.pagerduty.com/api-reference/d78999fb7e863-create-an-automation-action-runner) is the method for how actions are executed. This can be done locally using an installed runner agent or as a connection to a PD Runbook Automation instance.
 * 
 * &gt; Only Runbook Automation (runbook) runners can be created.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.AutomationActionsRunner;
 * import com.pulumi.pagerduty.AutomationActionsRunnerArgs;
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
 *         final var config = ctx.config();
 *         final var rUNBOOKAPIKEY = config.get(&#34;rUNBOOKAPIKEY&#34;);
 *         var example = new AutomationActionsRunner(&#34;example&#34;, AutomationActionsRunnerArgs.builder()        
 *             .description(&#34;Description of the Runner created via TF&#34;)
 *             .runnerType(&#34;runbook&#34;)
 *             .runbookBaseUri(&#34;rdcat.stg&#34;)
 *             .runbookApiKey(rUNBOOKAPIKEY)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * -&gt; In the example below the `runbook_api_key` attribute has been omitted to avoid resource replacement after the import.
 * 
 *  Runners can be imported using the `id`, e.g.
 * 
 *  resource &#34;pagerduty_automation_actions_runner&#34; &#34;example&#34; {
 * 
 *  name = &#34;Runner created via TF&#34;
 * 
 *  description = &#34;Description of the Runner created via TF&#34;
 * 
 *  runner_type = &#34;runbook&#34;
 * 
 *  runbook_base_uri = &#34;rdcat.stg&#34;
 * 
 *  }
 * 
 * ```sh
 * $ pulumi import pagerduty:index/automationActionsRunner:AutomationActionsRunner example 01DER7CUUBF7TH4116K0M4WKPU
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/automationActionsRunner:AutomationActionsRunner")
public class AutomationActionsRunner extends com.pulumi.resources.CustomResource {
    /**
     * The time runner was created. Represented as an ISO 8601 timestamp.
     * 
     */
    @Export(name="creationTime", refs={String.class}, tree="[0]")
    private Output<String> creationTime;

    /**
     * @return The time runner was created. Represented as an ISO 8601 timestamp.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The description of the runner. Max length is 1024 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the runner. Max length is 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     * 
     */
    @Export(name="lastSeen", refs={String.class}, tree="[0]")
    private Output<String> lastSeen;

    /**
     * @return (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     * 
     */
    public Output<String> lastSeen() {
        return this.lastSeen;
    }
    /**
     * The name of the runner. Max length is 255 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the runner. Max length is 255 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique User API Token created in Runbook Automation.
     * 
     */
    @Export(name="runbookApiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runbookApiKey;

    /**
     * @return The unique User API Token created in Runbook Automation.
     * 
     */
    public Output<Optional<String>> runbookApiKey() {
        return Codegen.optional(this.runbookApiKey);
    }
    /**
     * The subdomain for your Runbook Automation Instance.
     * 
     */
    @Export(name="runbookBaseUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runbookBaseUri;

    /**
     * @return The subdomain for your Runbook Automation Instance.
     * 
     */
    public Output<Optional<String>> runbookBaseUri() {
        return Codegen.optional(this.runbookBaseUri);
    }
    /**
     * The type of runner. The only allowed values is `runbook`.
     * 
     */
    @Export(name="runnerType", refs={String.class}, tree="[0]")
    private Output<String> runnerType;

    /**
     * @return The type of runner. The only allowed values is `runbook`.
     * 
     */
    public Output<String> runnerType() {
        return this.runnerType;
    }
    /**
     * The type of object. The value returned will be `runner`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of object. The value returned will be `runner`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutomationActionsRunner(String name) {
        this(name, AutomationActionsRunnerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutomationActionsRunner(String name, AutomationActionsRunnerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutomationActionsRunner(String name, AutomationActionsRunnerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsRunner:AutomationActionsRunner", name, args == null ? AutomationActionsRunnerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutomationActionsRunner(String name, Output<String> id, @Nullable AutomationActionsRunnerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsRunner:AutomationActionsRunner", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "runbookApiKey"
            ))
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
    public static AutomationActionsRunner get(String name, Output<String> id, @Nullable AutomationActionsRunnerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutomationActionsRunner(name, id, state, options);
    }
}
