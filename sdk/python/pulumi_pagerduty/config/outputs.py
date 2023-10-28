# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'UseAppOauthScopedToken',
]

@pulumi.output_type
class UseAppOauthScopedToken(dict):
    def __init__(__self__, *,
                 pd_client_id: str,
                 pd_client_secret: str,
                 pd_subdomain: str):
        pulumi.set(__self__, "pd_client_id", pd_client_id)
        pulumi.set(__self__, "pd_client_secret", pd_client_secret)
        pulumi.set(__self__, "pd_subdomain", pd_subdomain)

    @property
    @pulumi.getter(name="pdClientId")
    def pd_client_id(self) -> str:
        return pulumi.get(self, "pd_client_id")

    @property
    @pulumi.getter(name="pdClientSecret")
    def pd_client_secret(self) -> str:
        return pulumi.get(self, "pd_client_secret")

    @property
    @pulumi.getter(name="pdSubdomain")
    def pd_subdomain(self) -> str:
        return pulumi.get(self, "pd_subdomain")


