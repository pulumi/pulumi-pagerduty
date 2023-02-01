// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about [list of users](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzMw-list-users) that you can use for other PagerDuty resources, optionally filtering by team ids.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const devops = pagerduty.getTeam({
 *     name: "devops",
 * });
 * const me = pagerduty.getUser({
 *     email: "me@example.com",
 * });
 * const exampleWTeam = new pagerduty.User("exampleWTeam", {email: "user-with-team@example.com"});
 * const example = new pagerduty.TeamMembership("example", {
 *     teamId: pagerduty_team.devops.id,
 *     userId: exampleWTeam.id,
 * });
 * const allUsers = pagerduty.getUsers({});
 * const fromDevopsTeam = pagerduty.getUsers({
 *     teamIds: [pagerduty_team.devops.id],
 * });
 * ```
 */
export function getUsers(args?: GetUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetUsersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getUsers:getUsers", {
        "teamIds": args.teamIds,
    }, opts);
}

/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersArgs {
    /**
     * List of team IDs. Only results related to these teams will be returned. Account must have the `teams` ability to use this parameter.
     */
    teamIds?: string[];
}

/**
 * A collection of values returned by getUsers.
 */
export interface GetUsersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly teamIds?: string[];
    /**
     * List of users queried.
     */
    readonly users: outputs.GetUsersUser[];
}
/**
 * Use this data source to get information about [list of users](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzMw-list-users) that you can use for other PagerDuty resources, optionally filtering by team ids.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const devops = pagerduty.getTeam({
 *     name: "devops",
 * });
 * const me = pagerduty.getUser({
 *     email: "me@example.com",
 * });
 * const exampleWTeam = new pagerduty.User("exampleWTeam", {email: "user-with-team@example.com"});
 * const example = new pagerduty.TeamMembership("example", {
 *     teamId: pagerduty_team.devops.id,
 *     userId: exampleWTeam.id,
 * });
 * const allUsers = pagerduty.getUsers({});
 * const fromDevopsTeam = pagerduty.getUsers({
 *     teamIds: [pagerduty_team.devops.id],
 * });
 * ```
 */
export function getUsersOutput(args?: GetUsersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUsersResult> {
    return pulumi.output(args).apply((a: any) => getUsers(a, opts))
}

/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersOutputArgs {
    /**
     * List of team IDs. Only results related to these teams will be returned. Account must have the `teams` ability to use this parameter.
     */
    teamIds?: pulumi.Input<pulumi.Input<string>[]>;
}
