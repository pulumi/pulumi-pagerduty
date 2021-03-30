// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [extension](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Extension_Schemas/get_extension_schemas) vendor that you can use for a service (e.g: Slack, Generic Webhook, ServiceNow).
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
 * const exampleUser = new pagerduty.User("exampleUser", {
 *     email: "howard.james@example.domain",
 *     teams: [pagerduty_team.example.id],
 * });
 * const foo = new pagerduty.EscalationPolicy("foo", {
 *     numLoops: 2,
 *     rules: [{
 *         escalationDelayInMinutes: 10,
 *         targets: [{
 *             type: "user",
 *             id: exampleUser.id,
 *         }],
 *     }],
 * });
 * const exampleService = new pagerduty.Service("exampleService", {
 *     autoResolveTimeout: 14400,
 *     acknowledgementTimeout: 600,
 *     escalationPolicy: pagerduty_escalation_policy.example.id,
 * });
 * const slack = new pagerduty.Extension("slack", {
 *     endpointUrl: "https://generic_webhook_url/XXXXXX/BBBBBB",
 *     extensionSchema: webhook.then(webhook => webhook.id),
 *     extensionObjects: [exampleService.id],
 * });
 * ```
 */
export function getExtensionSchema(args: GetExtensionSchemaArgs, opts?: pulumi.InvokeOptions): Promise<GetExtensionSchemaResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
    readonly name: string;
}

/**
 * A collection of values returned by getExtensionSchema.
 */
export interface GetExtensionSchemaResult {
    /**
     * The provider-assigned unique ID for this managed resource.
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
