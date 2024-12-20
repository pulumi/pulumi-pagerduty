// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.GetAlertGroupingSettingConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertGroupingSettingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertGroupingSettingPlainArgs Empty = new GetAlertGroupingSettingPlainArgs();

    /**
     * The values for the configuration setup for this setting.
     * 
     */
    @Import(name="config")
    private @Nullable GetAlertGroupingSettingConfig config;

    /**
     * @return The values for the configuration setup for this setting.
     * 
     */
    public Optional<GetAlertGroupingSettingConfig> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The name to use to find an alert grouping setting in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name to use to find an alert grouping setting in the PagerDuty API.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetAlertGroupingSettingPlainArgs() {}

    private GetAlertGroupingSettingPlainArgs(GetAlertGroupingSettingPlainArgs $) {
        this.config = $.config;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertGroupingSettingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertGroupingSettingPlainArgs $;

        public Builder() {
            $ = new GetAlertGroupingSettingPlainArgs();
        }

        public Builder(GetAlertGroupingSettingPlainArgs defaults) {
            $ = new GetAlertGroupingSettingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The values for the configuration setup for this setting.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable GetAlertGroupingSettingConfig config) {
            $.config = config;
            return this;
        }

        /**
         * @param name The name to use to find an alert grouping setting in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetAlertGroupingSettingPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAlertGroupingSettingPlainArgs", "name");
            }
            return $;
        }
    }

}
