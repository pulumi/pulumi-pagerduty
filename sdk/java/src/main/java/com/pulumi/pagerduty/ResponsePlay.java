// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.ResponsePlayArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.ResponsePlayState;
import com.pulumi.pagerduty.outputs.ResponsePlayResponder;
import com.pulumi.pagerduty.outputs.ResponsePlaySubscriber;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.EscalationPolicy;
 * import com.pulumi.pagerduty.EscalationPolicyArgs;
 * import com.pulumi.pagerduty.inputs.EscalationPolicyRuleArgs;
 * import com.pulumi.pagerduty.ResponsePlay;
 * import com.pulumi.pagerduty.ResponsePlayArgs;
 * import com.pulumi.pagerduty.inputs.ResponsePlayResponderArgs;
 * import com.pulumi.pagerduty.inputs.ResponsePlaySubscriberArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new User("example", UserArgs.builder()
 *             .name("Earline Greenholt")
 *             .email("125.greenholt.earline}{@literal @}{@code graham.name")
 *             .teams(examplePagerdutyTeam.id())
 *             .build());
 * 
 *         var exampleEscalationPolicy = new EscalationPolicy("exampleEscalationPolicy", EscalationPolicyArgs.builder()
 *             .name("Engineering Escalation Policy")
 *             .numLoops(2)
 *             .rules(EscalationPolicyRuleArgs.builder()
 *                 .escalationDelayInMinutes(10)
 *                 .targets(EscalationPolicyRuleTargetArgs.builder()
 *                     .type("user")
 *                     .id(example.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleResponsePlay = new ResponsePlay("exampleResponsePlay", ResponsePlayArgs.builder()
 *             .name("My Response Play")
 *             .from(example.email())
 *             .responders(ResponsePlayResponderArgs.builder()
 *                 .type("escalation_policy_reference")
 *                 .id(exampleEscalationPolicy.id())
 *                 .build())
 *             .subscribers(ResponsePlaySubscriberArgs.builder()
 *                 .type("user_reference")
 *                 .id(example.id())
 *                 .build())
 *             .runnability("services")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Response Plays can be imported using the `id.from(email)`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/responsePlay:ResponsePlay main 16208303-022b-f745-f2f5-560e537a2a74.user{@literal @}email.com
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/responsePlay:ResponsePlay")
public class ResponsePlay extends com.pulumi.resources.CustomResource {
    /**
     * The telephone number that will be set as the conference number for any incident on which this response play is run.
     * 
     */
    @Export(name="conferenceNumber", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> conferenceNumber;

    /**
     * @return The telephone number that will be set as the conference number for any incident on which this response play is run.
     * 
     */
    public Output<Optional<String>> conferenceNumber() {
        return Codegen.optional(this.conferenceNumber);
    }
    /**
     * The URL that will be set as the conference URL for any incident on which this response play is run.
     * 
     */
    @Export(name="conferenceUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> conferenceUrl;

    /**
     * @return The URL that will be set as the conference URL for any incident on which this response play is run.
     * 
     */
    public Output<Optional<String>> conferenceUrl() {
        return Codegen.optional(this.conferenceUrl);
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }
    /**
     * The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
     * 
     */
    @Export(name="from", refs={String.class}, tree="[0]")
    private Output<String> from;

    /**
     * @return The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
     * 
     */
    public Output<String> from() {
        return this.from;
    }
    /**
     * The name of the response play.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the response play.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
     * 
     */
    @Export(name="responders", refs={List.class,ResponsePlayResponder.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ResponsePlayResponder>> responders;

    /**
     * @return A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
     * 
     */
    public Output<Optional<List<ResponsePlayResponder>>> responders() {
        return Codegen.optional(this.responders);
    }
    /**
     * The message body of the notification that will be sent to this response play&#39;s set of responders. If empty, a default response request notification will be sent.
     * 
     */
    @Export(name="respondersMessage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> respondersMessage;

    /**
     * @return The message body of the notification that will be sent to this response play&#39;s set of responders. If empty, a default response request notification will be sent.
     * 
     */
    public Output<Optional<String>> respondersMessage() {
        return Codegen.optional(this.respondersMessage);
    }
    /**
     * String representing how this response play is allowed to be run. Valid options are:
     * 
     */
    @Export(name="runnability", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runnability;

    /**
     * @return String representing how this response play is allowed to be run. Valid options are:
     * 
     */
    public Output<Optional<String>> runnability() {
        return Codegen.optional(this.runnability);
    }
    /**
     * A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
     * 
     */
    @Export(name="subscribers", refs={List.class,ResponsePlaySubscriber.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ResponsePlaySubscriber>> subscribers;

    /**
     * @return A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
     * 
     */
    public Output<Optional<List<ResponsePlaySubscriber>>> subscribers() {
        return Codegen.optional(this.subscribers);
    }
    /**
     * The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
     * 
     */
    @Export(name="subscribersMessage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subscribersMessage;

    /**
     * @return The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
     * 
     */
    public Output<Optional<String>> subscribersMessage() {
        return Codegen.optional(this.subscribersMessage);
    }
    /**
     * The ID of the team associated with the response play.
     * 
     */
    @Export(name="team", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> team;

    /**
     * @return The ID of the team associated with the response play.
     * 
     */
    public Output<Optional<String>> team() {
        return Codegen.optional(this.team);
    }
    /**
     * A string that determines the schema of the object. If not set, the default value is &#34;response_play&#34;.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return A string that determines the schema of the object. If not set, the default value is &#34;response_play&#34;.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResponsePlay(java.lang.String name) {
        this(name, ResponsePlayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResponsePlay(java.lang.String name, ResponsePlayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponsePlay(java.lang.String name, ResponsePlayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/responsePlay:ResponsePlay", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ResponsePlay(java.lang.String name, Output<java.lang.String> id, @Nullable ResponsePlayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/responsePlay:ResponsePlay", name, state, makeResourceOptions(options, id), false);
    }

    private static ResponsePlayArgs makeArgs(ResponsePlayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ResponsePlayArgs.Empty : args;
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
    public static ResponsePlay get(java.lang.String name, Output<java.lang.String> id, @Nullable ResponsePlayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResponsePlay(name, id, state, options);
    }
}
