# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

import types

__config__ = pulumi.Config('pagerduty')


class _ExportableConfig(types.ModuleType):
    @property
    def api_url_override(self) -> Optional[str]:
        return __config__.get('apiUrlOverride')

    @property
    def insecure_tls(self) -> Optional[bool]:
        return __config__.get_bool('insecureTls')

    @property
    def service_region(self) -> Optional[str]:
        return __config__.get('serviceRegion')

    @property
    def skip_credentials_validation(self) -> bool:
        return __config__.get_bool('skipCredentialsValidation') or False

    @property
    def token(self) -> Optional[str]:
        return __config__.get('token')

    @property
    def use_app_oauth_scoped_token(self) -> Optional[str]:
        return __config__.get('useAppOauthScopedToken')

    @property
    def user_token(self) -> Optional[str]:
        return __config__.get('userToken')

