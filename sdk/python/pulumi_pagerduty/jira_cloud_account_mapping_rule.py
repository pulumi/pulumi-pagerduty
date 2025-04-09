# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['JiraCloudAccountMappingRuleArgs', 'JiraCloudAccountMappingRule']

@pulumi.input_type
class JiraCloudAccountMappingRuleArgs:
    def __init__(__self__, *,
                 account_mapping: pulumi.Input[builtins.str],
                 config: Optional[pulumi.Input['JiraCloudAccountMappingRuleConfigArgs']] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a JiraCloudAccountMappingRule resource.
        :param pulumi.Input[builtins.str] account_mapping: [Updating can cause a resource replacement] The account mapping this rule belongs to.
        :param pulumi.Input['JiraCloudAccountMappingRuleConfigArgs'] config: Configuration for bidirectional synchronization between Jira issues and PagerDuty incidents.
        :param pulumi.Input[builtins.str] name: The name of the rule.
        """
        pulumi.set(__self__, "account_mapping", account_mapping)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountMapping")
    def account_mapping(self) -> pulumi.Input[builtins.str]:
        """
        [Updating can cause a resource replacement] The account mapping this rule belongs to.
        """
        return pulumi.get(self, "account_mapping")

    @account_mapping.setter
    def account_mapping(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "account_mapping", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['JiraCloudAccountMappingRuleConfigArgs']]:
        """
        Configuration for bidirectional synchronization between Jira issues and PagerDuty incidents.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['JiraCloudAccountMappingRuleConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _JiraCloudAccountMappingRuleState:
    def __init__(__self__, *,
                 account_mapping: Optional[pulumi.Input[builtins.str]] = None,
                 autocreate_jql_disabled_reason: Optional[pulumi.Input[builtins.str]] = None,
                 autocreate_jql_disabled_until: Optional[pulumi.Input[builtins.str]] = None,
                 config: Optional[pulumi.Input['JiraCloudAccountMappingRuleConfigArgs']] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering JiraCloudAccountMappingRule resources.
        :param pulumi.Input[builtins.str] account_mapping: [Updating can cause a resource replacement] The account mapping this rule belongs to.
        :param pulumi.Input[builtins.str] autocreate_jql_disabled_reason: If auto-creation using JQL is disabled, this field provides the reason for the disablement.
        :param pulumi.Input[builtins.str] autocreate_jql_disabled_until: The timestamp until which the auto-creation using JQL feature is disabled.
        :param pulumi.Input['JiraCloudAccountMappingRuleConfigArgs'] config: Configuration for bidirectional synchronization between Jira issues and PagerDuty incidents.
        :param pulumi.Input[builtins.str] name: The name of the rule.
        """
        if account_mapping is not None:
            pulumi.set(__self__, "account_mapping", account_mapping)
        if autocreate_jql_disabled_reason is not None:
            pulumi.set(__self__, "autocreate_jql_disabled_reason", autocreate_jql_disabled_reason)
        if autocreate_jql_disabled_until is not None:
            pulumi.set(__self__, "autocreate_jql_disabled_until", autocreate_jql_disabled_until)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountMapping")
    def account_mapping(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        [Updating can cause a resource replacement] The account mapping this rule belongs to.
        """
        return pulumi.get(self, "account_mapping")

    @account_mapping.setter
    def account_mapping(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_mapping", value)

    @property
    @pulumi.getter(name="autocreateJqlDisabledReason")
    def autocreate_jql_disabled_reason(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        If auto-creation using JQL is disabled, this field provides the reason for the disablement.
        """
        return pulumi.get(self, "autocreate_jql_disabled_reason")

    @autocreate_jql_disabled_reason.setter
    def autocreate_jql_disabled_reason(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "autocreate_jql_disabled_reason", value)

    @property
    @pulumi.getter(name="autocreateJqlDisabledUntil")
    def autocreate_jql_disabled_until(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The timestamp until which the auto-creation using JQL feature is disabled.
        """
        return pulumi.get(self, "autocreate_jql_disabled_until")

    @autocreate_jql_disabled_until.setter
    def autocreate_jql_disabled_until(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "autocreate_jql_disabled_until", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['JiraCloudAccountMappingRuleConfigArgs']]:
        """
        Configuration for bidirectional synchronization between Jira issues and PagerDuty incidents.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['JiraCloudAccountMappingRuleConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


class JiraCloudAccountMappingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_mapping: Optional[pulumi.Input[builtins.str]] = None,
                 config: Optional[pulumi.Input[Union['JiraCloudAccountMappingRuleConfigArgs', 'JiraCloudAccountMappingRuleConfigArgsDict']]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        An Jira Cloud's account mapping [rule](https://developer.pagerduty.com/api-reference/85dc30ba966a6-create-a-rule)
        configures the bidirectional synchronization between Jira issues and PagerDuty
        incidents.

        ## Import

        Jira Cloud account mapping rules can be imported using the `account_mapping_id` and `rule_id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/jiraCloudAccountMappingRule:JiraCloudAccountMappingRule main PLBP09X:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_mapping: [Updating can cause a resource replacement] The account mapping this rule belongs to.
        :param pulumi.Input[Union['JiraCloudAccountMappingRuleConfigArgs', 'JiraCloudAccountMappingRuleConfigArgsDict']] config: Configuration for bidirectional synchronization between Jira issues and PagerDuty incidents.
        :param pulumi.Input[builtins.str] name: The name of the rule.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: JiraCloudAccountMappingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Jira Cloud's account mapping [rule](https://developer.pagerduty.com/api-reference/85dc30ba966a6-create-a-rule)
        configures the bidirectional synchronization between Jira issues and PagerDuty
        incidents.

        ## Import

        Jira Cloud account mapping rules can be imported using the `account_mapping_id` and `rule_id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/jiraCloudAccountMappingRule:JiraCloudAccountMappingRule main PLBP09X:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param JiraCloudAccountMappingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(JiraCloudAccountMappingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_mapping: Optional[pulumi.Input[builtins.str]] = None,
                 config: Optional[pulumi.Input[Union['JiraCloudAccountMappingRuleConfigArgs', 'JiraCloudAccountMappingRuleConfigArgsDict']]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = JiraCloudAccountMappingRuleArgs.__new__(JiraCloudAccountMappingRuleArgs)

            if account_mapping is None and not opts.urn:
                raise TypeError("Missing required property 'account_mapping'")
            __props__.__dict__["account_mapping"] = account_mapping
            __props__.__dict__["config"] = config
            __props__.__dict__["name"] = name
            __props__.__dict__["autocreate_jql_disabled_reason"] = None
            __props__.__dict__["autocreate_jql_disabled_until"] = None
        super(JiraCloudAccountMappingRule, __self__).__init__(
            'pagerduty:index/jiraCloudAccountMappingRule:JiraCloudAccountMappingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_mapping: Optional[pulumi.Input[builtins.str]] = None,
            autocreate_jql_disabled_reason: Optional[pulumi.Input[builtins.str]] = None,
            autocreate_jql_disabled_until: Optional[pulumi.Input[builtins.str]] = None,
            config: Optional[pulumi.Input[Union['JiraCloudAccountMappingRuleConfigArgs', 'JiraCloudAccountMappingRuleConfigArgsDict']]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None) -> 'JiraCloudAccountMappingRule':
        """
        Get an existing JiraCloudAccountMappingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_mapping: [Updating can cause a resource replacement] The account mapping this rule belongs to.
        :param pulumi.Input[builtins.str] autocreate_jql_disabled_reason: If auto-creation using JQL is disabled, this field provides the reason for the disablement.
        :param pulumi.Input[builtins.str] autocreate_jql_disabled_until: The timestamp until which the auto-creation using JQL feature is disabled.
        :param pulumi.Input[Union['JiraCloudAccountMappingRuleConfigArgs', 'JiraCloudAccountMappingRuleConfigArgsDict']] config: Configuration for bidirectional synchronization between Jira issues and PagerDuty incidents.
        :param pulumi.Input[builtins.str] name: The name of the rule.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _JiraCloudAccountMappingRuleState.__new__(_JiraCloudAccountMappingRuleState)

        __props__.__dict__["account_mapping"] = account_mapping
        __props__.__dict__["autocreate_jql_disabled_reason"] = autocreate_jql_disabled_reason
        __props__.__dict__["autocreate_jql_disabled_until"] = autocreate_jql_disabled_until
        __props__.__dict__["config"] = config
        __props__.__dict__["name"] = name
        return JiraCloudAccountMappingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountMapping")
    def account_mapping(self) -> pulumi.Output[builtins.str]:
        """
        [Updating can cause a resource replacement] The account mapping this rule belongs to.
        """
        return pulumi.get(self, "account_mapping")

    @property
    @pulumi.getter(name="autocreateJqlDisabledReason")
    def autocreate_jql_disabled_reason(self) -> pulumi.Output[builtins.str]:
        """
        If auto-creation using JQL is disabled, this field provides the reason for the disablement.
        """
        return pulumi.get(self, "autocreate_jql_disabled_reason")

    @property
    @pulumi.getter(name="autocreateJqlDisabledUntil")
    def autocreate_jql_disabled_until(self) -> pulumi.Output[builtins.str]:
        """
        The timestamp until which the auto-creation using JQL feature is disabled.
        """
        return pulumi.get(self, "autocreate_jql_disabled_until")

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Optional['outputs.JiraCloudAccountMappingRuleConfig']]:
        """
        Configuration for bidirectional synchronization between Jira issues and PagerDuty incidents.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "name")

