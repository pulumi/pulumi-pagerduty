// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * A [slack connection](https://developer.pagerduty.com/api-reference/YXBpOjExMjA5NTQ0-pager-duty-slack-integration-api) allows you to connect a workspace in Slack to a PagerDuty service or team which allows you to acknowledge and resolve PagerDuty incidents from the Slack user interface.
 *
 * **NOTES for using this resource:**
 * * To first use this resource you will need to [map your PagerDuty account to a valid Slack Workspace](https://support.pagerduty.com/docs/slack-integration-guide#integration-walkthrough). *This can only be done through the PagerDuty UI.*
 * * This resource requires a PagerDuty [user-level API key](https://support.pagerduty.com/docs/generating-api-keys#section-generating-a-personal-rest-api-key). This can be set as the `userToken` on the provider tag or as the `PAGERDUTY_USER_TOKEN` environment variable.
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const fooTeam = new pagerduty.Team("fooTeam", {});
 * const p1 = pagerduty.getPriority({
 *     name: "P1",
 * });
 * const fooSlackConnection = new pagerduty.SlackConnection("fooSlackConnection", {
 *     sourceId: fooTeam.id,
 *     sourceType: "team_reference",
 *     workspaceId: "T02A123LV1A",
 *     channelId: "C02CABCDAC9",
 *     notificationType: "responder",
 *     configs: [{
 *         events: [
 *             "incident.triggered",
 *             "incident.acknowledged",
 *             "incident.escalated",
 *             "incident.resolved",
 *             "incident.reassigned",
 *             "incident.annotated",
 *             "incident.unacknowledged",
 *             "incident.delegated",
 *             "incident.priority_updated",
 *             "incident.responder.added",
 *             "incident.responder.replied",
 *             "incident.status_update_published",
 *             "incident.reopened",
 *         ],
 *         priorities: [p1.then(p1 => p1.id)],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Slack connections can be imported using the related `workspace` ID and the `slack_connection` ID separated by a dot, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/slackConnection:SlackConnection main T02A123LV1A.PUABCDL
 * ```
 */
export class SlackConnection extends pulumi.CustomResource {
    /**
     * Get an existing SlackConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SlackConnectionState, opts?: pulumi.CustomResourceOptions): SlackConnection {
        return new SlackConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/slackConnection:SlackConnection';

    /**
     * Returns true if the given object is an instance of SlackConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SlackConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SlackConnection.__pulumiType;
    }

    /**
     * The ID of a Slack channel in the workspace.
     */
    public readonly channelId!: pulumi.Output<string>;
    public /*out*/ readonly channelName!: pulumi.Output<string>;
    /**
     * Configuration options for the Slack connection that provide options to filter events.
     */
    public readonly configs!: pulumi.Output<outputs.SlackConnectionConfig[]>;
    /**
     * Type of notification. Either `responder` or `stakeholder`.
     */
    public readonly notificationType!: pulumi.Output<string>;
    /**
     * The ID of the source in PagerDuty. Valid sources are services or teams.
     */
    public readonly sourceId!: pulumi.Output<string>;
    public /*out*/ readonly sourceName!: pulumi.Output<string>;
    /**
     * The type of the source. Either `teamReference` or `serviceReference`.
     */
    public readonly sourceType!: pulumi.Output<string>;
    /**
     * The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
     */
    public readonly workspaceId!: pulumi.Output<string>;

    /**
     * Create a SlackConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SlackConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SlackConnectionArgs | SlackConnectionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SlackConnectionState | undefined;
            inputs["channelId"] = state ? state.channelId : undefined;
            inputs["channelName"] = state ? state.channelName : undefined;
            inputs["configs"] = state ? state.configs : undefined;
            inputs["notificationType"] = state ? state.notificationType : undefined;
            inputs["sourceId"] = state ? state.sourceId : undefined;
            inputs["sourceName"] = state ? state.sourceName : undefined;
            inputs["sourceType"] = state ? state.sourceType : undefined;
            inputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as SlackConnectionArgs | undefined;
            if ((!args || args.channelId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'channelId'");
            }
            if ((!args || args.configs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configs'");
            }
            if ((!args || args.notificationType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'notificationType'");
            }
            if ((!args || args.sourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceId'");
            }
            if ((!args || args.sourceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceType'");
            }
            if ((!args || args.workspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workspaceId'");
            }
            inputs["channelId"] = args ? args.channelId : undefined;
            inputs["configs"] = args ? args.configs : undefined;
            inputs["notificationType"] = args ? args.notificationType : undefined;
            inputs["sourceId"] = args ? args.sourceId : undefined;
            inputs["sourceType"] = args ? args.sourceType : undefined;
            inputs["workspaceId"] = args ? args.workspaceId : undefined;
            inputs["channelName"] = undefined /*out*/;
            inputs["sourceName"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(SlackConnection.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SlackConnection resources.
 */
export interface SlackConnectionState {
    /**
     * The ID of a Slack channel in the workspace.
     */
    channelId?: pulumi.Input<string>;
    channelName?: pulumi.Input<string>;
    /**
     * Configuration options for the Slack connection that provide options to filter events.
     */
    configs?: pulumi.Input<pulumi.Input<inputs.SlackConnectionConfig>[]>;
    /**
     * Type of notification. Either `responder` or `stakeholder`.
     */
    notificationType?: pulumi.Input<string>;
    /**
     * The ID of the source in PagerDuty. Valid sources are services or teams.
     */
    sourceId?: pulumi.Input<string>;
    sourceName?: pulumi.Input<string>;
    /**
     * The type of the source. Either `teamReference` or `serviceReference`.
     */
    sourceType?: pulumi.Input<string>;
    /**
     * The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
     */
    workspaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SlackConnection resource.
 */
export interface SlackConnectionArgs {
    /**
     * The ID of a Slack channel in the workspace.
     */
    channelId: pulumi.Input<string>;
    /**
     * Configuration options for the Slack connection that provide options to filter events.
     */
    configs: pulumi.Input<pulumi.Input<inputs.SlackConnectionConfig>[]>;
    /**
     * Type of notification. Either `responder` or `stakeholder`.
     */
    notificationType: pulumi.Input<string>;
    /**
     * The ID of the source in PagerDuty. Valid sources are services or teams.
     */
    sourceId: pulumi.Input<string>;
    /**
     * The type of the source. Either `teamReference` or `serviceReference`.
     */
    sourceType: pulumi.Input<string>;
    /**
     * The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
     */
    workspaceId: pulumi.Input<string>;
}
