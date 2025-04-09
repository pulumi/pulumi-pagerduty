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
from . import outputs
from ._inputs import *

__all__ = ['EventOrchestrationArgs', 'EventOrchestration']

@pulumi.input_type
class EventOrchestrationArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 integrations: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationArgs']]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 team: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a EventOrchestration resource.
        :param pulumi.Input[builtins.str] description: A human-friendly description of the Event Orchestration.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationArgs']]] integrations: A list of integrations for the Event Orchestration.
        :param pulumi.Input[builtins.str] name: Name of the Event Orchestration.
        :param pulumi.Input[builtins.str] team: ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if integrations is not None:
            pulumi.set(__self__, "integrations", integrations)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if team is not None:
            pulumi.set(__self__, "team", team)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A human-friendly description of the Event Orchestration.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationArgs']]]]:
        """
        A list of integrations for the Event Orchestration.
        """
        return pulumi.get(self, "integrations")

    @integrations.setter
    def integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationArgs']]]]):
        pulumi.set(self, "integrations", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the Event Orchestration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def team(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        """
        return pulumi.get(self, "team")

    @team.setter
    def team(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "team", value)


@pulumi.input_type
class _EventOrchestrationState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 integrations: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationArgs']]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 routes: Optional[pulumi.Input[builtins.int]] = None,
                 team: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering EventOrchestration resources.
        :param pulumi.Input[builtins.str] description: A human-friendly description of the Event Orchestration.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationArgs']]] integrations: A list of integrations for the Event Orchestration.
        :param pulumi.Input[builtins.str] name: Name of the Event Orchestration.
        :param pulumi.Input[builtins.str] team: ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if integrations is not None:
            pulumi.set(__self__, "integrations", integrations)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if routes is not None:
            pulumi.set(__self__, "routes", routes)
        if team is not None:
            pulumi.set(__self__, "team", team)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A human-friendly description of the Event Orchestration.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationArgs']]]]:
        """
        A list of integrations for the Event Orchestration.
        """
        return pulumi.get(self, "integrations")

    @integrations.setter
    def integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationArgs']]]]):
        pulumi.set(self, "integrations", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the Event Orchestration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def routes(self) -> Optional[pulumi.Input[builtins.int]]:
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "routes", value)

    @property
    @pulumi.getter
    def team(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        """
        return pulumi.get(self, "team")

    @team.setter
    def team(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "team", value)


class EventOrchestration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 integrations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationIntegrationArgs', 'EventOrchestrationIntegrationArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 team: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        [Event Orchestrations](https://support.pagerduty.com/docs/event-orchestration) allow you define a set of Event Rules, so that when you ingest events using the Orchestration's Routing Key your events will be routed to the correct Global and/or Service Orchestration, based on the event's content.

        ## Example of configuring an Event Orchestration

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        engineering = pagerduty.Team("engineering", name="Engineering")
        my_monitor = pagerduty.EventOrchestration("my_monitor",
            name="My Monitoring Orchestration",
            description="Send events to a pair of services",
            team=engineering.id)
        ```

        ## Import

        EventOrchestrations can be imported using the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestration:EventOrchestration main 19acac92-027a-4ea0-b06c-bbf516519601
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: A human-friendly description of the Event Orchestration.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationIntegrationArgs', 'EventOrchestrationIntegrationArgsDict']]]] integrations: A list of integrations for the Event Orchestration.
        :param pulumi.Input[builtins.str] name: Name of the Event Orchestration.
        :param pulumi.Input[builtins.str] team: ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[EventOrchestrationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [Event Orchestrations](https://support.pagerduty.com/docs/event-orchestration) allow you define a set of Event Rules, so that when you ingest events using the Orchestration's Routing Key your events will be routed to the correct Global and/or Service Orchestration, based on the event's content.

        ## Example of configuring an Event Orchestration

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        engineering = pagerduty.Team("engineering", name="Engineering")
        my_monitor = pagerduty.EventOrchestration("my_monitor",
            name="My Monitoring Orchestration",
            description="Send events to a pair of services",
            team=engineering.id)
        ```

        ## Import

        EventOrchestrations can be imported using the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestration:EventOrchestration main 19acac92-027a-4ea0-b06c-bbf516519601
        ```

        :param str resource_name: The name of the resource.
        :param EventOrchestrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventOrchestrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 integrations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationIntegrationArgs', 'EventOrchestrationIntegrationArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 team: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventOrchestrationArgs.__new__(EventOrchestrationArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["integrations"] = integrations
            __props__.__dict__["name"] = name
            __props__.__dict__["team"] = team
            __props__.__dict__["routes"] = None
        super(EventOrchestration, __self__).__init__(
            'pagerduty:index/eventOrchestration:EventOrchestration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            integrations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationIntegrationArgs', 'EventOrchestrationIntegrationArgsDict']]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            routes: Optional[pulumi.Input[builtins.int]] = None,
            team: Optional[pulumi.Input[builtins.str]] = None) -> 'EventOrchestration':
        """
        Get an existing EventOrchestration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: A human-friendly description of the Event Orchestration.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationIntegrationArgs', 'EventOrchestrationIntegrationArgsDict']]]] integrations: A list of integrations for the Event Orchestration.
        :param pulumi.Input[builtins.str] name: Name of the Event Orchestration.
        :param pulumi.Input[builtins.str] team: ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventOrchestrationState.__new__(_EventOrchestrationState)

        __props__.__dict__["description"] = description
        __props__.__dict__["integrations"] = integrations
        __props__.__dict__["name"] = name
        __props__.__dict__["routes"] = routes
        __props__.__dict__["team"] = team
        return EventOrchestration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        A human-friendly description of the Event Orchestration.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def integrations(self) -> pulumi.Output[Sequence['outputs.EventOrchestrationIntegration']]:
        """
        A list of integrations for the Event Orchestration.
        """
        return pulumi.get(self, "integrations")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Name of the Event Orchestration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def routes(self) -> pulumi.Output[builtins.int]:
        return pulumi.get(self, "routes")

    @property
    @pulumi.getter
    def team(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        ID of the team that owns the Event Orchestration. If none is specified, only admins have access.
        """
        return pulumi.get(self, "team")

