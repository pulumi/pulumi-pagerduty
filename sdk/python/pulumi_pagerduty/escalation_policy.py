# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['EscalationPolicyArgs', 'EscalationPolicy']

@pulumi.input_type
class EscalationPolicyArgs:
    def __init__(__self__, *,
                 rules: pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 num_loops: Optional[pulumi.Input[int]] = None,
                 teams: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EscalationPolicy resource.
        :param pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]] rules: An Escalation rule block. Escalation rules documented below.
        :param pulumi.Input[str] name: The name of the escalation policy.
        :param pulumi.Input[int] num_loops: The number of times the escalation policy will repeat after reaching the end of its escalation.
        :param pulumi.Input[str] teams: Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        """
        EscalationPolicyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            rules=rules,
            description=description,
            name=name,
            num_loops=num_loops,
            teams=teams,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             rules: pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             num_loops: Optional[pulumi.Input[int]] = None,
             teams: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("rules", rules)
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if num_loops is not None:
            _setter("num_loops", num_loops)
        if teams is not None:
            _setter("teams", teams)

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]]:
        """
        An Escalation rule block. Escalation rules documented below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the escalation policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="numLoops")
    def num_loops(self) -> Optional[pulumi.Input[int]]:
        """
        The number of times the escalation policy will repeat after reaching the end of its escalation.
        """
        return pulumi.get(self, "num_loops")

    @num_loops.setter
    def num_loops(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "num_loops", value)

    @property
    @pulumi.getter
    def teams(self) -> Optional[pulumi.Input[str]]:
        """
        Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        """
        return pulumi.get(self, "teams")

    @teams.setter
    def teams(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "teams", value)


@pulumi.input_type
class _EscalationPolicyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 num_loops: Optional[pulumi.Input[int]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]]] = None,
                 teams: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EscalationPolicy resources.
        :param pulumi.Input[str] name: The name of the escalation policy.
        :param pulumi.Input[int] num_loops: The number of times the escalation policy will repeat after reaching the end of its escalation.
        :param pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]] rules: An Escalation rule block. Escalation rules documented below.
        :param pulumi.Input[str] teams: Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        """
        _EscalationPolicyState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            name=name,
            num_loops=num_loops,
            rules=rules,
            teams=teams,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             num_loops: Optional[pulumi.Input[int]] = None,
             rules: Optional[pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]]] = None,
             teams: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if num_loops is not None:
            _setter("num_loops", num_loops)
        if rules is not None:
            _setter("rules", rules)
        if teams is not None:
            _setter("teams", teams)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the escalation policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="numLoops")
    def num_loops(self) -> Optional[pulumi.Input[int]]:
        """
        The number of times the escalation policy will repeat after reaching the end of its escalation.
        """
        return pulumi.get(self, "num_loops")

    @num_loops.setter
    def num_loops(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "num_loops", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]]]:
        """
        An Escalation rule block. Escalation rules documented below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def teams(self) -> Optional[pulumi.Input[str]]:
        """
        Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        """
        return pulumi.get(self, "teams")

    @teams.setter
    def teams(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "teams", value)


class EscalationPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 num_loops: Optional[pulumi.Input[int]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]]] = None,
                 teams: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        An [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNQ-create-an-escalation-policy) determines what user or schedule will be notified first, second, and so on when an incident is triggered. Escalation policies are used by one or more services.

        ## Import

        Escalation policies can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/escalationPolicy:EscalationPolicy main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the escalation policy.
        :param pulumi.Input[int] num_loops: The number of times the escalation policy will repeat after reaching the end of its escalation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]] rules: An Escalation rule block. Escalation rules documented below.
        :param pulumi.Input[str] teams: Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EscalationPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNQ-create-an-escalation-policy) determines what user or schedule will be notified first, second, and so on when an incident is triggered. Escalation policies are used by one or more services.

        ## Import

        Escalation policies can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/escalationPolicy:EscalationPolicy main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param EscalationPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EscalationPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            EscalationPolicyArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 num_loops: Optional[pulumi.Input[int]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]]] = None,
                 teams: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EscalationPolicyArgs.__new__(EscalationPolicyArgs)

            if description is None:
                description = 'Managed by Pulumi'
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["num_loops"] = num_loops
            if rules is None and not opts.urn:
                raise TypeError("Missing required property 'rules'")
            __props__.__dict__["rules"] = rules
            __props__.__dict__["teams"] = teams
        super(EscalationPolicy, __self__).__init__(
            'pagerduty:index/escalationPolicy:EscalationPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            num_loops: Optional[pulumi.Input[int]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]]] = None,
            teams: Optional[pulumi.Input[str]] = None) -> 'EscalationPolicy':
        """
        Get an existing EscalationPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the escalation policy.
        :param pulumi.Input[int] num_loops: The number of times the escalation policy will repeat after reaching the end of its escalation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]] rules: An Escalation rule block. Escalation rules documented below.
        :param pulumi.Input[str] teams: Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EscalationPolicyState.__new__(_EscalationPolicyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["num_loops"] = num_loops
        __props__.__dict__["rules"] = rules
        __props__.__dict__["teams"] = teams
        return EscalationPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the escalation policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="numLoops")
    def num_loops(self) -> pulumi.Output[Optional[int]]:
        """
        The number of times the escalation policy will repeat after reaching the end of its escalation.
        """
        return pulumi.get(self, "num_loops")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.EscalationPolicyRule']]:
        """
        An Escalation rule block. Escalation rules documented below.
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def teams(self) -> pulumi.Output[Optional[str]]:
        """
        Team associated with the policy (Only 1 team can be assigned to an Escalation Policy). Account must have the `teams` ability to use this parameter.
        """
        return pulumi.get(self, "teams")

