// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty.Outputs
{

    [OutputType]
    public sealed class EventOrchestrationUnroutedSetRuleActionsVariable
    {
        /// <summary>
        /// The name of the variable
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Path to a field in an event, in dot-notation. This supports both [PD-CEF](https://support.pagerduty.com/docs/pd-cef) and non-CEF fields. Eg: Use `event.summary` for the `summary` CEF field. Use `raw_event.fieldname` to read from the original event `fieldname` data.
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
        private EventOrchestrationUnroutedSetRuleActionsVariable(
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
