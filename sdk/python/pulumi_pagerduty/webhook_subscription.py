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
from ._inputs import *

__all__ = ['WebhookSubscriptionArgs', 'WebhookSubscription']

@pulumi.input_type
class WebhookSubscriptionArgs:
    def __init__(__self__, *,
                 delivery_methods: pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]],
                 events: pulumi.Input[Sequence[pulumi.Input[str]]],
                 filters: pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]],
                 active: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WebhookSubscription resource.
        :param pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]] delivery_methods: The object describing where to send the webhooks.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: A set of outbound event types the webhook will receive. The follow event types are possible: 
               * `incident.acknowledged`
               * `incident.annotated`
               * `incident.delegated`
               * `incident.escalated`
               * `incident.priority_updated`
               * `incident.reassigned`
               * `incident.reopened`
               * `incident.resolved`
               * `incident.responder.added`
               * `incident.responder.replied`
               * `incident.status_update_published`
               * `incident.triggered`
               * `incident.unacknowledged`
        :param pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]] filters: determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        :param pulumi.Input[bool] active: Determines whether the subscription will produce webhook events.
        :param pulumi.Input[str] description: A short description of the webhook subscription
        :param pulumi.Input[str] type: The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        """
        WebhookSubscriptionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            delivery_methods=delivery_methods,
            events=events,
            filters=filters,
            active=active,
            description=description,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             delivery_methods: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]]] = None,
             events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             filters: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]]] = None,
             active: Optional[pulumi.Input[bool]] = None,
             description: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if delivery_methods is None and 'deliveryMethods' in kwargs:
            delivery_methods = kwargs['deliveryMethods']
        if delivery_methods is None:
            raise TypeError("Missing 'delivery_methods' argument")
        if events is None:
            raise TypeError("Missing 'events' argument")
        if filters is None:
            raise TypeError("Missing 'filters' argument")

        _setter("delivery_methods", delivery_methods)
        _setter("events", events)
        _setter("filters", filters)
        if active is not None:
            _setter("active", active)
        if description is not None:
            _setter("description", description)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="deliveryMethods")
    def delivery_methods(self) -> pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]]:
        """
        The object describing where to send the webhooks.
        """
        return pulumi.get(self, "delivery_methods")

    @delivery_methods.setter
    def delivery_methods(self, value: pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]]):
        pulumi.set(self, "delivery_methods", value)

    @property
    @pulumi.getter
    def events(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A set of outbound event types the webhook will receive. The follow event types are possible: 
        * `incident.acknowledged`
        * `incident.annotated`
        * `incident.delegated`
        * `incident.escalated`
        * `incident.priority_updated`
        * `incident.reassigned`
        * `incident.reopened`
        * `incident.resolved`
        * `incident.responder.added`
        * `incident.responder.replied`
        * `incident.status_update_published`
        * `incident.triggered`
        * `incident.unacknowledged`
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "events", value)

    @property
    @pulumi.getter
    def filters(self) -> pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]]:
        """
        determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines whether the subscription will produce webhook events.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A short description of the webhook subscription
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _WebhookSubscriptionState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 delivery_methods: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WebhookSubscription resources.
        :param pulumi.Input[bool] active: Determines whether the subscription will produce webhook events.
        :param pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]] delivery_methods: The object describing where to send the webhooks.
        :param pulumi.Input[str] description: A short description of the webhook subscription
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: A set of outbound event types the webhook will receive. The follow event types are possible: 
               * `incident.acknowledged`
               * `incident.annotated`
               * `incident.delegated`
               * `incident.escalated`
               * `incident.priority_updated`
               * `incident.reassigned`
               * `incident.reopened`
               * `incident.resolved`
               * `incident.responder.added`
               * `incident.responder.replied`
               * `incident.status_update_published`
               * `incident.triggered`
               * `incident.unacknowledged`
        :param pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]] filters: determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        :param pulumi.Input[str] type: The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        """
        _WebhookSubscriptionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            active=active,
            delivery_methods=delivery_methods,
            description=description,
            events=events,
            filters=filters,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             active: Optional[pulumi.Input[bool]] = None,
             delivery_methods: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]]] = None,
             description: Optional[pulumi.Input[str]] = None,
             events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             filters: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if delivery_methods is None and 'deliveryMethods' in kwargs:
            delivery_methods = kwargs['deliveryMethods']

        if active is not None:
            _setter("active", active)
        if delivery_methods is not None:
            _setter("delivery_methods", delivery_methods)
        if description is not None:
            _setter("description", description)
        if events is not None:
            _setter("events", events)
        if filters is not None:
            _setter("filters", filters)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines whether the subscription will produce webhook events.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="deliveryMethods")
    def delivery_methods(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]]]:
        """
        The object describing where to send the webhooks.
        """
        return pulumi.get(self, "delivery_methods")

    @delivery_methods.setter
    def delivery_methods(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionDeliveryMethodArgs']]]]):
        pulumi.set(self, "delivery_methods", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A short description of the webhook subscription
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def events(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A set of outbound event types the webhook will receive. The follow event types are possible: 
        * `incident.acknowledged`
        * `incident.annotated`
        * `incident.delegated`
        * `incident.escalated`
        * `incident.priority_updated`
        * `incident.reassigned`
        * `incident.reopened`
        * `incident.resolved`
        * `incident.responder.added`
        * `incident.responder.replied`
        * `incident.status_update_published`
        * `incident.triggered`
        * `incident.unacknowledged`
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "events", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]]]:
        """
        determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookSubscriptionFilterArgs']]]]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class WebhookSubscription(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 delivery_methods: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionDeliveryMethodArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionFilterArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A [webhook subscription](https://developer.pagerduty.com/docs/ZG9jOjExMDI5NTkw-v3-overview) allow you to receive HTTP callbacks when incidents are created, updated and deleted. These are also known as V3 Webhooks.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.get_service(name="My Service")
        foo = pagerduty.WebhookSubscription("foo",
            delivery_methods=[pagerduty.WebhookSubscriptionDeliveryMethodArgs(
                type="http_delivery_method",
                url="https://example.com/receive_a_pagerduty_webhook",
                custom_headers=[
                    pagerduty.WebhookSubscriptionDeliveryMethodCustomHeaderArgs(
                        name="X-Foo",
                        value="foo",
                    ),
                    pagerduty.WebhookSubscriptionDeliveryMethodCustomHeaderArgs(
                        name="X-Bar",
                        value="bar",
                    ),
                ],
            )],
            description="%s",
            events=[
                "incident.acknowledged",
                "incident.annotated",
                "incident.delegated",
                "incident.escalated",
                "incident.priority_updated",
                "incident.reassigned",
                "incident.reopened",
                "incident.resolved",
                "incident.responder.added",
                "incident.responder.replied",
                "incident.status_update_published",
                "incident.triggered",
                "incident.unacknowledged",
            ],
            active=True,
            filters=[pagerduty.WebhookSubscriptionFilterArgs(
                id=example.id,
                type="service_reference",
            )],
            type="webhook_subscription")
        ```

        ## Import

        Webhook Subscriptions can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/webhookSubscription:WebhookSubscription main PUABCDL
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Determines whether the subscription will produce webhook events.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionDeliveryMethodArgs']]]] delivery_methods: The object describing where to send the webhooks.
        :param pulumi.Input[str] description: A short description of the webhook subscription
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: A set of outbound event types the webhook will receive. The follow event types are possible: 
               * `incident.acknowledged`
               * `incident.annotated`
               * `incident.delegated`
               * `incident.escalated`
               * `incident.priority_updated`
               * `incident.reassigned`
               * `incident.reopened`
               * `incident.resolved`
               * `incident.responder.added`
               * `incident.responder.replied`
               * `incident.status_update_published`
               * `incident.triggered`
               * `incident.unacknowledged`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionFilterArgs']]]] filters: determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        :param pulumi.Input[str] type: The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhookSubscriptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [webhook subscription](https://developer.pagerduty.com/docs/ZG9jOjExMDI5NTkw-v3-overview) allow you to receive HTTP callbacks when incidents are created, updated and deleted. These are also known as V3 Webhooks.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.get_service(name="My Service")
        foo = pagerduty.WebhookSubscription("foo",
            delivery_methods=[pagerduty.WebhookSubscriptionDeliveryMethodArgs(
                type="http_delivery_method",
                url="https://example.com/receive_a_pagerduty_webhook",
                custom_headers=[
                    pagerduty.WebhookSubscriptionDeliveryMethodCustomHeaderArgs(
                        name="X-Foo",
                        value="foo",
                    ),
                    pagerduty.WebhookSubscriptionDeliveryMethodCustomHeaderArgs(
                        name="X-Bar",
                        value="bar",
                    ),
                ],
            )],
            description="%s",
            events=[
                "incident.acknowledged",
                "incident.annotated",
                "incident.delegated",
                "incident.escalated",
                "incident.priority_updated",
                "incident.reassigned",
                "incident.reopened",
                "incident.resolved",
                "incident.responder.added",
                "incident.responder.replied",
                "incident.status_update_published",
                "incident.triggered",
                "incident.unacknowledged",
            ],
            active=True,
            filters=[pagerduty.WebhookSubscriptionFilterArgs(
                id=example.id,
                type="service_reference",
            )],
            type="webhook_subscription")
        ```

        ## Import

        Webhook Subscriptions can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/webhookSubscription:WebhookSubscription main PUABCDL
        ```

        :param str resource_name: The name of the resource.
        :param WebhookSubscriptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhookSubscriptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            WebhookSubscriptionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 delivery_methods: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionDeliveryMethodArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionFilterArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookSubscriptionArgs.__new__(WebhookSubscriptionArgs)

            __props__.__dict__["active"] = active
            if delivery_methods is None and not opts.urn:
                raise TypeError("Missing required property 'delivery_methods'")
            __props__.__dict__["delivery_methods"] = delivery_methods
            __props__.__dict__["description"] = description
            if events is None and not opts.urn:
                raise TypeError("Missing required property 'events'")
            __props__.__dict__["events"] = events
            if filters is None and not opts.urn:
                raise TypeError("Missing required property 'filters'")
            __props__.__dict__["filters"] = filters
            __props__.__dict__["type"] = type
        super(WebhookSubscription, __self__).__init__(
            'pagerduty:index/webhookSubscription:WebhookSubscription',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            delivery_methods: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionDeliveryMethodArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionFilterArgs']]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'WebhookSubscription':
        """
        Get an existing WebhookSubscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Determines whether the subscription will produce webhook events.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionDeliveryMethodArgs']]]] delivery_methods: The object describing where to send the webhooks.
        :param pulumi.Input[str] description: A short description of the webhook subscription
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: A set of outbound event types the webhook will receive. The follow event types are possible: 
               * `incident.acknowledged`
               * `incident.annotated`
               * `incident.delegated`
               * `incident.escalated`
               * `incident.priority_updated`
               * `incident.reassigned`
               * `incident.reopened`
               * `incident.resolved`
               * `incident.responder.added`
               * `incident.responder.replied`
               * `incident.status_update_published`
               * `incident.triggered`
               * `incident.unacknowledged`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookSubscriptionFilterArgs']]]] filters: determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        :param pulumi.Input[str] type: The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhookSubscriptionState.__new__(_WebhookSubscriptionState)

        __props__.__dict__["active"] = active
        __props__.__dict__["delivery_methods"] = delivery_methods
        __props__.__dict__["description"] = description
        __props__.__dict__["events"] = events
        __props__.__dict__["filters"] = filters
        __props__.__dict__["type"] = type
        return WebhookSubscription(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[bool]:
        """
        Determines whether the subscription will produce webhook events.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="deliveryMethods")
    def delivery_methods(self) -> pulumi.Output[Sequence['outputs.WebhookSubscriptionDeliveryMethod']]:
        """
        The object describing where to send the webhooks.
        """
        return pulumi.get(self, "delivery_methods")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A short description of the webhook subscription
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def events(self) -> pulumi.Output[Sequence[str]]:
        """
        A set of outbound event types the webhook will receive. The follow event types are possible: 
        * `incident.acknowledged`
        * `incident.annotated`
        * `incident.delegated`
        * `incident.escalated`
        * `incident.priority_updated`
        * `incident.reassigned`
        * `incident.reopened`
        * `incident.resolved`
        * `incident.responder.added`
        * `incident.responder.replied`
        * `incident.status_update_published`
        * `incident.triggered`
        * `incident.unacknowledged`
        """
        return pulumi.get(self, "events")

    @property
    @pulumi.getter
    def filters(self) -> pulumi.Output[Sequence['outputs.WebhookSubscriptionFilter']]:
        """
        determines which events will match and produce a webhook. There are currently three types of filters that can be applied to webhook subscriptions: `service_reference`, `team_reference` and `account_reference`.
        """
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type indicating the schema of the object. The provider sets this as `webhook_subscription`, which is currently the only acceptable value.
        """
        return pulumi.get(self, "type")

