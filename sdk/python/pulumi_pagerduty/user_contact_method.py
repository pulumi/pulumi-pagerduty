# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['UserContactMethodArgs', 'UserContactMethod']

@pulumi.input_type
class UserContactMethodArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[_builtins.str],
                 label: pulumi.Input[_builtins.str],
                 type: pulumi.Input[_builtins.str],
                 user_id: pulumi.Input[_builtins.str],
                 country_code: Optional[pulumi.Input[_builtins.int]] = None,
                 send_short_email: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a UserContactMethod resource.
        :param pulumi.Input[_builtins.str] address: The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        :param pulumi.Input[_builtins.str] label: The label (e.g., "Work", "Mobile", etc.).
        :param pulumi.Input[_builtins.str] type: The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        :param pulumi.Input[_builtins.str] user_id: The ID of the user.
        :param pulumi.Input[_builtins.int] country_code: The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        :param pulumi.Input[_builtins.bool] send_short_email: Send an abbreviated email message instead of the standard email output.
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "user_id", user_id)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if send_short_email is not None:
            pulumi.set(__self__, "send_short_email", send_short_email)

    @_builtins.property
    @pulumi.getter
    def address(self) -> pulumi.Input[_builtins.str]:
        """
        The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "address", value)

    @_builtins.property
    @pulumi.getter
    def label(self) -> pulumi.Input[_builtins.str]:
        """
        The label (e.g., "Work", "Mobile", etc.).
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "label", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Input[_builtins.str]:
        """
        The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the user.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "user_id", value)

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "country_code", value)

    @_builtins.property
    @pulumi.getter(name="sendShortEmail")
    def send_short_email(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Send an abbreviated email message instead of the standard email output.
        """
        return pulumi.get(self, "send_short_email")

    @send_short_email.setter
    def send_short_email(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "send_short_email", value)


