// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [automation actions runner](https://developer.pagerduty.com/api-reference/aace61f84cbd0-get-an-automation-action-runner).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getAutomationActionsRunner({
 *     id: "01DBJLIGED17S1DQKQC2AV8XYZ",
 * });
 * ```
 */
export function getAutomationActionsRunner(args: GetAutomationActionsRunnerArgs, opts?: pulumi.InvokeOptions): Promise<GetAutomationActionsRunnerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getAutomationActionsRunner:getAutomationActionsRunner", {
        "description": args.description,
        "id": args.id,
        "lastSeen": args.lastSeen,
        "runbookBaseUri": args.runbookBaseUri,
    }, opts);
}

/**
 * A collection of arguments for invoking getAutomationActionsRunner.
 */
export interface GetAutomationActionsRunnerArgs {
    /**
     * (Optional) The description of the runner.
     */
    description?: string;
    /**
     * The id of the automation actions runner in the PagerDuty API.
     */
    id: string;
    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     */
    lastSeen?: string;
    /**
     * (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
     */
    runbookBaseUri?: string;
}

/**
 * A collection of values returned by getAutomationActionsRunner.
 */
export interface GetAutomationActionsRunnerResult {
    /**
     * The time runner was created. Represented as an ISO 8601 timestamp.
     */
    readonly creationTime: string;
    /**
     * (Optional) The description of the runner.
     */
    readonly description: string;
    /**
     * The ID of the found runner.
     */
    readonly id: string;
    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     */
    readonly lastSeen: string;
    /**
     * The name of the found runner.
     */
    readonly name: string;
    /**
     * (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
     */
    readonly runbookBaseUri: string;
    /**
     * The type of runner. Allowed values are `sidecar` and `runbook`.
     */
    readonly runnerType: string;
    /**
     * The type of object. The value returned will be `runner`.
     */
    readonly type: string;
}
/**
 * Use this data source to get information about a specific [automation actions runner](https://developer.pagerduty.com/api-reference/aace61f84cbd0-get-an-automation-action-runner).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getAutomationActionsRunner({
 *     id: "01DBJLIGED17S1DQKQC2AV8XYZ",
 * });
 * ```
 */
export function getAutomationActionsRunnerOutput(args: GetAutomationActionsRunnerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAutomationActionsRunnerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getAutomationActionsRunner:getAutomationActionsRunner", {
        "description": args.description,
        "id": args.id,
        "lastSeen": args.lastSeen,
        "runbookBaseUri": args.runbookBaseUri,
    }, opts);
}

/**
 * A collection of arguments for invoking getAutomationActionsRunner.
 */
export interface GetAutomationActionsRunnerOutputArgs {
    /**
     * (Optional) The description of the runner.
     */
    description?: pulumi.Input<string>;
    /**
     * The id of the automation actions runner in the PagerDuty API.
     */
    id: pulumi.Input<string>;
    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     */
    lastSeen?: pulumi.Input<string>;
    /**
     * (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
     */
    runbookBaseUri?: pulumi.Input<string>;
}
