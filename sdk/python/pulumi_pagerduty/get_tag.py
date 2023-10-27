# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetTagResult',
    'AwaitableGetTagResult',
    'get_tag',
    'get_tag_output',
]

@pulumi.output_type
class GetTagResult:
    """
    A collection of values returned by getTag.
    """
    def __init__(__self__, id=None, label=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)

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
        return pulumi.get(self, "label")


class AwaitableGetTagResult(GetTagResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagResult(
            id=self.id,
            label=self.label)


def get_tag(label: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagResult:
    """
    Use this data source to get information about a specific [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIxNw-list-tags) that you can use to assign to users, teams, and escalation_policies.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    me = pagerduty.get_user(email="me@example.com")
    devops = pagerduty.get_tag(label="devops")
    foo = pagerduty.TagAssignment("foo",
        tag_id=devops.id,
        entity_id=me.id,
        entity_type="users")
    ```


    :param str label: The label of the tag to find in the PagerDuty API.
    """
    __args__ = dict()
    __args__['label'] = label
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getTag:getTag', __args__, opts=opts, typ=GetTagResult).value

    return AwaitableGetTagResult(
        id=pulumi.get(__ret__, 'id'),
        label=pulumi.get(__ret__, 'label'))


@_utilities.lift_output_func(get_tag)
def get_tag_output(label: Optional[pulumi.Input[str]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTagResult]:
    """
    Use this data source to get information about a specific [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIxNw-list-tags) that you can use to assign to users, teams, and escalation_policies.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    me = pagerduty.get_user(email="me@example.com")
    devops = pagerduty.get_tag(label="devops")
    foo = pagerduty.TagAssignment("foo",
        tag_id=devops.id,
        entity_id=me.id,
        entity_type="users")
    ```


    :param str label: The label of the tag to find in the PagerDuty API.
    """
    ...
