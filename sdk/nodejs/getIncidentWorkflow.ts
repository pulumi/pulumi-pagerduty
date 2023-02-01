// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) so that you can create a trigger for it.
 *
 * > The Incident Workflows feature is currently available in Early Access.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const myWorkflow = pagerduty.getIncidentWorkflow({
 *     name: "Some Workflow Name",
 * });
 * const firstService = pagerduty.getService({
 *     name: "My First Service",
 * });
 * const automaticTrigger = new pagerduty.IncidentWorkflowTrigger("automaticTrigger", {
 *     type: "conditional",
 *     workflow: myWorkflow.then(myWorkflow => myWorkflow.id),
 *     services: [firstService.then(firstService => firstService.id)],
 *     condition: "incident.priority matches 'P1'",
 * });
 * ```
 */
export function getIncidentWorkflow(args: GetIncidentWorkflowArgs, opts?: pulumi.InvokeOptions): Promise<GetIncidentWorkflowResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getIncidentWorkflow:getIncidentWorkflow", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getIncidentWorkflow.
 */
export interface GetIncidentWorkflowArgs {
    /**
     * The name of the workflow.
     */
    name: string;
}

/**
 * A collection of values returned by getIncidentWorkflow.
 */
export interface GetIncidentWorkflowResult {
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * Use this data source to get information about a specific [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) so that you can create a trigger for it.
 *
 * > The Incident Workflows feature is currently available in Early Access.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const myWorkflow = pagerduty.getIncidentWorkflow({
 *     name: "Some Workflow Name",
 * });
 * const firstService = pagerduty.getService({
 *     name: "My First Service",
 * });
 * const automaticTrigger = new pagerduty.IncidentWorkflowTrigger("automaticTrigger", {
 *     type: "conditional",
 *     workflow: myWorkflow.then(myWorkflow => myWorkflow.id),
 *     services: [firstService.then(firstService => firstService.id)],
 *     condition: "incident.priority matches 'P1'",
 * });
 * ```
 */
export function getIncidentWorkflowOutput(args: GetIncidentWorkflowOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIncidentWorkflowResult> {
    return pulumi.output(args).apply((a: any) => getIncidentWorkflow(a, opts))
}

/**
 * A collection of arguments for invoking getIncidentWorkflow.
 */
export interface GetIncidentWorkflowOutputArgs {
    /**
     * The name of the workflow.
     */
    name: pulumi.Input<string>;
}
