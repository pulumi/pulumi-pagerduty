// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about a specific [contact method](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzOQ-list-a-user-s-contact-methods) of a PagerDuty [user](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzMw-list-users) that you can use for other PagerDuty resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const me = pagerduty.getUser({
 *     email: "me@example.com",
 * });
 * const phonePush = me.then(me => pagerduty.getUserContactMethod({
 *     userId: me.id,
 *     type: "push_notification_contact_method",
 *     label: "iPhone (John)",
 * }));
 * const lowUrgencySms = new pagerduty.UserNotificationRule("low_urgency_sms", {
 *     userId: me.then(me => me.id),
 *     startDelayInMinutes: 5,
 *     urgency: "high",
 *     contactMethod: {
 *         type: "push_notification_contact_method",
 *         id: phonePush.then(phonePush => phonePush.id),
 *     },
 * });
 * ```
 */
export function getUserContactMethod(args: GetUserContactMethodArgs, opts?: pulumi.InvokeOptions): Promise<GetUserContactMethodResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pagerduty:index/getUserContactMethod:getUserContactMethod", {
        "label": args.label,
        "type": args.type,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserContactMethod.
 */
export interface GetUserContactMethodArgs {
    /**
     * The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
     */
    label: string;
    /**
     * The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
     */
    type: string;
    /**
     * The ID of the user.
     */
    userId: string;
}

/**
 * A collection of values returned by getUserContactMethod.
 */
export interface GetUserContactMethodResult {
    /**
     * The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
     */
    readonly address: string;
    /**
     * If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it. (Phone and SMS contact methods only.)
     */
    readonly blacklisted: boolean;
    /**
     * The 1-to-3 digit country calling code. (Phone and SMS contact methods only.)
     */
    readonly countryCode: number;
    /**
     * Either `ios` or `android`, depending on the type of the device receiving notifications. (Push notification contact method only.)
     */
    readonly deviceType: string;
    /**
     * If true, this phone is capable of receiving SMS messages. (Phone and SMS contact methods only.)
     */
    readonly enabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
     */
    readonly label: string;
    /**
     * Send an abbreviated email message instead of the standard email output. (Email contact method only.)
     */
    readonly sendShortEmail: boolean;
    /**
     * The type of the found contact method. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
     */
    readonly type: string;
    readonly userId: string;
}
/**
 * Use this data source to get information about a specific [contact method](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzOQ-list-a-user-s-contact-methods) of a PagerDuty [user](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzMw-list-users) that you can use for other PagerDuty resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const me = pagerduty.getUser({
 *     email: "me@example.com",
 * });
 * const phonePush = me.then(me => pagerduty.getUserContactMethod({
 *     userId: me.id,
 *     type: "push_notification_contact_method",
 *     label: "iPhone (John)",
 * }));
 * const lowUrgencySms = new pagerduty.UserNotificationRule("low_urgency_sms", {
 *     userId: me.then(me => me.id),
 *     startDelayInMinutes: 5,
 *     urgency: "high",
 *     contactMethod: {
 *         type: "push_notification_contact_method",
 *         id: phonePush.then(phonePush => phonePush.id),
 *     },
 * });
 * ```
 */
export function getUserContactMethodOutput(args: GetUserContactMethodOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUserContactMethodResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("pagerduty:index/getUserContactMethod:getUserContactMethod", {
        "label": args.label,
        "type": args.type,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getUserContactMethod.
 */
export interface GetUserContactMethodOutputArgs {
    /**
     * The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
     */
    label: pulumi.Input<string>;
    /**
     * The contact method type. May be (`emailContactMethod`, `phoneContactMethod`, `smsContactMethod`, `pushNotificationContactMethod`).
     */
    type: pulumi.Input<string>;
    /**
     * The ID of the user.
     */
    userId: pulumi.Input<string>;
}
