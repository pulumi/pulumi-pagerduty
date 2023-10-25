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
    /// An [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents) defines a field which can be set on incidents in the target account.
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
    ///     var csImpact = new Pagerduty.IncidentCustomField("csImpact", new()
    ///     {
    ///         DataType = "string",
    ///         FieldType = "single_value",
    ///     });
    /// 
    ///     var sreEnvironment = new Pagerduty.IncidentCustomField("sreEnvironment", new()
    ///     {
    ///         DataType = "string",
    ///         FieldType = "single_value_fixed",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Fields can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/incidentCustomField:IncidentCustomField sre_environment PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/incidentCustomField:IncidentCustomField")]
    public partial class IncidentCustomField : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        /// </summary>
        [Output("dataType")]
        public Output<string> DataType { get; private set; } = null!;

        [Output("defaultValue")]
        public Output<string?> DefaultValue { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
        /// </summary>
        [Output("fieldType")]
        public Output<string> FieldType { get; private set; } = null!;

        /// <summary>
        /// The name of the field.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a IncidentCustomField resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IncidentCustomField(string name, IncidentCustomFieldArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/incidentCustomField:IncidentCustomField", name, args ?? new IncidentCustomFieldArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IncidentCustomField(string name, Input<string> id, IncidentCustomFieldState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/incidentCustomField:IncidentCustomField", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IncidentCustomField resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IncidentCustomField Get(string name, Input<string> id, IncidentCustomFieldState? state = null, CustomResourceOptions? options = null)
        {
            return new IncidentCustomField(name, id, state, options);
        }
    }

    public sealed class IncidentCustomFieldArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        /// </summary>
        [Input("dataType", required: true)]
        public Input<string> DataType { get; set; } = null!;

        [Input("defaultValue")]
        public Input<string>? DefaultValue { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
        /// </summary>
        [Input("fieldType", required: true)]
        public Input<string> FieldType { get; set; } = null!;

        /// <summary>
        /// The name of the field.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public IncidentCustomFieldArgs()
        {
        }
        public static new IncidentCustomFieldArgs Empty => new IncidentCustomFieldArgs();
    }

    public sealed class IncidentCustomFieldState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data type of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        /// </summary>
        [Input("dataType")]
        public Input<string>? DataType { get; set; }

        [Input("defaultValue")]
        public Input<string>? DefaultValue { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The field type of the field. Must be one of `single_value`, `single_value_fixed`, `multi_value`, or `multi_value_fixed`.
        /// </summary>
        [Input("fieldType")]
        public Input<string>? FieldType { get; set; }

        /// <summary>
        /// The name of the field.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public IncidentCustomFieldState()
        {
        }
        public static new IncidentCustomFieldState Empty => new IncidentCustomFieldState();
    }
}
