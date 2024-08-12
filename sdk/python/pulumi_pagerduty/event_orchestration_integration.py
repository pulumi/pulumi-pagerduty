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
from ._inputs import *

__all__ = ['EventOrchestrationIntegrationInitArgs', 'EventOrchestrationIntegration']

@pulumi.input_type
class EventOrchestrationIntegrationInitArgs:
    def __init__(__self__, *,
                 event_orchestration: pulumi.Input[str],
                 label: pulumi.Input[str]):
        """
        The set of arguments for constructing a EventOrchestrationIntegration resource.
        :param pulumi.Input[str] event_orchestration: ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
        :param pulumi.Input[str] label: Name/description of the Integration.
        """
        pulumi.set(__self__, "event_orchestration", event_orchestration)
        pulumi.set(__self__, "label", label)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> pulumi.Input[str]:
        """
        ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
        """
        return pulumi.get(self, "event_orchestration")

    @event_orchestration.setter
    def event_orchestration(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_orchestration", value)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        Name/description of the Integration.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)


@pulumi.input_type
class _EventOrchestrationIntegrationState:
    def __init__(__self__, *,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationParameterArgs']]]] = None):
        """
        Input properties used for looking up and filtering EventOrchestrationIntegration resources.
        :param pulumi.Input[str] event_orchestration: ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
        :param pulumi.Input[str] label: Name/description of the Integration.
        """
        if event_orchestration is not None:
            pulumi.set(__self__, "event_orchestration", event_orchestration)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
        """
        return pulumi.get(self, "event_orchestration")

    @event_orchestration.setter
    def event_orchestration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_orchestration", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        Name/description of the Integration.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationParameterArgs']]]]:
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationIntegrationParameterArgs']]]]):
        pulumi.set(self, "parameters", value)


class EventOrchestrationIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        An Event Orchestration Integration allows you to create and manage multiple Integrations (and Routing Keys) per Event Orchestration _and_ will allow you to move (migrate) Integrations _between_ two Event Orchestrations.

        ## Example of configuring an Integration for an Event Orchestration

        This example shows creating `Event Orchestration` and `Team` resources followed by creating an Event Orchestration Integration to handle Events sent to that Event Orchestration.

        > When a new Event Orchestration is created there will be one Integration (and Routing Key) included by default. Example below shows how to create an extra Integration associated with this Event Orchestration.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        database_team = pagerduty.Team("database_team", name="Database Team")
        event_orchestration = pagerduty.EventOrchestration("event_orchestration",
            name="Example Orchestration",
            team=database_team.id)
        integration = pagerduty.EventOrchestrationIntegration("integration",
            event_orchestration=event_orchestration.id,
            label="Example integration")
        ```

        ## Import

        Event Orchestration Integration can be imported using colon-separated IDs, which is the combination of the Event Orchestration ID followed by the Event Orchestration Integration ID, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration integration 19acac92-027a-4ea0-b06c-bbf516519601:1b49abe7-26db-4439-a715-c6d883acfb3e
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] event_orchestration: ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
        :param pulumi.Input[str] label: Name/description of the Integration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventOrchestrationIntegrationInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Event Orchestration Integration allows you to create and manage multiple Integrations (and Routing Keys) per Event Orchestration _and_ will allow you to move (migrate) Integrations _between_ two Event Orchestrations.

        ## Example of configuring an Integration for an Event Orchestration

        This example shows creating `Event Orchestration` and `Team` resources followed by creating an Event Orchestration Integration to handle Events sent to that Event Orchestration.

        > When a new Event Orchestration is created there will be one Integration (and Routing Key) included by default. Example below shows how to create an extra Integration associated with this Event Orchestration.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        database_team = pagerduty.Team("database_team", name="Database Team")
        event_orchestration = pagerduty.EventOrchestration("event_orchestration",
            name="Example Orchestration",
            team=database_team.id)
        integration = pagerduty.EventOrchestrationIntegration("integration",
            event_orchestration=event_orchestration.id,
            label="Example integration")
        ```

        ## Import

        Event Orchestration Integration can be imported using colon-separated IDs, which is the combination of the Event Orchestration ID followed by the Event Orchestration Integration ID, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration integration 19acac92-027a-4ea0-b06c-bbf516519601:1b49abe7-26db-4439-a715-c6d883acfb3e
        ```

        :param str resource_name: The name of the resource.
        :param EventOrchestrationIntegrationInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventOrchestrationIntegrationInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventOrchestrationIntegrationInitArgs.__new__(EventOrchestrationIntegrationInitArgs)

            if event_orchestration is None and not opts.urn:
                raise TypeError("Missing required property 'event_orchestration'")
            __props__.__dict__["event_orchestration"] = event_orchestration
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            __props__.__dict__["parameters"] = None
        super(EventOrchestrationIntegration, __self__).__init__(
            'pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            event_orchestration: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            parameters: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationIntegrationParameterArgs', 'EventOrchestrationIntegrationParameterArgsDict']]]]] = None) -> 'EventOrchestrationIntegration':
        """
        Get an existing EventOrchestrationIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] event_orchestration: ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
        :param pulumi.Input[str] label: Name/description of the Integration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventOrchestrationIntegrationState.__new__(_EventOrchestrationIntegrationState)

        __props__.__dict__["event_orchestration"] = event_orchestration
        __props__.__dict__["label"] = label
        __props__.__dict__["parameters"] = parameters
        return EventOrchestrationIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> pulumi.Output[str]:
        """
        ID of the Event Orchestration to which this Integration belongs to. If value is changed, current Integration is associated with a newly provided ID.
        """
        return pulumi.get(self, "event_orchestration")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        Name/description of the Integration.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[Sequence['outputs.EventOrchestrationIntegrationParameter']]:
        return pulumi.get(self, "parameters")

