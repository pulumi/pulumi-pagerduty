// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pagerduty.RulesetArgs;
import com.pulumi.pagerduty.Utilities;
import com.pulumi.pagerduty.inputs.RulesetState;
import com.pulumi.pagerduty.outputs.RulesetTeam;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * [Rulesets](https://support.pagerduty.com/docs/rulesets) allow you to route events to an endpoint and create collections of event rules, which define sets of actions to take based on event content.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.pagerduty.Team;
 * import com.pulumi.pagerduty.Ruleset;
 * import com.pulumi.pagerduty.RulesetArgs;
 * import com.pulumi.pagerduty.inputs.RulesetTeamArgs;
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
 *         var fooTeam = new Team(&#34;fooTeam&#34;);
 * 
 *         var fooRuleset = new Ruleset(&#34;fooRuleset&#34;, RulesetArgs.builder()        
 *             .team(RulesetTeamArgs.builder()
 *                 .id(fooTeam.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Rulesets can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import pagerduty:index/ruleset:Ruleset main 19acac92-027a-4ea0-b06c-bbf516519601
 * ```
 * 
 */
@ResourceType(type="pagerduty:index/ruleset:Ruleset")
public class Ruleset extends com.pulumi.resources.CustomResource {
    /**
     * Name of the ruleset.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the ruleset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Routing keys routed to this ruleset.
     * 
     */
    @Export(name="routingKeys", type=List.class, parameters={String.class})
    private Output<List<String>> routingKeys;

    /**
     * @return Routing keys routed to this ruleset.
     * 
     */
    public Output<List<String>> routingKeys() {
        return this.routingKeys;
    }
    /**
     * Reference to the team that owns the ruleset. If none is specified, only admins have access.
     * 
     */
    @Export(name="team", type=RulesetTeam.class, parameters={})
    private Output</* @Nullable */ RulesetTeam> team;

    /**
     * @return Reference to the team that owns the ruleset. If none is specified, only admins have access.
     * 
     */
    public Output<Optional<RulesetTeam>> team() {
        return Codegen.optional(this.team);
    }
    /**
     * Type of ruleset. Currently, only sets to `global`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of ruleset. Currently, only sets to `global`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ruleset(String name) {
        this(name, RulesetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ruleset(String name, @Nullable RulesetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ruleset(String name, @Nullable RulesetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/ruleset:Ruleset", name, args == null ? RulesetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ruleset(String name, Output<String> id, @Nullable RulesetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pagerduty:index/ruleset:Ruleset", name, state, makeResourceOptions(options, id));
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
    public static Ruleset get(String name, Output<String> id, @Nullable RulesetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ruleset(name, id, state, options);
    }
}