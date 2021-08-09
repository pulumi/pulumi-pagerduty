// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface EscalationPolicyRule {
    /**
     * The number of minutes before an unacknowledged incident escalates away from this rule.
     */
    escalationDelayInMinutes: number;
    /**
     * A target ID
     */
    id: string;
    targets: outputs.EscalationPolicyRuleTarget[];
}

export interface EscalationPolicyRuleTarget {
    /**
     * A target ID
     */
    id: string;
    /**
     * Can be `user`, `schedule`, `userReference` or `scheduleReference`. Defaults to `userReference`. For multiple users as example, repeat the target.
     */
    type?: string;
}

export interface ResponsePlayResponder {
    /**
     * Description of escalation policy
     */
    description?: string;
    /**
     * The escalation rules
     */
    escalationRules: outputs.ResponsePlayResponderEscalationRule[];
    /**
     * ID of the user defined as the responder
     */
    id?: string;
    /**
     * Name of the escalation policy
     */
    name?: string;
    /**
     * The number of times the escalation policy will repeat after reaching the end of its escalation.
     */
    numLoops: number;
    /**
     * Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "ifHasServices". Could be "ifHasServices", "always
     */
    onCallHandoffNotifications: string;
    /**
     * There can be multiple services associated with a policy.
     */
    services: outputs.ResponsePlayResponderService[];
    /**
     * Teams associated with the policy. Account must have the `teams` ability to use this parameter. There can be multiple teams associated with a policy.
     */
    teams: outputs.ResponsePlayResponderTeam[];
    /**
     * Type of object of the target. Supported types are `user`, `schedule`, `userReference`, `scheduleReference`.
     */
    type?: string;
}

export interface ResponsePlayResponderEscalationRule {
    /**
     * The number of minutes before an unacknowledged incident escalates away from this rule.
     */
    escalationDelayInMinutes: number;
    /**
     * ID of the user defined as the responder
     */
    id: string;
    /**
     * The targets an incident should be assigned to upon reaching this rule.
     */
    targets: outputs.ResponsePlayResponderEscalationRuleTarget[];
}

export interface ResponsePlayResponderEscalationRuleTarget {
    /**
     * ID of the user defined as the responder
     */
    id: string;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type: string;
}

export interface ResponsePlayResponderService {
    /**
     * ID of the user defined as the responder
     */
    id: string;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type: string;
}

export interface ResponsePlayResponderTeam {
    /**
     * ID of the user defined as the responder
     */
    id: string;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type: string;
}

export interface ResponsePlaySubscriber {
    /**
     * ID of the user defined as the responder
     */
    id?: string;
    /**
     * A string that determines the schema of the object. If not set, the default value is "responsePlay".
     */
    type?: string;
}

export interface RulesetRuleActions {
    /**
     * Note added to the event.
     */
    annotates?: outputs.RulesetRuleActionsAnnotate[];
    /**
     * An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
     */
    eventActions?: outputs.RulesetRuleActionsEventAction[];
    /**
     * Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
     */
    extractions?: outputs.RulesetRuleActionsExtraction[];
    /**
     * The ID of the priority applied to the event.
     */
    priorities?: outputs.RulesetRuleActionsPriority[];
    /**
     * The ID of the service where the event will be routed.
     */
    routes?: outputs.RulesetRuleActionsRoute[];
    /**
     * The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`error`,`warning`, or `critical`.
     */
    severities?: outputs.RulesetRuleActionsSeverity[];
    /**
     * Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident). Note: If a threshold is set, the rule must also have a `route` action.
     */
    suppresses?: outputs.RulesetRuleActionsSuppress[];
    /**
     * An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering. Note: A rule with a `suspend` action must also have a `route` action.
     */
    suspends?: outputs.RulesetRuleActionsSuspend[];
}

export interface RulesetRuleActionsAnnotate {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: string;
}

export interface RulesetRuleActionsEventAction {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: string;
}

export interface RulesetRuleActionsExtraction {
    /**
     * The conditions that need to be met for the extraction to happen. Must use valid [RE2 regular expression syntax](https://github.com/google/re2/wiki/Syntax).
     */
    regex?: string;
    /**
     * Field where the data is being copied from. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    source?: string;
    /**
     * Field where the data is being copied to. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    target?: string;
    /**
     * A customized field message. This can also include variables extracted from the payload by using string interpolation.
     */
    template?: string;
}

export interface RulesetRuleActionsPriority {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: string;
}

export interface RulesetRuleActionsRoute {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: string;
}

export interface RulesetRuleActionsSeverity {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: string;
}

