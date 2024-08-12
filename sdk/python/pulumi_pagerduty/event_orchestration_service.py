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

__all__ = ['EventOrchestrationServiceArgs', 'EventOrchestrationService']

@pulumi.input_type
class EventOrchestrationServiceArgs:
    def __init__(__self__, *,
                 catch_all: pulumi.Input['EventOrchestrationServiceCatchAllArgs'],
                 service: pulumi.Input[str],
                 sets: pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceSetArgs']]],
                 enable_event_orchestration_for_service: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a EventOrchestrationService resource.
        :param pulumi.Input['EventOrchestrationServiceCatchAllArgs'] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[str] service: ID of the Service to which this Service Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceSetArgs']]] sets: A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        :param pulumi.Input[bool] enable_event_orchestration_for_service: Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        """
        pulumi.set(__self__, "catch_all", catch_all)
        pulumi.set(__self__, "service", service)
        pulumi.set(__self__, "sets", sets)
        if enable_event_orchestration_for_service is not None:
            pulumi.set(__self__, "enable_event_orchestration_for_service", enable_event_orchestration_for_service)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Input['EventOrchestrationServiceCatchAllArgs']:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: pulumi.Input['EventOrchestrationServiceCatchAllArgs']):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[str]:
        """
        ID of the Service to which this Service Orchestration belongs to.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def sets(self) -> pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceSetArgs']]]:
        """
        A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

    @sets.setter
    def sets(self, value: pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceSetArgs']]]):
        pulumi.set(self, "sets", value)

    @property
    @pulumi.getter(name="enableEventOrchestrationForService")
    def enable_event_orchestration_for_service(self) -> Optional[pulumi.Input[bool]]:
        """
        Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        """
        return pulumi.get(self, "enable_event_orchestration_for_service")

    @enable_event_orchestration_for_service.setter
    def enable_event_orchestration_for_service(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_event_orchestration_for_service", value)


@pulumi.input_type
class _EventOrchestrationServiceState:
    def __init__(__self__, *,
                 catch_all: Optional[pulumi.Input['EventOrchestrationServiceCatchAllArgs']] = None,
                 enable_event_orchestration_for_service: Optional[pulumi.Input[bool]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceSetArgs']]]] = None):
        """
        Input properties used for looking up and filtering EventOrchestrationService resources.
        :param pulumi.Input['EventOrchestrationServiceCatchAllArgs'] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[bool] enable_event_orchestration_for_service: Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        :param pulumi.Input[str] service: ID of the Service to which this Service Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceSetArgs']]] sets: A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        if catch_all is not None:
            pulumi.set(__self__, "catch_all", catch_all)
        if enable_event_orchestration_for_service is not None:
            pulumi.set(__self__, "enable_event_orchestration_for_service", enable_event_orchestration_for_service)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if sets is not None:
            pulumi.set(__self__, "sets", sets)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> Optional[pulumi.Input['EventOrchestrationServiceCatchAllArgs']]:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: Optional[pulumi.Input['EventOrchestrationServiceCatchAllArgs']]):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="enableEventOrchestrationForService")
    def enable_event_orchestration_for_service(self) -> Optional[pulumi.Input[bool]]:
        """
        Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        """
        return pulumi.get(self, "enable_event_orchestration_for_service")

    @enable_event_orchestration_for_service.setter
    def enable_event_orchestration_for_service(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_event_orchestration_for_service", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Service to which this Service Orchestration belongs to.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def sets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceSetArgs']]]]:
        """
        A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

    @sets.setter
    def sets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceSetArgs']]]]):
        pulumi.set(self, "sets", value)


class EventOrchestrationService(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[Union['EventOrchestrationServiceCatchAllArgs', 'EventOrchestrationServiceCatchAllArgsDict']]] = None,
                 enable_event_orchestration_for_service: Optional[pulumi.Input[bool]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceSetArgs', 'EventOrchestrationServiceSetArgsDict']]]]] = None,
                 __props__=None):
        """
        A [Service Orchestration](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.

        > If you have a Service that uses [Service Event Rules](https://support.pagerduty.com/docs/rulesets#service-event-rules), you can switch to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) at any time setting the attribute `enable_event_orchestration_for_service` to `true`. Please read the [Switch to Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#switch-to-service-orchestrations) instructions for more information.

        ## Example of configuring a Service Orchestration

        This example shows creating `Team`, `User`, `Escalation Policy`, and `Service` resources followed by creating a Service Orchestration to handle Events sent to that Service.

        This example also shows using the get_priority data sources to configure `priority` and `escalation_policy` actions for a rule.

        This example shows a Service Orchestration that has nested sets: a rule in the "start" set has a `route_to` action pointing at the "step-two" set.

        The `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set. In this example the `catch_all` doesn't have any `actions` so it'll leave events as-is.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        engineering = pagerduty.Team("engineering", name="Engineering")
        example = pagerduty.User("example",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name")
        foo = pagerduty.TeamMembership("foo",
            user_id=example.id,
            team_id=engineering.id,
            role="manager")
        example_escalation_policy = pagerduty.EscalationPolicy("example",
            name="Engineering Escalation Policy",
            num_loops=2,
            rules=[{
                "escalation_delay_in_minutes": 10,
                "targets": [{
                    "type": "user_reference",
                    "id": example.id,
                }],
            }])
        example_service = pagerduty.Service("example",
            name="My Web App",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=example_escalation_policy.id,
            alert_creation="create_alerts_and_incidents")
        cs_impact = pagerduty.IncidentCustomField("cs_impact",
            name="impact",
            data_type="string",
            field_type="single_value")
        p1 = pagerduty.get_priority(name="P1")
        sre_esc_policy = pagerduty.get_escalation_policy(name="SRE Escalation Policy")
        www = pagerduty.EventOrchestrationService("www",
            service=example_service.id,
            enable_event_orchestration_for_service=True,
            sets=[
                {
                    "id": "start",
                    "rules": [{
                        "label": "Always apply some consistent event transformations to all events",
                        "actions": {
                            "variables": [{
                                "name": "hostname",
                                "path": "event.component",
                                "value": "hostname: (.*)",
                                "type": "regex",
                            }],
                            "extractions": [
                                {
                                    "template": "{{variables.hostname}}",
                                    "target": "event.custom_details.hostname",
                                },
                                {
                                    "source": "event.source",
                                    "regex": "www (.*) service",
                                    "target": "event.source",
                                },
                            ],
                            "route_to": "step-two",
                        },
                    }],
                },
                {
                    "id": "step-two",
                    "rules": [
                        {
                            "label": "All critical alerts should be treated as P1 incident",
                            "conditions": [{
                                "expression": "event.severity matches 'critical'",
                            }],
                            "actions": {
                                "annotate": "Please use our P1 runbook: https://docs.test/p1-runbook",
                                "priority": p1.id,
                                "incident_custom_field_updates": [{
                                    "id": cs_impact.id,
                                    "value": "High Impact",
                                }],
                            },
                        },
                        {
                            "label": "If any of the API apps are unavailable, page the SRE team",
                            "conditions": [{
                                "expression": "event.custom_details.service_name matches part '-api' and event.custom_details.status_code matches '502'",
                            }],
                            "actions": {
                                "escalation_policy": sre_esc_policy.id,
                            },
                        },
                        {
                            "label": "If there's something wrong on the canary let the team know about it in our deployments Slack channel",
                            "conditions": [{
                                "expression": "event.custom_details.hostname matches part 'canary'",
                            }],
                            "actions": {
                                "automation_action": {
                                    "name": "Canary Slack Notification",
                                    "url": "https://our-slack-listerner.test/canary-notification",
                                    "auto_send": True,
                                    "parameters": [
                                        {
                                            "key": "channel",
                                            "value": "#my-team-channel",
                                        },
                                        {
                                            "key": "message",
                                            "value": "something is wrong with the canary deployment",
                                        },
                                    ],
                                    "headers": [{
                                        "key": "X-Notification-Source",
                                        "value": "PagerDuty Incident Webhook",
                                    }],
                                },
                            },
                        },
                        {
                            "label": "Never bother the on-call for info-level events outside of work hours",
                            "conditions": [{
                                "expression": "event.severity matches 'info' and not (now in Mon,Tue,Wed,Thu,Fri 09:00:00 to 17:00:00 America/Los_Angeles)",
                            }],
                            "actions": {
                                "suppress": True,
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

        Service Orchestration can be imported using the `id` of the Service, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationService:EventOrchestrationService service PFEODA7
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EventOrchestrationServiceCatchAllArgs', 'EventOrchestrationServiceCatchAllArgsDict']] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[bool] enable_event_orchestration_for_service: Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        :param pulumi.Input[str] service: ID of the Service to which this Service Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceSetArgs', 'EventOrchestrationServiceSetArgsDict']]]] sets: A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventOrchestrationServiceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [Service Orchestration](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.

        > If you have a Service that uses [Service Event Rules](https://support.pagerduty.com/docs/rulesets#service-event-rules), you can switch to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations) at any time setting the attribute `enable_event_orchestration_for_service` to `true`. Please read the [Switch to Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#switch-to-service-orchestrations) instructions for more information.

        ## Example of configuring a Service Orchestration

        This example shows creating `Team`, `User`, `Escalation Policy`, and `Service` resources followed by creating a Service Orchestration to handle Events sent to that Service.

        This example also shows using the get_priority data sources to configure `priority` and `escalation_policy` actions for a rule.

        This example shows a Service Orchestration that has nested sets: a rule in the "start" set has a `route_to` action pointing at the "step-two" set.

        The `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set. In this example the `catch_all` doesn't have any `actions` so it'll leave events as-is.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        engineering = pagerduty.Team("engineering", name="Engineering")
        example = pagerduty.User("example",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name")
        foo = pagerduty.TeamMembership("foo",
            user_id=example.id,
            team_id=engineering.id,
            role="manager")
        example_escalation_policy = pagerduty.EscalationPolicy("example",
            name="Engineering Escalation Policy",
            num_loops=2,
            rules=[{
                "escalation_delay_in_minutes": 10,
                "targets": [{
                    "type": "user_reference",
                    "id": example.id,
                }],
            }])
        example_service = pagerduty.Service("example",
            name="My Web App",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=example_escalation_policy.id,
            alert_creation="create_alerts_and_incidents")
        cs_impact = pagerduty.IncidentCustomField("cs_impact",
            name="impact",
            data_type="string",
            field_type="single_value")
        p1 = pagerduty.get_priority(name="P1")
        sre_esc_policy = pagerduty.get_escalation_policy(name="SRE Escalation Policy")
        www = pagerduty.EventOrchestrationService("www",
            service=example_service.id,
            enable_event_orchestration_for_service=True,
            sets=[
                {
                    "id": "start",
                    "rules": [{
                        "label": "Always apply some consistent event transformations to all events",
                        "actions": {
                            "variables": [{
                                "name": "hostname",
                                "path": "event.component",
                                "value": "hostname: (.*)",
                                "type": "regex",
                            }],
                            "extractions": [
                                {
                                    "template": "{{variables.hostname}}",
                                    "target": "event.custom_details.hostname",
                                },
                                {
                                    "source": "event.source",
                                    "regex": "www (.*) service",
                                    "target": "event.source",
                                },
                            ],
                            "route_to": "step-two",
                        },
                    }],
                },
                {
                    "id": "step-two",
                    "rules": [
                        {
                            "label": "All critical alerts should be treated as P1 incident",
                            "conditions": [{
                                "expression": "event.severity matches 'critical'",
                            }],
                            "actions": {
                                "annotate": "Please use our P1 runbook: https://docs.test/p1-runbook",
                                "priority": p1.id,
                                "incident_custom_field_updates": [{
                                    "id": cs_impact.id,
                                    "value": "High Impact",
                                }],
                            },
                        },
                        {
                            "label": "If any of the API apps are unavailable, page the SRE team",
                            "conditions": [{
                                "expression": "event.custom_details.service_name matches part '-api' and event.custom_details.status_code matches '502'",
                            }],
                            "actions": {
                                "escalation_policy": sre_esc_policy.id,
                            },
                        },
                        {
                            "label": "If there's something wrong on the canary let the team know about it in our deployments Slack channel",
                            "conditions": [{
                                "expression": "event.custom_details.hostname matches part 'canary'",
                            }],
                            "actions": {
                                "automation_action": {
                                    "name": "Canary Slack Notification",
                                    "url": "https://our-slack-listerner.test/canary-notification",
                                    "auto_send": True,
                                    "parameters": [
                                        {
                                            "key": "channel",
                                            "value": "#my-team-channel",
                                        },
                                        {
                                            "key": "message",
                                            "value": "something is wrong with the canary deployment",
                                        },
                                    ],
                                    "headers": [{
                                        "key": "X-Notification-Source",
                                        "value": "PagerDuty Incident Webhook",
                                    }],
                                },
                            },
                        },
                        {
                            "label": "Never bother the on-call for info-level events outside of work hours",
                            "conditions": [{
                                "expression": "event.severity matches 'info' and not (now in Mon,Tue,Wed,Thu,Fri 09:00:00 to 17:00:00 America/Los_Angeles)",
                            }],
                            "actions": {
                                "suppress": True,
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

        Service Orchestration can be imported using the `id` of the Service, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationService:EventOrchestrationService service PFEODA7
        ```

        :param str resource_name: The name of the resource.
        :param EventOrchestrationServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventOrchestrationServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catch_all: Optional[pulumi.Input[Union['EventOrchestrationServiceCatchAllArgs', 'EventOrchestrationServiceCatchAllArgsDict']]] = None,
                 enable_event_orchestration_for_service: Optional[pulumi.Input[bool]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceSetArgs', 'EventOrchestrationServiceSetArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventOrchestrationServiceArgs.__new__(EventOrchestrationServiceArgs)

            if catch_all is None and not opts.urn:
                raise TypeError("Missing required property 'catch_all'")
            __props__.__dict__["catch_all"] = catch_all
            __props__.__dict__["enable_event_orchestration_for_service"] = enable_event_orchestration_for_service
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
            if sets is None and not opts.urn:
                raise TypeError("Missing required property 'sets'")
            __props__.__dict__["sets"] = sets
        super(EventOrchestrationService, __self__).__init__(
            'pagerduty:index/eventOrchestrationService:EventOrchestrationService',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            catch_all: Optional[pulumi.Input[Union['EventOrchestrationServiceCatchAllArgs', 'EventOrchestrationServiceCatchAllArgsDict']]] = None,
            enable_event_orchestration_for_service: Optional[pulumi.Input[bool]] = None,
            service: Optional[pulumi.Input[str]] = None,
            sets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceSetArgs', 'EventOrchestrationServiceSetArgsDict']]]]] = None) -> 'EventOrchestrationService':
        """
        Get an existing EventOrchestrationService resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EventOrchestrationServiceCatchAllArgs', 'EventOrchestrationServiceCatchAllArgsDict']] catch_all: the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        :param pulumi.Input[bool] enable_event_orchestration_for_service: Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        :param pulumi.Input[str] service: ID of the Service to which this Service Orchestration belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceSetArgs', 'EventOrchestrationServiceSetArgsDict']]]] sets: A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventOrchestrationServiceState.__new__(_EventOrchestrationServiceState)

        __props__.__dict__["catch_all"] = catch_all
        __props__.__dict__["enable_event_orchestration_for_service"] = enable_event_orchestration_for_service
        __props__.__dict__["service"] = service
        __props__.__dict__["sets"] = sets
        return EventOrchestrationService(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Output['outputs.EventOrchestrationServiceCatchAll']:
        """
        the `catch_all` actions will be applied if an Event reaches the end of any set without matching any rules in that set.
        """
        return pulumi.get(self, "catch_all")

    @property
    @pulumi.getter(name="enableEventOrchestrationForService")
    def enable_event_orchestration_for_service(self) -> pulumi.Output[bool]:
        """
        Opt-in/out for switching the Service to [Service Orchestrations](https://support.pagerduty.com/docs/event-orchestration#service-orchestrations).
        """
        return pulumi.get(self, "enable_event_orchestration_for_service")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[str]:
        """
        ID of the Service to which this Service Orchestration belongs to.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def sets(self) -> pulumi.Output[Sequence['outputs.EventOrchestrationServiceSet']]:
        """
        A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
        """
        return pulumi.get(self, "sets")

