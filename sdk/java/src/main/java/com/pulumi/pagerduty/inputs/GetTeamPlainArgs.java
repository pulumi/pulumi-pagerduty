// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamPlainArgs Empty = new GetTeamPlainArgs();

    /**
     * (Optional) The team is private if the value is &#34;none&#34;, or public if it is &#34;manager&#34; (the default permissions for a non-member of the team are either &#34;none&#34;, or their base role up until &#34;manager&#34;).
     * 
     */
    @Import(name="defaultRole")
    private @Nullable String defaultRole;

    /**
     * @return (Optional) The team is private if the value is &#34;none&#34;, or public if it is &#34;manager&#34; (the default permissions for a non-member of the team are either &#34;none&#34;, or their base role up until &#34;manager&#34;).
     * 
     */
    public Optional<String> defaultRole() {
        return Optional.ofNullable(this.defaultRole);
    }

    /**
     * The name of the team to find in the PagerDuty API.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the team to find in the PagerDuty API.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
     * 
     */
    @Import(name="parent")
    private @Nullable String parent;

    /**
     * @return ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
     * 
     */
    public Optional<String> parent() {
        return Optional.ofNullable(this.parent);
    }

    private GetTeamPlainArgs() {}

    private GetTeamPlainArgs(GetTeamPlainArgs $) {
        this.defaultRole = $.defaultRole;
        this.name = $.name;
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamPlainArgs $;

        public Builder() {
            $ = new GetTeamPlainArgs();
        }

        public Builder(GetTeamPlainArgs defaults) {
            $ = new GetTeamPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRole (Optional) The team is private if the value is &#34;none&#34;, or public if it is &#34;manager&#34; (the default permissions for a non-member of the team are either &#34;none&#34;, or their base role up until &#34;manager&#34;).
         * 
         * @return builder
         * 
         */
        public Builder defaultRole(@Nullable String defaultRole) {
            $.defaultRole = defaultRole;
            return this;
        }

        /**
         * @param name The name of the team to find in the PagerDuty API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param parent ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable String parent) {
            $.parent = parent;
            return this;
        }

        public GetTeamPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetTeamPlainArgs", "name");
            }
            return $;
        }
    }

}
