// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.UserContactMethodArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.UserContactMethodState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.UserContactMethod;
 * import com.pulumi.pagerduty.UserContactMethodArgs;
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
 *         var example = new User("example", UserArgs.builder()
 *             .name("Earline Greenholt")
 *             .email("125.greenholt.earline}{@literal @}{@code graham.name")
 *             .teams(examplePagerdutyTeam.id())
 *             .build());
 * 
 *         var email = new UserContactMethod("email", UserContactMethodArgs.builder()
 *             .userId(example.id())
 *             .type("email_contact_method")
 *             .address("foo}{@literal @}{@code bar.com")
 *             .label("Work")
 *             .build());
 * 
 *         var phone = new UserContactMethod("phone", UserContactMethodArgs.builder()
 *             .userId(example.id())
 *             .type("phone_contact_method")
 *             .countryCode(1)
 *             .address("2025550199")
 *             .label("Work")
 *             .build());
 * 
 *         var sms = new UserContactMethod("sms", UserContactMethodArgs.builder()
 *             .userId(example.id())
 *             .type("sms_contact_method")
 *             .countryCode(1)
 *             .address("2025550199")
 *             .label("Work")
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
 * Contact methods can be imported using the `user_id` and the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/userContactMethod:UserContactMethod main PLBP09X:PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/userContactMethod:UserContactMethod")
public class UserContactMethod extends com.pulumi.resources.CustomResource {
    /**
     * The &#34;address&#34; to deliver to: `email`, `phone number`, etc., depending on the type.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The &#34;address&#34; to deliver to: `email`, `phone number`, etc., depending on the type.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     * 
     */
    @Export(name="blacklisted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> blacklisted;

    /**
     * @return If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     * 
     */
    public Output<Boolean> blacklisted() {
        return this.blacklisted;
    }
    /**
     * The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
     * 
     */
    @Export(name="countryCode", refs={Integer.class}, tree="[0]")
    private Output<Integer> countryCode;

    /**
     * @return The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
     * 
     */
    public Output<Integer> countryCode() {
        return this.countryCode;
    }
    /**
     * If true, this phone is capable of receiving SMS messages.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return If true, this phone is capable of receiving SMS messages.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, etc.).
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, etc.).
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * Send an abbreviated email message instead of the standard email output.
     * 
     */
    @Export(name="sendShortEmail", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sendShortEmail;

    /**
     * @return Send an abbreviated email message instead of the standard email output.
     * 
     */
    public Output<Optional<Boolean>> sendShortEmail() {
        return Codegen.optional(this.sendShortEmail);
    }
    /**
     * The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The ID of the user.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The ID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserContactMethod(java.lang.String name) {
        this(name, UserContactMethodArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserContactMethod(java.lang.String name, UserContactMethodArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserContactMethod(java.lang.String name, UserContactMethodArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/userContactMethod:UserContactMethod", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private UserContactMethod(java.lang.String name, Output<java.lang.String> id, @Nullable UserContactMethodState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/userContactMethod:UserContactMethod", name, state, makeResourceOptions(options, id), false);
    }

    private static UserContactMethodArgs makeArgs(UserContactMethodArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UserContactMethodArgs.Empty : args;
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
    public static UserContactMethod get(java.lang.String name, Output<java.lang.String> id, @Nullable UserContactMethodState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserContactMethod(name, id, state, options);
    }
}
