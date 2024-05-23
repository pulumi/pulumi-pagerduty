// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.EventOrchestrationUnroutedArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.EventOrchestrationUnroutedState;
import com.pulumi.pagerduty.outputs.EventOrchestrationUnroutedCatchAll;
import com.pulumi.pagerduty.outputs.EventOrchestrationUnroutedSet;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Unrouted Orchestration allows users to create a set of Event Rules that will be evaluated against all events that don&#39;t match any rules in the Orchestration&#39;s Router.
 * 
 * The Unrouted Orchestration evaluates events sent to it against each of its rules, beginning with the rules in the &#34;start&#34; set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.
 * 
 * ## Example of configuring Unrouted Rules for an Orchestration
 * 
 * In this example of an Unrouted Orchestration, the rule matches only if the condition is matched.
 * Alerts created for events that do not match the rule will have severity level set to `info` as defined in `catch_all` block.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.EventOrchestrationUnrouted;
 * import com.pulumi.pagerduty.EventOrchestrationUnroutedArgs;
 * import com.pulumi.pagerduty.inputs.EventOrchestrationUnroutedSetArgs;
 * import com.pulumi.pagerduty.inputs.EventOrchestrationUnroutedCatchAllArgs;
 * import com.pulumi.pagerduty.inputs.EventOrchestrationUnroutedCatchAllActionsArgs;
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
 *         var unrouted = new EventOrchestrationUnrouted("unrouted", EventOrchestrationUnroutedArgs.builder()
 *             .eventOrchestration(myMonitor.id())
 *             .sets(EventOrchestrationUnroutedSetArgs.builder()
 *                 .id("start")
 *                 .rules(EventOrchestrationUnroutedSetRuleArgs.builder()
 *                     .label("Update the summary of un-matched Critical alerts so they're easier to spot")
 *                     .conditions(EventOrchestrationUnroutedSetRuleConditionArgs.builder()
 *                         .expression("event.severity matches 'critical'")
 *                         .build())
 *                     .actions(EventOrchestrationUnroutedSetRuleActionsArgs.builder()
 *                         .severity("critical")
 *                         .extractions(EventOrchestrationUnroutedSetRuleActionsExtractionArgs.builder()
 *                             .target("event.summary")
 *                             .template("[Critical Unrouted] {{event.summary}}")
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .catchAll(EventOrchestrationUnroutedCatchAllArgs.builder()
 *                 .actions(EventOrchestrationUnroutedCatchAllActionsArgs.builder()
 *                     .severity("info")
 *                     .build())
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
 * Unrouted Orchestration can be imported using the `id` of the Event Orchestration, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted unrouted 1b49abe7-26db-4439-a715-c6d883acfb3e
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted")
public class EventOrchestrationUnrouted extends com.pulumi.resources.CustomResource {
    /**
     * the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     * 
     */
    @Export(name="catchAll", refs={EventOrchestrationUnroutedCatchAll.class}, tree="[0]")
    private Output<EventOrchestrationUnroutedCatchAll> catchAll;

    /**
     * @return the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     * 
     */
    public Output<EventOrchestrationUnroutedCatchAll> catchAll() {
        return this.catchAll;
    }
    /**
     * The Event Orchestration to which this Unrouted Orchestration belongs to.
     * 
     */
    @Export(name="eventOrchestration", refs={String.class}, tree="[0]")
    private Output<String> eventOrchestration;

    /**
     * @return The Event Orchestration to which this Unrouted Orchestration belongs to.
     * 
     */
    public Output<String> eventOrchestration() {
        return this.eventOrchestration;
    }
    /**
     * An Unrouted Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * 
     */
    @Export(name="sets", refs={List.class,EventOrchestrationUnroutedSet.class}, tree="[0,1]")
    private Output<List<EventOrchestrationUnroutedSet>> sets;

    /**
     * @return An Unrouted Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * 
     */
    public Output<List<EventOrchestrationUnroutedSet>> sets() {
        return this.sets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventOrchestrationUnrouted(String name) {
        this(name, EventOrchestrationUnroutedArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventOrchestrationUnrouted(String name, EventOrchestrationUnroutedArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventOrchestrationUnrouted(String name, EventOrchestrationUnroutedArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted", name, args == null ? EventOrchestrationUnroutedArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventOrchestrationUnrouted(String name, Output<String> id, @Nullable EventOrchestrationUnroutedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted", name, state, makeResourceOptions(options, id));
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
    public static EventOrchestrationUnrouted get(String name, Output<String> id, @Nullable EventOrchestrationUnroutedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventOrchestrationUnrouted(name, id, state, options);
    }
}
