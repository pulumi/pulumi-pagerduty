// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pagerduty
{
    public static class GetCustomFieldSchema
    {
        /// <summary>
        /// Use this data source to get information about a specific [Custom Field Schema](https://support.pagerduty.com/docs/custom-fields#schemas) that you can assign to a service.
        /// 
        /// &gt; The Custom Fields feature is currently available in Early Access.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myschema = Pagerduty.GetCustomFieldSchema.Invoke(new()
        ///     {
        ///         Title = "myschema title",
        ///     });
        /// 
        ///     var firstService = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "My Service",
        ///     });
        /// 
        ///     var foo = new Pagerduty.CustomFieldSchemaAssignment("foo", new()
        ///     {
        ///         Schema = myschema.Apply(getCustomFieldSchemaResult =&gt; getCustomFieldSchemaResult.Id),
        ///         Service = firstService.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCustomFieldSchemaResult> InvokeAsync(GetCustomFieldSchemaArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomFieldSchemaResult>("pagerduty:index/getCustomFieldSchema:getCustomFieldSchema", args ?? new GetCustomFieldSchemaArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific [Custom Field Schema](https://support.pagerduty.com/docs/custom-fields#schemas) that you can assign to a service.
        /// 
        /// &gt; The Custom Fields feature is currently available in Early Access.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Pagerduty = Pulumi.Pagerduty;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myschema = Pagerduty.GetCustomFieldSchema.Invoke(new()
        ///     {
        ///         Title = "myschema title",
        ///     });
        /// 
        ///     var firstService = Pagerduty.GetService.Invoke(new()
        ///     {
        ///         Name = "My Service",
        ///     });
        /// 
        ///     var foo = new Pagerduty.CustomFieldSchemaAssignment("foo", new()
        ///     {
        ///         Schema = myschema.Apply(getCustomFieldSchemaResult =&gt; getCustomFieldSchemaResult.Id),
        ///         Service = firstService.Apply(getServiceResult =&gt; getServiceResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCustomFieldSchemaResult> Invoke(GetCustomFieldSchemaInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomFieldSchemaResult>("pagerduty:index/getCustomFieldSchema:getCustomFieldSchema", args ?? new GetCustomFieldSchemaInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomFieldSchemaArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The title of the field schema.
        /// </summary>
        [Input("title", required: true)]
        public string Title { get; set; } = null!;

        public GetCustomFieldSchemaArgs()
        {
        }
        public static new GetCustomFieldSchemaArgs Empty => new GetCustomFieldSchemaArgs();
    }

    public sealed class GetCustomFieldSchemaInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The title of the field schema.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        public GetCustomFieldSchemaInvokeArgs()
        {
        }
        public static new GetCustomFieldSchemaInvokeArgs Empty => new GetCustomFieldSchemaInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomFieldSchemaResult
    {
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Title;

        [OutputConstructor]
        private GetCustomFieldSchemaResult(
            string description,

            string id,

            string title)
        {
            Description = description;
            Id = id;
            Title = title;
        }
    }
}
