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
    /// With [add-ons](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwNQ-install-an-add-on), third-party developers can write their own add-ons to PagerDuty's UI. Given a configuration containing a src parameter, that URL will be embedded in an iframe on a page that's available to users from a drop-down menu.
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
    ///     var example = new Pagerduty.Addon("example", new()
    ///     {
    ///         Name = "Internal Status Page",
    ///         Src = "https://intranet.example.com/status",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Add-ons can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/addon:Addon example P3DH5M6
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/addon:Addon")]
    public partial class Addon : global::Pulumi.CustomResource
    {
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("src")]
        public Output<string> Src { get; private set; } = null!;


        /// <summary>
        /// Create a Addon resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Addon(string name, AddonArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/addon:Addon", name, args ?? new AddonArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Addon(string name, Input<string> id, AddonState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/addon:Addon", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Addon resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Addon Get(string name, Input<string> id, AddonState? state = null, CustomResourceOptions? options = null)
        {
            return new Addon(name, id, state, options);
        }
    }

    public sealed class AddonArgs : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("src", required: true)]
        public Input<string> Src { get; set; } = null!;

        public AddonArgs()
        {
        }
        public static new AddonArgs Empty => new AddonArgs();
    }

    public sealed class AddonState : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("src")]
        public Input<string>? Src { get; set; }

        public AddonState()
        {
        }
        public static new AddonState Empty => new AddonState();
    }
}
