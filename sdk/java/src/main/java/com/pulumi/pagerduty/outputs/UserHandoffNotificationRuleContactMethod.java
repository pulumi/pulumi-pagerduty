// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserHandoffNotificationRuleContactMethod {
    /**
     * @return The ID of the contact method.
     * 
     */
    private String id;
    /**
     * @return The type of the contact method. May be (`email_contact_method`, `email_contact_method_reference`, `phone_contact_method`, `phone_contact_method_reference`, `push_notification_contact_method`, `push_notification_contact_method_reference`, `sms_contact_method`, `sms_contact_method_reference`).
     * 
     */
    private String type;

    private UserHandoffNotificationRuleContactMethod() {}
    /**
     * @return The ID of the contact method.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The type of the contact method. May be (`email_contact_method`, `email_contact_method_reference`, `phone_contact_method`, `phone_contact_method_reference`, `push_notification_contact_method`, `push_notification_contact_method_reference`, `sms_contact_method`, `sms_contact_method_reference`).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserHandoffNotificationRuleContactMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String type;
        public Builder() {}
        public Builder(UserHandoffNotificationRuleContactMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("UserHandoffNotificationRuleContactMethod", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("UserHandoffNotificationRuleContactMethod", "type");
            }
            this.type = type;
            return this;
        }
        public UserHandoffNotificationRuleContactMethod build() {
            final var _resultValue = new UserHandoffNotificationRuleContactMethod();
            _resultValue.id = id;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
