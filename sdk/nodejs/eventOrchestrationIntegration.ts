// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * An Event Orchestration Integration allows you to create and manage multiple Integrations (and Routing Keys) per Event Orchestration _and_ will allow you to move (migrate) Integrations _between_ two Event Orchestrations.
 *
 * ## Import
 *
 * Event Orchestration Integration can be imported using colon-separated IDs, which is the combination of the Event Orchestration ID followed by the Event Orchestration Integration ID, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration integration 19acac92-027a-4ea0-b06c-bbf516519601:1b49abe7-26db-4439-a715-c6d883acfb3e
 * ```
 */
export class EventOrchestrationIntegration extends pulumi.CustomResource {
    /**
     * Get an existing EventOrchestrationIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventOrchestrationIntegrationState, opts?: pulumi.CustomResourceOptions): EventOrchestrationIntegration {
        return new EventOrchestrationIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration';

    /**
     * Returns true if the given object is an instance of EventOrchestrationIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventOrchestrationIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventOrchestrationIntegration.__pulumiType;
    }

    /**
     * ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     */
    public readonly eventOrchestration!: pulumi.Output<string>;
    /**
     * Name/description of the Integration.
     */
    public readonly label!: pulumi.Output<string>;
    public /*out*/ readonly parameters!: pulumi.Output<outputs.EventOrchestrationIntegrationParameter[]>;

    /**
     * Create a EventOrchestrationIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventOrchestrationIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventOrchestrationIntegrationArgs | EventOrchestrationIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventOrchestrationIntegrationState | undefined;
            resourceInputs["eventOrchestration"] = state ? state.eventOrchestration : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
        } else {
            const args = argsOrState as EventOrchestrationIntegrationArgs | undefined;
            if ((!args || args.eventOrchestration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventOrchestration'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            resourceInputs["eventOrchestration"] = args ? args.eventOrchestration : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["parameters"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventOrchestrationIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventOrchestrationIntegration resources.
 */
export interface EventOrchestrationIntegrationState {
    /**
     * ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     */
    eventOrchestration?: pulumi.Input<string>;
    /**
     * Name/description of the Integration.
     */
    label?: pulumi.Input<string>;
    parameters?: pulumi.Input<pulumi.Input<inputs.EventOrchestrationIntegrationParameter>[]>;
}

/**
 * The set of arguments for constructing a EventOrchestrationIntegration resource.
 */
export interface EventOrchestrationIntegrationArgs {
    /**
     * ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
     */
    eventOrchestration: pulumi.Input<string>;
    /**
     * Name/description of the Integration.
     */
    label: pulumi.Input<string>;
}
