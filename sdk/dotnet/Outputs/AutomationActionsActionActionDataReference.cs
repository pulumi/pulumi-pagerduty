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
    public sealed class AutomationActionsActionActionDataReference
    {
        /// <summary>
        /// The command to execute the script with.
        /// </summary>
        public readonly string? InvocationCommand;
        /// <summary>
        /// The arguments to pass to the Process Automation job execution.
        /// </summary>
        public readonly string? ProcessAutomationJobArguments;
        /// <summary>
        /// The ID of the Process Automation job to execute.
        /// </summary>
        public readonly string? ProcessAutomationJobId;
        /// <summary>
        /// The expression that filters on which nodes a Process Automation Job executes [Learn more](https://docs.rundeck.com/docs/manual/05-nodes.html#node-filtering).
        /// </summary>
        public readonly string? ProcessAutomationNodeFilter;
        /// <summary>
        /// Body of the script to be executed on the Runner. Max length is 16777215 characters.
        /// </summary>
        public readonly string? Script;

        [OutputConstructor]
        private AutomationActionsActionActionDataReference(
            string? invocationCommand,

            string? processAutomationJobArguments,

            string? processAutomationJobId,

            string? processAutomationNodeFilter,

            string? script)
        {
            InvocationCommand = invocationCommand;
            ProcessAutomationJobArguments = processAutomationJobArguments;
            ProcessAutomationJobId = processAutomationJobId;
            ProcessAutomationNodeFilter = processAutomationNodeFilter;
            Script = script;
        }
    }
}
