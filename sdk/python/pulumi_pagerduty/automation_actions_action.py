# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AutomationActionsActionArgs', 'AutomationActionsAction']

@pulumi.input_type
class AutomationActionsActionArgs:
    def __init__(__self__, *,
                 action_data_reference: pulumi.Input['AutomationActionsActionActionDataReferenceArgs'],
                 action_type: pulumi.Input[str],
                 action_classification: Optional[pulumi.Input[str]] = None,
                 allow_invocation_from_event_orchestration: Optional[pulumi.Input[str]] = None,
                 allow_invocation_manually: Optional[pulumi.Input[str]] = None,
                 creation_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 map_to_all_services: Optional[pulumi.Input[bool]] = None,
                 modify_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 only_invocable_on_unresolved_incidents: Optional[pulumi.Input[bool]] = None,
                 runner_id: Optional[pulumi.Input[str]] = None,
                 runner_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AutomationActionsAction resource.
        :param pulumi.Input['AutomationActionsActionActionDataReferenceArgs'] action_data_reference: Action Data block. Action Data is documented below.
        :param pulumi.Input[str] action_type: The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        :param pulumi.Input[str] action_classification: The category of the action. The only allowed values are `diagnostic` and `remediation`.
        :param pulumi.Input[str] creation_time: The time action was created. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] description: The description of the action. Max length is 1024 characters.
        :param pulumi.Input[str] modify_time: (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] name: The name of the action. Max length is 255 characters.
        :param pulumi.Input[str] runner_id: The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        :param pulumi.Input[str] runner_type: (Optional) The type of the runner associated with the action.
        :param pulumi.Input[str] type: The type of object. The value returned will be `action`.
        """
        pulumi.set(__self__, "action_data_reference", action_data_reference)
        pulumi.set(__self__, "action_type", action_type)
        if action_classification is not None:
            pulumi.set(__self__, "action_classification", action_classification)
        if allow_invocation_from_event_orchestration is not None:
            pulumi.set(__self__, "allow_invocation_from_event_orchestration", allow_invocation_from_event_orchestration)
        if allow_invocation_manually is not None:
            pulumi.set(__self__, "allow_invocation_manually", allow_invocation_manually)
        if creation_time is not None:
            pulumi.set(__self__, "creation_time", creation_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if map_to_all_services is not None:
            pulumi.set(__self__, "map_to_all_services", map_to_all_services)
        if modify_time is not None:
            pulumi.set(__self__, "modify_time", modify_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if only_invocable_on_unresolved_incidents is not None:
            pulumi.set(__self__, "only_invocable_on_unresolved_incidents", only_invocable_on_unresolved_incidents)
        if runner_id is not None:
            pulumi.set(__self__, "runner_id", runner_id)
        if runner_type is not None:
            pulumi.set(__self__, "runner_type", runner_type)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="actionDataReference")
    def action_data_reference(self) -> pulumi.Input['AutomationActionsActionActionDataReferenceArgs']:
        """
        Action Data block. Action Data is documented below.
        """
        return pulumi.get(self, "action_data_reference")

    @action_data_reference.setter
    def action_data_reference(self, value: pulumi.Input['AutomationActionsActionActionDataReferenceArgs']):
        pulumi.set(self, "action_data_reference", value)

    @property
    @pulumi.getter(name="actionType")
    def action_type(self) -> pulumi.Input[str]:
        """
        The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        """
        return pulumi.get(self, "action_type")

    @action_type.setter
    def action_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "action_type", value)

    @property
    @pulumi.getter(name="actionClassification")
    def action_classification(self) -> Optional[pulumi.Input[str]]:
        """
        The category of the action. The only allowed values are `diagnostic` and `remediation`.
        """
        return pulumi.get(self, "action_classification")

    @action_classification.setter
    def action_classification(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action_classification", value)

    @property
    @pulumi.getter(name="allowInvocationFromEventOrchestration")
    def allow_invocation_from_event_orchestration(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "allow_invocation_from_event_orchestration")

    @allow_invocation_from_event_orchestration.setter
    def allow_invocation_from_event_orchestration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "allow_invocation_from_event_orchestration", value)

    @property
    @pulumi.getter(name="allowInvocationManually")
    def allow_invocation_manually(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "allow_invocation_manually")

    @allow_invocation_manually.setter
    def allow_invocation_manually(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "allow_invocation_manually", value)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time action was created. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "creation_time")

    @creation_time.setter
    def creation_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the action. Max length is 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="mapToAllServices")
    def map_to_all_services(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "map_to_all_services")

    @map_to_all_services.setter
    def map_to_all_services(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "map_to_all_services", value)

    @property
    @pulumi.getter(name="modifyTime")
    def modify_time(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "modify_time")

    @modify_time.setter
    def modify_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modify_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the action. Max length is 255 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="onlyInvocableOnUnresolvedIncidents")
    def only_invocable_on_unresolved_incidents(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "only_invocable_on_unresolved_incidents")

    @only_invocable_on_unresolved_incidents.setter
    def only_invocable_on_unresolved_incidents(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "only_invocable_on_unresolved_incidents", value)

    @property
    @pulumi.getter(name="runnerId")
    def runner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        """
        return pulumi.get(self, "runner_id")

    @runner_id.setter
    def runner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runner_id", value)

    @property
    @pulumi.getter(name="runnerType")
    def runner_type(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional) The type of the runner associated with the action.
        """
        return pulumi.get(self, "runner_type")

    @runner_type.setter
    def runner_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runner_type", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of object. The value returned will be `action`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _AutomationActionsActionState:
    def __init__(__self__, *,
                 action_classification: Optional[pulumi.Input[str]] = None,
                 action_data_reference: Optional[pulumi.Input['AutomationActionsActionActionDataReferenceArgs']] = None,
                 action_type: Optional[pulumi.Input[str]] = None,
                 allow_invocation_from_event_orchestration: Optional[pulumi.Input[str]] = None,
                 allow_invocation_manually: Optional[pulumi.Input[str]] = None,
                 creation_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 map_to_all_services: Optional[pulumi.Input[bool]] = None,
                 modify_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 only_invocable_on_unresolved_incidents: Optional[pulumi.Input[bool]] = None,
                 runner_id: Optional[pulumi.Input[str]] = None,
                 runner_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AutomationActionsAction resources.
        :param pulumi.Input[str] action_classification: The category of the action. The only allowed values are `diagnostic` and `remediation`.
        :param pulumi.Input['AutomationActionsActionActionDataReferenceArgs'] action_data_reference: Action Data block. Action Data is documented below.
        :param pulumi.Input[str] action_type: The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        :param pulumi.Input[str] creation_time: The time action was created. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] description: The description of the action. Max length is 1024 characters.
        :param pulumi.Input[str] modify_time: (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] name: The name of the action. Max length is 255 characters.
        :param pulumi.Input[str] runner_id: The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        :param pulumi.Input[str] runner_type: (Optional) The type of the runner associated with the action.
        :param pulumi.Input[str] type: The type of object. The value returned will be `action`.
        """
        if action_classification is not None:
            pulumi.set(__self__, "action_classification", action_classification)
        if action_data_reference is not None:
            pulumi.set(__self__, "action_data_reference", action_data_reference)
        if action_type is not None:
            pulumi.set(__self__, "action_type", action_type)
        if allow_invocation_from_event_orchestration is not None:
            pulumi.set(__self__, "allow_invocation_from_event_orchestration", allow_invocation_from_event_orchestration)
        if allow_invocation_manually is not None:
            pulumi.set(__self__, "allow_invocation_manually", allow_invocation_manually)
        if creation_time is not None:
            pulumi.set(__self__, "creation_time", creation_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if map_to_all_services is not None:
            pulumi.set(__self__, "map_to_all_services", map_to_all_services)
        if modify_time is not None:
            pulumi.set(__self__, "modify_time", modify_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if only_invocable_on_unresolved_incidents is not None:
            pulumi.set(__self__, "only_invocable_on_unresolved_incidents", only_invocable_on_unresolved_incidents)
        if runner_id is not None:
            pulumi.set(__self__, "runner_id", runner_id)
        if runner_type is not None:
            pulumi.set(__self__, "runner_type", runner_type)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="actionClassification")
    def action_classification(self) -> Optional[pulumi.Input[str]]:
        """
        The category of the action. The only allowed values are `diagnostic` and `remediation`.
        """
        return pulumi.get(self, "action_classification")

    @action_classification.setter
    def action_classification(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action_classification", value)

    @property
    @pulumi.getter(name="actionDataReference")
    def action_data_reference(self) -> Optional[pulumi.Input['AutomationActionsActionActionDataReferenceArgs']]:
        """
        Action Data block. Action Data is documented below.
        """
        return pulumi.get(self, "action_data_reference")

    @action_data_reference.setter
    def action_data_reference(self, value: Optional[pulumi.Input['AutomationActionsActionActionDataReferenceArgs']]):
        pulumi.set(self, "action_data_reference", value)

    @property
    @pulumi.getter(name="actionType")
    def action_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        """
        return pulumi.get(self, "action_type")

    @action_type.setter
    def action_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action_type", value)

    @property
    @pulumi.getter(name="allowInvocationFromEventOrchestration")
    def allow_invocation_from_event_orchestration(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "allow_invocation_from_event_orchestration")

    @allow_invocation_from_event_orchestration.setter
    def allow_invocation_from_event_orchestration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "allow_invocation_from_event_orchestration", value)

    @property
    @pulumi.getter(name="allowInvocationManually")
    def allow_invocation_manually(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "allow_invocation_manually")

    @allow_invocation_manually.setter
    def allow_invocation_manually(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "allow_invocation_manually", value)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time action was created. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "creation_time")

    @creation_time.setter
    def creation_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the action. Max length is 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="mapToAllServices")
    def map_to_all_services(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "map_to_all_services")

    @map_to_all_services.setter
    def map_to_all_services(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "map_to_all_services", value)

    @property
    @pulumi.getter(name="modifyTime")
    def modify_time(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "modify_time")

    @modify_time.setter
    def modify_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modify_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the action. Max length is 255 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="onlyInvocableOnUnresolvedIncidents")
    def only_invocable_on_unresolved_incidents(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "only_invocable_on_unresolved_incidents")

    @only_invocable_on_unresolved_incidents.setter
    def only_invocable_on_unresolved_incidents(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "only_invocable_on_unresolved_incidents", value)

    @property
    @pulumi.getter(name="runnerId")
    def runner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        """
        return pulumi.get(self, "runner_id")

    @runner_id.setter
    def runner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runner_id", value)

    @property
    @pulumi.getter(name="runnerType")
    def runner_type(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional) The type of the runner associated with the action.
        """
        return pulumi.get(self, "runner_type")

    @runner_type.setter
    def runner_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runner_type", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of object. The value returned will be `action`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AutomationActionsAction(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_classification: Optional[pulumi.Input[str]] = None,
                 action_data_reference: Optional[pulumi.Input[Union['AutomationActionsActionActionDataReferenceArgs', 'AutomationActionsActionActionDataReferenceArgsDict']]] = None,
                 action_type: Optional[pulumi.Input[str]] = None,
                 allow_invocation_from_event_orchestration: Optional[pulumi.Input[str]] = None,
                 allow_invocation_manually: Optional[pulumi.Input[str]] = None,
                 creation_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 map_to_all_services: Optional[pulumi.Input[bool]] = None,
                 modify_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 only_invocable_on_unresolved_incidents: Optional[pulumi.Input[bool]] = None,
                 runner_id: Optional[pulumi.Input[str]] = None,
                 runner_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        An Automation Actions [action](https://developer.pagerduty.com/api-reference/d64584a4371d3-create-an-automation-action) invokes jobs and workflows that are staged in Runbook Automation or Process Automation. It may also execute a command line script run by a Process Automation runner installed in your infrastructure.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        pa_action_example = pagerduty.AutomationActionsAction("pa_action_example",
            name="PA Action created via TF",
            description="Description of the PA Action created via TF",
            action_type="process_automation",
            action_data_reference={
                "process_automation_job_id": "P123456",
            })
        script_action_example = pagerduty.AutomationActionsAction("script_action_example",
            name="Script Action created via TF",
            description="Description of the Script Action created via TF",
            action_type="script",
            action_data_reference={
                "script": "print(\\"Hello from a Python script!\\")",
                "invocation_command": "/usr/local/bin/python3",
            })
        ```

        ## Import

        Actions can be imported using the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/automationActionsAction:AutomationActionsAction example 01DER7CUUBF7TH4116K0M4WKPU
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_classification: The category of the action. The only allowed values are `diagnostic` and `remediation`.
        :param pulumi.Input[Union['AutomationActionsActionActionDataReferenceArgs', 'AutomationActionsActionActionDataReferenceArgsDict']] action_data_reference: Action Data block. Action Data is documented below.
        :param pulumi.Input[str] action_type: The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        :param pulumi.Input[str] creation_time: The time action was created. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] description: The description of the action. Max length is 1024 characters.
        :param pulumi.Input[str] modify_time: (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] name: The name of the action. Max length is 255 characters.
        :param pulumi.Input[str] runner_id: The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        :param pulumi.Input[str] runner_type: (Optional) The type of the runner associated with the action.
        :param pulumi.Input[str] type: The type of object. The value returned will be `action`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AutomationActionsActionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Automation Actions [action](https://developer.pagerduty.com/api-reference/d64584a4371d3-create-an-automation-action) invokes jobs and workflows that are staged in Runbook Automation or Process Automation. It may also execute a command line script run by a Process Automation runner installed in your infrastructure.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        pa_action_example = pagerduty.AutomationActionsAction("pa_action_example",
            name="PA Action created via TF",
            description="Description of the PA Action created via TF",
            action_type="process_automation",
            action_data_reference={
                "process_automation_job_id": "P123456",
            })
        script_action_example = pagerduty.AutomationActionsAction("script_action_example",
            name="Script Action created via TF",
            description="Description of the Script Action created via TF",
            action_type="script",
            action_data_reference={
                "script": "print(\\"Hello from a Python script!\\")",
                "invocation_command": "/usr/local/bin/python3",
            })
        ```

        ## Import

        Actions can be imported using the `id`, e.g.

        ```sh
        $ pulumi import pagerduty:index/automationActionsAction:AutomationActionsAction example 01DER7CUUBF7TH4116K0M4WKPU
        ```

        :param str resource_name: The name of the resource.
        :param AutomationActionsActionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AutomationActionsActionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_classification: Optional[pulumi.Input[str]] = None,
                 action_data_reference: Optional[pulumi.Input[Union['AutomationActionsActionActionDataReferenceArgs', 'AutomationActionsActionActionDataReferenceArgsDict']]] = None,
                 action_type: Optional[pulumi.Input[str]] = None,
                 allow_invocation_from_event_orchestration: Optional[pulumi.Input[str]] = None,
                 allow_invocation_manually: Optional[pulumi.Input[str]] = None,
                 creation_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 map_to_all_services: Optional[pulumi.Input[bool]] = None,
                 modify_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 only_invocable_on_unresolved_incidents: Optional[pulumi.Input[bool]] = None,
                 runner_id: Optional[pulumi.Input[str]] = None,
                 runner_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AutomationActionsActionArgs.__new__(AutomationActionsActionArgs)

            __props__.__dict__["action_classification"] = action_classification
            if action_data_reference is None and not opts.urn:
                raise TypeError("Missing required property 'action_data_reference'")
            __props__.__dict__["action_data_reference"] = action_data_reference
            if action_type is None and not opts.urn:
                raise TypeError("Missing required property 'action_type'")
            __props__.__dict__["action_type"] = action_type
            __props__.__dict__["allow_invocation_from_event_orchestration"] = allow_invocation_from_event_orchestration
            __props__.__dict__["allow_invocation_manually"] = allow_invocation_manually
            __props__.__dict__["creation_time"] = creation_time
            __props__.__dict__["description"] = description
            __props__.__dict__["map_to_all_services"] = map_to_all_services
            __props__.__dict__["modify_time"] = modify_time
            __props__.__dict__["name"] = name
            __props__.__dict__["only_invocable_on_unresolved_incidents"] = only_invocable_on_unresolved_incidents
            __props__.__dict__["runner_id"] = runner_id
            __props__.__dict__["runner_type"] = runner_type
            __props__.__dict__["type"] = type
        super(AutomationActionsAction, __self__).__init__(
            'pagerduty:index/automationActionsAction:AutomationActionsAction',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action_classification: Optional[pulumi.Input[str]] = None,
            action_data_reference: Optional[pulumi.Input[Union['AutomationActionsActionActionDataReferenceArgs', 'AutomationActionsActionActionDataReferenceArgsDict']]] = None,
            action_type: Optional[pulumi.Input[str]] = None,
            allow_invocation_from_event_orchestration: Optional[pulumi.Input[str]] = None,
            allow_invocation_manually: Optional[pulumi.Input[str]] = None,
            creation_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            map_to_all_services: Optional[pulumi.Input[bool]] = None,
            modify_time: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            only_invocable_on_unresolved_incidents: Optional[pulumi.Input[bool]] = None,
            runner_id: Optional[pulumi.Input[str]] = None,
            runner_type: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AutomationActionsAction':
        """
        Get an existing AutomationActionsAction resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_classification: The category of the action. The only allowed values are `diagnostic` and `remediation`.
        :param pulumi.Input[Union['AutomationActionsActionActionDataReferenceArgs', 'AutomationActionsActionActionDataReferenceArgsDict']] action_data_reference: Action Data block. Action Data is documented below.
        :param pulumi.Input[str] action_type: The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        :param pulumi.Input[str] creation_time: The time action was created. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] description: The description of the action. Max length is 1024 characters.
        :param pulumi.Input[str] modify_time: (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] name: The name of the action. Max length is 255 characters.
        :param pulumi.Input[str] runner_id: The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        :param pulumi.Input[str] runner_type: (Optional) The type of the runner associated with the action.
        :param pulumi.Input[str] type: The type of object. The value returned will be `action`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AutomationActionsActionState.__new__(_AutomationActionsActionState)

        __props__.__dict__["action_classification"] = action_classification
        __props__.__dict__["action_data_reference"] = action_data_reference
        __props__.__dict__["action_type"] = action_type
        __props__.__dict__["allow_invocation_from_event_orchestration"] = allow_invocation_from_event_orchestration
        __props__.__dict__["allow_invocation_manually"] = allow_invocation_manually
        __props__.__dict__["creation_time"] = creation_time
        __props__.__dict__["description"] = description
        __props__.__dict__["map_to_all_services"] = map_to_all_services
        __props__.__dict__["modify_time"] = modify_time
        __props__.__dict__["name"] = name
        __props__.__dict__["only_invocable_on_unresolved_incidents"] = only_invocable_on_unresolved_incidents
        __props__.__dict__["runner_id"] = runner_id
        __props__.__dict__["runner_type"] = runner_type
        __props__.__dict__["type"] = type
        return AutomationActionsAction(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="actionClassification")
    def action_classification(self) -> pulumi.Output[Optional[str]]:
        """
        The category of the action. The only allowed values are `diagnostic` and `remediation`.
        """
        return pulumi.get(self, "action_classification")

    @property
    @pulumi.getter(name="actionDataReference")
    def action_data_reference(self) -> pulumi.Output['outputs.AutomationActionsActionActionDataReference']:
        """
        Action Data block. Action Data is documented below.
        """
        return pulumi.get(self, "action_data_reference")

    @property
    @pulumi.getter(name="actionType")
    def action_type(self) -> pulumi.Output[str]:
        """
        The type of the action. The only allowed values are `process_automation` and `script`. Cannot be changed once set.
        """
        return pulumi.get(self, "action_type")

    @property
    @pulumi.getter(name="allowInvocationFromEventOrchestration")
    def allow_invocation_from_event_orchestration(self) -> pulumi.Output[str]:
        return pulumi.get(self, "allow_invocation_from_event_orchestration")

    @property
    @pulumi.getter(name="allowInvocationManually")
    def allow_invocation_manually(self) -> pulumi.Output[str]:
        return pulumi.get(self, "allow_invocation_manually")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> pulumi.Output[str]:
        """
        The time action was created. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the action. Max length is 1024 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="mapToAllServices")
    def map_to_all_services(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "map_to_all_services")

    @property
    @pulumi.getter(name="modifyTime")
    def modify_time(self) -> pulumi.Output[str]:
        """
        (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "modify_time")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the action. Max length is 255 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="onlyInvocableOnUnresolvedIncidents")
    def only_invocable_on_unresolved_incidents(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "only_invocable_on_unresolved_incidents")

    @property
    @pulumi.getter(name="runnerId")
    def runner_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Process Automation Actions runner to associate the action with. Cannot be changed for the `process_automation` action type once set.
        """
        return pulumi.get(self, "runner_id")

    @property
    @pulumi.getter(name="runnerType")
    def runner_type(self) -> pulumi.Output[str]:
        """
        (Optional) The type of the runner associated with the action.
        """
        return pulumi.get(self, "runner_type")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of object. The value returned will be `action`.
        """
        return pulumi.get(self, "type")

