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

__all__ = ['ScheduleArgs', 'Schedule']

@pulumi.input_type
class ScheduleArgs:
    def __init__(__self__, *,
                 layers: pulumi.Input[Sequence[pulumi.Input['ScheduleLayerArgs']]],
                 time_zone: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 overflow: Optional[pulumi.Input[bool]] = None,
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Schedule resource.
        :param pulumi.Input[Sequence[pulumi.Input['ScheduleLayerArgs']]] layers: A schedule layer block. Schedule layers documented below.
        :param pulumi.Input[str] time_zone: The time zone of the schedule (e.g. `Europe/Berlin`).
        :param pulumi.Input[str] description: The description of the schedule.
        :param pulumi.Input[str] name: The name of the schedule.
        :param pulumi.Input[bool] overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
               If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
               If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: Teams associated with the schedule.
        """
        pulumi.set(__self__, "layers", layers)
        pulumi.set(__self__, "time_zone", time_zone)
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if overflow is not None:
            pulumi.set(__self__, "overflow", overflow)
        if teams is not None:
            pulumi.set(__self__, "teams", teams)

    @property
    @pulumi.getter
    def layers(self) -> pulumi.Input[Sequence[pulumi.Input['ScheduleLayerArgs']]]:
        """
        A schedule layer block. Schedule layers documented below.
        """
        return pulumi.get(self, "layers")

    @layers.setter
    def layers(self, value: pulumi.Input[Sequence[pulumi.Input['ScheduleLayerArgs']]]):
        pulumi.set(self, "layers", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Input[str]:
        """
        The time zone of the schedule (e.g. `Europe/Berlin`).
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "time_zone", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the schedule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schedule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def overflow(self) -> Optional[pulumi.Input[bool]]:
        """
        Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
        If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
        If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        """
        return pulumi.get(self, "overflow")

    @overflow.setter
    def overflow(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "overflow", value)

    @property
    @pulumi.getter
    def teams(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Teams associated with the schedule.
        """
        return pulumi.get(self, "teams")

    @teams.setter
    def teams(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "teams", value)


@pulumi.input_type
class _ScheduleState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 final_schedules: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleFinalScheduleArgs']]]] = None,
                 layers: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleLayerArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 overflow: Optional[pulumi.Input[bool]] = None,
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Schedule resources.
        :param pulumi.Input[str] description: The description of the schedule.
        :param pulumi.Input[Sequence[pulumi.Input['ScheduleLayerArgs']]] layers: A schedule layer block. Schedule layers documented below.
        :param pulumi.Input[str] name: The name of the schedule.
        :param pulumi.Input[bool] overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
               If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
               If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: Teams associated with the schedule.
        :param pulumi.Input[str] time_zone: The time zone of the schedule (e.g. `Europe/Berlin`).
        """
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if final_schedules is not None:
            pulumi.set(__self__, "final_schedules", final_schedules)
        if layers is not None:
            pulumi.set(__self__, "layers", layers)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if overflow is not None:
            pulumi.set(__self__, "overflow", overflow)
        if teams is not None:
            pulumi.set(__self__, "teams", teams)
        if time_zone is not None:
            pulumi.set(__self__, "time_zone", time_zone)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the schedule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="finalSchedules")
    def final_schedules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleFinalScheduleArgs']]]]:
        return pulumi.get(self, "final_schedules")

    @final_schedules.setter
    def final_schedules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleFinalScheduleArgs']]]]):
        pulumi.set(self, "final_schedules", value)

    @property
    @pulumi.getter
    def layers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleLayerArgs']]]]:
        """
        A schedule layer block. Schedule layers documented below.
        """
        return pulumi.get(self, "layers")

    @layers.setter
    def layers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleLayerArgs']]]]):
        pulumi.set(self, "layers", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schedule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def overflow(self) -> Optional[pulumi.Input[bool]]:
        """
        Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
        If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
        If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        """
        return pulumi.get(self, "overflow")

    @overflow.setter
    def overflow(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "overflow", value)

    @property
    @pulumi.getter
    def teams(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Teams associated with the schedule.
        """
        return pulumi.get(self, "teams")

    @teams.setter
    def teams(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "teams", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The time zone of the schedule (e.g. `Europe/Berlin`).
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_zone", value)


class Schedule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 layers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleLayerArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 overflow: Optional[pulumi.Input[bool]] = None,
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A [schedule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE4Mg-create-a-schedule) determines the time periods that users are on call. Only on-call users are eligible to receive notifications from incidents.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name")
        example_team = pagerduty.Team("example", name="A Team")
        foo = pagerduty.Schedule("foo",
            name="Daily Engineering Rotation",
            time_zone="America/New_York",
            layers=[pagerduty.ScheduleLayerArgs(
                name="Night Shift",
                start="2015-11-06T20:00:00-05:00",
                rotation_virtual_start="2015-11-06T20:00:00-05:00",
                rotation_turn_length_seconds=86400,
                users=[example.id],
                restrictions=[pagerduty.ScheduleLayerRestrictionArgs(
                    type="daily_restriction",
                    start_time_of_day="08:00:00",
                    duration_seconds=32400,
                )],
            )],
            teams=[example_team.id])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Schedules can be imported using the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/schedule:Schedule main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the schedule.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleLayerArgs']]]] layers: A schedule layer block. Schedule layers documented below.
        :param pulumi.Input[str] name: The name of the schedule.
        :param pulumi.Input[bool] overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
               If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
               If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: Teams associated with the schedule.
        :param pulumi.Input[str] time_zone: The time zone of the schedule (e.g. `Europe/Berlin`).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScheduleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [schedule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE4Mg-create-a-schedule) determines the time periods that users are on call. Only on-call users are eligible to receive notifications from incidents.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example",
            name="Earline Greenholt",
            email="125.greenholt.earline@graham.name")
        example_team = pagerduty.Team("example", name="A Team")
        foo = pagerduty.Schedule("foo",
            name="Daily Engineering Rotation",
            time_zone="America/New_York",
            layers=[pagerduty.ScheduleLayerArgs(
                name="Night Shift",
                start="2015-11-06T20:00:00-05:00",
                rotation_virtual_start="2015-11-06T20:00:00-05:00",
                rotation_turn_length_seconds=86400,
                users=[example.id],
                restrictions=[pagerduty.ScheduleLayerRestrictionArgs(
                    type="daily_restriction",
                    start_time_of_day="08:00:00",
                    duration_seconds=32400,
                )],
            )],
            teams=[example_team.id])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Schedules can be imported using the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/schedule:Schedule main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param ScheduleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScheduleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 layers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleLayerArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 overflow: Optional[pulumi.Input[bool]] = None,
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScheduleArgs.__new__(ScheduleArgs)

            if description is None:
                description = 'Managed by Pulumi'
            __props__.__dict__["description"] = description
            if layers is None and not opts.urn:
                raise TypeError("Missing required property 'layers'")
            __props__.__dict__["layers"] = layers
            __props__.__dict__["name"] = name
            __props__.__dict__["overflow"] = overflow
            __props__.__dict__["teams"] = teams
            if time_zone is None and not opts.urn:
                raise TypeError("Missing required property 'time_zone'")
            __props__.__dict__["time_zone"] = time_zone
            __props__.__dict__["final_schedules"] = None
        super(Schedule, __self__).__init__(
            'pagerduty:index/schedule:Schedule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            final_schedules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleFinalScheduleArgs']]]]] = None,
            layers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleLayerArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            overflow: Optional[pulumi.Input[bool]] = None,
            teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            time_zone: Optional[pulumi.Input[str]] = None) -> 'Schedule':
        """
        Get an existing Schedule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the schedule.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleLayerArgs']]]] layers: A schedule layer block. Schedule layers documented below.
        :param pulumi.Input[str] name: The name of the schedule.
        :param pulumi.Input[bool] overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
               If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
               If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: Teams associated with the schedule.
        :param pulumi.Input[str] time_zone: The time zone of the schedule (e.g. `Europe/Berlin`).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScheduleState.__new__(_ScheduleState)

        __props__.__dict__["description"] = description
        __props__.__dict__["final_schedules"] = final_schedules
        __props__.__dict__["layers"] = layers
        __props__.__dict__["name"] = name
        __props__.__dict__["overflow"] = overflow
        __props__.__dict__["teams"] = teams
        __props__.__dict__["time_zone"] = time_zone
        return Schedule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the schedule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="finalSchedules")
    def final_schedules(self) -> pulumi.Output[Sequence['outputs.ScheduleFinalSchedule']]:
        return pulumi.get(self, "final_schedules")

    @property
    @pulumi.getter
    def layers(self) -> pulumi.Output[Sequence['outputs.ScheduleLayer']]:
        """
        A schedule layer block. Schedule layers documented below.
        """
        return pulumi.get(self, "layers")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the schedule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def overflow(self) -> pulumi.Output[Optional[bool]]:
        """
        Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
        If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
        If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
        """
        return pulumi.get(self, "overflow")

    @property
    @pulumi.getter
    def teams(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Teams associated with the schedule.
        """
        return pulumi.get(self, "teams")

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Output[str]:
        """
        The time zone of the schedule (e.g. `Europe/Berlin`).
        """
        return pulumi.get(self, "time_zone")

