# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['UserContactMethod']


class UserContactMethod(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 country_code: Optional[pulumi.Input[int]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 send_short_email: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        A [contact method](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users_id_contact_methods) is a contact method for a PagerDuty user (email, phone or SMS).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example",
            email="125.greenholt.earline@graham.name",
            teams=[pagerduty_team["example"]["id"]])
        email = pagerduty.UserContactMethod("email",
            address="foo@bar.com",
            label="Work",
            type="email_contact_method",
            user_id=example.id)
        phone = pagerduty.UserContactMethod("phone",
            address="2025550199",
            country_code=1,
            label="Work",
            type="phone_contact_method",
            user_id=example.id)
        sms = pagerduty.UserContactMethod("sms",
            address="2025550199",
            country_code=1,
            label="Work",
            type="sms_contact_method",
            user_id=example.id)
        ```

        ## Import

        Contact methods can be imported using the `user_id` and the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/userContactMethod:UserContactMethod main PLBP09X:PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        :param pulumi.Input[int] country_code: The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        :param pulumi.Input[str] label: The label (e.g., "Work", "Mobile", etc.).
        :param pulumi.Input[bool] send_short_email: Send an abbreviated email message instead of the standard email output.
        :param pulumi.Input[str] type: The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        :param pulumi.Input[str] user_id: The ID of the user.
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if address is None and not opts.urn:
                raise TypeError("Missing required property 'address'")
            __props__['address'] = address
            __props__['country_code'] = country_code
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__['label'] = label
            __props__['send_short_email'] = send_short_email
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__['user_id'] = user_id
            __props__['blacklisted'] = None
            __props__['enabled'] = None
        super(UserContactMethod, __self__).__init__(
            'pagerduty:index/userContactMethod:UserContactMethod',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[str]] = None,
            blacklisted: Optional[pulumi.Input[bool]] = None,
            country_code: Optional[pulumi.Input[int]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            label: Optional[pulumi.Input[str]] = None,
            send_short_email: Optional[pulumi.Input[bool]] = None,
            type: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'UserContactMethod':
        """
        Get an existing UserContactMethod resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        :param pulumi.Input[bool] blacklisted: If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
        :param pulumi.Input[int] country_code: The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        :param pulumi.Input[bool] enabled: If true, this phone is capable of receiving SMS messages.
        :param pulumi.Input[str] label: The label (e.g., "Work", "Mobile", etc.).
        :param pulumi.Input[bool] send_short_email: Send an abbreviated email message instead of the standard email output.
        :param pulumi.Input[str] type: The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        :param pulumi.Input[str] user_id: The ID of the user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["address"] = address
        __props__["blacklisted"] = blacklisted
        __props__["country_code"] = country_code
        __props__["enabled"] = enabled
        __props__["label"] = label
        __props__["send_short_email"] = send_short_email
        __props__["type"] = type
        __props__["user_id"] = user_id
        return UserContactMethod(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[str]:
        """
        The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def blacklisted(self) -> pulumi.Output[bool]:
        """
        If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
        """
        return pulumi.get(self, "blacklisted")

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> pulumi.Output[Optional[int]]:
        """
        The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        """
        return pulumi.get(self, "country_code")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        If true, this phone is capable of receiving SMS messages.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The label (e.g., "Work", "Mobile", etc.).
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="sendShortEmail")
    def send_short_email(self) -> pulumi.Output[Optional[bool]]:
        """
        Send an abbreviated email message instead of the standard email output.
        """
        return pulumi.get(self, "send_short_email")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The ID of the user.
        """
        return pulumi.get(self, "user_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

