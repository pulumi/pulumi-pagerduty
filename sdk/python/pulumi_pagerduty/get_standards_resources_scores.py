# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = [
    'GetStandardsResourcesScoresResult',
    'AwaitableGetStandardsResourcesScoresResult',
    'get_standards_resources_scores',
    'get_standards_resources_scores_output',
]

@pulumi.output_type
class GetStandardsResourcesScoresResult:
    """
    A collection of values returned by getStandardsResourcesScores.
    """
    def __init__(__self__, id=None, ids=None, resource_type=None, resources=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if resource_type and not isinstance(resource_type, str):
            raise TypeError("Expected argument 'resource_type' to be a str")
        pulumi.set(__self__, "resource_type", resource_type)
        if resources and not isinstance(resources, list):
            raise TypeError("Expected argument 'resources' to be a list")
        pulumi.set(__self__, "resources", resources)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ids(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> _builtins.str:
        """
        Specifies the type of resource to which the standard applies.
        """
        return pulumi.get(self, "resource_type")

    @_builtins.property
    @pulumi.getter
    def resources(self) -> Sequence['outputs.GetStandardsResourcesScoresResourceResult']:
        """
        List of score results for each queried resource.
        """
        return pulumi.get(self, "resources")


class AwaitableGetStandardsResourcesScoresResult(GetStandardsResourcesScoresResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStandardsResourcesScoresResult(
            id=self.id,
            ids=self.ids,
            resource_type=self.resource_type,
            resources=self.resources)


def get_standards_resources_scores(ids: Optional[Sequence[_builtins.str]] = None,
                                   resource_type: Optional[_builtins.str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStandardsResourcesScoresResult:
    """
    Use this data source to get information about the [scores for the standards for
    many resources][1].

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    foo = pagerduty.get_service(name="foo")
    bar = pagerduty.get_service(name="bar")
    baz = pagerduty.get_service(name="baz")
    scores = pagerduty.get_standards_resources_scores(resource_type="technical_services",
        ids=[
            foo.id,
            bar.id,
            baz.id,
        ])
    ```


    :param Sequence[_builtins.str] ids: List of identifiers of the resources to query.
    :param _builtins.str resource_type: Type of the object the standards are associated to. Allowed values are `technical_services`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['resourceType'] = resource_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pagerduty:index/getStandardsResourcesScores:getStandardsResourcesScores', __args__, opts=opts, typ=GetStandardsResourcesScoresResult).value

    return AwaitableGetStandardsResourcesScoresResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        resource_type=pulumi.get(__ret__, 'resource_type'),
        resources=pulumi.get(__ret__, 'resources'))
def get_standards_resources_scores_output(ids: Optional[pulumi.Input[Sequence[_builtins.str]]] = None,
                                          resource_type: Optional[pulumi.Input[_builtins.str]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetStandardsResourcesScoresResult]:
    """
    Use this data source to get information about the [scores for the standards for
    many resources][1].

    ## Example Usage

    ```python
    import pulumi
    import pulumi_pagerduty as pagerduty

    foo = pagerduty.get_service(name="foo")
    bar = pagerduty.get_service(name="bar")
    baz = pagerduty.get_service(name="baz")
    scores = pagerduty.get_standards_resources_scores(resource_type="technical_services",
        ids=[
            foo.id,
            bar.id,
            baz.id,
        ])
    ```


    :param Sequence[_builtins.str] ids: List of identifiers of the resources to query.
    :param _builtins.str resource_type: Type of the object the standards are associated to. Allowed values are `technical_services`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['resourceType'] = resource_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('pagerduty:index/getStandardsResourcesScores:getStandardsResourcesScores', __args__, opts=opts, typ=GetStandardsResourcesScoresResult)
    return __ret__.apply(lambda __response__: GetStandardsResourcesScoresResult(
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        resource_type=pulumi.get(__response__, 'resource_type'),
        resources=pulumi.get(__response__, 'resources')))
