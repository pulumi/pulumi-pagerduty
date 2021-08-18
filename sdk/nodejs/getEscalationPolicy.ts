// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [escalation policy](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1escalation_policies/get) that you can use for other PagerDuty resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const testEscalationPolicy = pagerduty.getEscalationPolicy({
 *     name: "Engineering Escalation Policy",
 * });
 * const testService = new pagerduty.Service("testService", {
 *     autoResolveTimeout: 14400,
 *     acknowledgementTimeout: 600,
 *     escalationPolicy: testEscalationPolicy.then(testEscalationPolicy => testEscalationPolicy.id),
 * });
 * ```
 */
export function getEscalationPolicy(args: GetEscalationPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetEscalationPolicyResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("pagerduty:index/getEscalationPolicy:getEscalationPolicy", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getEscalationPolicy.
 */
export interface GetEscalationPolicyArgs {
    /**
     * The name to use to find an escalation policy in the PagerDuty API.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getEscalationPolicy.
 */
export interface GetEscalationPolicyResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The short name of the found escalation policy.
     */
    readonly name: string;
}
