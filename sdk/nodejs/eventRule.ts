// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * *NOTE: The `pagerduty.EventRule` resource has been deprecated in favor of the pagerduty.Ruleset and pagerduty.RulesetRule resources. Please use the `ruleset` based resources for working with Event Rules.*
 *
 * An [event rule](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/) determines what happens to an event that is sent to PagerDuty by monitoring tools and other integrations.
 *
 * ## Import
 *
 * Event rules can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/eventRule:EventRule main 19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 */
export class EventRule extends pulumi.CustomResource {
    /**
     * Get an existing EventRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventRuleState, opts?: pulumi.CustomResourceOptions): EventRule {
        return new EventRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/eventRule:EventRule';

    /**
     * Returns true if the given object is an instance of EventRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventRule.__pulumiType;
    }

    /**
     * A list of one or more actions for each rule. Each action within the list is itself a list.
     */
    public readonly actionJson!: pulumi.Output<string>;
    /**
     * Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
     */
    public readonly advancedConditionJson!: pulumi.Output<string | undefined>;
    /**
     * A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
     */
    public /*out*/ readonly catchAll!: pulumi.Output<boolean>;
    /**
     * Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
     */
    public readonly conditionJson!: pulumi.Output<string>;

    /**
     * Create a EventRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventRuleArgs | EventRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventRuleState | undefined;
            resourceInputs["actionJson"] = state ? state.actionJson : undefined;
            resourceInputs["advancedConditionJson"] = state ? state.advancedConditionJson : undefined;
            resourceInputs["catchAll"] = state ? state.catchAll : undefined;
            resourceInputs["conditionJson"] = state ? state.conditionJson : undefined;
        } else {
            const args = argsOrState as EventRuleArgs | undefined;
            if ((!args || args.actionJson === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actionJson'");
            }
            if ((!args || args.conditionJson === undefined) && !opts.urn) {
                throw new Error("Missing required property 'conditionJson'");
            }
            resourceInputs["actionJson"] = args ? args.actionJson : undefined;
            resourceInputs["advancedConditionJson"] = args ? args.advancedConditionJson : undefined;
            resourceInputs["conditionJson"] = args ? args.conditionJson : undefined;
            resourceInputs["catchAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventRule resources.
 */
export interface EventRuleState {
    /**
     * A list of one or more actions for each rule. Each action within the list is itself a list.
     */
    actionJson?: pulumi.Input<string>;
    /**
     * Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
     */
    advancedConditionJson?: pulumi.Input<string>;
    /**
     * A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
     */
    catchAll?: pulumi.Input<boolean>;
    /**
     * Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
     */
    conditionJson?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EventRule resource.
 */
export interface EventRuleArgs {
    /**
     * A list of one or more actions for each rule. Each action within the list is itself a list.
     */
    actionJson: pulumi.Input<string>;
    /**
     * Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
     */
    advancedConditionJson?: pulumi.Input<string>;
    /**
     * Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
     */
    conditionJson: pulumi.Input<string>;
}
