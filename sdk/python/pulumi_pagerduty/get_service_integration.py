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
    'GetServiceIntegrationResult',
    'AwaitableGetServiceIntegrationResult',
    'get_service_integration',
    'get_service_integration_output',
]

@pulumi.output_type
class GetServiceIntegrationResult:
    """
    A collection of values returned by getServiceIntegration.
    """
    def __init__(__self__, id=None, integration_key=None, integration_summary=None, service_name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if integration_key and not isinstance(integration_key, str):
            raise TypeError("Expected argument 'integration_key' to be a str")
        pulumi.set(__self__, "integration_key", integration_key)
        if integration_summary and not isinstance(integration_summary, str):
            raise TypeError("Expected argument 'integration_summary' to be a str")
        pulumi.set(__self__, "integration_summary", integration_summary)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> str:
        """
        The integration key for the integration. This can be used to configure alerts.
        """
        return pulumi.get(self, "integration_key")

    @property
    @pulumi.getter(name="integrationSummary")
    def integration_summary(self) -> str:
        return pulumi.get(self, "integration_summary")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> str:
        return pulumi.get(self, "service_name")


class AwaitableGetServiceIntegrationResult(GetServiceIntegrationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceIntegrationResult(
            id=self.id,
            integration_key=self.integration_key,
            integration_summary=self.integration_summary,
            service_name=self.service_name)


def get_service_integration(integration_summary: Optional[str] = None,
                            service_name: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceIntegrationResult:
    """
    Use this data source to get information about a specific service_integration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    example = pagerduty.get_service_integration(service_name="My Service",
        integration_summary="Datadog")
    ```


    :param str integration_summary: The integration summary used to find the desired integration on the service.
    :param str service_name: The service name to use to find a service in the PagerDuty API.
    """
    __args__ = dict()
    __args__['integrationSummary'] = integration_summary
    __args__['serviceName'] = service_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getServiceIntegration:getServiceIntegration', __args__, opts=opts, typ=GetServiceIntegrationResult).value

    return AwaitableGetServiceIntegrationResult(
        id=pulumi.get(__ret__, 'id'),
        integration_key=pulumi.get(__ret__, 'integration_key'),
        integration_summary=pulumi.get(__ret__, 'integration_summary'),
        service_name=pulumi.get(__ret__, 'service_name'))


@_utilities.lift_output_func(get_service_integration)
def get_service_integration_output(integration_summary: Optional[pulumi.Input[str]] = None,
                                   service_name: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceIntegrationResult]:
    """
    Use this data source to get information about a specific service_integration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    example = pagerduty.get_service_integration(service_name="My Service",
        integration_summary="Datadog")
    ```


    :param str integration_summary: The integration summary used to find the desired integration on the service.
    :param str service_name: The service name to use to find a service in the PagerDuty API.
    """
    ...
