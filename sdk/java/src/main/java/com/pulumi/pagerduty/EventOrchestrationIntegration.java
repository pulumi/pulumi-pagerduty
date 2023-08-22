// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.EventOrchestrationIntegrationArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.EventOrchestrationIntegrationState;
import com.pulumi.pagerduty.outputs.EventOrchestrationIntegrationParameter;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Event Orchestration Integration allows you to create and manage multiple Integrations (and Routing Keys) per Event Orchestration _and_ will allow you to move (migrate) Integrations _between_ two Event Orchestrations.
 * 
 * ## Example of configuring an Integration for an Event Orchestration
 * 
 * This example shows creating `Event Orchestration` and `Team` resources followed by creating an Event Orchestration Integration to handle Events sent to that Event Orchestration.
 * 
 * &gt; When a new Event Orchestration is created there will be one Integration (and Routing Key) included by default. Example below shows how to create an extra Integration associated with this Event Orchestration.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.EventOrchestration;
 * import com.pulumi.pagerduty.EventOrchestrationArgs;
 * import com.pulumi.pagerduty.EventOrchestrationIntegration;
 * import com.pulumi.pagerduty.EventOrchestrationIntegrationArgs;
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
 *         var databaseTeam = new Team(&#34;databaseTeam&#34;);
 * 
 *         var eventOrchestration = new EventOrchestration(&#34;eventOrchestration&#34;, EventOrchestrationArgs.builder()        
 *             .team(databaseTeam.id())
 *             .build());
 * 
 *         var integration = new EventOrchestrationIntegration(&#34;integration&#34;, EventOrchestrationIntegrationArgs.builder()        
 *             .eventOrchestration(eventOrchestration.id())
 *             .label(&#34;Example integration&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Event Orchestration Integration can be imported using colon-separated IDs, which is the combination of the Event Orchestration ID followed by the Event Orchestration Integration ID, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration integration 19acac92-027a-4ea0-b06c-bbf516519601:1b49abe7-26db-4439-a715-c6d883acfb3e
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration")
public class EventOrchestrationIntegration extends com.pulumi.resources.CustomResource {
    /**
     * ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     * 
     */
    @Export(name="eventOrchestration", refs={String.class}, tree="[0]")
    private Output<String> eventOrchestration;

    /**
     * @return ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     * 
     */
    public Output<String> eventOrchestration() {
        return this.eventOrchestration;
    }
    /**
     * Name/description of the Integration.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return Name/description of the Integration.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    @Export(name="parameters", refs={List.class,EventOrchestrationIntegrationParameter.class}, tree="[0,1]")
    private Output<List<EventOrchestrationIntegrationParameter>> parameters;

    public Output<List<EventOrchestrationIntegrationParameter>> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventOrchestrationIntegration(String name) {
        this(name, EventOrchestrationIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventOrchestrationIntegration(String name, EventOrchestrationIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventOrchestrationIntegration(String name, EventOrchestrationIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration", name, args == null ? EventOrchestrationIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventOrchestrationIntegration(String name, Output<String> id, @Nullable EventOrchestrationIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration", name, state, makeResourceOptions(options, id));
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
    public static EventOrchestrationIntegration get(String name, Output<String> id, @Nullable EventOrchestrationIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventOrchestrationIntegration(name, id, state, options);
    }
}
