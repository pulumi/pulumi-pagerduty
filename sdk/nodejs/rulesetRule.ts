// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * An [event rule](https://support.pagerduty.com/docs/rulesets#section-create-event-rules) allows you to set actions that should be taken on events that meet your designated rule criteria.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const fooTeam = new pagerduty.Team("fooTeam", {});
 * const fooRuleset = new pagerduty.Ruleset("fooRuleset", {team: {
 *     id: fooTeam.id,
 * }});
 * const fooRulesetRule = new pagerduty.RulesetRule("fooRulesetRule", {
 *     ruleset: fooRuleset.id,
 *     position: 0,
 *     disabled: "false",
 *     timeFrame: {
 *         scheduledWeeklies: [{
 *             weekdays: [
 *                 3,
 *                 7,
 *             ],
 *             timezone: "America/Los_Angeles",
 *             startTime: "1000000",
 *             duration: "3600000",
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
 *     actions: {
 *         routes: [{
 *             value: "P5DTL0K",
 *         }],
 *         severities: [{
 *             value: "warning",
 *         }],
 *         annotates: [{
 *             value: "From Terraform",
 *         }],
 *         extractions: [{
 *             target: "dedup_key",
 *             source: "details.host",
 *             regex: "(.*)",
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Ruleset rules can be imported using using the related `ruleset` id and the `ruleset_rule` id separated by a dot, e.g.
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
     * Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
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
     * Create a RulesetRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RulesetRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RulesetRuleArgs | RulesetRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RulesetRuleState | undefined;
            inputs["actions"] = state ? state.actions : undefined;
            inputs["conditions"] = state ? state.conditions : undefined;
            inputs["disabled"] = state ? state.disabled : undefined;
            inputs["position"] = state ? state.position : undefined;
            inputs["ruleset"] = state ? state.ruleset : undefined;
            inputs["timeFrame"] = state ? state.timeFrame : undefined;
        } else {
            const args = argsOrState as RulesetRuleArgs | undefined;
            if ((!args || args.ruleset === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleset'");
            }
            inputs["actions"] = args ? args.actions : undefined;
            inputs["conditions"] = args ? args.conditions : undefined;
            inputs["disabled"] = args ? args.disabled : undefined;
            inputs["position"] = args ? args.position : undefined;
            inputs["ruleset"] = args ? args.ruleset : undefined;
            inputs["timeFrame"] = args ? args.timeFrame : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(RulesetRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RulesetRule resources.
 */
export interface RulesetRuleState {
    /**
     * Actions to apply to an event if the conditions match.
     */
    readonly actions?: pulumi.Input<inputs.RulesetRuleActions>;
    /**
     * Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
     */
    readonly conditions?: pulumi.Input<inputs.RulesetRuleConditions>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    readonly disabled?: pulumi.Input<boolean>;
    /**
     * Position/index of the rule within the ruleset.
     */
    readonly position?: pulumi.Input<number>;
    /**
     * The ID of the ruleset that the rule belongs to.
     */
    readonly ruleset?: pulumi.Input<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    readonly timeFrame?: pulumi.Input<inputs.RulesetRuleTimeFrame>;
}

/**
 * The set of arguments for constructing a RulesetRule resource.
 */
export interface RulesetRuleArgs {
    /**
     * Actions to apply to an event if the conditions match.
     */
    readonly actions?: pulumi.Input<inputs.RulesetRuleActions>;
    /**
     * Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
     */
    readonly conditions?: pulumi.Input<inputs.RulesetRuleConditions>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    readonly disabled?: pulumi.Input<boolean>;
    /**
     * Position/index of the rule within the ruleset.
     */
    readonly position?: pulumi.Input<number>;
    /**
     * The ID of the ruleset that the rule belongs to.
     */
    readonly ruleset: pulumi.Input<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    readonly timeFrame?: pulumi.Input<inputs.RulesetRuleTimeFrame>;
}
