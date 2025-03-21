// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamsPlainArgs Empty = new GetTeamsPlainArgs();

    /**
     * Filters the result, showing only the records whose name matches the query.
     * 
     */
    @Import(name="query")
    private @Nullable String query;

    /**
     * @return Filters the result, showing only the records whose name matches the query.
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    private GetTeamsPlainArgs() {}

    private GetTeamsPlainArgs(GetTeamsPlainArgs $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamsPlainArgs $;

        public Builder() {
            $ = new GetTeamsPlainArgs();
        }

        public Builder(GetTeamsPlainArgs defaults) {
            $ = new GetTeamsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Filters the result, showing only the records whose name matches the query.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable String query) {
            $.query = query;
            return this;
        }

        public GetTeamsPlainArgs build() {
            return $;
        }
    }

}
