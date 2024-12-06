// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [service](https://api-reference.pagerduty.com/#!/Services/get_services).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getService({
 *     name: "My Service",
 * });
 * const datadog = pagerduty.getVendor({
 *     name: "Datadog",
 * });
 * const exampleServiceIntegration = new pagerduty.ServiceIntegration("example", {
 *     name: "Datadog Integration",
 *     vendor: datadog.then(datadog => datadog.id),
 *     service: example.then(example => example.id),
 *     type: "generic_events_api_inbound_integration",
 * });
 * ```
 */
export function getService(args: GetServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getService:getService", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceArgs {
    /**
     * The service name to use to find a service in the PagerDuty API.
     */
    name: string;
}

/**
 * A collection of values returned by getService.
 */
export interface GetServiceResult {
    /**
     * Time in seconds that an incident changes to the Triggered State after being Acknowledged. Value is null if the feature is disabled. Value must not be negative. Setting this field to 0, null (or unset) will disable the feature.
     */
    readonly acknowledgementTimeout: number;
    /**
     * Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging.
     */
    readonly alertCreation: string;
    /**
     * Time in seconds that an incident is automatically resolved if left open for that long. Value is null if the feature is disabled. Value must not be negative. Setting this field to 0, null (or unset) will disable the feature.
     */
    readonly autoResolveTimeout: number;
    /**
     * The user-provided description of the service.
     */
    readonly description: string;
    /**
     * The escalation policy associated with this service.
     */
    readonly escalationPolicy: string;
    /**
     * The ID of the found service.
     */
    readonly id: string;
    /**
     * The short name of the found service.
     */
    readonly name: string;
    /**
     * The set of teams associated with the service.
     */
    readonly teams: outputs.GetServiceTeam[];
    /**
     * The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
     */
    readonly type: string;
}
/**
 * Use this data source to get information about a specific [service](https://api-reference.pagerduty.com/#!/Services/get_services).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = pagerduty.getService({
 *     name: "My Service",
 * });
 * const datadog = pagerduty.getVendor({
 *     name: "Datadog",
 * });
 * const exampleServiceIntegration = new pagerduty.ServiceIntegration("example", {
 *     name: "Datadog Integration",
 *     vendor: datadog.then(datadog => datadog.id),
 *     service: example.then(example => example.id),
 *     type: "generic_events_api_inbound_integration",
 * });
 * ```
 */
export function getServiceOutput(args: GetServiceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServiceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getService:getService", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceOutputArgs {
    /**
     * The service name to use to find a service in the PagerDuty API.
     */
    name: pulumi.Input<string>;
}
