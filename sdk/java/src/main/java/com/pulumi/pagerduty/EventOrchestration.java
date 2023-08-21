// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.EventOrchestrationArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.EventOrchestrationState;
import com.pulumi.pagerduty.outputs.EventOrchestrationIntegration;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * [Event Orchestrations](https://support.pagerduty.com/docs/event-orchestration) allow you define a set of Event Rules, so that when you ingest events using the Orchestration&#39;s Routing Key your events will be routed to the correct Global and/or Service Orchestration, based on the event&#39;s content.
 * 
 * ## Example of configuring an Event Orchestration
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.EventOrchestration;
 * import com.pulumi.pagerduty.EventOrchestrationArgs;
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
 *         var engineering = new Team(&#34;engineering&#34;);
 * 
 *         var myMonitor = new EventOrchestration(&#34;myMonitor&#34;, EventOrchestrationArgs.builder()        
 *             .description(&#34;Send events to a pair of services&#34;)
 *             .team(engineering.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * EventOrchestrations can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/eventOrchestration:EventOrchestration main 19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/eventOrchestration:EventOrchestration")
public class EventOrchestration extends com.pulumi.resources.CustomResource {
    /**
     * A human-friendly description of the Event Orchestration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-friendly description of the Event Orchestration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An integration for the Event Orchestration.
     * 
     */
    @Export(name="integrations", refs={List.class,EventOrchestrationIntegration.class}, tree="[0,1]")
    private Output<List<EventOrchestrationIntegration>> integrations;

    /**
     * @return An integration for the Event Orchestration.
     * 
     */
    public Output<List<EventOrchestrationIntegration>> integrations() {
        return this.integrations;
    }
    /**
     * Name of the Event Orchestration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Event Orchestration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="routes", refs={Integer.class}, tree="[0]")
    private Output<Integer> routes;

    public Output<Integer> routes() {
        return this.routes;
    }
    /**
     * ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
     * 
     */
    @Export(name="team", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> team;

    /**
     * @return ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
     * 
     */
    public Output<Optional<String>> team() {
        return Codegen.optional(this.team);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventOrchestration(String name) {
        this(name, EventOrchestrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventOrchestration(String name, @Nullable EventOrchestrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventOrchestration(String name, @Nullable EventOrchestrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventOrchestration:EventOrchestration", name, args == null ? EventOrchestrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventOrchestration(String name, Output<String> id, @Nullable EventOrchestrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventOrchestration:EventOrchestration", name, state, makeResourceOptions(options, id));
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
    public static EventOrchestration get(String name, Output<String> id, @Nullable EventOrchestrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventOrchestration(name, id, state, options);
    }
}
