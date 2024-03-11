# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAutomationActionsRunnerResult',
    'AwaitableGetAutomationActionsRunnerResult',
    'get_automation_actions_runner',
    'get_automation_actions_runner_output',
]

@pulumi.output_type
class GetAutomationActionsRunnerResult:
    """
    A collection of values returned by getAutomationActionsRunner.
    """
    def __init__(__self__, creation_time=None, description=None, id=None, last_seen=None, name=None, runbook_base_uri=None, runner_type=None, type=None):
        if creation_time and not isinstance(creation_time, str):
            raise TypeError("Expected argument 'creation_time' to be a str")
        pulumi.set(__self__, "creation_time", creation_time)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if last_seen and not isinstance(last_seen, str):
            raise TypeError("Expected argument 'last_seen' to be a str")
        pulumi.set(__self__, "last_seen", last_seen)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if runbook_base_uri and not isinstance(runbook_base_uri, str):
            raise TypeError("Expected argument 'runbook_base_uri' to be a str")
        pulumi.set(__self__, "runbook_base_uri", runbook_base_uri)
        if runner_type and not isinstance(runner_type, str):
            raise TypeError("Expected argument 'runner_type' to be a str")
        pulumi.set(__self__, "runner_type", runner_type)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        """
        The time runner was created. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Optional) The description of the runner.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the found runner.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastSeen")
    def last_seen(self) -> str:
        """
        (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "last_seen")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the found runner.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="runbookBaseUri")
    def runbook_base_uri(self) -> str:
        """
        (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
        """
        return pulumi.get(self, "runbook_base_uri")

    @property
    @pulumi.getter(name="runnerType")
    def runner_type(self) -> str:
        """
        The type of runner. Allowed values are `sidecar` and `runbook`.
        """
        return pulumi.get(self, "runner_type")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of object. The value returned will be `runner`.
        """
        return pulumi.get(self, "type")


class AwaitableGetAutomationActionsRunnerResult(GetAutomationActionsRunnerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAutomationActionsRunnerResult(
            creation_time=self.creation_time,
            description=self.description,
            id=self.id,
            last_seen=self.last_seen,
            name=self.name,
            runbook_base_uri=self.runbook_base_uri,
            runner_type=self.runner_type,
            type=self.type)


def get_automation_actions_runner(description: Optional[str] = None,
                                  id: Optional[str] = None,
                                  last_seen: Optional[str] = None,
                                  runbook_base_uri: Optional[str] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAutomationActionsRunnerResult:
    """
    Use this data source to get information about a specific [automation actions runner](https://developer.pagerduty.com/api-reference/aace61f84cbd0-get-an-automation-action-runner).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    example = pagerduty.get_automation_actions_runner(id="01DBJLIGED17S1DQKQC2AV8XYZ")
    ```
    <!--End PulumiCodeChooser -->


    :param str description: (Optional) The description of the runner.
    :param str id: The id of the automation actions runner in the PagerDuty API.
    :param str last_seen: (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
    :param str runbook_base_uri: (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['id'] = id
    __args__['lastSeen'] = last_seen
    __args__['runbookBaseUri'] = runbook_base_uri
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getAutomationActionsRunner:getAutomationActionsRunner', __args__, opts=opts, typ=GetAutomationActionsRunnerResult).value

    return AwaitableGetAutomationActionsRunnerResult(
        creation_time=pulumi.get(__ret__, 'creation_time'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        last_seen=pulumi.get(__ret__, 'last_seen'),
        name=pulumi.get(__ret__, 'name'),
        runbook_base_uri=pulumi.get(__ret__, 'runbook_base_uri'),
        runner_type=pulumi.get(__ret__, 'runner_type'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_automation_actions_runner)
def get_automation_actions_runner_output(description: Optional[pulumi.Input[Optional[str]]] = None,
                                         id: Optional[pulumi.Input[str]] = None,
                                         last_seen: Optional[pulumi.Input[Optional[str]]] = None,
                                         runbook_base_uri: Optional[pulumi.Input[Optional[str]]] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAutomationActionsRunnerResult]:
    """
    Use this data source to get information about a specific [automation actions runner](https://developer.pagerduty.com/api-reference/aace61f84cbd0-get-an-automation-action-runner).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    example = pagerduty.get_automation_actions_runner(id="01DBJLIGED17S1DQKQC2AV8XYZ")
    ```
    <!--End PulumiCodeChooser -->


    :param str description: (Optional) The description of the runner.
    :param str id: The id of the automation actions runner in the PagerDuty API.
    :param str last_seen: (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
    :param str runbook_base_uri: (Optional) The base URI of the Runbook server to connect to. Applicable to `runbook` type runners only.
    """
    ...
