// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNA-list-escalation-policies) that you can use for other PagerDuty resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const test = pagerduty.getEscalationPolicy({
 *     name: "Engineering Escalation Policy",
 * });
 * const testService = new pagerduty.Service("test", {
 *     name: "My Web App",
 *     autoResolveTimeout: "14400",
 *     acknowledgementTimeout: "600",
 *     escalationPolicy: test.then(test => test.id),
 * });
 * ```
 */
export function getEscalationPolicy(args: GetEscalationPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetEscalationPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
    name: string;
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
/**
 * Use this data source to get information about a specific [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNA-list-escalation-policies) that you can use for other PagerDuty resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const test = pagerduty.getEscalationPolicy({
 *     name: "Engineering Escalation Policy",
 * });
 * const testService = new pagerduty.Service("test", {
 *     name: "My Web App",
 *     autoResolveTimeout: "14400",
 *     acknowledgementTimeout: "600",
 *     escalationPolicy: test.then(test => test.id),
 * });
 * ```
 */
export function getEscalationPolicyOutput(args: GetEscalationPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEscalationPolicyResult> {
    return pulumi.output(args).apply((a: any) => getEscalationPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getEscalationPolicy.
 */
export interface GetEscalationPolicyOutputArgs {
    /**
     * The name to use to find an escalation policy in the PagerDuty API.
     */
    name: pulumi.Input<string>;
}
