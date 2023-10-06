# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetEscalationPolicyResult',
    'AwaitableGetEscalationPolicyResult',
    'get_escalation_policy',
    'get_escalation_policy_output',
]

@pulumi.output_type
class GetEscalationPolicyResult:
    """
    A collection of values returned by getEscalationPolicy.
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
        The short name of the found escalation policy.
        """
        return pulumi.get(self, "name")


class AwaitableGetEscalationPolicyResult(GetEscalationPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEscalationPolicyResult(
            id=self.id,
            name=self.name)


def get_escalation_policy(name: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEscalationPolicyResult:
    """
    Use this data source to get information about a specific [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNA-list-escalation-policies) that you can use for other PagerDuty resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    test_escalation_policy = pagerduty.get_escalation_policy(name="Engineering Escalation Policy")
    test_service = pagerduty.Service("testService",
        auto_resolve_timeout="14400",
        acknowledgement_timeout="600",
        escalation_policy=test_escalation_policy.id)
    ```


    :param str name: The name to use to find an escalation policy in the PagerDuty API.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getEscalationPolicy:getEscalationPolicy', __args__, opts=opts, typ=GetEscalationPolicyResult).value

    return AwaitableGetEscalationPolicyResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_escalation_policy)
def get_escalation_policy_output(name: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEscalationPolicyResult]:
    """
    Use this data source to get information about a specific [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNA-list-escalation-policies) that you can use for other PagerDuty resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    test_escalation_policy = pagerduty.get_escalation_policy(name="Engineering Escalation Policy")
    test_service = pagerduty.Service("testService",
        auto_resolve_timeout="14400",
        acknowledgement_timeout="600",
        escalation_policy=test_escalation_policy.id)
    ```


    :param str name: The name to use to find an escalation policy in the PagerDuty API.
    """
    ...
