// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.SlackConnectionArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.SlackConnectionState;
import com.pulumi.pagerduty.outputs.SlackConnectionConfig;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A [slack connection](https://developer.pagerduty.com/api-reference/YXBpOjExMjA5NTQ0-pager-duty-slack-integration-api) allows you to connect a workspace in Slack to a PagerDuty service or team which allows you to acknowledge and resolve PagerDuty incidents from the Slack user interface.
 * 
 * **NOTES for using this resource:**
 * * To first use this resource you will need to [map your PagerDuty account to a valid Slack Workspace](https://support.pagerduty.com/docs/slack-integration-guide#integration-walkthrough). *This can only be done through the PagerDuty UI.*
 * * This resource requires a PagerDuty [user-level API key](https://support.pagerduty.com/docs/generating-api-keys#section-generating-a-personal-rest-api-key). This can be set as the `user_token` on the provider tag or as the `PAGERDUTY_USER_TOKEN` environment variable.
 * * This resource is for configuring Slack V2 Next Generation connections. If you configured your Slack integration (V1 or V2) prior to August 10, 2021, you may migrate to the Slack V2 Next Generation update using this [migration instructions](https://support.pagerduty.com/docs/slack-integration-guide#migrate-to-slack-v2-next-generation), but if you configured your Slack integration after that date, you will have access to the update out of the box.
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
 * import com.pulumi.pagerduty.PagerdutyFunctions;
 * import com.pulumi.pagerduty.inputs.GetPriorityArgs;
 * import com.pulumi.pagerduty.SlackConnection;
 * import com.pulumi.pagerduty.SlackConnectionArgs;
 * import com.pulumi.pagerduty.inputs.SlackConnectionConfigArgs;
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
 *         var foo = new Team("foo", TeamArgs.builder()
 *             .name("Team Foo")
 *             .build());
 * 
 *         final var p1 = PagerdutyFunctions.getPriority(GetPriorityArgs.builder()
 *             .name("P1")
 *             .build());
 * 
 *         var fooSlackConnection = new SlackConnection("fooSlackConnection", SlackConnectionArgs.builder()
 *             .sourceId(foo.id())
 *             .sourceType("team_reference")
 *             .workspaceId("T02A123LV1A")
 *             .channelId("C02CABCDAC9")
 *             .notificationType("responder")
 *             .configs(SlackConnectionConfigArgs.builder()
 *                 .events(                
 *                     "incident.triggered",
 *                     "incident.acknowledged",
 *                     "incident.escalated",
 *                     "incident.resolved",
 *                     "incident.reassigned",
 *                     "incident.annotated",
 *                     "incident.unacknowledged",
 *                     "incident.delegated",
 *                     "incident.priority_updated",
 *                     "incident.responder.added",
 *                     "incident.responder.replied",
 *                     "incident.status_update_published",
 *                     "incident.reopened")
 *                 .priorities(p1.applyValue(getPriorityResult -> getPriorityResult.id()))
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
 * Slack connections can be imported using the related `workspace` ID and the `slack_connection` ID separated by a dot, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/slackConnection:SlackConnection main T02A123LV1A.PUABCDL
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/slackConnection:SlackConnection")
public class SlackConnection extends com.pulumi.resources.CustomResource {
    @Export(name="channelId", refs={String.class}, tree="[0]")
    private Output<String> channelId;

    public Output<String> channelId() {
        return this.channelId;
    }
    /**
     * Name of the Slack channel in Slack connection.
     * 
     */
    @Export(name="channelName", refs={String.class}, tree="[0]")
    private Output<String> channelName;

    /**
     * @return Name of the Slack channel in Slack connection.
     * 
     */
    public Output<String> channelName() {
        return this.channelName;
    }
    @Export(name="configs", refs={List.class,SlackConnectionConfig.class}, tree="[0,1]")
    private Output<List<SlackConnectionConfig>> configs;

    public Output<List<SlackConnectionConfig>> configs() {
        return this.configs;
    }
    @Export(name="notificationType", refs={String.class}, tree="[0]")
    private Output<String> notificationType;

    public Output<String> notificationType() {
        return this.notificationType;
    }
    @Export(name="sourceId", refs={String.class}, tree="[0]")
    private Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }
    /**
     * Name of the source (team or service) in Slack connection.
     * 
     */
    @Export(name="sourceName", refs={String.class}, tree="[0]")
    private Output<String> sourceName;

    /**
     * @return Name of the source (team or service) in Slack connection.
     * 
     */
    public Output<String> sourceName() {
        return this.sourceName;
    }
    @Export(name="sourceType", refs={String.class}, tree="[0]")
    private Output<String> sourceType;

    public Output<String> sourceType() {
        return this.sourceType;
    }
    @Export(name="workspaceId", refs={String.class}, tree="[0]")
    private Output<String> workspaceId;

    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SlackConnection(String name) {
        this(name, SlackConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SlackConnection(String name, SlackConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SlackConnection(String name, SlackConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/slackConnection:SlackConnection", name, args == null ? SlackConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SlackConnection(String name, Output<String> id, @Nullable SlackConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/slackConnection:SlackConnection", name, state, makeResourceOptions(options, id));
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
    public static SlackConnection get(String name, Output<String> id, @Nullable SlackConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SlackConnection(name, id, state, options);
    }
}
