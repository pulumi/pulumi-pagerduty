// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    /// <summary>
    /// A [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwMA-assign-tags) is applied to Escalation Policies, Teams or Users and can be used to filter them.
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
    ///     var example = new Pagerduty.Tag("example", new()
    ///     {
    ///         Label = "API",
    ///     });
    /// 
    ///     var engteam = new Pagerduty.Team("engteam", new()
    ///     {
    ///         Name = "Engineering",
    ///     });
    /// 
    ///     var exampleTagAssignment = new Pagerduty.TagAssignment("example", new()
    ///     {
    ///         TagId = example.Id,
    ///         EntityType = "teams",
    ///         EntityId = engteam.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Tag assignments can be imported using the `id` which is constructed by taking the `entity` Type, `entity` ID and the `tag` ID separated by a dot, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/tagAssignment:TagAssignment main users.P7HHMVK.PYC7IQQ
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/tagAssignment:TagAssignment")]
    public partial class TagAssignment : global::Pulumi.CustomResource
    {
        [Output("entityId")]
        public Output<string> EntityId { get; private set; } = null!;

        [Output("entityType")]
        public Output<string> EntityType { get; private set; } = null!;

        [Output("tagId")]
        public Output<string> TagId { get; private set; } = null!;


        /// <summary>
        /// Create a TagAssignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TagAssignment(string name, TagAssignmentArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/tagAssignment:TagAssignment", name, args ?? new TagAssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TagAssignment(string name, Input<string> id, TagAssignmentState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/tagAssignment:TagAssignment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TagAssignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TagAssignment Get(string name, Input<string> id, TagAssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new TagAssignment(name, id, state, options);
        }
    }

    public sealed class TagAssignmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("entityId", required: true)]
        public Input<string> EntityId { get; set; } = null!;

        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        [Input("tagId", required: true)]
        public Input<string> TagId { get; set; } = null!;

        public TagAssignmentArgs()
        {
        }
        public static new TagAssignmentArgs Empty => new TagAssignmentArgs();
    }

    public sealed class TagAssignmentState : global::Pulumi.ResourceArgs
    {
        [Input("entityId")]
        public Input<string>? EntityId { get; set; }

        [Input("entityType")]
        public Input<string>? EntityType { get; set; }

        [Input("tagId")]
        public Input<string>? TagId { get; set; }

        public TagAssignmentState()
        {
        }
        public static new TagAssignmentState Empty => new TagAssignmentState();
    }
}
