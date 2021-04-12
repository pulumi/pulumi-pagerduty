// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * A [service event rule](https://support.pagerduty.com/docs/rulesets#service-event-rules) allows you to set actions that should be taken on events for a service that meet the designated rule criteria.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const example = new pagerduty.Service("example", {
 *     autoResolveTimeout: 14400,
 *     acknowledgementTimeout: 600,
 *     escalationPolicy: pagerduty_escalation_policy.example.id,
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
 *     service: pagerduty_service.foo.id,
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
 *
 * ## Import
 *
 * Service event rules can be imported using using the related `service` id and the `service_event_rule` id separated by a dot, e.g.
 *
 * ```sh
 *  $ pulumi import pagerduty:index/serviceEventRule:ServiceEventRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceEventRuleState | undefined;
            inputs["actions"] = state ? state.actions : undefined;
            inputs["conditions"] = state ? state.conditions : undefined;
            inputs["disabled"] = state ? state.disabled : undefined;
            inputs["position"] = state ? state.position : undefined;
            inputs["service"] = state ? state.service : undefined;
            inputs["timeFrame"] = state ? state.timeFrame : undefined;
            inputs["variables"] = state ? state.variables : undefined;
        } else {
            const args = argsOrState as ServiceEventRuleArgs | undefined;
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            inputs["actions"] = args ? args.actions : undefined;
            inputs["conditions"] = args ? args.conditions : undefined;
            inputs["disabled"] = args ? args.disabled : undefined;
            inputs["position"] = args ? args.position : undefined;
            inputs["service"] = args ? args.service : undefined;
            inputs["timeFrame"] = args ? args.timeFrame : undefined;
            inputs["variables"] = args ? args.variables : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ServiceEventRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceEventRule resources.
 */
export interface ServiceEventRuleState {
    /**
     * Actions to apply to an event if the conditions match.
     */
    readonly actions?: pulumi.Input<inputs.ServiceEventRuleActions>;
    /**
     * Conditions evaluated to check if an event matches this event rule.
     */
    readonly conditions?: pulumi.Input<inputs.ServiceEventRuleConditions>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    readonly disabled?: pulumi.Input<boolean>;
    /**
     * Position/index of the rule within the service.
     */
    readonly position?: pulumi.Input<number>;
    /**
     * The ID of the service that the rule belongs to.
     */
    readonly service?: pulumi.Input<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    readonly timeFrame?: pulumi.Input<inputs.ServiceEventRuleTimeFrame>;
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     */
    readonly variables?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleVariable>[]>;
}

/**
 * The set of arguments for constructing a ServiceEventRule resource.
 */
export interface ServiceEventRuleArgs {
    /**
     * Actions to apply to an event if the conditions match.
     */
    readonly actions?: pulumi.Input<inputs.ServiceEventRuleActions>;
    /**
     * Conditions evaluated to check if an event matches this event rule.
     */
    readonly conditions?: pulumi.Input<inputs.ServiceEventRuleConditions>;
    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    readonly disabled?: pulumi.Input<boolean>;
    /**
     * Position/index of the rule within the service.
     */
    readonly position?: pulumi.Input<number>;
    /**
     * The ID of the service that the rule belongs to.
     */
    readonly service: pulumi.Input<string>;
    /**
     * Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
     */
    readonly timeFrame?: pulumi.Input<inputs.ServiceEventRuleTimeFrame>;
    /**
     * Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
     */
    readonly variables?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleVariable>[]>;
}