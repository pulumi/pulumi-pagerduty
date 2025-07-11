// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMA-list-extension-schemas) vendor that you can use for a service (e.g: Slack, Generic Webhook, ServiceNow).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const webhook = pagerduty.getExtensionSchema({
 *     name: "Generic V2 Webhook",
 * });
 * const example = new pagerduty.User("example", {
 *     name: "Howard James",
 *     email: "howard.james@example.domain",
 *     teams: [examplePagerdutyTeam.id],
 * });
 * const foo = new pagerduty.EscalationPolicy("foo", {
 *     name: "Engineering Escalation Policy",
 *     numLoops: 2,
 *     rules: [{
 *         escalationDelayInMinutes: 10,
 *         targets: [{
 *             type: "user",
 *             id: example.id,
 *         }],
 *     }],
 * });
 * const exampleService = new pagerduty.Service("example", {
 *     name: "My Web App",
 *     autoResolveTimeout: "14400",
 *     acknowledgementTimeout: "600",
 *     escalationPolicy: examplePagerdutyEscalationPolicy.id,
 * });
 * const slack = new pagerduty.Extension("slack", {
 *     name: "My Web App Extension",
 *     endpointUrl: "https://generic_webhook_url/XXXXXX/BBBBBB",
 *     extensionSchema: webhook.then(webhook => webhook.id),
 *     extensionObjects: [exampleService.id],
 * });
 * ```
 */
export function getExtensionSchema(args: GetExtensionSchemaArgs, opts?: pulumi.InvokeOptions): Promise<GetExtensionSchemaResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getExtensionSchema:getExtensionSchema", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getExtensionSchema.
 */
export interface GetExtensionSchemaArgs {
    /**
     * The extension name to use to find an extension vendor in the PagerDuty API.
     */
    name: string;
}

/**
 * A collection of values returned by getExtensionSchema.
 */
export interface GetExtensionSchemaResult {
    /**
     * The ID of the found extension vendor.
     */
    readonly id: string;
    /**
     * The short name of the found extension vendor.
     */
    readonly name: string;
    /**
     * The generic service type for this extension vendor.
     */
    readonly type: string;
}
/**
 * Use this data source to get information about a specific [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMA-list-extension-schemas) vendor that you can use for a service (e.g: Slack, Generic Webhook, ServiceNow).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const webhook = pagerduty.getExtensionSchema({
 *     name: "Generic V2 Webhook",
 * });
 * const example = new pagerduty.User("example", {
 *     name: "Howard James",
 *     email: "howard.james@example.domain",
 *     teams: [examplePagerdutyTeam.id],
 * });
 * const foo = new pagerduty.EscalationPolicy("foo", {
 *     name: "Engineering Escalation Policy",
 *     numLoops: 2,
 *     rules: [{
 *         escalationDelayInMinutes: 10,
 *         targets: [{
 *             type: "user",
 *             id: example.id,
 *         }],
 *     }],
 * });
 * const exampleService = new pagerduty.Service("example", {
 *     name: "My Web App",
 *     autoResolveTimeout: "14400",
 *     acknowledgementTimeout: "600",
 *     escalationPolicy: examplePagerdutyEscalationPolicy.id,
 * });
 * const slack = new pagerduty.Extension("slack", {
 *     name: "My Web App Extension",
 *     endpointUrl: "https://generic_webhook_url/XXXXXX/BBBBBB",
 *     extensionSchema: webhook.then(webhook => webhook.id),
 *     extensionObjects: [exampleService.id],
 * });
 * ```
 */
export function getExtensionSchemaOutput(args: GetExtensionSchemaOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetExtensionSchemaResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getExtensionSchema:getExtensionSchema", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getExtensionSchema.
 */
export interface GetExtensionSchemaOutputArgs {
    /**
     * The extension name to use to find an extension vendor in the PagerDuty API.
     */
    name: pulumi.Input<string>;
}
