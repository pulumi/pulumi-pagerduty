# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = [
    'GetBusinessServiceResult',
    'AwaitableGetBusinessServiceResult',
    'get_business_service',
    'get_business_service_output',
]

@pulumi.output_type
class GetBusinessServiceResult:
    """
    A collection of values returned by getBusinessService.
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
        The ID of the found business service.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The short name of the found business service.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of object. The value returned will be `business_service`. Can be used for passing to a service dependency.
        """
        return pulumi.get(self, "type")


class AwaitableGetBusinessServiceResult(GetBusinessServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBusinessServiceResult(
            id=self.id,
            name=self.name,
            type=self.type)


def get_business_service(name: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBusinessServiceResult:
    """
    Use this data source to get information about a specific [business service](https://api-reference.pagerduty.com/#!/Business_Services/get_business_services).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    example = pagerduty.get_business_service(name="My Service")
    ```


    :param str name: The business service name to use to find a business service in the PagerDuty API.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getBusinessService:getBusinessService', __args__, opts=opts, typ=GetBusinessServiceResult).value

    return AwaitableGetBusinessServiceResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'))
def get_business_service_output(name: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBusinessServiceResult]:
    """
    Use this data source to get information about a specific [business service](https://api-reference.pagerduty.com/#!/Business_Services/get_business_services).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    example = pagerduty.get_business_service(name="My Service")
    ```


    :param str name: The business service name to use to find a business service in the PagerDuty API.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('pagerduty:index/getBusinessService:getBusinessService', __args__, opts=opts, typ=GetBusinessServiceResult)
    return __ret__.apply(lambda __response__: GetBusinessServiceResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        type=pulumi.get(__response__, 'type')))
