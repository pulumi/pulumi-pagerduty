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

__all__ = ['EventOrchestrationGlobalArgs', 'EventOrchestrationGlobal']

@pulumi.input_type
class EventOrchestrationGlobalArgs:
    def __init__(__self__, *,
                 catch_all: pulumi.Input['EventOrchestrationGlobalCatchAllArgs'],
                 event_orchestration: pulumi.Input[builtins.str],
                 sets: pulumi.Input[Sequence[pulumi.Input['EventOrchestrationGlobalSetArgs']]]):
        """
        The set of arguments for constructing a EventOrchestrationGlobal resource.
        :param pulumi.Input['EventOrchestrationGlobalCatchAllArgs'] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[builtins.str] event_orchestration: ID of the Event Orchestration to which this Global Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationGlobalSetArgs']]] sets: A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        pulumi.set(__self__, "catch_all", catch_all)
        pulumi.set(__self__, "event_orchestration", event_orchestration)
        pulumi.set(__self__, "sets", sets)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Input['EventOrchestrationGlobalCatchAllArgs']:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: pulumi.Input['EventOrchestrationGlobalCatchAllArgs']):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> pulumi.Input[builtins.str]:
        """
        ID of the Event Orchestration to which this Global Orchestration belongs to.
        """
        return pulumi.get(self, "event_orchestration")

    @event_orchestration.setter
    def event_orchestration(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "event_orchestration", value)

    @property
    @pulumi.getter
    def sets(self) -> pulumi.Input[Sequence[pulumi.Input['EventOrchestrationGlobalSetArgs']]]:
        """
        A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

    @sets.setter
    def sets(self, value: pulumi.Input[Sequence[pulumi.Input['EventOrchestrationGlobalSetArgs']]]):
        pulumi.set(self, "sets", value)


