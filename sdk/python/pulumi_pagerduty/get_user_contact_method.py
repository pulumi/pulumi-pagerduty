# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = [
    'GetUserContactMethodResult',
    'AwaitableGetUserContactMethodResult',
    'get_user_contact_method',
]

@pulumi.output_type
class GetUserContactMethodResult:
    """
    A collection of values returned by getUserContactMethod.
    """
    def __init__(__self__, id=None, label=None, type=None, user_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if user_id and not isinstance(user_id, str):
            raise TypeError("Expected argument 'user_id' to be a str")
        pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the found contact method. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        return pulumi.get(self, "user_id")


class AwaitableGetUserContactMethodResult(GetUserContactMethodResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserContactMethodResult(
            id=self.id,
            label=self.label,
            type=self.type,
            user_id=self.user_id)


def get_user_contact_method(label: Optional[str] = None,
                            type: Optional[str] = None,
                            user_id: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserContactMethodResult:
    """
    Use this data source to get information about a specific [contact method](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1users~1%7Bid%7D~1contact_methods~1%7Bcontact_method_id%7D/get) of a PagerDuty [user](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1users~1%7Bid%7D/get) that you can use for other PagerDuty resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    me = pagerduty.get_user(email="me@example.com")
    phone_push = pagerduty.get_user_contact_method(user_id=me.id,
        type="push_notification_contact_method",
        label="iPhone (John)")
    low_urgency_sms = pagerduty.UserNotificationRule("lowUrgencySms",
        user_id=me.id,
        start_delay_in_minutes=5,
        urgency="high",
        contact_method=pagerduty.UserNotificationRuleContactMethodArgs(
            type="push_notification_contact_method",
            id=phone_push.id,
        ))
    ```


    :param str label: The label (e.g., "Work", "Mobile", "Ashley's iPhone", etc.).
    :param str type: The contact method type. May be (`email_contact_method`, `phone_contact_method`, `sms_contact_method`, `push_notification_contact_method`).
    :param str user_id: The ID of the user.
    """
    __args__ = dict()
    __args__['label'] = label
    __args__['type'] = type
    __args__['userId'] = user_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getUserContactMethod:getUserContactMethod', __args__, opts=opts, typ=GetUserContactMethodResult).value

    return AwaitableGetUserContactMethodResult(
        id=__ret__.id,
        label=__ret__.label,
        type=__ret__.type,
        user_id=__ret__.user_id)
