# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetAutomationActionsActionResult',
    'AwaitableGetAutomationActionsActionResult',
    'get_automation_actions_action',
    'get_automation_actions_action_output',
]

@pulumi.output_type
class GetAutomationActionsActionResult:
    """
    A collection of values returned by getAutomationActionsAction.
    """
    def __init__(__self__, action_classification=None, action_data_references=None, action_type=None, creation_time=None, description=None, id=None, modify_time=None, name=None, runner_id=None, runner_type=None, type=None):
        if action_classification and not isinstance(action_classification, str):
            raise TypeError("Expected argument 'action_classification' to be a str")
        pulumi.set(__self__, "action_classification", action_classification)
        if action_data_references and not isinstance(action_data_references, list):
            raise TypeError("Expected argument 'action_data_references' to be a list")
        pulumi.set(__self__, "action_data_references", action_data_references)
        if action_type and not isinstance(action_type, str):
            raise TypeError("Expected argument 'action_type' to be a str")
        pulumi.set(__self__, "action_type", action_type)
        if creation_time and not isinstance(creation_time, str):
            raise TypeError("Expected argument 'creation_time' to be a str")
        pulumi.set(__self__, "creation_time", creation_time)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if modify_time and not isinstance(modify_time, str):
            raise TypeError("Expected argument 'modify_time' to be a str")
        pulumi.set(__self__, "modify_time", modify_time)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if runner_id and not isinstance(runner_id, str):
            raise TypeError("Expected argument 'runner_id' to be a str")
        pulumi.set(__self__, "runner_id", runner_id)
        if runner_type and not isinstance(runner_type, str):
            raise TypeError("Expected argument 'runner_type' to be a str")
        pulumi.set(__self__, "runner_type", runner_type)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="actionClassification")
    def action_classification(self) -> str:
        """
        (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
        """
        return pulumi.get(self, "action_classification")

    @property
    @pulumi.getter(name="actionDataReferences")
    def action_data_references(self) -> Sequence['outputs.GetAutomationActionsActionActionDataReferenceResult']:
        """
        Action Data block. Action Data is documented below.
        """
        return pulumi.get(self, "action_data_references")

    @property
    @pulumi.getter(name="actionType")
    def action_type(self) -> str:
        """
        The type of the action. The only allowed values are `process_automation` and `script`.
        """
        return pulumi.get(self, "action_type")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        """
        The time action was created. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Optional) The description of the action.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the action.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="modifyTime")
    def modify_time(self) -> str:
        """
        (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "modify_time")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the action.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="runnerId")
    def runner_id(self) -> str:
        """
        (Optional) The Process Automation Actions runner to associate the action with.
        """
        return pulumi.get(self, "runner_id")

    @property
    @pulumi.getter(name="runnerType")
    def runner_type(self) -> str:
        """
        (Optional) The type of the runner associated with the action.
        """
        return pulumi.get(self, "runner_type")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of object. The value returned will be `action`.
        """
        return pulumi.get(self, "type")


class AwaitableGetAutomationActionsActionResult(GetAutomationActionsActionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAutomationActionsActionResult(
            action_classification=self.action_classification,
            action_data_references=self.action_data_references,
            action_type=self.action_type,
            creation_time=self.creation_time,
            description=self.description,
            id=self.id,
            modify_time=self.modify_time,
            name=self.name,
            runner_id=self.runner_id,
            runner_type=self.runner_type,
            type=self.type)


def get_automation_actions_action(action_classification: Optional[str] = None,
                                  creation_time: Optional[str] = None,
                                  description: Optional[str] = None,
                                  id: Optional[str] = None,
                                  modify_time: Optional[str] = None,
                                  runner_id: Optional[str] = None,
                                  runner_type: Optional[str] = None,
                                  type: Optional[str] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAutomationActionsActionResult:
    """
    Use this data source to get information about a specific [automation actions action](https://developer.pagerduty.com/api-reference/357ed15419f64-get-an-automation-action).


    :param str action_classification: (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
    :param str creation_time: The time action was created. Represented as an ISO 8601 timestamp.
    :param str description: (Optional) The description of the action.
    :param str id: The id of the automation actions action in the PagerDuty API.
    :param str modify_time: (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
    :param str runner_id: (Optional) The Process Automation Actions runner to associate the action with.
    :param str runner_type: (Optional) The type of the runner associated with the action.
    :param str type: The type of object. The value returned will be `action`.
    """
    __args__ = dict()
    __args__['actionClassification'] = action_classification
    __args__['creationTime'] = creation_time
    __args__['description'] = description
    __args__['id'] = id
    __args__['modifyTime'] = modify_time
    __args__['runnerId'] = runner_id
    __args__['runnerType'] = runner_type
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getAutomationActionsAction:getAutomationActionsAction', __args__, opts=opts, typ=GetAutomationActionsActionResult).value

    return AwaitableGetAutomationActionsActionResult(
        action_classification=pulumi.get(__ret__, 'action_classification'),
        action_data_references=pulumi.get(__ret__, 'action_data_references'),
        action_type=pulumi.get(__ret__, 'action_type'),
        creation_time=pulumi.get(__ret__, 'creation_time'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        modify_time=pulumi.get(__ret__, 'modify_time'),
        name=pulumi.get(__ret__, 'name'),
        runner_id=pulumi.get(__ret__, 'runner_id'),
        runner_type=pulumi.get(__ret__, 'runner_type'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_automation_actions_action)
def get_automation_actions_action_output(action_classification: Optional[pulumi.Input[Optional[str]]] = None,
                                         creation_time: Optional[pulumi.Input[Optional[str]]] = None,
                                         description: Optional[pulumi.Input[Optional[str]]] = None,
                                         id: Optional[pulumi.Input[str]] = None,
                                         modify_time: Optional[pulumi.Input[Optional[str]]] = None,
                                         runner_id: Optional[pulumi.Input[Optional[str]]] = None,
                                         runner_type: Optional[pulumi.Input[Optional[str]]] = None,
                                         type: Optional[pulumi.Input[Optional[str]]] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAutomationActionsActionResult]:
    """
    Use this data source to get information about a specific [automation actions action](https://developer.pagerduty.com/api-reference/357ed15419f64-get-an-automation-action).


    :param str action_classification: (Optional) The category of the action. The only allowed values are `diagnostic` and `remediation`.
    :param str creation_time: The time action was created. Represented as an ISO 8601 timestamp.
    :param str description: (Optional) The description of the action.
    :param str id: The id of the automation actions action in the PagerDuty API.
    :param str modify_time: (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
    :param str runner_id: (Optional) The Process Automation Actions runner to associate the action with.
    :param str runner_type: (Optional) The type of the runner associated with the action.
    :param str type: The type of object. The value returned will be `action`.
    """
    ...
