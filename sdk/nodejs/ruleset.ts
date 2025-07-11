// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const foo = new pagerduty.Team("foo", {name: "Engineering (Seattle)"});
 * const fooRuleset = new pagerduty.Ruleset("foo", {
 *     name: "Primary Ruleset",
 *     team: {
 *         id: foo.id,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Rulesets can be imported using the `id`, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/ruleset:Ruleset main 19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 */
export class Ruleset extends pulumi.CustomResource {
    /**
     * Get an existing Ruleset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RulesetState, opts?: pulumi.CustomResourceOptions): Ruleset {
        return new Ruleset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/ruleset:Ruleset';

    /**
     * Returns true if the given object is an instance of Ruleset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ruleset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ruleset.__pulumiType;
    }

    /**
     * Name of the ruleset.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Routing keys routed to this ruleset.
     */
    public /*out*/ readonly routingKeys!: pulumi.Output<string[]>;
    /**
     * Reference to the team that owns the ruleset. If none is specified, only admins have access.
     */
    public readonly team!: pulumi.Output<outputs.RulesetTeam | undefined>;
    /**
     * Type of ruleset. Currently, only sets to `global`.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a Ruleset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RulesetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RulesetArgs | RulesetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RulesetState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["routingKeys"] = state ? state.routingKeys : undefined;
            resourceInputs["team"] = state ? state.team : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as RulesetArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["team"] = args ? args.team : undefined;
            resourceInputs["routingKeys"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Ruleset.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ruleset resources.
 */
export interface RulesetState {
    /**
     * Name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * Routing keys routed to this ruleset.
     */
    routingKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Reference to the team that owns the ruleset. If none is specified, only admins have access.
     */
    team?: pulumi.Input<inputs.RulesetTeam>;
    /**
     * Type of ruleset. Currently, only sets to `global`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Ruleset resource.
 */
export interface RulesetArgs {
    /**
     * Name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * Reference to the team that owns the ruleset. If none is specified, only admins have access.
     */
    team?: pulumi.Input<inputs.RulesetTeam>;
}
