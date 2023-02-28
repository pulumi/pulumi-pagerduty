# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CustomFieldArgs', 'CustomField']

@pulumi.input_type
class CustomFieldArgs:
    def __init__(__self__, *,
                 datatype: pulumi.Input[str],
                 display_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 fixed_options: Optional[pulumi.Input[bool]] = None,
                 multi_value: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CustomField resource.
        :param pulumi.Input[str] datatype: The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        :param pulumi.Input[bool] fixed_options: True if the field can only accept values from a set of options.
        :param pulumi.Input[bool] multi_value: True if the field can accept multiple values.
        :param pulumi.Input[str] name: The name of the field.
        """
        pulumi.set(__self__, "datatype", datatype)
        pulumi.set(__self__, "display_name", display_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if fixed_options is not None:
            pulumi.set(__self__, "fixed_options", fixed_options)
        if multi_value is not None:
            pulumi.set(__self__, "multi_value", multi_value)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def datatype(self) -> pulumi.Input[str]:
        """
        The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        """
        return pulumi.get(self, "datatype")

    @datatype.setter
    def datatype(self, value: pulumi.Input[str]):
        pulumi.set(self, "datatype", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="fixedOptions")
    def fixed_options(self) -> Optional[pulumi.Input[bool]]:
        """
        True if the field can only accept values from a set of options.
        """
        return pulumi.get(self, "fixed_options")

    @fixed_options.setter
    def fixed_options(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "fixed_options", value)

    @property
    @pulumi.getter(name="multiValue")
    def multi_value(self) -> Optional[pulumi.Input[bool]]:
        """
        True if the field can accept multiple values.
        """
        return pulumi.get(self, "multi_value")

    @multi_value.setter
    def multi_value(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_value", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the field.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CustomFieldState:
    def __init__(__self__, *,
                 datatype: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fixed_options: Optional[pulumi.Input[bool]] = None,
                 multi_value: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomField resources.
        :param pulumi.Input[str] datatype: The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        :param pulumi.Input[bool] fixed_options: True if the field can only accept values from a set of options.
        :param pulumi.Input[bool] multi_value: True if the field can accept multiple values.
        :param pulumi.Input[str] name: The name of the field.
        """
        if datatype is not None:
            pulumi.set(__self__, "datatype", datatype)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if fixed_options is not None:
            pulumi.set(__self__, "fixed_options", fixed_options)
        if multi_value is not None:
            pulumi.set(__self__, "multi_value", multi_value)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def datatype(self) -> Optional[pulumi.Input[str]]:
        """
        The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        """
        return pulumi.get(self, "datatype")

    @datatype.setter
    def datatype(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datatype", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="fixedOptions")
    def fixed_options(self) -> Optional[pulumi.Input[bool]]:
        """
        True if the field can only accept values from a set of options.
        """
        return pulumi.get(self, "fixed_options")

    @fixed_options.setter
    def fixed_options(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "fixed_options", value)

    @property
    @pulumi.getter(name="multiValue")
    def multi_value(self) -> Optional[pulumi.Input[bool]]:
        """
        True if the field can accept multiple values.
        """
        return pulumi.get(self, "multi_value")

    @multi_value.setter
    def multi_value(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_value", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the field.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class CustomField(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 datatype: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fixed_options: Optional[pulumi.Input[bool]] = None,
                 multi_value: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A [Custom Field](https://support.pagerduty.com/docs/custom-fields) is a resuable element which can be added to Custom Field Schemas.

        > The Custom Fields feature is currently available in Early Access.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        cs_impact = pagerduty.CustomField("csImpact", datatype="string")
        sre_environment = pagerduty.CustomField("sreEnvironment",
            datatype="string",
            fixed_options=True)
        ```

        ## Import

        Fields can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/customField:CustomField sre_environment PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] datatype: The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        :param pulumi.Input[bool] fixed_options: True if the field can only accept values from a set of options.
        :param pulumi.Input[bool] multi_value: True if the field can accept multiple values.
        :param pulumi.Input[str] name: The name of the field.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomFieldArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [Custom Field](https://support.pagerduty.com/docs/custom-fields) is a resuable element which can be added to Custom Field Schemas.

        > The Custom Fields feature is currently available in Early Access.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        cs_impact = pagerduty.CustomField("csImpact", datatype="string")
        sre_environment = pagerduty.CustomField("sreEnvironment",
            datatype="string",
            fixed_options=True)
        ```

        ## Import

        Fields can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/customField:CustomField sre_environment PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param CustomFieldArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomFieldArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 datatype: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fixed_options: Optional[pulumi.Input[bool]] = None,
                 multi_value: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomFieldArgs.__new__(CustomFieldArgs)

            if datatype is None and not opts.urn:
                raise TypeError("Missing required property 'datatype'")
            __props__.__dict__["datatype"] = datatype
            __props__.__dict__["description"] = description
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["fixed_options"] = fixed_options
            __props__.__dict__["multi_value"] = multi_value
            __props__.__dict__["name"] = name
        super(CustomField, __self__).__init__(
            'pagerduty:index/customField:CustomField',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            datatype: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            fixed_options: Optional[pulumi.Input[bool]] = None,
            multi_value: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'CustomField':
        """
        Get an existing CustomField resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] datatype: The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        :param pulumi.Input[bool] fixed_options: True if the field can only accept values from a set of options.
        :param pulumi.Input[bool] multi_value: True if the field can accept multiple values.
        :param pulumi.Input[str] name: The name of the field.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomFieldState.__new__(_CustomFieldState)

        __props__.__dict__["datatype"] = datatype
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["fixed_options"] = fixed_options
        __props__.__dict__["multi_value"] = multi_value
        __props__.__dict__["name"] = name
        return CustomField(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def datatype(self) -> pulumi.Output[str]:
        """
        The datatype of the field. Must be one of `string`, `integer`, `float`, `boolean`, `datetime`, or `url`.
        """
        return pulumi.get(self, "datatype")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="fixedOptions")
    def fixed_options(self) -> pulumi.Output[Optional[bool]]:
        """
        True if the field can only accept values from a set of options.
        """
        return pulumi.get(self, "fixed_options")

    @property
    @pulumi.getter(name="multiValue")
    def multi_value(self) -> pulumi.Output[Optional[bool]]:
        """
        True if the field can accept multiple values.
        """
        return pulumi.get(self, "multi_value")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the field.
        """
        return pulumi.get(self, "name")

