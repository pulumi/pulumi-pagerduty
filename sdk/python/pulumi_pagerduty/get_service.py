# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetServiceResult',
    'AwaitableGetServiceResult',
    'get_service',
    'get_service_output',
]

@pulumi.output_type
class GetServiceResult:
    """
    A collection of values returned by getService.
    """
    def __init__(__self__, id=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

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
        The short name of the found service.
        """
        return pulumi.get(self, "name")


class AwaitableGetServiceResult(GetServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceResult(
            id=self.id,
            name=self.name)


def get_service(name: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceResult:
    """
    Use this data source to get information about a specific [service](https://api-reference.pagerduty.com/#!/Services/get_services).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    example_service = pagerduty.get_service(name="My Service")
    datadog = pagerduty.get_vendor(name="Datadog")
    example_service_integration = pagerduty.ServiceIntegration("exampleServiceIntegration",
        vendor=datadog.id,
        service=example_service.id,
        type="generic_events_api_inbound_integration")
    ```


    :param str name: The service name to use to find a service in the PagerDuty API.
    """
    __args__ = dict()
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getService:getService', __args__, opts=opts, typ=GetServiceResult).value

    return AwaitableGetServiceResult(
        id=__ret__.id,
        name=__ret__.name)


@_utilities.lift_output_func(get_service)
def get_service_output(name: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceResult]:
    """
    Use this data source to get information about a specific [service](https://api-reference.pagerduty.com/#!/Services/get_services).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    example_service = pagerduty.get_service(name="My Service")
    datadog = pagerduty.get_vendor(name="Datadog")
    example_service_integration = pagerduty.ServiceIntegration("exampleServiceIntegration",
        vendor=datadog.id,
        service=example_service.id,
        type="generic_events_api_inbound_integration")
    ```


    :param str name: The service name to use to find a service in the PagerDuty API.
    """
    ...
