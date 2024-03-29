// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.EventOrchestrationServiceArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.EventOrchestrationServiceState;
import com.pulumi.pagerduty.outputs.EventOrchestrationServiceCatchAll;
import com.pulumi.pagerduty.outputs.EventOrchestrationServiceSet;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A [Service Orchestration](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the &#34;start&#34; set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.
 * 
 * &gt; If you have a Service that uses [Service Event Rules](https://support.pagerduty.com/docs/rulesets#service-event-rules), you can switch to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) at any time setting the attribute `enable_event_orchestration_for_service` to `true`. Please read the [Switch to Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#switch-to-service-orchestrations) instructions for more information.
 * 
 * ## Example of configuring a Service Orchestration
 * 
 * This example shows creating `Team`, `User`, `Escalation Policy`, and `Service` resources followed by creating a Service Orchestration to handle Events sent to that Service.
 * 
 * This example also shows using `priority` data source to configure `priority` action for a rule. If the Event matches the first rule in set &#34;step-two&#34; the resulting incident will have the Priority `P1`.
 * 
 * This example shows a Service Orchestration that has nested sets: a rule in the &#34;start&#34; set has a `route_to` action pointing at the &#34;step-two&#34; set.
 * 
 * The `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set. In this example the `catch_all` doesn&#39;t have any `actions` so it&#39;ll leave events as-is.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.TeamMembership;
 * import com.pulumi.pagerduty.TeamMembershipArgs;
 * import com.pulumi.pagerduty.EscalationPolicy;
 * import com.pulumi.pagerduty.EscalationPolicyArgs;
 * import com.pulumi.pagerduty.inputs.EscalationPolicyRuleArgs;
 * import com.pulumi.pagerduty.Service;
 * import com.pulumi.pagerduty.ServiceArgs;
 * import com.pulumi.pagerduty.IncidentCustomField;
 * import com.pulumi.pagerduty.IncidentCustomFieldArgs;
 * import com.pulumi.pagerduty.PagerdutyFunctions;
 * import com.pulumi.pagerduty.inputs.GetPriorityArgs;
 * import com.pulumi.pagerduty.EventOrchestrationService;
 * import com.pulumi.pagerduty.EventOrchestrationServiceArgs;
 * import com.pulumi.pagerduty.inputs.EventOrchestrationServiceSetArgs;
 * import com.pulumi.pagerduty.inputs.EventOrchestrationServiceCatchAllArgs;
 * import com.pulumi.pagerduty.inputs.EventOrchestrationServiceCatchAllActionsArgs;
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
 *         var exampleUser = new User(&#34;exampleUser&#34;, UserArgs.builder()        
 *             .email(&#34;125.greenholt.earline@graham.name&#34;)
 *             .build());
 * 
 *         var foo = new TeamMembership(&#34;foo&#34;, TeamMembershipArgs.builder()        
 *             .userId(exampleUser.id())
 *             .teamId(engineering.id())
 *             .role(&#34;manager&#34;)
 *             .build());
 * 
 *         var exampleEscalationPolicy = new EscalationPolicy(&#34;exampleEscalationPolicy&#34;, EscalationPolicyArgs.builder()        
 *             .numLoops(2)
 *             .rules(EscalationPolicyRuleArgs.builder()
 *                 .escalationDelayInMinutes(10)
 *                 .targets(EscalationPolicyRuleTargetArgs.builder()
 *                     .type(&#34;user_reference&#34;)
 *                     .id(exampleUser.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .autoResolveTimeout(14400)
 *             .acknowledgementTimeout(600)
 *             .escalationPolicy(exampleEscalationPolicy.id())
 *             .alertCreation(&#34;create_alerts_and_incidents&#34;)
 *             .build());
 * 
 *         var csImpact = new IncidentCustomField(&#34;csImpact&#34;, IncidentCustomFieldArgs.builder()        
 *             .dataType(&#34;string&#34;)
 *             .fieldType(&#34;single_value&#34;)
 *             .build());
 * 
 *         final var p1 = PagerdutyFunctions.getPriority(GetPriorityArgs.builder()
 *             .name(&#34;P1&#34;)
 *             .build());
 * 
 *         var www = new EventOrchestrationService(&#34;www&#34;, EventOrchestrationServiceArgs.builder()        
 *             .service(exampleService.id())
 *             .enableEventOrchestrationForService(true)
 *             .sets(            
 *                 EventOrchestrationServiceSetArgs.builder()
 *                     .id(&#34;start&#34;)
 *                     .rules(EventOrchestrationServiceSetRuleArgs.builder()
 *                         .label(&#34;Always apply some consistent event transformations to all events&#34;)
 *                         .actions(EventOrchestrationServiceSetRuleActionsArgs.builder()
 *                             .variables(EventOrchestrationServiceSetRuleActionsVariableArgs.builder()
 *                                 .name(&#34;hostname&#34;)
 *                                 .path(&#34;event.component&#34;)
 *                                 .value(&#34;hostname: (.*)&#34;)
 *                                 .type(&#34;regex&#34;)
 *                                 .build())
 *                             .extractions(                            
 *                                 EventOrchestrationServiceSetRuleActionsExtractionArgs.builder()
 *                                     .template(&#34;{{variables.hostname}}&#34;)
 *                                     .target(&#34;event.custom_details.hostname&#34;)
 *                                     .build(),
 *                                 EventOrchestrationServiceSetRuleActionsExtractionArgs.builder()
 *                                     .source(&#34;event.source&#34;)
 *                                     .regex(&#34;www (.*) service&#34;)
 *                                     .target(&#34;event.source&#34;)
 *                                     .build())
 *                             .routeTo(&#34;step-two&#34;)
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 EventOrchestrationServiceSetArgs.builder()
 *                     .id(&#34;step-two&#34;)
 *                     .rules(                    
 *                         EventOrchestrationServiceSetRuleArgs.builder()
 *                             .label(&#34;All critical alerts should be treated as P1 incident&#34;)
 *                             .conditions(EventOrchestrationServiceSetRuleConditionArgs.builder()
 *                                 .expression(&#34;event.severity matches &#39;critical&#39;&#34;)
 *                                 .build())
 *                             .actions(EventOrchestrationServiceSetRuleActionsArgs.builder()
 *                                 .annotate(&#34;Please use our P1 runbook: https://docs.test/p1-runbook&#34;)
 *                                 .priority(p1.applyValue(getPriorityResult -&gt; getPriorityResult.id()))
 *                                 .incidentCustomFieldUpdates(EventOrchestrationServiceSetRuleActionsIncidentCustomFieldUpdateArgs.builder()
 *                                     .id(csImpact.id())
 *                                     .value(&#34;High Impact&#34;)
 *                                     .build())
 *                                 .build())
 *                             .build(),
 *                         EventOrchestrationServiceSetRuleArgs.builder()
 *                             .label(&#34;If there&#39;s something wrong on the canary let the team know about it in our deployments Slack channel&#34;)
 *                             .conditions(EventOrchestrationServiceSetRuleConditionArgs.builder()
 *                                 .expression(&#34;event.custom_details.hostname matches part &#39;canary&#39;&#34;)
 *                                 .build())
 *                             .actions(EventOrchestrationServiceSetRuleActionsArgs.builder()
 *                                 .automationAction(EventOrchestrationServiceSetRuleActionsAutomationActionArgs.builder()
 *                                     .name(&#34;Canary Slack Notification&#34;)
 *                                     .url(&#34;https://our-slack-listerner.test/canary-notification&#34;)
 *                                     .autoSend(true)
 *                                     .parameters(                                    
 *                                         EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs.builder()
 *                                             .key(&#34;channel&#34;)
 *                                             .value(&#34;#my-team-channel&#34;)
 *                                             .build(),
 *                                         EventOrchestrationServiceSetRuleActionsAutomationActionParameterArgs.builder()
 *                                             .key(&#34;message&#34;)
 *                                             .value(&#34;something is wrong with the canary deployment&#34;)
 *                                             .build())
 *                                     .headers(EventOrchestrationServiceSetRuleActionsAutomationActionHeaderArgs.builder()
 *                                         .key(&#34;X-Notification-Source&#34;)
 *                                         .value(&#34;PagerDuty Incident Webhook&#34;)
 *                                         .build())
 *                                     .build())
 *                                 .build())
 *                             .build(),
 *                         EventOrchestrationServiceSetRuleArgs.builder()
 *                             .label(&#34;Never bother the on-call for info-level events outside of work hours&#34;)
 *                             .conditions(EventOrchestrationServiceSetRuleConditionArgs.builder()
 *                                 .expression(&#34;event.severity matches &#39;info&#39; and not (now in Mon,Tue,Wed,Thu,Fri 09:00:00 to 17:00:00 America/Los_Angeles)&#34;)
 *                                 .build())
 *                             .actions(EventOrchestrationServiceSetRuleActionsArgs.builder()
 *                                 .suppress(true)
 *                                 .build())
 *                             .build())
 *                     .build())
 *             .catchAll(EventOrchestrationServiceCatchAllArgs.builder()
 *                 .actions()
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
 * Service Orchestration can be imported using the `id` of the Service, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/eventOrchestrationService:EventOrchestrationService service PFEODA7
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/eventOrchestrationService:EventOrchestrationService")
public class EventOrchestrationService extends com.pulumi.resources.CustomResource {
    /**
     * the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     * 
     */
    @Export(name="catchAll", refs={EventOrchestrationServiceCatchAll.class}, tree="[0]")
    private Output<EventOrchestrationServiceCatchAll> catchAll;

    /**
     * @return the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     * 
     */
    public Output<EventOrchestrationServiceCatchAll> catchAll() {
        return this.catchAll;
    }
    /**
     * Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
     * 
     */
    @Export(name="enableEventOrchestrationForService", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableEventOrchestrationForService;

    /**
     * @return Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
     * 
     */
    public Output<Boolean> enableEventOrchestrationForService() {
        return this.enableEventOrchestrationForService;
    }
    /**
     * ID of the Service to which this Service Orchestration belongs to.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return ID of the Service to which this Service Orchestration belongs to.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * A Service Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * 
     */
    @Export(name="sets", refs={List.class,EventOrchestrationServiceSet.class}, tree="[0,1]")
    private Output<List<EventOrchestrationServiceSet>> sets;

    /**
     * @return A Service Orchestration must contain at least a &#34;start&#34; set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * 
     */
    public Output<List<EventOrchestrationServiceSet>> sets() {
        return this.sets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventOrchestrationService(String name) {
        this(name, EventOrchestrationServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventOrchestrationService(String name, EventOrchestrationServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventOrchestrationService(String name, EventOrchestrationServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventOrchestrationService:EventOrchestrationService", name, args == null ? EventOrchestrationServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventOrchestrationService(String name, Output<String> id, @Nullable EventOrchestrationServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventOrchestrationService:EventOrchestrationService", name, state, makeResourceOptions(options, id));
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
    public static EventOrchestrationService get(String name, Output<String> id, @Nullable EventOrchestrationServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventOrchestrationService(name, id, state, options);
    }
}
