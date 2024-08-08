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

__all__ = [
    'GetEventOrchestrationResult',
    'AwaitableGetEventOrchestrationResult',
    'get_event_orchestration',
    'get_event_orchestration_output',
]

@pulumi.output_type
class GetEventOrchestrationResult:
    """
    A collection of values returned by getEventOrchestration.
    """
    def __init__(__self__, id=None, integration_detail=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if integration_detail and not isinstance(integration_detail, list):
            raise TypeError("Expected argument 'integration_detail' to be a list")
        pulumi.set(__self__, "integration_detail", integration_detail)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="integrationDetail")
    def integration_detail(self) -> Sequence['outputs.GetEventOrchestrationIntegrationDetailResult']:
        """
        An integration for the Event Orchestration.
        """
        return pulumi.get(self, "integration_detail")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the found Event Orchestration.
        """
        return pulumi.get(self, "name")


class AwaitableGetEventOrchestrationResult(GetEventOrchestrationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEventOrchestrationResult(
            id=self.id,
            integration_detail=self.integration_detail,
            name=self.name)


def get_event_orchestration(integration_detail: Optional[Sequence[Union['GetEventOrchestrationIntegrationDetailArgs', 'GetEventOrchestrationIntegrationDetailArgsDict']]] = None,
                            name: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEventOrchestrationResult:
    """
    Use this data source to get information about a specific Global [Event Orchestration](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations)


    :param Sequence[Union['GetEventOrchestrationIntegrationDetailArgs', 'GetEventOrchestrationIntegrationDetailArgsDict']] integration_detail: An integration for the Event Orchestration.
    :param str name: The name of the Global Event orchestration to find in the PagerDuty API.
    """
    __args__ = dict()
    __args__['integrationDetail'] = integration_detail
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getEventOrchestration:getEventOrchestration', __args__, opts=opts, typ=GetEventOrchestrationResult).value

    return AwaitableGetEventOrchestrationResult(
        id=pulumi.get(__ret__, 'id'),
        integration_detail=pulumi.get(__ret__, 'integration_detail'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_event_orchestration)
def get_event_orchestration_output(integration_detail: Optional[pulumi.Input[Optional[Sequence[Union['GetEventOrchestrationIntegrationDetailArgs', 'GetEventOrchestrationIntegrationDetailArgsDict']]]]] = None,
                                   name: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEventOrchestrationResult]:
    """
    Use this data source to get information about a specific Global [Event Orchestration](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations)


    :param Sequence[Union['GetEventOrchestrationIntegrationDetailArgs', 'GetEventOrchestrationIntegrationDetailArgsDict']] integration_detail: An integration for the Event Orchestration.
    :param str name: The name of the Global Event orchestration to find in the PagerDuty API.
    """
    ...
