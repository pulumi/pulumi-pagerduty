# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ServiceDependencyArgs', 'ServiceDependency']

@pulumi.input_type
class ServiceDependencyArgs:
    def __init__(__self__, *,
                 dependency: pulumi.Input['ServiceDependencyDependencyArgs']):
        """
        The set of arguments for constructing a ServiceDependency resource.
        :param pulumi.Input['ServiceDependencyDependencyArgs'] dependency: The relationship between the `supporting_service` and `dependent_service`. One and only one dependency block must be defined.
        """
        pulumi.set(__self__, "dependency", dependency)

    @property
    @pulumi.getter
    def dependency(self) -> pulumi.Input['ServiceDependencyDependencyArgs']:
        """
        The relationship between the `supporting_service` and `dependent_service`. One and only one dependency block must be defined.
        """
        return pulumi.get(self, "dependency")

    @dependency.setter
    def dependency(self, value: pulumi.Input['ServiceDependencyDependencyArgs']):
        pulumi.set(self, "dependency", value)


@pulumi.input_type
class _ServiceDependencyState:
    def __init__(__self__, *,
                 dependency: Optional[pulumi.Input['ServiceDependencyDependencyArgs']] = None):
        """
        Input properties used for looking up and filtering ServiceDependency resources.
        :param pulumi.Input['ServiceDependencyDependencyArgs'] dependency: The relationship between the `supporting_service` and `dependent_service`. One and only one dependency block must be defined.
        """
        if dependency is not None:
            pulumi.set(__self__, "dependency", dependency)

    @property
    @pulumi.getter
    def dependency(self) -> Optional[pulumi.Input['ServiceDependencyDependencyArgs']]:
        """
        The relationship between the `supporting_service` and `dependent_service`. One and only one dependency block must be defined.
        """
        return pulumi.get(self, "dependency")

    @dependency.setter
    def dependency(self, value: Optional[pulumi.Input['ServiceDependencyDependencyArgs']]):
        pulumi.set(self, "dependency", value)


class ServiceDependency(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dependency: Optional[pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']]] = None,
                 __props__=None):
        """
        A [service dependency](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE5Mg-associate-service-dependencies) is a relationship between two services that this service uses, or that are used by this service, and are critical for successful operation.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        foo = pagerduty.ServiceDependency("foo", dependency=pagerduty.ServiceDependencyDependencyArgs(
            dependent_services=[pagerduty.ServiceDependencyDependencyDependentServiceArgs(
                id=pagerduty_business_service["foo"]["id"],
                type=pagerduty_business_service["foo"]["type"],
            )],
            supporting_services=[pagerduty.ServiceDependencyDependencySupportingServiceArgs(
                id=pagerduty_service["foo"]["id"],
                type=pagerduty_service["foo"]["type"],
            )],
        ))
        bar = pagerduty.ServiceDependency("bar", dependency=pagerduty.ServiceDependencyDependencyArgs(
            dependent_services=[pagerduty.ServiceDependencyDependencyDependentServiceArgs(
                id=pagerduty_business_service["foo"]["id"],
                type=pagerduty_business_service["foo"]["type"],
            )],
            supporting_services=[pagerduty.ServiceDependencyDependencySupportingServiceArgs(
                id=pagerduty_service["two"]["id"],
                type=pagerduty_service["two"]["type"],
            )],
        ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Service dependencies can be imported using the related supporting service id, supporting service type (`business_service` or `service`) and the dependency id separated by a dot, e.g.

        ```sh
        $ pulumi import pagerduty:index/serviceDependency:ServiceDependency main P4B2Z7G.business_service.D5RTHKRNGU4PYE90PJ
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']] dependency: The relationship between the `supporting_service` and `dependent_service`. One and only one dependency block must be defined.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceDependencyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [service dependency](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE5Mg-associate-service-dependencies) is a relationship between two services that this service uses, or that are used by this service, and are critical for successful operation.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        foo = pagerduty.ServiceDependency("foo", dependency=pagerduty.ServiceDependencyDependencyArgs(
            dependent_services=[pagerduty.ServiceDependencyDependencyDependentServiceArgs(
                id=pagerduty_business_service["foo"]["id"],
                type=pagerduty_business_service["foo"]["type"],
            )],
            supporting_services=[pagerduty.ServiceDependencyDependencySupportingServiceArgs(
                id=pagerduty_service["foo"]["id"],
                type=pagerduty_service["foo"]["type"],
            )],
        ))
        bar = pagerduty.ServiceDependency("bar", dependency=pagerduty.ServiceDependencyDependencyArgs(
            dependent_services=[pagerduty.ServiceDependencyDependencyDependentServiceArgs(
                id=pagerduty_business_service["foo"]["id"],
                type=pagerduty_business_service["foo"]["type"],
            )],
            supporting_services=[pagerduty.ServiceDependencyDependencySupportingServiceArgs(
                id=pagerduty_service["two"]["id"],
                type=pagerduty_service["two"]["type"],
            )],
        ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Service dependencies can be imported using the related supporting service id, supporting service type (`business_service` or `service`) and the dependency id separated by a dot, e.g.

        ```sh
        $ pulumi import pagerduty:index/serviceDependency:ServiceDependency main P4B2Z7G.business_service.D5RTHKRNGU4PYE90PJ
        ```

        :param str resource_name: The name of the resource.
        :param ServiceDependencyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceDependencyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dependency: Optional[pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceDependencyArgs.__new__(ServiceDependencyArgs)

            if dependency is None and not opts.urn:
                raise TypeError("Missing required property 'dependency'")
            __props__.__dict__["dependency"] = dependency
        super(ServiceDependency, __self__).__init__(
            'pagerduty:index/serviceDependency:ServiceDependency',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dependency: Optional[pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']]] = None) -> 'ServiceDependency':
        """
        Get an existing ServiceDependency resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']] dependency: The relationship between the `supporting_service` and `dependent_service`. One and only one dependency block must be defined.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceDependencyState.__new__(_ServiceDependencyState)

        __props__.__dict__["dependency"] = dependency
        return ServiceDependency(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def dependency(self) -> pulumi.Output['outputs.ServiceDependencyDependency']:
        """
        The relationship between the `supporting_service` and `dependent_service`. One and only one dependency block must be defined.
        """
        return pulumi.get(self, "dependency")

