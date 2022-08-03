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
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.BusinessService;
 * import com.pulumi.pagerduty.BusinessServiceArgs;
 * import com.pulumi.pagerduty.Team;
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
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleBusinessService = new BusinessService(&#34;exampleBusinessService&#34;, BusinessServiceArgs.builder()        
 *             .description(&#34;A very descriptive description of this business service&#34;)
 *             .pointOfContact(&#34;PagerDuty Admin&#34;)
 *             .team(&#34;P37RSRS&#34;)
 *             .build());
 * 
 *         var engteam = new Team(&#34;engteam&#34;);
 * 
 *         var exampleUser = new User(&#34;exampleUser&#34;, UserArgs.builder()        
 *             .email(&#34;125.greenholt.earline@graham.name&#34;)
 *             .build());
 * 
 *         var teamExample = new BusinessServiceSubscriber(&#34;teamExample&#34;, BusinessServiceSubscriberArgs.builder()        
 *             .subscriberId(engteam.id())
 *             .subscriberType(&#34;team&#34;)
 *             .businessServiceId(exampleBusinessService.id())
 *             .build());
 * 
 *         var userExample = new BusinessServiceSubscriber(&#34;userExample&#34;, BusinessServiceSubscriberArgs.builder()        
 *             .subscriberId(exampleUser.id())
 *             .subscriberType(&#34;user&#34;)
 *             .businessServiceId(exampleBusinessService.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Services can be imported using the `id` using the related business service ID, the subscriber type and the subscriber ID separated by a dot, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber main PLBP09X.team.PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber")
public class BusinessServiceSubscriber extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the business service to subscribe to.
     * 
     */
    @Export(name="businessServiceId", type=String.class, parameters={})
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
    @Export(name="subscriberId", type=String.class, parameters={})
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
    @Export(name="subscriberType", type=String.class, parameters={})
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
    public BusinessServiceSubscriber(String name) {
        this(name, BusinessServiceSubscriberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BusinessServiceSubscriber(String name, BusinessServiceSubscriberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BusinessServiceSubscriber(String name, BusinessServiceSubscriberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber", name, args == null ? BusinessServiceSubscriberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BusinessServiceSubscriber(String name, Output<String> id, @Nullable BusinessServiceSubscriberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber", name, state, makeResourceOptions(options, id));
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
    public static BusinessServiceSubscriber get(String name, Output<String> id, @Nullable BusinessServiceSubscriberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BusinessServiceSubscriber(name, id, state, options);
    }
}
