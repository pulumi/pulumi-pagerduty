// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLicenseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicenseArgs Empty = new GetLicenseArgs();

    /**
     * Available allocations to assign to users
     * 
     */
    @Import(name="allocationsAvailable")
    private @Nullable Output<Integer> allocationsAvailable;

    /**
     * @return Available allocations to assign to users
     * 
     */
    public Optional<Output<Integer>> allocationsAvailable() {
        return Optional.ofNullable(this.allocationsAvailable);
    }

    /**
     * The number of allocations already assigned to users
     * 
     */
    @Import(name="currentValue")
    private @Nullable Output<Integer> currentValue;

    /**
     * @return The number of allocations already assigned to users
     * 
     */
    public Optional<Output<Integer>> currentValue() {
        return Optional.ofNullable(this.currentValue);
    }

    /**
     * Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="htmlUrl")
    private @Nullable Output<String> htmlUrl;

    public Optional<Output<String>> htmlUrl() {
        return Optional.ofNullable(this.htmlUrl);
    }

    /**
     * Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The role group for the license that determines the available `valid_roles`
     * 
     */
    @Import(name="roleGroup")
    private @Nullable Output<String> roleGroup;

    /**
     * @return The role group for the license that determines the available `valid_roles`
     * 
     */
    public Optional<Output<String>> roleGroup() {
        return Optional.ofNullable(this.roleGroup);
    }

    @Import(name="self")
    private @Nullable Output<String> self;

    public Optional<Output<String>> self() {
        return Optional.ofNullable(this.self);
    }

    /**
     * Summary of the license
     * 
     */
    @Import(name="summary")
    private @Nullable Output<String> summary;

    /**
     * @return Summary of the license
     * 
     */
    public Optional<Output<String>> summary() {
        return Optional.ofNullable(this.summary);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * List of allowed roles that may be assigned to a user with this license
     * 
     */
    @Import(name="validRoles")
    private @Nullable Output<List<String>> validRoles;

    /**
     * @return List of allowed roles that may be assigned to a user with this license
     * 
     */
    public Optional<Output<List<String>>> validRoles() {
        return Optional.ofNullable(this.validRoles);
    }

    private GetLicenseArgs() {}

    private GetLicenseArgs(GetLicenseArgs $) {
        this.allocationsAvailable = $.allocationsAvailable;
        this.currentValue = $.currentValue;
        this.description = $.description;
        this.htmlUrl = $.htmlUrl;
        this.id = $.id;
        this.name = $.name;
        this.roleGroup = $.roleGroup;
        this.self = $.self;
        this.summary = $.summary;
        this.type = $.type;
        this.validRoles = $.validRoles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLicenseArgs $;

        public Builder() {
            $ = new GetLicenseArgs();
        }

        public Builder(GetLicenseArgs defaults) {
            $ = new GetLicenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationsAvailable Available allocations to assign to users
         * 
         * @return builder
         * 
         */
        public Builder allocationsAvailable(@Nullable Output<Integer> allocationsAvailable) {
            $.allocationsAvailable = allocationsAvailable;
            return this;
        }

        /**
         * @param allocationsAvailable Available allocations to assign to users
         * 
         * @return builder
         * 
         */
        public Builder allocationsAvailable(Integer allocationsAvailable) {
            return allocationsAvailable(Output.of(allocationsAvailable));
        }

        /**
         * @param currentValue The number of allocations already assigned to users
         * 
         * @return builder
         * 
         */
        public Builder currentValue(@Nullable Output<Integer> currentValue) {
            $.currentValue = currentValue;
            return this;
        }

        /**
         * @param currentValue The number of allocations already assigned to users
         * 
         * @return builder
         * 
         */
        public Builder currentValue(Integer currentValue) {
            return currentValue(Output.of(currentValue));
        }

        /**
         * @param description Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Used to determine if the data config *description* is a valid substring of a valid license description assigned to the account.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder htmlUrl(@Nullable Output<String> htmlUrl) {
            $.htmlUrl = htmlUrl;
            return this;
        }

        public Builder htmlUrl(String htmlUrl) {
            return htmlUrl(Output.of(htmlUrl));
        }

        /**
         * @param id Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Used to match the data config *id* with an exact match of a valid license ID assigned to the account.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Used to determine if the data config *name* is a valid substring of a valid license name assigned to the account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleGroup The role group for the license that determines the available `valid_roles`
         * 
         * @return builder
         * 
         */
        public Builder roleGroup(@Nullable Output<String> roleGroup) {
            $.roleGroup = roleGroup;
            return this;
        }

        /**
         * @param roleGroup The role group for the license that determines the available `valid_roles`
         * 
         * @return builder
         * 
         */
        public Builder roleGroup(String roleGroup) {
            return roleGroup(Output.of(roleGroup));
        }

        public Builder self(@Nullable Output<String> self) {
            $.self = self;
            return this;
        }

        public Builder self(String self) {
            return self(Output.of(self));
        }

        /**
         * @param summary Summary of the license
         * 
         * @return builder
         * 
         */
        public Builder summary(@Nullable Output<String> summary) {
            $.summary = summary;
            return this;
        }

        /**
         * @param summary Summary of the license
         * 
         * @return builder
         * 
         */
        public Builder summary(String summary) {
            return summary(Output.of(summary));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param validRoles List of allowed roles that may be assigned to a user with this license
         * 
         * @return builder
         * 
         */
        public Builder validRoles(@Nullable Output<List<String>> validRoles) {
            $.validRoles = validRoles;
            return this;
        }

        /**
         * @param validRoles List of allowed roles that may be assigned to a user with this license
         * 
         * @return builder
         * 
         */
        public Builder validRoles(List<String> validRoles) {
            return validRoles(Output.of(validRoles));
        }

        /**
         * @param validRoles List of allowed roles that may be assigned to a user with this license
         * 
         * @return builder
         * 
         */
        public Builder validRoles(String... validRoles) {
            return validRoles(List.of(validRoles));
        }

        public GetLicenseArgs build() {
            return $;
        }
    }

}
