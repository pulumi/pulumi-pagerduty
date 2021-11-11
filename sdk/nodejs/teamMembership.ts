// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [team membership](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1teams~1%7Bid%7D~1users~1%7Buser_id%7D/put) manages memberships within a team.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const fooUser = new pagerduty.User("fooUser", {email: "foo@bar.com"});
 * const fooTeam = new pagerduty.Team("fooTeam", {description: "foo"});
 * const fooTeamMembership = new pagerduty.TeamMembership("fooTeamMembership", {
 *     userId: fooUser.id,
 *     teamId: fooTeam.id,
 *     role: "manager",
 * });
 * ```
 *
 * ## Import
 *
 * Team memberships can be imported using the `user_id` and `team_id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/teamMembership:TeamMembership main PLBP09X:PLB09Z
 * ```
 */
export class TeamMembership extends pulumi.CustomResource {
    /**
     * Get an existing TeamMembership resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamMembershipState, opts?: pulumi.CustomResourceOptions): TeamMembership {
        return new TeamMembership(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/teamMembership:TeamMembership';

    /**
     * Returns true if the given object is an instance of TeamMembership.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeamMembership {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeamMembership.__pulumiType;
    }

    /**
     * The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
     * These roles match up to user roles in the following ways:
     * * User role of `user` is a Team role of `manager`
     * * User role of `limitedUser` is a Team role of `responder`
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * The ID of the team in which the user will belong.
     */
    public readonly teamId!: pulumi.Output<string>;
    /**
     * The ID of the user to add to the team.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a TeamMembership resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamMembershipArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamMembershipArgs | TeamMembershipState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamMembershipState | undefined;
            inputs["role"] = state ? state.role : undefined;
            inputs["teamId"] = state ? state.teamId : undefined;
            inputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as TeamMembershipArgs | undefined;
            if ((!args || args.teamId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'teamId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            inputs["role"] = args ? args.role : undefined;
            inputs["teamId"] = args ? args.teamId : undefined;
            inputs["userId"] = args ? args.userId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(TeamMembership.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamMembership resources.
 */
export interface TeamMembershipState {
    /**
     * The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
     * These roles match up to user roles in the following ways:
     * * User role of `user` is a Team role of `manager`
     * * User role of `limitedUser` is a Team role of `responder`
     */
    role?: pulumi.Input<string>;
    /**
     * The ID of the team in which the user will belong.
     */
    teamId?: pulumi.Input<string>;
    /**
     * The ID of the user to add to the team.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TeamMembership resource.
 */
export interface TeamMembershipArgs {
    /**
     * The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
     * These roles match up to user roles in the following ways:
     * * User role of `user` is a Team role of `manager`
     * * User role of `limitedUser` is a Team role of `responder`
     */
    role?: pulumi.Input<string>;
    /**
     * The ID of the team in which the user will belong.
     */
    teamId: pulumi.Input<string>;
    /**
     * The ID of the user to add to the team.
     */
    userId: pulumi.Input<string>;
}
