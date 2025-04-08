// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceScheduledActionAt {
    /**
     * @return Designates either the start or the end of the scheduled action. Can be `support_hours_start` or `support_hours_end`.
     * 
     * Note that it is currently only possible to define the scheduled action when urgency is set to `high` for `during_support_hours` and to `low`  for `outside_support_hours` in `incident_urgency_rule`.
     * 
     * Below is an example for a `pagerduty.Service` resource with `incident_urgency_rules` with `type = &#34;use_support_hours&#34;`, `support_hours` and a default `scheduled_action` as well.
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.pagerduty.Service;
     * import com.pulumi.pagerduty.ServiceArgs;
     * import com.pulumi.pagerduty.inputs.ServiceIncidentUrgencyRuleArgs;
     * import com.pulumi.pagerduty.inputs.ServiceIncidentUrgencyRuleDuringSupportHoursArgs;
     * import com.pulumi.pagerduty.inputs.ServiceIncidentUrgencyRuleOutsideSupportHoursArgs;
     * import com.pulumi.pagerduty.inputs.ServiceSupportHoursArgs;
     * import com.pulumi.pagerduty.inputs.ServiceScheduledActionArgs;
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
     *         var foo = new Service("foo", ServiceArgs.builder()
     *             .name("bar")
     *             .description("bar bar bar")
     *             .autoResolveTimeout("3600")
     *             .acknowledgementTimeout("3600")
     *             .escalationPolicy(fooPagerdutyEscalationPolicy.id())
     *             .incidentUrgencyRule(ServiceIncidentUrgencyRuleArgs.builder()
     *                 .type("use_support_hours")
     *                 .duringSupportHours(ServiceIncidentUrgencyRuleDuringSupportHoursArgs.builder()
     *                     .type("constant")
     *                     .urgency("high")
     *                     .build())
     *                 .outsideSupportHours(ServiceIncidentUrgencyRuleOutsideSupportHoursArgs.builder()
     *                     .type("constant")
     *                     .urgency("low")
     *                     .build())
     *                 .build())
     *             .supportHours(ServiceSupportHoursArgs.builder()
     *                 .type("fixed_time_per_day")
     *                 .timeZone("America/Lima")
     *                 .startTime("09:00:00")
     *                 .endTime("17:00:00")
     *                 .daysOfWeeks(                
     *                     1,
     *                     2,
     *                     3,
     *                     4,
     *                     5)
     *                 .build())
     *             .scheduledActions(ServiceScheduledActionArgs.builder()
     *                 .type("urgency_change")
     *                 .toUrgency("high")
     *                 .ats(ServiceScheduledActionAtArgs.builder()
     *                     .type("named_time")
     *                     .name("support_hours_start")
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    private @Nullable String name;
    /**
     * @return The type of time specification. Currently, this must be set to `named_time`.
     * 
     */
    private @Nullable String type;

    private ServiceScheduledActionAt() {}
    /**
     * @return Designates either the start or the end of the scheduled action. Can be `support_hours_start` or `support_hours_end`.
     * 
     * Note that it is currently only possible to define the scheduled action when urgency is set to `high` for `during_support_hours` and to `low`  for `outside_support_hours` in `incident_urgency_rule`.
     * 
     * Below is an example for a `pagerduty.Service` resource with `incident_urgency_rules` with `type = &#34;use_support_hours&#34;`, `support_hours` and a default `scheduled_action` as well.
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.pagerduty.Service;
     * import com.pulumi.pagerduty.ServiceArgs;
     * import com.pulumi.pagerduty.inputs.ServiceIncidentUrgencyRuleArgs;
     * import com.pulumi.pagerduty.inputs.ServiceIncidentUrgencyRuleDuringSupportHoursArgs;
     * import com.pulumi.pagerduty.inputs.ServiceIncidentUrgencyRuleOutsideSupportHoursArgs;
     * import com.pulumi.pagerduty.inputs.ServiceSupportHoursArgs;
     * import com.pulumi.pagerduty.inputs.ServiceScheduledActionArgs;
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
     *         var foo = new Service("foo", ServiceArgs.builder()
     *             .name("bar")
     *             .description("bar bar bar")
     *             .autoResolveTimeout("3600")
     *             .acknowledgementTimeout("3600")
     *             .escalationPolicy(fooPagerdutyEscalationPolicy.id())
     *             .incidentUrgencyRule(ServiceIncidentUrgencyRuleArgs.builder()
     *                 .type("use_support_hours")
     *                 .duringSupportHours(ServiceIncidentUrgencyRuleDuringSupportHoursArgs.builder()
     *                     .type("constant")
     *                     .urgency("high")
     *                     .build())
     *                 .outsideSupportHours(ServiceIncidentUrgencyRuleOutsideSupportHoursArgs.builder()
     *                     .type("constant")
     *                     .urgency("low")
     *                     .build())
     *                 .build())
     *             .supportHours(ServiceSupportHoursArgs.builder()
     *                 .type("fixed_time_per_day")
     *                 .timeZone("America/Lima")
     *                 .startTime("09:00:00")
     *                 .endTime("17:00:00")
     *                 .daysOfWeeks(                
     *                     1,
     *                     2,
     *                     3,
     *                     4,
     *                     5)
     *                 .build())
     *             .scheduledActions(ServiceScheduledActionArgs.builder()
     *                 .type("urgency_change")
     *                 .toUrgency("high")
     *                 .ats(ServiceScheduledActionAtArgs.builder()
     *                     .type("named_time")
     *                     .name("support_hours_start")
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The type of time specification. Currently, this must be set to `named_time`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceScheduledActionAt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;
        public Builder() {}
        public Builder(ServiceScheduledActionAt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ServiceScheduledActionAt build() {
            final var _resultValue = new ServiceScheduledActionAt();
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
