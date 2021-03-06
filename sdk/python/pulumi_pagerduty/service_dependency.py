# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
                 dependencies: pulumi.Input[Sequence[pulumi.Input['ServiceDependencyDependencyArgs']]]):
        """
        The set of arguments for constructing a ServiceDependency resource.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceDependencyDependencyArgs']]] dependencies: The relationship between the `supporting_service` and `dependent_service`.
        """
        pulumi.set(__self__, "dependencies", dependencies)

    @property
    @pulumi.getter
    def dependencies(self) -> pulumi.Input[Sequence[pulumi.Input['ServiceDependencyDependencyArgs']]]:
        """
        The relationship between the `supporting_service` and `dependent_service`.
        """
        return pulumi.get(self, "dependencies")

    @dependencies.setter
    def dependencies(self, value: pulumi.Input[Sequence[pulumi.Input['ServiceDependencyDependencyArgs']]]):
        pulumi.set(self, "dependencies", value)


@pulumi.input_type
class _ServiceDependencyState:
    def __init__(__self__, *,
                 dependencies: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceDependencyDependencyArgs']]]] = None):
        """
        Input properties used for looking up and filtering ServiceDependency resources.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceDependencyDependencyArgs']]] dependencies: The relationship between the `supporting_service` and `dependent_service`.
        """
        if dependencies is not None:
            pulumi.set(__self__, "dependencies", dependencies)

    @property
    @pulumi.getter
    def dependencies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceDependencyDependencyArgs']]]]:
        """
        The relationship between the `supporting_service` and `dependent_service`.
        """
        return pulumi.get(self, "dependencies")

    @dependencies.setter
    def dependencies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceDependencyDependencyArgs']]]]):
        pulumi.set(self, "dependencies", value)


class ServiceDependency(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dependencies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']]]]] = None,
                 __props__=None):
        """
        A [service dependency](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1service_dependencies~1associate/post) is a relationship between two services that this service uses, or that are used by this service, and are critical for successful operation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        foo = pagerduty.ServiceDependency("foo", dependencies=[pagerduty.ServiceDependencyDependencyArgs(
            dependent_services=[pagerduty.ServiceDependencyDependencyDependentServiceArgs(
                id=pagerduty_business_service["foo"]["id"],
                type="business_service",
            )],
            supporting_services=[pagerduty.ServiceDependencyDependencySupportingServiceArgs(
                id=pagerduty_service["foo"]["id"],
                type="service",
            )],
        )])
        bar = pagerduty.ServiceDependency("bar", dependencies=[pagerduty.ServiceDependencyDependencyArgs(
            dependent_services=[pagerduty.ServiceDependencyDependencyDependentServiceArgs(
                id=pagerduty_business_service["foo"]["id"],
                type="business_service",
            )],
            supporting_services=[pagerduty.ServiceDependencyDependencySupportingServiceArgs(
                id=pagerduty_service["two"]["id"],
                type="service",
            )],
        )])
        ```

        ## Import

        Service dependencies can be imported using the related supporting service id, supporting service type (`business_service` or `service`) and the dependency id separated by a dot, e.g.

        ```sh
         $ pulumi import pagerduty:index/serviceDependency:ServiceDependency main P4B2Z7G.business_service.D5RTHKRNGU4PYE90PJ
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']]]] dependencies: The relationship between the `supporting_service` and `dependent_service`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceDependencyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [service dependency](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1service_dependencies~1associate/post) is a relationship between two services that this service uses, or that are used by this service, and are critical for successful operation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        foo = pagerduty.ServiceDependency("foo", dependencies=[pagerduty.ServiceDependencyDependencyArgs(
            dependent_services=[pagerduty.ServiceDependencyDependencyDependentServiceArgs(
                id=pagerduty_business_service["foo"]["id"],
                type="business_service",
            )],
            supporting_services=[pagerduty.ServiceDependencyDependencySupportingServiceArgs(
                id=pagerduty_service["foo"]["id"],
                type="service",
            )],
        )])
        bar = pagerduty.ServiceDependency("bar", dependencies=[pagerduty.ServiceDependencyDependencyArgs(
            dependent_services=[pagerduty.ServiceDependencyDependencyDependentServiceArgs(
                id=pagerduty_business_service["foo"]["id"],
                type="business_service",
            )],
            supporting_services=[pagerduty.ServiceDependencyDependencySupportingServiceArgs(
                id=pagerduty_service["two"]["id"],
                type="service",
            )],
        )])
        ```

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
                 dependencies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceDependencyArgs.__new__(ServiceDependencyArgs)

            if dependencies is None and not opts.urn:
                raise TypeError("Missing required property 'dependencies'")
            __props__.__dict__["dependencies"] = dependencies
        super(ServiceDependency, __self__).__init__(
            'pagerduty:index/serviceDependency:ServiceDependency',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dependencies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']]]]] = None) -> 'ServiceDependency':
        """
        Get an existing ServiceDependency resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServiceDependencyDependencyArgs']]]] dependencies: The relationship between the `supporting_service` and `dependent_service`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceDependencyState.__new__(_ServiceDependencyState)

        __props__.__dict__["dependencies"] = dependencies
        return ServiceDependency(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def dependencies(self) -> pulumi.Output[Sequence['outputs.ServiceDependencyDependency']]:
        """
        The relationship between the `supporting_service` and `dependent_service`.
        """
        return pulumi.get(self, "dependencies")

