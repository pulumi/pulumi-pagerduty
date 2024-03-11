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

__all__ = ['EventOrchestrationUnroutedArgs', 'EventOrchestrationUnrouted']

@pulumi.input_type
class EventOrchestrationUnroutedArgs:
    def __init__(__self__, *,
                 catch_all: pulumi.Input['EventOrchestrationUnroutedCatchAllArgs'],
                 event_orchestration: pulumi.Input[str],
                 sets: pulumi.Input[Sequence[pulumi.Input['EventOrchestrationUnroutedSetArgs']]]):
        """
        The set of arguments for constructing a EventOrchestrationUnrouted resource.
        :param pulumi.Input['EventOrchestrationUnroutedCatchAllArgs'] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[str] event_orchestration: The Event Orchestration to which this Unrouted Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationUnroutedSetArgs']]] sets: An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        pulumi.set(__self__, "catch_all", catch_all)
        pulumi.set(__self__, "event_orchestration", event_orchestration)
        pulumi.set(__self__, "sets", sets)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Input['EventOrchestrationUnroutedCatchAllArgs']:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: pulumi.Input['EventOrchestrationUnroutedCatchAllArgs']):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> pulumi.Input[str]:
        """
        The Event Orchestration to which this Unrouted Orchestration belongs to.
        """
        return pulumi.get(self, "event_orchestration")

    @event_orchestration.setter
    def event_orchestration(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_orchestration", value)

    @property
    @pulumi.getter
    def sets(self) -> pulumi.Input[Sequence[pulumi.Input['EventOrchestrationUnroutedSetArgs']]]:
        """
        An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

    @sets.setter
    def sets(self, value: pulumi.Input[Sequence[pulumi.Input['EventOrchestrationUnroutedSetArgs']]]):
        pulumi.set(self, "sets", value)


