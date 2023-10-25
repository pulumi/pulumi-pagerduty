// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * A [maintenance window](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE1OA-create-a-maintenance-window) is used to temporarily disable one or more services for a set period of time. No incidents will be triggered and no notifications will be received while a service is disabled by a maintenance window.
 *
 * Maintenance windows are specified to start at a certain time and end after they have begun. Once started, a maintenance window cannot be deleted; it can only be ended immediately to re-enable the service.
 *
 * ## Import
 *
 * Maintenance windows can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/maintenanceWindow:MaintenanceWindow main PLBP09X
 * ```
 */
export class MaintenanceWindow extends pulumi.CustomResource {
    /**
     * Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MaintenanceWindowState, opts?: pulumi.CustomResourceOptions): MaintenanceWindow {
        return new MaintenanceWindow(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/maintenanceWindow:MaintenanceWindow';

    /**
     * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MaintenanceWindow {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MaintenanceWindow.__pulumiType;
    }

    /**
     * A description for the maintenance window.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `startTime`.
     */
    public readonly endTime!: pulumi.Output<string>;
    /**
     * A list of service IDs to include in the maintenance window.
     */
    public readonly services!: pulumi.Output<string[]>;
    /**
     * The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
     */
    public readonly startTime!: pulumi.Output<string>;

    /**
     * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MaintenanceWindowArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MaintenanceWindowArgs | MaintenanceWindowState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MaintenanceWindowState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["endTime"] = state ? state.endTime : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["startTime"] = state ? state.startTime : undefined;
        } else {
            const args = argsOrState as MaintenanceWindowArgs | undefined;
            if ((!args || args.endTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endTime'");
            }
            if ((!args || args.services === undefined) && !opts.urn) {
                throw new Error("Missing required property 'services'");
            }
            if ((!args || args.startTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'startTime'");
            }
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["endTime"] = args ? args.endTime : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["startTime"] = args ? args.startTime : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MaintenanceWindow.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MaintenanceWindow resources.
 */
export interface MaintenanceWindowState {
    /**
     * A description for the maintenance window.
     */
    description?: pulumi.Input<string>;
    /**
     * The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `startTime`.
     */
    endTime?: pulumi.Input<string>;
    /**
     * A list of service IDs to include in the maintenance window.
     */
    services?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
     */
    startTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MaintenanceWindow resource.
 */
export interface MaintenanceWindowArgs {
    /**
     * A description for the maintenance window.
     */
    description?: pulumi.Input<string>;
    /**
     * The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `startTime`.
     */
    endTime: pulumi.Input<string>;
    /**
     * A list of service IDs to include in the maintenance window.
     */
    services: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
     */
    startTime: pulumi.Input<string>;
}
