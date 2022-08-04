// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.BusinessServiceArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.BusinessServiceState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A [business service](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODExNg-create-a-business-service) allows you to model capabilities that span multiple technical services and that may be owned by several different teams.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.BusinessService;
 * import com.pulumi.pagerduty.BusinessServiceArgs;
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
 *         var example = new BusinessService(&#34;example&#34;, BusinessServiceArgs.builder()        
 *             .description(&#34;A very descriptive description of this business service&#34;)
 *             .pointOfContact(&#34;PagerDuty Admin&#34;)
 *             .team(&#34;P37RSRS&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Services can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/businessService:BusinessService main PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/businessService:BusinessService")
public class BusinessService extends com.pulumi.resources.CustomResource {
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }
    @Export(name="htmlUrl", type=String.class, parameters={})
    private Output<String> htmlUrl;

    public Output<String> htmlUrl() {
        return this.htmlUrl;
    }
    /**
     * The name of the business service.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the business service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The owner of the business service.
     * 
     */
    @Export(name="pointOfContact", type=String.class, parameters={})
    private Output</* @Nullable */ String> pointOfContact;

    /**
     * @return The owner of the business service.
     * 
     */
    public Output<Optional<String>> pointOfContact() {
        return Codegen.optional(this.pointOfContact);
    }
    @Export(name="self", type=String.class, parameters={})
    private Output<String> self;

    public Output<String> self() {
        return this.self;
    }
    @Export(name="summary", type=String.class, parameters={})
    private Output<String> summary;

    public Output<String> summary() {
        return this.summary;
    }
    /**
     * ID of the team that owns the business service.
     * 
     */
    @Export(name="team", type=String.class, parameters={})
    private Output</* @Nullable */ String> team;

    /**
     * @return ID of the team that owns the business service.
     * 
     */
    public Output<Optional<String>> team() {
        return Codegen.optional(this.team);
    }
    /**
     * **Deprecated** (Optional) Default (and only supported) value is `business_service`.
     * 
     * @deprecated
     * This will change to a computed resource in the next major release.
     * 
     */
    @Deprecated /* This will change to a computed resource in the next major release. */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return **Deprecated** (Optional) Default (and only supported) value is `business_service`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BusinessService(String name) {
        this(name, BusinessServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BusinessService(String name, @Nullable BusinessServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BusinessService(String name, @Nullable BusinessServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/businessService:BusinessService", name, args == null ? BusinessServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BusinessService(String name, Output<String> id, @Nullable BusinessServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/businessService:BusinessService", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static BusinessService get(String name, Output<String> id, @Nullable BusinessServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BusinessService(name, id, state, options);
    }
}
