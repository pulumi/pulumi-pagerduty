// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = new pagerduty.Service("example", {
 *     name: "Checkout API Service",
 *     autoResolveTimeout: "14400",
 *     acknowledgementTimeout: "600",
 *     escalationPolicy: examplePagerdutyEscalationPolicy.id,
 *     alertCreation: "create_alerts_and_incidents",
 * });
 * const foo = new pagerduty.ServiceEventRule("foo", {
 *     service: example.id,
 *     position: 0,
 *     disabled: true,
 *     conditions: {
 *         operator: "and",
 *         subconditions: [{
 *             operator: "contains",
 *             parameters: [{
 *                 value: "disk space",
 *                 path: "summary",
 *             }],
 *         }],
 *     },
 *     variables: [{
 *         type: "regex",
 *         name: "Src",
 *         parameters: [{
 *             value: "(.*)",
 *             path: "source",
 *         }],
 *     }],
 *     actions: {
 *         annotates: [{
 *             value: "From Terraform",
 *         }],
 *         extractions: [
 *             {
 *                 target: "dedup_key",
 *                 source: "source",
 *                 regex: "(.*)",
 *             },
 *             {
 *                 target: "summary",
 *                 template: "Warning: Disk Space Low on {{Src}}",
 *             },
 *         ],
 *     },
 * });
 * const bar = new pagerduty.ServiceEventRule("bar", {
 *     service: fooPagerdutyService.id,
 *     position: 1,
 *     disabled: true,
 *     conditions: {
 *         operator: "and",
 *         subconditions: [{
 *             operator: "contains",
 *             parameters: [{
 *                 value: "cpu spike",
 *                 path: "summary",
 *             }],
 *         }],
 *     },
 *     actions: {
 *         annotates: [{
 *             value: "From Terraform",
 *         }],
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Service event rules can be imported using using the related `service` id and the `service_event_rule` id separated by a dot, e.g.
 *
 * ```sh
 * $ pulumi import pagerduty:index/serviceEventRule:ServiceEventRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 */
export class ServiceEventRule extends pulumi.CustomResource {
    /**
     * Get an existing ServiceEventRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceEventRuleState, opts?: pulumi.CustomResourceOptions): ServiceEventRule {
        return new ServiceEventRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/serviceEventRule:ServiceEventRule';

    /**
     * Returns true if the given object is an instance of ServiceEventRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceEventRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceEventRule.__pulumiType;
    }

    /**
     * Actions to apply to an event if the conditions match.
     */
    public readonly actions!: pulumi.Output<outputs.ServiceEventRuleActions | undefined>;
    /**
     * Conditions evaluated to check if an event matches this event rule.
     */
    public readonly conditions!: pulumi.Output<outputs.ServiceEventRuleConditions | undefined>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * Position/index of the rule within the service.
     */
    public readonly position!: pulumi.Output<number | undefined>;
    /**
     * The ID of the service that the rule belongs to.
     */
    public readonly service!: pulumi.Output<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    public readonly timeFrame!: pulumi.Output<outputs.ServiceEventRuleTimeFrame | undefined>;
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     */
    public readonly variables!: pulumi.Output<outputs.ServiceEventRuleVariable[] | undefined>;

    /**
     * Create a ServiceEventRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceEventRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceEventRuleArgs | ServiceEventRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceEventRuleState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["conditions"] = state ? state.conditions : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["position"] = state ? state.position : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
            resourceInputs["timeFrame"] = state ? state.timeFrame : undefined;
            resourceInputs["variables"] = state ? state.variables : undefined;
        } else {
            const args = argsOrState as ServiceEventRuleArgs | undefined;
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["conditions"] = args ? args.conditions : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["position"] = args ? args.position : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
            resourceInputs["timeFrame"] = args ? args.timeFrame : undefined;
            resourceInputs["variables"] = args ? args.variables : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceEventRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceEventRule resources.
 */
export interface ServiceEventRuleState {
    /**
     * Actions to apply to an event if the conditions match.
     */
    actions?: pulumi.Input<inputs.ServiceEventRuleActions>;
    /**
     * Conditions evaluated to check if an event matches this event rule.
     */
    conditions?: pulumi.Input<inputs.ServiceEventRuleConditions>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Position/index of the rule within the service.
     */
    position?: pulumi.Input<number>;
    /**
     * The ID of the service that the rule belongs to.
     */
    service?: pulumi.Input<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    timeFrame?: pulumi.Input<inputs.ServiceEventRuleTimeFrame>;
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     */
    variables?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleVariable>[]>;
}

/**
 * The set of arguments for constructing a ServiceEventRule resource.
 */
export interface ServiceEventRuleArgs {
    /**
     * Actions to apply to an event if the conditions match.
     */
    actions?: pulumi.Input<inputs.ServiceEventRuleActions>;
    /**
     * Conditions evaluated to check if an event matches this event rule.
     */
    conditions?: pulumi.Input<inputs.ServiceEventRuleConditions>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Position/index of the rule within the service.
     */
    position?: pulumi.Input<number>;
    /**
     * The ID of the service that the rule belongs to.
     */
    service: pulumi.Input<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    timeFrame?: pulumi.Input<inputs.ServiceEventRuleTimeFrame>;
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     */
    variables?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleVariable>[]>;
}
