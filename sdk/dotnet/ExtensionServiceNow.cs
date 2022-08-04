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
    /// A special case for [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMw-create-an-extension) for ServiceNow.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Pagerduty = Pulumi.Pagerduty;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var servicenow = Output.Create(Pagerduty.GetExtensionSchema.InvokeAsync(new Pagerduty.GetExtensionSchemaArgs
    ///         {
    ///             Name = "ServiceNow (v7)",
    ///         }));
    ///         var exampleUser = new Pagerduty.User("exampleUser", new Pagerduty.UserArgs
    ///         {
    ///             Email = "howard.james@example.domain",
    ///         });
    ///         var exampleEscalationPolicy = new Pagerduty.EscalationPolicy("exampleEscalationPolicy", new Pagerduty.EscalationPolicyArgs
    ///         {
    ///             NumLoops = 2,
    ///             Rules = 
    ///             {
    ///                 new Pagerduty.Inputs.EscalationPolicyRuleArgs
    ///                 {
    ///                     EscalationDelayInMinutes = 10,
    ///                     Targets = 
    ///                     {
    ///                         new Pagerduty.Inputs.EscalationPolicyRuleTargetArgs
    ///                         {
    ///                             Type = "user",
    ///                             Id = exampleUser.Id,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         var exampleService = new Pagerduty.Service("exampleService", new Pagerduty.ServiceArgs
    ///         {
    ///             AutoResolveTimeout = "14400",
    ///             AcknowledgementTimeout = "600",
    ///             EscalationPolicy = exampleEscalationPolicy.Id,
    ///         });
    ///         var snow = new Pagerduty.ExtensionServiceNow("snow", new Pagerduty.ExtensionServiceNowArgs
    ///         {
    ///             ExtensionSchema = servicenow.Apply(servicenow =&gt; servicenow.Id),
    ///             ExtensionObjects = 
    ///             {
    ///                 exampleService.Id,
    ///             },
    ///             SnowUser = "meeps",
    ///             SnowPassword = "zorz",
    ///             SyncOptions = "manual_sync",
    ///             Target = "https://foo.servicenow.com/webhook_foo",
    ///             TaskType = "incident",
    ///             Referer = "None",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Extensions can be imported using the id.e.g.
    /// 
    /// ```sh
    ///  $ pulumi import pagerduty:index/extensionServiceNow:ExtensionServiceNow main PLBP09X
    /// ```
    /// </summary>
    [PagerdutyResourceType("pagerduty:index/extensionServiceNow:ExtensionServiceNow")]
    public partial class ExtensionServiceNow : Pulumi.CustomResource
    {
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
        /// URL at which the entity is uniquely displayed in the Web app.
        /// </summary>
        [Output("htmlUrl")]
        public Output<string> HtmlUrl { get; private set; } = null!;

        /// <summary>
        /// The name of the service extension.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ServiceNow referer.
        /// </summary>
        [Output("referer")]
        public Output<string> Referer { get; private set; } = null!;

        /// <summary>
        /// The ServiceNow password.
        /// </summary>
        [Output("snowPassword")]
        public Output<string> SnowPassword { get; private set; } = null!;

        /// <summary>
        /// The ServiceNow username.
        /// </summary>
        [Output("snowUser")]
        public Output<string> SnowUser { get; private set; } = null!;

        /// <summary>
        /// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        /// </summary>
        [Output("summary")]
        public Output<string> Summary { get; private set; } = null!;

        /// <summary>
        /// The ServiceNow sync option.
        /// </summary>
        [Output("syncOptions")]
        public Output<string> SyncOptions { get; private set; } = null!;

        /// <summary>
        /// Target Webhook URL.
        /// </summary>
        [Output("target")]
        public Output<string> Target { get; private set; } = null!;

        /// <summary>
        /// The ServiceNow task type, typically `incident`.
        /// </summary>
        [Output("taskType")]
        public Output<string> TaskType { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ExtensionServiceNow resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExtensionServiceNow(string name, ExtensionServiceNowArgs args, CustomResourceOptions? options = null)
            : base("pagerduty:index/extensionServiceNow:ExtensionServiceNow", name, args ?? new ExtensionServiceNowArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExtensionServiceNow(string name, Input<string> id, ExtensionServiceNowState? state = null, CustomResourceOptions? options = null)
            : base("pagerduty:index/extensionServiceNow:ExtensionServiceNow", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExtensionServiceNow resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExtensionServiceNow Get(string name, Input<string> id, ExtensionServiceNowState? state = null, CustomResourceOptions? options = null)
        {
            return new ExtensionServiceNow(name, id, state, options);
        }
    }

    public sealed class ExtensionServiceNowArgs : Pulumi.ResourceArgs
    {
        [Input("endpointUrl")]
        public Input<string>? EndpointUrl { get; set; }

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

        /// <summary>
        /// The ServiceNow referer.
        /// </summary>
        [Input("referer", required: true)]
        public Input<string> Referer { get; set; } = null!;

        /// <summary>
        /// The ServiceNow password.
        /// </summary>
        [Input("snowPassword", required: true)]
        public Input<string> SnowPassword { get; set; } = null!;

        /// <summary>
        /// The ServiceNow username.
        /// </summary>
        [Input("snowUser", required: true)]
        public Input<string> SnowUser { get; set; } = null!;

        /// <summary>
        /// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        /// </summary>
        [Input("summary")]
        public Input<string>? Summary { get; set; }

        /// <summary>
        /// The ServiceNow sync option.
        /// </summary>
        [Input("syncOptions", required: true)]
        public Input<string> SyncOptions { get; set; } = null!;

        /// <summary>
        /// Target Webhook URL.
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        /// <summary>
        /// The ServiceNow task type, typically `incident`.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        [Input("type")]
        public Input<string>? Type { get; set; }

        public ExtensionServiceNowArgs()
        {
        }
    }

    public sealed class ExtensionServiceNowState : Pulumi.ResourceArgs
    {
        [Input("endpointUrl")]
        public Input<string>? EndpointUrl { get; set; }

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
        /// URL at which the entity is uniquely displayed in the Web app.
        /// </summary>
        [Input("htmlUrl")]
        public Input<string>? HtmlUrl { get; set; }

        /// <summary>
        /// The name of the service extension.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ServiceNow referer.
        /// </summary>
        [Input("referer")]
        public Input<string>? Referer { get; set; }

        /// <summary>
        /// The ServiceNow password.
        /// </summary>
        [Input("snowPassword")]
        public Input<string>? SnowPassword { get; set; }

        /// <summary>
        /// The ServiceNow username.
        /// </summary>
        [Input("snowUser")]
        public Input<string>? SnowUser { get; set; }

        /// <summary>
        /// A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        /// </summary>
        [Input("summary")]
        public Input<string>? Summary { get; set; }

        /// <summary>
        /// The ServiceNow sync option.
        /// </summary>
        [Input("syncOptions")]
        public Input<string>? SyncOptions { get; set; }

        /// <summary>
        /// Target Webhook URL.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// The ServiceNow task type, typically `incident`.
        /// </summary>
        [Input("taskType")]
        public Input<string>? TaskType { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public ExtensionServiceNowState()
        {
        }
    }
}
