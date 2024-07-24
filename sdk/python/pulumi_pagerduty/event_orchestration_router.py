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

__all__ = ['EventOrchestrationRouterArgs', 'EventOrchestrationRouter']

@pulumi.input_type
class EventOrchestrationRouterArgs:
    def __init__(__self__, *,
                 catch_all: pulumi.Input['EventOrchestrationRouterCatchAllArgs'],
                 event_orchestration: pulumi.Input[str],
                 set: pulumi.Input['EventOrchestrationRouterSetArgs']):
        """
        The set of arguments for constructing a EventOrchestrationRouter resource.
        :param pulumi.Input['EventOrchestrationRouterCatchAllArgs'] catch_all: When none of the rules match an event, the event will be routed according to the catch_all settings.
        :param pulumi.Input[str] event_orchestration: ID of the Event Orchestration to which the Router belongs.
        :param pulumi.Input['EventOrchestrationRouterSetArgs'] set: The Router contains a single set of rules  (the "start" set).
        """
        pulumi.set(__self__, "catch_all", catch_all)
        pulumi.set(__self__, "event_orchestration", event_orchestration)
        pulumi.set(__self__, "set", set)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Input['EventOrchestrationRouterCatchAllArgs']:
        """
        When none of the rules match an event, the event will be routed according to the catch_all settings.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: pulumi.Input['EventOrchestrationRouterCatchAllArgs']):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> pulumi.Input[str]:
        """
        ID of the Event Orchestration to which the Router belongs.
        """
        return pulumi.get(self, "event_orchestration")

    @event_orchestration.setter
    def event_orchestration(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_orchestration", value)

    @property
    @pulumi.getter
    def set(self) -> pulumi.Input['EventOrchestrationRouterSetArgs']:
        """
        The Router contains a single set of rules  (the "start" set).
        """
        return pulumi.get(self, "set")

    @set.setter
    def set(self, value: pulumi.Input['EventOrchestrationRouterSetArgs']):
        pulumi.set(self, "set", value)


@pulumi.input_type
class _EventOrchestrationRouterState:
    def __init__(__self__, *,
                 catch_all: Optional[pulumi.Input['EventOrchestrationRouterCatchAllArgs']] = None,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 set: Optional[pulumi.Input['EventOrchestrationRouterSetArgs']] = None):
        """
        Input properties used for looking up and filtering EventOrchestrationRouter resources.
        :param pulumi.Input['EventOrchestrationRouterCatchAllArgs'] catch_all: When none of the rules match an event, the event will be routed according to the catch_all settings.
        :param pulumi.Input[str] event_orchestration: ID of the Event Orchestration to which the Router belongs.
        :param pulumi.Input['EventOrchestrationRouterSetArgs'] set: The Router contains a single set of rules  (the "start" set).
        """
        if catch_all is not None:
            pulumi.set(__self__, "catch_all", catch_all)
        if event_orchestration is not None:
            pulumi.set(__self__, "event_orchestration", event_orchestration)
        if set is not None:
            pulumi.set(__self__, "set", set)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> Optional[pulumi.Input['EventOrchestrationRouterCatchAllArgs']]:
        """
        When none of the rules match an event, the event will be routed according to the catch_all settings.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: Optional[pulumi.Input['EventOrchestrationRouterCatchAllArgs']]):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Event Orchestration to which the Router belongs.
        """
        return pulumi.get(self, "event_orchestration")

    @event_orchestration.setter
    def event_orchestration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_orchestration", value)

    @property
    @pulumi.getter
    def set(self) -> Optional[pulumi.Input['EventOrchestrationRouterSetArgs']]:
        """
        The Router contains a single set of rules  (the "start" set).
        """
        return pulumi.get(self, "set")

    @set.setter
    def set(self, value: Optional[pulumi.Input['EventOrchestrationRouterSetArgs']]):
        pulumi.set(self, "set", value)


class EventOrchestrationRouter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationRouterCatchAllArgs']]] = None,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 set: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationRouterSetArgs']]] = None,
                 __props__=None):
        """
        An Orchestration Router allows users to create a set of Event Rules. The Router evaluates events sent to this Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in the `catch_all` or to the "Unrouted" Orchestration if no service is specified.

        ## Example of configuring Router rules for an Orchestration

        In this example the user has defined the Router with three rules. The first rule configures a dynamic route: any event containing a value in its `pd_service_id` custom detail will be routed to the Service with the ID specified by that value. The other rules route events matching a condition to specific services.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        database = pagerduty.get_service(name="Primary Data Store")
        www = pagerduty.get_service(name="Web Server App")
        router = pagerduty.EventOrchestrationRouter("router",
            event_orchestration=my_monitor["id"],
            set=pagerduty.EventOrchestrationRouterSetArgs(
                id="start",
                rules=[
                    pagerduty.EventOrchestrationRouterSetRuleArgs(
                        label="Dynamically route events related to specific PagerDuty services",
                        actions=pagerduty.EventOrchestrationRouterSetRuleActionsArgs(
                            dynamic_route_tos={
                                "lookupBy": "service_id",
                                "source": "event.custom_details.pd_service_id",
                                "regexp": "(.*)",
                            },
                        ),
                    ),
                    pagerduty.EventOrchestrationRouterSetRuleArgs(
                        label="Events relating to our relational database",
                        conditions=[
                            pagerduty.EventOrchestrationRouterSetRuleConditionArgs(
                                expression="event.summary matches part 'database'",
                            ),
                            pagerduty.EventOrchestrationRouterSetRuleConditionArgs(
                                expression="event.source matches regex 'db[0-9]+-server'",
                            ),
                        ],
                        actions=pagerduty.EventOrchestrationRouterSetRuleActionsArgs(
                            route_to=database.id,
                        ),
                    ),
                    pagerduty.EventOrchestrationRouterSetRuleArgs(
                        conditions=[pagerduty.EventOrchestrationRouterSetRuleConditionArgs(
                            expression="event.summary matches part 'www'",
                        )],
                        actions=pagerduty.EventOrchestrationRouterSetRuleActionsArgs(
                            route_to=www.id,
                        ),
                    ),
                ],
            ),
            catch_all=pagerduty.EventOrchestrationRouterCatchAllArgs(
                actions=pagerduty.EventOrchestrationRouterCatchAllActionsArgs(
                    route_to="unrouted",
                ),
            ))
        ```

        ## Import

        Router can be imported using the `id` of the Event Orchestration, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter router 1b49abe7-26db-4439-a715-c6d883acfb3e
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EventOrchestrationRouterCatchAllArgs']] catch_all: When none of the rules match an event, the event will be routed according to the catch_all settings.
        :param pulumi.Input[str] event_orchestration: ID of the Event Orchestration to which the Router belongs.
        :param pulumi.Input[pulumi.InputType['EventOrchestrationRouterSetArgs']] set: The Router contains a single set of rules  (the "start" set).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventOrchestrationRouterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Orchestration Router allows users to create a set of Event Rules. The Router evaluates events sent to this Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in the `catch_all` or to the "Unrouted" Orchestration if no service is specified.

        ## Example of configuring Router rules for an Orchestration

        In this example the user has defined the Router with three rules. The first rule configures a dynamic route: any event containing a value in its `pd_service_id` custom detail will be routed to the Service with the ID specified by that value. The other rules route events matching a condition to specific services.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        database = pagerduty.get_service(name="Primary Data Store")
        www = pagerduty.get_service(name="Web Server App")
        router = pagerduty.EventOrchestrationRouter("router",
            event_orchestration=my_monitor["id"],
            set=pagerduty.EventOrchestrationRouterSetArgs(
                id="start",
                rules=[
                    pagerduty.EventOrchestrationRouterSetRuleArgs(
                        label="Dynamically route events related to specific PagerDuty services",
                        actions=pagerduty.EventOrchestrationRouterSetRuleActionsArgs(
                            dynamic_route_tos={
                                "lookupBy": "service_id",
                                "source": "event.custom_details.pd_service_id",
                                "regexp": "(.*)",
                            },
                        ),
                    ),
                    pagerduty.EventOrchestrationRouterSetRuleArgs(
                        label="Events relating to our relational database",
                        conditions=[
                            pagerduty.EventOrchestrationRouterSetRuleConditionArgs(
                                expression="event.summary matches part 'database'",
                            ),
                            pagerduty.EventOrchestrationRouterSetRuleConditionArgs(
                                expression="event.source matches regex 'db[0-9]+-server'",
                            ),
                        ],
                        actions=pagerduty.EventOrchestrationRouterSetRuleActionsArgs(
                            route_to=database.id,
                        ),
                    ),
                    pagerduty.EventOrchestrationRouterSetRuleArgs(
                        conditions=[pagerduty.EventOrchestrationRouterSetRuleConditionArgs(
                            expression="event.summary matches part 'www'",
                        )],
                        actions=pagerduty.EventOrchestrationRouterSetRuleActionsArgs(
                            route_to=www.id,
                        ),
                    ),
                ],
            ),
            catch_all=pagerduty.EventOrchestrationRouterCatchAllArgs(
                actions=pagerduty.EventOrchestrationRouterCatchAllActionsArgs(
                    route_to="unrouted",
                ),
            ))
        ```

        ## Import

        Router can be imported using the `id` of the Event Orchestration, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter router 1b49abe7-26db-4439-a715-c6d883acfb3e
        ```

        :param str resource_name: The name of the resource.
        :param EventOrchestrationRouterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventOrchestrationRouterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationRouterCatchAllArgs']]] = None,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 set: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationRouterSetArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventOrchestrationRouterArgs.__new__(EventOrchestrationRouterArgs)

            if catch_all is None and not opts.urn:
                raise TypeError("Missing required property 'catch_all'")
            __props__.__dict__["catch_all"] = catch_all
            if event_orchestration is None and not opts.urn:
                raise TypeError("Missing required property 'event_orchestration'")
            __props__.__dict__["event_orchestration"] = event_orchestration
            if set is None and not opts.urn:
                raise TypeError("Missing required property 'set'")
            __props__.__dict__["set"] = set
        super(EventOrchestrationRouter, __self__).__init__(
            'pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            catch_all: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationRouterCatchAllArgs']]] = None,
            event_orchestration: Optional[pulumi.Input[str]] = None,
            set: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationRouterSetArgs']]] = None) -> 'EventOrchestrationRouter':
        """
        Get an existing EventOrchestrationRouter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EventOrchestrationRouterCatchAllArgs']] catch_all: When none of the rules match an event, the event will be routed according to the catch_all settings.
        :param pulumi.Input[str] event_orchestration: ID of the Event Orchestration to which the Router belongs.
        :param pulumi.Input[pulumi.InputType['EventOrchestrationRouterSetArgs']] set: The Router contains a single set of rules  (the "start" set).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventOrchestrationRouterState.__new__(_EventOrchestrationRouterState)

        __props__.__dict__["catch_all"] = catch_all
        __props__.__dict__["event_orchestration"] = event_orchestration
        __props__.__dict__["set"] = set
        return EventOrchestrationRouter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Output['outputs.EventOrchestrationRouterCatchAll']:
        """
        When none of the rules match an event, the event will be routed according to the catch_all settings.
        """
        return pulumi.get(self, "catch_all")

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> pulumi.Output[str]:
        """
        ID of the Event Orchestration to which the Router belongs.
        """
        return pulumi.get(self, "event_orchestration")

    @property
    @pulumi.getter
    def set(self) -> pulumi.Output['outputs.EventOrchestrationRouterSet']:
        """
        The Router contains a single set of rules  (the "start" set).
        """
        return pulumi.get(self, "set")