export interface RulesetRuleActionsSuppress {
    /**
     * The number value of the `thresholdTimeUnit` before an incident is created. Must be greater than 0.
     */
    thresholdTimeAmount?: number;
    /**
     * The `seconds`,`minutes`, or `hours` the `thresholdTimeAmount` should be measured.
     */
    thresholdTimeUnit?: string;
    /**
     * The number of alerts that should be suppressed. Must be greater than 0.
     */
    thresholdValue?: number;
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: boolean;
}

export interface RulesetRuleActionsSuspend {
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: number;
}

export interface RulesetRuleConditions {
    /**
     * Operator to combine sub-conditions. Can be `and` or `or`.
     */
    operator?: string;
    /**
     * List of sub-conditions that define the the condition.
     */
    subconditions?: outputs.RulesetRuleConditionsSubcondition[];
}

export interface RulesetRuleConditionsSubcondition {
    /**
     * Type of operator to apply to the sub-condition. Can be `exists`,`nexists`,`equals`,`nequals`,`contains`,`ncontains`,`matches`, or `nmatches`.
     */
    operator?: string;
    /**
     * Parameter for the sub-condition. It requires both a `path` and `value` to be set.
     */
    parameters?: outputs.RulesetRuleConditionsSubconditionParameter[];
}

export interface RulesetRuleConditionsSubconditionParameter {
    path?: string;
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: string;
}

export interface RulesetRuleTimeFrame {
    /**
     * Values for executing the rule during a specific time period.
     */
    activeBetweens?: outputs.RulesetRuleTimeFrameActiveBetween[];
    /**
     * Values for executing the rule on a recurring schedule.
     */
    scheduledWeeklies?: outputs.RulesetRuleTimeFrameScheduledWeekly[];
}

export interface RulesetRuleTimeFrameActiveBetween {
    /**
     * Ending of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
     */
    endTime?: number;
    startTime?: number;
}

export interface RulesetRuleTimeFrameScheduledWeekly {
    /**
     * Length of time the schedule will be active in milliseconds. For example `duration = 2 * 60 * 60 * 1000` if you want your rule to apply for 2 hours, from the specified `startTime`.
     */
    duration?: number;
    startTime?: number;
    /**
     * [The name of the timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) for the given schedule, which will be used to determine UTC offset including adjustment for daylight saving time. For example: `timezone = "America/Toronto"`
     */
    timezone?: string;
    /**
     * An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
     */
    weekdays?: number[];
}

export interface RulesetRuleVariable {
    name?: string;
    parameters?: outputs.RulesetRuleVariableParameter[];
    type?: string;
}

export interface RulesetRuleVariableParameter {
    path?: string;
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: string;
}

export interface RulesetTeam {
    /**
     * The ID of the ruleset.
     */
    id: string;
}

export interface ScheduleLayer {
    /**
     * The end time of the schedule layer. If not specified, the layer does not end.
     */
    end?: string;
    /**
     * The ID of the schedule
     */
    id: string;
    /**
     * The name of the schedule layer.
     */
    name: string;
    /**
     * A schedule layer restriction block. Restriction blocks documented below.
     */
    restrictions?: outputs.ScheduleLayerRestriction[];
    /**
     * The duration of each on-call shift in `seconds`.
     */
    rotationTurnLengthSeconds: number;
    /**
     * The effective start time of the schedule layer. This can be before the start time of the schedule.
     */
    rotationVirtualStart: string;
    /**
     * The start time of the schedule layer.
     */
    start: string;
    /**
     * The ordered list of users on this layer. The position of the user on the list determines their order in the layer.
     */
    users: string[];
}

export interface ScheduleLayerRestriction {
    /**
     * The duration of the restriction in `seconds`.
     */
    durationSeconds: number;
    /**
     * Number of the day when restriction starts. From 1 to 7 where 1 is Monday and 7 is Sunday.
     */
    startDayOfWeek?: number;
    /**
     * The start time in `HH:mm:ss` format.
     */
    startTimeOfDay: string;
    /**
     * Can be `dailyRestriction` or `weeklyRestriction`
     */
    type: string;
}

export interface ServiceAlertGroupingParameters {
    /**
     * Alert grouping parameters dependant on `type`. If `type` is set to `intelligent` or empty then `config` can be empty.
     */
    config?: outputs.ServiceAlertGroupingParametersConfig;
    /**
     * The type of scheduled action. Currently, this must be set to `urgencyChange`.
     */
    type?: string;
}

