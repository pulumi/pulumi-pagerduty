// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [priority](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1priorities/get) that you can use for other PagerDuty resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const p1 = pagerduty.getPriority({
 *     name: "P1",
 * });
 * const fooRuleset = new pagerduty.Ruleset("fooRuleset", {});
 * const fooRulesetRule = new pagerduty.RulesetRule("fooRulesetRule", {
 *     ruleset: fooRuleset.id,
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
 *         priorities: [{
 *             value: pagerduty_priority.p1.id,
 *         }],
 *     },
 * });
 * ```
 */
export function getPriority(args: GetPriorityArgs, opts?: pulumi.InvokeOptions): Promise<GetPriorityResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("pagerduty:index/getPriority:getPriority", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPriority.
 */
export interface GetPriorityArgs {
    /**
     * The name of the priority to find in the PagerDuty API.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getPriority.
 */
export interface GetPriorityResult {
    /**
     * A description of the found priority.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the found priority.
     */
    readonly name: string;
}
