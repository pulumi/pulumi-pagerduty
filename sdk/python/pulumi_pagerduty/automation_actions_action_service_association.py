# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AutomationActionsActionServiceAssociationArgs', 'AutomationActionsActionServiceAssociation']

@pulumi.input_type
class AutomationActionsActionServiceAssociationArgs:
    def __init__(__self__, *,
                 action_id: pulumi.Input[str],
                 service_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a AutomationActionsActionServiceAssociation resource.
        :param pulumi.Input[str] action_id: Id of the action.
        :param pulumi.Input[str] service_id: Id of the service associated to the action.
        """
        pulumi.set(__self__, "action_id", action_id)
        pulumi.set(__self__, "service_id", service_id)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> pulumi.Input[str]:
        """
        Id of the action.
        """
        return pulumi.get(self, "action_id")

    @action_id.setter
    def action_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "action_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[str]:
        """
        Id of the service associated to the action.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_id", value)


@pulumi.input_type
class _AutomationActionsActionServiceAssociationState:
    def __init__(__self__, *,
                 action_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AutomationActionsActionServiceAssociation resources.
        :param pulumi.Input[str] action_id: Id of the action.
        :param pulumi.Input[str] service_id: Id of the service associated to the action.
        """
        if action_id is not None:
            pulumi.set(__self__, "action_id", action_id)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the action.
        """
        return pulumi.get(self, "action_id")

    @action_id.setter
    def action_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the service associated to the action.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)


class AutomationActionsActionServiceAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        An Automation Actions [action association with a service](https://developer.pagerduty.com/api-reference/5d2f051f3fb43-associate-an-automation-action-with-a-service) configures the relation of a specific Action with a Service.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example_user = pagerduty.User("exampleUser", email="125.greenholt.earline@graham.name")
        foo_escalation_policy = pagerduty.EscalationPolicy("fooEscalationPolicy",
            num_loops=2,
            rules=[pagerduty.EscalationPolicyRuleArgs(
                escalation_delay_in_minutes=10,
                targets=[pagerduty.EscalationPolicyRuleTargetArgs(
                    type="user_reference",
                    id=example_user.id,
                )],
            )])
        example_service = pagerduty.Service("exampleService",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=foo_escalation_policy.id,
            alert_creation="create_alerts_and_incidents",
            auto_pause_notifications_parameters=pagerduty.ServiceAutoPauseNotificationsParametersArgs(
                enabled=True,
                timeout=300,
            ))
        pa_action_example = pagerduty.AutomationActionsAction("paActionExample",
            description="Description of the PA Action created via TF",
            action_type="process_automation",
            action_data_reference=pagerduty.AutomationActionsActionActionDataReferenceArgs(
                process_automation_job_id="P123456",
            ))
        foo_automation_actions_action_service_association = pagerduty.AutomationActionsActionServiceAssociation("fooAutomationActionsActionServiceAssociation",
            action_id=pa_action_example.id,
            service_id=example_service.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Action service association can be imported using the `action_id` and `service_id` separated by a colon, e.g.

        ```sh
        $ pulumi import pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_id: Id of the action.
        :param pulumi.Input[str] service_id: Id of the service associated to the action.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AutomationActionsActionServiceAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An Automation Actions [action association with a service](https://developer.pagerduty.com/api-reference/5d2f051f3fb43-associate-an-automation-action-with-a-service) configures the relation of a specific Action with a Service.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example_user = pagerduty.User("exampleUser", email="125.greenholt.earline@graham.name")
        foo_escalation_policy = pagerduty.EscalationPolicy("fooEscalationPolicy",
            num_loops=2,
            rules=[pagerduty.EscalationPolicyRuleArgs(
                escalation_delay_in_minutes=10,
                targets=[pagerduty.EscalationPolicyRuleTargetArgs(
                    type="user_reference",
                    id=example_user.id,
                )],
            )])
        example_service = pagerduty.Service("exampleService",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=foo_escalation_policy.id,
            alert_creation="create_alerts_and_incidents",
            auto_pause_notifications_parameters=pagerduty.ServiceAutoPauseNotificationsParametersArgs(
                enabled=True,
                timeout=300,
            ))
        pa_action_example = pagerduty.AutomationActionsAction("paActionExample",
            description="Description of the PA Action created via TF",
            action_type="process_automation",
            action_data_reference=pagerduty.AutomationActionsActionActionDataReferenceArgs(
                process_automation_job_id="P123456",
            ))
        foo_automation_actions_action_service_association = pagerduty.AutomationActionsActionServiceAssociation("fooAutomationActionsActionServiceAssociation",
            action_id=pa_action_example.id,
            service_id=example_service.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Action service association can be imported using the `action_id` and `service_id` separated by a colon, e.g.

        ```sh
        $ pulumi import pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
        ```

        :param str resource_name: The name of the resource.
        :param AutomationActionsActionServiceAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AutomationActionsActionServiceAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AutomationActionsActionServiceAssociationArgs.__new__(AutomationActionsActionServiceAssociationArgs)

            if action_id is None and not opts.urn:
                raise TypeError("Missing required property 'action_id'")
            __props__.__dict__["action_id"] = action_id
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
        super(AutomationActionsActionServiceAssociation, __self__).__init__(
            'pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action_id: Optional[pulumi.Input[str]] = None,
            service_id: Optional[pulumi.Input[str]] = None) -> 'AutomationActionsActionServiceAssociation':
        """
        Get an existing AutomationActionsActionServiceAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_id: Id of the action.
        :param pulumi.Input[str] service_id: Id of the service associated to the action.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AutomationActionsActionServiceAssociationState.__new__(_AutomationActionsActionServiceAssociationState)

        __props__.__dict__["action_id"] = action_id
        __props__.__dict__["service_id"] = service_id
        return AutomationActionsActionServiceAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> pulumi.Output[str]:
        """
        Id of the action.
        """
        return pulumi.get(self, "action_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        Id of the service associated to the action.
        """
        return pulumi.get(self, "service_id")

