// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface EscalationPolicyRule {
    /**
     * The number of minutes before an unacknowledged incident escalates away from this rule.
     */
    escalationDelayInMinutes: pulumi.Input<number>;
    /**
     * A target ID
     */
    id?: pulumi.Input<string>;
    targets: pulumi.Input<pulumi.Input<inputs.EscalationPolicyRuleTarget>[]>;
}

export interface EscalationPolicyRuleTarget {
    /**
     * A target ID
     */
    id: pulumi.Input<string>;
    /**
     * Can be `userReference` or `scheduleReference`. Defaults to `userReference`. For multiple users as example, repeat the target.
     */
    type?: pulumi.Input<string>;
}

export interface ResponsePlayResponder {
    /**
     * Description of escalation policy
     */
    description?: pulumi.Input<string>;
    /**
     * The escalation rules
     */
    escalationRules?: pulumi.Input<pulumi.Input<inputs.ResponsePlayResponderEscalationRule>[]>;
    /**
     * ID of the user defined as the responder
     */
    id?: pulumi.Input<string>;
    /**
     * Name of the escalation policy
     */
    name?: pulumi.Input<string>;
    /**
     * The number of times the escalation policy will repeat after reaching the end of its escalation.
     */
    numLoops?: pulumi.Input<number>;
    /**
     * Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "ifHasServices". Could be "ifHasServices", "always
     */
    onCallHandoffNotifications?: pulumi.Input<string>;
    /**
     * There can be multiple services associated with a policy.
     */
    services?: pulumi.Input<pulumi.Input<inputs.ResponsePlayResponderService>[]>;
    /**
     * Teams associated with the policy. Account must have the `teams` ability to use this parameter. There can be multiple teams associated with a policy.
     */
    teams?: pulumi.Input<pulumi.Input<inputs.ResponsePlayResponderTeam>[]>;
    /**
     * Type of object of the target. Supported types are `userReference`, `scheduleReference`.
     */
    type?: pulumi.Input<string>;
}

export interface ResponsePlayResponderEscalationRule {
    /**
     * The number of minutes before an unacknowledged incident escalates away from this rule.
     */
    escalationDelayInMinutes?: pulumi.Input<number>;
    /**
     * ID of the user defined as the responder
     */
    id?: pulumi.Input<string>;
    /**
     * The targets an incident should be assigned to upon reaching this rule.
     */
    targets: pulumi.Input<pulumi.Input<inputs.ResponsePlayResponderEscalationRuleTarget>[]>;
}

export interface ResponsePlayResponderEscalationRuleTarget {
    /**
     * ID of the user defined as the responder
     */
    id?: pulumi.Input<string>;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type?: pulumi.Input<string>;
}

export interface ResponsePlayResponderService {
    /**
     * ID of the user defined as the responder
     */
    id?: pulumi.Input<string>;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type?: pulumi.Input<string>;
}

export interface ResponsePlayResponderTeam {
    /**
     * ID of the user defined as the responder
     */
    id?: pulumi.Input<string>;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type: pulumi.Input<string>;
}

export interface ResponsePlaySubscriber {
    /**
     * ID of the user defined as the responder
     */
    id?: pulumi.Input<string>;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type?: pulumi.Input<string>;
}

export interface RulesetRuleActions {
    /**
     * Note added to the event.
     */
    annotates?: pulumi.Input<pulumi.Input<inputs.RulesetRuleActionsAnnotate>[]>;
    /**
     * An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
     */
    eventActions?: pulumi.Input<pulumi.Input<inputs.RulesetRuleActionsEventAction>[]>;
    /**
     * Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
     */
    extractions?: pulumi.Input<pulumi.Input<inputs.RulesetRuleActionsExtraction>[]>;
    /**
     * The ID of the priority applied to the event.
     */
    priorities?: pulumi.Input<pulumi.Input<inputs.RulesetRuleActionsPriority>[]>;
    /**
     * The ID of the service where the event will be routed.
     */
    routes?: pulumi.Input<pulumi.Input<inputs.RulesetRuleActionsRoute>[]>;
    /**
     * The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`warning`,`error`, or `critical`.
     */
    severities?: pulumi.Input<pulumi.Input<inputs.RulesetRuleActionsSeverity>[]>;
    /**
     * Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident). Note: If a threshold is set, the rule must also have a `route` action.
     */
    suppresses?: pulumi.Input<pulumi.Input<inputs.RulesetRuleActionsSuppress>[]>;
    /**
     * An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering. Note: A rule with a `suspend` action must also have a `route` action.
     */
    suspends?: pulumi.Input<pulumi.Input<inputs.RulesetRuleActionsSuspend>[]>;
}

