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

__all__ = [
    'GetIncidentCustomFieldResult',
    'AwaitableGetIncidentCustomFieldResult',
    'get_incident_custom_field',
    'get_incident_custom_field_output',
]

@pulumi.output_type
class GetIncidentCustomFieldResult:
    """
    A collection of values returned by getIncidentCustomField.
    """
    def __init__(__self__, data_type=None, description=None, display_name=None, field_type=None, id=None, name=None):
        if data_type and not isinstance(data_type, str):
            raise TypeError("Expected argument 'data_type' to be a str")
        pulumi.set(__self__, "data_type", data_type)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if field_type and not isinstance(field_type, str):
            raise TypeError("Expected argument 'field_type' to be a str")
        pulumi.set(__self__, "field_type", field_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="dataType")
    def data_type(self) -> builtins.str:
        return pulumi.get(self, "data_type")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> builtins.str:
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="fieldType")
    def field_type(self) -> builtins.str:
        return pulumi.get(self, "field_type")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        return pulumi.get(self, "name")


class AwaitableGetIncidentCustomFieldResult(GetIncidentCustomFieldResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIncidentCustomFieldResult(
            data_type=self.data_type,
            description=self.description,
            display_name=self.display_name,
            field_type=self.field_type,
            id=self.id,
            name=self.name)


def get_incident_custom_field(name: Optional[builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIncidentCustomFieldResult:
    """
    Use this data source to get information about a specific [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    environment = pagerduty.get_incident_custom_field(name="environment")
    dev_environment = pagerduty.IncidentCustomFieldOption("dev_environment",
        field=environment.id,
        datatype="string",
        value="dev")
    ```


    :param builtins.str name: The name of the field.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getIncidentCustomField:getIncidentCustomField', __args__, opts=opts, typ=GetIncidentCustomFieldResult).value

    return AwaitableGetIncidentCustomFieldResult(
        data_type=pulumi.get(__ret__, 'data_type'),
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        field_type=pulumi.get(__ret__, 'field_type'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))
def get_incident_custom_field_output(name: Optional[pulumi.Input[builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIncidentCustomFieldResult]:
    """
    Use this data source to get information about a specific [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    environment = pagerduty.get_incident_custom_field(name="environment")
    dev_environment = pagerduty.IncidentCustomFieldOption("dev_environment",
        field=environment.id,
        datatype="string",
        value="dev")
    ```


    :param builtins.str name: The name of the field.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('pagerduty:index/getIncidentCustomField:getIncidentCustomField', __args__, opts=opts, typ=GetIncidentCustomFieldResult)
    return __ret__.apply(lambda __response__: GetIncidentCustomFieldResult(
        data_type=pulumi.get(__response__, 'data_type'),
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        field_type=pulumi.get(__response__, 'field_type'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name')))
