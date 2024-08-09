// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.MaintenanceWindowArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.MaintenanceWindowState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A [maintenance window](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE1OA-create-a-maintenance-window) is used to temporarily disable one or more services for a set period of time. No incidents will be triggered and no notifications will be received while a service is disabled by a maintenance window.
 * 
 * Maintenance windows are specified to start at a certain time and end after they have begun. Once started, a maintenance window cannot be deleted; it can only be ended immediately to re-enable the service.
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
 * import com.pulumi.pagerduty.MaintenanceWindow;
 * import com.pulumi.pagerduty.MaintenanceWindowArgs;
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
 *         var example = new MaintenanceWindow("example", MaintenanceWindowArgs.builder()
 *             .startTime("2015-11-09T20:00:00-05:00")
 *             .endTime("2015-11-09T22:00:00-05:00")
 *             .services(examplePagerdutyService.id())
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
 * Maintenance windows can be imported using the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import pagerduty:index/maintenanceWindow:MaintenanceWindow main PLBP09X
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/maintenanceWindow:MaintenanceWindow")
public class MaintenanceWindow extends com.pulumi.resources.CustomResource {
    /**
     * A description for the maintenance window.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description for the maintenance window.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The maintenance window&#39;s end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
     * 
     */
    @Export(name="endTime", refs={String.class}, tree="[0]")
    private Output<String> endTime;

    /**
     * @return The maintenance window&#39;s end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * A list of service IDs to include in the maintenance window.
     * 
     */
    @Export(name="services", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> services;

    /**
     * @return A list of service IDs to include in the maintenance window.
     * 
     */
    public Output<List<String>> services() {
        return this.services;
    }
    /**
     * The maintenance window&#39;s start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
     * 
     */
    @Export(name="startTime", refs={String.class}, tree="[0]")
    private Output<String> startTime;

    /**
     * @return The maintenance window&#39;s start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MaintenanceWindow(java.lang.String name) {
        this(name, MaintenanceWindowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MaintenanceWindow(java.lang.String name, MaintenanceWindowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MaintenanceWindow(java.lang.String name, MaintenanceWindowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/maintenanceWindow:MaintenanceWindow", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MaintenanceWindow(java.lang.String name, Output<java.lang.String> id, @Nullable MaintenanceWindowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/maintenanceWindow:MaintenanceWindow", name, state, makeResourceOptions(options, id), false);
    }

    private static MaintenanceWindowArgs makeArgs(MaintenanceWindowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MaintenanceWindowArgs.Empty : args;
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
    public static MaintenanceWindow get(java.lang.String name, Output<java.lang.String> id, @Nullable MaintenanceWindowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MaintenanceWindow(name, id, state, options);
    }
}
