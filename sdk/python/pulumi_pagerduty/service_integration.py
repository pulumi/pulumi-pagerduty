# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['ServiceIntegration']


class ServiceIntegration(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 integration_email: Optional[pulumi.Input[str]] = None,
                 integration_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vendor: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        A [service integration](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Services/post_services_id_integrations) is an integration that belongs to a service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example_user = pagerduty.User("exampleUser",
            email="125.greenholt.earline@graham.name",
            teams=[pagerduty_team["example"]["id"]])
        foo = pagerduty.EscalationPolicy("foo",
            num_loops=2,
            rules=[pagerduty.EscalationPolicyRuleArgs(
                escalation_delay_in_minutes=10,
                targets=[pagerduty.EscalationPolicyRuleTargetArgs(
                    id=example_user.id,
                    type="user",
                )],
            )])
        example_service = pagerduty.Service("exampleService",
            acknowledgement_timeout="600",
            auto_resolve_timeout="14400",
            escalation_policy=pagerduty_escalation_policy["example"]["id"])
        example_service_integration = pagerduty.ServiceIntegration("exampleServiceIntegration",
            service=example_service.id,
            type="generic_events_api_inbound_integration")
        datadog_vendor = pagerduty.get_vendor(name="Datadog")
        datadog_service_integration = pagerduty.ServiceIntegration("datadogServiceIntegration",
            service=example_service.id,
            vendor=datadog_vendor.id)
        cloudwatch_vendor = pagerduty.get_vendor(name="Cloudwatch")
        cloudwatch_service_integration = pagerduty.ServiceIntegration("cloudwatchServiceIntegration",
            service=example_service.id,
            vendor=cloudwatch_vendor.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] integration_email: This is the unique fully-qualified email address used for routing emails to this integration for processing.
        :param pulumi.Input[str] integration_key: This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        :param pulumi.Input[str] name: The name of the service integration.
        :param pulumi.Input[str] service: The ID of the service the integration should belong to.
        :param pulumi.Input[str] type: The service type. Can be:
               `aws_cloudwatch_inbound_integration`,
               `cloudkick_inbound_integration`,
               `event_transformer_api_inbound_integration`,
               `events_api_v2_inbound_integration` (requires service `alert_creation` to be `create_alerts_and_incidents`),
               `generic_email_inbound_integration`,
               `generic_events_api_inbound_integration`,
               `keynote_inbound_integration`,
               `nagios_inbound_integration`,
               `pingdom_inbound_integration`or `sql_monitor_inbound_integration`.
        :param pulumi.Input[str] vendor: The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['integration_email'] = integration_email
            __props__['integration_key'] = integration_key
            __props__['name'] = name
            if service is None:
                raise TypeError("Missing required property 'service'")
            __props__['service'] = service
            __props__['type'] = type
            __props__['vendor'] = vendor
            __props__['html_url'] = None
        super(ServiceIntegration, __self__).__init__(
            'pagerduty:index/serviceIntegration:ServiceIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            html_url: Optional[pulumi.Input[str]] = None,
            integration_email: Optional[pulumi.Input[str]] = None,
            integration_key: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            service: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            vendor: Optional[pulumi.Input[str]] = None) -> 'ServiceIntegration':
        """
        Get an existing ServiceIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] html_url: URL at which the entity is uniquely displayed in the Web app
        :param pulumi.Input[str] integration_email: This is the unique fully-qualified email address used for routing emails to this integration for processing.
        :param pulumi.Input[str] integration_key: This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        :param pulumi.Input[str] name: The name of the service integration.
        :param pulumi.Input[str] service: The ID of the service the integration should belong to.
        :param pulumi.Input[str] type: The service type. Can be:
               `aws_cloudwatch_inbound_integration`,
               `cloudkick_inbound_integration`,
               `event_transformer_api_inbound_integration`,
               `events_api_v2_inbound_integration` (requires service `alert_creation` to be `create_alerts_and_incidents`),
               `generic_email_inbound_integration`,
               `generic_events_api_inbound_integration`,
               `keynote_inbound_integration`,
               `nagios_inbound_integration`,
               `pingdom_inbound_integration`or `sql_monitor_inbound_integration`.
        :param pulumi.Input[str] vendor: The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["html_url"] = html_url
        __props__["integration_email"] = integration_email
        __props__["integration_key"] = integration_key
        __props__["name"] = name
        __props__["service"] = service
        __props__["type"] = type
        __props__["vendor"] = vendor
        return ServiceIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> str:
        """
        URL at which the entity is uniquely displayed in the Web app
        """
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter(name="integrationEmail")
    def integration_email(self) -> str:
        """
        This is the unique fully-qualified email address used for routing emails to this integration for processing.
        """
        return pulumi.get(self, "integration_email")

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> str:
        """
        This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        """
        return pulumi.get(self, "integration_key")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the service integration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def service(self) -> str:
        """
        The ID of the service the integration should belong to.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The service type. Can be:
        `aws_cloudwatch_inbound_integration`,
        `cloudkick_inbound_integration`,
        `event_transformer_api_inbound_integration`,
        `events_api_v2_inbound_integration` (requires service `alert_creation` to be `create_alerts_and_incidents`),
        `generic_email_inbound_integration`,
        `generic_events_api_inbound_integration`,
        `keynote_inbound_integration`,
        `nagios_inbound_integration`,
        `pingdom_inbound_integration`or `sql_monitor_inbound_integration`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def vendor(self) -> str:
        """
        The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
        """
        return pulumi.get(self, "vendor")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

