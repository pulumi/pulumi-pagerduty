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
    /// An [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMw-create-an-extension) can be associated with a service.
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
    ///     var webhook = Pagerduty.GetExtensionSchema.Invoke(new()
    ///     {
    ///         Name = "Generic V2 Webhook",
    ///     });
    /// 
    ///     var example = new Pagerduty.User("example", new()
    ///     {
    ///         Name = "Howard James",
    ///         Email = "howard.james@example.domain",
    ///     });
    /// 
    ///     var exampleEscalationPolicy = new Pagerduty.EscalationPolicy("example", new()
    ///     {
    ///         Name = "Engineering Escalation Policy",
    ///         NumLoops = 2,
    ///         Rules = new[]
    ///         {
    ///             new Pagerduty.Inputs.EscalationPolicyRuleArgs
    ///             {
    ///                 EscalationDelayInMinutes = 10,
    ///                 Targets = new[]
    ///                 {
    ///                     new Pagerduty.Inputs.EscalationPolicyRuleTargetArgs
    ///                     {
    ///                         Type = "user",
    ///                         Id = example.Id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleService = new Pagerduty.Service("example", new()
    ///     {
    ///         Name = "My Web App",
    ///         AutoResolveTimeout = "14400",
    ///         AcknowledgementTimeout = "600",
    ///         EscalationPolicy = exampleEscalationPolicy.Id,
    ///     });
    /// 
    ///     var slack = new Pagerduty.Extension("slack", new()
    ///     {
    ///         Name = "My Web App Extension",
    ///         EndpointUrl = "https://generic_webhook_url/XXXXXX/BBBBBB",
    ///         ExtensionSchema = webhook.Apply(getExtensionSchemaResult =&gt; getExtensionSchemaResult.Id),
    ///         ExtensionObjects = new[]
    ///         {
    ///             exampleService.Id,
    ///         },
    ///         Config = @"{
    /// 	""restrict"": ""any"",
    /// 	""notify_types"": {
    /// 			""resolve"": false,
    /// 			""acknowledge"": false,
    /// 			""assignments"": false
    /// 	},
    /// 	""access_token"": ""XXX""
    /// }
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Extensions can be imported using the id.e.g.
    /// 
    /// ```sh
    /// $ pulumi import pagerduty:index/extension:Extension main PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/extension:Extension")]
    public partial class Extension : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The configuration of the service extension as string containing plain JSON-encoded data.
        /// </summary>
        [Output("config")]
        public Output<string?> Config { get; private set; } = null!;

        /// <summary>
        /// The url of the extension.
        /// **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn't accept `pagerduty.Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        /// </summary>
        [Output("endpointUrl")]
        public Output<string?> EndpointUrl { get; private set; } = null!;

        /// <summary>
        /// This is the objects for which the extension applies (An array of service ids).
        /// </summary>
        [Output("extensionObjects")]
        public Output<ImmutableArray<string>> ExtensionObjects { get; private set; } = null!;

        /// <summary>
        /// This is the schema for this extension.
        /// </summary>
        [Output("extensionSchema")]
        public Output<string> ExtensionSchema { get; private set; } = null!;

        /// <summary>
        /// URL at which the entity is uniquely displayed in the Web app
        /// </summary>
        [Output("htmlUrl")]
        public Output<string> HtmlUrl { get; private set; } = null!;

        /// <summary>
        /// The name of the service extension.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        /// 
        /// **Note:** You can use the `pagerduty.getExtensionSchema` data source to locate the appropriate extension vendor ID.
        /// </summary>
        [Output("summary")]
        public Output<string> Summary { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Extension resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Extension(string name, ExtensionArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/extension:Extension", name, args ?? new ExtensionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Extension(string name, Input<string> id, ExtensionState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/extension:Extension", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "endpointUrl",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Extension resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Extension Get(string name, Input<string> id, ExtensionState? state = null, CustomResourceOptions? options = null)
        {
            return new Extension(name, id, state, options);
        }
    }

    public sealed class ExtensionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration of the service extension as string containing plain JSON-encoded data.
        /// </summary>
        [Input("config")]
        public Input<string>? Config { get; set; }

        [Input("endpointUrl")]
        private Input<string>? _endpointUrl;

        /// <summary>
        /// The url of the extension.
        /// **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn't accept `pagerduty.Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        /// </summary>
        public Input<string>? EndpointUrl
        {
            get => _endpointUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _endpointUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("extensionObjects", required: true)]
        private InputList<string>? _extensionObjects;

        /// <summary>
        /// This is the objects for which the extension applies (An array of service ids).
        /// </summary>
        public InputList<string> ExtensionObjects
        {
            get => _extensionObjects ?? (_extensionObjects = new InputList<string>());
            set => _extensionObjects = value;
        }

        /// <summary>
        /// This is the schema for this extension.
        /// </summary>
        [Input("extensionSchema", required: true)]
        public Input<string> ExtensionSchema { get; set; } = null!;

        /// <summary>
        /// The name of the service extension.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public ExtensionArgs()
        {
        }
        public static new ExtensionArgs Empty => new ExtensionArgs();
    }

    public sealed class ExtensionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration of the service extension as string containing plain JSON-encoded data.
        /// </summary>
        [Input("config")]
        public Input<string>? Config { get; set; }

        [Input("endpointUrl")]
        private Input<string>? _endpointUrl;

        /// <summary>
        /// The url of the extension.
        /// **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn't accept `pagerduty.Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        /// </summary>
        public Input<string>? EndpointUrl
        {
            get => _endpointUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _endpointUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("extensionObjects")]
        private InputList<string>? _extensionObjects;

        /// <summary>
        /// This is the objects for which the extension applies (An array of service ids).
        /// </summary>
        public InputList<string> ExtensionObjects
        {
            get => _extensionObjects ?? (_extensionObjects = new InputList<string>());
            set => _extensionObjects = value;
        }

        /// <summary>
        /// This is the schema for this extension.
        /// </summary>
        [Input("extensionSchema")]
        public Input<string>? ExtensionSchema { get; set; }

        /// <summary>
        /// URL at which the entity is uniquely displayed in the Web app
        /// </summary>
        [Input("htmlUrl")]
        public Input<string>? HtmlUrl { get; set; }

        /// <summary>
        /// The name of the service extension.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        /// 
        /// **Note:** You can use the `pagerduty.getExtensionSchema` data source to locate the appropriate extension vendor ID.
        /// </summary>
        [Input("summary")]
        public Input<string>? Summary { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public ExtensionState()
        {
        }
        public static new ExtensionState Empty => new ExtensionState();
    }
}
