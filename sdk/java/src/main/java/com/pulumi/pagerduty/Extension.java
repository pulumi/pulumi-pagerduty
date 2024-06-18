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
import javax.annotation.Nullable;

/**
 * An [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMw-create-an-extension) can be associated with a service.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
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
 *             .name("Generic V2 Webhook")
 *             .build());
 * 
 *         var example = new User("example", UserArgs.builder()
 *             .name("Howard James")
 *             .email("howard.james{@literal @}example.domain")
 *             .build());
 * 
 *         var exampleEscalationPolicy = new EscalationPolicy("exampleEscalationPolicy", EscalationPolicyArgs.builder()
 *             .name("Engineering Escalation Policy")
 *             .numLoops(2)
 *             .rules(EscalationPolicyRuleArgs.builder()
 *                 .escalationDelayInMinutes(10)
 *                 .targets(EscalationPolicyRuleTargetArgs.builder()
 *                     .type("user")
 *                     .id(example.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleService = new Service("exampleService", ServiceArgs.builder()
 *             .name("My Web App")
 *             .autoResolveTimeout(14400)
 *             .acknowledgementTimeout(600)
 *             .escalationPolicy(exampleEscalationPolicy.id())
 *             .build());
 * 
 *         var slack = new Extension("slack", ExtensionArgs.builder()
 *             .name("My Web App Extension")
 *             .endpointUrl("https://generic_webhook_url/XXXXXX/BBBBBB")
 *             .extensionSchema(webhook.applyValue(getExtensionSchemaResult -> getExtensionSchemaResult.id()))
 *             .extensionObjects(exampleService.id())
 *             .config("""
 * {
 * 	"restrict": "any",
 * 	"notify_types": {
 * 			"resolve": false,
 * 			"acknowledge": false,
 * 			"assignments": false
 * 	},
 * 	"access_token": "XXX"
 * }
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Extensions can be imported using the id.e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/extension:Extension main PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/extension:Extension")
public class Extension extends com.pulumi.resources.CustomResource {
    /**
     * The configuration of the service extension as string containing plain JSON-encoded data.
     * 
     */
    @Export(name="config", refs={String.class}, tree="[0]")
    private Output<String> config;

    /**
     * @return The configuration of the service extension as string containing plain JSON-encoded data.
     * 
     */
    public Output<String> config() {
        return this.config;
    }
    /**
     * The url of the extension.
     * **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn&#39;t accept `pagerduty.Extension` with no `endpoint_url`, but one with named `Slack` accepts.
     * 
     */
    @Export(name="endpointUrl", refs={String.class}, tree="[0]")
    private Output<String> endpointUrl;

    /**
     * @return The url of the extension.
     * **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `pagerduty.getExtensionSchema` named `Generic V2 Webhook` doesn&#39;t accept `pagerduty.Extension` with no `endpoint_url`, but one with named `Slack` accepts.
     * 
     */
    public Output<String> endpointUrl() {
        return this.endpointUrl;
    }
    /**
     * This is the objects for which the extension applies (An array of service ids).
     * 
     */
    @Export(name="extensionObjects", refs={List.class,String.class}, tree="[0,1]")
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
    @Export(name="extensionSchema", refs={String.class}, tree="[0]")
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
    @Export(name="htmlUrl", refs={String.class}, tree="[0]")
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
    @Export(name="name", refs={String.class}, tree="[0]")
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
    @Export(name="summary", refs={String.class}, tree="[0]")
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
    @Export(name="type", refs={String.class}, tree="[0]")
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
