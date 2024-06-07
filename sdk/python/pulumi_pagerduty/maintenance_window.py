# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MaintenanceWindowArgs', 'MaintenanceWindow']

@pulumi.input_type
class MaintenanceWindowArgs:
    def __init__(__self__, *,
                 end_time: pulumi.Input[str],
                 services: pulumi.Input[Sequence[pulumi.Input[str]]],
                 start_time: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MaintenanceWindow resource.
        :param pulumi.Input[str] end_time: The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] services: A list of service IDs to include in the maintenance window.
        :param pulumi.Input[str] start_time: The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
        :param pulumi.Input[str] description: A description for the maintenance window.
        """
        pulumi.set(__self__, "end_time", end_time)
        pulumi.set(__self__, "services", services)
        pulumi.set(__self__, "start_time", start_time)
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> pulumi.Input[str]:
        """
        The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter
    def services(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of service IDs to include in the maintenance window.
        """
        return pulumi.get(self, "services")

    @services.setter
    def services(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "services", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Input[str]:
        """
        The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the maintenance window.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _MaintenanceWindowState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 start_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MaintenanceWindow resources.
        :param pulumi.Input[str] description: A description for the maintenance window.
        :param pulumi.Input[str] end_time: The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] services: A list of service IDs to include in the maintenance window.
        :param pulumi.Input[str] start_time: The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
        """
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if end_time is not None:
            pulumi.set(__self__, "end_time", end_time)
        if services is not None:
            pulumi.set(__self__, "services", services)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the maintenance window.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> Optional[pulumi.Input[str]]:
        """
        The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter
    def services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of service IDs to include in the maintenance window.
        """
        return pulumi.get(self, "services")

    @services.setter
    def services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "services", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)


class MaintenanceWindow(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A [maintenance window](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE1OA-create-a-maintenance-window) is used to temporarily disable one or more services for a set period of time. No incidents will be triggered and no notifications will be received while a service is disabled by a maintenance window.

        Maintenance windows are specified to start at a certain time and end after they have begun. Once started, a maintenance window cannot be deleted; it can only be ended immediately to re-enable the service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.MaintenanceWindow("example",
            start_time="2015-11-09T20:00:00-05:00",
            end_time="2015-11-09T22:00:00-05:00",
            services=[example_pagerduty_service["id"]])
        ```

        ## Import

        Maintenance windows can be imported using the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/maintenanceWindow:MaintenanceWindow main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description for the maintenance window.
        :param pulumi.Input[str] end_time: The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] services: A list of service IDs to include in the maintenance window.
        :param pulumi.Input[str] start_time: The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MaintenanceWindowArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [maintenance window](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE1OA-create-a-maintenance-window) is used to temporarily disable one or more services for a set period of time. No incidents will be triggered and no notifications will be received while a service is disabled by a maintenance window.

        Maintenance windows are specified to start at a certain time and end after they have begun. Once started, a maintenance window cannot be deleted; it can only be ended immediately to re-enable the service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.MaintenanceWindow("example",
            start_time="2015-11-09T20:00:00-05:00",
            end_time="2015-11-09T22:00:00-05:00",
            services=[example_pagerduty_service["id"]])
        ```

        ## Import

        Maintenance windows can be imported using the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/maintenanceWindow:MaintenanceWindow main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param MaintenanceWindowArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MaintenanceWindowArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MaintenanceWindowArgs.__new__(MaintenanceWindowArgs)

            if description is None:
                description = 'Managed by Pulumi'
            __props__.__dict__["description"] = description
            if end_time is None and not opts.urn:
                raise TypeError("Missing required property 'end_time'")
            __props__.__dict__["end_time"] = end_time
            if services is None and not opts.urn:
                raise TypeError("Missing required property 'services'")
            __props__.__dict__["services"] = services
            if start_time is None and not opts.urn:
                raise TypeError("Missing required property 'start_time'")
            __props__.__dict__["start_time"] = start_time
        super(MaintenanceWindow, __self__).__init__(
            'pagerduty:index/maintenanceWindow:MaintenanceWindow',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            end_time: Optional[pulumi.Input[str]] = None,
            services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            start_time: Optional[pulumi.Input[str]] = None) -> 'MaintenanceWindow':
        """
        Get an existing MaintenanceWindow resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description for the maintenance window.
        :param pulumi.Input[str] end_time: The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] services: A list of service IDs to include in the maintenance window.
        :param pulumi.Input[str] start_time: The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MaintenanceWindowState.__new__(_MaintenanceWindowState)

        __props__.__dict__["description"] = description
        __props__.__dict__["end_time"] = end_time
        __props__.__dict__["services"] = services
        __props__.__dict__["start_time"] = start_time
        return MaintenanceWindow(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        A description for the maintenance window.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> pulumi.Output[str]:
        """
        The maintenance window's end time. This is when the services will start creating incidents again. This date must be in the future and after the `start_time`.
        """
        return pulumi.get(self, "end_time")

    @property
    @pulumi.getter
    def services(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of service IDs to include in the maintenance window.
        """
        return pulumi.get(self, "services")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[str]:
        """
        The maintenance window's start time. This is when the services will stop creating incidents. If this date is in the past, it will be updated to be the current time.
        """
        return pulumi.get(self, "start_time")