@pulumi.input_type
class _UserContactMethodState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[_builtins.str]] = None,
                 blacklisted: Optional[pulumi.Input[_builtins.bool]] = None,
                 country_code: Optional[pulumi.Input[_builtins.int]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 label: Optional[pulumi.Input[_builtins.str]] = None,
                 send_short_email: Optional[pulumi.Input[_builtins.bool]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering UserContactMethod resources.
        :param pulumi.Input[_builtins.str] address: The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        :param pulumi.Input[_builtins.bool] blacklisted: If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
        :param pulumi.Input[_builtins.int] country_code: The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        :param pulumi.Input[_builtins.bool] enabled: If true, this phone is capable of receiving SMS messages.
        :param pulumi.Input[_builtins.str] label: The label (e.g., "Work", "Mobile", etc.).
        :param pulumi.Input[_builtins.bool] send_short_email: Send an abbreviated email message instead of the standard email output.
        :param pulumi.Input[_builtins.str] type: The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        :param pulumi.Input[_builtins.str] user_id: The ID of the user.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if blacklisted is not None:
            pulumi.set(__self__, "blacklisted", blacklisted)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if send_short_email is not None:
            pulumi.set(__self__, "send_short_email", send_short_email)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @_builtins.property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "address", value)

    @_builtins.property
    @pulumi.getter
    def blacklisted(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
        """
        return pulumi.get(self, "blacklisted")

    @blacklisted.setter
    def blacklisted(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "blacklisted", value)

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "country_code", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        If true, this phone is capable of receiving SMS messages.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The label (e.g., "Work", "Mobile", etc.).
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "label", value)

    @_builtins.property
    @pulumi.getter(name="sendShortEmail")
    def send_short_email(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Send an abbreviated email message instead of the standard email output.
        """
        return pulumi.get(self, "send_short_email")

    @send_short_email.setter
    def send_short_email(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "send_short_email", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the user.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_id", value)


@pulumi.type_token("pagerduty:index/userContactMethod:UserContactMethod")
class UserContactMethod(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[_builtins.str]] = None,
                 country_code: Optional[pulumi.Input[_builtins.int]] = None,
                 label: Optional[pulumi.Input[_builtins.str]] = None,
                 send_short_email: Optional[pulumi.Input[_builtins.bool]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name",
            teams=[example_pagerduty_team["id"]])
        email = pagerduty.UserContactMethod("email",
            user_id=example.id,
            type="email_contact_method",
            address="foo@bar.com",
            label="Work")
        phone = pagerduty.UserContactMethod("phone",
            user_id=example.id,
            type="phone_contact_method",
            country_code=1,
            address="2025550199",
            label="Work")
        sms = pagerduty.UserContactMethod("sms",
            user_id=example.id,
            type="sms_contact_method",
            country_code=1,
            address="2025550199",
            label="Work")
        ```

        ## Import

        Contact methods can be imported using the `user_id` and the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/userContactMethod:UserContactMethod main PLBP09X:PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] address: The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        :param pulumi.Input[_builtins.int] country_code: The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        :param pulumi.Input[_builtins.str] label: The label (e.g., "Work", "Mobile", etc.).
        :param pulumi.Input[_builtins.bool] send_short_email: Send an abbreviated email message instead of the standard email output.
        :param pulumi.Input[_builtins.str] type: The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        :param pulumi.Input[_builtins.str] user_id: The ID of the user.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserContactMethodArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name",
            teams=[example_pagerduty_team["id"]])
        email = pagerduty.UserContactMethod("email",
            user_id=example.id,
            type="email_contact_method",
            address="foo@bar.com",
            label="Work")
        phone = pagerduty.UserContactMethod("phone",
            user_id=example.id,
            type="phone_contact_method",
            country_code=1,
            address="2025550199",
            label="Work")
        sms = pagerduty.UserContactMethod("sms",
            user_id=example.id,
            type="sms_contact_method",
            country_code=1,
            address="2025550199",
            label="Work")
        ```

        ## Import

        Contact methods can be imported using the `user_id` and the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/userContactMethod:UserContactMethod main PLBP09X:PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param UserContactMethodArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserContactMethodArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[_builtins.str]] = None,
                 country_code: Optional[pulumi.Input[_builtins.int]] = None,
                 label: Optional[pulumi.Input[_builtins.str]] = None,
                 send_short_email: Optional[pulumi.Input[_builtins.bool]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserContactMethodArgs.__new__(UserContactMethodArgs)

            if address is None and not opts.urn:
                raise TypeError("Missing required property 'address'")
            __props__.__dict__["address"] = address
            __props__.__dict__["country_code"] = country_code
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            __props__.__dict__["send_short_email"] = send_short_email
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["blacklisted"] = None
            __props__.__dict__["enabled"] = None
        super(UserContactMethod, __self__).__init__(
            'pagerduty:index/userContactMethod:UserContactMethod',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[_builtins.str]] = None,
            blacklisted: Optional[pulumi.Input[_builtins.bool]] = None,
            country_code: Optional[pulumi.Input[_builtins.int]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            label: Optional[pulumi.Input[_builtins.str]] = None,
            send_short_email: Optional[pulumi.Input[_builtins.bool]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None,
            user_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'UserContactMethod':
        """
        Get an existing UserContactMethod resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] address: The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        :param pulumi.Input[_builtins.bool] blacklisted: If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
        :param pulumi.Input[_builtins.int] country_code: The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        :param pulumi.Input[_builtins.bool] enabled: If true, this phone is capable of receiving SMS messages.
        :param pulumi.Input[_builtins.str] label: The label (e.g., "Work", "Mobile", etc.).
        :param pulumi.Input[_builtins.bool] send_short_email: Send an abbreviated email message instead of the standard email output.
        :param pulumi.Input[_builtins.str] type: The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        :param pulumi.Input[_builtins.str] user_id: The ID of the user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserContactMethodState.__new__(_UserContactMethodState)

        __props__.__dict__["address"] = address
        __props__.__dict__["blacklisted"] = blacklisted
        __props__.__dict__["country_code"] = country_code
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["label"] = label
        __props__.__dict__["send_short_email"] = send_short_email
        __props__.__dict__["type"] = type
        __props__.__dict__["user_id"] = user_id
        return UserContactMethod(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def address(self) -> pulumi.Output[_builtins.str]:
        """
        The "address" to deliver to: `email`, `phone number`, etc., depending on the type.
        """
        return pulumi.get(self, "address")

    @_builtins.property
    @pulumi.getter
    def blacklisted(self) -> pulumi.Output[_builtins.bool]:
        """
        If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
        """
        return pulumi.get(self, "blacklisted")

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> pulumi.Output[_builtins.int]:
        """
        The 1-to-3 digit country calling code. Required when using `phone_contact_method` or `sms_contact_method`.
        """
        return pulumi.get(self, "country_code")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        If true, this phone is capable of receiving SMS messages.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def label(self) -> pulumi.Output[_builtins.str]:
        """
        The label (e.g., "Work", "Mobile", etc.).
        """
        return pulumi.get(self, "label")

    @_builtins.property
    @pulumi.getter(name="sendShortEmail")
    def send_short_email(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Send an abbreviated email message instead of the standard email output.
        """
        return pulumi.get(self, "send_short_email")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[_builtins.str]:
        """
        The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the user.
        """
        return pulumi.get(self, "user_id")

