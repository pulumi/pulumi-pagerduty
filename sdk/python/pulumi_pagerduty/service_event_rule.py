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

__all__ = ['ServiceEventRuleArgs', 'ServiceEventRule']

@pulumi.input_type
class ServiceEventRuleArgs:
    def __init__(__self__, *,
                 service: pulumi.Input[str],
                 actions: Optional[pulumi.Input['ServiceEventRuleActionsArgs']] = None,
                 conditions: Optional[pulumi.Input['ServiceEventRuleConditionsArgs']] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 time_frame: Optional[pulumi.Input['ServiceEventRuleTimeFrameArgs']] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceEventRuleVariableArgs']]]] = None):
        """
        The set of arguments for constructing a ServiceEventRule resource.
        :param pulumi.Input[str] service: The ID of the service that the rule belongs to.
        :param pulumi.Input['ServiceEventRuleActionsArgs'] actions: Actions to apply to an event if the conditions match.
        :param pulumi.Input['ServiceEventRuleConditionsArgs'] conditions: Conditions evaluated to check if an event matches this event rule.
        :param pulumi.Input[bool] disabled: Indicates whether the rule is disabled and would therefore not be evaluated.
        :param pulumi.Input[int] position: Position/index of the rule within the service.
        :param pulumi.Input['ServiceEventRuleTimeFrameArgs'] time_frame: Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        :param pulumi.Input[Sequence[pulumi.Input['ServiceEventRuleVariableArgs']]] variables: Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        pulumi.set(__self__, "service", service)
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if position is not None:
            pulumi.set(__self__, "position", position)
        if time_frame is not None:
            pulumi.set(__self__, "time_frame", time_frame)
        if variables is not None:
            pulumi.set(__self__, "variables", variables)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[str]:
        """
        The ID of the service that the rule belongs to.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input['ServiceEventRuleActionsArgs']]:
        """
        Actions to apply to an event if the conditions match.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input['ServiceEventRuleActionsArgs']]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input['ServiceEventRuleConditionsArgs']]:
        """
        Conditions evaluated to check if an event matches this event rule.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input['ServiceEventRuleConditionsArgs']]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the rule is disabled and would therefore not be evaluated.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[int]]:
        """
        Position/index of the rule within the service.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter(name="timeFrame")
    def time_frame(self) -> Optional[pulumi.Input['ServiceEventRuleTimeFrameArgs']]:
        """
        Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        """
        return pulumi.get(self, "time_frame")

    @time_frame.setter
    def time_frame(self, value: Optional[pulumi.Input['ServiceEventRuleTimeFrameArgs']]):
        pulumi.set(self, "time_frame", value)

    @property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceEventRuleVariableArgs']]]]:
        """
        Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceEventRuleVariableArgs']]]]):
        pulumi.set(self, "variables", value)


