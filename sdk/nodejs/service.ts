// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * A [service](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Services/get_services) represents something you monitor (like a web service, email service, or database service). It is a container for related incidents that associates them with escalation policies.
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
 *     alertCreation: "create_alerts_and_incidents",
 * });
 * ```
 *
 * ## Import
 *
 * Services can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/service:Service main PLBP09X
 * ```
 */
export class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState, opts?: pulumi.CustomResourceOptions): Service {
        return new Service(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/service:Service';

    /**
     * Returns true if the given object is an instance of Service.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Service {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Service.__pulumiType;
    }

    /**
     * Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.
     */
    public readonly acknowledgementTimeout!: pulumi.Output<string | undefined>;
    /**
     * Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "createIncidents" is default: events will create an incident that cannot be merged. Value "createAlertsAndIncidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
     */
    public readonly alertCreation!: pulumi.Output<string | undefined>;
    /**
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan.
     */
    public readonly alertGrouping!: pulumi.Output<string | undefined>;
    /**
     * The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
     */
    public readonly alertGroupingTimeout!: pulumi.Output<number | undefined>;
    /**
     * Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
     */
    public readonly autoResolveTimeout!: pulumi.Output<string | undefined>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The escalation policy used by this service.
     */
    public readonly escalationPolicy!: pulumi.Output<string>;
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    public readonly incidentUrgencyRule!: pulumi.Output<outputs.ServiceIncidentUrgencyRule>;
    public /*out*/ readonly lastIncidentTimestamp!: pulumi.Output<string>;
    /**
     * The name of the service.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly scheduledActions!: pulumi.Output<outputs.ServiceScheduledAction[] | undefined>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    public readonly supportHours!: pulumi.Output<outputs.ServiceSupportHours | undefined>;

    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceArgs | ServiceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceState | undefined;
            inputs["acknowledgementTimeout"] = state ? state.acknowledgementTimeout : undefined;
            inputs["alertCreation"] = state ? state.alertCreation : undefined;
            inputs["alertGrouping"] = state ? state.alertGrouping : undefined;
            inputs["alertGroupingTimeout"] = state ? state.alertGroupingTimeout : undefined;
            inputs["autoResolveTimeout"] = state ? state.autoResolveTimeout : undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["escalationPolicy"] = state ? state.escalationPolicy : undefined;
            inputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            inputs["incidentUrgencyRule"] = state ? state.incidentUrgencyRule : undefined;
            inputs["lastIncidentTimestamp"] = state ? state.lastIncidentTimestamp : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["scheduledActions"] = state ? state.scheduledActions : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["supportHours"] = state ? state.supportHours : undefined;
        } else {
            const args = argsOrState as ServiceArgs | undefined;
            if ((!args || args.escalationPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'escalationPolicy'");
            }
            inputs["acknowledgementTimeout"] = args ? args.acknowledgementTimeout : undefined;
            inputs["alertCreation"] = args ? args.alertCreation : undefined;
            inputs["alertGrouping"] = args ? args.alertGrouping : undefined;
            inputs["alertGroupingTimeout"] = args ? args.alertGroupingTimeout : undefined;
            inputs["autoResolveTimeout"] = args ? args.autoResolveTimeout : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["escalationPolicy"] = args ? args.escalationPolicy : undefined;
            inputs["incidentUrgencyRule"] = args ? args.incidentUrgencyRule : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["scheduledActions"] = args ? args.scheduledActions : undefined;
            inputs["supportHours"] = args ? args.supportHours : undefined;
            inputs["createdAt"] = undefined /*out*/;
            inputs["htmlUrl"] = undefined /*out*/;
            inputs["lastIncidentTimestamp"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Service.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Service resources.
 */
export interface ServiceState {
    /**
     * Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.
     */
    readonly acknowledgementTimeout?: pulumi.Input<string>;
    /**
     * Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "createIncidents" is default: events will create an incident that cannot be merged. Value "createAlertsAndIncidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
     */
    readonly alertCreation?: pulumi.Input<string>;
    /**
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan.
     */
    readonly alertGrouping?: pulumi.Input<string>;
    /**
     * The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
     */
    readonly alertGroupingTimeout?: pulumi.Input<number>;
    /**
     * Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
     */
    readonly autoResolveTimeout?: pulumi.Input<string>;
    readonly createdAt?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    /**
     * The escalation policy used by this service.
     */
    readonly escalationPolicy?: pulumi.Input<string>;
    readonly htmlUrl?: pulumi.Input<string>;
    readonly incidentUrgencyRule?: pulumi.Input<inputs.ServiceIncidentUrgencyRule>;
    readonly lastIncidentTimestamp?: pulumi.Input<string>;
    /**
     * The name of the service.
     */
    readonly name?: pulumi.Input<string>;
    readonly scheduledActions?: pulumi.Input<pulumi.Input<inputs.ServiceScheduledAction>[]>;
    readonly status?: pulumi.Input<string>;
    readonly supportHours?: pulumi.Input<inputs.ServiceSupportHours>;
}

/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    /**
     * Time in seconds that an incident changes to the Triggered State after being Acknowledged. Disabled if set to the `"null"` string.
     */
    readonly acknowledgementTimeout?: pulumi.Input<string>;
    /**
     * Must be one of two values. PagerDuty receives events from your monitoring systems and can then create incidents in different ways. Value "createIncidents" is default: events will create an incident that cannot be merged. Value "createAlertsAndIncidents" is the alternative: events will create an alert and then add it to a new incident, these incidents can be merged. This option is recommended.
     */
    readonly alertCreation?: pulumi.Input<string>;
    /**
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. If not set, each alert will create a separate incident; If value is set to `time`: All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alertGroupingTimeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; If value is set to `intelligent` - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plan.
     */
    readonly alertGrouping?: pulumi.Input<string>;
    /**
     * The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alertGrouping` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
     */
    readonly alertGroupingTimeout?: pulumi.Input<number>;
    /**
     * Time in seconds that an incident is automatically resolved if left open for that long. Disabled if set to the `"null"` string.
     */
    readonly autoResolveTimeout?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    /**
     * The escalation policy used by this service.
     */
    readonly escalationPolicy: pulumi.Input<string>;
    readonly incidentUrgencyRule?: pulumi.Input<inputs.ServiceIncidentUrgencyRule>;
    /**
     * The name of the service.
     */
    readonly name?: pulumi.Input<string>;
    readonly scheduledActions?: pulumi.Input<pulumi.Input<inputs.ServiceScheduledAction>[]>;
    readonly supportHours?: pulumi.Input<inputs.ServiceSupportHours>;
}
