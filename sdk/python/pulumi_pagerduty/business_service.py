# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['BusinessServiceArgs', 'BusinessService']

@pulumi.input_type
class BusinessServiceArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 point_of_contact: Optional[pulumi.Input[str]] = None,
                 team: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BusinessService resource.
        :param pulumi.Input[str] name: The name of the business service.
        :param pulumi.Input[str] point_of_contact: The owner of the business service.
        :param pulumi.Input[str] team: ID of the team that owns the business service.
        :param pulumi.Input[str] type: Default value is `business_service`. Can also be set as `business_service_reference`.
        """
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if point_of_contact is not None:
            pulumi.set(__self__, "point_of_contact", point_of_contact)
        if team is not None:
            pulumi.set(__self__, "team", team)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the business service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="pointOfContact")
    def point_of_contact(self) -> Optional[pulumi.Input[str]]:
        """
        The owner of the business service.
        """
        return pulumi.get(self, "point_of_contact")

    @point_of_contact.setter
    def point_of_contact(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "point_of_contact", value)

    @property
    @pulumi.getter
    def team(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the team that owns the business service.
        """
        return pulumi.get(self, "team")

    @team.setter
    def team(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Default value is `business_service`. Can also be set as `business_service_reference`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _BusinessServiceState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 html_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 point_of_contact: Optional[pulumi.Input[str]] = None,
                 self: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None,
                 team: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BusinessService resources.
        :param pulumi.Input[str] name: The name of the business service.
        :param pulumi.Input[str] point_of_contact: The owner of the business service.
        :param pulumi.Input[str] team: ID of the team that owns the business service.
        :param pulumi.Input[str] type: Default value is `business_service`. Can also be set as `business_service_reference`.
        """
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if html_url is not None:
            pulumi.set(__self__, "html_url", html_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if point_of_contact is not None:
            pulumi.set(__self__, "point_of_contact", point_of_contact)
        if self is not None:
            pulumi.set(__self__, "self", self)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)
        if team is not None:
            pulumi.set(__self__, "team", team)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "html_url")

    @html_url.setter
    def html_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "html_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the business service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="pointOfContact")
    def point_of_contact(self) -> Optional[pulumi.Input[str]]:
        """
        The owner of the business service.
        """
        return pulumi.get(self, "point_of_contact")

    @point_of_contact.setter
    def point_of_contact(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "point_of_contact", value)

    @property
    @pulumi.getter
    def self(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "self")

    @self.setter
    def self(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "self", value)

    @property
    @pulumi.getter
    def summary(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "summary", value)

    @property
    @pulumi.getter
    def team(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the team that owns the business service.
        """
        return pulumi.get(self, "team")

    @team.setter
    def team(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Default value is `business_service`. Can also be set as `business_service_reference`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class BusinessService(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 point_of_contact: Optional[pulumi.Input[str]] = None,
                 team: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A [business service](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1business_services/get) allows you to model capabilities that span multiple technical services and that may be owned by several different teams.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.BusinessService("example",
            description="A very descriptive description of this business service",
            point_of_contact="PagerDuty Admin",
            team="P37RSRS")
        ```

        ## Import

        Services can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/businessService:BusinessService main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the business service.
        :param pulumi.Input[str] point_of_contact: The owner of the business service.
        :param pulumi.Input[str] team: ID of the team that owns the business service.
        :param pulumi.Input[str] type: Default value is `business_service`. Can also be set as `business_service_reference`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BusinessServiceArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [business service](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1business_services/get) allows you to model capabilities that span multiple technical services and that may be owned by several different teams.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.BusinessService("example",
            description="A very descriptive description of this business service",
            point_of_contact="PagerDuty Admin",
            team="P37RSRS")
        ```

        ## Import

        Services can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/businessService:BusinessService main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param BusinessServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BusinessServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 point_of_contact: Optional[pulumi.Input[str]] = None,
                 team: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
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
            __props__ = BusinessServiceArgs.__new__(BusinessServiceArgs)

            if description is None:
                description = 'Managed by Pulumi'
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["point_of_contact"] = point_of_contact
            __props__.__dict__["team"] = team
            __props__.__dict__["type"] = type
            __props__.__dict__["html_url"] = None
            __props__.__dict__["self"] = None
            __props__.__dict__["summary"] = None
        super(BusinessService, __self__).__init__(
            'pagerduty:index/businessService:BusinessService',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            html_url: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            point_of_contact: Optional[pulumi.Input[str]] = None,
            self: Optional[pulumi.Input[str]] = None,
            summary: Optional[pulumi.Input[str]] = None,
            team: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'BusinessService':
        """
        Get an existing BusinessService resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the business service.
        :param pulumi.Input[str] point_of_contact: The owner of the business service.
        :param pulumi.Input[str] team: ID of the team that owns the business service.
        :param pulumi.Input[str] type: Default value is `business_service`. Can also be set as `business_service_reference`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BusinessServiceState.__new__(_BusinessServiceState)

        __props__.__dict__["description"] = description
        __props__.__dict__["html_url"] = html_url
        __props__.__dict__["name"] = name
        __props__.__dict__["point_of_contact"] = point_of_contact
        __props__.__dict__["self"] = self
        __props__.__dict__["summary"] = summary
        __props__.__dict__["team"] = team
        __props__.__dict__["type"] = type
        return BusinessService(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> pulumi.Output[str]:
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the business service.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="pointOfContact")
    def point_of_contact(self) -> pulumi.Output[Optional[str]]:
        """
        The owner of the business service.
        """
        return pulumi.get(self, "point_of_contact")

    @property
    @pulumi.getter
    def self(self) -> pulumi.Output[str]:
        return pulumi.get(self, "self")

    @property
    @pulumi.getter
    def summary(self) -> pulumi.Output[str]:
        return pulumi.get(self, "summary")

    @property
    @pulumi.getter
    def team(self) -> pulumi.Output[Optional[str]]:
        """
        ID of the team that owns the business service.
        """
        return pulumi.get(self, "team")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        Default value is `business_service`. Can also be set as `business_service_reference`.
        """
        return pulumi.get(self, "type")

