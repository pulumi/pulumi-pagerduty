# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetExtensionSchemaResult',
    'AwaitableGetExtensionSchemaResult',
    'get_extension_schema',
    'get_extension_schema_output',
]

@pulumi.output_type
class GetExtensionSchemaResult:
    """
    A collection of values returned by getExtensionSchema.
    """
    def __init__(__self__, id=None, name=None, type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The short name of the found extension vendor.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The generic service type for this extension vendor.
        """
        return pulumi.get(self, "type")


class AwaitableGetExtensionSchemaResult(GetExtensionSchemaResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetExtensionSchemaResult(
            id=self.id,
            name=self.name,
            type=self.type)


def get_extension_schema(name: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetExtensionSchemaResult:
    """
    Use this data source to get information about a specific [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMA-list-extension-schemas) vendor that you can use for a service (e.g: Slack, Generic Webhook, ServiceNow).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    webhook = pagerduty.get_extension_schema(name="Generic V2 Webhook")
    example = pagerduty.User("example",
        name="Howard James",
        email="howard.james@example.domain",
        teams=[example_pagerduty_team["id"]])
    foo = pagerduty.EscalationPolicy("foo",
        name="Engineering Escalation Policy",
        num_loops=2,
        rules=[pagerduty.EscalationPolicyRuleArgs(
            escalation_delay_in_minutes=10,
            targets=[pagerduty.EscalationPolicyRuleTargetArgs(
                type="user",
                id=example.id,
            )],
        )])
    example_service = pagerduty.Service("example",
        name="My Web App",
        auto_resolve_timeout="14400",
        acknowledgement_timeout="600",
        escalation_policy=example_pagerduty_escalation_policy["id"])
    slack = pagerduty.Extension("slack",
        name="My Web App Extension",
        endpoint_url="https://generic_webhook_url/XXXXXX/BBBBBB",
        extension_schema=webhook.id,
        extension_objects=[example_service.id])
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The extension name to use to find an extension vendor in the PagerDuty API.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getExtensionSchema:getExtensionSchema', __args__, opts=opts, typ=GetExtensionSchemaResult).value

    return AwaitableGetExtensionSchemaResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_extension_schema)
def get_extension_schema_output(name: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetExtensionSchemaResult]:
    """
    Use this data source to get information about a specific [extension](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEzMA-list-extension-schemas) vendor that you can use for a service (e.g: Slack, Generic Webhook, ServiceNow).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    webhook = pagerduty.get_extension_schema(name="Generic V2 Webhook")
    example = pagerduty.User("example",
        name="Howard James",
        email="howard.james@example.domain",
        teams=[example_pagerduty_team["id"]])
    foo = pagerduty.EscalationPolicy("foo",
        name="Engineering Escalation Policy",
        num_loops=2,
        rules=[pagerduty.EscalationPolicyRuleArgs(
            escalation_delay_in_minutes=10,
            targets=[pagerduty.EscalationPolicyRuleTargetArgs(
                type="user",
                id=example.id,
            )],
        )])
    example_service = pagerduty.Service("example",
        name="My Web App",
        auto_resolve_timeout="14400",
        acknowledgement_timeout="600",
        escalation_policy=example_pagerduty_escalation_policy["id"])
    slack = pagerduty.Extension("slack",
        name="My Web App Extension",
        endpoint_url="https://generic_webhook_url/XXXXXX/BBBBBB",
        extension_schema=webhook.id,
        extension_objects=[example_service.id])
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The extension name to use to find an extension vendor in the PagerDuty API.
    """
    ...
