// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * An [escalation policy](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Escalation_Policies/get_escalation_policies) determines what user or schedule will be notified first, second, and so on when an incident is triggered. Escalation policies are used by one or more services.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const exampleTeam = new pagerduty.Team("exampleTeam", {description: "All engineering"});
 * const exampleUser = new pagerduty.User("exampleUser", {
 *     email: "125.greenholt.earline@graham.name",
 *     teams: [exampleTeam.id],
 * });
 * const exampleEscalationPolicy = new pagerduty.EscalationPolicy("exampleEscalationPolicy", {
 *     numLoops: 2,
 *     teams: [exampleTeam.id],
 *     rules: [{
 *         escalationDelayInMinutes: 10,
 *         targets: [
 *             {
 *                 type: "user",
 *                 id: exampleUser.id,
 *             },
 *             {
 *                 type: "user",
 *                 id: pagerduty_user.example2.id,
 *             },
 *         ],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Escalation policies can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/escalationPolicy:EscalationPolicy main PLBP09X
 * ```
 */
export class EscalationPolicy extends pulumi.CustomResource {
    /**
     * Get an existing EscalationPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EscalationPolicyState, opts?: pulumi.CustomResourceOptions): EscalationPolicy {
        return new EscalationPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/escalationPolicy:EscalationPolicy';

    /**
     * Returns true if the given object is an instance of EscalationPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EscalationPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EscalationPolicy.__pulumiType;
    }

    public readonly description!: pulumi.Output<string>;
    /**
     * The name of the escalation policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of times the escalation policy will repeat after reaching the end of its escalation.
     */
    public readonly numLoops!: pulumi.Output<number | undefined>;
    /**
     * An Escalation rule block. Escalation rules documented below.
     */
    public readonly rules!: pulumi.Output<outputs.EscalationPolicyRule[]>;
    /**
     * Teams associated with the policy. Account must have the `teams` ability to use this parameter.
     */
    public readonly teams!: pulumi.Output<string[] | undefined>;

    /**
     * Create a EscalationPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EscalationPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EscalationPolicyArgs | EscalationPolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EscalationPolicyState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["numLoops"] = state ? state.numLoops : undefined;
            inputs["rules"] = state ? state.rules : undefined;
            inputs["teams"] = state ? state.teams : undefined;
        } else {
            const args = argsOrState as EscalationPolicyArgs | undefined;
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            inputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            inputs["name"] = args ? args.name : undefined;
            inputs["numLoops"] = args ? args.numLoops : undefined;
            inputs["rules"] = args ? args.rules : undefined;
            inputs["teams"] = args ? args.teams : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(EscalationPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EscalationPolicy resources.
 */
export interface EscalationPolicyState {
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the escalation policy.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The number of times the escalation policy will repeat after reaching the end of its escalation.
     */
    readonly numLoops?: pulumi.Input<number>;
    /**
     * An Escalation rule block. Escalation rules documented below.
     */
    readonly rules?: pulumi.Input<pulumi.Input<inputs.EscalationPolicyRule>[]>;
    /**
     * Teams associated with the policy. Account must have the `teams` ability to use this parameter.
     */
    readonly teams?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a EscalationPolicy resource.
 */
export interface EscalationPolicyArgs {
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the escalation policy.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The number of times the escalation policy will repeat after reaching the end of its escalation.
     */
    readonly numLoops?: pulumi.Input<number>;
    /**
     * An Escalation rule block. Escalation rules documented below.
     */
    readonly rules: pulumi.Input<pulumi.Input<inputs.EscalationPolicyRule>[]>;
    /**
     * Teams associated with the policy. Account must have the `teams` ability to use this parameter.
     */
    readonly teams?: pulumi.Input<pulumi.Input<string>[]>;
}