export interface RulesetRuleActionsAnnotate {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<string>;
}

export interface RulesetRuleActionsEventAction {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<string>;
}

export interface RulesetRuleActionsExtraction {
    /**
     * The conditions that need to be met for the extraction to happen. Must use valid [RE2 regular expression syntax](https://github.com/google/re2/wiki/Syntax).
     */
    regex?: pulumi.Input<string>;
    /**
     * Field where the data is being copied from. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    source?: pulumi.Input<string>;
    /**
     * Field where the data is being copied to. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    target?: pulumi.Input<string>;
    /**
     * A customized field message. This can also include variables extracted from the payload by using string interpolation.
     */
    template?: pulumi.Input<string>;
}

export interface RulesetRuleActionsPriority {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<string>;
}

export interface RulesetRuleActionsRoute {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<string>;
}

export interface RulesetRuleActionsSeverity {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<string>;
}

export interface RulesetRuleActionsSuppress {
    /**
     * The number value of the `thresholdTimeUnit` before an incident is created. Must be greater than 0.
     */
    thresholdTimeAmount?: pulumi.Input<number>;
    /**
     * The `seconds`,`minutes`, or `hours` the `thresholdTimeAmount` should be measured.
     */
    thresholdTimeUnit?: pulumi.Input<string>;
    /**
     * The number of alerts that should be suppressed. Must be greater than 0.
     */
    thresholdValue?: pulumi.Input<number>;
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<boolean>;
}

export interface RulesetRuleActionsSuspend {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<number>;
}

export interface RulesetRuleConditions {
    /**
     * Operator to combine sub-conditions. Can be `and` or `or`.
     */
    operator?: pulumi.Input<string>;
    /**
     * List of sub-conditions that define the condition.
     */
    subconditions?: pulumi.Input<pulumi.Input<inputs.RulesetRuleConditionsSubcondition>[]>;
}

export interface RulesetRuleConditionsSubcondition {
    /**
     * Type of operator to apply to the sub-condition. Can be `exists`,`nexists`,`equals`,`nequals`,`contains`,`ncontains`,`matches`, or `nmatches`.
     */
    operator?: pulumi.Input<string>;
    /**
     * Parameter for the sub-condition. It requires both a `path` and `value` to be set.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.RulesetRuleConditionsSubconditionParameter>[]>;
}

export interface RulesetRuleConditionsSubconditionParameter {
    path?: pulumi.Input<string>;
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<string>;
}

export interface RulesetRuleTimeFrame {
    /**
     * Values for executing the rule during a specific time period.
     */
    activeBetweens?: pulumi.Input<pulumi.Input<inputs.RulesetRuleTimeFrameActiveBetween>[]>;
    /**
     * Values for executing the rule on a recurring schedule.
     */
    scheduledWeeklies?: pulumi.Input<pulumi.Input<inputs.RulesetRuleTimeFrameScheduledWeekly>[]>;
}

export interface RulesetRuleTimeFrameActiveBetween {
    endTime?: pulumi.Input<number>;
    startTime?: pulumi.Input<number>;
}

export interface RulesetRuleTimeFrameScheduledWeekly {
    /**
     * Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `startTime`.
     */
    duration?: pulumi.Input<number>;
    startTime?: pulumi.Input<number>;
    /**
     * [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = "America/Toronto"`
     */
    timezone?: pulumi.Input<string>;
    /**
     * An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
     */
    weekdays?: pulumi.Input<pulumi.Input<number>[]>;
}

