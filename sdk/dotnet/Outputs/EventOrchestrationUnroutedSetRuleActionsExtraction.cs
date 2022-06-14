// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class EventOrchestrationUnroutedSetRuleActionsExtraction
    {
        /// <summary>
        /// A [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) that will be matched against field specified via the `source` argument. If the regex contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used. This field can be ignored for `template` based extractions.
        /// </summary>
        public readonly string? Regex;
        /// <summary>
        /// The path to the event field where the `regex` will be applied to extract a value. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths) like `event.summary` and you can reference previously-defined variables using a path like `variables.hostname`. This field can be ignored for `template` based extractions.
        /// </summary>
        public readonly string? Source;
        /// <summary>
        /// The PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) field that will be set with the value from the `template` or based on `regex` and `source` fields.
        /// </summary>
        public readonly string Target;
        /// <summary>
        /// A string that will be used to populate the `target` field. You can reference variables or event data within your template using double curly braces. For example:
        /// * Use variables named `ip` and `subnet` with a template like: `{{variables.ip}}/{{variables.subnet}}`
        /// * Combine the event severity &amp; summary with template like: `{{event.severity}}:{{event.summary}}`
        /// </summary>
        public readonly string? Template;

        [OutputConstructor]
        private EventOrchestrationUnroutedSetRuleActionsExtraction(
            string? regex,

            string? source,

            string target,

            string? template)
        {
            Regex = regex;
            Source = source;
            Target = target;
            Template = template;
        }
    }
}
