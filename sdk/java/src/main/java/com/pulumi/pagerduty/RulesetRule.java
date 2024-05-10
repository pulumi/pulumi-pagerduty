// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.RulesetRuleArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.RulesetRuleState;
import com.pulumi.pagerduty.outputs.RulesetRuleActions;
import com.pulumi.pagerduty.outputs.RulesetRuleConditions;
import com.pulumi.pagerduty.outputs.RulesetRuleTimeFrame;
import com.pulumi.pagerduty.outputs.RulesetRuleVariable;
import java.lang.Boolean;
import java.lang.Integer;
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
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.TeamArgs;
 * import com.pulumi.pagerduty.Ruleset;
 * import com.pulumi.pagerduty.RulesetArgs;
 * import com.pulumi.pagerduty.inputs.RulesetTeamArgs;
 * import com.pulumi.time.Static;
 * import com.pulumi.time.StaticArgs;
 * import com.pulumi.pagerduty.RulesetRule;
 * import com.pulumi.pagerduty.RulesetRuleArgs;
 * import com.pulumi.pagerduty.inputs.RulesetRuleTimeFrameArgs;
 * import com.pulumi.pagerduty.inputs.RulesetRuleConditionsArgs;
 * import com.pulumi.pagerduty.inputs.RulesetRuleVariableArgs;
 * import com.pulumi.pagerduty.inputs.RulesetRuleActionsArgs;
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
 *             .name("Engineering (Seattle)")
 *             .build());
 * 
 *         var fooRuleset = new Ruleset("fooRuleset", RulesetArgs.builder()        
 *             .name("Primary Ruleset")
 *             .team(RulesetTeamArgs.builder()
 *                 .id(foo.id())
 *                 .build())
 *             .build());
 * 
 *         // The pagerduty_ruleset_rule.foo rule defined below
 *         // repeats daily from 9:30am - 11:30am using the America/New_York timezone.
 *         // Thus it requires a time_static instance to represent 9:30am on an arbitrary date in that timezone.
 *         // April 11th, 2019 was EDT (UTC-4) https://www.timeanddate.com/worldclock/converter.html?iso=20190411T133000&p1=179
 *         var easternTimeAt0930 = new Static("easternTimeAt0930", StaticArgs.builder()        
 *             .rfc3339("2019-04-11T09:30:00-04:00")
 *             .build());
 * 
 *         var fooRulesetRule = new RulesetRule("fooRulesetRule", RulesetRuleArgs.builder()        
 *             .ruleset(fooRuleset.id())
 *             .position(0)
 *             .disabled("false")
 *             .timeFrame(RulesetRuleTimeFrameArgs.builder()
 *                 .scheduledWeeklies(RulesetRuleTimeFrameScheduledWeeklyArgs.builder()
 *                     .weekdays(                    
 *                         2,
 *                         4,
 *                         6)
 *                     .startTime(easternTimeAt0930.unix().applyValue(unix -> unix * 1000))
 *                     .duration(2 * 60 * 60 * 1000)
 *                     .timezone("America/New_York")
 *                     .build())
 *                 .build())
 *             .conditions(RulesetRuleConditionsArgs.builder()
 *                 .operator("and")
 *                 .subconditions(                
 *                     RulesetRuleConditionsSubconditionArgs.builder()
 *                         .operator("contains")
 *                         .parameters(RulesetRuleConditionsSubconditionParameterArgs.builder()
 *                             .value("disk space")
 *                             .path("payload.summary")
 *                             .build())
 *                         .build(),
 *                     RulesetRuleConditionsSubconditionArgs.builder()
 *                         .operator("contains")
 *                         .parameters(RulesetRuleConditionsSubconditionParameterArgs.builder()
 *                             .value("db")
 *                             .path("payload.source")
 *                             .build())
 *                         .build())
 *                 .build())
 *             .variables(RulesetRuleVariableArgs.builder()
 *                 .type("regex")
 *                 .name("Src")
 *                 .parameters(RulesetRuleVariableParameterArgs.builder()
 *                     .value("(.*)")
 *                     .path("payload.source")
 *                     .build())
 *                 .build())
 *             .actions(RulesetRuleActionsArgs.builder()
 *                 .routes(RulesetRuleActionsRouteArgs.builder()
 *                     .value(fooPagerdutyService.id())
 *                     .build())
 *                 .severities(RulesetRuleActionsSeverityArgs.builder()
 *                     .value("warning")
 *                     .build())
 *                 .annotates(RulesetRuleActionsAnnotateArgs.builder()
 *                     .value("From Terraform")
 *                     .build())
 *                 .extractions(                
 *                     RulesetRuleActionsExtractionArgs.builder()
 *                         .target("dedup_key")
 *                         .source("details.host")
 *                         .regex("(.*)")
 *                         .build(),
 *                     RulesetRuleActionsExtractionArgs.builder()
 *                         .target("summary")
 *                         .template("Warning: Disk Space Low on {{Src}}")
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *         var catchAll = new RulesetRule("catchAll", RulesetRuleArgs.builder()        
 *             .ruleset(fooRuleset.id())
 *             .position(1)
 *             .catchAll(true)
 *             .actions(RulesetRuleActionsArgs.builder()
 *                 .annotates(RulesetRuleActionsAnnotateArgs.builder()
 *                     .value("From Terraform")
 *                     .build())
 *                 .suppresses(RulesetRuleActionsSuppressArgs.builder()
 *                     .value(true)
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
 * Ruleset rules can be imported using the related `ruleset` ID and the `ruleset_rule` ID separated by a dot, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/rulesetRule:RulesetRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/rulesetRule:RulesetRule")
public class RulesetRule extends com.pulumi.resources.CustomResource {
    /**
     * Actions to apply to an event if the conditions match.
     * 
     */
    @Export(name="actions", refs={RulesetRuleActions.class}, tree="[0]")
    private Output</* @Nullable */ RulesetRuleActions> actions;

    /**
     * @return Actions to apply to an event if the conditions match.
     * 
     */
    public Output<Optional<RulesetRuleActions>> actions() {
        return Codegen.optional(this.actions);
    }
    /**
     * Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     * 
     */
    @Export(name="catchAll", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> catchAll;

    /**
     * @return Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     * 
     */
    public Output<Optional<Boolean>> catchAll() {
        return Codegen.optional(this.catchAll);
    }
    /**
     * Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
     * 
     */
    @Export(name="conditions", refs={RulesetRuleConditions.class}, tree="[0]")
    private Output</* @Nullable */ RulesetRuleConditions> conditions;

    /**
     * @return Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
     * 
     */
    public Output<Optional<RulesetRuleConditions>> conditions() {
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
     * Position/index of the rule within the ruleset.
     * 
     */
    @Export(name="position", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> position;

    /**
     * @return Position/index of the rule within the ruleset.
     * 
     */
    public Output<Optional<Integer>> position() {
        return Codegen.optional(this.position);
    }
    /**
     * The ID of the ruleset that the rule belongs to.
     * 
     */
    @Export(name="ruleset", refs={String.class}, tree="[0]")
    private Output<String> ruleset;

    /**
     * @return The ID of the ruleset that the rule belongs to.
     * 
     */
    public Output<String> ruleset() {
        return this.ruleset;
    }
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     * 
     */
    @Export(name="timeFrame", refs={RulesetRuleTimeFrame.class}, tree="[0]")
    private Output</* @Nullable */ RulesetRuleTimeFrame> timeFrame;

    /**
     * @return Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     * 
     */
    public Output<Optional<RulesetRuleTimeFrame>> timeFrame() {
        return Codegen.optional(this.timeFrame);
    }
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     * 
     */
    @Export(name="variables", refs={List.class,RulesetRuleVariable.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RulesetRuleVariable>> variables;

    /**
     * @return Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     * 
     */
    public Output<Optional<List<RulesetRuleVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RulesetRule(String name) {
        this(name, RulesetRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RulesetRule(String name, RulesetRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RulesetRule(String name, RulesetRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/rulesetRule:RulesetRule", name, args == null ? RulesetRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RulesetRule(String name, Output<String> id, @Nullable RulesetRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/rulesetRule:RulesetRule", name, state, makeResourceOptions(options, id));
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
    public static RulesetRule get(String name, Output<String> id, @Nullable RulesetRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RulesetRule(name, id, state, options);
    }
}
