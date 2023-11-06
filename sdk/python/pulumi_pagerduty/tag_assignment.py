# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TagAssignmentArgs', 'TagAssignment']

@pulumi.input_type
class TagAssignmentArgs:
    def __init__(__self__, *,
                 entity_id: pulumi.Input[str],
                 entity_type: pulumi.Input[str],
                 tag_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a TagAssignment resource.
        :param pulumi.Input[str] entity_id: The ID of the entity.
        :param pulumi.Input[str] entity_type: Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
        :param pulumi.Input[str] tag_id: The ID of the tag.
        """
        TagAssignmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            entity_id=entity_id,
            entity_type=entity_type,
            tag_id=tag_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             entity_id: Optional[pulumi.Input[str]] = None,
             entity_type: Optional[pulumi.Input[str]] = None,
             tag_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if entity_id is None and 'entityId' in kwargs:
            entity_id = kwargs['entityId']
        if entity_id is None:
            raise TypeError("Missing 'entity_id' argument")
        if entity_type is None and 'entityType' in kwargs:
            entity_type = kwargs['entityType']
        if entity_type is None:
            raise TypeError("Missing 'entity_type' argument")
        if tag_id is None and 'tagId' in kwargs:
            tag_id = kwargs['tagId']
        if tag_id is None:
            raise TypeError("Missing 'tag_id' argument")

        _setter("entity_id", entity_id)
        _setter("entity_type", entity_type)
        _setter("tag_id", tag_id)

    @property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> pulumi.Input[str]:
        """
        The ID of the entity.
        """
        return pulumi.get(self, "entity_id")

    @entity_id.setter
    def entity_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "entity_id", value)

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> pulumi.Input[str]:
        """
        Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
        """
        return pulumi.get(self, "entity_type")

    @entity_type.setter
    def entity_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "entity_type", value)

    @property
    @pulumi.getter(name="tagId")
    def tag_id(self) -> pulumi.Input[str]:
        """
        The ID of the tag.
        """
        return pulumi.get(self, "tag_id")

    @tag_id.setter
    def tag_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tag_id", value)


@pulumi.input_type
class _TagAssignmentState:
    def __init__(__self__, *,
                 entity_id: Optional[pulumi.Input[str]] = None,
                 entity_type: Optional[pulumi.Input[str]] = None,
                 tag_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TagAssignment resources.
        :param pulumi.Input[str] entity_id: The ID of the entity.
        :param pulumi.Input[str] entity_type: Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
        :param pulumi.Input[str] tag_id: The ID of the tag.
        """
        _TagAssignmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            entity_id=entity_id,
            entity_type=entity_type,
            tag_id=tag_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             entity_id: Optional[pulumi.Input[str]] = None,
             entity_type: Optional[pulumi.Input[str]] = None,
             tag_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if entity_id is None and 'entityId' in kwargs:
            entity_id = kwargs['entityId']
        if entity_type is None and 'entityType' in kwargs:
            entity_type = kwargs['entityType']
        if tag_id is None and 'tagId' in kwargs:
            tag_id = kwargs['tagId']

        if entity_id is not None:
            _setter("entity_id", entity_id)
        if entity_type is not None:
            _setter("entity_type", entity_type)
        if tag_id is not None:
            _setter("tag_id", tag_id)

    @property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the entity.
        """
        return pulumi.get(self, "entity_id")

    @entity_id.setter
    def entity_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "entity_id", value)

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
        """
        return pulumi.get(self, "entity_type")

    @entity_type.setter
    def entity_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "entity_type", value)

    @property
    @pulumi.getter(name="tagId")
    def tag_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the tag.
        """
        return pulumi.get(self, "tag_id")

    @tag_id.setter
    def tag_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag_id", value)


class TagAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 entity_id: Optional[pulumi.Input[str]] = None,
                 entity_type: Optional[pulumi.Input[str]] = None,
                 tag_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwMA-assign-tags) is applied to Escalation Policies, Teams or Users and can be used to filter them.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example_tag = pagerduty.Tag("exampleTag", label="API")
        engteam = pagerduty.Team("engteam")
        example_tag_assignment = pagerduty.TagAssignment("exampleTagAssignment",
            tag_id=example_tag.id,
            entity_type="teams",
            entity_id=engteam.id)
        ```

        ## Import

        Tag assignments can be imported using the `id` which is constructed by taking the `entity` Type, `entity` ID and the `tag` ID separated by a dot, e.g.

        ```sh
         $ pulumi import pagerduty:index/tagAssignment:TagAssignment main users.P7HHMVK.PYC7IQQ
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] entity_id: The ID of the entity.
        :param pulumi.Input[str] entity_type: Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
        :param pulumi.Input[str] tag_id: The ID of the tag.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TagAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A [tag](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwMA-assign-tags) is applied to Escalation Policies, Teams or Users and can be used to filter them.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example_tag = pagerduty.Tag("exampleTag", label="API")
        engteam = pagerduty.Team("engteam")
        example_tag_assignment = pagerduty.TagAssignment("exampleTagAssignment",
            tag_id=example_tag.id,
            entity_type="teams",
            entity_id=engteam.id)
        ```

        ## Import

        Tag assignments can be imported using the `id` which is constructed by taking the `entity` Type, `entity` ID and the `tag` ID separated by a dot, e.g.

        ```sh
         $ pulumi import pagerduty:index/tagAssignment:TagAssignment main users.P7HHMVK.PYC7IQQ
        ```

        :param str resource_name: The name of the resource.
        :param TagAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TagAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TagAssignmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 entity_id: Optional[pulumi.Input[str]] = None,
                 entity_type: Optional[pulumi.Input[str]] = None,
                 tag_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TagAssignmentArgs.__new__(TagAssignmentArgs)

            if entity_id is None and not opts.urn:
                raise TypeError("Missing required property 'entity_id'")
            __props__.__dict__["entity_id"] = entity_id
            if entity_type is None and not opts.urn:
                raise TypeError("Missing required property 'entity_type'")
            __props__.__dict__["entity_type"] = entity_type
            if tag_id is None and not opts.urn:
                raise TypeError("Missing required property 'tag_id'")
            __props__.__dict__["tag_id"] = tag_id
        super(TagAssignment, __self__).__init__(
            'pagerduty:index/tagAssignment:TagAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            entity_id: Optional[pulumi.Input[str]] = None,
            entity_type: Optional[pulumi.Input[str]] = None,
            tag_id: Optional[pulumi.Input[str]] = None) -> 'TagAssignment':
        """
        Get an existing TagAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] entity_id: The ID of the entity.
        :param pulumi.Input[str] entity_type: Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
        :param pulumi.Input[str] tag_id: The ID of the tag.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TagAssignmentState.__new__(_TagAssignmentState)

        __props__.__dict__["entity_id"] = entity_id
        __props__.__dict__["entity_type"] = entity_type
        __props__.__dict__["tag_id"] = tag_id
        return TagAssignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> pulumi.Output[str]:
        """
        The ID of the entity.
        """
        return pulumi.get(self, "entity_id")

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> pulumi.Output[str]:
        """
        Type of entity in the tag assignment. Possible values can be `users`, `teams`, and `escalation_policies`.
        """
        return pulumi.get(self, "entity_type")

    @property
    @pulumi.getter(name="tagId")
    def tag_id(self) -> pulumi.Output[str]:
        """
        The ID of the tag.
        """
        return pulumi.get(self, "tag_id")

