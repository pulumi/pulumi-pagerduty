# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UserNotificationRuleArgs', 'UserNotificationRule']

@pulumi.input_type
class UserNotificationRuleArgs:
    def __init__(__self__, *,
                 contact_method: pulumi.Input[Mapping[str, pulumi.Input[str]]],
                 start_delay_in_minutes: pulumi.Input[int],
                 urgency: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a UserNotificationRule resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] contact_method: A contact method block, configured as a block described below.
        :param pulumi.Input[int] start_delay_in_minutes: The delay before firing the rule, in minutes.
        :param pulumi.Input[str] urgency: Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        :param pulumi.Input[str] user_id: The ID of the user.
        """
        pulumi.set(__self__, "contact_method", contact_method)
        pulumi.set(__self__, "start_delay_in_minutes", start_delay_in_minutes)
        pulumi.set(__self__, "urgency", urgency)
        pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="contactMethod")
    def contact_method(self) -> pulumi.Input[Mapping[str, pulumi.Input[str]]]:
        """
        A contact method block, configured as a block described below.
        """
        return pulumi.get(self, "contact_method")

    @contact_method.setter
    def contact_method(self, value: pulumi.Input[Mapping[str, pulumi.Input[str]]]):
        pulumi.set(self, "contact_method", value)

    @property
    @pulumi.getter(name="startDelayInMinutes")
    def start_delay_in_minutes(self) -> pulumi.Input[int]:
        """
        The delay before firing the rule, in minutes.
        """
        return pulumi.get(self, "start_delay_in_minutes")

    @start_delay_in_minutes.setter
    def start_delay_in_minutes(self, value: pulumi.Input[int]):
        pulumi.set(self, "start_delay_in_minutes", value)

    @property
    @pulumi.getter
    def urgency(self) -> pulumi.Input[str]:
        """
        Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        """
        return pulumi.get(self, "urgency")

    @urgency.setter
    def urgency(self, value: pulumi.Input[str]):
        pulumi.set(self, "urgency", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        The ID of the user.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _UserNotificationRuleState:
    def __init__(__self__, *,
                 contact_method: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 start_delay_in_minutes: Optional[pulumi.Input[int]] = None,
                 urgency: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserNotificationRule resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] contact_method: A contact method block, configured as a block described below.
        :param pulumi.Input[int] start_delay_in_minutes: The delay before firing the rule, in minutes.
        :param pulumi.Input[str] urgency: Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        :param pulumi.Input[str] user_id: The ID of the user.
        """
        if contact_method is not None:
            pulumi.set(__self__, "contact_method", contact_method)
        if start_delay_in_minutes is not None:
            pulumi.set(__self__, "start_delay_in_minutes", start_delay_in_minutes)
        if urgency is not None:
            pulumi.set(__self__, "urgency", urgency)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="contactMethod")
    def contact_method(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A contact method block, configured as a block described below.
        """
        return pulumi.get(self, "contact_method")

    @contact_method.setter
    def contact_method(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "contact_method", value)

    @property
    @pulumi.getter(name="startDelayInMinutes")
    def start_delay_in_minutes(self) -> Optional[pulumi.Input[int]]:
        """
        The delay before firing the rule, in minutes.
        """
        return pulumi.get(self, "start_delay_in_minutes")

    @start_delay_in_minutes.setter
    def start_delay_in_minutes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "start_delay_in_minutes", value)

    @property
    @pulumi.getter
    def urgency(self) -> Optional[pulumi.Input[str]]:
        """
        Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        """
        return pulumi.get(self, "urgency")

    @urgency.setter
    def urgency(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "urgency", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the user.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class UserNotificationRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_method: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 start_delay_in_minutes: Optional[pulumi.Input[int]] = None,
                 urgency: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A [notification rule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODI0NQ-create-a-user-notification-rule) configures where and when a PagerDuty user is notified when a triggered incident is assigned to them. Unique notification rules can be created for both high and low-urgency incidents.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name")
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
        high_urgency_phone = pagerduty.UserNotificationRule("high_urgency_phone",
            user_id=example.id,
            start_delay_in_minutes=1,
            urgency="high",
            contact_method={
                "type": "phone_contact_method",
                "id": phone.id,
            })
        low_urgency_email = pagerduty.UserNotificationRule("low_urgency_email",
            user_id=example.id,
            start_delay_in_minutes=1,
            urgency="low",
            contact_method={
                "type": "email_contact_method",
                "id": email.id,
            })
        low_urgency_sms = pagerduty.UserNotificationRule("low_urgency_sms",
            user_id=example.id,
            start_delay_in_minutes=10,
            urgency="low",
            contact_method={
                "type": "sms_contact_method",
                "id": sms.id,
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        User notification rules can be imported using the `user_id` and the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/userNotificationRule:UserNotificationRule main PXPGF42:PPSCXAN
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] contact_method: A contact method block, configured as a block described below.
        :param pulumi.Input[int] start_delay_in_minutes: The delay before firing the rule, in minutes.
        :param pulumi.Input[str] urgency: Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        :param pulumi.Input[str] user_id: The ID of the user.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserNotificationRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [notification rule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODI0NQ-create-a-user-notification-rule) configures where and when a PagerDuty user is notified when a triggered incident is assigned to them. Unique notification rules can be created for both high and low-urgency incidents.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name")
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
        high_urgency_phone = pagerduty.UserNotificationRule("high_urgency_phone",
            user_id=example.id,
            start_delay_in_minutes=1,
            urgency="high",
            contact_method={
                "type": "phone_contact_method",
                "id": phone.id,
            })
        low_urgency_email = pagerduty.UserNotificationRule("low_urgency_email",
            user_id=example.id,
            start_delay_in_minutes=1,
            urgency="low",
            contact_method={
                "type": "email_contact_method",
                "id": email.id,
            })
        low_urgency_sms = pagerduty.UserNotificationRule("low_urgency_sms",
            user_id=example.id,
            start_delay_in_minutes=10,
            urgency="low",
            contact_method={
                "type": "sms_contact_method",
                "id": sms.id,
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        User notification rules can be imported using the `user_id` and the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/userNotificationRule:UserNotificationRule main PXPGF42:PPSCXAN
        ```

        :param str resource_name: The name of the resource.
        :param UserNotificationRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserNotificationRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_method: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 start_delay_in_minutes: Optional[pulumi.Input[int]] = None,
                 urgency: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserNotificationRuleArgs.__new__(UserNotificationRuleArgs)

            if contact_method is None and not opts.urn:
                raise TypeError("Missing required property 'contact_method'")
            __props__.__dict__["contact_method"] = contact_method
            if start_delay_in_minutes is None and not opts.urn:
                raise TypeError("Missing required property 'start_delay_in_minutes'")
            __props__.__dict__["start_delay_in_minutes"] = start_delay_in_minutes
            if urgency is None and not opts.urn:
                raise TypeError("Missing required property 'urgency'")
            __props__.__dict__["urgency"] = urgency
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(UserNotificationRule, __self__).__init__(
            'pagerduty:index/userNotificationRule:UserNotificationRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            contact_method: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            start_delay_in_minutes: Optional[pulumi.Input[int]] = None,
            urgency: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'UserNotificationRule':
        """
        Get an existing UserNotificationRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] contact_method: A contact method block, configured as a block described below.
        :param pulumi.Input[int] start_delay_in_minutes: The delay before firing the rule, in minutes.
        :param pulumi.Input[str] urgency: Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        :param pulumi.Input[str] user_id: The ID of the user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserNotificationRuleState.__new__(_UserNotificationRuleState)

        __props__.__dict__["contact_method"] = contact_method
        __props__.__dict__["start_delay_in_minutes"] = start_delay_in_minutes
        __props__.__dict__["urgency"] = urgency
        __props__.__dict__["user_id"] = user_id
        return UserNotificationRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contactMethod")
    def contact_method(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A contact method block, configured as a block described below.
        """
        return pulumi.get(self, "contact_method")

    @property
    @pulumi.getter(name="startDelayInMinutes")
    def start_delay_in_minutes(self) -> pulumi.Output[int]:
        """
        The delay before firing the rule, in minutes.
        """
        return pulumi.get(self, "start_delay_in_minutes")

    @property
    @pulumi.getter
    def urgency(self) -> pulumi.Output[str]:
        """
        Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule. Can be `high` or `low`.
        """
        return pulumi.get(self, "urgency")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The ID of the user.
        """
        return pulumi.get(self, "user_id")

