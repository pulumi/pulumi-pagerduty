// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * An Automation Actions [action association with a team](https://developer.pagerduty.com/api-reference/8f722dd91a4ba-associate-an-automation-action-with-a-team) configures the relation of a specific Action with a Team.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = new pagerduty.Team("example", {
 *     name: "Engineering",
 *     description: "All engineering",
 * });
 * const paActionExample = new pagerduty.AutomationActionsAction("pa_action_example", {
 *     name: "PA Action created via TF",
 *     description: "Description of the PA Action created via TF",
 *     actionType: "process_automation",
 *     actionDataReference: {
 *         processAutomationJobId: "P123456",
 *     },
 * });
 * const foo = new pagerduty.AutomationActionsActionTeamAssociation("foo", {
 *     actionId: paActionExample.id,
 *     teamId: example.id,
 * });
 * ```
 *
 * ## Import
 *
 * Action team association can be imported using the `action_id` and `team_id` separated by a colon, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
 * ```
 */
export class AutomationActionsActionTeamAssociation extends pulumi.CustomResource {
    /**
     * Get an existing AutomationActionsActionTeamAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AutomationActionsActionTeamAssociationState, opts?: pulumi.CustomResourceOptions): AutomationActionsActionTeamAssociation {
        return new AutomationActionsActionTeamAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation';

    /**
     * Returns true if the given object is an instance of AutomationActionsActionTeamAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AutomationActionsActionTeamAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AutomationActionsActionTeamAssociation.__pulumiType;
    }

    /**
     * Id of the action.
     */
    public readonly actionId!: pulumi.Output<string>;
    /**
     * Id of the team associated to the action.
     */
    public readonly teamId!: pulumi.Output<string>;

    /**
     * Create a AutomationActionsActionTeamAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AutomationActionsActionTeamAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AutomationActionsActionTeamAssociationArgs | AutomationActionsActionTeamAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AutomationActionsActionTeamAssociationState | undefined;
            resourceInputs["actionId"] = state ? state.actionId : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
        } else {
            const args = argsOrState as AutomationActionsActionTeamAssociationArgs | undefined;
            if ((!args || args.actionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actionId'");
            }
            if ((!args || args.teamId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'teamId'");
            }
            resourceInputs["actionId"] = args ? args.actionId : undefined;
            resourceInputs["teamId"] = args ? args.teamId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AutomationActionsActionTeamAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AutomationActionsActionTeamAssociation resources.
 */
export interface AutomationActionsActionTeamAssociationState {
    /**
     * Id of the action.
     */
    actionId?: pulumi.Input<string>;
    /**
     * Id of the team associated to the action.
     */
    teamId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AutomationActionsActionTeamAssociation resource.
 */
export interface AutomationActionsActionTeamAssociationArgs {
    /**
     * Id of the action.
     */
    actionId: pulumi.Input<string>;
    /**
     * Id of the team associated to the action.
     */
    teamId: pulumi.Input<string>;
}