export interface ServiceAlertGroupingParametersConfig {
    /**
     * One of `any` or `all`. This setting applies only when `type` is set to `contentBased`. Group alerts based on one or all of `fields` value(s).
     */
    aggregate?: string;
    /**
     * Alerts will be grouped together if the content of these fields match. This setting applies only when `type` is set to `contentBased`.
     */
    fields?: string[];
    /**
     * The duration in minutes within which to automatically group incoming alerts. This setting applies only when `type` is set to `time`. To continue grouping alerts until the incident is resolved, set this value to `0`.
     */
    timeout?: number;
}

export interface ServiceDependencyDependency {
    /**
     * The service that id dependent on the supporting service.
     */
    dependentServices: outputs.ServiceDependencyDependencyDependentService[];
    /**
     * The service that supports  the  dependent service.
     */
    supportingServices: outputs.ServiceDependencyDependencySupportingService[];
    type?: string;
}

export interface ServiceDependencyDependencyDependentService {
    /**
     * The ID of the service dependency.
     */
    id: string;
    type: string;
}

export interface ServiceDependencyDependencySupportingService {
    /**
     * The ID of the service dependency.
     */
    id: string;
    type: string;
}

export interface ServiceEventRuleActions {
    /**
     * Note added to the event.
     */
    annotates?: outputs.ServiceEventRuleActionsAnnotate[];
    /**
     * An object with a single `value` field. The value sets whether the resulting alert status is `trigger` or `resolve`.
     */
    eventActions?: outputs.ServiceEventRuleActionsEventAction[];
    /**
     * Allows you to copy important data from one event field to another. Extraction objects may use *either* of the following field structures:
     */
    extractions?: outputs.ServiceEventRuleActionsExtraction[];
    /**
     * The ID of the priority applied to the event.
     */
    priorities?: outputs.ServiceEventRuleActionsPriority[];
    /**
     * The [severity level](https://support.pagerduty.com/docs/rulesets#section-set-severity-with-event-rules) of the event. Can be either `info`,`error`,`warning`, or `critical`.
     */
    severities?: outputs.ServiceEventRuleActionsSeverity[];
    /**
     * Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident).
     */
    suppresses?: outputs.ServiceEventRuleActionsSuppress[];
    /**
     * An object with a single `value` field. The value sets the length of time to suspend the resulting alert before triggering.
     */
    suspends?: outputs.ServiceEventRuleActionsSuspend[];
}

export interface ServiceEventRuleActionsAnnotate {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: string;
}

export interface ServiceEventRuleActionsEventAction {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: string;
}

export interface ServiceEventRuleActionsExtraction {
    /**
     * The conditions that need to be met for the extraction to happen. Must use valid [RE2 regular expression syntax](https://github.com/google/re2/wiki/Syntax).
     */
    regex?: string;
    /**
     * Field where the data is being copied from. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    source?: string;
    /**
     * Field where the data is being copied to. Must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    target?: string;
    /**
     * A customized field message. This can also include variables extracted from the payload by using string interpolation.
     */
    template?: string;
}

export interface ServiceEventRuleActionsPriority {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: string;
}

export interface ServiceEventRuleActionsSeverity {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: string;
}

export interface ServiceEventRuleActionsSuppress {
    /**
     * The number value of the `thresholdTimeUnit` before an incident is created.
     */
    thresholdTimeAmount?: number;
    /**
     * The `seconds`,`minutes`, or `hours` the `thresholdTimeAmount` should be measured.
     */
    thresholdTimeUnit?: string;
    /**
     * The number of alerts that should be suppressed.
     */
    thresholdValue?: number;
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: boolean;
}

export interface ServiceEventRuleActionsSuspend {
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: number;
}

export interface ServiceEventRuleConditions {
    /**
     * Operator to combine sub-conditions. Can be `and` or `or`.
     */
    operator?: string;
    /**
     * List of sub-conditions that define the the condition.
     */
    subconditions?: outputs.ServiceEventRuleConditionsSubcondition[];
}

export interface ServiceEventRuleConditionsSubcondition {
    /**
     * Type of operator to apply to the sub-condition. Can be `exists`,`nexists`,`equals`,`nequals`,`contains`,`ncontains`,`matches`, or `nmatches`.
     */
    operator?: string;
    /**
     * Parameter for the sub-condition. It requires both a `path` and `value` to be set. The `path` value must be a [PagerDuty Common Event Format (PD-CEF)](https://support.pagerduty.com/docs/pd-cef) field.
     */
    parameters?: outputs.ServiceEventRuleConditionsSubconditionParameter[];
}

