# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['EscalationPolicy']


class EscalationPolicy(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 num_loops: Optional[pulumi.Input[float]] = None,
                 rules: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]]] = None,
                 teams: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        An [escalation policy](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Escalation_Policies/get_escalation_policies) determines what user or schedule will be notified first, second, and so on when an incident is triggered. Escalation policies are used by one or more services.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example_team = pagerduty.Team("exampleTeam", description="All engineering")
        example_user = pagerduty.User("exampleUser",
            email="125.greenholt.earline@graham.name",
            teams=[example_team.id])
        example_escalation_policy = pagerduty.EscalationPolicy("exampleEscalationPolicy",
            num_loops=2,
            rules=[pagerduty.EscalationPolicyRuleArgs(
                escalation_delay_in_minutes=10,
                targets=[pagerduty.EscalationPolicyRuleTargetArgs(
                    id=example_user.id,
                    type="user",
                )],
            )],
            teams=[example_team.id])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the escalation policy.
        :param pulumi.Input[float] num_loops: The number of times the escalation policy will repeat after reaching the end of its escalation.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]] rules: An Escalation rule block. Escalation rules documented below.
        :param pulumi.Input[List[pulumi.Input[str]]] teams: Teams associated with the policy. Account must have the `teams` ability to use this parameter.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            __props__['name'] = name
            __props__['num_loops'] = num_loops
            if rules is None:
                raise TypeError("Missing required property 'rules'")
            __props__['rules'] = rules
            __props__['teams'] = teams
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
            num_loops: Optional[pulumi.Input[float]] = None,
            rules: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]]] = None,
            teams: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None) -> 'EscalationPolicy':
        """
        Get an existing EscalationPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the escalation policy.
        :param pulumi.Input[float] num_loops: The number of times the escalation policy will repeat after reaching the end of its escalation.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]] rules: An Escalation rule block. Escalation rules documented below.
        :param pulumi.Input[List[pulumi.Input[str]]] teams: Teams associated with the policy. Account must have the `teams` ability to use this parameter.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["description"] = description
        __props__["name"] = name
        __props__["num_loops"] = num_loops
        __props__["rules"] = rules
        __props__["teams"] = teams
        return EscalationPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the escalation policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="numLoops")
    def num_loops(self) -> Optional[float]:
        """
        The number of times the escalation policy will repeat after reaching the end of its escalation.
        """
        return pulumi.get(self, "num_loops")

    @property
    @pulumi.getter
    def rules(self) -> List['outputs.EscalationPolicyRule']:
        """
        An Escalation rule block. Escalation rules documented below.
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def teams(self) -> Optional[List[str]]:
        """
        Teams associated with the policy. Account must have the `teams` ability to use this parameter.
        """
        return pulumi.get(self, "teams")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

