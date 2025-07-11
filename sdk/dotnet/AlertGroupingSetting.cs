// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    /// <summary>
    /// An [alert grouping setting](https://developer.pagerduty.com/api-reference/587edbc8ff416-create-an-alert-grouping-setting)
    /// stores and centralize the configuration used during grouping of the alerts.
    /// 
    /// ## Migration from `alert_grouping_parameters`
    /// 
    /// To migrate from using the field `alert_grouping_parameters` of a
    /// service
    /// to a `pagerduty.AlertGroupingSetting` resource, you can cut-and-paste the
    /// contents of an `alert_grouping_parameters` field from a `pagerduty.Service`
    /// resource into the new resource, but you also need to add at least one value in
    /// the field `services` to create the alert grouping setting with a service
    /// associated to it.
    /// 
    /// If you are using `timeout = 0` or `time_window = 0` in order to use the values
    /// recommended by PagerDuty you also need to set its value to null or delete it,
    /// since a value of `0` is no longer accepted.
    /// 
    /// **Example**:
    /// 
    /// Before:
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = Pagerduty.GetEscalationPolicy.Invoke(new()
    ///     {
    ///         Name = "Default",
    ///     });
    /// 
    ///     var foo = new Pagerduty.Service("foo", new()
    ///     {
    ///         Name = "Foo",
    ///         EscalationPolicy = @default.Apply(@default =&gt; @default.Apply(getEscalationPolicyResult =&gt; getEscalationPolicyResult.Id)),
    ///         AlertGroupingParameters = new Pagerduty.Inputs.ServiceAlertGroupingParametersArgs
    ///         {
    ///             Type = "time",
    ///             Config = new Pagerduty.Inputs.ServiceAlertGroupingParametersConfigArgs
    ///             {
    ///                 Timeout = 0,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// After:
    /// ## Import
    /// 
    /// Alert grouping settings can be imported using its `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/alertGroupingSetting:AlertGroupingSetting example P3DH5M6
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/alertGroupingSetting:AlertGroupingSetting")]
    public partial class AlertGroupingSetting : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The set of values used for configuration.
        /// </summary>
        [Output("config")]
        public Output<Outputs.AlertGroupingSettingConfig?> Config { get; private set; } = null!;

        /// <summary>
        /// A human-friendly text to describe and identify this alert grouping setting.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The name for the alert groupig settings.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// [Updating can cause a resource replacement] The list IDs of services associated to this setting.
        /// </summary>
        [Output("services")]
        public Output<ImmutableArray<string>> Services { get; private set; } = null!;

        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time`, `content_based` or  `content_based_intelligent`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a AlertGroupingSetting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertGroupingSetting(string name, AlertGroupingSettingArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/alertGroupingSetting:AlertGroupingSetting", name, args ?? new AlertGroupingSettingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertGroupingSetting(string name, Input<string> id, AlertGroupingSettingState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/alertGroupingSetting:AlertGroupingSetting", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertGroupingSetting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertGroupingSetting Get(string name, Input<string> id, AlertGroupingSettingState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertGroupingSetting(name, id, state, options);
        }
    }

    public sealed class AlertGroupingSettingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The set of values used for configuration.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AlertGroupingSettingConfigArgs>? Config { get; set; }

        /// <summary>
        /// A human-friendly text to describe and identify this alert grouping setting.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name for the alert groupig settings.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("services", required: true)]
        private InputList<string>? _services;

        /// <summary>
        /// [Updating can cause a resource replacement] The list IDs of services associated to this setting.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time`, `content_based` or  `content_based_intelligent`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AlertGroupingSettingArgs()
        {
        }
        public static new AlertGroupingSettingArgs Empty => new AlertGroupingSettingArgs();
    }

    public sealed class AlertGroupingSettingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The set of values used for configuration.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AlertGroupingSettingConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// A human-friendly text to describe and identify this alert grouping setting.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name for the alert groupig settings.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// [Updating can cause a resource replacement] The list IDs of services associated to this setting.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        /// <summary>
        /// The type of alert grouping; one of `intelligent`, `time`, `content_based` or  `content_based_intelligent`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AlertGroupingSettingState()
        {
        }
        public static new AlertGroupingSettingState Empty => new AlertGroupingSettingState();
    }
}
