# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 token: pulumi.Input[str],
                 skip_credentials_validation: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Provider resource.
        """
        pulumi.set(__self__, "token", token)
        if skip_credentials_validation is None:
            skip_credentials_validation = False
        if skip_credentials_validation is not None:
            pulumi.set(__self__, "skip_credentials_validation", skip_credentials_validation)

    @property
    @pulumi.getter
    def token(self) -> pulumi.Input[str]:
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: pulumi.Input[str]):
        pulumi.set(self, "token", value)

    @property
    @pulumi.getter(name="skipCredentialsValidation")
    def skip_credentials_validation(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "skip_credentials_validation")

    @skip_credentials_validation.setter
    def skip_credentials_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_credentials_validation", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 skip_credentials_validation: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the pagerduty package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the pagerduty package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 skip_credentials_validation: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None,
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
            __props__ = ProviderArgs.__new__(ProviderArgs)

            if skip_credentials_validation is None:
                skip_credentials_validation = False
            __props__.__dict__["skip_credentials_validation"] = pulumi.Output.from_input(skip_credentials_validation).apply(pulumi.runtime.to_json) if skip_credentials_validation is not None else None
            if token is None and not opts.urn:
                raise TypeError("Missing required property 'token'")
            __props__.__dict__["token"] = token
        super(Provider, __self__).__init__(
            'pagerduty',
            resource_name,
            __props__,
            opts)

