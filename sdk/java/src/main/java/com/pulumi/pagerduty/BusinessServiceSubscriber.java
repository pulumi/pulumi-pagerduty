// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.BusinessServiceSubscriberArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.BusinessServiceSubscriberState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A [business service subscriber](https://developer.pagerduty.com/api-reference/b3A6NDUwNDgxOQ-list-business-service-subscribers) allows you to subscribe users or teams to automatically receive updates about key business services.
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
 * import com.pulumi.pagerduty.BusinessService;
 * import com.pulumi.pagerduty.BusinessServiceArgs;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.TeamArgs;
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.BusinessServiceSubscriber;
 * import com.pulumi.pagerduty.BusinessServiceSubscriberArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new BusinessService("example", BusinessServiceArgs.builder()
 *             .name("My Web App")
 *             .description("A very descriptive description of this business service")
 *             .pointOfContact("PagerDuty Admin")
 *             .team("P37RSRS")
 *             .build());
 * 
 *         var engteam = new Team("engteam", TeamArgs.builder()
 *             .name("Engineering")
 *             .build());
 * 
 *         var exampleUser = new User("exampleUser", UserArgs.builder()
 *             .name("Earline Greenholt")
 *             .email("125.greenholt.earline}{@literal @}{@code graham.name")
 *             .build());
 * 
 *         var teamExample = new BusinessServiceSubscriber("teamExample", BusinessServiceSubscriberArgs.builder()
 *             .subscriberId(engteam.id())
 *             .subscriberType("team")
 *             .businessServiceId(example.id())
 *             .build());
 * 
 *         var userExample = new BusinessServiceSubscriber("userExample", BusinessServiceSubscriberArgs.builder()
 *             .subscriberId(exampleUser.id())
 *             .subscriberType("user")
 *             .businessServiceId(example.id())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Services can be imported using the `id` using the related business service ID, the subscriber type and the subscriber ID separated by a dot, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber main PLBP09X.team.PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber")
public class BusinessServiceSubscriber extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the business service to subscribe to.
     * 
     */
    @Export(name="businessServiceId", refs={String.class}, tree="[0]")
    private Output<String> businessServiceId;

    /**
     * @return The ID of the business service to subscribe to.
     * 
     */
    public Output<String> businessServiceId() {
        return this.businessServiceId;
    }
    /**
     * The ID of the subscriber entity.
     * 
     */
    @Export(name="subscriberId", refs={String.class}, tree="[0]")
    private Output<String> subscriberId;

    /**
     * @return The ID of the subscriber entity.
     * 
     */
    public Output<String> subscriberId() {
        return this.subscriberId;
    }
    /**
     * Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
     * 
     */
    @Export(name="subscriberType", refs={String.class}, tree="[0]")
    private Output<String> subscriberType;

    /**
     * @return Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
     * 
     */
    public Output<String> subscriberType() {
        return this.subscriberType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BusinessServiceSubscriber(java.lang.String name) {
        this(name, BusinessServiceSubscriberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BusinessServiceSubscriber(java.lang.String name, BusinessServiceSubscriberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BusinessServiceSubscriber(java.lang.String name, BusinessServiceSubscriberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private BusinessServiceSubscriber(java.lang.String name, Output<java.lang.String> id, @Nullable BusinessServiceSubscriberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber", name, state, makeResourceOptions(options, id), false);
    }

    private static BusinessServiceSubscriberArgs makeArgs(BusinessServiceSubscriberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BusinessServiceSubscriberArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static BusinessServiceSubscriber get(java.lang.String name, Output<java.lang.String> id, @Nullable BusinessServiceSubscriberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BusinessServiceSubscriber(name, id, state, options);
    }
}
