# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetScheduleResult',
    'AwaitableGetScheduleResult',
    'get_schedule',
]

@pulumi.output_type
class GetScheduleResult:
    """
    A collection of values returned by getSchedule.
    """
    def __init__(__self__, id=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The short name of the found schedule.
        """
        return pulumi.get(self, "name")


class AwaitableGetScheduleResult(GetScheduleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetScheduleResult(
            id=self.id,
            name=self.name)


def get_schedule(name: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetScheduleResult:
    """
    Use this data source to get information about a specific [schedule](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1schedules~1%7Bid%7D/get) that you can use for other PagerDuty resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    test = pagerduty.get_schedule(name="Daily Engineering Rotation")
    foo = pagerduty.EscalationPolicy("foo",
        num_loops=2,
        rules=[pagerduty.EscalationPolicyRuleArgs(
            escalation_delay_in_minutes=10,
            targets=[pagerduty.EscalationPolicyRuleTargetArgs(
                type="schedule",
                id=test.id,
            )],
        )])
    ```


    :param str name: The name to use to find a schedule in the PagerDuty API.
    """
    __args__ = dict()
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getSchedule:getSchedule', __args__, opts=opts, typ=GetScheduleResult).value

    return AwaitableGetScheduleResult(
        id=__ret__.id,
        name=__ret__.name)
