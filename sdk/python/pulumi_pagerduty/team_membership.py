# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TeamMembershipArgs', 'TeamMembership']

@pulumi.input_type
class TeamMembershipArgs:
    def __init__(__self__, *,
                 team_id: pulumi.Input[str],
                 user_id: pulumi.Input[str],
                 role: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TeamMembership resource.
        :param pulumi.Input[str] team_id: The ID of the team in which the user will belong.
        :param pulumi.Input[str] user_id: The ID of the user to add to the team.
        :param pulumi.Input[str] role: The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
               These roles match up to user roles in the following ways:
               * User role of `user` is a Team role of `manager`
               * User role of `limited_user` is a Team role of `responder`
        """
        pulumi.set(__self__, "team_id", team_id)
        pulumi.set(__self__, "user_id", user_id)
        if role is not None:
            pulumi.set(__self__, "role", role)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Input[str]:
        """
        The ID of the team in which the user will belong.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "team_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        The ID of the user to add to the team.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
        These roles match up to user roles in the following ways:
        * User role of `user` is a Team role of `manager`
        * User role of `limited_user` is a Team role of `responder`
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)


@pulumi.input_type
class _TeamMembershipState:
    def __init__(__self__, *,
                 role: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TeamMembership resources.
        :param pulumi.Input[str] role: The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
               These roles match up to user roles in the following ways:
               * User role of `user` is a Team role of `manager`
               * User role of `limited_user` is a Team role of `responder`
        :param pulumi.Input[str] team_id: The ID of the team in which the user will belong.
        :param pulumi.Input[str] user_id: The ID of the user to add to the team.
        """
        if role is not None:
            pulumi.set(__self__, "role", role)
        if team_id is not None:
            pulumi.set(__self__, "team_id", team_id)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
        These roles match up to user roles in the following ways:
        * User role of `user` is a Team role of `manager`
        * User role of `limited_user` is a Team role of `responder`
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the team in which the user will belong.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the user to add to the team.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class TeamMembership(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        foo_user = pagerduty.User("fooUser", email="foo@bar.com")
        foo_team = pagerduty.Team("fooTeam", description="foo")
        foo_team_membership = pagerduty.TeamMembership("fooTeamMembership",
            user_id=foo_user.id,
            team_id=foo_team.id,
            role="manager")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Team memberships can be imported using the `user_id` and `team_id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/teamMembership:TeamMembership main PLBP09X:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] role: The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
               These roles match up to user roles in the following ways:
               * User role of `user` is a Team role of `manager`
               * User role of `limited_user` is a Team role of `responder`
        :param pulumi.Input[str] team_id: The ID of the team in which the user will belong.
        :param pulumi.Input[str] user_id: The ID of the user to add to the team.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamMembershipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        foo_user = pagerduty.User("fooUser", email="foo@bar.com")
        foo_team = pagerduty.Team("fooTeam", description="foo")
        foo_team_membership = pagerduty.TeamMembership("fooTeamMembership",
            user_id=foo_user.id,
            team_id=foo_team.id,
            role="manager")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Team memberships can be imported using the `user_id` and `team_id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/teamMembership:TeamMembership main PLBP09X:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param TeamMembershipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamMembershipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamMembershipArgs.__new__(TeamMembershipArgs)

            __props__.__dict__["role"] = role
            if team_id is None and not opts.urn:
                raise TypeError("Missing required property 'team_id'")
            __props__.__dict__["team_id"] = team_id
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(TeamMembership, __self__).__init__(
            'pagerduty:index/teamMembership:TeamMembership',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            role: Optional[pulumi.Input[str]] = None,
            team_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'TeamMembership':
        """
        Get an existing TeamMembership resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] role: The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
               These roles match up to user roles in the following ways:
               * User role of `user` is a Team role of `manager`
               * User role of `limited_user` is a Team role of `responder`
        :param pulumi.Input[str] team_id: The ID of the team in which the user will belong.
        :param pulumi.Input[str] user_id: The ID of the user to add to the team.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamMembershipState.__new__(_TeamMembershipState)

        __props__.__dict__["role"] = role
        __props__.__dict__["team_id"] = team_id
        __props__.__dict__["user_id"] = user_id
        return TeamMembership(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[Optional[str]]:
        """
        The role of the user in the team. One of `observer`, `responder`, or `manager`. Defaults to `manager`.  
        These roles match up to user roles in the following ways:
        * User role of `user` is a Team role of `manager`
        * User role of `limited_user` is a Team role of `responder`
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[str]:
        """
        The ID of the team in which the user will belong.
        """
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The ID of the user to add to the team.
        """
        return pulumi.get(self, "user_id")

