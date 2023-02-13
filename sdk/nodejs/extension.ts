// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * An [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMw-create-an-extension) can be associated with a service.
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
 *     autoResolveTimeout: "14400",
 *     acknowledgementTimeout: "600",
 *     escalationPolicy: exampleEscalationPolicy.id,
 * });
 * const slack = new pagerduty.Extension("slack", {
 *     endpointUrl: "https://generic_webhook_url/XXXXXX/BBBBBB",
 *     extensionSchema: webhook.then(webhook => webhook.id),
 *     extensionObjects: [exampleService.id],
 *     config: `{
 * 	"restrict": "any",
 * 	"notify_types": {
 * 			"resolve": false,
 * 			"acknowledge": false,
 * 			"assignments": false
 * 	},
 * 	"access_token": "XXX"
 * }
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * Extensions can be imported using the id.e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/extension:Extension main PLBP09X
 * ```
 */
export class Extension extends pulumi.CustomResource {
    /**
     * Get an existing Extension resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExtensionState, opts?: pulumi.CustomResourceOptions): Extension {
        return new Extension(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/extension:Extension';

    /**
     * Returns true if the given object is an instance of Extension.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Extension {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Extension.__pulumiType;
    }

    /**
     * The configuration of the service extension as string containing plain JSON-encoded data.
     */
    public readonly config!: pulumi.Output<string | undefined>;
    /**
     * The url of the extension.
     * **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn't accept `pagerduty.Extension` with no `endpointUrl`, but one with named `Slack` accepts.
     */
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
     * URL at which the entity is uniquely displayed in the Web app
     */
    public /*out*/ readonly htmlUrl!: pulumi.Output<string>;
    /**
     * The name of the service extension.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    public /*out*/ readonly summary!: pulumi.Output<string>;
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a Extension resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExtensionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExtensionArgs | ExtensionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExtensionState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["endpointUrl"] = state ? state.endpointUrl : undefined;
            resourceInputs["extensionObjects"] = state ? state.extensionObjects : undefined;
            resourceInputs["extensionSchema"] = state ? state.extensionSchema : undefined;
            resourceInputs["htmlUrl"] = state ? state.htmlUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["summary"] = state ? state.summary : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ExtensionArgs | undefined;
            if ((!args || args.extensionObjects === undefined) && !opts.urn) {
                throw new Error("Missing required property 'extensionObjects'");
            }
            if ((!args || args.extensionSchema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'extensionSchema'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["endpointUrl"] = args?.endpointUrl ? pulumi.secret(args.endpointUrl) : undefined;
            resourceInputs["extensionObjects"] = args ? args.extensionObjects : undefined;
            resourceInputs["extensionSchema"] = args ? args.extensionSchema : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["htmlUrl"] = undefined /*out*/;
            resourceInputs["summary"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["endpointUrl"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Extension.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Extension resources.
 */
export interface ExtensionState {
    /**
     * The configuration of the service extension as string containing plain JSON-encoded data.
     */
    config?: pulumi.Input<string>;
    /**
     * The url of the extension.
     * **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn't accept `pagerduty.Extension` with no `endpointUrl`, but one with named `Slack` accepts.
     */
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
     * URL at which the entity is uniquely displayed in the Web app
     */
    htmlUrl?: pulumi.Input<string>;
    /**
     * The name of the service extension.
     */
    name?: pulumi.Input<string>;
    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    summary?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Extension resource.
 */
export interface ExtensionArgs {
    /**
     * The configuration of the service extension as string containing plain JSON-encoded data.
     */
    config?: pulumi.Input<string>;
    /**
     * The url of the extension.
     * **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn't accept `pagerduty.Extension` with no `endpointUrl`, but one with named `Slack` accepts.
     */
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
    type?: pulumi.Input<string>;
}
