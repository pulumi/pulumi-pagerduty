// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
     * 
     */
    @Import(name="color")
    private @Nullable Output<String> color;

    /**
     * @return The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
     * 
     */
    public Optional<Output<String>> color() {
        return Optional.ofNullable(this.color);
    }

    /**
     * A human-friendly description of the user.
     * If not set, a placeholder of &#34;Managed by Pulumi&#34; will be set.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-friendly description of the user.
     * If not set, a placeholder of &#34;Managed by Pulumi&#34; will be set.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The user&#39;s email address.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The user&#39;s email address.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * The user&#39;s title.
     * 
     */
    @Import(name="jobTitle")
    private @Nullable Output<String> jobTitle;

    /**
     * @return The user&#39;s title.
     * 
     */
    public Optional<Output<String>> jobTitle() {
        return Optional.ofNullable(this.jobTitle);
    }

    /**
     * The license id assigned to the user. If provided the user&#39;s role must exist in the assigned license&#39;s `valid_roles` list. To reference purchased licenses&#39; ids see data source `pagerduty.getLicenses` [data source](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzNA-create-a-user).
     * 
     */
    @Import(name="license")
    private @Nullable Output<String> license;

    /**
     * @return The license id assigned to the user. If provided the user&#39;s role must exist in the assigned license&#39;s `valid_roles` list. To reference purchased licenses&#39; ids see data source `pagerduty.getLicenses` [data source](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzNA-create-a-user).
     * 
     */
    public Optional<Output<String>> license() {
        return Optional.ofNullable(this.license);
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the user.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The user role. Can be `admin`, `limited_user`, `observer`, `owner`, `read_only_user`, `read_only_limited_user`, `restricted_access`, or `user`.
     * Notes:
     * * Account must have the `read_only_users` ability to set a user as a `read_only_user` or a `read_only_limited_user`, and must have advanced permissions abilities to set a user as `observer` or `restricted_access`.
     * * With advanced permissions, users can have both a user role (base role) and a team role. The team role can be configured in the `pagerduty.TeamMembership` resource.
     * * Mapping of `role` values to Web UI user role names available in the [user roles support page](https://support.pagerduty.com/docs/advanced-permissions#roles-in-the-rest-api-and-saml).
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The user role. Can be `admin`, `limited_user`, `observer`, `owner`, `read_only_user`, `read_only_limited_user`, `restricted_access`, or `user`.
     * Notes:
     * * Account must have the `read_only_users` ability to set a user as a `read_only_user` or a `read_only_limited_user`, and must have advanced permissions abilities to set a user as `observer` or `restricted_access`.
     * * With advanced permissions, users can have both a user role (base role) and a team role. The team role can be configured in the `pagerduty.TeamMembership` resource.
     * * Mapping of `role` values to Web UI user role names available in the [user roles support page](https://support.pagerduty.com/docs/advanced-permissions#roles-in-the-rest-api-and-saml).
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * A list of teams the user should belong to. Please use `pagerduty.TeamMembership` instead.
     * 
     * @deprecated
     * Use the &#39;pagerduty_team_membership&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'pagerduty_team_membership' resource instead. */
    @Import(name="teams")
    private @Nullable Output<List<String>> teams;

    /**
     * @return A list of teams the user should belong to. Please use `pagerduty.TeamMembership` instead.
     * 
     * @deprecated
     * Use the &#39;pagerduty_team_membership&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'pagerduty_team_membership' resource instead. */
    public Optional<Output<List<String>>> teams() {
        return Optional.ofNullable(this.teams);
    }

    /**
     * The time zone of the user. Default is account default timezone.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The time zone of the user. Default is account default timezone.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.color = $.color;
        this.description = $.description;
        this.email = $.email;
        this.jobTitle = $.jobTitle;
        this.license = $.license;
        this.name = $.name;
        this.role = $.role;
        this.teams = $.teams;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param color The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
         * 
         * @return builder
         * 
         */
        public Builder color(@Nullable Output<String> color) {
            $.color = color;
            return this;
        }

        /**
         * @param color The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
         * 
         * @return builder
         * 
         */
        public Builder color(String color) {
            return color(Output.of(color));
        }

        /**
         * @param description A human-friendly description of the user.
         * If not set, a placeholder of &#34;Managed by Pulumi&#34; will be set.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-friendly description of the user.
         * If not set, a placeholder of &#34;Managed by Pulumi&#34; will be set.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param email The user&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The user&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param jobTitle The user&#39;s title.
         * 
         * @return builder
         * 
         */
        public Builder jobTitle(@Nullable Output<String> jobTitle) {
            $.jobTitle = jobTitle;
            return this;
        }

        /**
         * @param jobTitle The user&#39;s title.
         * 
         * @return builder
         * 
         */
        public Builder jobTitle(String jobTitle) {
            return jobTitle(Output.of(jobTitle));
        }

        /**
         * @param license The license id assigned to the user. If provided the user&#39;s role must exist in the assigned license&#39;s `valid_roles` list. To reference purchased licenses&#39; ids see data source `pagerduty.getLicenses` [data source](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzNA-create-a-user).
         * 
         * @return builder
         * 
         */
        public Builder license(@Nullable Output<String> license) {
            $.license = license;
            return this;
        }

        /**
         * @param license The license id assigned to the user. If provided the user&#39;s role must exist in the assigned license&#39;s `valid_roles` list. To reference purchased licenses&#39; ids see data source `pagerduty.getLicenses` [data source](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIzNA-create-a-user).
         * 
         * @return builder
         * 
         */
        public Builder license(String license) {
            return license(Output.of(license));
        }

        /**
         * @param name The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param role The user role. Can be `admin`, `limited_user`, `observer`, `owner`, `read_only_user`, `read_only_limited_user`, `restricted_access`, or `user`.
         * Notes:
         * * Account must have the `read_only_users` ability to set a user as a `read_only_user` or a `read_only_limited_user`, and must have advanced permissions abilities to set a user as `observer` or `restricted_access`.
         * * With advanced permissions, users can have both a user role (base role) and a team role. The team role can be configured in the `pagerduty.TeamMembership` resource.
         * * Mapping of `role` values to Web UI user role names available in the [user roles support page](https://support.pagerduty.com/docs/advanced-permissions#roles-in-the-rest-api-and-saml).
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The user role. Can be `admin`, `limited_user`, `observer`, `owner`, `read_only_user`, `read_only_limited_user`, `restricted_access`, or `user`.
         * Notes:
         * * Account must have the `read_only_users` ability to set a user as a `read_only_user` or a `read_only_limited_user`, and must have advanced permissions abilities to set a user as `observer` or `restricted_access`.
         * * With advanced permissions, users can have both a user role (base role) and a team role. The team role can be configured in the `pagerduty.TeamMembership` resource.
         * * Mapping of `role` values to Web UI user role names available in the [user roles support page](https://support.pagerduty.com/docs/advanced-permissions#roles-in-the-rest-api-and-saml).
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param teams A list of teams the user should belong to. Please use `pagerduty.TeamMembership` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;pagerduty_team_membership&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'pagerduty_team_membership' resource instead. */
        public Builder teams(@Nullable Output<List<String>> teams) {
            $.teams = teams;
            return this;
        }

        /**
         * @param teams A list of teams the user should belong to. Please use `pagerduty.TeamMembership` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;pagerduty_team_membership&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'pagerduty_team_membership' resource instead. */
        public Builder teams(List<String> teams) {
            return teams(Output.of(teams));
        }

        /**
         * @param teams A list of teams the user should belong to. Please use `pagerduty.TeamMembership` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;pagerduty_team_membership&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'pagerduty_team_membership' resource instead. */
        public Builder teams(String... teams) {
            return teams(List.of(teams));
        }

        /**
         * @param timeZone The time zone of the user. Default is account default timezone.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone of the user. Default is account default timezone.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public UserArgs build() {
            $.description = Codegen.stringProp("description").output().arg($.description).def("Managed by Pulumi").getNullable();
            if ($.email == null) {
                throw new MissingRequiredPropertyException("UserArgs", "email");
            }
            return $;
        }
    }

}