export interface RulesetRuleVariable {
    name?: pulumi.Input<string>;
    parameters?: pulumi.Input<pulumi.Input<inputs.RulesetRuleVariableParameter>[]>;
    type?: pulumi.Input<string>;
}

export interface RulesetRuleVariableParameter {
    path?: pulumi.Input<string>;
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: pulumi.Input<string>;
}

export interface RulesetTeam {
    /**
     * The ID of the ruleset.
     */
    id: pulumi.Input<string>;
}

export interface ScheduleLayer {
    /**
     * The end time of the schedule layer. If not specified, the layer does not end.
     */
    end?: pulumi.Input<string>;
    /**
     * The ID of the schedule.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the schedule layer.
     */
    name?: pulumi.Input<string>;
    /**
     * A schedule layer restriction block. Restriction blocks documented below.
     */
    restrictions?: pulumi.Input<pulumi.Input<inputs.ScheduleLayerRestriction>[]>;
    /**
     * The duration of each on-call shift in `seconds`.
     */
    rotationTurnLengthSeconds: pulumi.Input<number>;
    /**
     * The effective start time of the schedule layer. This can be before the start time of the schedule.
     */
    rotationVirtualStart: pulumi.Input<string>;
    /**
     * The start time of the schedule layer.
     */
    start: pulumi.Input<string>;
    /**
     * The ordered list of users on this layer. The position of the user on the list determines their order in the layer.
     */
    users: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ScheduleLayerRestriction {
    /**
     * The duration of the restriction in `seconds`.
     */
    durationSeconds: pulumi.Input<number>;
    /**
     * Number of the day when restriction starts. From 1 to 7 where 1 is Monday and 7 is Sunday.
     */
    startDayOfWeek?: pulumi.Input<number>;
    /**
     * The start time in `HH:mm:ss` format.
     */
    startTimeOfDay: pulumi.Input<string>;
    /**
     * Can be `dailyRestriction` or `weeklyRestriction`.
     */
    type: pulumi.Input<string>;
}

export interface ServiceAlertGroupingParameters {
    /**
     * Alert grouping parameters dependent on `type`. If `type` is set to `intelligent` or empty then `config` can be empty.
     */
    config?: pulumi.Input<inputs.ServiceAlertGroupingParametersConfig>;
    /**
     * The type of scheduled action. Currently, this must be set to `urgencyChange`.
     */
    type?: pulumi.Input<string>;
}

export interface ServiceAlertGroupingParametersConfig {
    /**
     * One of `any` or `all`. This setting applies only when `type` is set to `contentBased`. Group alerts based on one or all of `fields` value(s).
     */
    aggregate?: pulumi.Input<string>;
    /**
     * Alerts will be grouped together if the content of these fields match. This setting applies only when `type` is set to `contentBased`.
     */
    fields?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The duration in minutes within which to automatically group incoming alerts. This setting applies only when `type` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
     */
    timeout?: pulumi.Input<number>;
}

export interface ServiceDependencyDependency {
    /**
     * The service that dependents on the supporting service.
     */
    dependentServices: pulumi.Input<pulumi.Input<inputs.ServiceDependencyDependencyDependentService>[]>;
    /**
     * The service that supports the dependent service.
     */
    supportingServices: pulumi.Input<pulumi.Input<inputs.ServiceDependencyDependencySupportingService>[]>;
    type?: pulumi.Input<string>;
}

export interface ServiceDependencyDependencyDependentService {
    /**
     * The ID of the service dependency.
     */
    id: pulumi.Input<string>;
    type: pulumi.Input<string>;
}

export interface ServiceDependencyDependencySupportingService {
    /**
     * The ID of the service dependency.
     */
    id: pulumi.Input<string>;
    type: pulumi.Input<string>;
}

export interface ServiceEventRuleActions {
    /**
     * Note added to the event.
     */
    annotates?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleActionsAnnotate>[]>;
    /**
     * An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
     */
    eventActions?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleActionsEventAction>[]>;
    /**
     * Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
     */
    extractions?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleActionsExtraction>[]>;
    /**
     * The ID of the priority applied to the event.
     */
    priorities?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleActionsPriority>[]>;
    /**
     * The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`error`,`warning`, or `critical`.
     */
    severities?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleActionsSeverity>[]>;
    /**
     * Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident).
     */
    suppresses?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleActionsSuppress>[]>;
    /**
     * An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering.
     */
    suspends?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleActionsSuspend>[]>;
}

export interface ServiceEventRuleActionsAnnotate {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: pulumi.Input<string>;
}

export interface ServiceEventRuleActionsEventAction {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: pulumi.Input<string>;
}

export interface ServiceEventRuleActionsExtraction {
    /**
     * The conditions that need to be met for the extraction to happen. Must use valid [RE2 regular expression syntax](https://github.com/google/re2/wiki/Syntax).
     */
    regex?: pulumi.Input<string>;
    /**
     * Field where the data is being copied from. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    source?: pulumi.Input<string>;
    /**
     * Field where the data is being copied to. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    target?: pulumi.Input<string>;
    /**
     * A customized field message. This can also include variables extracted from the payload by using string interpolation.
     */
    template?: pulumi.Input<string>;
}

export interface ServiceEventRuleActionsPriority {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: pulumi.Input<string>;
}

export interface ServiceEventRuleActionsSeverity {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: pulumi.Input<string>;
}

export interface ServiceEventRuleActionsSuppress {
    /**
     * The number value of the `thresholdTimeUnit` before an incident is created.
     */
    thresholdTimeAmount?: pulumi.Input<number>;
    /**
     * The `seconds`,`minutes`, or `hours` the `thresholdTimeAmount` should be measured.
     */
    thresholdTimeUnit?: pulumi.Input<string>;
    /**
     * The number of alerts that should be suppressed.
     */
    thresholdValue?: pulumi.Input<number>;
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: pulumi.Input<boolean>;
}

export interface ServiceEventRuleActionsSuspend {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: pulumi.Input<number>;
}

export interface ServiceEventRuleConditions {
    /**
     * Operator to combine sub-conditions. Can be `and` or `or`.
     */
    operator?: pulumi.Input<string>;
    /**
     * List of sub-conditions that define the condition.
     */
    subconditions?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleConditionsSubcondition>[]>;
}

export interface ServiceEventRuleConditionsSubcondition {
    /**
     * Type of operator to apply to the sub-condition. Can be `exists`,`nexists`,`equals`,`nequals`,`contains`,`ncontains`,`matches`, or `nmatches`.
     */
    operator?: pulumi.Input<string>;
    /**
     * Parameter for the sub-condition. It requires both a `path` and `value` to be set. The `path` value must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleConditionsSubconditionParameter>[]>;
}

export interface ServiceEventRuleConditionsSubconditionParameter {
    /**
     * Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
     */
    path?: pulumi.Input<string>;
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: pulumi.Input<string>;
}

export interface ServiceEventRuleTimeFrame {
    /**
     * Values for executing the rule during a specific time period.
     */
    activeBetweens?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleTimeFrameActiveBetween>[]>;
    /**
     * Values for executing the rule on a recurring schedule.
     */
    scheduledWeeklies?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleTimeFrameScheduledWeekly>[]>;
}

export interface ServiceEventRuleTimeFrameActiveBetween {
    /**
     * Ending of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
     */
    endTime?: pulumi.Input<number>;
    /**
     * Time when the schedule will start. Unix timestamp in milliseconds. For example, if you have a rule with a `startTime` of `0` and a `duration` of `60,000` then that rule would be active from `00:00` to `00:01`. If the `startTime` was `3,600,000` the it would be active starting at `01:00`.
     */
    startTime?: pulumi.Input<number>;
}

export interface ServiceEventRuleTimeFrameScheduledWeekly {
    /**
     * Length of time the schedule will be active.  Unix timestamp in milliseconds.
     */
    duration?: pulumi.Input<number>;
    /**
     * Time when the schedule will start. Unix timestamp in milliseconds. For example, if you have a rule with a `startTime` of `0` and a `duration` of `60,000` then that rule would be active from `00:00` to `00:01`. If the `startTime` was `3,600,000` the it would be active starting at `01:00`.
     */
    startTime?: pulumi.Input<number>;
    /**
     * Timezone for the given schedule.
     */
    timezone?: pulumi.Input<string>;
    /**
     * An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
     */
    weekdays?: pulumi.Input<pulumi.Input<number>[]>;
}

export interface ServiceEventRuleVariable {
    /**
     * The name of the variable.
     */
    name?: pulumi.Input<string>;
    /**
     * The parameters for performing the operation to populate the variable.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.ServiceEventRuleVariableParameter>[]>;
    /**
     * Type of operation to populate the variable. Usually `regex`.
     */
    type?: pulumi.Input<string>;
}

export interface ServiceEventRuleVariableParameter {
    /**
     * Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
     */
    path?: pulumi.Input<string>;
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: pulumi.Input<string>;
}

export interface ServiceIncidentUrgencyRule {
    /**
     * Incidents' urgency during support hours.
     */
    duringSupportHours?: pulumi.Input<inputs.ServiceIncidentUrgencyRuleDuringSupportHours>;
    /**
     * Incidents' urgency outside support hours.
     */
    outsideSupportHours?: pulumi.Input<inputs.ServiceIncidentUrgencyRuleOutsideSupportHours>;
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type: pulumi.Input<string>;
    /**
     * The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severityBased` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
     */
    urgency?: pulumi.Input<string>;
}

export interface ServiceIncidentUrgencyRuleDuringSupportHours {
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type?: pulumi.Input<string>;
    /**
     * The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severityBased` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
     */
    urgency?: pulumi.Input<string>;
}

export interface ServiceIncidentUrgencyRuleOutsideSupportHours {
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type?: pulumi.Input<string>;
    /**
     * The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severityBased` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
     */
    urgency?: pulumi.Input<string>;
}

export interface ServiceIntegrationEmailFilter {
    /**
     * Can be `always` or `match`.
     */
    bodyMode?: pulumi.Input<string>;
    /**
     * Should be a valid regex or `null`
     */
    bodyRegex?: pulumi.Input<string>;
    /**
     * Can be `always` or `match`.
     */
    fromEmailMode?: pulumi.Input<string>;
    /**
     * Should be a valid regex or `null`
     */
    fromEmailRegex?: pulumi.Input<string>;
    /**
     * The ID of the service integration.
     */
    id?: pulumi.Input<string>;
    /**
     * Can be `always` or `match`.
     */
    subjectMode?: pulumi.Input<string>;
    /**
     * Should be a valid regex or `null`
     */
    subjectRegex?: pulumi.Input<string>;
}

export interface ServiceIntegrationEmailParser {
    /**
     * Can be `resolve` or `trigger`.
     */
    action: pulumi.Input<string>;
    /**
     * The ID of the service integration.
     */
    id?: pulumi.Input<number>;
    matchPredicate: pulumi.Input<inputs.ServiceIntegrationEmailParserMatchPredicate>;
    valueExtractors?: pulumi.Input<pulumi.Input<inputs.ServiceIntegrationEmailParserValueExtractor>[]>;
}

export interface ServiceIntegrationEmailParserMatchPredicate {
    predicates?: pulumi.Input<pulumi.Input<inputs.ServiceIntegrationEmailParserMatchPredicatePredicate>[]>;
    /**
     * Can be `any` or `all`.
     */
    type: pulumi.Input<string>;
}

export interface ServiceIntegrationEmailParserMatchPredicatePredicate {
    /**
     * Predicate value or valid regex.
     */
    matcher?: pulumi.Input<string>;
    /**
     * Can be `subject`, `body` or `fromAddresses`.
     */
    part?: pulumi.Input<string>;
    predicates?: pulumi.Input<pulumi.Input<inputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicate>[]>;
    /**
     * Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
     */
    type: pulumi.Input<string>;
}

export interface ServiceIntegrationEmailParserMatchPredicatePredicatePredicate {
    /**
     * Predicate value or valid regex.
     */
    matcher: pulumi.Input<string>;
    /**
     * Can be `subject`, `body` or `fromAddresses`.
     */
    part: pulumi.Input<string>;
    /**
     * Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
     */
    type: pulumi.Input<string>;
}

export interface ServiceIntegrationEmailParserValueExtractor {
    endsBefore?: pulumi.Input<string>;
    /**
     * Can be `subject` or `body`.
     */
    part: pulumi.Input<string>;
    /**
     * If `type` has value `regex` this value should contain valid regex.
     */
    regex?: pulumi.Input<string>;
    startsAfter?: pulumi.Input<string>;
    /**
     * Can be `between`, `entire` or `regex`.
     */
    type: pulumi.Input<string>;
    /**
     * First value extractor should have name `incidentKey` other value extractors should contain custom names.
     */
    valueName: pulumi.Input<string>;
}

export interface ServiceScheduledAction {
    /**
     * A block representing when the scheduled action will occur.
     */
    ats?: pulumi.Input<pulumi.Input<inputs.ServiceScheduledActionAt>[]>;
    /**
     * The urgency to change to: `low` (does not escalate), or `high` (follows escalation rules).
     */
    toUrgency?: pulumi.Input<string>;
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type?: pulumi.Input<string>;
}

export interface ServiceScheduledActionAt {
    /**
     * Designates either the start or the end of the scheduled action. Can be `supportHoursStart` or `supportHoursEnd`.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of time specification. Currently, this must be set to `namedTime`.
     */
    type?: pulumi.Input<string>;
}

export interface ServiceSupportHours {
    /**
     * Array of days of week as integers. `1` to `7`, `1` being
     * Monday and `7` being Sunday.
     */
    daysOfWeeks?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The support hours' ending time of day.
     */
    endTime?: pulumi.Input<string>;
    /**
     * The support hours' starting time of day.
     */
    startTime?: pulumi.Input<string>;
    /**
     * The time zone for the support hours.
     */
    timeZone?: pulumi.Input<string>;
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type?: pulumi.Input<string>;
}

export interface SlackConnectionConfig {
    /**
     * A list of strings to filter events by PagerDuty event type. `"incident.triggered"` is required. The follow event types are also possible:
     * - `incident.acknowledged`
     * - `incident.escalated`
     * - `incident.resolved`
     * - `incident.reassigned`
     * - `incident.annotated`
     * - `incident.unacknowledged`
     * - `incident.delegated`
     * - `incident.priority_updated`
     * - `incident.responder.added`
     * - `incident.responder.replied`
     * - `incident.status_update_published`
     * - `incident.reopened`
     */
    events: pulumi.Input<pulumi.Input<string>[]>;
    priorities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allows you to filter events by urgency. Either `high` or `low`.
     */
    urgency?: pulumi.Input<string>;
}

export interface WebhookSubscriptionDeliveryMethod {
    /**
     * Whether this webhook subscription is temporarily disabled. Becomes true if the delivery method URL is repeatedly rejected by the server.
     */
    temporarilyDisabled?: pulumi.Input<boolean>;
    /**
     * Indicates the type of the delivery method. Allowed and default value: `httpDeliveryMethod`.
     */
    type?: pulumi.Input<string>;
    /**
     * The destination URL for webhook delivery.
     */
    url?: pulumi.Input<string>;
}

export interface WebhookSubscriptionFilter {
    /**
     * The id of the object being used as the filter. This field is required for all filter types except account_reference.
     */
    id?: pulumi.Input<string>;
    /**
     * The type of object being used as the filter. Allowed values are `accountReference`, `serviceReference`, and `teamReference`.
     */
    type: pulumi.Input<string>;
}
