# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetTeamMembersResult',
    'AwaitableGetTeamMembersResult',
    'get_team_members',
    'get_team_members_output',
]

@pulumi.output_type
class GetTeamMembersResult:
    """
    A collection of values returned by getTeamMembers.
    """
    def __init__(__self__, id=None, members=None, team_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if members and not isinstance(members, list):
            raise TypeError("Expected argument 'members' to be a list")
        pulumi.set(__self__, "members", members)
        if team_id and not isinstance(team_id, str):
            raise TypeError("Expected argument 'team_id' to be a str")
        pulumi.set(__self__, "team_id", team_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def members(self) -> Sequence['outputs.GetTeamMembersMemberResult']:
        """
        The users of the found team.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> str:
        return pulumi.get(self, "team_id")


class AwaitableGetTeamMembersResult(GetTeamMembersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTeamMembersResult(
            id=self.id,
            members=self.members,
            team_id=self.team_id)


def get_team_members(team_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTeamMembersResult:
    """
    Use this data source to get information about a specific [team's members](https://developer.pagerduty.com/api-reference/e35802f3c4ba4-list-members-of-a-team).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    devops = pagerduty.get_team(name="devops")
    devops_members = pagerduty.get_team_members(team_id=devops.id)
    ```


    :param str team_id: The ID of the team to find in the PagerDuty API.
    """
    __args__ = dict()
    __args__['teamId'] = team_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getTeamMembers:getTeamMembers', __args__, opts=opts, typ=GetTeamMembersResult).value

    return AwaitableGetTeamMembersResult(
        id=pulumi.get(__ret__, 'id'),
        members=pulumi.get(__ret__, 'members'),
        team_id=pulumi.get(__ret__, 'team_id'))


@_utilities.lift_output_func(get_team_members)
def get_team_members_output(team_id: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTeamMembersResult]:
    """
    Use this data source to get information about a specific [team's members](https://developer.pagerduty.com/api-reference/e35802f3c4ba4-list-members-of-a-team).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    devops = pagerduty.get_team(name="devops")
    devops_members = pagerduty.get_team_members(team_id=devops.id)
    ```


    :param str team_id: The ID of the team to find in the PagerDuty API.
    """
    ...
