// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * An Orchestration Router allows users to create a set of Event Rules. The Router evaluates events sent to this Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in the `catchAll` or to the "Unrouted" Orchestration if no service is specified.
 *
 * ## Example of configuring Router rules for an Orchestration
 *
 * In this example the user has defined the Router with two rules, each routing to a different service.
 *
 * This example assumes services used in the `routeTo` configuration already exists. So it does not show creation of service resource.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const router = new pagerduty.EventOrchestrationRouter("router", {
 *     eventOrchestration: pagerduty_event_orchestration.my_monitor.id,
 *     set: {
 *         id: "start",
 *         rules: [
 *             {
 *                 label: "Events relating to our relational database",
 *                 conditions: [
 *                     {
 *                         expression: "event.summary matches part 'database'",
 *                     },
 *                     {
 *                         expression: "event.source matches regex 'db[0-9]+-server'",
 *                     },
 *                 ],
 *                 actions: {
 *                     routeTo: pagerduty_service.database.id,
 *                 },
 *             },
 *             {
 *                 conditions: [{
 *                     expression: "event.summary matches part 'www'",
 *                 }],
 *                 actions: {
 *                     routeTo: pagerduty_service.www.id,
 *                 },
 *             },
 *         ],
 *     },
 *     catchAll: {
 *         actions: {
 *             routeTo: "unrouted",
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Router can be imported using the `id` of the Event Orchestration, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter router 1b49abe7-26db-4439-a715-c6d883acfb3e
 * ```
 */
export class EventOrchestrationRouter extends pulumi.CustomResource {
    /**
     * Get an existing EventOrchestrationRouter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventOrchestrationRouterState, opts?: pulumi.CustomResourceOptions): EventOrchestrationRouter {
        return new EventOrchestrationRouter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter';

    /**
     * Returns true if the given object is an instance of EventOrchestrationRouter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventOrchestrationRouter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventOrchestrationRouter.__pulumiType;
    }

    /**
     * When none of the rules match an event, the event will be routed according to the catchAll settings.
     */
    public readonly catchAll!: pulumi.Output<outputs.EventOrchestrationRouterCatchAll>;
    /**
     * ID of the Event Orchestration to which the Router belongs.
     */
    public readonly eventOrchestration!: pulumi.Output<string>;
    /**
     * The Router contains a single set of rules  (the "start" set).
     */
    public readonly set!: pulumi.Output<outputs.EventOrchestrationRouterSet>;

    /**
     * Create a EventOrchestrationRouter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventOrchestrationRouterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventOrchestrationRouterArgs | EventOrchestrationRouterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventOrchestrationRouterState | undefined;
            resourceInputs["catchAll"] = state ? state.catchAll : undefined;
            resourceInputs["eventOrchestration"] = state ? state.eventOrchestration : undefined;
            resourceInputs["set"] = state ? state.set : undefined;
        } else {
            const args = argsOrState as EventOrchestrationRouterArgs | undefined;
            if ((!args || args.catchAll === undefined) && !opts.urn) {
                throw new Error("Missing required property 'catchAll'");
            }
            if ((!args || args.eventOrchestration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventOrchestration'");
            }
            if ((!args || args.set === undefined) && !opts.urn) {
                throw new Error("Missing required property 'set'");
            }
            resourceInputs["catchAll"] = args ? args.catchAll : undefined;
            resourceInputs["eventOrchestration"] = args ? args.eventOrchestration : undefined;
            resourceInputs["set"] = args ? args.set : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventOrchestrationRouter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventOrchestrationRouter resources.
 */
export interface EventOrchestrationRouterState {
    /**
     * When none of the rules match an event, the event will be routed according to the catchAll settings.
     */
    catchAll?: pulumi.Input<inputs.EventOrchestrationRouterCatchAll>;
    /**
     * ID of the Event Orchestration to which the Router belongs.
     */
    eventOrchestration?: pulumi.Input<string>;
    /**
     * The Router contains a single set of rules  (the "start" set).
     */
    set?: pulumi.Input<inputs.EventOrchestrationRouterSet>;
}

/**
 * The set of arguments for constructing a EventOrchestrationRouter resource.
 */
export interface EventOrchestrationRouterArgs {
    /**
     * When none of the rules match an event, the event will be routed according to the catchAll settings.
     */
    catchAll: pulumi.Input<inputs.EventOrchestrationRouterCatchAll>;
    /**
     * ID of the Event Orchestration to which the Router belongs.
     */
    eventOrchestration: pulumi.Input<string>;
    /**
     * The Router contains a single set of rules  (the "start" set).
     */
    set: pulumi.Input<inputs.EventOrchestrationRouterSet>;
}
