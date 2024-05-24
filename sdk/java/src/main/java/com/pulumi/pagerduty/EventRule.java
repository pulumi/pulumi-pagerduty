// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.EventRuleArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.EventRuleState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * *NOTE: The `pagerduty.EventRule` resource has been deprecated in favor of the pagerduty.Ruleset and pagerduty.RulesetRule resources. Please use the `ruleset` based resources for working with Event Rules.*
 * 
 * An [event rule](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/) determines what happens to an event that is sent to PagerDuty by monitoring tools and other integrations.
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
 * import com.pulumi.pagerduty.EventRule;
 * import com.pulumi.pagerduty.EventRuleArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var second = new EventRule("second", EventRuleArgs.builder()
 *             .actionJson(serializeJson(
 *                 jsonArray(
 *                     jsonArray(
 *                         "route", 
 *                         "P5DTL0K"
 *                     ), 
 *                     jsonArray(
 *                         "severity", 
 *                         "warning"
 *                     ), 
 *                     jsonArray(
 *                         "annotate", 
 *                         "2 Managed by terraform"
 *                     ), 
 *                     jsonArray(
 *                         "priority", 
 *                         "PL451DT"
 *                     )
 *                 )))
 *             .conditionJson(serializeJson(
 *                 jsonArray(
 *                     "and", 
 *                     jsonArray(
 *                         "contains", 
 *                         jsonArray(
 *                             "path", 
 *                             "payload", 
 *                             "source"
 *                         ), 
 *                         "website"
 *                     ), 
 *                     jsonArray(
 *                         "contains", 
 *                         jsonArray(
 *                             "path", 
 *                             "headers", 
 *                             "from", 
 *                             "0", 
 *                             "address"
 *                         ), 
 *                         "homer"
 *                     )
 *                 )))
 *             .advancedConditionJson(serializeJson(
 *                 jsonArray(jsonArray(
 *                     "scheduled-weekly", 
 *                     1565392127032, 
 *                     3600000, 
 *                     "America/Los_Angeles", 
 *                     jsonArray(
 *                         1, 
 *                         2, 
 *                         3, 
 *                         5, 
 *                         7
 *                     )
 *                 ))))
 *             .build());
 * 
 *         var third = new EventRule("third", EventRuleArgs.builder()
 *             .actionJson(serializeJson(
 *                 jsonArray(
 *                     jsonArray(
 *                         "route", 
 *                         "P5DTL0K"
 *                     ), 
 *                     jsonArray(
 *                         "severity", 
 *                         "warning"
 *                     ), 
 *                     jsonArray(
 *                         "annotate", 
 *                         "3 Managed by terraform"
 *                     ), 
 *                     jsonArray(
 *                         "priority", 
 *                         "PL451DT"
 *                     )
 *                 )))
 *             .conditionJson(serializeJson(
 *                 jsonArray(
 *                     "and", 
 *                     jsonArray(
 *                         "contains", 
 *                         jsonArray(
 *                             "path", 
 *                             "payload", 
 *                             "source"
 *                         ), 
 *                         "website"
 *                     ), 
 *                     jsonArray(
 *                         "contains", 
 *                         jsonArray(
 *                             "path", 
 *                             "headers", 
 *                             "from", 
 *                             "0", 
 *                             "address"
 *                         ), 
 *                         "homer"
 *                     )
 *                 )))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(two)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Event rules can be imported using the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/eventRule:EventRule main 19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/eventRule:EventRule")
public class EventRule extends com.pulumi.resources.CustomResource {
    /**
     * A list of one or more actions for each rule. Each action within the list is itself a list.
     * 
     */
    @Export(name="actionJson", refs={String.class}, tree="[0]")
    private Output<String> actionJson;

    /**
     * @return A list of one or more actions for each rule. Each action within the list is itself a list.
     * 
     */
    public Output<String> actionJson() {
        return this.actionJson;
    }
    /**
     * Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
     * 
     */
    @Export(name="advancedConditionJson", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> advancedConditionJson;

    /**
     * @return Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
     * 
     */
    public Output<Optional<String>> advancedConditionJson() {
        return Codegen.optional(this.advancedConditionJson);
    }
    /**
     * A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
     * 
     */
    @Export(name="catchAll", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> catchAll;

    /**
     * @return A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
     * 
     */
    public Output<Boolean> catchAll() {
        return this.catchAll;
    }
    /**
     * Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
     * 
     */
    @Export(name="conditionJson", refs={String.class}, tree="[0]")
    private Output<String> conditionJson;

    /**
     * @return Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
     * 
     */
    public Output<String> conditionJson() {
        return this.conditionJson;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventRule(String name) {
        this(name, EventRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventRule(String name, EventRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventRule(String name, EventRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventRule:EventRule", name, args == null ? EventRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventRule(String name, Output<String> id, @Nullable EventRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/eventRule:EventRule", name, state, makeResourceOptions(options, id));
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
    public static EventRule get(String name, Output<String> id, @Nullable EventRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventRule(name, id, state, options);
    }
}
