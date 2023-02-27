// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomFieldSchemaPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomFieldSchemaPlainArgs Empty = new GetCustomFieldSchemaPlainArgs();

    /**
     * The title of the field schema.
     * 
     */
    @Import(name="title", required=true)
    private String title;

    /**
     * @return The title of the field schema.
     * 
     */
    public String title() {
        return this.title;
    }

    private GetCustomFieldSchemaPlainArgs() {}

    private GetCustomFieldSchemaPlainArgs(GetCustomFieldSchemaPlainArgs $) {
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomFieldSchemaPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomFieldSchemaPlainArgs $;

        public Builder() {
            $ = new GetCustomFieldSchemaPlainArgs();
        }

        public Builder(GetCustomFieldSchemaPlainArgs defaults) {
            $ = new GetCustomFieldSchemaPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param title The title of the field schema.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            $.title = title;
            return this;
        }

        public GetCustomFieldSchemaPlainArgs build() {
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
