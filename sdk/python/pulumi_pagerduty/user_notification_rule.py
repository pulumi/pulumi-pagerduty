# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables


class UserNotificationRule(pulumi.CustomResource):
    contact_method: pulumi.Output[dict]
    """
    A contact method block, configured as a block described below.

      * `id` (`str`) - The id of the referenced contact method.
      * `type` (`str`) - The type of contact method. Can be `email_contact_method`, `phone_contact_method`, `push_notification_contact_method` or `sms_contact_method`.
    """
    start_delay_in_minutes: pulumi.Output[float]
    """
    The delay before firing the rule, in minutes.
    """
    urgency: pulumi.Output[str]
    """
    Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
    """
    user_id: pulumi.Output[str]
    """
    The ID of the user.
    """
    def __init__(__self__, resource_name, opts=None, contact_method=None, start_delay_in_minutes=None, urgency=None, user_id=None, __props__=None, __name__=None, __opts__=None):
        """
        A [notification rule](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users_id_notification_rules_notification_rule_id) configures where and when a PagerDuty user is notified when a triggered incident is assigned to him. Unique notification rules can be created for both high and low-urgency incidents.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example", email="125.greenholt.earline@graham.name")
        email = pagerduty.UserContactMethod("email",
            user_id=example.id,
            type="email_contact_method",
            address="foo@bar.com",
            label="Work")
        phone = pagerduty.UserContactMethod("phone",
            user_id=example.id,
            type="phone_contact_method",
            country_code="+1",
            address="2025550199",
            label="Work")
        sms = pagerduty.UserContactMethod("sms",
            user_id=example.id,
            type="sms_contact_method",
            country_code="+1",
            address="2025550199",
            label="Work")
        high_urgency_phone = pagerduty.UserNotificationRule("highUrgencyPhone",
            user_id=example.id,
            start_delay_in_minutes=1,
            urgency="high",
            contact_method={
                "type": "phone_contact_method",
                "id": phone.id,
            })
        low_urgency_email = pagerduty.UserNotificationRule("lowUrgencyEmail",
            user_id=example.id,
            start_delay_in_minutes=1,
            urgency="low",
            contact_method={
                "type": "email_contact_method",
                "id": email.id,
            })
        low_urgency_sms = pagerduty.UserNotificationRule("lowUrgencySms",
            user_id=example.id,
            start_delay_in_minutes=10,
            urgency="low",
            contact_method={
                "type": "sms_contact_method",
                "id": sms.id,
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] contact_method: A contact method block, configured as a block described below.
        :param pulumi.Input[float] start_delay_in_minutes: The delay before firing the rule, in minutes.
        :param pulumi.Input[str] urgency: Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        :param pulumi.Input[str] user_id: The ID of the user.

        The **contact_method** object supports the following:

          * `id` (`pulumi.Input[str]`) - The id of the referenced contact method.
          * `type` (`pulumi.Input[str]`) - The type of contact method. Can be `email_contact_method`, `phone_contact_method`, `push_notification_contact_method` or `sms_contact_method`.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if contact_method is None:
                raise TypeError("Missing required property 'contact_method'")
            __props__['contact_method'] = contact_method
            if start_delay_in_minutes is None:
                raise TypeError("Missing required property 'start_delay_in_minutes'")
            __props__['start_delay_in_minutes'] = start_delay_in_minutes
            if urgency is None:
                raise TypeError("Missing required property 'urgency'")
            __props__['urgency'] = urgency
            if user_id is None:
                raise TypeError("Missing required property 'user_id'")
            __props__['user_id'] = user_id
        super(UserNotificationRule, __self__).__init__(
            'pagerduty:index/userNotificationRule:UserNotificationRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, contact_method=None, start_delay_in_minutes=None, urgency=None, user_id=None):
        """
        Get an existing UserNotificationRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] contact_method: A contact method block, configured as a block described below.
        :param pulumi.Input[float] start_delay_in_minutes: The delay before firing the rule, in minutes.
        :param pulumi.Input[str] urgency: Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        :param pulumi.Input[str] user_id: The ID of the user.

        The **contact_method** object supports the following:

          * `id` (`pulumi.Input[str]`) - The id of the referenced contact method.
          * `type` (`pulumi.Input[str]`) - The type of contact method. Can be `email_contact_method`, `phone_contact_method`, `push_notification_contact_method` or `sms_contact_method`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["contact_method"] = contact_method
        __props__["start_delay_in_minutes"] = start_delay_in_minutes
        __props__["urgency"] = urgency
        __props__["user_id"] = user_id
        return UserNotificationRule(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
