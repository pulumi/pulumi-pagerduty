// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
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
 * const example = new pagerduty.User("example", {
 *     name: "Earline Greenholt",
 *     email: "125.greenholt.earline@graham.name",
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
 * const exampleServiceIntegration = new pagerduty.ServiceIntegration("example", {
 *     name: "Generic API Service Integration",
 *     type: "generic_events_api_inbound_integration",
 *     service: exampleService.id,
 * });
 * const apiv2 = new pagerduty.ServiceIntegration("apiv2", {
 *     name: "API V2",
 *     type: "events_api_v2_inbound_integration",
 *     service: exampleService.id,
 * });
 * const emailX = new pagerduty.ServiceIntegration("email_x", {
 *     name: "Email X",
 *     type: "generic_email_inbound_integration",
 *     integrationEmail: "ecommerce@subdomain.pagerduty.com",
 *     service: exampleService.id,
 * });
 * const datadog = pagerduty.getVendor({
 *     name: "Datadog",
 * });
 * const datadogServiceIntegration = new pagerduty.ServiceIntegration("datadog", {
 *     name: datadog.then(datadog => datadog.name),
 *     service: exampleService.id,
 *     vendor: datadog.then(datadog => datadog.id),
 * });
 * const cloudwatch = pagerduty.getVendor({
 *     name: "Cloudwatch",
 * });
 * const cloudwatchServiceIntegration = new pagerduty.ServiceIntegration("cloudwatch", {
 *     name: cloudwatch.then(cloudwatch => cloudwatch.name),
 *     service: exampleService.id,
 *     vendor: cloudwatch.then(cloudwatch => cloudwatch.id),
 * });
 * const email = pagerduty.getVendor({
 *     name: "Email",
 * });
 * const emailServiceIntegration = new pagerduty.ServiceIntegration("email", {
 *     name: email.then(email => email.name),
 *     service: exampleService.id,
 *     vendor: email.then(email => email.id),
 *     integrationEmail: "s1@your_account.pagerduty.com",
 *     emailIncidentCreation: "use_rules",
 *     emailFilterMode: "and-rules-email",
 *     emailFilters: [
 *         {
 *             bodyMode: "always",
 *             bodyRegex: null,
 *             fromEmailMode: "match",
 *             fromEmailRegex: "(@foo.test*)",
 *             subjectMode: "match",
 *             subjectRegex: "(CRITICAL*)",
 *         },
 *         {
 *             bodyMode: "always",
 *             bodyRegex: null,
 *             fromEmailMode: "match",
 *             fromEmailRegex: "(@bar.com*)",
 *             subjectMode: "match",
 *             subjectRegex: "(CRITICAL*)",
 *         },
 *     ],
 *     emailParsers: [{
 *         action: "resolve",
 *         matchPredicate: {
 *             type: "any",
 *             predicates: [
 *                 {
 *                     matcher: "foo",
 *                     part: "subject",
 *                     type: "contains",
 *                 },
 *                 {
 *                     type: "not",
 *                     predicates: [{
 *                         matcher: "(bar*)",
 *                         part: "body",
 *                         type: "regex",
 *                     }],
 *                 },
 *             ],
 *         },
 *         valueExtractors: [
 *             {
 *                 endsBefore: "end",
 *                 part: "subject",
 *                 startsAfter: "start",
 *                 type: "between",
 *                 valueName: "incident_key",
 *             },
 *             {
 *                 endsBefore: "end",
 *                 part: "subject",
 *                 startsAfter: "start",
 *                 type: "between",
 *                 valueName: "FieldName1",
 *             },
 *         ],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Services can be imported using their related `service` id and service integration `id` separated by a dot, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/serviceIntegration:ServiceIntegration main PLSSSSS.PLIIIII
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
     * Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
     */
    public readonly emailFilterMode!: pulumi.Output<string>;
    public readonly emailFilters!: pulumi.Output<outputs.ServiceIntegrationEmailFilter[]>;
    /**
     * Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
     */
    public readonly emailIncidentCreation!: pulumi.Output<string>;
    public readonly emailParsers!: pulumi.Output<outputs.ServiceIntegrationEmailParser[] | undefined>;
    /**
     * Can be `openNewIncident` or `discard`.
     */
    public readonly emailParsingFallback!: pulumi.Output<string>;
    /**
     * URL at which the entity is uniquely displayed in the Web app.
     */
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    /**
     * This is the unique fully-qualified email address used for routing emails to this integration for processing.
     */
    public readonly integrationEmail!: pulumi.Output<string>;
    /**
     * (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
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
     *
     * **Note:** This is meant for **generic** service integrations.
     * To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceIntegrationState | undefined;
            resourceInputs["emailFilterMode"] = state ? state.emailFilterMode : undefined;
            resourceInputs["emailFilters"] = state ? state.emailFilters : undefined;
            resourceInputs["emailIncidentCreation"] = state ? state.emailIncidentCreation : undefined;
            resourceInputs["emailParsers"] = state ? state.emailParsers : undefined;
            resourceInputs["emailParsingFallback"] = state ? state.emailParsingFallback : undefined;
            resourceInputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            resourceInputs["integrationEmail"] = state ? state.integrationEmail : undefined;
            resourceInputs["integrationKey"] = state ? state.integrationKey : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vendor"] = state ? state.vendor : undefined;
        } else {
            const args = argsOrState as ServiceIntegrationArgs | undefined;
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            resourceInputs["emailFilterMode"] = args ? args.emailFilterMode : undefined;
            resourceInputs["emailFilters"] = args ? args.emailFilters : undefined;
            resourceInputs["emailIncidentCreation"] = args ? args.emailIncidentCreation : undefined;
            resourceInputs["emailParsers"] = args ? args.emailParsers : undefined;
            resourceInputs["emailParsingFallback"] = args ? args.emailParsingFallback : undefined;
            resourceInputs["integrationEmail"] = args ? args.integrationEmail : undefined;
            resourceInputs["integrationKey"] = args ? args.integrationKey : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["vendor"] = args ? args.vendor : undefined;
            resourceInputs["htmlUrl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceIntegration resources.
 */
export interface ServiceIntegrationState {
    /**
     * Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
     */
    emailFilterMode?: pulumi.Input<string>;
    emailFilters?: pulumi.Input<pulumi.Input<inputs.ServiceIntegrationEmailFilter>[]>;
    /**
     * Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
     */
    emailIncidentCreation?: pulumi.Input<string>;
    emailParsers?: pulumi.Input<pulumi.Input<inputs.ServiceIntegrationEmailParser>[]>;
    /**
     * Can be `openNewIncident` or `discard`.
     */
    emailParsingFallback?: pulumi.Input<string>;
    /**
     * URL at which the entity is uniquely displayed in the Web app.
     */
    htmlUrl?: pulumi.Input<string>;
    /**
     * This is the unique fully-qualified email address used for routing emails to this integration for processing.
     */
    integrationEmail?: pulumi.Input<string>;
    /**
     * (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     */
    integrationKey?: pulumi.Input<string>;
    /**
     * The name of the service integration.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the service the integration should belong to.
     */
    service?: pulumi.Input<string>;
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
     *
     * **Note:** This is meant for **generic** service integrations.
     * To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
     */
    type?: pulumi.Input<string>;
    /**
     * The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
     */
    vendor?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceIntegration resource.
 */
export interface ServiceIntegrationArgs {
    /**
     * Mode of Emails Filters feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#configure-a-regex-filter)). Can be `all-email`, `or-rules-email` or `and-rules-email`.
     */
    emailFilterMode?: pulumi.Input<string>;
    emailFilters?: pulumi.Input<pulumi.Input<inputs.ServiceIntegrationEmailFilter>[]>;
    /**
     * Behaviour of Email Management feature ([explained in PD docs](https://support.pagerduty.com/docs/email-management-filters-and-rules#control-when-a-new-incident-or-alert-is-triggered)). Can be `onNewEmail`, `onNewEmailSubject`, `onlyIfNoOpenIncidents` or `useRules`.
     */
    emailIncidentCreation?: pulumi.Input<string>;
    emailParsers?: pulumi.Input<pulumi.Input<inputs.ServiceIntegrationEmailParser>[]>;
    /**
     * Can be `openNewIncident` or `discard`.
     */
    emailParsingFallback?: pulumi.Input<string>;
    /**
     * This is the unique fully-qualified email address used for routing emails to this integration for processing.
     */
    integrationEmail?: pulumi.Input<string>;
    /**
     * (Deprecated) This is the unique key used to route events to this integration when received via the PagerDuty Events API.
     */
    integrationKey?: pulumi.Input<string>;
    /**
     * The name of the service integration.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the service the integration should belong to.
     */
    service: pulumi.Input<string>;
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
     *
     * **Note:** This is meant for **generic** service integrations.
     * To integrate with a **vendor** (e.g. Datadog or Amazon Cloudwatch) use the `vendor` field instead.
     */
    type?: pulumi.Input<string>;
    /**
     * The ID of the vendor the integration should integrate with (e.g. Datadog or Amazon Cloudwatch).
     */
    vendor?: pulumi.Input<string>;
}
