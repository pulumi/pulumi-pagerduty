// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [business service subscriber](https://developer.pagerduty.com/api-reference/b3A6NDUwNDgxOQ-list-business-service-subscribers) allows you to subscribe users or teams to automatically receive updates about key business services.
 *
 * ## Import
 *
 * Services can be imported using the `id` using the related business service ID, the subscriber type and the subscriber ID separated by a dot, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber main PLBP09X.team.PLBP09X
 * ```
 */
export class BusinessServiceSubscriber extends pulumi.CustomResource {
    /**
     * Get an existing BusinessServiceSubscriber resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BusinessServiceSubscriberState, opts?: pulumi.CustomResourceOptions): BusinessServiceSubscriber {
        return new BusinessServiceSubscriber(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber';

    /**
     * Returns true if the given object is an instance of BusinessServiceSubscriber.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BusinessServiceSubscriber {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BusinessServiceSubscriber.__pulumiType;
    }

    /**
     * The ID of the business service to subscribe to.
     */
    public readonly businessServiceId!: pulumi.Output<string>;
    /**
     * The ID of the subscriber entity.
     */
    public readonly subscriberId!: pulumi.Output<string>;
    /**
     * Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
     */
    public readonly subscriberType!: pulumi.Output<string>;

    /**
     * Create a BusinessServiceSubscriber resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BusinessServiceSubscriberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BusinessServiceSubscriberArgs | BusinessServiceSubscriberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BusinessServiceSubscriberState | undefined;
            resourceInputs["businessServiceId"] = state ? state.businessServiceId : undefined;
            resourceInputs["subscriberId"] = state ? state.subscriberId : undefined;
            resourceInputs["subscriberType"] = state ? state.subscriberType : undefined;
        } else {
            const args = argsOrState as BusinessServiceSubscriberArgs | undefined;
            if ((!args || args.businessServiceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'businessServiceId'");
            }
            if ((!args || args.subscriberId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subscriberId'");
            }
            if ((!args || args.subscriberType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subscriberType'");
            }
            resourceInputs["businessServiceId"] = args ? args.businessServiceId : undefined;
            resourceInputs["subscriberId"] = args ? args.subscriberId : undefined;
            resourceInputs["subscriberType"] = args ? args.subscriberType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BusinessServiceSubscriber.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BusinessServiceSubscriber resources.
 */
export interface BusinessServiceSubscriberState {
    /**
     * The ID of the business service to subscribe to.
     */
    businessServiceId?: pulumi.Input<string>;
    /**
     * The ID of the subscriber entity.
     */
    subscriberId?: pulumi.Input<string>;
    /**
     * Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
     */
    subscriberType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BusinessServiceSubscriber resource.
 */
export interface BusinessServiceSubscriberArgs {
    /**
     * The ID of the business service to subscribe to.
     */
    businessServiceId: pulumi.Input<string>;
    /**
     * The ID of the subscriber entity.
     */
    subscriberId: pulumi.Input<string>;
    /**
     * Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
     */
    subscriberType: pulumi.Input<string>;
}
