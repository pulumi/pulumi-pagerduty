// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * A [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) can be created on a Service Event Orchestration, in order to temporarily store event data to be referenced later within the Service Event Orchestration
 *
 * ## Example of configuring a Cache Variable for a Service Event Orchestration
 *
 * This example shows creating a service `Event Orchestration` and a `Cache Variable`. This Cache Variable will count and store the number of trigger events with 'database' in its title. Then all alerts sent to this Event Orchestration will have its severity upped to 'critical' if the count has reached at least 5 triggers within the last 1 minute.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const databaseTeam = new pagerduty.Team("database_team", {name: "Database Team"});
 * const user1 = new pagerduty.User("user_1", {
 *     name: "Earline Greenholt",
 *     email: "125.greenholt.earline@graham.name",
 *     teams: [databaseTeam.id],
 * });
 * const dbEp = new pagerduty.EscalationPolicy("db_ep", {
 *     name: "Database Escalation Policy",
 *     numLoops: 2,
 *     rules: [{
 *         escalationDelayInMinutes: 10,
 *         targets: [{
 *             type: "user",
 *             id: user1.id,
 *         }],
 *     }],
 * });
 * const svc = new pagerduty.Service("svc", {
 *     name: "My Database Service",
 *     autoResolveTimeout: "14400",
 *     acknowledgementTimeout: "600",
 *     escalationPolicy: dbEp.id,
 *     alertCreation: "create_alerts_and_incidents",
 * });
 * const numDbTriggers = new pagerduty.EventOrchestrationServiceCacheVariable("num_db_triggers", {
 *     service: svc.id,
 *     name: "num_db_triggers",
 *     conditions: [{
 *         expression: "event.summary matches part 'database'",
 *     }],
 *     configuration: {
 *         type: "trigger_event_count",
 *         ttlSeconds: 60,
 *     },
 * });
 * const eventOrchestration = new pagerduty.EventOrchestrationService("event_orchestration", {
 *     service: svc.id,
 *     enableEventOrchestrationForService: true,
 *     sets: [{
 *         id: "start",
 *         rules: [{
 *             label: "Set severity to critical if we see at least 5 triggers on the DB within the last 1 minute",
 *             conditions: [{
 *                 expression: "cache_var.num_db_triggers >= 5",
 *             }],
 *             actions: {
 *                 severity: "critical",
 *             },
 *         }],
 *     }],
 *     catchAll: {
 *         actions: {},
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Cache Variables can be imported using colon-separated IDs, which is the combination of the Service Event Orchestration ID followed by the Cache Variable ID, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable cache_variable PLBP09X:138ed254-3444-44ad-8cc7-701d69def439
 * ```
 */
export class EventOrchestrationServiceCacheVariable extends pulumi.CustomResource {
    /**
     * Get an existing EventOrchestrationServiceCacheVariable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventOrchestrationServiceCacheVariableState, opts?: pulumi.CustomResourceOptions): EventOrchestrationServiceCacheVariable {
        return new EventOrchestrationServiceCacheVariable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable';

    /**
     * Returns true if the given object is an instance of EventOrchestrationServiceCacheVariable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventOrchestrationServiceCacheVariable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventOrchestrationServiceCacheVariable.__pulumiType;
    }

    /**
     * Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value.
     */
    public readonly conditions!: pulumi.Output<outputs.EventOrchestrationServiceCacheVariableCondition[] | undefined>;
    /**
     * A configuration object to define what and how values will be stored in the Cache Variable.
     */
    public readonly configuration!: pulumi.Output<outputs.EventOrchestrationServiceCacheVariableConfiguration>;
    /**
     * Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the Cache Variable associated with the Service Event Orchestration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the Service Event Orchestration to which this Cache Variable belongs.
     */
    public readonly service!: pulumi.Output<string>;

    /**
     * Create a EventOrchestrationServiceCacheVariable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventOrchestrationServiceCacheVariableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventOrchestrationServiceCacheVariableArgs | EventOrchestrationServiceCacheVariableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventOrchestrationServiceCacheVariableState | undefined;
            resourceInputs["conditions"] = state ? state.conditions : undefined;
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
        } else {
            const args = argsOrState as EventOrchestrationServiceCacheVariableArgs | undefined;
            if ((!args || args.configuration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configuration'");
            }
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            resourceInputs["conditions"] = args ? args.conditions : undefined;
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventOrchestrationServiceCacheVariable.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventOrchestrationServiceCacheVariable resources.
 */
export interface EventOrchestrationServiceCacheVariableState {
    /**
     * Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.EventOrchestrationServiceCacheVariableCondition>[]>;
    /**
     * A configuration object to define what and how values will be stored in the Cache Variable.
     */
    configuration?: pulumi.Input<inputs.EventOrchestrationServiceCacheVariableConfiguration>;
    /**
     * Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Name of the Cache Variable associated with the Service Event Orchestration.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the Service Event Orchestration to which this Cache Variable belongs.
     */
    service?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EventOrchestrationServiceCacheVariable resource.
 */
export interface EventOrchestrationServiceCacheVariableArgs {
    /**
     * Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.EventOrchestrationServiceCacheVariableCondition>[]>;
    /**
     * A configuration object to define what and how values will be stored in the Cache Variable.
     */
    configuration: pulumi.Input<inputs.EventOrchestrationServiceCacheVariableConfiguration>;
    /**
     * Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Name of the Cache Variable associated with the Service Event Orchestration.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the Service Event Orchestration to which this Cache Variable belongs.
     */
    service: pulumi.Input<string>;
}
