# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = [
    'GetTeamResult',
    'AwaitableGetTeamResult',
    'get_team',
    'get_team_output',
]

@pulumi.output_type
class GetTeamResult:
    """
    A collection of values returned by getTeam.
    """
    def __init__(__self__, default_role=None, description=None, id=None, name=None, parent=None):
        if default_role and not isinstance(default_role, str):
            raise TypeError("Expected argument 'default_role' to be a str")
        pulumi.set(__self__, "default_role", default_role)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if parent and not isinstance(parent, str):
            raise TypeError("Expected argument 'parent' to be a str")
        pulumi.set(__self__, "parent", parent)

    @property
    @pulumi.getter(name="defaultRole")
    def default_role(self) -> Optional[builtins.str]:
        """
        (Optional) The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
        """
        return pulumi.get(self, "default_role")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        A description of the found team.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The name of the found team.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parent(self) -> Optional[builtins.str]:
        """
        ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
        """
        return pulumi.get(self, "parent")


class AwaitableGetTeamResult(GetTeamResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTeamResult(
            default_role=self.default_role,
            description=self.description,
            id=self.id,
            name=self.name,
            parent=self.parent)


def get_team(default_role: Optional[builtins.str] = None,
             name: Optional[builtins.str] = None,
             parent: Optional[builtins.str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTeamResult:
    """
    Use this data source to get information about a specific [team](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIyMw-list-teams) that you can use for other PagerDuty resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    me = pagerduty.get_user(email="me@example.com")
    devops = pagerduty.get_team(name="devops")
    foo = pagerduty.EscalationPolicy("foo",
        name="DevOps Escalation Policy",
        num_loops=2,
        teams=devops.id,
        rules=[{
            "escalation_delay_in_minutes": 10,
            "targets": [{
                "type": "user",
                "id": me.id,
            }],
        }])
    ```


    :param builtins.str default_role: (Optional) The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
    :param builtins.str name: The name of the team to find in the PagerDuty API.
    :param builtins.str parent: ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
    """
    __args__ = dict()
    __args__['defaultRole'] = default_role
    __args__['name'] = name
    __args__['parent'] = parent
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getTeam:getTeam', __args__, opts=opts, typ=GetTeamResult).value

    return AwaitableGetTeamResult(
        default_role=pulumi.get(__ret__, 'default_role'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        parent=pulumi.get(__ret__, 'parent'))
def get_team_output(default_role: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    name: Optional[pulumi.Input[builtins.str]] = None,
                    parent: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTeamResult]:
    """
    Use this data source to get information about a specific [team](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODIyMw-list-teams) that you can use for other PagerDuty resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    me = pagerduty.get_user(email="me@example.com")
    devops = pagerduty.get_team(name="devops")
    foo = pagerduty.EscalationPolicy("foo",
        name="DevOps Escalation Policy",
        num_loops=2,
        teams=devops.id,
        rules=[{
            "escalation_delay_in_minutes": 10,
            "targets": [{
                "type": "user",
                "id": me.id,
            }],
        }])
    ```


    :param builtins.str default_role: (Optional) The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
    :param builtins.str name: The name of the team to find in the PagerDuty API.
    :param builtins.str parent: ID of the parent team. This is available to accounts with the Team Hierarchy feature enabled. Please contact your account manager for more information.
    """
    __args__ = dict()
    __args__['defaultRole'] = default_role
    __args__['name'] = name
    __args__['parent'] = parent
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('pagerduty:index/getTeam:getTeam', __args__, opts=opts, typ=GetTeamResult)
    return __ret__.apply(lambda __response__: GetTeamResult(
        default_role=pulumi.get(__response__, 'default_role'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        parent=pulumi.get(__response__, 'parent')))
