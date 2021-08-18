// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [service integration](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1services~1%7Bid%7D~1integrations/post) is an integration that belongs to a service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const exampleUser = new pagerduty.User("exampleUser", {
 *     email: "125.greenholt.earline@graham.name",
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
 * const exampleServiceIntegration = new pagerduty.ServiceIntegration("exampleServiceIntegration", {
 *     type: "generic_events_api_inbound_integration",
 *     service: exampleService.id,
 * });
 * const apiv2 = new pagerduty.ServiceIntegration("apiv2", {
 *     type: "events_api_v2_inbound_integration",
 *     integrationKey: "12345678910testtesttesttesttes",
 *     service: exampleService.id,
 * });
 * const emailX = new pagerduty.ServiceIntegration("emailX", {
 *     type: "generic_email_inbound_integration",
 *     integrationEmail: "ecommerce@subdomain.pagerduty.com",
 *     service: exampleService.id,
 * });
 * const datadogVendor = pagerduty.getVendor({
 *     name: "Datadog",
 * });
 * const datadogServiceIntegration = new pagerduty.ServiceIntegration("datadogServiceIntegration", {
 *     service: exampleService.id,
 *     vendor: datadogVendor.then(datadogVendor => datadogVendor.id),
 * });
 * const cloudwatchVendor = pagerduty.getVendor({
 *     name: "Cloudwatch",
 * });
 * const cloudwatchServiceIntegration = new pagerduty.ServiceIntegration("cloudwatchServiceIntegration", {
 *     service: exampleService.id,
 *     vendor: cloudwatchVendor.then(cloudwatchVendor => cloudwatchVendor.id),
 * });
 * ```
 *
 * ## Import
 *
 * Services can be imported using their related `service` id and service integration `id` separated by a dot, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/serviceIntegration:ServiceIntegration main PLSSSSS.PLIIIII
 * ```
 */
export class ServiceIntegration extends pulumi.CustomResource {
    /**
     * Get an existing ServiceIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceIntegrationState, opts?: pulumi.CustomResourceOptions): ServiceIntegration {
        return new ServiceIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/serviceIntegration:ServiceIntegration';

    /**
     * Returns true if the given object is an instance of ServiceIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceIntegration.__pulumiType;
    }

    /**
     * URL at which the entity is uniquely displayed in the Web app
     */
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    /**
     * This is the unique fully-qualified email address used for routing emails to this integration for processing.
     */
    public readonly integrationEmail!: pulumi.Output<string>;
    /**
     * This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     */
    public readonly integrationKey!: pulumi.Output<string>;
    /**
     * The name of the service integration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the service the integration should belong to.
     */
    public readonly service!: pulumi.Output<string>;
    /**
     * The service type. Can be:
     * `awsCloudwatchInboundIntegration`,
     * `cloudkickInboundIntegration`,
     * `eventTransformerApiInboundIntegration`,
     * `eventsApiV2InboundIntegration` (requires service `alertCreation` to be `createAlertsAndIncidents`),
     * `genericEmailInboundIntegration`,
     * `genericEventsApiInboundIntegration`,
     * `keynoteInboundIntegration`,
     * `nagiosInboundIntegration`,
     * `pingdomInboundIntegration`or `sqlMonitorInboundIntegration`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
     */
    public readonly vendor!: pulumi.Output<string>;

    /**
     * Create a ServiceIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceIntegrationArgs | ServiceIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceIntegrationState | undefined;
            inputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            inputs["integrationEmail"] = state ? state.integrationEmail : undefined;
            inputs["integrationKey"] = state ? state.integrationKey : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["service"] = state ? state.service : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["vendor"] = state ? state.vendor : undefined;
        } else {
            const args = argsOrState as ServiceIntegrationArgs | undefined;
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            inputs["integrationEmail"] = args ? args.integrationEmail : undefined;
            inputs["integrationKey"] = args ? args.integrationKey : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["service"] = args ? args.service : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["vendor"] = args ? args.vendor : undefined;
            inputs["htmlUrl"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ServiceIntegration.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceIntegration resources.
 */
export interface ServiceIntegrationState {
    /**
     * URL at which the entity is uniquely displayed in the Web app
     */
    readonly htmlUrl?: pulumi.Input<string>;
    /**
     * This is the unique fully-qualified email address used for routing emails to this integration for processing.
     */
    readonly integrationEmail?: pulumi.Input<string>;
    /**
     * This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     */
    readonly integrationKey?: pulumi.Input<string>;
    /**
     * The name of the service integration.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the service the integration should belong to.
     */
    readonly service?: pulumi.Input<string>;
    /**
     * The service type. Can be:
     * `awsCloudwatchInboundIntegration`,
     * `cloudkickInboundIntegration`,
     * `eventTransformerApiInboundIntegration`,
     * `eventsApiV2InboundIntegration` (requires service `alertCreation` to be `createAlertsAndIncidents`),
     * `genericEmailInboundIntegration`,
     * `genericEventsApiInboundIntegration`,
     * `keynoteInboundIntegration`,
     * `nagiosInboundIntegration`,
     * `pingdomInboundIntegration`or `sqlMonitorInboundIntegration`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
     */
    readonly vendor?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceIntegration resource.
 */
export interface ServiceIntegrationArgs {
    /**
     * This is the unique fully-qualified email address used for routing emails to this integration for processing.
     */
    readonly integrationEmail?: pulumi.Input<string>;
    /**
     * This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     */
    readonly integrationKey?: pulumi.Input<string>;
    /**
     * The name of the service integration.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the service the integration should belong to.
     */
    readonly service: pulumi.Input<string>;
    /**
     * The service type. Can be:
     * `awsCloudwatchInboundIntegration`,
     * `cloudkickInboundIntegration`,
     * `eventTransformerApiInboundIntegration`,
     * `eventsApiV2InboundIntegration` (requires service `alertCreation` to be `createAlertsAndIncidents`),
     * `genericEmailInboundIntegration`,
     * `genericEventsApiInboundIntegration`,
     * `keynoteInboundIntegration`,
     * `nagiosInboundIntegration`,
     * `pingdomInboundIntegration`or `sqlMonitorInboundIntegration`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
     */
    readonly vendor?: pulumi.Input<string>;
}
