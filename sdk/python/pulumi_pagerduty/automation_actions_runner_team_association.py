# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AutomationActionsRunnerTeamAssociationArgs', 'AutomationActionsRunnerTeamAssociation']

@pulumi.input_type
class AutomationActionsRunnerTeamAssociationArgs:
    def __init__(__self__, *,
                 runner_id: pulumi.Input[str],
                 team_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a AutomationActionsRunnerTeamAssociation resource.
        :param pulumi.Input[str] runner_id: Id of the runner.
        :param pulumi.Input[str] team_id: Id of the team associated with the runner.
        """
        pulumi.set(__self__, "runner_id", runner_id)
        pulumi.set(__self__, "team_id", team_id)

    @property
    @pulumi.getter(name="runnerId")
    def runner_id(self) -> pulumi.Input[str]:
        """
        Id of the runner.
        """
        return pulumi.get(self, "runner_id")

    @runner_id.setter
    def runner_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "runner_id", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Input[str]:
        """
        Id of the team associated with the runner.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "team_id", value)


@pulumi.input_type
class _AutomationActionsRunnerTeamAssociationState:
    def __init__(__self__, *,
                 runner_id: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AutomationActionsRunnerTeamAssociation resources.
        :param pulumi.Input[str] runner_id: Id of the runner.
        :param pulumi.Input[str] team_id: Id of the team associated with the runner.
        """
        if runner_id is not None:
            pulumi.set(__self__, "runner_id", runner_id)
        if team_id is not None:
            pulumi.set(__self__, "team_id", team_id)

    @property
    @pulumi.getter(name="runnerId")
    def runner_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the runner.
        """
        return pulumi.get(self, "runner_id")

    @runner_id.setter
    def runner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runner_id", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the team associated with the runner.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team_id", value)


class AutomationActionsRunnerTeamAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 runner_id: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        An Automation Actions [runner association with a team](https://developer.pagerduty.com/api-reference/f662de6271a6e-associate-a-runner-with-a-team) configures the relation of a specific Runner with a Team.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        team_ent_eng = pagerduty.Team("team_ent_eng",
            name="Enterprise Engineering",
            description="Enterprise engineering")
        pa_runbook_runner = pagerduty.AutomationActionsRunner("pa_runbook_runner",
            name="Runner created via TF",
            description="Description of the Runner created via TF",
            runner_type="runbook",
            runbook_base_uri="cat-cat",
            runbook_api_key="cat-secret")
        pa_runner_ent_eng_assoc = pagerduty.AutomationActionsRunnerTeamAssociation("pa_runner_ent_eng_assoc",
            runner_id=pa_runbook_runner.id,
            team_id=team_ent_eng.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Runner team association can be imported using the `runner_id` and `team_id` separated by a colon, e.g.

        ```sh
        $ pulumi import pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] runner_id: Id of the runner.
        :param pulumi.Input[str] team_id: Id of the team associated with the runner.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AutomationActionsRunnerTeamAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Automation Actions [runner association with a team](https://developer.pagerduty.com/api-reference/f662de6271a6e-associate-a-runner-with-a-team) configures the relation of a specific Runner with a Team.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        team_ent_eng = pagerduty.Team("team_ent_eng",
            name="Enterprise Engineering",
            description="Enterprise engineering")
        pa_runbook_runner = pagerduty.AutomationActionsRunner("pa_runbook_runner",
            name="Runner created via TF",
            description="Description of the Runner created via TF",
            runner_type="runbook",
            runbook_base_uri="cat-cat",
            runbook_api_key="cat-secret")
        pa_runner_ent_eng_assoc = pagerduty.AutomationActionsRunnerTeamAssociation("pa_runner_ent_eng_assoc",
            runner_id=pa_runbook_runner.id,
            team_id=team_ent_eng.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Runner team association can be imported using the `runner_id` and `team_id` separated by a colon, e.g.

        ```sh
        $ pulumi import pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param AutomationActionsRunnerTeamAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AutomationActionsRunnerTeamAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 runner_id: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AutomationActionsRunnerTeamAssociationArgs.__new__(AutomationActionsRunnerTeamAssociationArgs)

            if runner_id is None and not opts.urn:
                raise TypeError("Missing required property 'runner_id'")
            __props__.__dict__["runner_id"] = runner_id
            if team_id is None and not opts.urn:
                raise TypeError("Missing required property 'team_id'")
            __props__.__dict__["team_id"] = team_id
        super(AutomationActionsRunnerTeamAssociation, __self__).__init__(
            'pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            runner_id: Optional[pulumi.Input[str]] = None,
            team_id: Optional[pulumi.Input[str]] = None) -> 'AutomationActionsRunnerTeamAssociation':
        """
        Get an existing AutomationActionsRunnerTeamAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] runner_id: Id of the runner.
        :param pulumi.Input[str] team_id: Id of the team associated with the runner.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AutomationActionsRunnerTeamAssociationState.__new__(_AutomationActionsRunnerTeamAssociationState)

        __props__.__dict__["runner_id"] = runner_id
        __props__.__dict__["team_id"] = team_id
        return AutomationActionsRunnerTeamAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="runnerId")
    def runner_id(self) -> pulumi.Output[str]:
        """
        Id of the runner.
        """
        return pulumi.get(self, "runner_id")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[str]:
        """
        Id of the team associated with the runner.
        """
        return pulumi.get(self, "team_id")

