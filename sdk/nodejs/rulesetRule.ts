// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 * import * as time from "@pulumiverse/time";
 *
 * const fooTeam = new pagerduty.Team("fooTeam", {});
 * const fooRuleset = new pagerduty.Ruleset("fooRuleset", {team: {
 *     id: fooTeam.id,
 * }});
 * // The pagerduty_ruleset_rule.foo rule defined below
 * // repeats daily from 9:30am - 11:30am using the America/New_York timezone.
 * // Thus it requires a time_static instance to represent 9:30am on an arbitrary date in that timezone.
 * // April 11th, 2019 was EDT (UTC-4) https://www.timeanddate.com/worldclock/converter.html?iso=20190411T133000&p1=179
 * const easternTimeAt0930 = new time.Static("easternTimeAt0930", {rfc3339: "2019-04-11T09:30:00-04:00"});
 * const fooRulesetRule = new pagerduty.RulesetRule("fooRulesetRule", {
 *     ruleset: fooRuleset.id,
 *     position: 0,
 *     disabled: false,
 *     timeFrame: {
 *         scheduledWeeklies: [{
 *             weekdays: [
 *                 2,
 *                 4,
 *                 6,
 *             ],
 *             startTime: easternTimeAt0930.unix.apply(unix => unix * 1000),
 *             duration: 2 * 60 * 60 * 1000,
 *             timezone: "America/New_York",
 *         }],
 *     },
 *     conditions: {
 *         operator: "and",
 *         subconditions: [
 *             {
 *                 operator: "contains",
 *                 parameters: [{
 *                     value: "disk space",
 *                     path: "payload.summary",
 *                 }],
 *             },
 *             {
 *                 operator: "contains",
 *                 parameters: [{
 *                     value: "db",
 *                     path: "payload.source",
 *                 }],
 *             },
 *         ],
 *     },
 *     variables: [{
 *         type: "regex",
 *         name: "Src",
 *         parameters: [{
 *             value: "(.*)",
 *             path: "payload.source",
 *         }],
 *     }],
 *     actions: {
 *         routes: [{
 *             value: pagerduty_service.foo.id,
 *         }],
 *         severities: [{
 *             value: "warning",
 *         }],
 *         annotates: [{
 *             value: "From Terraform",
 *         }],
 *         extractions: [
 *             {
 *                 target: "dedup_key",
 *                 source: "details.host",
 *                 regex: "(.*)",
 *             },
 *             {
 *                 target: "summary",
 *                 template: "Warning: Disk Space Low on {{Src}}",
 *             },
 *         ],
 *     },
 * });
 * const catchAll = new pagerduty.RulesetRule("catchAll", {
 *     ruleset: fooRuleset.id,
 *     position: 1,
 *     catchAll: true,
 *     actions: {
 *         annotates: [{
 *             value: "From Terraform",
 *         }],
 *         suppresses: [{
 *             value: true,
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Ruleset rules can be imported using the related `ruleset` ID and the `ruleset_rule` ID separated by a dot, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/rulesetRule:RulesetRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 */
export class RulesetRule extends pulumi.CustomResource {
    /**
     * Get an existing RulesetRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RulesetRuleState, opts?: pulumi.CustomResourceOptions): RulesetRule {
        return new RulesetRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/rulesetRule:RulesetRule';

    /**
     * Returns true if the given object is an instance of RulesetRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RulesetRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RulesetRule.__pulumiType;
    }

    /**
     * Actions to apply to an event if the conditions match.
     */
    public readonly actions!: pulumi.Output<outputs.RulesetRuleActions | undefined>;
    /**
     * Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     */
    public readonly catchAll!: pulumi.Output<boolean | undefined>;
    /**
     * Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
     */
    public readonly conditions!: pulumi.Output<outputs.RulesetRuleConditions | undefined>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * Position/index of the rule within the ruleset.
     */
    public readonly position!: pulumi.Output<number | undefined>;
    /**
     * The ID of the ruleset that the rule belongs to.
     */
    public readonly ruleset!: pulumi.Output<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    public readonly timeFrame!: pulumi.Output<outputs.RulesetRuleTimeFrame | undefined>;
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     */
    public readonly variables!: pulumi.Output<outputs.RulesetRuleVariable[] | undefined>;

    /**
     * Create a RulesetRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RulesetRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RulesetRuleArgs | RulesetRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RulesetRuleState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["catchAll"] = state ? state.catchAll : undefined;
            resourceInputs["conditions"] = state ? state.conditions : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["position"] = state ? state.position : undefined;
            resourceInputs["ruleset"] = state ? state.ruleset : undefined;
            resourceInputs["timeFrame"] = state ? state.timeFrame : undefined;
            resourceInputs["variables"] = state ? state.variables : undefined;
        } else {
            const args = argsOrState as RulesetRuleArgs | undefined;
            if ((!args || args.ruleset === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleset'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["catchAll"] = args ? args.catchAll : undefined;
            resourceInputs["conditions"] = args ? args.conditions : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["position"] = args ? args.position : undefined;
            resourceInputs["ruleset"] = args ? args.ruleset : undefined;
            resourceInputs["timeFrame"] = args ? args.timeFrame : undefined;
            resourceInputs["variables"] = args ? args.variables : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RulesetRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RulesetRule resources.
 */
export interface RulesetRuleState {
    /**
     * Actions to apply to an event if the conditions match.
     */
    actions?: pulumi.Input<inputs.RulesetRuleActions>;
    /**
     * Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     */
    catchAll?: pulumi.Input<boolean>;
    /**
     * Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
     */
    conditions?: pulumi.Input<inputs.RulesetRuleConditions>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Position/index of the rule within the ruleset.
     */
    position?: pulumi.Input<number>;
    /**
     * The ID of the ruleset that the rule belongs to.
     */
    ruleset?: pulumi.Input<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    timeFrame?: pulumi.Input<inputs.RulesetRuleTimeFrame>;
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     */
    variables?: pulumi.Input<pulumi.Input<inputs.RulesetRuleVariable>[]>;
}

/**
 * The set of arguments for constructing a RulesetRule resource.
 */
export interface RulesetRuleArgs {
    /**
     * Actions to apply to an event if the conditions match.
     */
    actions?: pulumi.Input<inputs.RulesetRuleActions>;
    /**
     * Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     */
    catchAll?: pulumi.Input<boolean>;
    /**
     * Conditions evaluated to check if an event matches this event rule. Is always empty for the catch-all rule, though.
     */
    conditions?: pulumi.Input<inputs.RulesetRuleConditions>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Position/index of the rule within the ruleset.
     */
    position?: pulumi.Input<number>;
    /**
     * The ID of the ruleset that the rule belongs to.
     */
    ruleset: pulumi.Input<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    timeFrame?: pulumi.Input<inputs.RulesetRuleTimeFrame>;
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     */
    variables?: pulumi.Input<pulumi.Input<inputs.RulesetRuleVariable>[]>;
}
