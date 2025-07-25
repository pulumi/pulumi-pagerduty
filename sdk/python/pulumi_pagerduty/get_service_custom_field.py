# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetServiceCustomFieldResult',
    'AwaitableGetServiceCustomFieldResult',
    'get_service_custom_field',
    'get_service_custom_field_output',
]

@pulumi.output_type
class GetServiceCustomFieldResult:
    """
    A collection of values returned by getServiceCustomField.
    """
    def __init__(__self__, data_type=None, default_value=None, description=None, display_name=None, enabled=None, field_options=None, field_type=None, id=None, name=None, self=None, summary=None, type=None):
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

    @_builtins.property
    @pulumi.getter(name="dataType")
    def data_type(self) -> _builtins.str:
        """
        The data type of the field option.
        """
        return pulumi.get(self, "data_type")

    @_builtins.property
    @pulumi.getter(name="defaultValue")
    def default_value(self) -> _builtins.str:
        return pulumi.get(self, "default_value")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        A description of the data this field contains.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> _builtins.str:
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Whether the field is enabled.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="fieldOptions")
    def field_options(self) -> Sequence['outputs.GetServiceCustomFieldFieldOptionResult']:
        """
        The options for the custom field. Only applies to `single_value_fixed` and `multi_value_fixed` field types. Each field option contains:
        """
        return pulumi.get(self, "field_options")

    @_builtins.property
    @pulumi.getter(name="fieldType")
    def field_type(self) -> _builtins.str:
        """
        The type of data this field contains. In combination with the data_type field.
        """
        return pulumi.get(self, "field_type")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the found field.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the field. Contains ASCII characters, specifically lowercase letters, digits, and underscores.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def self(self) -> _builtins.str:
        """
        The API show URL at which the object is accessible.
        """
        return pulumi.get(self, "self")

    @_builtins.property
    @pulumi.getter
    def summary(self) -> _builtins.str:
        """
        A short-form, server-generated string that provides succinct, important information about the field.
        """
        return pulumi.get(self, "summary")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        API object type.
        """
        return pulumi.get(self, "type")


class AwaitableGetServiceCustomFieldResult(GetServiceCustomFieldResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceCustomFieldResult(
            data_type=self.data_type,
            default_value=self.default_value,
            description=self.description,
            display_name=self.display_name,
            enabled=self.enabled,
            field_options=self.field_options,
            field_type=self.field_type,
            id=self.id,
            name=self.name,
            self=self.self,
            summary=self.summary,
            type=self.type)


def get_service_custom_field(display_name: Optional[_builtins.str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceCustomFieldResult:
    """
    Use this data source to get information about a specific Service Custom Field that has been configured in your PagerDuty account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    regions = pagerduty.get_service_custom_field(display_name="AWS Regions")
    ```


    :param _builtins.str display_name: The human-readable name of the field to look up. This must be unique across an account.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getServiceCustomField:getServiceCustomField', __args__, opts=opts, typ=GetServiceCustomFieldResult).value

    return AwaitableGetServiceCustomFieldResult(
        data_type=pulumi.get(__ret__, 'data_type'),
        default_value=pulumi.get(__ret__, 'default_value'),
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        enabled=pulumi.get(__ret__, 'enabled'),
        field_options=pulumi.get(__ret__, 'field_options'),
        field_type=pulumi.get(__ret__, 'field_type'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        self=pulumi.get(__ret__, 'self'),
        summary=pulumi.get(__ret__, 'summary'),
        type=pulumi.get(__ret__, 'type'))
def get_service_custom_field_output(display_name: Optional[pulumi.Input[_builtins.str]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceCustomFieldResult]:
    """
    Use this data source to get information about a specific Service Custom Field that has been configured in your PagerDuty account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    regions = pagerduty.get_service_custom_field(display_name="AWS Regions")
    ```


    :param _builtins.str display_name: The human-readable name of the field to look up. This must be unique across an account.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('pagerduty:index/getServiceCustomField:getServiceCustomField', __args__, opts=opts, typ=GetServiceCustomFieldResult)
    return __ret__.apply(lambda __response__: GetServiceCustomFieldResult(
        data_type=pulumi.get(__response__, 'data_type'),
        default_value=pulumi.get(__response__, 'default_value'),
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        enabled=pulumi.get(__response__, 'enabled'),
        field_options=pulumi.get(__response__, 'field_options'),
        field_type=pulumi.get(__response__, 'field_type'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        self=pulumi.get(__response__, 'self'),
        summary=pulumi.get(__response__, 'summary'),
        type=pulumi.get(__response__, 'type')))
