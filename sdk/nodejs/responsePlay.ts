// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * A [response play](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE2Ng-create-a-response-play) allows you to create packages of Incident Actions that can be applied during an Incident's life cycle.
 *
 * ## Import
 *
 * Response Plays can be imported using the `id.from(email)`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/responsePlay:ResponsePlay main 16208303-022b-f745-f2f5-560e537a2a74.user@email.com
 * ```
 */
export class ResponsePlay extends pulumi.CustomResource {
    /**
     * Get an existing ResponsePlay resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResponsePlayState, opts?: pulumi.CustomResourceOptions): ResponsePlay {
        return new ResponsePlay(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/responsePlay:ResponsePlay';

    /**
     * Returns true if the given object is an instance of ResponsePlay.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResponsePlay {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResponsePlay.__pulumiType;
    }

    /**
     * The telephone number that will be set as the conference number for any incident on which this response play is run.
     */
    public readonly conferenceNumber!: pulumi.Output<string | undefined>;
    /**
     * The URL that will be set as the conference URL for any incident on which this response play is run.
     */
    public readonly conferenceUrl!: pulumi.Output<string | undefined>;
    public readonly description!: pulumi.Output<string>;
    /**
     * The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
     */
    public readonly from!: pulumi.Output<string>;
    /**
     * The name of the response play.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
     */
    public readonly responders!: pulumi.Output<outputs.ResponsePlayResponder[] | undefined>;
    /**
     * The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
     */
    public readonly respondersMessage!: pulumi.Output<string | undefined>;
    /**
     * String representing how this response play is allowed to be run. Valid options are:
     */
    public readonly runnability!: pulumi.Output<string | undefined>;
    /**
     * A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
     */
    public readonly subscribers!: pulumi.Output<outputs.ResponsePlaySubscriber[] | undefined>;
    /**
     * The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
     */
    public readonly subscribersMessage!: pulumi.Output<string | undefined>;
    /**
     * The ID of the team associated with the response play.
     */
    public readonly team!: pulumi.Output<string | undefined>;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a ResponsePlay resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResponsePlayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResponsePlayArgs | ResponsePlayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResponsePlayState | undefined;
            resourceInputs["conferenceNumber"] = state ? state.conferenceNumber : undefined;
            resourceInputs["conferenceUrl"] = state ? state.conferenceUrl : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["from"] = state ? state.from : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["responders"] = state ? state.responders : undefined;
            resourceInputs["respondersMessage"] = state ? state.respondersMessage : undefined;
            resourceInputs["runnability"] = state ? state.runnability : undefined;
            resourceInputs["subscribers"] = state ? state.subscribers : undefined;
            resourceInputs["subscribersMessage"] = state ? state.subscribersMessage : undefined;
            resourceInputs["team"] = state ? state.team : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ResponsePlayArgs | undefined;
            if ((!args || args.from === undefined) && !opts.urn) {
                throw new Error("Missing required property 'from'");
            }
            resourceInputs["conferenceNumber"] = args ? args.conferenceNumber : undefined;
            resourceInputs["conferenceUrl"] = args ? args.conferenceUrl : undefined;
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["from"] = args ? args.from : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["responders"] = args ? args.responders : undefined;
            resourceInputs["respondersMessage"] = args ? args.respondersMessage : undefined;
            resourceInputs["runnability"] = args ? args.runnability : undefined;
            resourceInputs["subscribers"] = args ? args.subscribers : undefined;
            resourceInputs["subscribersMessage"] = args ? args.subscribersMessage : undefined;
            resourceInputs["team"] = args ? args.team : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResponsePlay.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResponsePlay resources.
 */
export interface ResponsePlayState {
    /**
     * The telephone number that will be set as the conference number for any incident on which this response play is run.
     */
    conferenceNumber?: pulumi.Input<string>;
    /**
     * The URL that will be set as the conference URL for any incident on which this response play is run.
     */
    conferenceUrl?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
     */
    from?: pulumi.Input<string>;
    /**
     * The name of the response play.
     */
    name?: pulumi.Input<string>;
    /**
     * A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
     */
    responders?: pulumi.Input<pulumi.Input<inputs.ResponsePlayResponder>[]>;
    /**
     * The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
     */
    respondersMessage?: pulumi.Input<string>;
    /**
     * String representing how this response play is allowed to be run. Valid options are:
     */
    runnability?: pulumi.Input<string>;
    /**
     * A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
     */
    subscribers?: pulumi.Input<pulumi.Input<inputs.ResponsePlaySubscriber>[]>;
    /**
     * The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
     */
    subscribersMessage?: pulumi.Input<string>;
    /**
     * The ID of the team associated with the response play.
     */
    team?: pulumi.Input<string>;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResponsePlay resource.
 */
export interface ResponsePlayArgs {
    /**
     * The telephone number that will be set as the conference number for any incident on which this response play is run.
     */
    conferenceNumber?: pulumi.Input<string>;
    /**
     * The URL that will be set as the conference URL for any incident on which this response play is run.
     */
    conferenceUrl?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * The email of the user attributed to the request. Needs to be a valid email address of a user in the PagerDuty account.
     */
    from: pulumi.Input<string>;
    /**
     * The name of the response play.
     */
    name?: pulumi.Input<string>;
    /**
     * A user and/or escalation policy to be requested as a responder to any incident on which this response play is run. There can be multiple responders defined on a single response play.
     */
    responders?: pulumi.Input<pulumi.Input<inputs.ResponsePlayResponder>[]>;
    /**
     * The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
     */
    respondersMessage?: pulumi.Input<string>;
    /**
     * String representing how this response play is allowed to be run. Valid options are:
     */
    runnability?: pulumi.Input<string>;
    /**
     * A user and/or team to be added as a subscriber to any incident on which this response play is run. There can be multiple subscribers defined on a single response play.
     */
    subscribers?: pulumi.Input<pulumi.Input<inputs.ResponsePlaySubscriber>[]>;
    /**
     * The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
     */
    subscribersMessage?: pulumi.Input<string>;
    /**
     * The ID of the team associated with the response play.
     */
    team?: pulumi.Input<string>;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type?: pulumi.Input<string>;
}
