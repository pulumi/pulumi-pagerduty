// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [contact method](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users_id_contact_methods) is a contact method for a PagerDuty user (email, phone or SMS).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = new pagerduty.User("example", {
 *     email: "125.greenholt.earline@graham.name",
 *     teams: [pagerduty_team_example.id],
 * });
 * const email = new pagerduty.UserContactMethod("email", {
 *     address: "foo@bar.com",
 *     label: "Work",
 *     type: "email_contact_method",
 *     userId: example.id,
 * });
 * const phone = new pagerduty.UserContactMethod("phone", {
 *     address: "2025550199",
 *     countryCode: 1,
 *     label: "Work",
 *     type: "phone_contact_method",
 *     userId: example.id,
 * });
 * const sms = new pagerduty.UserContactMethod("sms", {
 *     address: "2025550199",
 *     countryCode: 1,
 *     label: "Work",
 *     type: "sms_contact_method",
 *     userId: example.id,
 * });
 * ```
 *
 * ## Import
 *
 * Contact methods can be imported using the `user_id` and the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/userContactMethod:UserContactMethod main PLBP09X:PLBP09X
 * ```
 */
export class UserContactMethod extends pulumi.CustomResource {
    /**
     * Get an existing UserContactMethod resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserContactMethodState, opts?: pulumi.CustomResourceOptions): UserContactMethod {
        return new UserContactMethod(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/userContactMethod:UserContactMethod';

    /**
     * Returns true if the given object is an instance of UserContactMethod.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserContactMethod {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserContactMethod.__pulumiType;
    }

    /**
     * The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     */
    public /*out*/ readonly blacklisted!: pulumi.Output<boolean>;
    /**
     * The 1-to-3 digit country calling code. Required when using `phoneContactMethod` or `smsContactMethod`.
     */
    public readonly countryCode!: pulumi.Output<number | undefined>;
    /**
     * If true, this phone is capable of receiving SMS messages.
     */
    public /*out*/ readonly enabled!: pulumi.Output<boolean>;
    /**
     * The label (e.g., "Work", "Mobile", etc.).
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Send an abbreviated email message instead of the standard email output.
     */
    public readonly sendShortEmail!: pulumi.Output<boolean | undefined>;
    /**
     * The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The ID of the user.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a UserContactMethod resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserContactMethodArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserContactMethodArgs | UserContactMethodState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserContactMethodState | undefined;
            inputs["address"] = state ? state.address : undefined;
            inputs["blacklisted"] = state ? state.blacklisted : undefined;
            inputs["countryCode"] = state ? state.countryCode : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["sendShortEmail"] = state ? state.sendShortEmail : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as UserContactMethodArgs | undefined;
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            inputs["address"] = args ? args.address : undefined;
            inputs["countryCode"] = args ? args.countryCode : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["sendShortEmail"] = args ? args.sendShortEmail : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["userId"] = args ? args.userId : undefined;
            inputs["blacklisted"] = undefined /*out*/;
            inputs["enabled"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(UserContactMethod.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserContactMethod resources.
 */
export interface UserContactMethodState {
    /**
     * The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
     */
    readonly address?: pulumi.Input<string>;
    /**
     * If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     */
    readonly blacklisted?: pulumi.Input<boolean>;
    /**
     * The 1-to-3 digit country calling code. Required when using `phoneContactMethod` or `smsContactMethod`.
     */
    readonly countryCode?: pulumi.Input<number>;
    /**
     * If true, this phone is capable of receiving SMS messages.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The label (e.g., "Work", "Mobile", etc.).
     */
    readonly label?: pulumi.Input<string>;
    /**
     * Send an abbreviated email message instead of the standard email output.
     */
    readonly sendShortEmail?: pulumi.Input<boolean>;
    /**
     * The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The ID of the user.
     */
    readonly userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserContactMethod resource.
 */
export interface UserContactMethodArgs {
    /**
     * The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
     */
    readonly address: pulumi.Input<string>;
    /**
     * The 1-to-3 digit country calling code. Required when using `phoneContactMethod` or `smsContactMethod`.
     */
    readonly countryCode?: pulumi.Input<number>;
    /**
     * The label (e.g., "Work", "Mobile", etc.).
     */
    readonly label: pulumi.Input<string>;
    /**
     * Send an abbreviated email message instead of the standard email output.
     */
    readonly sendShortEmail?: pulumi.Input<boolean>;
    /**
     * The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
     */
    readonly type: pulumi.Input<string>;
    /**
     * The ID of the user.
     */
    readonly userId: pulumi.Input<string>;
}
