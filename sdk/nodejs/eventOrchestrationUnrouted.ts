// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * An Unrouted Orchestration allows users to create a set of Event Rules that will be evaluated against all events that don't match any rules in the Orchestration's Router.
 *
 * The Unrouted Orchestration evaluates events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.
 *
 * ## Example of configuring Unrouted Rules for an Orchestration
 *
 * In this example of an Unrouted Orchestration, the rule matches only if the condition is matched.
 * Alerts created for events that do not match the rule will have severity level set to `info` as defined in `catchAll` block.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const unrouted = new pagerduty.EventOrchestrationUnrouted("unrouted", {
 *     eventOrchestration: myMonitor.id,
 *     sets: [{
 *         id: "start",
 *         rules: [{
 *             label: "Update the summary of un-matched Critical alerts so they're easier to spot",
 *             conditions: [{
 *                 expression: "event.severity matches 'critical'",
 *             }],
 *             actions: {
 *                 severity: "critical",
 *                 extractions: [{
 *                     target: "event.summary",
 *                     template: "[Critical Unrouted] {{event.summary}}",
 *                 }],
 *             },
 *         }],
 *     }],
 *     catchAll: {
 *         actions: {
 *             severity: "info",
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Unrouted Orchestration can be imported using the `id` of the Event Orchestration, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted unrouted 1b49abe7-26db-4439-a715-c6d883acfb3e
 * ```
 */
export class EventOrchestrationUnrouted extends pulumi.CustomResource {
    /**
     * Get an existing EventOrchestrationUnrouted resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventOrchestrationUnroutedState, opts?: pulumi.CustomResourceOptions): EventOrchestrationUnrouted {
        return new EventOrchestrationUnrouted(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted';

    /**
     * Returns true if the given object is an instance of EventOrchestrationUnrouted.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventOrchestrationUnrouted {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventOrchestrationUnrouted.__pulumiType;
    }

    /**
     * the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     */
    public readonly catchAll!: pulumi.Output<outputs.EventOrchestrationUnroutedCatchAll>;
    /**
     * The Event Orchestration to which this Unrouted Orchestration belongs to.
     */
    public readonly eventOrchestration!: pulumi.Output<string>;
    /**
     * An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     */
    public readonly sets!: pulumi.Output<outputs.EventOrchestrationUnroutedSet[]>;

    /**
     * Create a EventOrchestrationUnrouted resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventOrchestrationUnroutedArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventOrchestrationUnroutedArgs | EventOrchestrationUnroutedState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventOrchestrationUnroutedState | undefined;
            resourceInputs["catchAll"] = state ? state.catchAll : undefined;
            resourceInputs["eventOrchestration"] = state ? state.eventOrchestration : undefined;
            resourceInputs["sets"] = state ? state.sets : undefined;
        } else {
            const args = argsOrState as EventOrchestrationUnroutedArgs | undefined;
            if ((!args || args.catchAll === undefined) && !opts.urn) {
                throw new Error("Missing required property 'catchAll'");
            }
            if ((!args || args.eventOrchestration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventOrchestration'");
            }
            if ((!args || args.sets === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sets'");
            }
            resourceInputs["catchAll"] = args ? args.catchAll : undefined;
            resourceInputs["eventOrchestration"] = args ? args.eventOrchestration : undefined;
            resourceInputs["sets"] = args ? args.sets : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventOrchestrationUnrouted.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventOrchestrationUnrouted resources.
 */
export interface EventOrchestrationUnroutedState {
    /**
     * the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     */
    catchAll?: pulumi.Input<inputs.EventOrchestrationUnroutedCatchAll>;
    /**
     * The Event Orchestration to which this Unrouted Orchestration belongs to.
     */
    eventOrchestration?: pulumi.Input<string>;
    /**
     * An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     */
    sets?: pulumi.Input<pulumi.Input<inputs.EventOrchestrationUnroutedSet>[]>;
}

/**
 * The set of arguments for constructing a EventOrchestrationUnrouted resource.
 */
export interface EventOrchestrationUnroutedArgs {
    /**
     * the `catchAll` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
     */
    catchAll: pulumi.Input<inputs.EventOrchestrationUnroutedCatchAll>;
    /**
     * The Event Orchestration to which this Unrouted Orchestration belongs to.
     */
    eventOrchestration: pulumi.Input<string>;
    /**
     * An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     */
    sets: pulumi.Input<pulumi.Input<inputs.EventOrchestrationUnroutedSet>[]>;
}
