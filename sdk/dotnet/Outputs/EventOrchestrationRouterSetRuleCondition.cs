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
    public sealed class EventOrchestrationRouterSetRuleCondition
    {
        /// <summary>
        /// A [PCL condition](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) string.
        /// </summary>
        public readonly string Expression;

        [OutputConstructor]
        private EventOrchestrationRouterSetRuleCondition(string expression)
        {
            Expression = expression;
        }
    }
}