export interface ServiceEventRuleConditionsSubconditionParameter {
    /**
     * Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
     */
    path?: string;
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: string;
}

export interface ServiceEventRuleTimeFrame {
    /**
     * Values for executing the rule during a specific time period.
     */
    activeBetweens?: outputs.ServiceEventRuleTimeFrameActiveBetween[];
    /**
     * Values for executing the rule on a recurring schedule.
     */
    scheduledWeeklies?: outputs.ServiceEventRuleTimeFrameScheduledWeekly[];
}

export interface ServiceEventRuleTimeFrameActiveBetween {
    /**
     * Ending of the scheduled time when the rule should execute.  Unix timestamp in milliseconds.
     */
    endTime?: number;
    /**
     * Time when the schedule will start. Unix timestamp in milliseconds. For example, if you have a rule with a `startTime` of `0` and a `duration` of `60,000` then that rule would be active from `00:00` to `00:01`. If the `startTime` was `3,600,000` the it would be active starting at `01:00`.
     */
    startTime?: number;
}

export interface ServiceEventRuleTimeFrameScheduledWeekly {
    /**
     * Length of time the schedule will be active.  Unix timestamp in milliseconds.
     */
    duration?: number;
    /**
     * Time when the schedule will start. Unix timestamp in milliseconds. For example, if you have a rule with a `startTime` of `0` and a `duration` of `60,000` then that rule would be active from `00:00` to `00:01`. If the `startTime` was `3,600,000` the it would be active starting at `01:00`.
     */
    startTime?: number;
    /**
     * Timezone for the given schedule.
     */
    timezone?: string;
    /**
     * An integer array representing which days during the week the rule executes. For example `weekdays = [1,3,7]` would execute on Monday, Wednesday and Sunday.
     */
    weekdays?: number[];
}

export interface ServiceEventRuleVariable {
    /**
     * The name of the variable.
     */
    name?: string;
    /**
     * The parameters for performing the operation to populate the variable.
     */
    parameters?: outputs.ServiceEventRuleVariableParameter[];
    /**
     * Type of operation to populate the variable. Usually `regex`.
     */
    type?: string;
}

export interface ServiceEventRuleVariableParameter {
    /**
     * Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a [PD-CEF field](https://support.pagerduty.com/docs/pd-cef).
     */
    path?: string;
    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    value?: string;
}

export interface ServiceIncidentUrgencyRule {
    /**
     * Incidents' urgency during support hours.
     */
    duringSupportHours?: outputs.ServiceIncidentUrgencyRuleDuringSupportHours;
    /**
     * Incidents' urgency outside of support hours.
     */
    outsideSupportHours?: outputs.ServiceIncidentUrgencyRuleOutsideSupportHours;
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type: string;
    /**
     * The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severityBased` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
     */
    urgency?: string;
}

export interface ServiceIncidentUrgencyRuleDuringSupportHours {
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type?: string;
    /**
     * The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severityBased` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
     */
    urgency?: string;
}

export interface ServiceIncidentUrgencyRuleOutsideSupportHours {
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type?: string;
    /**
     * The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severityBased` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
     */
    urgency?: string;
}

export interface ServiceScheduledAction {
    /**
     * A block representing when the scheduled action will occur.
     */
    ats?: outputs.ServiceScheduledActionAt[];
    /**
     * The urgency to change to: `low` (does not escalate), or `high` (follows escalation rules).
     */
    toUrgency?: string;
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type?: string;
}

export interface ServiceScheduledActionAt {
    /**
     * Designates either the start or the end of the scheduled action. Can be `supportHoursStart` or `supportHoursEnd`.
     */
    name?: string;
    /**
     * The type of time specification. Currently, this must be set to `namedTime`.
     */
    type?: string;
}

export interface ServiceSupportHours {
    /**
     * Array of days of week as integers. `1` to `7`, `1` being
     * Monday and `7` being Sunday.
     */
    daysOfWeeks?: number[];
    /**
     * The support hours' ending time of day.
     */
    endTime?: string;
    /**
     * The support hours' starting time of day.
     */
    startTime?: string;
    /**
     * The time zone for the support hours.
     */
    timeZone?: string;
    /**
     * The type of alert grouping; one of `intelligent`, `time` or `contentBased`.
     */
    type?: string;
}

export interface UserNotificationRuleContactMethod {
    /**
     * The id of the referenced contact method.
     */
    id: string;
    /**
     * The type of contact method. Can be `emailContactMethod`, `phoneContactMethod`, `pushNotificationContactMethod` or `smsContactMethod`.
     */
    type: string;
}
