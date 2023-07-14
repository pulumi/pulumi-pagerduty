# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCustomFieldSchemaResult',
    'AwaitableGetCustomFieldSchemaResult',
    'get_custom_field_schema',
    'get_custom_field_schema_output',
]

@pulumi.output_type
class GetCustomFieldSchemaResult:
    """
    A collection of values returned by getCustomFieldSchema.
    """
    def __init__(__self__, description=None, id=None, title=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if title and not isinstance(title, str):
            raise TypeError("Expected argument 'title' to be a str")
        pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")


class AwaitableGetCustomFieldSchemaResult(GetCustomFieldSchemaResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomFieldSchemaResult(
            description=self.description,
            id=self.id,
            title=self.title)


def get_custom_field_schema(title: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomFieldSchemaResult:
    """
    !> This Data Source is no longer functional. Documentation is left here for the purpose of documenting migration steps.

    Use this data source to get information about a specific [Custom Field Schema](https://support.pagerduty.com/docs/custom-fields#schemas) that you can assign to a service.

    ## Migration

    This data source has no currently functional counterpart. Custom Fields on Incidents are now applied globally
    to incidents within an account and have no notion of a Field Schema.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    myschema = pagerduty.get_custom_field_schema(title="myschema title")
    first_service = pagerduty.get_service(name="My Service")
    foo = pagerduty.CustomFieldSchemaAssignment("foo",
        schema=myschema.id,
        service=first_service.id)
    ```


    :param str title: The title of the field schema.
    """
    __args__ = dict()
    __args__['title'] = title
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getCustomFieldSchema:getCustomFieldSchema', __args__, opts=opts, typ=GetCustomFieldSchemaResult).value

    return AwaitableGetCustomFieldSchemaResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        title=pulumi.get(__ret__, 'title'))


@_utilities.lift_output_func(get_custom_field_schema)
def get_custom_field_schema_output(title: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCustomFieldSchemaResult]:
    """
    !> This Data Source is no longer functional. Documentation is left here for the purpose of documenting migration steps.

    Use this data source to get information about a specific [Custom Field Schema](https://support.pagerduty.com/docs/custom-fields#schemas) that you can assign to a service.

    ## Migration

    This data source has no currently functional counterpart. Custom Fields on Incidents are now applied globally
    to incidents within an account and have no notion of a Field Schema.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    myschema = pagerduty.get_custom_field_schema(title="myschema title")
    first_service = pagerduty.get_service(name="My Service")
    foo = pagerduty.CustomFieldSchemaAssignment("foo",
        schema=myschema.id,
        service=first_service.id)
    ```


    :param str title: The title of the field schema.
    """
    ...
