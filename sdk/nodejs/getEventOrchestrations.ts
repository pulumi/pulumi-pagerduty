// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.
 */
export function getEventOrchestrations(args: GetEventOrchestrationsArgs, opts?: pulumi.InvokeOptions): Promise<GetEventOrchestrationsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getEventOrchestrations:getEventOrchestrations", {
        "nameFilter": args.nameFilter,
    }, opts);
}

/**
 * A collection of arguments for invoking getEventOrchestrations.
 */
export interface GetEventOrchestrationsArgs {
    /**
     * The regex name of Global Event orchestrations to find in the PagerDuty API.
     */
    nameFilter: string;
}

/**
 * A collection of values returned by getEventOrchestrations.
 */
export interface GetEventOrchestrationsResult {
    readonly eventOrchestrations: outputs.GetEventOrchestrationsEventOrchestration[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The list of the Event Orchestrations which name match `nameFilter` argument.
     */
    readonly nameFilter: string;
}
/**
 * Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.
 */
export function getEventOrchestrationsOutput(args: GetEventOrchestrationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEventOrchestrationsResult> {
    return pulumi.output(args).apply((a: any) => getEventOrchestrations(a, opts))
}

/**
 * A collection of arguments for invoking getEventOrchestrations.
 */
export interface GetEventOrchestrationsOutputArgs {
    /**
     * The regex name of Global Event orchestrations to find in the PagerDuty API.
     */
    nameFilter: pulumi.Input<string>;
}
