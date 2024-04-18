// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.AutomationActionsActionServiceAssociationArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.AutomationActionsActionServiceAssociationState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An Automation Actions [action association with a service](https://developer.pagerduty.com/api-reference/5d2f051f3fb43-associate-an-automation-action-with-a-service) configures the relation of a specific Action with a Service.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.EscalationPolicy;
 * import com.pulumi.pagerduty.EscalationPolicyArgs;
 * import com.pulumi.pagerduty.inputs.EscalationPolicyRuleArgs;
 * import com.pulumi.pagerduty.Service;
 * import com.pulumi.pagerduty.ServiceArgs;
 * import com.pulumi.pagerduty.inputs.ServiceAutoPauseNotificationsParametersArgs;
 * import com.pulumi.pagerduty.AutomationActionsAction;
 * import com.pulumi.pagerduty.AutomationActionsActionArgs;
 * import com.pulumi.pagerduty.inputs.AutomationActionsActionActionDataReferenceArgs;
 * import com.pulumi.pagerduty.AutomationActionsActionServiceAssociation;
 * import com.pulumi.pagerduty.AutomationActionsActionServiceAssociationArgs;
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
 *         var example = new User(&#34;example&#34;, UserArgs.builder()        
 *             .name(&#34;Earline Greenholt&#34;)
 *             .email(&#34;125.greenholt.earline@graham.name&#34;)
 *             .build());
 * 
 *         var foo = new EscalationPolicy(&#34;foo&#34;, EscalationPolicyArgs.builder()        
 *             .name(&#34;Engineering Escalation Policy&#34;)
 *             .numLoops(2)
 *             .rules(EscalationPolicyRuleArgs.builder()
 *                 .escalationDelayInMinutes(10)
 *                 .targets(EscalationPolicyRuleTargetArgs.builder()
 *                     .type(&#34;user_reference&#34;)
 *                     .id(example.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .name(&#34;My Web App&#34;)
 *             .autoResolveTimeout(14400)
 *             .acknowledgementTimeout(600)
 *             .escalationPolicy(foo.id())
 *             .alertCreation(&#34;create_alerts_and_incidents&#34;)
 *             .autoPauseNotificationsParameters(ServiceAutoPauseNotificationsParametersArgs.builder()
 *                 .enabled(true)
 *                 .timeout(300)
 *                 .build())
 *             .build());
 * 
 *         var paActionExample = new AutomationActionsAction(&#34;paActionExample&#34;, AutomationActionsActionArgs.builder()        
 *             .name(&#34;PA Action created via TF&#34;)
 *             .description(&#34;Description of the PA Action created via TF&#34;)
 *             .actionType(&#34;process_automation&#34;)
 *             .actionDataReference(AutomationActionsActionActionDataReferenceArgs.builder()
 *                 .processAutomationJobId(&#34;P123456&#34;)
 *                 .build())
 *             .build());
 * 
 *         var fooAutomationActionsActionServiceAssociation = new AutomationActionsActionServiceAssociation(&#34;fooAutomationActionsActionServiceAssociation&#34;, AutomationActionsActionServiceAssociationArgs.builder()        
 *             .actionId(paActionExample.id())
 *             .serviceId(exampleService.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Action service association can be imported using the `action_id` and `service_id` separated by a colon, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation")
public class AutomationActionsActionServiceAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Id of the action.
     * 
     */
    @Export(name="actionId", refs={String.class}, tree="[0]")
    private Output<String> actionId;

    /**
     * @return Id of the action.
     * 
     */
    public Output<String> actionId() {
        return this.actionId;
    }
    /**
     * Id of the service associated to the action.
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return Id of the service associated to the action.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutomationActionsActionServiceAssociation(String name) {
        this(name, AutomationActionsActionServiceAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutomationActionsActionServiceAssociation(String name, AutomationActionsActionServiceAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutomationActionsActionServiceAssociation(String name, AutomationActionsActionServiceAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation", name, args == null ? AutomationActionsActionServiceAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutomationActionsActionServiceAssociation(String name, Output<String> id, @Nullable AutomationActionsActionServiceAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation", name, state, makeResourceOptions(options, id));
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
    public static AutomationActionsActionServiceAssociation get(String name, Output<String> id, @Nullable AutomationActionsActionServiceAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutomationActionsActionServiceAssociation(name, id, state, options);
    }
}
