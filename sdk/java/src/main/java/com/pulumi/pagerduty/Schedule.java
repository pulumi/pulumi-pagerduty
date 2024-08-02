// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.ScheduleArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.ScheduleState;
import com.pulumi.pagerduty.outputs.ScheduleFinalSchedule;
import com.pulumi.pagerduty.outputs.ScheduleLayer;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A [schedule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE4Mg-create-a-schedule) determines the time periods that users are on call. Only on-call users are eligible to receive notifications from incidents.
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
 * import com.pulumi.pagerduty.User;
 * import com.pulumi.pagerduty.UserArgs;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.TeamArgs;
 * import com.pulumi.pagerduty.Schedule;
 * import com.pulumi.pagerduty.ScheduleArgs;
 * import com.pulumi.pagerduty.inputs.ScheduleLayerArgs;
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
 *         var example = new User("example", UserArgs.builder()
 *             .name("Earline Greenholt")
 *             .email("125.greenholt.earline{@literal @}graham.name")
 *             .build());
 * 
 *         var exampleTeam = new Team("exampleTeam", TeamArgs.builder()
 *             .name("A Team")
 *             .build());
 * 
 *         var foo = new Schedule("foo", ScheduleArgs.builder()
 *             .name("Daily Engineering Rotation")
 *             .timeZone("America/New_York")
 *             .layers(ScheduleLayerArgs.builder()
 *                 .name("Night Shift")
 *                 .start("2015-11-06T20:00:00-05:00")
 *                 .rotationVirtualStart("2015-11-06T20:00:00-05:00")
 *                 .rotationTurnLengthSeconds(86400)
 *                 .users(example.id())
 *                 .restrictions(ScheduleLayerRestrictionArgs.builder()
 *                     .type("daily_restriction")
 *                     .startTimeOfDay("08:00:00")
 *                     .durationSeconds(32400)
 *                     .build())
 *                 .build())
 *             .teams(exampleTeam.id())
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
 * Schedules can be imported using the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/schedule:Schedule main PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/schedule:Schedule")
public class Schedule extends com.pulumi.resources.CustomResource {
    /**
     * The description of the schedule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the schedule.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    @Export(name="finalSchedules", refs={List.class,ScheduleFinalSchedule.class}, tree="[0,1]")
    private Output<List<ScheduleFinalSchedule>> finalSchedules;

    public Output<List<ScheduleFinalSchedule>> finalSchedules() {
        return this.finalSchedules;
    }
    /**
     * A schedule layer block. Schedule layers documented below.
     * 
     */
    @Export(name="layers", refs={List.class,ScheduleLayer.class}, tree="[0,1]")
    private Output<List<ScheduleLayer>> layers;

    /**
     * @return A schedule layer block. Schedule layers documented below.
     * 
     */
    public Output<List<ScheduleLayer>> layers() {
        return this.layers;
    }
    /**
     * The name of the schedule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the schedule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
     * If you don&#39;t pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
     * If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
     * 
     */
    @Export(name="overflow", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> overflow;

    /**
     * @return Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
     * If you don&#39;t pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
     * If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
     * 
     */
    public Output<Optional<Boolean>> overflow() {
        return Codegen.optional(this.overflow);
    }
    /**
     * Teams associated with the schedule.
     * 
     */
    @Export(name="teams", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> teams;

    /**
     * @return Teams associated with the schedule.
     * 
     */
    public Output<Optional<List<String>>> teams() {
        return Codegen.optional(this.teams);
    }
    /**
     * The time zone of the schedule (e.g. `Europe/Berlin`).
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output<String> timeZone;

    /**
     * @return The time zone of the schedule (e.g. `Europe/Berlin`).
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schedule(String name) {
        this(name, ScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schedule(String name, ScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, ScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/schedule:Schedule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Schedule(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/schedule:Schedule", name, state, makeResourceOptions(options, id));
    }

    private static ScheduleArgs makeArgs(ScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ScheduleArgs.Empty : args;
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
    public static Schedule get(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, state, options);
    }
}
