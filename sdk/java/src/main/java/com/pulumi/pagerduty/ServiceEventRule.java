// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.ServiceEventRuleArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.ServiceEventRuleState;
import com.pulumi.pagerduty.outputs.ServiceEventRuleActions;
import com.pulumi.pagerduty.outputs.ServiceEventRuleConditions;
import com.pulumi.pagerduty.outputs.ServiceEventRuleTimeFrame;
import com.pulumi.pagerduty.outputs.ServiceEventRuleVariable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.Service;
 * import com.pulumi.pagerduty.ServiceArgs;
 * import com.pulumi.pagerduty.ServiceEventRule;
 * import com.pulumi.pagerduty.ServiceEventRuleArgs;
 * import com.pulumi.pagerduty.inputs.ServiceEventRuleConditionsArgs;
 * import com.pulumi.pagerduty.inputs.ServiceEventRuleVariableArgs;
 * import com.pulumi.pagerduty.inputs.ServiceEventRuleActionsArgs;
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
 *         var example = new Service(&#34;example&#34;, ServiceArgs.builder()        
 *             .autoResolveTimeout(14400)
 *             .acknowledgementTimeout(600)
 *             .escalationPolicy(pagerduty_escalation_policy.example().id())
 *             .alertCreation(&#34;create_alerts_and_incidents&#34;)
 *             .build());
 * 
 *         var foo = new ServiceEventRule(&#34;foo&#34;, ServiceEventRuleArgs.builder()        
 *             .service(example.id())
 *             .position(0)
 *             .disabled(true)
 *             .conditions(ServiceEventRuleConditionsArgs.builder()
 *                 .operator(&#34;and&#34;)
 *                 .subconditions(ServiceEventRuleConditionsSubconditionArgs.builder()
 *                     .operator(&#34;contains&#34;)
 *                     .parameters(ServiceEventRuleConditionsSubconditionParameterArgs.builder()
 *                         .value(&#34;disk space&#34;)
 *                         .path(&#34;summary&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .variables(ServiceEventRuleVariableArgs.builder()
 *                 .type(&#34;regex&#34;)
 *                 .name(&#34;Src&#34;)
 *                 .parameters(ServiceEventRuleVariableParameterArgs.builder()
 *                     .value(&#34;(.*)&#34;)
 *                     .path(&#34;source&#34;)
 *                     .build())
 *                 .build())
 *             .actions(ServiceEventRuleActionsArgs.builder()
 *                 .annotates(ServiceEventRuleActionsAnnotateArgs.builder()
 *                     .value(&#34;From Terraform&#34;)
 *                     .build())
 *                 .extractions(                
 *                     ServiceEventRuleActionsExtractionArgs.builder()
 *                         .target(&#34;dedup_key&#34;)
 *                         .source(&#34;source&#34;)
 *                         .regex(&#34;(.*)&#34;)
 *                         .build(),
 *                     ServiceEventRuleActionsExtractionArgs.builder()
 *                         .target(&#34;summary&#34;)
 *                         .template(&#34;Warning: Disk Space Low on {{Src}}&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *         var bar = new ServiceEventRule(&#34;bar&#34;, ServiceEventRuleArgs.builder()        
 *             .service(pagerduty_service.foo().id())
 *             .position(1)
 *             .disabled(true)
 *             .conditions(ServiceEventRuleConditionsArgs.builder()
 *                 .operator(&#34;and&#34;)
 *                 .subconditions(ServiceEventRuleConditionsSubconditionArgs.builder()
 *                     .operator(&#34;contains&#34;)
 *                     .parameters(ServiceEventRuleConditionsSubconditionParameterArgs.builder()
 *                         .value(&#34;cpu spike&#34;)
 *                         .path(&#34;summary&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .actions(ServiceEventRuleActionsArgs.builder()
 *                 .annotates(ServiceEventRuleActionsAnnotateArgs.builder()
 *                     .value(&#34;From Terraform&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service event rules can be imported using using the related `service` id and the `service_event_rule` id separated by a dot, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/serviceEventRule:ServiceEventRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/serviceEventRule:ServiceEventRule")
public class ServiceEventRule extends com.pulumi.resources.CustomResource {
    /**
     * Actions to apply to an event if the conditions match.
     * 
     */
    @Export(name="actions", refs={ServiceEventRuleActions.class}, tree="[0]")
    private Output</* @Nullable */ ServiceEventRuleActions> actions;

    /**
     * @return Actions to apply to an event if the conditions match.
     * 
     */
    public Output<Optional<ServiceEventRuleActions>> actions() {
        return Codegen.optional(this.actions);
    }
    /**
     * Conditions evaluated to check if an event matches this event rule.
     * 
     */
    @Export(name="conditions", refs={ServiceEventRuleConditions.class}, tree="[0]")
    private Output</* @Nullable */ ServiceEventRuleConditions> conditions;

    /**
     * @return Conditions evaluated to check if an event matches this event rule.
     * 
     */
    public Output<Optional<ServiceEventRuleConditions>> conditions() {
        return Codegen.optional(this.conditions);
    }
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Indicates whether the rule is disabled and would therefore not be evaluated.
     * 
     */
    public Output<Optional<Boolean>> disabled() {
        return Codegen.optional(this.disabled);
    }
    /**
     * Position/index of the rule within the service.
     * 
     */
    @Export(name="position", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> position;

    /**
     * @return Position/index of the rule within the service.
     * 
     */
    public Output<Optional<Integer>> position() {
        return Codegen.optional(this.position);
    }
    /**
     * The ID of the service that the rule belongs to.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The ID of the service that the rule belongs to.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     * 
     */
    @Export(name="timeFrame", refs={ServiceEventRuleTimeFrame.class}, tree="[0]")
    private Output</* @Nullable */ ServiceEventRuleTimeFrame> timeFrame;

    /**
     * @return Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     * 
     */
    public Output<Optional<ServiceEventRuleTimeFrame>> timeFrame() {
        return Codegen.optional(this.timeFrame);
    }
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     * 
     */
    @Export(name="variables", refs={List.class,ServiceEventRuleVariable.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceEventRuleVariable>> variables;

    /**
     * @return Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     * 
     */
    public Output<Optional<List<ServiceEventRuleVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceEventRule(String name) {
        this(name, ServiceEventRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceEventRule(String name, ServiceEventRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceEventRule(String name, ServiceEventRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/serviceEventRule:ServiceEventRule", name, args == null ? ServiceEventRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceEventRule(String name, Output<String> id, @Nullable ServiceEventRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/serviceEventRule:ServiceEventRule", name, state, makeResourceOptions(options, id));
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
    public static ServiceEventRule get(String name, Output<String> id, @Nullable ServiceEventRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceEventRule(name, id, state, options);
    }
}
