// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [Global Event Orchestrations](https://support.pagerduty.com/docs/event-orchestration#global-orchestrations) allow you define a set of Event Rules, so that when you ingest events using the Orchestration's Routing Key your events will be routed to the correct Service, based on the event's content.
 *
 * ## Example of configuring a Global Event Orchestration
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const engineering = new pagerduty.Team("engineering", {});
 * const myMonitor = new pagerduty.EventOrchestration("myMonitor", {
 *     description: "Send events to a pair of services",
 *     team: engineering.id,
 * });
 * ```
 *
 * ## Import
 *
 * EventOrchestrations can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/eventOrchestration:EventOrchestration main 19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 */
export class EventOrchestration extends pulumi.CustomResource {
    /**
     * Get an existing EventOrchestration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventOrchestrationState, opts?: pulumi.CustomResourceOptions): EventOrchestration {
        return new EventOrchestration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/eventOrchestration:EventOrchestration';

    /**
     * Returns true if the given object is an instance of EventOrchestration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventOrchestration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventOrchestration.__pulumiType;
    }

    /**
     * A human-friendly description of the Event Orchestration.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * An integration for the Event Orchestration.
     */
    public readonly integrations!: pulumi.Output<outputs.EventOrchestrationIntegration[]>;
    /**
     * Name of the Event Orchestration.
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly routes!: pulumi.Output<number>;
    /**
     * ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
     */
    public readonly team!: pulumi.Output<string | undefined>;

    /**
     * Create a EventOrchestration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EventOrchestrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventOrchestrationArgs | EventOrchestrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventOrchestrationState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["integrations"] = state ? state.integrations : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["routes"] = state ? state.routes : undefined;
            resourceInputs["team"] = state ? state.team : undefined;
        } else {
            const args = argsOrState as EventOrchestrationArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["integrations"] = args ? args.integrations : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["team"] = args ? args.team : undefined;
            resourceInputs["routes"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventOrchestration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventOrchestration resources.
 */
export interface EventOrchestrationState {
    /**
     * A human-friendly description of the Event Orchestration.
     */
    description?: pulumi.Input<string>;
    /**
     * An integration for the Event Orchestration.
     */
    integrations?: pulumi.Input<pulumi.Input<inputs.EventOrchestrationIntegration>[]>;
    /**
     * Name of the Event Orchestration.
     */
    name?: pulumi.Input<string>;
    routes?: pulumi.Input<number>;
    /**
     * ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
     */
    team?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EventOrchestration resource.
 */
export interface EventOrchestrationArgs {
    /**
     * A human-friendly description of the Event Orchestration.
     */
    description?: pulumi.Input<string>;
    /**
     * An integration for the Event Orchestration.
     */
    integrations?: pulumi.Input<pulumi.Input<inputs.EventOrchestrationIntegration>[]>;
    /**
     * Name of the Event Orchestration.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
     */
    team?: pulumi.Input<string>;
}