@pulumi.input_type
class _EventOrchestrationUnroutedState:
    def __init__(__self__, *,
                 catch_all: Optional[pulumi.Input['EventOrchestrationUnroutedCatchAllArgs']] = None,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationUnroutedSetArgs']]]] = None):
        """
        Input properties used for looking up and filtering EventOrchestrationUnrouted resources.
        :param pulumi.Input['EventOrchestrationUnroutedCatchAllArgs'] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[str] event_orchestration: The Event Orchestration to which this Unrouted Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationUnroutedSetArgs']]] sets: An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        if catch_all is not None:
            pulumi.set(__self__, "catch_all", catch_all)
        if event_orchestration is not None:
            pulumi.set(__self__, "event_orchestration", event_orchestration)
        if sets is not None:
            pulumi.set(__self__, "sets", sets)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> Optional[pulumi.Input['EventOrchestrationUnroutedCatchAllArgs']]:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: Optional[pulumi.Input['EventOrchestrationUnroutedCatchAllArgs']]):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> Optional[pulumi.Input[str]]:
        """
        The Event Orchestration to which this Unrouted Orchestration belongs to.
        """
        return pulumi.get(self, "event_orchestration")

    @event_orchestration.setter
    def event_orchestration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_orchestration", value)

    @property
    @pulumi.getter
    def sets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationUnroutedSetArgs']]]]:
        """
        An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

    @sets.setter
    def sets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationUnroutedSetArgs']]]]):
        pulumi.set(self, "sets", value)


class EventOrchestrationUnrouted(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedCatchAllArgs']]] = None,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedSetArgs']]]]] = None,
                 __props__=None):
        """
        An Unrouted Orchestration allows users to create a set of Event Rules that will be evaluated against all events that don't match any rules in the Orchestration's Router.

        The Unrouted Orchestration evaluates events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.

        ## Example of configuring Unrouted Rules for an Orchestration

        In this example of an Unrouted Orchestration, the rule matches only if the condition is matched.
        Alerts created for events that do not match the rule will have severity level set to `info` as defined in `catch_all` block.

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        unrouted = pagerduty.EventOrchestrationUnrouted("unrouted",
            event_orchestration=pagerduty_event_orchestration["my_monitor"]["id"],
            sets=[pagerduty.EventOrchestrationUnroutedSetArgs(
                id="start",
                rules=[pagerduty.EventOrchestrationUnroutedSetRuleArgs(
                    label="Update the summary of un-matched Critical alerts so they're easier to spot",
                    conditions=[pagerduty.EventOrchestrationUnroutedSetRuleConditionArgs(
                        expression="event.severity matches 'critical'",
                    )],
                    actions=pagerduty.EventOrchestrationUnroutedSetRuleActionsArgs(
                        severity="critical",
                        extractions=[pagerduty.EventOrchestrationUnroutedSetRuleActionsExtractionArgs(
                            target="event.summary",
                            template="[Critical Unrouted] {{event.summary}}",
                        )],
                    ),
                )],
            )],
            catch_all=pagerduty.EventOrchestrationUnroutedCatchAllArgs(
                actions=pagerduty.EventOrchestrationUnroutedCatchAllActionsArgs(
                    severity="info",
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Unrouted Orchestration can be imported using the `id` of the Event Orchestration, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted unrouted 1b49abe7-26db-4439-a715-c6d883acfb3e
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedCatchAllArgs']] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[str] event_orchestration: The Event Orchestration to which this Unrouted Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedSetArgs']]]] sets: An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventOrchestrationUnroutedArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Unrouted Orchestration allows users to create a set of Event Rules that will be evaluated against all events that don't match any rules in the Orchestration's Router.

        The Unrouted Orchestration evaluates events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.

        ## Example of configuring Unrouted Rules for an Orchestration

        In this example of an Unrouted Orchestration, the rule matches only if the condition is matched.
        Alerts created for events that do not match the rule will have severity level set to `info` as defined in `catch_all` block.

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        unrouted = pagerduty.EventOrchestrationUnrouted("unrouted",
            event_orchestration=pagerduty_event_orchestration["my_monitor"]["id"],
            sets=[pagerduty.EventOrchestrationUnroutedSetArgs(
                id="start",
                rules=[pagerduty.EventOrchestrationUnroutedSetRuleArgs(
                    label="Update the summary of un-matched Critical alerts so they're easier to spot",
                    conditions=[pagerduty.EventOrchestrationUnroutedSetRuleConditionArgs(
                        expression="event.severity matches 'critical'",
                    )],
                    actions=pagerduty.EventOrchestrationUnroutedSetRuleActionsArgs(
                        severity="critical",
                        extractions=[pagerduty.EventOrchestrationUnroutedSetRuleActionsExtractionArgs(
                            target="event.summary",
                            template="[Critical Unrouted] {{event.summary}}",
                        )],
                    ),
                )],
            )],
            catch_all=pagerduty.EventOrchestrationUnroutedCatchAllArgs(
                actions=pagerduty.EventOrchestrationUnroutedCatchAllActionsArgs(
                    severity="info",
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Unrouted Orchestration can be imported using the `id` of the Event Orchestration, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted unrouted 1b49abe7-26db-4439-a715-c6d883acfb3e
        ```

        :param str resource_name: The name of the resource.
        :param EventOrchestrationUnroutedArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventOrchestrationUnroutedArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedCatchAllArgs']]] = None,
                 event_orchestration: Optional[pulumi.Input[str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedSetArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventOrchestrationUnroutedArgs.__new__(EventOrchestrationUnroutedArgs)

            if catch_all is None and not opts.urn:
                raise TypeError("Missing required property 'catch_all'")
            __props__.__dict__["catch_all"] = catch_all
            if event_orchestration is None and not opts.urn:
                raise TypeError("Missing required property 'event_orchestration'")
            __props__.__dict__["event_orchestration"] = event_orchestration
            if sets is None and not opts.urn:
                raise TypeError("Missing required property 'sets'")
            __props__.__dict__["sets"] = sets
        super(EventOrchestrationUnrouted, __self__).__init__(
            'pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            catch_all: Optional[pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedCatchAllArgs']]] = None,
            event_orchestration: Optional[pulumi.Input[str]] = None,
            sets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedSetArgs']]]]] = None) -> 'EventOrchestrationUnrouted':
        """
        Get an existing EventOrchestrationUnrouted resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedCatchAllArgs']] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[str] event_orchestration: The Event Orchestration to which this Unrouted Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EventOrchestrationUnroutedSetArgs']]]] sets: An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventOrchestrationUnroutedState.__new__(_EventOrchestrationUnroutedState)

        __props__.__dict__["catch_all"] = catch_all
        __props__.__dict__["event_orchestration"] = event_orchestration
        __props__.__dict__["sets"] = sets
        return EventOrchestrationUnrouted(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Output['outputs.EventOrchestrationUnroutedCatchAll']:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @property
    @pulumi.getter(name="eventOrchestration")
    def event_orchestration(self) -> pulumi.Output[str]:
        """
        The Event Orchestration to which this Unrouted Orchestration belongs to.
        """
        return pulumi.get(self, "event_orchestration")

    @property
    @pulumi.getter
    def sets(self) -> pulumi.Output[Sequence['outputs.EventOrchestrationUnroutedSet']]:
        """
        An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

