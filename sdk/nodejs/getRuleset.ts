// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [ruleset](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1rulesets/get) that you can use for managing and grouping [event rules](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1rulesets~1%7Bid%7D~1rules/get).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getRuleset({
 *     name: "My Ruleset",
 * });
 * const foo = new pagerduty.RulesetRule("foo", {
 *     ruleset: example.then(example => example.id),
 *     position: 0,
 *     disabled: "false",
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
 *     },
 * });
 * ```
 * ### Default Global Ruleset
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const defaultGlobal = pulumi.output(pagerduty.getRuleset({
 *     name: "Default Global",
 * }));
 * ```
 */
export function getRuleset(args: GetRulesetArgs, opts?: pulumi.InvokeOptions): Promise<GetRulesetResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("pagerduty:index/getRuleset:getRuleset", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getRuleset.
 */
export interface GetRulesetArgs {
    /**
     * The name of the ruleset to find in the PagerDuty API.
     */
    name: string;
}

/**
 * A collection of values returned by getRuleset.
 */
export interface GetRulesetResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the found ruleset.
     */
    readonly name: string;
    /**
     * Routing keys routed to this ruleset.
     */
    readonly routingKeys: string[];
}

export function getRulesetOutput(args: GetRulesetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRulesetResult> {
    return pulumi.output(args).apply(a => getRuleset(a, opts))
}

/**
 * A collection of arguments for invoking getRuleset.
 */
export interface GetRulesetOutputArgs {
    /**
     * The name of the ruleset to find in the PagerDuty API.
     */
    name: pulumi.Input<string>;
}