@pulumi.input_type
class _EventOrchestrationGlobalState:
    def __init__(__self__, *,
                 catch_all: Optional[pulumi.Input['EventOrchestrationGlobalCatchAllArgs']] = None,
                 event_orchestration: Optional[pulumi.Input[builtins.str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationGlobalSetArgs']]]] = None):
        """
        Input properties used for looking up and filtering EventOrchestrationGlobal resources.
        :param pulumi.Input['EventOrchestrationGlobalCatchAllArgs'] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[builtins.str] event_orchestration: ID of the Event Orchestration to which this Global Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationGlobalSetArgs']]] sets: A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        if catch_all is not None:
            pulumi.set(__self__, "catch_all", catch_all)
        if event_orchestration is not None:
            pulumi.set(__self__, "event_orchestration", event_orchestration)
        if sets is not None:
            pulumi.set(__self__, "sets", sets)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> Optional[pulumi.Input['EventOrchestrationGlobalCatchAllArgs']]:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: Optional[pulumi.Input['EventOrchestrationGlobalCatchAllArgs']]):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        ID of the Event Orchestration to which this Global Orchestration belongs to.
        """
        return pulumi.get(self, "event_orchestration")

    @event_orchestration.setter
    def event_orchestration(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "event_orchestration", value)

    @property
    @pulumi.getter
    def sets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationGlobalSetArgs']]]]:
        """
        A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

    @sets.setter
    def sets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationGlobalSetArgs']]]]):
        pulumi.set(self, "sets", value)


class EventOrchestrationGlobal(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[Union['EventOrchestrationGlobalCatchAllArgs', 'EventOrchestrationGlobalCatchAllArgsDict']]] = None,
                 event_orchestration: Optional[pulumi.Input[builtins.str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationGlobalSetArgs', 'EventOrchestrationGlobalSetArgsDict']]]]] = None,
                 __props__=None):
        """
        A [Global Orchestration](https://support.pagerduty.com/docs/event-orchestration#global-orchestrations) allows you to create a set of Event Rules. The Global Orchestration evaluates Events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Global Orchestration for further processing.

        ## Example of configuring a Global Orchestration

        This example shows creating `Team`, and `Event Orchestration` resources followed by creating a Global Orchestration to handle Events sent to that Event Orchestration.

        This example also shows using the get_priority and EscalationPolicy data sources to configure `priority` and `escalation_policy` actions for a rule.

        This example shows a Global Orchestration that has nested sets: a rule in the "start" set has a `route_to` action pointing at the "step-two" set.

        The `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set. In this example the `catch_all` doesn't have any `actions` so it'll leave events as-is.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        database_team = pagerduty.Team("database_team", name="Database Team")
        event_orchestration = pagerduty.EventOrchestration("event_orchestration",
            name="Example Orchestration",
            team=database_team.id)
        p1 = pagerduty.get_priority(name="P1")
        sre_esc_policy = pagerduty.get_escalation_policy(name="SRE Escalation Policy")
        global_ = pagerduty.EventOrchestrationGlobal("global",
            event_orchestration=event_orchestration.id,
            sets=[
                {
                    "id": "start",
                    "rules": [{
                        "label": "Always annotate a note to all events",
                        "actions": {
                            "annotate": "This incident was created by the Database Team via a Global Orchestration",
                            "route_to": "step-two",
                        },
                    }],
                },
                {
                    "id": "step-two",
                    "rules": [
                        {
                            "label": "Drop events that are marked as no-op",
                            "conditions": [{
                                "expression": "event.summary matches 'no-op'",
                            }],
                            "actions": {
                                "drop_event": True,
                            },
                        },
                        {
                            "label": "If the DB host is running out of space, then page the SRE team",
                            "conditions": [{
                                "expression": "event.summary matches part 'running out of space'",
                            }],
                            "actions": {
                                "escalation_policy": sre_esc_policy.id,
                            },
                        },
                        {
                            "label": "If there's something wrong on the replica, then mark the alert as a warning",
                            "conditions": [{
                                "expression": "event.custom_details.hostname matches part 'replica'",
                            }],
                            "actions": {
                                "severity": "warning",
                            },
                        },
                        {
                            "label": "Otherwise, set the incident to P1, pause for 10 mins and run a diagnostic once the alert is suspended",
                            "actions": {
                                "priority": p1.id,
                                "suspend": 600,
                                "automation_action": {
                                    "name": "db-diagnostic",
                                    "url": "https://example.com/run-diagnostic",
                                    "auto_send": True,
                                    "trigger_types": "alert_suspended",
                                },
                            },
                        },
                    ],
                },
            ],
            catch_all={
                "actions": {},
            })
        ```

        ## Import

        Global Orchestration can be imported using the `id` of the Event Orchestration, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal global 1b49abe7-26db-4439-a715-c6d883acfb3e
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EventOrchestrationGlobalCatchAllArgs', 'EventOrchestrationGlobalCatchAllArgsDict']] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[builtins.str] event_orchestration: ID of the Event Orchestration to which this Global Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationGlobalSetArgs', 'EventOrchestrationGlobalSetArgsDict']]]] sets: A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventOrchestrationGlobalArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [Global Orchestration](https://support.pagerduty.com/docs/event-orchestration#global-orchestrations) allows you to create a set of Event Rules. The Global Orchestration evaluates Events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Global Orchestration for further processing.

        ## Example of configuring a Global Orchestration

        This example shows creating `Team`, and `Event Orchestration` resources followed by creating a Global Orchestration to handle Events sent to that Event Orchestration.

        This example also shows using the get_priority and EscalationPolicy data sources to configure `priority` and `escalation_policy` actions for a rule.

        This example shows a Global Orchestration that has nested sets: a rule in the "start" set has a `route_to` action pointing at the "step-two" set.

        The `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set. In this example the `catch_all` doesn't have any `actions` so it'll leave events as-is.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        database_team = pagerduty.Team("database_team", name="Database Team")
        event_orchestration = pagerduty.EventOrchestration("event_orchestration",
            name="Example Orchestration",
            team=database_team.id)
        p1 = pagerduty.get_priority(name="P1")
        sre_esc_policy = pagerduty.get_escalation_policy(name="SRE Escalation Policy")
        global_ = pagerduty.EventOrchestrationGlobal("global",
            event_orchestration=event_orchestration.id,
            sets=[
                {
                    "id": "start",
                    "rules": [{
                        "label": "Always annotate a note to all events",
                        "actions": {
                            "annotate": "This incident was created by the Database Team via a Global Orchestration",
                            "route_to": "step-two",
                        },
                    }],
                },
                {
                    "id": "step-two",
                    "rules": [
                        {
                            "label": "Drop events that are marked as no-op",
                            "conditions": [{
                                "expression": "event.summary matches 'no-op'",
                            }],
                            "actions": {
                                "drop_event": True,
                            },
                        },
                        {
                            "label": "If the DB host is running out of space, then page the SRE team",
                            "conditions": [{
                                "expression": "event.summary matches part 'running out of space'",
                            }],
                            "actions": {
                                "escalation_policy": sre_esc_policy.id,
                            },
                        },
                        {
                            "label": "If there's something wrong on the replica, then mark the alert as a warning",
                            "conditions": [{
                                "expression": "event.custom_details.hostname matches part 'replica'",
                            }],
                            "actions": {
                                "severity": "warning",
                            },
                        },
                        {
                            "label": "Otherwise, set the incident to P1, pause for 10 mins and run a diagnostic once the alert is suspended",
                            "actions": {
                                "priority": p1.id,
                                "suspend": 600,
                                "automation_action": {
                                    "name": "db-diagnostic",
                                    "url": "https://example.com/run-diagnostic",
                                    "auto_send": True,
                                    "trigger_types": "alert_suspended",
                                },
                            },
                        },
                    ],
                },
            ],
            catch_all={
                "actions": {},
            })
        ```

        ## Import

        Global Orchestration can be imported using the `id` of the Event Orchestration, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal global 1b49abe7-26db-4439-a715-c6d883acfb3e
        ```

        :param str resource_name: The name of the resource.
        :param EventOrchestrationGlobalArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventOrchestrationGlobalArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[Union['EventOrchestrationGlobalCatchAllArgs', 'EventOrchestrationGlobalCatchAllArgsDict']]] = None,
                 event_orchestration: Optional[pulumi.Input[builtins.str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationGlobalSetArgs', 'EventOrchestrationGlobalSetArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventOrchestrationGlobalArgs.__new__(EventOrchestrationGlobalArgs)

            if catch_all is None and not opts.urn:
                raise TypeError("Missing required property 'catch_all'")
            __props__.__dict__["catch_all"] = catch_all
            if event_orchestration is None and not opts.urn:
                raise TypeError("Missing required property 'event_orchestration'")
            __props__.__dict__["event_orchestration"] = event_orchestration
            if sets is None and not opts.urn:
                raise TypeError("Missing required property 'sets'")
            __props__.__dict__["sets"] = sets
        super(EventOrchestrationGlobal, __self__).__init__(
            'pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            catch_all: Optional[pulumi.Input[Union['EventOrchestrationGlobalCatchAllArgs', 'EventOrchestrationGlobalCatchAllArgsDict']]] = None,
            event_orchestration: Optional[pulumi.Input[builtins.str]] = None,
            sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationGlobalSetArgs', 'EventOrchestrationGlobalSetArgsDict']]]]] = None) -> 'EventOrchestrationGlobal':
        """
        Get an existing EventOrchestrationGlobal resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EventOrchestrationGlobalCatchAllArgs', 'EventOrchestrationGlobalCatchAllArgsDict']] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[builtins.str] event_orchestration: ID of the Event Orchestration to which this Global Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationGlobalSetArgs', 'EventOrchestrationGlobalSetArgsDict']]]] sets: A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventOrchestrationGlobalState.__new__(_EventOrchestrationGlobalState)

        __props__.__dict__["catch_all"] = catch_all
        __props__.__dict__["event_orchestration"] = event_orchestration
        __props__.__dict__["sets"] = sets
        return EventOrchestrationGlobal(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Output['outputs.EventOrchestrationGlobalCatchAll']:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> pulumi.Output[builtins.str]:
        """
        ID of the Event Orchestration to which this Global Orchestration belongs to.
        """
        return pulumi.get(self, "event_orchestration")

    @property
    @pulumi.getter
    def sets(self) -> pulumi.Output[Sequence['outputs.EventOrchestrationGlobalSet']]:
        """
        A Global Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

