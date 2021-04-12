# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables
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
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a EscalationPolicy resource.
        :param pulumi.Input[Sequence[pulumi.Input['EscalationPolicyRuleArgs']]] rules: An Escalation rule block. Escalation rules documented below.
        :param pulumi.Input[str] name: The name of the escalation policy.
        :param pulumi.Input[int] num_loops: The number of times the escalation policy will repeat after reaching the end of its escalation.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: Teams associated with the policy. Account must have the `teams` ability to use this parameter.
        """
        pulumi.set(__self__, "rules", rules)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if num_loops is not None:
            pulumi.set(__self__, "num_loops", num_loops)
        if teams is not None:
            pulumi.set(__self__, "teams", teams)

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
    def teams(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Teams associated with the policy. Account must have the `teams` ability to use this parameter.
        """
        return pulumi.get(self, "teams")

    @teams.setter
    def teams(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
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
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
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
            teams=[example_team.id],
            rules=[pagerduty.EscalationPolicyRuleArgs(
                escalation_delay_in_minutes=10,
                targets=[
                    pagerduty.EscalationPolicyRuleTargetArgs(
                        type="user",
                        id=example_user.id,
                    ),
                    pagerduty.EscalationPolicyRuleTargetArgs(
                        type="user",
                        id=pagerduty_user["example2"]["id"],
                    ),
                ],
            )])
        ```

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
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: Teams associated with the policy. Account must have the `teams` ability to use this parameter.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EscalationPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
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
            teams=[example_team.id],
            rules=[pagerduty.EscalationPolicyRuleArgs(
                escalation_delay_in_minutes=10,
                targets=[
                    pagerduty.EscalationPolicyRuleTargetArgs(
                        type="user",
                        id=example_user.id,
                    ),
                    pagerduty.EscalationPolicyRuleTargetArgs(
                        type="user",
                        id=pagerduty_user["example2"]["id"],
                    ),
                ],
            )])
        ```

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
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 num_loops: Optional[pulumi.Input[int]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]]] = None,
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            if rules is None and not opts.urn:
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
            num_loops: Optional[pulumi.Input[int]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]]] = None,
            teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'EscalationPolicy':
        """
        Get an existing EscalationPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the escalation policy.
        :param pulumi.Input[int] num_loops: The number of times the escalation policy will repeat after reaching the end of its escalation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EscalationPolicyRuleArgs']]]] rules: An Escalation rule block. Escalation rules documented below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: Teams associated with the policy. Account must have the `teams` ability to use this parameter.
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
    def description(self) -> pulumi.Output[Optional[str]]:
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
    def teams(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Teams associated with the policy. Account must have the `teams` ability to use this parameter.
        """
        return pulumi.get(self, "teams")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

