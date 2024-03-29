// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddonState extends com.pulumi.resources.ResourceArgs {

    public static final AddonState Empty = new AddonState();

    /**
     * The name of the add-on.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the add-on.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
     * 
     */
    @Import(name="src")
    private @Nullable Output<String> src;

    /**
     * @return The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
     * 
     */
    public Optional<Output<String>> src() {
        return Optional.ofNullable(this.src);
    }

    private AddonState() {}

    private AddonState(AddonState $) {
        this.name = $.name;
        this.src = $.src;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddonState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddonState $;

        public Builder() {
            $ = new AddonState();
        }

        public Builder(AddonState defaults) {
            $ = new AddonState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the add-on.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the add-on.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param src The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
         * 
         * @return builder
         * 
         */
        public Builder src(@Nullable Output<String> src) {
            $.src = src;
            return this;
        }

        /**
         * @param src The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
         * 
         * @return builder
         * 
         */
        public Builder src(String src) {
            return src(Output.of(src));
        }

        public AddonState build() {
            return $;
        }
    }

}
