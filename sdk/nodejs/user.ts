// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [user](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users) is a member of a PagerDuty account that have the ability to interact with incidents and other data on the account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = new pagerduty.User("example", {
 *     email: "125.greenholt.earline@graham.name",
 * });
 * ```
 *
 * ## Import
 *
 * Users can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/user:User main PLBP09X
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * The URL of the user's avatar.
     */
    public /*out*/ readonly avatarUrl!: pulumi.Output<string>;
    /**
     * The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
     */
    public readonly color!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string>;
    /**
     * The user's email address.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * URL at which the entity is uniquely displayed in the Web app
     */
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    /**
     * If true, the user has an outstanding invitation.
     */
    public /*out*/ readonly invitationSent!: pulumi.Output<boolean>;
    /**
     * The user's title.
     */
    public readonly jobTitle!: pulumi.Output<string | undefined>;
    /**
     * The name of the user.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The user role. Can be `admin`, `limitedUser`, `observer`, `owner`, `readOnlyUser`, `readOnlyLimitedUser`, `restrictedAccess`, or `user`.  
     * Notes:
     * * Account must have the `readOnlyUsers` ability to set a user as a `readOnlyUser` or a `readOnlyLimitedUser`, and must have advanced permissions abilities to set a user as `observer` or `restrictedAccess`.
     * * With advanced permissions, users can have both a user role (base role) and a team role. The team role can configured in the `pagerduty.TeamMembership` resource.
     * * Mapping of `role` values to Web UI user role names available in the [user roles support page](https://support.pagerduty.com/docs/advanced-permissions#roles-in-the-rest-api-and-saml).
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * A list of teams the user should belong to. Please use `pagerduty.TeamMembership` instead.
     *
     * @deprecated Use the 'pagerduty_team_membership' resource instead.
     */
    public readonly teams!: pulumi.Output<string[]>;
    /**
     * The time zone of the user. Default is account default timezone.
     */
    public readonly timeZone!: pulumi.Output<string>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            inputs["avatarUrl"] = state ? state.avatarUrl : undefined;
            inputs["color"] = state ? state.color : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["email"] = state ? state.email : undefined;
            inputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            inputs["invitationSent"] = state ? state.invitationSent : undefined;
            inputs["jobTitle"] = state ? state.jobTitle : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["role"] = state ? state.role : undefined;
            inputs["teams"] = state ? state.teams : undefined;
            inputs["timeZone"] = state ? state.timeZone : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            inputs["color"] = args ? args.color : undefined;
            inputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            inputs["email"] = args ? args.email : undefined;
            inputs["jobTitle"] = args ? args.jobTitle : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["role"] = args ? args.role : undefined;
            inputs["teams"] = args ? args.teams : undefined;
            inputs["timeZone"] = args ? args.timeZone : undefined;
            inputs["avatarUrl"] = undefined /*out*/;
            inputs["htmlUrl"] = undefined /*out*/;
            inputs["invitationSent"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(User.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * The URL of the user's avatar.
     */
    readonly avatarUrl?: pulumi.Input<string>;
    /**
     * The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
     */
    readonly color?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    /**
     * The user's email address.
     */
    readonly email?: pulumi.Input<string>;
    /**
     * URL at which the entity is uniquely displayed in the Web app
     */
    readonly htmlUrl?: pulumi.Input<string>;
    /**
     * If true, the user has an outstanding invitation.
     */
    readonly invitationSent?: pulumi.Input<boolean>;
    /**
     * The user's title.
     */
    readonly jobTitle?: pulumi.Input<string>;
    /**
     * The name of the user.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The user role. Can be `admin`, `limitedUser`, `observer`, `owner`, `readOnlyUser`, `readOnlyLimitedUser`, `restrictedAccess`, or `user`.  
     * Notes:
     * * Account must have the `readOnlyUsers` ability to set a user as a `readOnlyUser` or a `readOnlyLimitedUser`, and must have advanced permissions abilities to set a user as `observer` or `restrictedAccess`.
     * * With advanced permissions, users can have both a user role (base role) and a team role. The team role can configured in the `pagerduty.TeamMembership` resource.
     * * Mapping of `role` values to Web UI user role names available in the [user roles support page](https://support.pagerduty.com/docs/advanced-permissions#roles-in-the-rest-api-and-saml).
     */
    readonly role?: pulumi.Input<string>;
    /**
     * A list of teams the user should belong to. Please use `pagerduty.TeamMembership` instead.
     *
     * @deprecated Use the 'pagerduty_team_membership' resource instead.
     */
    readonly teams?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The time zone of the user. Default is account default timezone.
     */
    readonly timeZone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
     */
    readonly color?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    /**
     * The user's email address.
     */
    readonly email: pulumi.Input<string>;
    /**
     * The user's title.
     */
    readonly jobTitle?: pulumi.Input<string>;
    /**
     * The name of the user.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The user role. Can be `admin`, `limitedUser`, `observer`, `owner`, `readOnlyUser`, `readOnlyLimitedUser`, `restrictedAccess`, or `user`.  
     * Notes:
     * * Account must have the `readOnlyUsers` ability to set a user as a `readOnlyUser` or a `readOnlyLimitedUser`, and must have advanced permissions abilities to set a user as `observer` or `restrictedAccess`.
     * * With advanced permissions, users can have both a user role (base role) and a team role. The team role can configured in the `pagerduty.TeamMembership` resource.
     * * Mapping of `role` values to Web UI user role names available in the [user roles support page](https://support.pagerduty.com/docs/advanced-permissions#roles-in-the-rest-api-and-saml).
     */
    readonly role?: pulumi.Input<string>;
    /**
     * A list of teams the user should belong to. Please use `pagerduty.TeamMembership` instead.
     *
     * @deprecated Use the 'pagerduty_team_membership' resource instead.
     */
    readonly teams?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The time zone of the user. Default is account default timezone.
     */
    readonly timeZone?: pulumi.Input<string>;
}
