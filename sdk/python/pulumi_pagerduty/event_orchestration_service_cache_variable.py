# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['EventOrchestrationServiceCacheVariableArgs', 'EventOrchestrationServiceCacheVariable']

@pulumi.input_type
class EventOrchestrationServiceCacheVariableArgs:
    def __init__(__self__, *,
                 configuration: pulumi.Input['EventOrchestrationServiceCacheVariableConfigurationArgs'],
                 service: pulumi.Input[str],
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceCacheVariableConditionArgs']]]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EventOrchestrationServiceCacheVariable resource.
        :param pulumi.Input['EventOrchestrationServiceCacheVariableConfigurationArgs'] configuration: A configuration object to define what and how values will be stored in the Cache Variable.
        :param pulumi.Input[str] service: ID of the Service Event Orchestration to which this Cache Variable belongs.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceCacheVariableConditionArgs']]] conditions: Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        :param pulumi.Input[bool] disabled: Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        :param pulumi.Input[str] name: Name of the Cache Variable associated with the Service Event Orchestration.
        """
        pulumi.set(__self__, "configuration", configuration)
        pulumi.set(__self__, "service", service)
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Input['EventOrchestrationServiceCacheVariableConfigurationArgs']:
        """
        A configuration object to define what and how values will be stored in the Cache Variable.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: pulumi.Input['EventOrchestrationServiceCacheVariableConfigurationArgs']):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[str]:
        """
        ID of the Service Event Orchestration to which this Cache Variable belongs.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceCacheVariableConditionArgs']]]]:
        """
        Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceCacheVariableConditionArgs']]]]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Cache Variable associated with the Service Event Orchestration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _EventOrchestrationServiceCacheVariableState:
    def __init__(__self__, *,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceCacheVariableConditionArgs']]]] = None,
                 configuration: Optional[pulumi.Input['EventOrchestrationServiceCacheVariableConfigurationArgs']] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EventOrchestrationServiceCacheVariable resources.
        :param pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceCacheVariableConditionArgs']]] conditions: Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        :param pulumi.Input['EventOrchestrationServiceCacheVariableConfigurationArgs'] configuration: A configuration object to define what and how values will be stored in the Cache Variable.
        :param pulumi.Input[bool] disabled: Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        :param pulumi.Input[str] name: Name of the Cache Variable associated with the Service Event Orchestration.
        :param pulumi.Input[str] service: ID of the Service Event Orchestration to which this Cache Variable belongs.
        """
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if service is not None:
            pulumi.set(__self__, "service", service)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceCacheVariableConditionArgs']]]]:
        """
        Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EventOrchestrationServiceCacheVariableConditionArgs']]]]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['EventOrchestrationServiceCacheVariableConfigurationArgs']]:
        """
        A configuration object to define what and how values will be stored in the Cache Variable.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['EventOrchestrationServiceCacheVariableConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Cache Variable associated with the Service Event Orchestration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Service Event Orchestration to which this Cache Variable belongs.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)


class EventOrchestrationServiceCacheVariable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceCacheVariableConditionArgs', 'EventOrchestrationServiceCacheVariableConditionArgsDict']]]]] = None,
                 configuration: Optional[pulumi.Input[Union['EventOrchestrationServiceCacheVariableConfigurationArgs', 'EventOrchestrationServiceCacheVariableConfigurationArgsDict']]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) can be created on a Service Event Orchestration, in order to temporarily store event data to be referenced later within the Service Event Orchestration

        ## Example of configuring a Cache Variable for a Service Event Orchestration

        This example shows creating a service `Event Orchestration` and a `Cache Variable`. This Cache Variable will count and store the number of trigger events with 'database' in its title. Then all alerts sent to this Event Orchestration will have its severity upped to 'critical' if the count has reached at least 5 triggers within the last 1 minute.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        database_team = pagerduty.Team("database_team", name="Database Team")
        user1 = pagerduty.User("user_1",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name",
            teams=[database_team.id])
        db_ep = pagerduty.EscalationPolicy("db_ep",
            name="Database Escalation Policy",
            num_loops=2,
            rules=[{
                "escalation_delay_in_minutes": 10,
                "targets": [{
                    "type": "user",
                    "id": user1.id,
                }],
            }])
        svc = pagerduty.Service("svc",
            name="My Database Service",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=db_ep.id,
            alert_creation="create_alerts_and_incidents")
        num_db_triggers = pagerduty.EventOrchestrationServiceCacheVariable("num_db_triggers",
            service=svc.id,
            name="num_db_triggers",
            conditions=[{
                "expression": "event.summary matches part 'database'",
            }],
            configuration={
                "type": "trigger_event_count",
                "ttl_seconds": 60,
            })
        is_maintenance = pagerduty.EventOrchestrationServiceCacheVariable("is_maintenance",
            service=svc.id,
            name="is_maintenance",
            configuration={
                "type": "external_data",
                "data_type": "boolean",
                "ttl_seconds": 7200,
            })
        event_orchestration = pagerduty.EventOrchestrationService("event_orchestration",
            service=svc.id,
            enable_event_orchestration_for_service=True,
            sets=[{
                "id": "start",
                "rules": [
                    {
                        "label": "Suppress alerts if the service is in maintenance",
                        "conditions": [{
                            "expression": "cache_var.is_maintenance == true",
                        }],
                        "actions": {
                            "suppress": True,
                        },
                    },
                    {
                        "label": "Set severity to critical if we see at least 5 triggers on the DB within the last 1 minute",
                        "conditions": [{
                            "expression": "cache_var.num_db_triggers >= 5",
                        }],
                        "actions": {
                            "severity": "critical",
                        },
                    },
                ],
            }],
            catch_all={
                "actions": {},
            })
        ```

        ## Import

        Cache Variables can be imported using colon-separated IDs, which is the combination of the Service Event Orchestration ID followed by the Cache Variable ID, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable cache_variable PLBP09X:138ed254-3444-44ad-8cc7-701d69def439
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceCacheVariableConditionArgs', 'EventOrchestrationServiceCacheVariableConditionArgsDict']]]] conditions: Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        :param pulumi.Input[Union['EventOrchestrationServiceCacheVariableConfigurationArgs', 'EventOrchestrationServiceCacheVariableConfigurationArgsDict']] configuration: A configuration object to define what and how values will be stored in the Cache Variable.
        :param pulumi.Input[bool] disabled: Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        :param pulumi.Input[str] name: Name of the Cache Variable associated with the Service Event Orchestration.
        :param pulumi.Input[str] service: ID of the Service Event Orchestration to which this Cache Variable belongs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventOrchestrationServiceCacheVariableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) can be created on a Service Event Orchestration, in order to temporarily store event data to be referenced later within the Service Event Orchestration

        ## Example of configuring a Cache Variable for a Service Event Orchestration

        This example shows creating a service `Event Orchestration` and a `Cache Variable`. This Cache Variable will count and store the number of trigger events with 'database' in its title. Then all alerts sent to this Event Orchestration will have its severity upped to 'critical' if the count has reached at least 5 triggers within the last 1 minute.

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        database_team = pagerduty.Team("database_team", name="Database Team")
        user1 = pagerduty.User("user_1",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name",
            teams=[database_team.id])
        db_ep = pagerduty.EscalationPolicy("db_ep",
            name="Database Escalation Policy",
            num_loops=2,
            rules=[{
                "escalation_delay_in_minutes": 10,
                "targets": [{
                    "type": "user",
                    "id": user1.id,
                }],
            }])
        svc = pagerduty.Service("svc",
            name="My Database Service",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=db_ep.id,
            alert_creation="create_alerts_and_incidents")
        num_db_triggers = pagerduty.EventOrchestrationServiceCacheVariable("num_db_triggers",
            service=svc.id,
            name="num_db_triggers",
            conditions=[{
                "expression": "event.summary matches part 'database'",
            }],
            configuration={
                "type": "trigger_event_count",
                "ttl_seconds": 60,
            })
        is_maintenance = pagerduty.EventOrchestrationServiceCacheVariable("is_maintenance",
            service=svc.id,
            name="is_maintenance",
            configuration={
                "type": "external_data",
                "data_type": "boolean",
                "ttl_seconds": 7200,
            })
        event_orchestration = pagerduty.EventOrchestrationService("event_orchestration",
            service=svc.id,
            enable_event_orchestration_for_service=True,
            sets=[{
                "id": "start",
                "rules": [
                    {
                        "label": "Suppress alerts if the service is in maintenance",
                        "conditions": [{
                            "expression": "cache_var.is_maintenance == true",
                        }],
                        "actions": {
                            "suppress": True,
                        },
                    },
                    {
                        "label": "Set severity to critical if we see at least 5 triggers on the DB within the last 1 minute",
                        "conditions": [{
                            "expression": "cache_var.num_db_triggers >= 5",
                        }],
                        "actions": {
                            "severity": "critical",
                        },
                    },
                ],
            }],
            catch_all={
                "actions": {},
            })
        ```

        ## Import

        Cache Variables can be imported using colon-separated IDs, which is the combination of the Service Event Orchestration ID followed by the Cache Variable ID, e.g.

        ```sh
        $ pulumi import pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable cache_variable PLBP09X:138ed254-3444-44ad-8cc7-701d69def439
        ```

        :param str resource_name: The name of the resource.
        :param EventOrchestrationServiceCacheVariableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventOrchestrationServiceCacheVariableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 conditions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceCacheVariableConditionArgs', 'EventOrchestrationServiceCacheVariableConditionArgsDict']]]]] = None,
                 configuration: Optional[pulumi.Input[Union['EventOrchestrationServiceCacheVariableConfigurationArgs', 'EventOrchestrationServiceCacheVariableConfigurationArgsDict']]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventOrchestrationServiceCacheVariableArgs.__new__(EventOrchestrationServiceCacheVariableArgs)

            __props__.__dict__["conditions"] = conditions
            if configuration is None and not opts.urn:
                raise TypeError("Missing required property 'configuration'")
            __props__.__dict__["configuration"] = configuration
            __props__.__dict__["disabled"] = disabled
            __props__.__dict__["name"] = name
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
        super(EventOrchestrationServiceCacheVariable, __self__).__init__(
            'pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            conditions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceCacheVariableConditionArgs', 'EventOrchestrationServiceCacheVariableConditionArgsDict']]]]] = None,
            configuration: Optional[pulumi.Input[Union['EventOrchestrationServiceCacheVariableConfigurationArgs', 'EventOrchestrationServiceCacheVariableConfigurationArgsDict']]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            service: Optional[pulumi.Input[str]] = None) -> 'EventOrchestrationServiceCacheVariable':
        """
        Get an existing EventOrchestrationServiceCacheVariable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EventOrchestrationServiceCacheVariableConditionArgs', 'EventOrchestrationServiceCacheVariableConditionArgsDict']]]] conditions: Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        :param pulumi.Input[Union['EventOrchestrationServiceCacheVariableConfigurationArgs', 'EventOrchestrationServiceCacheVariableConfigurationArgsDict']] configuration: A configuration object to define what and how values will be stored in the Cache Variable.
        :param pulumi.Input[bool] disabled: Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        :param pulumi.Input[str] name: Name of the Cache Variable associated with the Service Event Orchestration.
        :param pulumi.Input[str] service: ID of the Service Event Orchestration to which this Cache Variable belongs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventOrchestrationServiceCacheVariableState.__new__(_EventOrchestrationServiceCacheVariableState)

        __props__.__dict__["conditions"] = conditions
        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["name"] = name
        __props__.__dict__["service"] = service
        return EventOrchestrationServiceCacheVariable(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def conditions(self) -> pulumi.Output[Optional[Sequence['outputs.EventOrchestrationServiceCacheVariableCondition']]]:
        """
        Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recent_value` or `trigger_event_count`.
        """
        return pulumi.get(self, "conditions")

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output['outputs.EventOrchestrationServiceCacheVariableConfiguration']:
        """
        A configuration object to define what and how values will be stored in the Cache Variable.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Cache Variable associated with the Service Event Orchestration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[str]:
        """
        ID of the Service Event Orchestration to which this Cache Variable belongs.
        """
        return pulumi.get(self, "service")

