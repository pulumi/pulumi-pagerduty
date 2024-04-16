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

__all__ = [
    'GetEventOrchestrationsResult',
    'AwaitableGetEventOrchestrationsResult',
    'get_event_orchestrations',
    'get_event_orchestrations_output',
]

@pulumi.output_type
class GetEventOrchestrationsResult:
    """
    A collection of values returned by getEventOrchestrations.
    """
    def __init__(__self__, event_orchestrations=None, id=None, name_filter=None):
        if event_orchestrations and not isinstance(event_orchestrations, list):
            raise TypeError("Expected argument 'event_orchestrations' to be a list")
        pulumi.set(__self__, "event_orchestrations", event_orchestrations)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name_filter and not isinstance(name_filter, str):
            raise TypeError("Expected argument 'name_filter' to be a str")
        pulumi.set(__self__, "name_filter", name_filter)

    @property
    @pulumi.getter(name="eventOrchestrations")
    def event_orchestrations(self) -> Sequence['outputs.GetEventOrchestrationsEventOrchestrationResult']:
        return pulumi.get(self, "event_orchestrations")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="nameFilter")
    def name_filter(self) -> str:
        """
        The list of the Event Orchestrations which name match `name_filter` argument.
        """
        return pulumi.get(self, "name_filter")


class AwaitableGetEventOrchestrationsResult(GetEventOrchestrationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEventOrchestrationsResult(
            event_orchestrations=self.event_orchestrations,
            id=self.id,
            name_filter=self.name_filter)


def get_event_orchestrations(name_filter: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEventOrchestrationsResult:
    """
    Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    tf_orch_a = pagerduty.EventOrchestration("tf_orch_a", name="Test Event A Orchestration")
    tf_orch_b = pagerduty.EventOrchestration("tf_orch_b", name="Test Event B Orchestration")
    tf_my_monitor = pagerduty.get_event_orchestrations(name_filter=".*Orchestration$")
    ```
    <!--End PulumiCodeChooser -->


    :param str name_filter: The regex name of Global Event orchestrations to find in the PagerDuty API.
    """
    __args__ = dict()
    __args__['nameFilter'] = name_filter
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getEventOrchestrations:getEventOrchestrations', __args__, opts=opts, typ=GetEventOrchestrationsResult).value

    return AwaitableGetEventOrchestrationsResult(
        event_orchestrations=pulumi.get(__ret__, 'event_orchestrations'),
        id=pulumi.get(__ret__, 'id'),
        name_filter=pulumi.get(__ret__, 'name_filter'))


@_utilities.lift_output_func(get_event_orchestrations)
def get_event_orchestrations_output(name_filter: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEventOrchestrationsResult]:
    """
    Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    tf_orch_a = pagerduty.EventOrchestration("tf_orch_a", name="Test Event A Orchestration")
    tf_orch_b = pagerduty.EventOrchestration("tf_orch_b", name="Test Event B Orchestration")
    tf_my_monitor = pagerduty.get_event_orchestrations(name_filter=".*Orchestration$")
    ```
    <!--End PulumiCodeChooser -->


    :param str name_filter: The regex name of Global Event orchestrations to find in the PagerDuty API.
    """
    ...
