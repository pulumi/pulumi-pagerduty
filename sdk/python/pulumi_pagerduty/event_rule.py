# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['EventRuleArgs', 'EventRule']

@pulumi.input_type
class EventRuleArgs:
    def __init__(__self__, *,
                 action_json: pulumi.Input[str],
                 condition_json: pulumi.Input[str],
                 advanced_condition_json: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EventRule resource.
        :param pulumi.Input[str] action_json: A list of one or more actions for each rule. Each action within the list is itself a list.
        :param pulumi.Input[str] condition_json: Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        :param pulumi.Input[str] advanced_condition_json: Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        """
        EventRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            action_json=action_json,
            condition_json=condition_json,
            advanced_condition_json=advanced_condition_json,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             action_json: Optional[pulumi.Input[str]] = None,
             condition_json: Optional[pulumi.Input[str]] = None,
             advanced_condition_json: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if action_json is None and 'actionJson' in kwargs:
            action_json = kwargs['actionJson']
        if action_json is None:
            raise TypeError("Missing 'action_json' argument")
        if condition_json is None and 'conditionJson' in kwargs:
            condition_json = kwargs['conditionJson']
        if condition_json is None:
            raise TypeError("Missing 'condition_json' argument")
        if advanced_condition_json is None and 'advancedConditionJson' in kwargs:
            advanced_condition_json = kwargs['advancedConditionJson']

        _setter("action_json", action_json)
        _setter("condition_json", condition_json)
        if advanced_condition_json is not None:
            _setter("advanced_condition_json", advanced_condition_json)

    @property
    @pulumi.getter(name="actionJson")
    def action_json(self) -> pulumi.Input[str]:
        """
        A list of one or more actions for each rule. Each action within the list is itself a list.
        """
        return pulumi.get(self, "action_json")

    @action_json.setter
    def action_json(self, value: pulumi.Input[str]):
        pulumi.set(self, "action_json", value)

    @property
    @pulumi.getter(name="conditionJson")
    def condition_json(self) -> pulumi.Input[str]:
        """
        Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        """
        return pulumi.get(self, "condition_json")

    @condition_json.setter
    def condition_json(self, value: pulumi.Input[str]):
        pulumi.set(self, "condition_json", value)

    @property
    @pulumi.getter(name="advancedConditionJson")
    def advanced_condition_json(self) -> Optional[pulumi.Input[str]]:
        """
        Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        """
        return pulumi.get(self, "advanced_condition_json")

    @advanced_condition_json.setter
    def advanced_condition_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "advanced_condition_json", value)


@pulumi.input_type
class _EventRuleState:
    def __init__(__self__, *,
                 action_json: Optional[pulumi.Input[str]] = None,
                 advanced_condition_json: Optional[pulumi.Input[str]] = None,
                 catch_all: Optional[pulumi.Input[bool]] = None,
                 condition_json: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EventRule resources.
        :param pulumi.Input[str] action_json: A list of one or more actions for each rule. Each action within the list is itself a list.
        :param pulumi.Input[str] advanced_condition_json: Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        :param pulumi.Input[bool] catch_all: A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
        :param pulumi.Input[str] condition_json: Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        """
        _EventRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            action_json=action_json,
            advanced_condition_json=advanced_condition_json,
            catch_all=catch_all,
            condition_json=condition_json,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             action_json: Optional[pulumi.Input[str]] = None,
             advanced_condition_json: Optional[pulumi.Input[str]] = None,
             catch_all: Optional[pulumi.Input[bool]] = None,
             condition_json: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if action_json is None and 'actionJson' in kwargs:
            action_json = kwargs['actionJson']
        if advanced_condition_json is None and 'advancedConditionJson' in kwargs:
            advanced_condition_json = kwargs['advancedConditionJson']
        if catch_all is None and 'catchAll' in kwargs:
            catch_all = kwargs['catchAll']
        if condition_json is None and 'conditionJson' in kwargs:
            condition_json = kwargs['conditionJson']

        if action_json is not None:
            _setter("action_json", action_json)
        if advanced_condition_json is not None:
            _setter("advanced_condition_json", advanced_condition_json)
        if catch_all is not None:
            _setter("catch_all", catch_all)
        if condition_json is not None:
            _setter("condition_json", condition_json)

    @property
    @pulumi.getter(name="actionJson")
    def action_json(self) -> Optional[pulumi.Input[str]]:
        """
        A list of one or more actions for each rule. Each action within the list is itself a list.
        """
        return pulumi.get(self, "action_json")

    @action_json.setter
    def action_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action_json", value)

    @property
    @pulumi.getter(name="advancedConditionJson")
    def advanced_condition_json(self) -> Optional[pulumi.Input[str]]:
        """
        Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        """
        return pulumi.get(self, "advanced_condition_json")

    @advanced_condition_json.setter
    def advanced_condition_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "advanced_condition_json", value)

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
        """
        return pulumi.get(self, "catch_all")

    @catch_all.setter
    def catch_all(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "catch_all", value)

    @property
    @pulumi.getter(name="conditionJson")
    def condition_json(self) -> Optional[pulumi.Input[str]]:
        """
        Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        """
        return pulumi.get(self, "condition_json")

    @condition_json.setter
    def condition_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "condition_json", value)


class EventRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_json: Optional[pulumi.Input[str]] = None,
                 advanced_condition_json: Optional[pulumi.Input[str]] = None,
                 condition_json: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        *NOTE: The `EventRule` resource has been deprecated in favor of the Ruleset and RulesetRule resources. Please use the `ruleset` based resources for working with Event Rules.*

        An [event rule](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/) determines what happens to an event that is sent to PagerDuty by monitoring tools and other integrations.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_pagerduty as pagerduty

        second = pagerduty.EventRule("second",
            action_json=json.dumps([
                [
                    "route",
                    "P5DTL0K",
                ],
                [
                    "severity",
                    "warning",
                ],
                [
                    "annotate",
                    "2 Managed by terraform",
                ],
                [
                    "priority",
                    "PL451DT",
                ],
            ]),
            condition_json=json.dumps([
                "and",
                [
                    "contains",
                    [
                        "path",
                        "payload",
                        "source",
                    ],
                    "website",
                ],
                [
                    "contains",
                    [
                        "path",
                        "headers",
                        "from",
                        "0",
                        "address",
                    ],
                    "homer",
                ],
            ]),
            advanced_condition_json=json.dumps([[
                "scheduled-weekly",
                1565392127032,
                3600000,
                "America/Los_Angeles",
                [
                    1,
                    2,
                    3,
                    5,
                    7,
                ],
            ]]))
        third = pagerduty.EventRule("third",
            action_json=json.dumps([
                [
                    "route",
                    "P5DTL0K",
                ],
                [
                    "severity",
                    "warning",
                ],
                [
                    "annotate",
                    "3 Managed by terraform",
                ],
                [
                    "priority",
                    "PL451DT",
                ],
            ]),
            condition_json=json.dumps([
                "and",
                [
                    "contains",
                    [
                        "path",
                        "payload",
                        "source",
                    ],
                    "website",
                ],
                [
                    "contains",
                    [
                        "path",
                        "headers",
                        "from",
                        "0",
                        "address",
                    ],
                    "homer",
                ],
            ]),
            opts=pulumi.ResourceOptions(depends_on=[pagerduty_event_rule["two"]]))
        ```

        ## Import

        Event rules can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/eventRule:EventRule main 19acac92-027a-4ea0-b06c-bbf516519601
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_json: A list of one or more actions for each rule. Each action within the list is itself a list.
        :param pulumi.Input[str] advanced_condition_json: Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        :param pulumi.Input[str] condition_json: Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        *NOTE: The `EventRule` resource has been deprecated in favor of the Ruleset and RulesetRule resources. Please use the `ruleset` based resources for working with Event Rules.*

        An [event rule](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/) determines what happens to an event that is sent to PagerDuty by monitoring tools and other integrations.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_pagerduty as pagerduty

        second = pagerduty.EventRule("second",
            action_json=json.dumps([
                [
                    "route",
                    "P5DTL0K",
                ],
                [
                    "severity",
                    "warning",
                ],
                [
                    "annotate",
                    "2 Managed by terraform",
                ],
                [
                    "priority",
                    "PL451DT",
                ],
            ]),
            condition_json=json.dumps([
                "and",
                [
                    "contains",
                    [
                        "path",
                        "payload",
                        "source",
                    ],
                    "website",
                ],
                [
                    "contains",
                    [
                        "path",
                        "headers",
                        "from",
                        "0",
                        "address",
                    ],
                    "homer",
                ],
            ]),
            advanced_condition_json=json.dumps([[
                "scheduled-weekly",
                1565392127032,
                3600000,
                "America/Los_Angeles",
                [
                    1,
                    2,
                    3,
                    5,
                    7,
                ],
            ]]))
        third = pagerduty.EventRule("third",
            action_json=json.dumps([
                [
                    "route",
                    "P5DTL0K",
                ],
                [
                    "severity",
                    "warning",
                ],
                [
                    "annotate",
                    "3 Managed by terraform",
                ],
                [
                    "priority",
                    "PL451DT",
                ],
            ]),
            condition_json=json.dumps([
                "and",
                [
                    "contains",
                    [
                        "path",
                        "payload",
                        "source",
                    ],
                    "website",
                ],
                [
                    "contains",
                    [
                        "path",
                        "headers",
                        "from",
                        "0",
                        "address",
                    ],
                    "homer",
                ],
            ]),
            opts=pulumi.ResourceOptions(depends_on=[pagerduty_event_rule["two"]]))
        ```

        ## Import

        Event rules can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/eventRule:EventRule main 19acac92-027a-4ea0-b06c-bbf516519601
        ```

        :param str resource_name: The name of the resource.
        :param EventRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            EventRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_json: Optional[pulumi.Input[str]] = None,
                 advanced_condition_json: Optional[pulumi.Input[str]] = None,
                 condition_json: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventRuleArgs.__new__(EventRuleArgs)

            if action_json is None and not opts.urn:
                raise TypeError("Missing required property 'action_json'")
            __props__.__dict__["action_json"] = action_json
            __props__.__dict__["advanced_condition_json"] = advanced_condition_json
            if condition_json is None and not opts.urn:
                raise TypeError("Missing required property 'condition_json'")
            __props__.__dict__["condition_json"] = condition_json
            __props__.__dict__["catch_all"] = None
        super(EventRule, __self__).__init__(
            'pagerduty:index/eventRule:EventRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action_json: Optional[pulumi.Input[str]] = None,
            advanced_condition_json: Optional[pulumi.Input[str]] = None,
            catch_all: Optional[pulumi.Input[bool]] = None,
            condition_json: Optional[pulumi.Input[str]] = None) -> 'EventRule':
        """
        Get an existing EventRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_json: A list of one or more actions for each rule. Each action within the list is itself a list.
        :param pulumi.Input[str] advanced_condition_json: Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        :param pulumi.Input[bool] catch_all: A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
        :param pulumi.Input[str] condition_json: Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventRuleState.__new__(_EventRuleState)

        __props__.__dict__["action_json"] = action_json
        __props__.__dict__["advanced_condition_json"] = advanced_condition_json
        __props__.__dict__["catch_all"] = catch_all
        __props__.__dict__["condition_json"] = condition_json
        return EventRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="actionJson")
    def action_json(self) -> pulumi.Output[str]:
        """
        A list of one or more actions for each rule. Each action within the list is itself a list.
        """
        return pulumi.get(self, "action_json")

    @property
    @pulumi.getter(name="advancedConditionJson")
    def advanced_condition_json(self) -> pulumi.Output[Optional[str]]:
        """
        Contains a list of specific conditions including `active-between`,`scheduled-weekly`, and `frequency-over`. The first element in the list is the label for the condition, followed by a list of values for the specific condition. For more details on these conditions see [Advanced Condition](https://developer.pagerduty.com/docs/rest-api-v2/global-event-rules-api/#advanced-condition-parameter) in the PagerDuty API documentation.
        """
        return pulumi.get(self, "advanced_condition_json")

    @property
    @pulumi.getter(name="catchAll")
    def catch_all(self) -> pulumi.Output[bool]:
        """
        A boolean that indicates whether the rule is a catch-all for the account. This field is read-only through the PagerDuty API.
        """
        return pulumi.get(self, "catch_all")

    @property
    @pulumi.getter(name="conditionJson")
    def condition_json(self) -> pulumi.Output[str]:
        """
        Contains a list of conditions. The first field in the list is `and` or `or`, followed by a list of operators and values.
        """
        return pulumi.get(self, "condition_json")

