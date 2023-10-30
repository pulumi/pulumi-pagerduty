// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [team](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIyMw-list-teams) that you can use for other PagerDuty resources.
 */
export function getTeam(args: GetTeamArgs, opts?: pulumi.InvokeOptions): Promise<GetTeamResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getTeam:getTeam", {
        "defaultRole": args.defaultRole,
        "name": args.name,
        "parent": args.parent,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeam.
 */
export interface GetTeamArgs {
    /**
     * (Optional) The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
     */
    defaultRole?: string;
    /**
     * The name of the team to find in the PagerDuty API.
     */
    name: string;
    /**
     * ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
     */
    parent?: string;
}

/**
 * A collection of values returned by getTeam.
 */
export interface GetTeamResult {
    /**
     * (Optional) The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
     */
    readonly defaultRole?: string;
    /**
     * A description of the found team.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the found team.
     */
    readonly name: string;
    /**
     * ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
     */
    readonly parent?: string;
}
/**
 * Use this data source to get information about a specific [team](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIyMw-list-teams) that you can use for other PagerDuty resources.
 */
export function getTeamOutput(args: GetTeamOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTeamResult> {
    return pulumi.output(args).apply((a: any) => getTeam(a, opts))
}

/**
 * A collection of arguments for invoking getTeam.
 */
export interface GetTeamOutputArgs {
    /**
     * (Optional) The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
     */
    defaultRole?: pulumi.Input<string>;
    /**
     * The name of the team to find in the PagerDuty API.
     */
    name: pulumi.Input<string>;
    /**
     * ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
     */
    parent?: pulumi.Input<string>;
}
