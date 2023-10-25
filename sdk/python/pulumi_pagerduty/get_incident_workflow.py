# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetIncidentWorkflowResult',
    'AwaitableGetIncidentWorkflowResult',
    'get_incident_workflow',
    'get_incident_workflow_output',
]

@pulumi.output_type
class GetIncidentWorkflowResult:
    """
    A collection of values returned by getIncidentWorkflow.
    """
    def __init__(__self__, description=None, id=None, name=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")


class AwaitableGetIncidentWorkflowResult(GetIncidentWorkflowResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIncidentWorkflowResult(
            description=self.description,
            id=self.id,
            name=self.name)


def get_incident_workflow(name: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIncidentWorkflowResult:
    """
    Use this data source to get information about a specific [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) so that you can create a trigger for it.


    :param str name: The name of the workflow.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getIncidentWorkflow:getIncidentWorkflow', __args__, opts=opts, typ=GetIncidentWorkflowResult).value

    return AwaitableGetIncidentWorkflowResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_incident_workflow)
def get_incident_workflow_output(name: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIncidentWorkflowResult]:
    """
    Use this data source to get information about a specific [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) so that you can create a trigger for it.


    :param str name: The name of the workflow.
    """
    ...
