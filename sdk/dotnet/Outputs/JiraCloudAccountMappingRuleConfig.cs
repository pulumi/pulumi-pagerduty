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
    public sealed class JiraCloudAccountMappingRuleConfig
    {
        /// <summary>
        /// Synchronization settings.
        /// </summary>
        public readonly Outputs.JiraCloudAccountMappingRuleConfigJira? Jira;
        /// <summary>
        /// [Updating can cause a resource replacement] The ID of the linked PagerDuty service.
        /// </summary>
        public readonly string Service;

        [OutputConstructor]
        private JiraCloudAccountMappingRuleConfig(
            Outputs.JiraCloudAccountMappingRuleConfigJira? jira,

            string service)
        {
            Jira = jira;
            Service = service;
        }
    }
}
