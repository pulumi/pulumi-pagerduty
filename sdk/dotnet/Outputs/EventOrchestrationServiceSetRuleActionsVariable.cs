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
    public sealed class EventOrchestrationServiceSetRuleActionsVariable
    {
        /// <summary>
        /// The name of the variable
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Path to a field in an event, in dot-notation. This supports both PagerDuty Common Event Format [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data. You can use any valid [PCL path](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview#paths).
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// Only `regex` is supported
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The Regex expression to match against. Must use valid [RE2 regular expression](https://github.com/google/re2/wiki/Syntax) syntax.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private EventOrchestrationServiceSetRuleActionsVariable(
            string name,

            string path,

            string type,

            string value)
        {
            Name = name;
            Path = path;
            Type = type;
            Value = value;
        }
    }
}
