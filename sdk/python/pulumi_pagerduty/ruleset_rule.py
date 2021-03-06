# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RulesetRuleArgs', 'RulesetRule']

@pulumi.input_type
class RulesetRuleArgs:
    def __init__(__self__, *,
                 ruleset: pulumi.Input[str],
                 actions: Optional[pulumi.Input['RulesetRuleActionsArgs']] = None,
                 conditions: Optional[pulumi.Input['RulesetRuleConditionsArgs']] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 time_frame: Optional[pulumi.Input['RulesetRuleTimeFrameArgs']] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleVariableArgs']]]] = None):
        """
        The set of arguments for constructing a RulesetRule resource.
        :param pulumi.Input[str] ruleset: The ID of the ruleset that the rule belongs to.
        :param pulumi.Input['RulesetRuleActionsArgs'] actions: Actions to apply to an event if the conditions match.
        :param pulumi.Input['RulesetRuleConditionsArgs'] conditions: Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
        :param pulumi.Input[bool] disabled: Indicates whether the rule is disabled and would therefore not be evaluated.
        :param pulumi.Input[int] position: Position/index of the rule within the ruleset.
        :param pulumi.Input['RulesetRuleTimeFrameArgs'] time_frame: Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        :param pulumi.Input[Sequence[pulumi.Input['RulesetRuleVariableArgs']]] variables: Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        pulumi.set(__self__, "ruleset", ruleset)
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
    def ruleset(self) -> pulumi.Input[str]:
        """
        The ID of the ruleset that the rule belongs to.
        """
        return pulumi.get(self, "ruleset")

    @ruleset.setter
    def ruleset(self, value: pulumi.Input[str]):
        pulumi.set(self, "ruleset", value)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input['RulesetRuleActionsArgs']]:
        """
        Actions to apply to an event if the conditions match.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input['RulesetRuleActionsArgs']]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input['RulesetRuleConditionsArgs']]:
        """
        Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input['RulesetRuleConditionsArgs']]):
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
        Position/index of the rule within the ruleset.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter(name="timeFrame")
    def time_frame(self) -> Optional[pulumi.Input['RulesetRuleTimeFrameArgs']]:
        """
        Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        """
        return pulumi.get(self, "time_frame")

    @time_frame.setter
    def time_frame(self, value: Optional[pulumi.Input['RulesetRuleTimeFrameArgs']]):
        pulumi.set(self, "time_frame", value)

    @property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleVariableArgs']]]]:
        """
        Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleVariableArgs']]]]):
        pulumi.set(self, "variables", value)


