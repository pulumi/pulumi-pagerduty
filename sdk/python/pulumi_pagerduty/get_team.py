# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = [
    'GetTeamResult',
    'AwaitableGetTeamResult',
    'get_team',
]

@pulumi.output_type
class GetTeamResult:
    """
    A collection of values returned by getTeam.
    """
    def __init__(__self__, description=None, id=None, name=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        A description of the found team.
        """
        return pulumi.get(self, "description")

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
        The name of the found team.
        """
        return pulumi.get(self, "name")


class AwaitableGetTeamResult(GetTeamResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTeamResult(
            description=self.description,
            id=self.id,
            name=self.name)


def get_team(name: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTeamResult:
    """
    Use this data source to get information about a specific [team](https://v1.developer.pagerduty.com/documentation/rest/teams/list) that you can use for other PagerDuty resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    me = pagerduty.get_user(email="me@example.com")
    devops = pagerduty.get_team(name="devops")
    foo = pagerduty.EscalationPolicy("foo",
        num_loops=2,
        teams=[devops.id],
        rules=[pagerduty.EscalationPolicyRuleArgs(
            escalation_delay_in_minutes=10,
            targets=[pagerduty.EscalationPolicyRuleTargetArgs(
                type="user",
                id=me.id,
            )],
        )])
    ```


    :param str name: The name of the team to find in the PagerDuty API.
    """
    __args__ = dict()
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getTeam:getTeam', __args__, opts=opts, typ=GetTeamResult).value

    return AwaitableGetTeamResult(
        description=__ret__.description,
        id=__ret__.id,
        name=__ret__.name)
