# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['User']


class User(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 color: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 job_title: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        A [user](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Users/get_users) is a member of a PagerDuty account that have the ability to interact with incidents and other data on the account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_pagerduty as pagerduty

        example = pagerduty.User("example", email="125.greenholt.earline@graham.name")
        ```

        ## Import

        Users can be imported using the `id`, e.g.

        ```sh
         $ pulumi import pagerduty:index/user:User main PLBP09X
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] color: The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
        :param pulumi.Input[str] email: The user's email address.
        :param pulumi.Input[str] job_title: The user's title.
        :param pulumi.Input[str] name: The name of the user.
        :param pulumi.Input[str] role: The user role. Account must have the `read_only_users` ability to set a user as a `read_only_user`. Can be `admin`, `limited_user`, `observer`, `owner`, `read_only_user` or `user`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: A list of teams the user should belong to. Please use `TeamMembership` instead.
        :param pulumi.Input[str] time_zone: The timezone of the user
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

            __props__['color'] = color
            __props__['description'] = description
            if email is None and not opts.urn:
                raise TypeError("Missing required property 'email'")
            __props__['email'] = email
            __props__['job_title'] = job_title
            __props__['name'] = name
            __props__['role'] = role
            if teams is not None and not opts.urn:
                warnings.warn("""Use the 'pagerduty_team_membership' resource instead.""", DeprecationWarning)
                pulumi.log.warn("""teams is deprecated: Use the 'pagerduty_team_membership' resource instead.""")
            __props__['teams'] = teams
            __props__['time_zone'] = time_zone
            __props__['avatar_url'] = None
            __props__['html_url'] = None
            __props__['invitation_sent'] = None
        super(User, __self__).__init__(
            'pagerduty:index/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            avatar_url: Optional[pulumi.Input[str]] = None,
            color: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            email: Optional[pulumi.Input[str]] = None,
            html_url: Optional[pulumi.Input[str]] = None,
            invitation_sent: Optional[pulumi.Input[bool]] = None,
            job_title: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            role: Optional[pulumi.Input[str]] = None,
            teams: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            time_zone: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] avatar_url: The URL of the user's avatar.
        :param pulumi.Input[str] color: The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
        :param pulumi.Input[str] email: The user's email address.
        :param pulumi.Input[str] html_url: URL at which the entity is uniquely displayed in the Web app
        :param pulumi.Input[bool] invitation_sent: If true, the user has an outstanding invitation.
        :param pulumi.Input[str] job_title: The user's title.
        :param pulumi.Input[str] name: The name of the user.
        :param pulumi.Input[str] role: The user role. Account must have the `read_only_users` ability to set a user as a `read_only_user`. Can be `admin`, `limited_user`, `observer`, `owner`, `read_only_user` or `user`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams: A list of teams the user should belong to. Please use `TeamMembership` instead.
        :param pulumi.Input[str] time_zone: The timezone of the user
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["avatar_url"] = avatar_url
        __props__["color"] = color
        __props__["description"] = description
        __props__["email"] = email
        __props__["html_url"] = html_url
        __props__["invitation_sent"] = invitation_sent
        __props__["job_title"] = job_title
        __props__["name"] = name
        __props__["role"] = role
        __props__["teams"] = teams
        __props__["time_zone"] = time_zone
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="avatarUrl")
    def avatar_url(self) -> pulumi.Output[str]:
        """
        The URL of the user's avatar.
        """
        return pulumi.get(self, "avatar_url")

    @property
    @pulumi.getter
    def color(self) -> pulumi.Output[str]:
        """
        The schedule color for the user. Valid options are purple, red, green, blue, teal, orange, brown, turquoise, dark-slate-blue, cayenne, orange-red, dark-orchid, dark-slate-grey, lime, dark-magenta, lime-green, midnight-blue, deep-pink, dark-green, dark-orange, dark-cyan, darkolive-green, dark-slate-gray, grey20, firebrick, maroon, crimson, dark-red, dark-goldenrod, chocolate, medium-violet-red, sea-green, olivedrab, forest-green, dark-olive-green, blue-violet, royal-blue, indigo, slate-blue, saddle-brown, or steel-blue.
        """
        return pulumi.get(self, "color")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[str]:
        """
        The user's email address.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> pulumi.Output[str]:
        """
        URL at which the entity is uniquely displayed in the Web app
        """
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter(name="invitationSent")
    def invitation_sent(self) -> pulumi.Output[bool]:
        """
        If true, the user has an outstanding invitation.
        """
        return pulumi.get(self, "invitation_sent")

    @property
    @pulumi.getter(name="jobTitle")
    def job_title(self) -> pulumi.Output[Optional[str]]:
        """
        The user's title.
        """
        return pulumi.get(self, "job_title")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the user.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[Optional[str]]:
        """
        The user role. Account must have the `read_only_users` ability to set a user as a `read_only_user`. Can be `admin`, `limited_user`, `observer`, `owner`, `read_only_user` or `user`
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter
    def teams(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of teams the user should belong to. Please use `TeamMembership` instead.
        """
        return pulumi.get(self, "teams")

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Output[str]:
        """
        The timezone of the user
        """
        return pulumi.get(self, "time_zone")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

