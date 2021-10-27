# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ExtensionArgs', 'Extension']

@pulumi.input_type
class ExtensionArgs:
    def __init__(__self__, *,
                 extension_objects: pulumi.Input[Sequence[pulumi.Input[str]]],
                 extension_schema: pulumi.Input[str],
                 config: Optional[pulumi.Input[str]] = None,
                 endpoint_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Extension resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] extension_objects: This is the objects for which the extension applies (An array of service ids).
        :param pulumi.Input[str] extension_schema: This is the schema for this extension.
        :param pulumi.Input[str] config: The configuration of the service extension as string containing plain JSON-encoded data.
        :param pulumi.Input[str] endpoint_url: The url of the extension.
               **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        :param pulumi.Input[str] name: The name of the service extension.
        """
        pulumi.set(__self__, "extension_objects", extension_objects)
        pulumi.set(__self__, "extension_schema", extension_schema)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if endpoint_url is not None:
            pulumi.set(__self__, "endpoint_url", endpoint_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="extensionObjects")
    def extension_objects(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        This is the objects for which the extension applies (An array of service ids).
        """
        return pulumi.get(self, "extension_objects")

    @extension_objects.setter
    def extension_objects(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "extension_objects", value)

    @property
    @pulumi.getter(name="extensionSchema")
    def extension_schema(self) -> pulumi.Input[str]:
        """
        This is the schema for this extension.
        """
        return pulumi.get(self, "extension_schema")

    @extension_schema.setter
    def extension_schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "extension_schema", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        """
        The configuration of the service extension as string containing plain JSON-encoded data.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="endpointUrl")
    def endpoint_url(self) -> Optional[pulumi.Input[str]]:
        """
        The url of the extension.
        **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        """
        return pulumi.get(self, "endpoint_url")

    @endpoint_url.setter
    def endpoint_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the service extension.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _ExtensionState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[str]] = None,
                 endpoint_url: Optional[pulumi.Input[str]] = None,
                 extension_objects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 extension_schema: Optional[pulumi.Input[str]] = None,
                 html_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Extension resources.
        :param pulumi.Input[str] config: The configuration of the service extension as string containing plain JSON-encoded data.
        :param pulumi.Input[str] endpoint_url: The url of the extension.
               **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] extension_objects: This is the objects for which the extension applies (An array of service ids).
        :param pulumi.Input[str] extension_schema: This is the schema for this extension.
        :param pulumi.Input[str] html_url: URL at which the entity is uniquely displayed in the Web app
        :param pulumi.Input[str] name: The name of the service extension.
        :param pulumi.Input[str] summary: A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if endpoint_url is not None:
            pulumi.set(__self__, "endpoint_url", endpoint_url)
        if extension_objects is not None:
            pulumi.set(__self__, "extension_objects", extension_objects)
        if extension_schema is not None:
            pulumi.set(__self__, "extension_schema", extension_schema)
        if html_url is not None:
            pulumi.set(__self__, "html_url", html_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        """
        The configuration of the service extension as string containing plain JSON-encoded data.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="endpointUrl")
    def endpoint_url(self) -> Optional[pulumi.Input[str]]:
        """
        The url of the extension.
        **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        """
        return pulumi.get(self, "endpoint_url")

    @endpoint_url.setter
    def endpoint_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_url", value)

    @property
    @pulumi.getter(name="extensionObjects")
    def extension_objects(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        This is the objects for which the extension applies (An array of service ids).
        """
        return pulumi.get(self, "extension_objects")

    @extension_objects.setter
    def extension_objects(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "extension_objects", value)

    @property
    @pulumi.getter(name="extensionSchema")
    def extension_schema(self) -> Optional[pulumi.Input[str]]:
        """
        This is the schema for this extension.
        """
        return pulumi.get(self, "extension_schema")

    @extension_schema.setter
    def extension_schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "extension_schema", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the service extension.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def summary(self) -> Optional[pulumi.Input[str]]:
        """
        A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        """
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "summary", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Extension(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 endpoint_url: Optional[pulumi.Input[str]] = None,
                 extension_objects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 extension_schema: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        An [extension](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1extensions/post) can be associated with a service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        webhook = pagerduty.get_extension_schema(name="Generic V2 Webhook")
        example_user = pagerduty.User("exampleUser", email="howard.james@example.domain")
        example_escalation_policy = pagerduty.EscalationPolicy("exampleEscalationPolicy",
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
            escalation_policy=example_escalation_policy.id)
        slack = pagerduty.Extension("slack",
            endpoint_url="https://generic_webhook_url/XXXXXX/BBBBBB",
            extension_schema=webhook.id,
            extension_objects=[example_service.id],
            config=\"\"\"{
        	"restrict": "any",
        	"notify_types": {
        			"resolve": false,
        			"acknowledge": false,
        			"assignments": false
        	},
        	"access_token": "XXX"
        }
        \"\"\")
        ```

        ## Import

        Extensions can be imported using the id.e.g.

        ```sh
         $ pulumi import pagerduty:index/extension:Extension main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config: The configuration of the service extension as string containing plain JSON-encoded data.
        :param pulumi.Input[str] endpoint_url: The url of the extension.
               **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] extension_objects: This is the objects for which the extension applies (An array of service ids).
        :param pulumi.Input[str] extension_schema: This is the schema for this extension.
        :param pulumi.Input[str] name: The name of the service extension.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ExtensionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An [extension](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1extensions/post) can be associated with a service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        webhook = pagerduty.get_extension_schema(name="Generic V2 Webhook")
        example_user = pagerduty.User("exampleUser", email="howard.james@example.domain")
        example_escalation_policy = pagerduty.EscalationPolicy("exampleEscalationPolicy",
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
            escalation_policy=example_escalation_policy.id)
        slack = pagerduty.Extension("slack",
            endpoint_url="https://generic_webhook_url/XXXXXX/BBBBBB",
            extension_schema=webhook.id,
            extension_objects=[example_service.id],
            config=\"\"\"{
        	"restrict": "any",
        	"notify_types": {
        			"resolve": false,
        			"acknowledge": false,
        			"assignments": false
        	},
        	"access_token": "XXX"
        }
        \"\"\")
        ```

        ## Import

        Extensions can be imported using the id.e.g.

        ```sh
         $ pulumi import pagerduty:index/extension:Extension main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param ExtensionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ExtensionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 endpoint_url: Optional[pulumi.Input[str]] = None,
                 extension_objects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 extension_schema: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
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
            __props__ = ExtensionArgs.__new__(ExtensionArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["endpoint_url"] = endpoint_url
            if extension_objects is None and not opts.urn:
                raise TypeError("Missing required property 'extension_objects'")
            __props__.__dict__["extension_objects"] = extension_objects
            if extension_schema is None and not opts.urn:
                raise TypeError("Missing required property 'extension_schema'")
            __props__.__dict__["extension_schema"] = extension_schema
            __props__.__dict__["name"] = name
            __props__.__dict__["type"] = type
            __props__.__dict__["html_url"] = None
            __props__.__dict__["summary"] = None
        super(Extension, __self__).__init__(
            'pagerduty:index/extension:Extension',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[str]] = None,
            endpoint_url: Optional[pulumi.Input[str]] = None,
            extension_objects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            extension_schema: Optional[pulumi.Input[str]] = None,
            html_url: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            summary: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Extension':
        """
        Get an existing Extension resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config: The configuration of the service extension as string containing plain JSON-encoded data.
        :param pulumi.Input[str] endpoint_url: The url of the extension.
               **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] extension_objects: This is the objects for which the extension applies (An array of service ids).
        :param pulumi.Input[str] extension_schema: This is the schema for this extension.
        :param pulumi.Input[str] html_url: URL at which the entity is uniquely displayed in the Web app
        :param pulumi.Input[str] name: The name of the service extension.
        :param pulumi.Input[str] summary: A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ExtensionState.__new__(_ExtensionState)

        __props__.__dict__["config"] = config
        __props__.__dict__["endpoint_url"] = endpoint_url
        __props__.__dict__["extension_objects"] = extension_objects
        __props__.__dict__["extension_schema"] = extension_schema
        __props__.__dict__["html_url"] = html_url
        __props__.__dict__["name"] = name
        __props__.__dict__["summary"] = summary
        __props__.__dict__["type"] = type
        return Extension(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Optional[str]]:
        """
        The configuration of the service extension as string containing plain JSON-encoded data.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="endpointUrl")
    def endpoint_url(self) -> pulumi.Output[Optional[str]]:
        """
        The url of the extension.
        **Note:** The [endpoint URL is Optional API wise](https://api-reference.pagerduty.com/#!/Extensions/post_extensions) in most cases. But in some cases it is a _Required_ parameter. For example, `getExtensionSchema` named `Generic V2 Webhook` doesn't accept `Extension` with no `endpoint_url`, but one with named `Slack` accepts.
        """
        return pulumi.get(self, "endpoint_url")

    @property
    @pulumi.getter(name="extensionObjects")
    def extension_objects(self) -> pulumi.Output[Sequence[str]]:
        """
        This is the objects for which the extension applies (An array of service ids).
        """
        return pulumi.get(self, "extension_objects")

    @property
    @pulumi.getter(name="extensionSchema")
    def extension_schema(self) -> pulumi.Output[str]:
        """
        This is the schema for this extension.
        """
        return pulumi.get(self, "extension_schema")

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> pulumi.Output[str]:
        """
        URL at which the entity is uniquely displayed in the Web app
        """
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the service extension.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def summary(self) -> pulumi.Output[str]:
        """
        A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
        """
        return pulumi.get(self, "summary")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "type")

