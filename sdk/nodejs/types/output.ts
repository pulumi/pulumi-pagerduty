// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

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
     * Can be `user`, `schedule`, `userReference` or `scheduleReference`. Defaults to `userReference`
     */
    type?: string;
}

export interface RulesetRuleActions {
    /**
     * Note added to the event.
     */
    annotates?: outputs.RulesetRuleActionsAnnotate[];
    eventActions?: outputs.RulesetRuleActionsEventAction[];
    /**
     * Allows you to copy important data from one event field to another. Extraction rules must use valid [RE2 regular expression syntax](https://github.com/google/re2/wiki/Syntax). Extraction objects consist of the following fields:
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
     * Controls whether an alert is [suppressed](https://support.pagerduty.com/docs/rulesets#section-suppress-but-create-triggering-thresholds-with-event-rules) (does not create an incident).
     */
    suppresses?: outputs.RulesetRuleActionsSuppress[];
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
     * The conditions that need to be met for the extraction to happen.
     * * *NOTE: A rule can have multiple `extraction` objects attributed to it.*
     */
    regex?: string;
    /**
     * Field where the data is being copied from.
     */
    source?: string;
    /**
     * Field where the data is being copied to.
     */
    target?: string;
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
     * The number value of the `thresholdTimeUnit` before an incident is created.
     */
    thresholdTimeAmount?: number;
    /**
     * The `minutes`,`hours`, or `days` that the `thresholdTimeAmount` should be measured. 
     */
    thresholdTimeUnit?: string;
    /**
     * The number of alerts that should be suppressed.
     */
    thresholdValue?: number;
    /**
     * Boolean value that indicates if the alert should be suppressed before the indicated threshold values are met.
     */
    value?: boolean;
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
    /**
     * Time when the schedule will start. Unix timestamp in milliseconds. For example, if you have a rule with a `startTime` of `0` and a `duration` of `60,000` then that rule would be active from `00:00` to `00:01`. If the `startTime` was `3,600,000` the it would be active starting at `01:00`.
     */
    startTime?: number;
}

export interface RulesetRuleTimeFrameScheduledWeekly {
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
     * The start time of the schedule layer. This value will not be read back from the PagerDuty API because the API will always return a new `start` time, which represents the last updated time of the schedule layer.
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
     * The type of scheduled action. Currently, this must be set to `urgencyChange`.
     */
    type: string;
    /**
     * The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severityBased` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
     */
    urgency?: string;
}

export interface ServiceIncidentUrgencyRuleDuringSupportHours {
    /**
     * The type of scheduled action. Currently, this must be set to `urgencyChange`.
     */
    type?: string;
    /**
     * The urgency: `low` Notify responders (does not escalate), `high` (follows escalation rules) or `severityBased` Set's the urgency of the incident based on the severity set by the triggering monitoring tool.
     */
    urgency?: string;
}

export interface ServiceIncidentUrgencyRuleOutsideSupportHours {
    /**
     * The type of scheduled action. Currently, this must be set to `urgencyChange`.
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
     * The type of scheduled action. Currently, this must be set to `urgencyChange`.
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
     * The type of scheduled action. Currently, this must be set to `urgencyChange`.
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
