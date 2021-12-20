// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A special case for [extension](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1extensions/post) for ServiceNow.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const webhook = pagerduty.getExtensionSchema({
 *     name: "Generic V2 Webhook",
 * });
 * const exampleUser = new pagerduty.User("exampleUser", {email: "howard.james@example.domain"});
 * const exampleEscalationPolicy = new pagerduty.EscalationPolicy("exampleEscalationPolicy", {
 *     numLoops: 2,
 *     rules: [{
 *         escalationDelayInMinutes: 10,
 *         targets: [{
 *             type: "user",
 *             id: exampleUser.id,
 *         }],
 *     }],
 * });
 * const exampleService = new pagerduty.Service("exampleService", {
 *     autoResolveTimeout: 14400,
 *     acknowledgementTimeout: 600,
 *     escalationPolicy: exampleEscalationPolicy.id,
 * });
 * const snow = new pagerduty.ExtensionServiceNow("snow", {
 *     extensionSchema: webhook.then(webhook => webhook.id),
 *     extensionObjects: [exampleService.id],
 *     snowUser: "meeps",
 *     snowPassword: "zorz",
 *     syncOptions: "manual_sync",
 *     target: "https://foo.servicenow.com/webhook_foo",
 *     taskType: "incident",
 *     referer: "None",
 * });
 * ```
 *
 * ## Import
 *
 * Extensions can be imported using the id.e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/extensionServiceNow:ExtensionServiceNow main PLBP09X
 * ```
 */
export class ExtensionServiceNow extends pulumi.CustomResource {
    /**
     * Get an existing ExtensionServiceNow resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExtensionServiceNowState, opts?: pulumi.CustomResourceOptions): ExtensionServiceNow {
        return new ExtensionServiceNow(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/extensionServiceNow:ExtensionServiceNow';

    /**
     * Returns true if the given object is an instance of ExtensionServiceNow.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ExtensionServiceNow {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ExtensionServiceNow.__pulumiType;
    }

    public readonly endpointUrl!: pulumi.Output<string | undefined>;
    /**
     * This is the objects for which the extension applies (An array of service ids).
     */
    public readonly extensionObjects!: pulumi.Output<string[]>;
    /**
     * This is the schema for this extension.
     */
    public readonly extensionSchema!: pulumi.Output<string>;
    /**
     * URL at which the entity is uniquely displayed in the Web app.
     */
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    /**
     * The name of the service extension.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ServiceNow referer.
     */
    public readonly referer!: pulumi.Output<string>;
    /**
     * The ServiceNow password.
     */
    public readonly snowPassword!: pulumi.Output<string>;
    /**
     * The ServiceNow username.
     */
    public readonly snowUser!: pulumi.Output<string>;
    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    public readonly summary!: pulumi.Output<string>;
    /**
     * The ServiceNow sync option.
     */
    public readonly syncOptions!: pulumi.Output<string>;
    /**
     * Target Webhook URL.
     */
    public readonly target!: pulumi.Output<string>;
    /**
     * The ServiceNow task type, typically `incident`.
     */
    public readonly taskType!: pulumi.Output<string>;
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ExtensionServiceNow resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExtensionServiceNowArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExtensionServiceNowArgs | ExtensionServiceNowState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExtensionServiceNowState | undefined;
            inputs["endpointUrl"] = state ? state.endpointUrl : undefined;
            inputs["extensionObjects"] = state ? state.extensionObjects : undefined;
            inputs["extensionSchema"] = state ? state.extensionSchema : undefined;
            inputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["referer"] = state ? state.referer : undefined;
            inputs["snowPassword"] = state ? state.snowPassword : undefined;
            inputs["snowUser"] = state ? state.snowUser : undefined;
            inputs["summary"] = state ? state.summary : undefined;
            inputs["syncOptions"] = state ? state.syncOptions : undefined;
            inputs["target"] = state ? state.target : undefined;
            inputs["taskType"] = state ? state.taskType : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ExtensionServiceNowArgs | undefined;
            if ((!args || args.extensionObjects === undefined) && !opts.urn) {
                throw new Error("Missing required property 'extensionObjects'");
            }
            if ((!args || args.extensionSchema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'extensionSchema'");
            }
            if ((!args || args.referer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'referer'");
            }
            if ((!args || args.snowPassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'snowPassword'");
            }
            if ((!args || args.snowUser === undefined) && !opts.urn) {
                throw new Error("Missing required property 'snowUser'");
            }
            if ((!args || args.syncOptions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'syncOptions'");
            }
            if ((!args || args.target === undefined) && !opts.urn) {
                throw new Error("Missing required property 'target'");
            }
            if ((!args || args.taskType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'taskType'");
            }
            inputs["endpointUrl"] = args ? args.endpointUrl : undefined;
            inputs["extensionObjects"] = args ? args.extensionObjects : undefined;
            inputs["extensionSchema"] = args ? args.extensionSchema : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["referer"] = args ? args.referer : undefined;
            inputs["snowPassword"] = args ? args.snowPassword : undefined;
            inputs["snowUser"] = args ? args.snowUser : undefined;
            inputs["summary"] = args ? args.summary : undefined;
            inputs["syncOptions"] = args ? args.syncOptions : undefined;
            inputs["target"] = args ? args.target : undefined;
            inputs["taskType"] = args ? args.taskType : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["htmlUrl"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ExtensionServiceNow.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ExtensionServiceNow resources.
 */
export interface ExtensionServiceNowState {
    endpointUrl?: pulumi.Input<string>;
    /**
     * This is the objects for which the extension applies (An array of service ids).
     */
    extensionObjects?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This is the schema for this extension.
     */
    extensionSchema?: pulumi.Input<string>;
    /**
     * URL at which the entity is uniquely displayed in the Web app.
     */
    htmlUrl?: pulumi.Input<string>;
    /**
     * The name of the service extension.
     */
    name?: pulumi.Input<string>;
    /**
     * The ServiceNow referer.
     */
    referer?: pulumi.Input<string>;
    /**
     * The ServiceNow password.
     */
    snowPassword?: pulumi.Input<string>;
    /**
     * The ServiceNow username.
     */
    snowUser?: pulumi.Input<string>;
    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    summary?: pulumi.Input<string>;
    /**
     * The ServiceNow sync option.
     */
    syncOptions?: pulumi.Input<string>;
    /**
     * Target Webhook URL.
     */
    target?: pulumi.Input<string>;
    /**
     * The ServiceNow task type, typically `incident`.
     */
    taskType?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ExtensionServiceNow resource.
 */
export interface ExtensionServiceNowArgs {
    endpointUrl?: pulumi.Input<string>;
    /**
     * This is the objects for which the extension applies (An array of service ids).
     */
    extensionObjects: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This is the schema for this extension.
     */
    extensionSchema: pulumi.Input<string>;
    /**
     * The name of the service extension.
     */
    name?: pulumi.Input<string>;
    /**
     * The ServiceNow referer.
     */
    referer: pulumi.Input<string>;
    /**
     * The ServiceNow password.
     */
    snowPassword: pulumi.Input<string>;
    /**
     * The ServiceNow username.
     */
    snowUser: pulumi.Input<string>;
    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    summary?: pulumi.Input<string>;
    /**
     * The ServiceNow sync option.
     */
    syncOptions: pulumi.Input<string>;
    /**
     * Target Webhook URL.
     */
    target: pulumi.Input<string>;
    /**
     * The ServiceNow task type, typically `incident`.
     */
    taskType: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}
