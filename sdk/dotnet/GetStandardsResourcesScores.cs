// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetStandardsResourcesScores
    {
        /// <summary>
        /// Use this data source to get information about the [scores for the standards for
        /// many resources][1].
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        ///     var bar = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "bar",
        ///     });
        /// 
        ///     var baz = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "baz",
        ///     });
        /// 
        ///     var scores = Pagerduty.GetStandardsResourcesScores.Invoke(new()
        ///     {
        ///         ResourceType = "technical_services",
        ///         Ids = new[]
        ///         {
        ///             foo.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///             bar.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///             baz.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetStandardsResourcesScoresResult> InvokeAsync(GetStandardsResourcesScoresArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStandardsResourcesScoresResult>("pagerduty:index/getStandardsResourcesScores:getStandardsResourcesScores", args ?? new GetStandardsResourcesScoresArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about the [scores for the standards for
        /// many resources][1].
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        ///     var bar = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "bar",
        ///     });
        /// 
        ///     var baz = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "baz",
        ///     });
        /// 
        ///     var scores = Pagerduty.GetStandardsResourcesScores.Invoke(new()
        ///     {
        ///         ResourceType = "technical_services",
        ///         Ids = new[]
        ///         {
        ///             foo.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///             bar.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///             baz.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetStandardsResourcesScoresResult> Invoke(GetStandardsResourcesScoresInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStandardsResourcesScoresResult>("pagerduty:index/getStandardsResourcesScores:getStandardsResourcesScores", args ?? new GetStandardsResourcesScoresInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about the [scores for the standards for
        /// many resources][1].
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "foo",
        ///     });
        /// 
        ///     var bar = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "bar",
        ///     });
        /// 
        ///     var baz = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "baz",
        ///     });
        /// 
        ///     var scores = Pagerduty.GetStandardsResourcesScores.Invoke(new()
        ///     {
        ///         ResourceType = "technical_services",
        ///         Ids = new[]
        ///         {
        ///             foo.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///             bar.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///             baz.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetStandardsResourcesScoresResult> Invoke(GetStandardsResourcesScoresInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetStandardsResourcesScoresResult>("pagerduty:index/getStandardsResourcesScores:getStandardsResourcesScores", args ?? new GetStandardsResourcesScoresInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStandardsResourcesScoresArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids", required: true)]
        private List<string>? _ids;

        /// <summary>
        /// List of identifiers of the resources to query.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Type of the object the standards are associated to. Allowed values are `technical_services`.
        /// </summary>
        [Input("resourceType", required: true)]
        public string ResourceType { get; set; } = null!;

        public GetStandardsResourcesScoresArgs()
        {
        }
        public static new GetStandardsResourcesScoresArgs Empty => new GetStandardsResourcesScoresArgs();
    }

    public sealed class GetStandardsResourcesScoresInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids", required: true)]
        private InputList<string>? _ids;

        /// <summary>
        /// List of identifiers of the resources to query.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Type of the object the standards are associated to. Allowed values are `technical_services`.
        /// </summary>
        [Input("resourceType", required: true)]
        public Input<string> ResourceType { get; set; } = null!;

        public GetStandardsResourcesScoresInvokeArgs()
        {
        }
        public static new GetStandardsResourcesScoresInvokeArgs Empty => new GetStandardsResourcesScoresInvokeArgs();
    }


    [OutputType]
    public sealed class GetStandardsResourcesScoresResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Specifies the type of resource to which the standard applies.
        /// </summary>
        public readonly string ResourceType;
        /// <summary>
        /// List of score results for each queried resource.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStandardsResourcesScoresResourceResult> Resources;

        [OutputConstructor]
        private GetStandardsResourcesScoresResult(
            string id,

            ImmutableArray<string> ids,

            string resourceType,

            ImmutableArray<Outputs.GetStandardsResourcesScoresResourceResult> resources)
        {
            Id = id;
            Ids = ids;
            ResourceType = resourceType;
            Resources = resources;
        }
    }
}
