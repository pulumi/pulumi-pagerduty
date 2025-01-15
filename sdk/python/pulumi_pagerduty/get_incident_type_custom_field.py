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
from . import outputs

__all__ = [
    'GetIncidentTypeCustomFieldResult',
    'AwaitableGetIncidentTypeCustomFieldResult',
    'get_incident_type_custom_field',
    'get_incident_type_custom_field_output',
]

@pulumi.output_type
class GetIncidentTypeCustomFieldResult:
    """
    A collection of values returned by getIncidentTypeCustomField.
    """
    def __init__(__self__, data_type=None, default_value=None, description=None, display_name=None, enabled=None, field_options=None, field_type=None, id=None, incident_type=None, name=None, self=None, summary=None, type=None):
        if data_type and not isinstance(data_type, str):
            raise TypeError("Expected argument 'data_type' to be a str")
        pulumi.set(__self__, "data_type", data_type)
        if default_value and not isinstance(default_value, str):
            raise TypeError("Expected argument 'default_value' to be a str")
        pulumi.set(__self__, "default_value", default_value)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if field_options and not isinstance(field_options, list):
            raise TypeError("Expected argument 'field_options' to be a list")
        pulumi.set(__self__, "field_options", field_options)
        if field_type and not isinstance(field_type, str):
            raise TypeError("Expected argument 'field_type' to be a str")
        pulumi.set(__self__, "field_type", field_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if incident_type and not isinstance(incident_type, str):
            raise TypeError("Expected argument 'incident_type' to be a str")
        pulumi.set(__self__, "incident_type", incident_type)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if self and not isinstance(self, str):
            raise TypeError("Expected argument 'self' to be a str")
        pulumi.set(__self__, "self", self)
        if summary and not isinstance(summary, str):
            raise TypeError("Expected argument 'summary' to be a str")
        pulumi.set(__self__, "summary", summary)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="dataType")
    def data_type(self) -> str:
        return pulumi.get(self, "data_type")

    @property
    @pulumi.getter(name="defaultValue")
    def default_value(self) -> str:
        return pulumi.get(self, "default_value")

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
    @pulumi.getter(name="fieldOptions")
    def field_options(self) -> Sequence['outputs.GetIncidentTypeCustomFieldFieldOptionResult']:
        return pulumi.get(self, "field_options")

    @property
    @pulumi.getter(name="fieldType")
    def field_type(self) -> str:
        return pulumi.get(self, "field_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="incidentType")
    def incident_type(self) -> str:
        return pulumi.get(self, "incident_type")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def self(self) -> str:
        return pulumi.get(self, "self")

    @property
    @pulumi.getter
    def summary(self) -> str:
        return pulumi.get(self, "summary")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


class AwaitableGetIncidentTypeCustomFieldResult(GetIncidentTypeCustomFieldResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIncidentTypeCustomFieldResult(
            data_type=self.data_type,
            default_value=self.default_value,
            description=self.description,
            display_name=self.display_name,
            enabled=self.enabled,
            field_options=self.field_options,
            field_type=self.field_type,
            id=self.id,
            incident_type=self.incident_type,
            name=self.name,
            self=self.self,
            summary=self.summary,
            type=self.type)


def get_incident_type_custom_field(display_name: Optional[str] = None,
                                   incident_type: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIncidentTypeCustomFieldResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['incidentType'] = incident_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getIncidentTypeCustomField:getIncidentTypeCustomField', __args__, opts=opts, typ=GetIncidentTypeCustomFieldResult).value

    return AwaitableGetIncidentTypeCustomFieldResult(
        data_type=pulumi.get(__ret__, 'data_type'),
        default_value=pulumi.get(__ret__, 'default_value'),
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        enabled=pulumi.get(__ret__, 'enabled'),
        field_options=pulumi.get(__ret__, 'field_options'),
        field_type=pulumi.get(__ret__, 'field_type'),
        id=pulumi.get(__ret__, 'id'),
        incident_type=pulumi.get(__ret__, 'incident_type'),
        name=pulumi.get(__ret__, 'name'),
        self=pulumi.get(__ret__, 'self'),
        summary=pulumi.get(__ret__, 'summary'),
        type=pulumi.get(__ret__, 'type'))
def get_incident_type_custom_field_output(display_name: Optional[pulumi.Input[str]] = None,
                                          incident_type: Optional[pulumi.Input[str]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIncidentTypeCustomFieldResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['incidentType'] = incident_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('pagerduty:index/getIncidentTypeCustomField:getIncidentTypeCustomField', __args__, opts=opts, typ=GetIncidentTypeCustomFieldResult)
    return __ret__.apply(lambda __response__: GetIncidentTypeCustomFieldResult(
        data_type=pulumi.get(__response__, 'data_type'),
        default_value=pulumi.get(__response__, 'default_value'),
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        enabled=pulumi.get(__response__, 'enabled'),
        field_options=pulumi.get(__response__, 'field_options'),
        field_type=pulumi.get(__response__, 'field_type'),
        id=pulumi.get(__response__, 'id'),
        incident_type=pulumi.get(__response__, 'incident_type'),
        name=pulumi.get(__response__, 'name'),
        self=pulumi.get(__response__, 'self'),
        summary=pulumi.get(__response__, 'summary'),
        type=pulumi.get(__response__, 'type')))
