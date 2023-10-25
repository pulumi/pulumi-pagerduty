# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AutomationActionsActionTeamAssociationArgs', 'AutomationActionsActionTeamAssociation']

@pulumi.input_type
class AutomationActionsActionTeamAssociationArgs:
    def __init__(__self__, *,
                 action_id: pulumi.Input[str],
                 team_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a AutomationActionsActionTeamAssociation resource.
        :param pulumi.Input[str] action_id: Id of the action.
        :param pulumi.Input[str] team_id: Id of the team associated to the action.
        """
        AutomationActionsActionTeamAssociationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            action_id=action_id,
            team_id=team_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             action_id: Optional[pulumi.Input[str]] = None,
             team_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if action_id is None and 'actionId' in kwargs:
            action_id = kwargs['actionId']
        if action_id is None:
            raise TypeError("Missing 'action_id' argument")
        if team_id is None and 'teamId' in kwargs:
            team_id = kwargs['teamId']
        if team_id is None:
            raise TypeError("Missing 'team_id' argument")

        _setter("action_id", action_id)
        _setter("team_id", team_id)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> pulumi.Input[str]:
        """
        Id of the action.
        """
        return pulumi.get(self, "action_id")

    @action_id.setter
    def action_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "action_id", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Input[str]:
        """
        Id of the team associated to the action.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "team_id", value)


@pulumi.input_type
class _AutomationActionsActionTeamAssociationState:
    def __init__(__self__, *,
                 action_id: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AutomationActionsActionTeamAssociation resources.
        :param pulumi.Input[str] action_id: Id of the action.
        :param pulumi.Input[str] team_id: Id of the team associated to the action.
        """
        _AutomationActionsActionTeamAssociationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            action_id=action_id,
            team_id=team_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             action_id: Optional[pulumi.Input[str]] = None,
             team_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if action_id is None and 'actionId' in kwargs:
            action_id = kwargs['actionId']
        if team_id is None and 'teamId' in kwargs:
            team_id = kwargs['teamId']

        if action_id is not None:
            _setter("action_id", action_id)
        if team_id is not None:
            _setter("team_id", team_id)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the action.
        """
        return pulumi.get(self, "action_id")

    @action_id.setter
    def action_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action_id", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the team associated to the action.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team_id", value)


class AutomationActionsActionTeamAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_id: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        An Automation Actions [action association with a team](https://developer.pagerduty.com/api-reference/8f722dd91a4ba-associate-an-automation-action-with-a-team) configures the relation of a specific Action with a Team.

        ## Import

        Action team association can be imported using the `action_id` and `team_id` separated by a colon, e.g.

        ```sh
         $ pulumi import pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_id: Id of the action.
        :param pulumi.Input[str] team_id: Id of the team associated to the action.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AutomationActionsActionTeamAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Automation Actions [action association with a team](https://developer.pagerduty.com/api-reference/8f722dd91a4ba-associate-an-automation-action-with-a-team) configures the relation of a specific Action with a Team.

        ## Import

        Action team association can be imported using the `action_id` and `team_id` separated by a colon, e.g.

        ```sh
         $ pulumi import pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param AutomationActionsActionTeamAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AutomationActionsActionTeamAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AutomationActionsActionTeamAssociationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_id: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AutomationActionsActionTeamAssociationArgs.__new__(AutomationActionsActionTeamAssociationArgs)

            if action_id is None and not opts.urn:
                raise TypeError("Missing required property 'action_id'")
            __props__.__dict__["action_id"] = action_id
            if team_id is None and not opts.urn:
                raise TypeError("Missing required property 'team_id'")
            __props__.__dict__["team_id"] = team_id
        super(AutomationActionsActionTeamAssociation, __self__).__init__(
            'pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action_id: Optional[pulumi.Input[str]] = None,
            team_id: Optional[pulumi.Input[str]] = None) -> 'AutomationActionsActionTeamAssociation':
        """
        Get an existing AutomationActionsActionTeamAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_id: Id of the action.
        :param pulumi.Input[str] team_id: Id of the team associated to the action.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AutomationActionsActionTeamAssociationState.__new__(_AutomationActionsActionTeamAssociationState)

        __props__.__dict__["action_id"] = action_id
        __props__.__dict__["team_id"] = team_id
        return AutomationActionsActionTeamAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> pulumi.Output[str]:
        """
        Id of the action.
        """
        return pulumi.get(self, "action_id")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[str]:
        """
        Id of the team associated to the action.
        """
        return pulumi.get(self, "team_id")

