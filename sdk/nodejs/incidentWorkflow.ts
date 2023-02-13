// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * An [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) is a series of steps which can be executed on an incident.
 *
 * > The Incident Workflows feature is currently available in Early Access.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const myFirstWorkflow = new pagerduty.IncidentWorkflow("myFirstWorkflow", {
 *     description: "This Incident Workflow is an example",
 *     steps: [{
 *         action: "pagerduty.com:incident-workflows:send-status-update:1",
 *         inputs: [{
 *             name: "Message",
 *             value: "Example status message sent on {{current_date}}",
 *         }],
 *         name: "Send Status Update",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Incident workflows can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/incidentWorkflow:IncidentWorkflow major_incident_workflow PLBP09X
 * ```
 */
export class IncidentWorkflow extends pulumi.CustomResource {
    /**
     * Get an existing IncidentWorkflow resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IncidentWorkflowState, opts?: pulumi.CustomResourceOptions): IncidentWorkflow {
        return new IncidentWorkflow(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/incidentWorkflow:IncidentWorkflow';

    /**
     * Returns true if the given object is an instance of IncidentWorkflow.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IncidentWorkflow {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IncidentWorkflow.__pulumiType;
    }

    /**
     * The description of the workflow.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the workflow.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The steps in the workflow.
     */
    public readonly steps!: pulumi.Output<outputs.IncidentWorkflowStep[]>;
    /**
     * A team ID. If specified then workflow edit permissions will be scoped to members of this team.
     */
    public readonly team!: pulumi.Output<string | undefined>;

    /**
     * Create a IncidentWorkflow resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: IncidentWorkflowArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IncidentWorkflowArgs | IncidentWorkflowState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IncidentWorkflowState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["steps"] = state ? state.steps : undefined;
            resourceInputs["team"] = state ? state.team : undefined;
        } else {
            const args = argsOrState as IncidentWorkflowArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["steps"] = args ? args.steps : undefined;
            resourceInputs["team"] = args ? args.team : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IncidentWorkflow.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IncidentWorkflow resources.
 */
export interface IncidentWorkflowState {
    /**
     * The description of the workflow.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the workflow.
     */
    name?: pulumi.Input<string>;
    /**
     * The steps in the workflow.
     */
    steps?: pulumi.Input<pulumi.Input<inputs.IncidentWorkflowStep>[]>;
    /**
     * A team ID. If specified then workflow edit permissions will be scoped to members of this team.
     */
    team?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IncidentWorkflow resource.
 */
export interface IncidentWorkflowArgs {
    /**
     * The description of the workflow.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the workflow.
     */
    name?: pulumi.Input<string>;
    /**
     * The steps in the workflow.
     */
    steps?: pulumi.Input<pulumi.Input<inputs.IncidentWorkflowStep>[]>;
    /**
     * A team ID. If specified then workflow edit permissions will be scoped to members of this team.
     */
    team?: pulumi.Input<string>;
}
