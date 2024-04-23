// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetUserContactMethodPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserContactMethodPlainArgs Empty = new GetUserContactMethodPlainArgs();

    /**
     * The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, &#34;Ashley&#39;s iPhone&#34;, etc.).
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, &#34;Ashley&#39;s iPhone&#34;, etc.).
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * The type of the found contact method. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the found contact method. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
     * 
     */
    public String type() {
        return this.type;
    }

    @Import(name="userId", required=true)
    private String userId;

    public String userId() {
        return this.userId;
    }

    private GetUserContactMethodPlainArgs() {}

    private GetUserContactMethodPlainArgs(GetUserContactMethodPlainArgs $) {
        this.label = $.label;
        this.type = $.type;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserContactMethodPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserContactMethodPlainArgs $;

        public Builder() {
            $ = new GetUserContactMethodPlainArgs();
        }

        public Builder(GetUserContactMethodPlainArgs defaults) {
            $ = new GetUserContactMethodPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, &#34;Ashley&#39;s iPhone&#34;, etc.).
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param type The type of the found contact method. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public GetUserContactMethodPlainArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetUserContactMethodPlainArgs", "label");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetUserContactMethodPlainArgs", "type");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("GetUserContactMethodPlainArgs", "userId");
            }
            return $;
        }
    }

}
