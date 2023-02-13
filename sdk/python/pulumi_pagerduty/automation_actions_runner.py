# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AutomationActionsRunnerArgs', 'AutomationActionsRunner']

@pulumi.input_type
class AutomationActionsRunnerArgs:
    def __init__(__self__, *,
                 runner_type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 last_seen: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runbook_api_key: Optional[pulumi.Input[str]] = None,
                 runbook_base_uri: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AutomationActionsRunner resource.
        :param pulumi.Input[str] runner_type: The type of runner. The only allowed values is `runbook`.
        :param pulumi.Input[str] description: The description of the runner. Max length is 1024 characters.
        :param pulumi.Input[str] last_seen: (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] name: The name of the runner. Max length is 255 characters.
        :param pulumi.Input[str] runbook_api_key: The unique User API Token created in Runbook Automation.
        :param pulumi.Input[str] runbook_base_uri: The subdomain for your Runbook Automation Instance.
        """
        pulumi.set(__self__, "runner_type", runner_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if last_seen is not None:
            pulumi.set(__self__, "last_seen", last_seen)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if runbook_api_key is not None:
            pulumi.set(__self__, "runbook_api_key", runbook_api_key)
        if runbook_base_uri is not None:
            pulumi.set(__self__, "runbook_base_uri", runbook_base_uri)

    @property
    @pulumi.getter(name="runnerType")
    def runner_type(self) -> pulumi.Input[str]:
        """
        The type of runner. The only allowed values is `runbook`.
        """
        return pulumi.get(self, "runner_type")

    @runner_type.setter
    def runner_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "runner_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the runner. Max length is 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastSeen")
    def last_seen(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "last_seen")

    @last_seen.setter
    def last_seen(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_seen", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the runner. Max length is 255 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="runbookApiKey")
    def runbook_api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The unique User API Token created in Runbook Automation.
        """
        return pulumi.get(self, "runbook_api_key")

    @runbook_api_key.setter
    def runbook_api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_api_key", value)

    @property
    @pulumi.getter(name="runbookBaseUri")
    def runbook_base_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The subdomain for your Runbook Automation Instance.
        """
        return pulumi.get(self, "runbook_base_uri")

    @runbook_base_uri.setter
    def runbook_base_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_base_uri", value)


@pulumi.input_type
class _AutomationActionsRunnerState:
    def __init__(__self__, *,
                 creation_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_seen: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runbook_api_key: Optional[pulumi.Input[str]] = None,
                 runbook_base_uri: Optional[pulumi.Input[str]] = None,
                 runner_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AutomationActionsRunner resources.
        :param pulumi.Input[str] creation_time: The time runner was created. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] description: The description of the runner. Max length is 1024 characters.
        :param pulumi.Input[str] last_seen: (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] name: The name of the runner. Max length is 255 characters.
        :param pulumi.Input[str] runbook_api_key: The unique User API Token created in Runbook Automation.
        :param pulumi.Input[str] runbook_base_uri: The subdomain for your Runbook Automation Instance.
        :param pulumi.Input[str] runner_type: The type of runner. The only allowed values is `runbook`.
        :param pulumi.Input[str] type: The type of object. The value returned will be `runner`.
        """
        if creation_time is not None:
            pulumi.set(__self__, "creation_time", creation_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if last_seen is not None:
            pulumi.set(__self__, "last_seen", last_seen)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if runbook_api_key is not None:
            pulumi.set(__self__, "runbook_api_key", runbook_api_key)
        if runbook_base_uri is not None:
            pulumi.set(__self__, "runbook_base_uri", runbook_base_uri)
        if runner_type is not None:
            pulumi.set(__self__, "runner_type", runner_type)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time runner was created. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "creation_time")

    @creation_time.setter
    def creation_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the runner. Max length is 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastSeen")
    def last_seen(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "last_seen")

    @last_seen.setter
    def last_seen(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_seen", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the runner. Max length is 255 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="runbookApiKey")
    def runbook_api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The unique User API Token created in Runbook Automation.
        """
        return pulumi.get(self, "runbook_api_key")

    @runbook_api_key.setter
    def runbook_api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_api_key", value)

    @property
    @pulumi.getter(name="runbookBaseUri")
    def runbook_base_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The subdomain for your Runbook Automation Instance.
        """
        return pulumi.get(self, "runbook_base_uri")

    @runbook_base_uri.setter
    def runbook_base_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_base_uri", value)

    @property
    @pulumi.getter(name="runnerType")
    def runner_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of runner. The only allowed values is `runbook`.
        """
        return pulumi.get(self, "runner_type")

    @runner_type.setter
    def runner_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runner_type", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of object. The value returned will be `runner`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AutomationActionsRunner(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_seen: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runbook_api_key: Optional[pulumi.Input[str]] = None,
                 runbook_base_uri: Optional[pulumi.Input[str]] = None,
                 runner_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        An Automation Actions [runner](https://developer.pagerduty.com/api-reference/d78999fb7e863-create-an-automation-action-runner) is the method for how actions are executed. This can be done locally using an installed runner agent or as a connection to a PD Runbook Automation instance.

        > Only Runbook Automation (runbook) runners can be created.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        config = pulumi.Config()
        r_unbookapikey = config.require("rUNBOOKAPIKEY")
        example = pagerduty.AutomationActionsRunner("example",
            description="Description of the Runner created via TF",
            runner_type="runbook",
            runbook_base_uri="rdcat.stg",
            runbook_api_key=r_unbookapikey)
        ```

        ## Import

        -> In the example below the `runbook_api_key` attribute has been omitted to avoid resource replacement after the import. Runners can be imported using the `id`, e.g. resource "pagerduty_automation_actions_runner" "example" {

         name = "Runner created via TF"

         description = "Description of the Runner created via TF"

         runner_type = "runbook"

         runbook_base_uri = "rdcat.stg" }

        ```sh
         $ pulumi import pagerduty:index/automationActionsRunner:AutomationActionsRunner example 01DER7CUUBF7TH4116K0M4WKPU
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the runner. Max length is 1024 characters.
        :param pulumi.Input[str] last_seen: (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] name: The name of the runner. Max length is 255 characters.
        :param pulumi.Input[str] runbook_api_key: The unique User API Token created in Runbook Automation.
        :param pulumi.Input[str] runbook_base_uri: The subdomain for your Runbook Automation Instance.
        :param pulumi.Input[str] runner_type: The type of runner. The only allowed values is `runbook`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AutomationActionsRunnerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Automation Actions [runner](https://developer.pagerduty.com/api-reference/d78999fb7e863-create-an-automation-action-runner) is the method for how actions are executed. This can be done locally using an installed runner agent or as a connection to a PD Runbook Automation instance.

        > Only Runbook Automation (runbook) runners can be created.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        config = pulumi.Config()
        r_unbookapikey = config.require("rUNBOOKAPIKEY")
        example = pagerduty.AutomationActionsRunner("example",
            description="Description of the Runner created via TF",
            runner_type="runbook",
            runbook_base_uri="rdcat.stg",
            runbook_api_key=r_unbookapikey)
        ```

        ## Import

        -> In the example below the `runbook_api_key` attribute has been omitted to avoid resource replacement after the import. Runners can be imported using the `id`, e.g. resource "pagerduty_automation_actions_runner" "example" {

         name = "Runner created via TF"

         description = "Description of the Runner created via TF"

         runner_type = "runbook"

         runbook_base_uri = "rdcat.stg" }

        ```sh
         $ pulumi import pagerduty:index/automationActionsRunner:AutomationActionsRunner example 01DER7CUUBF7TH4116K0M4WKPU
        ```

        :param str resource_name: The name of the resource.
        :param AutomationActionsRunnerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AutomationActionsRunnerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_seen: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runbook_api_key: Optional[pulumi.Input[str]] = None,
                 runbook_base_uri: Optional[pulumi.Input[str]] = None,
                 runner_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AutomationActionsRunnerArgs.__new__(AutomationActionsRunnerArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["last_seen"] = last_seen
            __props__.__dict__["name"] = name
            __props__.__dict__["runbook_api_key"] = None if runbook_api_key is None else pulumi.Output.secret(runbook_api_key)
            __props__.__dict__["runbook_base_uri"] = runbook_base_uri
            if runner_type is None and not opts.urn:
                raise TypeError("Missing required property 'runner_type'")
            __props__.__dict__["runner_type"] = runner_type
            __props__.__dict__["creation_time"] = None
            __props__.__dict__["type"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["runbookApiKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AutomationActionsRunner, __self__).__init__(
            'pagerduty:index/automationActionsRunner:AutomationActionsRunner',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            creation_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            last_seen: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            runbook_api_key: Optional[pulumi.Input[str]] = None,
            runbook_base_uri: Optional[pulumi.Input[str]] = None,
            runner_type: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AutomationActionsRunner':
        """
        Get an existing AutomationActionsRunner resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] creation_time: The time runner was created. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] description: The description of the runner. Max length is 1024 characters.
        :param pulumi.Input[str] last_seen: (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
        :param pulumi.Input[str] name: The name of the runner. Max length is 255 characters.
        :param pulumi.Input[str] runbook_api_key: The unique User API Token created in Runbook Automation.
        :param pulumi.Input[str] runbook_base_uri: The subdomain for your Runbook Automation Instance.
        :param pulumi.Input[str] runner_type: The type of runner. The only allowed values is `runbook`.
        :param pulumi.Input[str] type: The type of object. The value returned will be `runner`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AutomationActionsRunnerState.__new__(_AutomationActionsRunnerState)

        __props__.__dict__["creation_time"] = creation_time
        __props__.__dict__["description"] = description
        __props__.__dict__["last_seen"] = last_seen
        __props__.__dict__["name"] = name
        __props__.__dict__["runbook_api_key"] = runbook_api_key
        __props__.__dict__["runbook_base_uri"] = runbook_base_uri
        __props__.__dict__["runner_type"] = runner_type
        __props__.__dict__["type"] = type
        return AutomationActionsRunner(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> pulumi.Output[str]:
        """
        The time runner was created. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the runner. Max length is 1024 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="lastSeen")
    def last_seen(self) -> pulumi.Output[str]:
        """
        (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
        """
        return pulumi.get(self, "last_seen")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the runner. Max length is 255 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="runbookApiKey")
    def runbook_api_key(self) -> pulumi.Output[Optional[str]]:
        """
        The unique User API Token created in Runbook Automation.
        """
        return pulumi.get(self, "runbook_api_key")

    @property
    @pulumi.getter(name="runbookBaseUri")
    def runbook_base_uri(self) -> pulumi.Output[Optional[str]]:
        """
        The subdomain for your Runbook Automation Instance.
        """
        return pulumi.get(self, "runbook_base_uri")

    @property
    @pulumi.getter(name="runnerType")
    def runner_type(self) -> pulumi.Output[str]:
        """
        The type of runner. The only allowed values is `runbook`.
        """
        return pulumi.get(self, "runner_type")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of object. The value returned will be `runner`.
        """
        return pulumi.get(self, "type")

