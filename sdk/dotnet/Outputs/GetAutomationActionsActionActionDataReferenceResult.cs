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
    public sealed class GetAutomationActionsActionActionDataReferenceResult
    {
        /// <summary>
        /// (Optional) The command to execute the script with.
        /// </summary>
        public readonly string InvocationCommand;
        /// <summary>
        /// (Optional) The arguments to pass to the Process Automation job execution.
        /// </summary>
        public readonly string ProcessAutomationJobArguments;
        /// <summary>
        /// (Required for `process_automation` action_type) The ID of the Process Automation job to execute.
        /// </summary>
        public readonly string ProcessAutomationJobId;
        /// <summary>
        /// (Optional) The expression that filters on which nodes a Process Automation Job executes [Learn more](https://docs.rundeck.com/docs/manual/05-nodes.html#node-filtering).
        /// </summary>
        public readonly string ProcessAutomationNodeFilter;
        /// <summary>
        /// (Required for `script` action_type) Body of the script to be executed on the Runner. Max length is 16777215 characters.
        /// </summary>
        public readonly string Script;

        [OutputConstructor]
        private GetAutomationActionsActionActionDataReferenceResult(
            string invocationCommand,

            string processAutomationJobArguments,

            string processAutomationJobId,

            string processAutomationNodeFilter,

            string script)
        {
            InvocationCommand = invocationCommand;
            ProcessAutomationJobArguments = processAutomationJobArguments;
            ProcessAutomationJobId = processAutomationJobId;
            ProcessAutomationNodeFilter = processAutomationNodeFilter;
            Script = script;
        }
    }
}
