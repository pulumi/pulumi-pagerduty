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
    'GetIncidentTypeResult',
    'AwaitableGetIncidentTypeResult',
    'get_incident_type',
    'get_incident_type_output',
]

@pulumi.output_type
class GetIncidentTypeResult:
    """
    A collection of values returned by getIncidentType.
    """
    def __init__(__self__, description=None, display_name=None, enabled=None, id=None, name=None, parent_type=None, type=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if parent_type and not isinstance(parent_type, str):
            raise TypeError("Expected argument 'parent_type' to be a str")
        pulumi.set(__self__, "parent_type", parent_type)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="parentType")
    def parent_type(self) -> str:
        return pulumi.get(self, "parent_type")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetIncidentTypeResult(GetIncidentTypeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIncidentTypeResult(
            description=self.description,
            display_name=self.display_name,
            enabled=self.enabled,
            id=self.id,
            name=self.name,
            parent_type=self.parent_type,
            type=self.type)


def get_incident_type(display_name: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIncidentTypeResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getIncidentType:getIncidentType', __args__, opts=opts, typ=GetIncidentTypeResult).value

    return AwaitableGetIncidentTypeResult(
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        enabled=pulumi.get(__ret__, 'enabled'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        parent_type=pulumi.get(__ret__, 'parent_type'),
        type=pulumi.get(__ret__, 'type'))
def get_incident_type_output(display_name: Optional[pulumi.Input[str]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIncidentTypeResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('pagerduty:index/getIncidentType:getIncidentType', __args__, opts=opts, typ=GetIncidentTypeResult)
    return __ret__.apply(lambda __response__: GetIncidentTypeResult(
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        enabled=pulumi.get(__response__, 'enabled'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        parent_type=pulumi.get(__response__, 'parent_type'),
        type=pulumi.get(__response__, 'type')))
