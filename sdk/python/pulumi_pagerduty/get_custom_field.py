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
    'GetCustomFieldResult',
    'AwaitableGetCustomFieldResult',
    'get_custom_field',
    'get_custom_field_output',
]

@pulumi.output_type
class GetCustomFieldResult:
    """
    A collection of values returned by getCustomField.
    """
    def __init__(__self__, datatype=None, description=None, display_name=None, fixed_options=None, id=None, multi_value=None, name=None):
        if datatype and not isinstance(datatype, str):
            raise TypeError("Expected argument 'datatype' to be a str")
        pulumi.set(__self__, "datatype", datatype)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if fixed_options and not isinstance(fixed_options, bool):
            raise TypeError("Expected argument 'fixed_options' to be a bool")
        pulumi.set(__self__, "fixed_options", fixed_options)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if multi_value and not isinstance(multi_value, bool):
            raise TypeError("Expected argument 'multi_value' to be a bool")
        pulumi.set(__self__, "multi_value", multi_value)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def datatype(self) -> str:
        return pulumi.get(self, "datatype")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="fixedOptions")
    def fixed_options(self) -> bool:
        return pulumi.get(self, "fixed_options")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="multiValue")
    def multi_value(self) -> bool:
        return pulumi.get(self, "multi_value")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")


class AwaitableGetCustomFieldResult(GetCustomFieldResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomFieldResult(
            datatype=self.datatype,
            description=self.description,
            display_name=self.display_name,
            fixed_options=self.fixed_options,
            id=self.id,
            multi_value=self.multi_value,
            name=self.name)


def get_custom_field(name: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomFieldResult:
    """
    !> This Data Source is no longer functional. Documentation is left here for the purpose of documenting migration steps.

    Use this data source to get information about a specific [Custom Field](https://support.pagerduty.com/docs/custom-fields) that you can add to a custom field schema.

    ## Migration

    The `incident_custom_field` data source provides similar functionality
    with the same arguments and attributes. The key distinction is that while custom fields returned by this data source
    may have only applied to a subset of incidents within the account, custom fields returned by the `incident_custom_field`
    data source are applied to all incidents in the account.


    :param str name: The name of the field.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getCustomField:getCustomField', __args__, opts=opts, typ=GetCustomFieldResult).value

    return AwaitableGetCustomFieldResult(
        datatype=pulumi.get(__ret__, 'datatype'),
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        fixed_options=pulumi.get(__ret__, 'fixed_options'),
        id=pulumi.get(__ret__, 'id'),
        multi_value=pulumi.get(__ret__, 'multi_value'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_custom_field)
def get_custom_field_output(name: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCustomFieldResult]:
    """
    !> This Data Source is no longer functional. Documentation is left here for the purpose of documenting migration steps.

    Use this data source to get information about a specific [Custom Field](https://support.pagerduty.com/docs/custom-fields) that you can add to a custom field schema.

    ## Migration

    The `incident_custom_field` data source provides similar functionality
    with the same arguments and attributes. The key distinction is that while custom fields returned by this data source
    may have only applied to a subset of incidents within the account, custom fields returned by the `incident_custom_field`
    data source are applied to all incidents in the account.


    :param str name: The name of the field.
    """
    ...
