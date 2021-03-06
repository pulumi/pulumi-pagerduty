# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ServiceIntegrationArgs', 'ServiceIntegration']

@pulumi.input_type
class ServiceIntegrationArgs:
    def __init__(__self__, *,
                 service: pulumi.Input[str],
                 integration_email: Optional[pulumi.Input[str]] = None,
                 integration_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vendor: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServiceIntegration resource.
        :param pulumi.Input[str] service: The ID of the service the integration should belong to.
        :param pulumi.Input[str] integration_email: This is the unique fully-qualified email address used for routing emails to this integration for processing.
        :param pulumi.Input[str] integration_key: This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        :param pulumi.Input[str] name: The name of the service integration.
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
        pulumi.set(__self__, "service", service)
        if integration_email is not None:
            pulumi.set(__self__, "integration_email", integration_email)
        if integration_key is not None:
            pulumi.set(__self__, "integration_key", integration_key)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if vendor is not None:
            pulumi.set(__self__, "vendor", vendor)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[str]:
        """
        The ID of the service the integration should belong to.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter(name="integrationEmail")
    def integration_email(self) -> Optional[pulumi.Input[str]]:
        """
        This is the unique fully-qualified email address used for routing emails to this integration for processing.
        """
        return pulumi.get(self, "integration_email")

    @integration_email.setter
    def integration_email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration_email", value)

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> Optional[pulumi.Input[str]]:
        """
        This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        """
        return pulumi.get(self, "integration_key")

    @integration_key.setter
    def integration_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration_key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the service integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
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

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def vendor(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
        """
        return pulumi.get(self, "vendor")

    @vendor.setter
    def vendor(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vendor", value)


@pulumi.input_type
class _ServiceIntegrationState:
    def __init__(__self__, *,
                 html_url: Optional[pulumi.Input[str]] = None,
                 integration_email: Optional[pulumi.Input[str]] = None,
                 integration_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vendor: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceIntegration resources.
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
        if html_url is not None:
            pulumi.set(__self__, "html_url", html_url)
        if integration_email is not None:
            pulumi.set(__self__, "integration_email", integration_email)
        if integration_key is not None:
            pulumi.set(__self__, "integration_key", integration_key)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if vendor is not None:
            pulumi.set(__self__, "vendor", vendor)

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> Optional[pulumi.Input[str]]:
        """
        URL at which the entity is uniquely displayed in the Web app
        """
        return pulumi.get(self, "html_url")

    @html_url.setter
    def html_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "html_url", value)

    @property
    @pulumi.getter(name="integrationEmail")
    def integration_email(self) -> Optional[pulumi.Input[str]]:
        """
        This is the unique fully-qualified email address used for routing emails to this integration for processing.
        """
        return pulumi.get(self, "integration_email")

    @integration_email.setter
    def integration_email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration_email", value)

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> Optional[pulumi.Input[str]]:
        """
        This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        """
        return pulumi.get(self, "integration_key")

    @integration_key.setter
    def integration_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration_key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the service integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the service the integration should belong to.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
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

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def vendor(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
        """
        return pulumi.get(self, "vendor")

    @vendor.setter
    def vendor(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vendor", value)


class ServiceIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 integration_email: Optional[pulumi.Input[str]] = None,
                 integration_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vendor: Optional[pulumi.Input[str]] = None,
                 __props__=None):
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
                    type="user",
                    id=example_user.id,
                )],
            )])
        example_service = pagerduty.Service("exampleService",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=pagerduty_escalation_policy["example"]["id"])
        example_service_integration = pagerduty.ServiceIntegration("exampleServiceIntegration",
            type="generic_events_api_inbound_integration",
            service=example_service.id)
        apiv2 = pagerduty.ServiceIntegration("apiv2",
            type="events_api_v2_inbound_integration",
            integration_key="12345678910testtesttesttesttes",
            service=example_service.id)
        email_x = pagerduty.ServiceIntegration("emailX",
            type="generic_email_inbound_integration",
            integration_email="ecommerce@subdomain.pagerduty.com",
            service=example_service.id)
        datadog_vendor = pagerduty.get_vendor(name="Datadog")
        datadog_service_integration = pagerduty.ServiceIntegration("datadogServiceIntegration",
            service=example_service.id,
            vendor=datadog_vendor.id)
        cloudwatch_vendor = pagerduty.get_vendor(name="Cloudwatch")
        cloudwatch_service_integration = pagerduty.ServiceIntegration("cloudwatchServiceIntegration",
            service=example_service.id,
            vendor=cloudwatch_vendor.id)
        ```

        ## Import

        Services can be imported using their related `service` id and service integration `id` separated by a dot, e.g.

        ```sh
         $ pulumi import pagerduty:index/serviceIntegration:ServiceIntegration main PLSSSSS.PLIIIII
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
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
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
                    type="user",
                    id=example_user.id,
                )],
            )])
        example_service = pagerduty.Service("exampleService",
            auto_resolve_timeout="14400",
            acknowledgement_timeout="600",
            escalation_policy=pagerduty_escalation_policy["example"]["id"])
        example_service_integration = pagerduty.ServiceIntegration("exampleServiceIntegration",
            type="generic_events_api_inbound_integration",
            service=example_service.id)
        apiv2 = pagerduty.ServiceIntegration("apiv2",
            type="events_api_v2_inbound_integration",
            integration_key="12345678910testtesttesttesttes",
            service=example_service.id)
        email_x = pagerduty.ServiceIntegration("emailX",
            type="generic_email_inbound_integration",
            integration_email="ecommerce@subdomain.pagerduty.com",
            service=example_service.id)
        datadog_vendor = pagerduty.get_vendor(name="Datadog")
        datadog_service_integration = pagerduty.ServiceIntegration("datadogServiceIntegration",
            service=example_service.id,
            vendor=datadog_vendor.id)
        cloudwatch_vendor = pagerduty.get_vendor(name="Cloudwatch")
        cloudwatch_service_integration = pagerduty.ServiceIntegration("cloudwatchServiceIntegration",
            service=example_service.id,
            vendor=cloudwatch_vendor.id)
        ```

        ## Import

        Services can be imported using their related `service` id and service integration `id` separated by a dot, e.g.

        ```sh
         $ pulumi import pagerduty:index/serviceIntegration:ServiceIntegration main PLSSSSS.PLIIIII
        ```

        :param str resource_name: The name of the resource.
        :param ServiceIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 integration_email: Optional[pulumi.Input[str]] = None,
                 integration_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vendor: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceIntegrationArgs.__new__(ServiceIntegrationArgs)

            __props__.__dict__["integration_email"] = integration_email
            __props__.__dict__["integration_key"] = integration_key
            __props__.__dict__["name"] = name
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
            __props__.__dict__["type"] = type
            __props__.__dict__["vendor"] = vendor
            __props__.__dict__["html_url"] = None
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

        __props__ = _ServiceIntegrationState.__new__(_ServiceIntegrationState)

        __props__.__dict__["html_url"] = html_url
        __props__.__dict__["integration_email"] = integration_email
        __props__.__dict__["integration_key"] = integration_key
        __props__.__dict__["name"] = name
        __props__.__dict__["service"] = service
        __props__.__dict__["type"] = type
        __props__.__dict__["vendor"] = vendor
        return ServiceIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> pulumi.Output[str]:
        """
        URL at which the entity is uniquely displayed in the Web app
        """
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter(name="integrationEmail")
    def integration_email(self) -> pulumi.Output[str]:
        """
        This is the unique fully-qualified email address used for routing emails to this integration for processing.
        """
        return pulumi.get(self, "integration_email")

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> pulumi.Output[str]:
        """
        This is the unique key used to route events to this integration when received via the PagerDuty Events API.
        """
        return pulumi.get(self, "integration_key")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the service integration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[str]:
        """
        The ID of the service the integration should belong to.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
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
    def vendor(self) -> pulumi.Output[str]:
        """
        The ID of the vendor the integration should integrate with (e.g Datadog or Amazon Cloudwatch).
        """
        return pulumi.get(self, "vendor")

