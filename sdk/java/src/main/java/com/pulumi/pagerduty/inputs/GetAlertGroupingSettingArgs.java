// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.GetAlertGroupingSettingConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertGroupingSettingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertGroupingSettingArgs Empty = new GetAlertGroupingSettingArgs();

    /**
     * The values for the configuration setup for this setting.
     * 
     */
    @Import(name="config")
    private @Nullable Output<GetAlertGroupingSettingConfigArgs> config;

    /**
     * @return The values for the configuration setup for this setting.
     * 
     */
    public Optional<Output<GetAlertGroupingSettingConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The name to use to find an alert grouping setting in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name to use to find an alert grouping setting in the PagerDuty API.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetAlertGroupingSettingArgs() {}

    private GetAlertGroupingSettingArgs(GetAlertGroupingSettingArgs $) {
        this.config = $.config;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertGroupingSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertGroupingSettingArgs $;

        public Builder() {
            $ = new GetAlertGroupingSettingArgs();
        }

        public Builder(GetAlertGroupingSettingArgs defaults) {
            $ = new GetAlertGroupingSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The values for the configuration setup for this setting.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<GetAlertGroupingSettingConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The values for the configuration setup for this setting.
         * 
         * @return builder
         * 
         */
        public Builder config(GetAlertGroupingSettingConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param name The name to use to find an alert grouping setting in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to use to find an alert grouping setting in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetAlertGroupingSettingArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAlertGroupingSettingArgs", "name");
            }
            return $;
        }
    }

}
