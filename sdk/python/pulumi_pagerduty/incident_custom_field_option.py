# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['IncidentCustomFieldOptionArgs', 'IncidentCustomFieldOption']

@pulumi.input_type
class IncidentCustomFieldOptionArgs:
    def __init__(__self__, *,
                 data_type: pulumi.Input[str],
                 field: pulumi.Input[str],
                 value: pulumi.Input[str]):
        """
        The set of arguments for constructing a IncidentCustomFieldOption resource.
        :param pulumi.Input[str] data_type: The datatype of the field option. Only `string` is allowed here at present.
        :param pulumi.Input[str] field: The ID of the field.
        :param pulumi.Input[str] value: The allowed value.
        """
        IncidentCustomFieldOptionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            data_type=data_type,
            field=field,
            value=value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             data_type: Optional[pulumi.Input[str]] = None,
             field: Optional[pulumi.Input[str]] = None,
             value: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if data_type is None and 'dataType' in kwargs:
            data_type = kwargs['dataType']
        if data_type is None:
            raise TypeError("Missing 'data_type' argument")
        if field is None:
            raise TypeError("Missing 'field' argument")
        if value is None:
            raise TypeError("Missing 'value' argument")

        _setter("data_type", data_type)
        _setter("field", field)
        _setter("value", value)

    @property
    @pulumi.getter(name="dataType")
    def data_type(self) -> pulumi.Input[str]:
        """
        The datatype of the field option. Only `string` is allowed here at present.
        """
        return pulumi.get(self, "data_type")

    @data_type.setter
    def data_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "data_type", value)

    @property
    @pulumi.getter
    def field(self) -> pulumi.Input[str]:
        """
        The ID of the field.
        """
        return pulumi.get(self, "field")

    @field.setter
    def field(self, value: pulumi.Input[str]):
        pulumi.set(self, "field", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        The allowed value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class _IncidentCustomFieldOptionState:
    def __init__(__self__, *,
                 data_type: Optional[pulumi.Input[str]] = None,
                 field: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IncidentCustomFieldOption resources.
        :param pulumi.Input[str] data_type: The datatype of the field option. Only `string` is allowed here at present.
        :param pulumi.Input[str] field: The ID of the field.
        :param pulumi.Input[str] value: The allowed value.
        """
        _IncidentCustomFieldOptionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            data_type=data_type,
            field=field,
            value=value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             data_type: Optional[pulumi.Input[str]] = None,
             field: Optional[pulumi.Input[str]] = None,
             value: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if data_type is None and 'dataType' in kwargs:
            data_type = kwargs['dataType']

        if data_type is not None:
            _setter("data_type", data_type)
        if field is not None:
            _setter("field", field)
        if value is not None:
            _setter("value", value)

    @property
    @pulumi.getter(name="dataType")
    def data_type(self) -> Optional[pulumi.Input[str]]:
        """
        The datatype of the field option. Only `string` is allowed here at present.
        """
        return pulumi.get(self, "data_type")

    @data_type.setter
    def data_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data_type", value)

    @property
    @pulumi.getter
    def field(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the field.
        """
        return pulumi.get(self, "field")

    @field.setter
    def field(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "field", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The allowed value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


class IncidentCustomFieldOption(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_type: Optional[pulumi.Input[str]] = None,
                 field: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A Incident Custom Field Option is a specific value that can be used for an [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents) that only allow values from a set of fixed options,
        i.e. has the `field_type` of `single_value_fixed` or `multi_value_fixed`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data_type: The datatype of the field option. Only `string` is allowed here at present.
        :param pulumi.Input[str] field: The ID of the field.
        :param pulumi.Input[str] value: The allowed value.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IncidentCustomFieldOptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A Incident Custom Field Option is a specific value that can be used for an [Incident Custom Field](https://support.pagerduty.com/docs/custom-fields-on-incidents) that only allow values from a set of fixed options,
        i.e. has the `field_type` of `single_value_fixed` or `multi_value_fixed`.

        :param str resource_name: The name of the resource.
        :param IncidentCustomFieldOptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IncidentCustomFieldOptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            IncidentCustomFieldOptionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_type: Optional[pulumi.Input[str]] = None,
                 field: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IncidentCustomFieldOptionArgs.__new__(IncidentCustomFieldOptionArgs)

            if data_type is None and not opts.urn:
                raise TypeError("Missing required property 'data_type'")
            __props__.__dict__["data_type"] = data_type
            if field is None and not opts.urn:
                raise TypeError("Missing required property 'field'")
            __props__.__dict__["field"] = field
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
        super(IncidentCustomFieldOption, __self__).__init__(
            'pagerduty:index/incidentCustomFieldOption:IncidentCustomFieldOption',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_type: Optional[pulumi.Input[str]] = None,
            field: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'IncidentCustomFieldOption':
        """
        Get an existing IncidentCustomFieldOption resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data_type: The datatype of the field option. Only `string` is allowed here at present.
        :param pulumi.Input[str] field: The ID of the field.
        :param pulumi.Input[str] value: The allowed value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IncidentCustomFieldOptionState.__new__(_IncidentCustomFieldOptionState)

        __props__.__dict__["data_type"] = data_type
        __props__.__dict__["field"] = field
        __props__.__dict__["value"] = value
        return IncidentCustomFieldOption(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dataType")
    def data_type(self) -> pulumi.Output[str]:
        """
        The datatype of the field option. Only `string` is allowed here at present.
        """
        return pulumi.get(self, "data_type")

    @property
    @pulumi.getter
    def field(self) -> pulumi.Output[str]:
        """
        The ID of the field.
        """
        return pulumi.get(self, "field")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        The allowed value.
        """
        return pulumi.get(self, "value")

