// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetUserContactMethodArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserContactMethodArgs Empty = new GetUserContactMethodArgs();

    /**
     * The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, &#34;Ashley&#39;s iPhone&#34;, etc.).
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, &#34;Ashley&#39;s iPhone&#34;, etc.).
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The ID of the user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The ID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private GetUserContactMethodArgs() {}

    private GetUserContactMethodArgs(GetUserContactMethodArgs $) {
        this.label = $.label;
        this.type = $.type;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserContactMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserContactMethodArgs $;

        public Builder() {
            $ = new GetUserContactMethodArgs();
        }

        public Builder(GetUserContactMethodArgs defaults) {
            $ = new GetUserContactMethodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, &#34;Ashley&#39;s iPhone&#34;, etc.).
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label (e.g., &#34;Work&#34;, &#34;Mobile&#34;, &#34;Ashley&#39;s iPhone&#34;, etc.).
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param type The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userId The ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public GetUserContactMethodArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetUserContactMethodArgs", "label");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetUserContactMethodArgs", "type");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("GetUserContactMethodArgs", "userId");
            }
            return $;
        }
    }

}
