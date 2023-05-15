// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.ExtensionArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.ExtensionState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMw-create-an-extension) can be associated with a service.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.PagerdutyFunctions;
 * import com.pulumi.pagerduty.inputs.GetExtensionSchemaArgs;
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.EscalationPolicy;
 * import com.pulumi.pagerduty.EscalationPolicyArgs;
 * import com.pulumi.pagerduty.inputs.EscalationPolicyRuleArgs;
 * import com.pulumi.pagerduty.Service;
 * import com.pulumi.pagerduty.ServiceArgs;
 * import com.pulumi.pagerduty.Extension;
 * import com.pulumi.pagerduty.ExtensionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var webhook = PagerdutyFunctions.getExtensionSchema(GetExtensionSchemaArgs.builder()
 *             .name(&#34;Generic V2 Webhook&#34;)
 *             .build());
 * 
 *         var exampleUser = new User(&#34;exampleUser&#34;, UserArgs.builder()        
 *             .email(&#34;howard.james@example.domain&#34;)
 *             .build());
 * 
 *         var exampleEscalationPolicy = new EscalationPolicy(&#34;exampleEscalationPolicy&#34;, EscalationPolicyArgs.builder()        
 *             .numLoops(2)
 *             .rules(EscalationPolicyRuleArgs.builder()
 *                 .escalationDelayInMinutes(10)
 *                 .targets(EscalationPolicyRuleTargetArgs.builder()
 *                     .type(&#34;user&#34;)
 *                     .id(exampleUser.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .autoResolveTimeout(14400)
 *             .acknowledgementTimeout(600)
 *             .escalationPolicy(exampleEscalationPolicy.id())
 *             .build());
 * 
 *         var slack = new Extension(&#34;slack&#34;, ExtensionArgs.builder()        
 *             .endpointUrl(&#34;https://generic_webhook_url/XXXXXX/BBBBBB&#34;)
 *             .extensionSchema(webhook.applyValue(getExtensionSchemaResult -&gt; getExtensionSchemaResult.id()))
 *             .extensionObjects(exampleService.id())
 *             .config(&#34;&#34;&#34;
 * {
 * 	&#34;restrict&#34;: &#34;any&#34;,
 * 	&#34;notify_types&#34;: {
 * 			&#34;resolve&#34;: false,
 * 			&#34;acknowledge&#34;: false,
 * 			&#34;assignments&#34;: false
 * 	},
 * 	&#34;access_token&#34;: &#34;XXX&#34;
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Extensions can be imported using the id.e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/extension:Extension main PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/extension:Extension")
public class Extension extends com.pulumi.resources.CustomResource {
    /**
     * The configuration of the service extension as string containing plain JSON-encoded data.
     * 
     */
    @Export(name="config", type=String.class, parameters={})
    private Output</* @Nullable */ String> config;

    /**
     * @return The configuration of the service extension as string containing plain JSON-encoded data.
     * 
     */
    public Output<Optional<String>> config() {
        return Codegen.optional(this.config);
    }
    /**
     * The url of the extension.
     * **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn&#39;t accept `pagerduty.Extension` with no `endpoint_url`, but one with named `Slack` accepts.
     * 
     */
    @Export(name="endpointUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpointUrl;

    /**
     * @return The url of the extension.
     * **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn&#39;t accept `pagerduty.Extension` with no `endpoint_url`, but one with named `Slack` accepts.
     * 
     */
    public Output<Optional<String>> endpointUrl() {
        return Codegen.optional(this.endpointUrl);
    }
    /**
     * This is the objects for which the extension applies (An array of service ids).
     * 
     */
    @Export(name="extensionObjects", type=List.class, parameters={String.class})
    private Output<List<String>> extensionObjects;

    /**
     * @return This is the objects for which the extension applies (An array of service ids).
     * 
     */
    public Output<List<String>> extensionObjects() {
        return this.extensionObjects;
    }
    /**
     * This is the schema for this extension.
     * 
     */
    @Export(name="extensionSchema", type=String.class, parameters={})
    private Output<String> extensionSchema;

    /**
     * @return This is the schema for this extension.
     * 
     */
    public Output<String> extensionSchema() {
        return this.extensionSchema;
    }
    /**
     * URL at which the entity is uniquely displayed in the Web app
     * 
     */
    @Export(name="htmlUrl", type=String.class, parameters={})
    private Output<String> htmlUrl;

    /**
     * @return URL at which the entity is uniquely displayed in the Web app
     * 
     */
    public Output<String> htmlUrl() {
        return this.htmlUrl;
    }
    /**
     * The name of the service extension.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the service extension.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     * 
     * **Note:** You can use the `pagerduty.getExtensionSchema` data source to locate the appropriate extension vendor ID.
     * 
     */
    @Export(name="summary", type=String.class, parameters={})
    private Output<String> summary;

    /**
     * @return A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     * 
     * **Note:** You can use the `pagerduty.getExtensionSchema` data source to locate the appropriate extension vendor ID.
     * 
     */
    public Output<String> summary() {
        return this.summary;
    }
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/extension:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Extension(String name, Output<String> id, @Nullable ExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/extension:Extension", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "endpointUrl"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Extension get(String name, Output<String> id, @Nullable ExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, state, options);
    }
}
