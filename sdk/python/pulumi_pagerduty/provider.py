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
from ._inputs import *

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 api_url_override: Optional[pulumi.Input[str]] = None,
                 insecure_tls: Optional[pulumi.Input[bool]] = None,
                 service_region: Optional[pulumi.Input[str]] = None,
                 skip_credentials_validation: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 use_app_oauth_scoped_token: Optional[pulumi.Input['ProviderUseAppOauthScopedTokenArgs']] = None,
                 user_token: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        """
        if api_url_override is not None:
            pulumi.set(__self__, "api_url_override", api_url_override)
        if insecure_tls is not None:
            pulumi.set(__self__, "insecure_tls", insecure_tls)
        if service_region is not None:
            pulumi.set(__self__, "service_region", service_region)
        if skip_credentials_validation is None:
            skip_credentials_validation = False
        if skip_credentials_validation is not None:
            pulumi.set(__self__, "skip_credentials_validation", skip_credentials_validation)
        if token is not None:
            pulumi.set(__self__, "token", token)
        if use_app_oauth_scoped_token is not None:
            pulumi.set(__self__, "use_app_oauth_scoped_token", use_app_oauth_scoped_token)
        if user_token is not None:
            pulumi.set(__self__, "user_token", user_token)

    @property
    @pulumi.getter(name="apiUrlOverride")
    def api_url_override(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "api_url_override")

    @api_url_override.setter
    def api_url_override(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_url_override", value)

    @property
    @pulumi.getter(name="insecureTls")
    def insecure_tls(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "insecure_tls")

    @insecure_tls.setter
    def insecure_tls(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "insecure_tls", value)

    @property
    @pulumi.getter(name="serviceRegion")
    def service_region(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "service_region")

    @service_region.setter
    def service_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_region", value)

    @property
    @pulumi.getter(name="skipCredentialsValidation")
    def skip_credentials_validation(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "skip_credentials_validation")

    @skip_credentials_validation.setter
    def skip_credentials_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_credentials_validation", value)

    @property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token", value)

    @property
    @pulumi.getter(name="useAppOauthScopedToken")
    def use_app_oauth_scoped_token(self) -> Optional[pulumi.Input['ProviderUseAppOauthScopedTokenArgs']]:
        return pulumi.get(self, "use_app_oauth_scoped_token")

    @use_app_oauth_scoped_token.setter
    def use_app_oauth_scoped_token(self, value: Optional[pulumi.Input['ProviderUseAppOauthScopedTokenArgs']]):
        pulumi.set(self, "use_app_oauth_scoped_token", value)

    @property
    @pulumi.getter(name="userToken")
    def user_token(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "user_token")

    @user_token.setter
    def user_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_token", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_url_override: Optional[pulumi.Input[str]] = None,
                 insecure_tls: Optional[pulumi.Input[bool]] = None,
                 service_region: Optional[pulumi.Input[str]] = None,
                 skip_credentials_validation: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 use_app_oauth_scoped_token: Optional[pulumi.Input[Union['ProviderUseAppOauthScopedTokenArgs', 'ProviderUseAppOauthScopedTokenArgsDict']]] = None,
                 user_token: Optional[pulumi.Input[str]] = None,
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
                 args: Optional[ProviderArgs] = None,
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
                 api_url_override: Optional[pulumi.Input[str]] = None,
                 insecure_tls: Optional[pulumi.Input[bool]] = None,
                 service_region: Optional[pulumi.Input[str]] = None,
                 skip_credentials_validation: Optional[pulumi.Input[bool]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 use_app_oauth_scoped_token: Optional[pulumi.Input[Union['ProviderUseAppOauthScopedTokenArgs', 'ProviderUseAppOauthScopedTokenArgsDict']]] = None,
                 user_token: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["api_url_override"] = api_url_override
            __props__.__dict__["insecure_tls"] = pulumi.Output.from_input(insecure_tls).apply(pulumi.runtime.to_json) if insecure_tls is not None else None
            __props__.__dict__["service_region"] = service_region
            if skip_credentials_validation is None:
                skip_credentials_validation = False
            __props__.__dict__["skip_credentials_validation"] = pulumi.Output.from_input(skip_credentials_validation).apply(pulumi.runtime.to_json) if skip_credentials_validation is not None else None
            __props__.__dict__["token"] = token
            __props__.__dict__["use_app_oauth_scoped_token"] = pulumi.Output.from_input(use_app_oauth_scoped_token).apply(pulumi.runtime.to_json) if use_app_oauth_scoped_token is not None else None
            __props__.__dict__["user_token"] = user_token
        super(Provider, __self__).__init__(
            'pagerduty',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="apiUrlOverride")
    def api_url_override(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "api_url_override")

    @property
    @pulumi.getter(name="serviceRegion")
    def service_region(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "service_region")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "token")

    @property
    @pulumi.getter(name="userToken")
    def user_token(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "user_token")