@pulumi.input_type
class _RulesetRuleState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input['RulesetRuleActionsArgs']] = None,
                 conditions: Optional[pulumi.Input['RulesetRuleConditionsArgs']] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 ruleset: Optional[pulumi.Input[str]] = None,
                 time_frame: Optional[pulumi.Input['RulesetRuleTimeFrameArgs']] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleVariableArgs']]]] = None):
        """
        Input properties used for looking up and filtering RulesetRule resources.
        :param pulumi.Input['RulesetRuleActionsArgs'] actions: Actions to apply to an event if the conditions match.
        :param pulumi.Input['RulesetRuleConditionsArgs'] conditions: Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
        :param pulumi.Input[bool] disabled: Indicates whether the rule is disabled and would therefore not be evaluated.
        :param pulumi.Input[int] position: Position/index of the rule within the ruleset.
        :param pulumi.Input[str] ruleset: The ID of the ruleset that the rule belongs to.
        :param pulumi.Input['RulesetRuleTimeFrameArgs'] time_frame: Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        :param pulumi.Input[Sequence[pulumi.Input['RulesetRuleVariableArgs']]] variables: Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if position is not None:
            pulumi.set(__self__, "position", position)
        if ruleset is not None:
            pulumi.set(__self__, "ruleset", ruleset)
        if time_frame is not None:
            pulumi.set(__self__, "time_frame", time_frame)
        if variables is not None:
            pulumi.set(__self__, "variables", variables)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input['RulesetRuleActionsArgs']]:
        """
        Actions to apply to an event if the conditions match.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input['RulesetRuleActionsArgs']]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input['RulesetRuleConditionsArgs']]:
        """
        Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input['RulesetRuleConditionsArgs']]):
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
        Position/index of the rule within the ruleset.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter
    def ruleset(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the ruleset that the rule belongs to.
        """
        return pulumi.get(self, "ruleset")

    @ruleset.setter
    def ruleset(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ruleset", value)

    @property
    @pulumi.getter(name="timeFrame")
    def time_frame(self) -> Optional[pulumi.Input['RulesetRuleTimeFrameArgs']]:
        """
        Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        """
        return pulumi.get(self, "time_frame")

    @time_frame.setter
    def time_frame(self, value: Optional[pulumi.Input['RulesetRuleTimeFrameArgs']]):
        pulumi.set(self, "time_frame", value)

    @property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleVariableArgs']]]]:
        """
        Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleVariableArgs']]]]):
        pulumi.set(self, "variables", value)


class RulesetRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[pulumi.InputType['RulesetRuleActionsArgs']]] = None,
                 conditions: Optional[pulumi.Input[pulumi.InputType['RulesetRuleConditionsArgs']]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 ruleset: Optional[pulumi.Input[str]] = None,
                 time_frame: Optional[pulumi.Input[pulumi.InputType['RulesetRuleTimeFrameArgs']]] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleVariableArgs']]]]] = None,
                 __props__=None):
        """
        An [event rule](https://support.pagerduty.com/docs/rulesets#section-create-event-rules) allows you to set actions that should be taken on events that meet your designated rule criteria.

        ## Import

        Ruleset rules can be imported using using the related `ruleset` id and the `ruleset_rule` id separated by a dot, e.g.

        ```sh
         $ pulumi import pagerduty:index/rulesetRule:RulesetRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RulesetRuleActionsArgs']] actions: Actions to apply to an event if the conditions match.
        :param pulumi.Input[pulumi.InputType['RulesetRuleConditionsArgs']] conditions: Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
        :param pulumi.Input[bool] disabled: Indicates whether the rule is disabled and would therefore not be evaluated.
        :param pulumi.Input[int] position: Position/index of the rule within the ruleset.
        :param pulumi.Input[str] ruleset: The ID of the ruleset that the rule belongs to.
        :param pulumi.Input[pulumi.InputType['RulesetRuleTimeFrameArgs']] time_frame: Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleVariableArgs']]]] variables: Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RulesetRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An [event rule](https://support.pagerduty.com/docs/rulesets#section-create-event-rules) allows you to set actions that should be taken on events that meet your designated rule criteria.

        ## Import

        Ruleset rules can be imported using using the related `ruleset` id and the `ruleset_rule` id separated by a dot, e.g.

        ```sh
         $ pulumi import pagerduty:index/rulesetRule:RulesetRule main a19cdca1-3d5e-4b52-bfea-8c8de04da243.19acac92-027a-4ea0-b06c-bbf516519601
        ```

        :param str resource_name: The name of the resource.
        :param RulesetRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RulesetRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[pulumi.InputType['RulesetRuleActionsArgs']]] = None,
                 conditions: Optional[pulumi.Input[pulumi.InputType['RulesetRuleConditionsArgs']]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 ruleset: Optional[pulumi.Input[str]] = None,
                 time_frame: Optional[pulumi.Input[pulumi.InputType['RulesetRuleTimeFrameArgs']]] = None,
                 variables: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleVariableArgs']]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RulesetRuleArgs.__new__(RulesetRuleArgs)

            __props__.__dict__["actions"] = actions
            __props__.__dict__["conditions"] = conditions
            __props__.__dict__["disabled"] = disabled
            __props__.__dict__["position"] = position
            if ruleset is None and not opts.urn:
                raise TypeError("Missing required property 'ruleset'")
            __props__.__dict__["ruleset"] = ruleset
            __props__.__dict__["time_frame"] = time_frame
            __props__.__dict__["variables"] = variables
        super(RulesetRule, __self__).__init__(
            'pagerduty:index/rulesetRule:RulesetRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[pulumi.InputType['RulesetRuleActionsArgs']]] = None,
            conditions: Optional[pulumi.Input[pulumi.InputType['RulesetRuleConditionsArgs']]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            position: Optional[pulumi.Input[int]] = None,
            ruleset: Optional[pulumi.Input[str]] = None,
            time_frame: Optional[pulumi.Input[pulumi.InputType['RulesetRuleTimeFrameArgs']]] = None,
            variables: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleVariableArgs']]]]] = None) -> 'RulesetRule':
        """
        Get an existing RulesetRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RulesetRuleActionsArgs']] actions: Actions to apply to an event if the conditions match.
        :param pulumi.Input[pulumi.InputType['RulesetRuleConditionsArgs']] conditions: Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
        :param pulumi.Input[bool] disabled: Indicates whether the rule is disabled and would therefore not be evaluated.
        :param pulumi.Input[int] position: Position/index of the rule within the ruleset.
        :param pulumi.Input[str] ruleset: The ID of the ruleset that the rule belongs to.
        :param pulumi.Input[pulumi.InputType['RulesetRuleTimeFrameArgs']] time_frame: Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleVariableArgs']]]] variables: Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RulesetRuleState.__new__(_RulesetRuleState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["conditions"] = conditions
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["position"] = position
        __props__.__dict__["ruleset"] = ruleset
        __props__.__dict__["time_frame"] = time_frame
        __props__.__dict__["variables"] = variables
        return RulesetRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Optional['outputs.RulesetRuleActions']]:
        """
        Actions to apply to an event if the conditions match.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def conditions(self) -> pulumi.Output[Optional['outputs.RulesetRuleConditions']]:
        """
        Conditions evaluated to check if an event matches this event rule. Is always empty for the catch all rule, though.
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
        Position/index of the rule within the ruleset.
        """
        return pulumi.get(self, "position")

    @property
    @pulumi.getter
    def ruleset(self) -> pulumi.Output[str]:
        """
        The ID of the ruleset that the rule belongs to.
        """
        return pulumi.get(self, "ruleset")

    @property
    @pulumi.getter(name="timeFrame")
    def time_frame(self) -> pulumi.Output[Optional['outputs.RulesetRuleTimeFrame']]:
        """
        Settings for [scheduling the rule](https://support.pagerduty.com/docs/rulesets#section-scheduled-event-rules).
        """
        return pulumi.get(self, "time_frame")

    @property
    @pulumi.getter
    def variables(self) -> pulumi.Output[Optional[Sequence['outputs.RulesetRuleVariable']]]:
        """
        Populate variables from event payloads and use those variables in other event actions. *NOTE: A rule can have multiple `variable` objects.*
        """
        return pulumi.get(self, "variables")

