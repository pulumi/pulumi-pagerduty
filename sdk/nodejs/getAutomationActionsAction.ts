// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [automation actions action](https://developer.pagerduty.com/api-reference/357ed15419f64-get-an-automation-action).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getAutomationActionsAction({
 *     id: "01CS1685B2UDM4I3XUUOXPPORM",
 * });
 * ```
 */
export function getAutomationActionsAction(args: GetAutomationActionsActionArgs, opts?: pulumi.InvokeOptions): Promise<GetAutomationActionsActionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getAutomationActionsAction:getAutomationActionsAction", {
        "actionClassification": args.actionClassification,
        "allowInvocationFromEventOrchestration": args.allowInvocationFromEventOrchestration,
        "allowInvocationManually": args.allowInvocationManually,
        "creationTime": args.creationTime,
        "description": args.description,
        "id": args.id,
        "mapToAllServices": args.mapToAllServices,
        "modifyTime": args.modifyTime,
        "onlyInvocableOnUnresolvedIncidents": args.onlyInvocableOnUnresolvedIncidents,
        "runnerId": args.runnerId,
        "runnerType": args.runnerType,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getAutomationActionsAction.
 */
export interface GetAutomationActionsActionArgs {
    /**
     * (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
     */
    actionClassification?: string;
    /**
     * (Optional) Whether or not the action can be invoked automatically from a PagerDuty Event Orchestration.
     */
    allowInvocationFromEventOrchestration?: boolean;
    /**
     * (Optional) Whether or not the action can be invoked manually by a user on the PagerDuty website.
     */
    allowInvocationManually?: boolean;
    /**
     * The time action was created. Represented as an ISO 8601 timestamp.
     */
    creationTime?: string;
    /**
     * (Optional) The description of the action.
     */
    description?: string;
    /**
     * The id of the automation actions action in the PagerDuty API.
     */
    id: string;
    /**
     * (Optional) If the action should be able to be run against all services or just specified ones.
     */
    mapToAllServices?: boolean;
    /**
     * (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     */
    modifyTime?: string;
    /**
     * (Optional) Whether or not the action can be invoked on unresolved incidents.
     */
    onlyInvocableOnUnresolvedIncidents?: boolean;
    /**
     * (Optional) The Process Automation Actions runner to associate the action with.
     */
    runnerId?: string;
    /**
     * (Optional) The type of the runner associated with the action.
     */
    runnerType?: string;
    /**
     * The type of object. The value returned will be `action`.
     */
    type?: string;
}

/**
 * A collection of values returned by getAutomationActionsAction.
 */
export interface GetAutomationActionsActionResult {
    /**
     * (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
     */
    readonly actionClassification: string;
    /**
     * Action Data block. Action Data is documented below.
     */
    readonly actionDataReferences: outputs.GetAutomationActionsActionActionDataReference[];
    /**
     * The type of the action. The only allowed values are `processAutomation` and `script`.
     */
    readonly actionType: string;
    /**
     * (Optional) Whether or not the action can be invoked automatically from a PagerDuty Event Orchestration.
     */
    readonly allowInvocationFromEventOrchestration: boolean;
    /**
     * (Optional) Whether or not the action can be invoked manually by a user on the PagerDuty website.
     */
    readonly allowInvocationManually: boolean;
    /**
     * The time action was created. Represented as an ISO 8601 timestamp.
     */
    readonly creationTime: string;
    /**
     * (Optional) The description of the action.
     */
    readonly description: string;
    /**
     * The ID of the action.
     */
    readonly id: string;
    /**
     * (Optional) If the action should be able to be run against all services or just specified ones.
     */
    readonly mapToAllServices: boolean;
    /**
     * (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     */
    readonly modifyTime: string;
    /**
     * The name of the action.
     */
    readonly name: string;
    /**
     * (Optional) Whether or not the action can be invoked on unresolved incidents.
     */
    readonly onlyInvocableOnUnresolvedIncidents: boolean;
    /**
     * (Optional) The Process Automation Actions runner to associate the action with.
     */
    readonly runnerId: string;
    /**
     * (Optional) The type of the runner associated with the action.
     */
    readonly runnerType: string;
    /**
     * The type of object. The value returned will be `action`.
     */
    readonly type: string;
}
/**
 * Use this data source to get information about a specific [automation actions action](https://developer.pagerduty.com/api-reference/357ed15419f64-get-an-automation-action).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getAutomationActionsAction({
 *     id: "01CS1685B2UDM4I3XUUOXPPORM",
 * });
 * ```
 */
export function getAutomationActionsActionOutput(args: GetAutomationActionsActionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAutomationActionsActionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getAutomationActionsAction:getAutomationActionsAction", {
        "actionClassification": args.actionClassification,
        "allowInvocationFromEventOrchestration": args.allowInvocationFromEventOrchestration,
        "allowInvocationManually": args.allowInvocationManually,
        "creationTime": args.creationTime,
        "description": args.description,
        "id": args.id,
        "mapToAllServices": args.mapToAllServices,
        "modifyTime": args.modifyTime,
        "onlyInvocableOnUnresolvedIncidents": args.onlyInvocableOnUnresolvedIncidents,
        "runnerId": args.runnerId,
        "runnerType": args.runnerType,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getAutomationActionsAction.
 */
export interface GetAutomationActionsActionOutputArgs {
    /**
     * (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
     */
    actionClassification?: pulumi.Input<string>;
    /**
     * (Optional) Whether or not the action can be invoked automatically from a PagerDuty Event Orchestration.
     */
    allowInvocationFromEventOrchestration?: pulumi.Input<boolean>;
    /**
     * (Optional) Whether or not the action can be invoked manually by a user on the PagerDuty website.
     */
    allowInvocationManually?: pulumi.Input<boolean>;
    /**
     * The time action was created. Represented as an ISO 8601 timestamp.
     */
    creationTime?: pulumi.Input<string>;
    /**
     * (Optional) The description of the action.
     */
    description?: pulumi.Input<string>;
    /**
     * The id of the automation actions action in the PagerDuty API.
     */
    id: pulumi.Input<string>;
    /**
     * (Optional) If the action should be able to be run against all services or just specified ones.
     */
    mapToAllServices?: pulumi.Input<boolean>;
    /**
     * (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
     */
    modifyTime?: pulumi.Input<string>;
    /**
     * (Optional) Whether or not the action can be invoked on unresolved incidents.
     */
    onlyInvocableOnUnresolvedIncidents?: pulumi.Input<boolean>;
    /**
     * (Optional) The Process Automation Actions runner to associate the action with.
     */
    runnerId?: pulumi.Input<string>;
    /**
     * (Optional) The type of the runner associated with the action.
     */
    runnerType?: pulumi.Input<string>;
    /**
     * The type of object. The value returned will be `action`.
     */
    type?: pulumi.Input<string>;
}