@pulumi.input_type
class _ServiceEventRuleState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input['ServiceEventRuleActionsArgs']] = None,
                 conditions: Optional[pulumi.Input['ServiceEventRuleConditionsArgs']] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 time_frame: Optional[pulumi.Input['ServiceEventRuleTimeFrameArgs']] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceEventRuleVariableArgs']]]] = None):
        """
        Input properties used for looking up and filtering ServiceEventRule resources.
        :param pulumi.Input['ServiceEventRuleActionsArgs'] actions: Actions to apply to an event if the conditions match.
        :param pulumi.Input['ServiceEventRuleConditionsArgs'] conditions: Conditions evaluated to check if an event matches this event rule.
        :param pulumi.Input[bool] disabled: Indicates whether the rule is disabled and would therefore not be evaluated.
        :param pulumi.Input[int] position: Position/index of the rule within the service.
        :param pulumi.Input[str] service: The ID of the service that the rule belongs to.
        :param pulumi.Input['ServiceEventRuleTimeFrameArgs'] time_frame: Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        :param pulumi.Input[Sequence[pulumi.Input['ServiceEventRuleVariableArgs']]] variables: Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if position is not None:
            pulumi.set(__self__, "position", position)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if time_frame is not None:
            pulumi.set(__self__, "time_frame", time_frame)
        if variables is not None:
            pulumi.set(__self__, "variables", variables)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input['ServiceEventRuleActionsArgs']]:
        """
        Actions to apply to an event if the conditions match.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input['ServiceEventRuleActionsArgs']]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input['ServiceEventRuleConditionsArgs']]:
        """
        Conditions evaluated to check if an event matches this event rule.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input['ServiceEventRuleConditionsArgs']]):
        pulumi.set(self, "conditions", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the rule is disabled and would therefore not be evaluated.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[int]]:
        """
        Position/index of the rule within the service.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the service that the rule belongs to.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter(name="timeFrame")
    def time_frame(self) -> Optional[pulumi.Input['ServiceEventRuleTimeFrameArgs']]:
        """
        Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        """
        return pulumi.get(self, "time_frame")

    @time_frame.setter
    def time_frame(self, value: Optional[pulumi.Input['ServiceEventRuleTimeFrameArgs']]):
        pulumi.set(self, "time_frame", value)

    @property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceEventRuleVariableArgs']]]]:
        """
        Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceEventRuleVariableArgs']]]]):
        pulumi.set(self, "variables", value)


class ServiceEventRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleActionsArgs']]] = None,
                 conditions: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleConditionsArgs']]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 time_frame: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleTimeFrameArgs']]] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceEventRuleVariableArgs']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.Service("example",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=pagerduty_escalation_policy["example"]["id"],
            alert_creation="create_alerts_and_incidents")
        foo = pagerduty.ServiceEventRule("foo",
            service=example.id,
            position=0,
            disabled=True,
            conditions=pagerduty.ServiceEventRuleConditionsArgs(
                operator="and",
                subconditions=[pagerduty.ServiceEventRuleConditionsSubconditionArgs(
                    operator="contains",
                    parameters=[pagerduty.ServiceEventRuleConditionsSubconditionParameterArgs(
                        value="disk space",
                        path="summary",
                    )],
                )],
            ),
            variables=[pagerduty.ServiceEventRuleVariableArgs(
                type="regex",
                name="Src",
                parameters=[pagerduty.ServiceEventRuleVariableParameterArgs(
                    value="(.*)",
                    path="source",
                )],
            )],
            actions=pagerduty.ServiceEventRuleActionsArgs(
                annotates=[pagerduty.ServiceEventRuleActionsAnnotateArgs(
                    value="From Terraform",
                )],
                extractions=[
                    pagerduty.ServiceEventRuleActionsExtractionArgs(
                        target="dedup_key",
                        source="source",
                        regex="(.*)",
                    ),
                    pagerduty.ServiceEventRuleActionsExtractionArgs(
                        target="summary",
                        template="Warning: Disk Space Low on {{Src}}",
                    ),
                ],
            ))
        bar = pagerduty.ServiceEventRule("bar",
            service=pagerduty_service["foo"]["id"],
            position=1,
            disabled=True,
            conditions=pagerduty.ServiceEventRuleConditionsArgs(
                operator="and",
                subconditions=[pagerduty.ServiceEventRuleConditionsSubconditionArgs(
                    operator="contains",
                    parameters=[pagerduty.ServiceEventRuleConditionsSubconditionParameterArgs(
                        value="cpu spike",
                        path="summary",
                    )],
                )],
            ),
            actions=pagerduty.ServiceEventRuleActionsArgs(
                annotates=[pagerduty.ServiceEventRuleActionsAnnotateArgs(
                    value="From Terraform",
                )],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Service event rules can be imported using using the related `service` id and the `service_event_rule` id separated by a dot, e.g.

        ```sh
        $ pulumi import pagerduty:index/serviceEventRule:ServiceEventRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ServiceEventRuleActionsArgs']] actions: Actions to apply to an event if the conditions match.
        :param pulumi.Input[pulumi.InputType['ServiceEventRuleConditionsArgs']] conditions: Conditions evaluated to check if an event matches this event rule.
        :param pulumi.Input[bool] disabled: Indicates whether the rule is disabled and would therefore not be evaluated.
        :param pulumi.Input[int] position: Position/index of the rule within the service.
        :param pulumi.Input[str] service: The ID of the service that the rule belongs to.
        :param pulumi.Input[pulumi.InputType['ServiceEventRuleTimeFrameArgs']] time_frame: Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceEventRuleVariableArgs']]]] variables: Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceEventRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.Service("example",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=pagerduty_escalation_policy["example"]["id"],
            alert_creation="create_alerts_and_incidents")
        foo = pagerduty.ServiceEventRule("foo",
            service=example.id,
            position=0,
            disabled=True,
            conditions=pagerduty.ServiceEventRuleConditionsArgs(
                operator="and",
                subconditions=[pagerduty.ServiceEventRuleConditionsSubconditionArgs(
                    operator="contains",
                    parameters=[pagerduty.ServiceEventRuleConditionsSubconditionParameterArgs(
                        value="disk space",
                        path="summary",
                    )],
                )],
            ),
            variables=[pagerduty.ServiceEventRuleVariableArgs(
                type="regex",
                name="Src",
                parameters=[pagerduty.ServiceEventRuleVariableParameterArgs(
                    value="(.*)",
                    path="source",
                )],
            )],
            actions=pagerduty.ServiceEventRuleActionsArgs(
                annotates=[pagerduty.ServiceEventRuleActionsAnnotateArgs(
                    value="From Terraform",
                )],
                extractions=[
                    pagerduty.ServiceEventRuleActionsExtractionArgs(
                        target="dedup_key",
                        source="source",
                        regex="(.*)",
                    ),
                    pagerduty.ServiceEventRuleActionsExtractionArgs(
                        target="summary",
                        template="Warning: Disk Space Low on {{Src}}",
                    ),
                ],
            ))
        bar = pagerduty.ServiceEventRule("bar",
            service=pagerduty_service["foo"]["id"],
            position=1,
            disabled=True,
            conditions=pagerduty.ServiceEventRuleConditionsArgs(
                operator="and",
                subconditions=[pagerduty.ServiceEventRuleConditionsSubconditionArgs(
                    operator="contains",
                    parameters=[pagerduty.ServiceEventRuleConditionsSubconditionParameterArgs(
                        value="cpu spike",
                        path="summary",
                    )],
                )],
            ),
            actions=pagerduty.ServiceEventRuleActionsArgs(
                annotates=[pagerduty.ServiceEventRuleActionsAnnotateArgs(
                    value="From Terraform",
                )],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Service event rules can be imported using using the related `service` id and the `service_event_rule` id separated by a dot, e.g.

        ```sh
        $ pulumi import pagerduty:index/serviceEventRule:ServiceEventRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
        ```

        :param str resource_name: The name of the resource.
        :param ServiceEventRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceEventRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleActionsArgs']]] = None,
                 conditions: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleConditionsArgs']]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 time_frame: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleTimeFrameArgs']]] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceEventRuleVariableArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceEventRuleArgs.__new__(ServiceEventRuleArgs)

            __props__.__dict__["actions"] = actions
            __props__.__dict__["conditions"] = conditions
            __props__.__dict__["disabled"] = disabled
            __props__.__dict__["position"] = position
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
            __props__.__dict__["time_frame"] = time_frame
            __props__.__dict__["variables"] = variables
        super(ServiceEventRule, __self__).__init__(
            'pagerduty:index/serviceEventRule:ServiceEventRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleActionsArgs']]] = None,
            conditions: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleConditionsArgs']]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            position: Optional[pulumi.Input[int]] = None,
            service: Optional[pulumi.Input[str]] = None,
            time_frame: Optional[pulumi.Input[pulumi.InputType['ServiceEventRuleTimeFrameArgs']]] = None,
            variables: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceEventRuleVariableArgs']]]]] = None) -> 'ServiceEventRule':
        """
        Get an existing ServiceEventRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ServiceEventRuleActionsArgs']] actions: Actions to apply to an event if the conditions match.
        :param pulumi.Input[pulumi.InputType['ServiceEventRuleConditionsArgs']] conditions: Conditions evaluated to check if an event matches this event rule.
        :param pulumi.Input[bool] disabled: Indicates whether the rule is disabled and would therefore not be evaluated.
        :param pulumi.Input[int] position: Position/index of the rule within the service.
        :param pulumi.Input[str] service: The ID of the service that the rule belongs to.
        :param pulumi.Input[pulumi.InputType['ServiceEventRuleTimeFrameArgs']] time_frame: Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceEventRuleVariableArgs']]]] variables: Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceEventRuleState.__new__(_ServiceEventRuleState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["conditions"] = conditions
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["position"] = position
        __props__.__dict__["service"] = service
        __props__.__dict__["time_frame"] = time_frame
        __props__.__dict__["variables"] = variables
        return ServiceEventRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Optional['outputs.ServiceEventRuleActions']]:
        """
        Actions to apply to an event if the conditions match.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def conditions(self) -> pulumi.Output[Optional['outputs.ServiceEventRuleConditions']]:
        """
        Conditions evaluated to check if an event matches this event rule.
        """
        return pulumi.get(self, "conditions")

    @property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the rule is disabled and would therefore not be evaluated.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter
    def position(self) -> pulumi.Output[Optional[int]]:
        """
        Position/index of the rule within the service.
        """
        return pulumi.get(self, "position")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[str]:
        """
        The ID of the service that the rule belongs to.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter(name="timeFrame")
    def time_frame(self) -> pulumi.Output[Optional['outputs.ServiceEventRuleTimeFrame']]:
        """
        Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        """
        return pulumi.get(self, "time_frame")

    @property
    @pulumi.getter
    def variables(self) -> pulumi.Output[Optional[Sequence['outputs.ServiceEventRuleVariable']]]:
        """
        Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        return pulumi.get(self, "variables")

