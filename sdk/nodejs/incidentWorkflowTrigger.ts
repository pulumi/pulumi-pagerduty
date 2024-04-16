// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * An [Incident Workflow Trigger](https://support.pagerduty.com/docs/incident-workflows#triggers) defines when and if an [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) will be triggered.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const myFirstWorkflow = new pagerduty.IncidentWorkflow("my_first_workflow", {
 *     name: "Example Incident Workflow",
 *     description: "This Incident Workflow is an example",
 *     steps: [{
 *         name: "Send Status Update",
 *         action: "pagerduty.com:incident-workflows:send-status-update:1",
 *         inputs: [{
 *             name: "Message",
 *             value: "Example status message sent on {{current_date}}",
 *         }],
 *     }],
 * });
 * const firstService = pagerduty.getService({
 *     name: "My First Service",
 * });
 * const automaticTrigger = new pagerduty.IncidentWorkflowTrigger("automatic_trigger", {
 *     type: "conditional",
 *     workflow: myFirstWorkflow.id,
 *     services: [firstServicePagerdutyService.id],
 *     condition: "incident.priority matches 'P1'",
 *     subscribedToAllServices: false,
 * });
 * const devops = pagerduty.getTeam({
 *     name: "devops",
 * });
 * const manualTrigger = new pagerduty.IncidentWorkflowTrigger("manual_trigger", {
 *     type: "manual",
 *     workflow: myFirstWorkflow.id,
 *     services: [firstServicePagerdutyService.id],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Incident workflows can be imported using the `id`, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger pagerduty_incident_workflow_trigger PLBP09X
 * ```
 */
export class IncidentWorkflowTrigger extends pulumi.CustomResource {
    /**
     * Get an existing IncidentWorkflowTrigger resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IncidentWorkflowTriggerState, opts?: pulumi.CustomResourceOptions): IncidentWorkflowTrigger {
        return new IncidentWorkflowTrigger(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger';

    /**
     * Returns true if the given object is an instance of IncidentWorkflowTrigger.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IncidentWorkflowTrigger {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IncidentWorkflowTrigger.__pulumiType;
    }

    /**
     * A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     */
    public readonly condition!: pulumi.Output<string | undefined>;
    /**
     * A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
     */
    public readonly services!: pulumi.Output<string[] | undefined>;
    /**
     * Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
     */
    public readonly subscribedToAllServices!: pulumi.Output<boolean>;
    /**
     * [Updating causes resource replacement] May be either `manual` or `conditional`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The workflow ID for the workflow to trigger.
     */
    public readonly workflow!: pulumi.Output<string>;

    /**
     * Create a IncidentWorkflowTrigger resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IncidentWorkflowTriggerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IncidentWorkflowTriggerArgs | IncidentWorkflowTriggerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IncidentWorkflowTriggerState | undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["subscribedToAllServices"] = state ? state.subscribedToAllServices : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["workflow"] = state ? state.workflow : undefined;
        } else {
            const args = argsOrState as IncidentWorkflowTriggerArgs | undefined;
            if ((!args || args.subscribedToAllServices === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subscribedToAllServices'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.workflow === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workflow'");
            }
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["subscribedToAllServices"] = args ? args.subscribedToAllServices : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["workflow"] = args ? args.workflow : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IncidentWorkflowTrigger.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IncidentWorkflowTrigger resources.
 */
export interface IncidentWorkflowTriggerState {
    /**
     * A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     */
    condition?: pulumi.Input<string>;
    /**
     * A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
     */
    services?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
     */
    subscribedToAllServices?: pulumi.Input<boolean>;
    /**
     * [Updating causes resource replacement] May be either `manual` or `conditional`.
     */
    type?: pulumi.Input<string>;
    /**
     * The workflow ID for the workflow to trigger.
     */
    workflow?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IncidentWorkflowTrigger resource.
 */
export interface IncidentWorkflowTriggerArgs {
    /**
     * A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
     */
    condition?: pulumi.Input<string>;
    /**
     * A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
     */
    services?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
     */
    subscribedToAllServices: pulumi.Input<boolean>;
    /**
     * [Updating causes resource replacement] May be either `manual` or `conditional`.
     */
    type: pulumi.Input<string>;
    /**
     * The workflow ID for the workflow to trigger.
     */
    workflow: pulumi.Input<string>;
}
