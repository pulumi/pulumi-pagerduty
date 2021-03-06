# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .addon import *
from .business_service import *
from .escalation_policy import *
from .event_rule import *
from .extension import *
from .get_business_service import *
from .get_escalation_policy import *
from .get_extension_schema import *
from .get_priority import *
from .get_ruleset import *
from .get_schedule import *
from .get_service import *
from .get_team import *
from .get_user import *
from .get_user_contact_method import *
from .get_vendor import *
from .maintenance_window import *
from .provider import *
from .response_play import *
from .ruleset import *
from .ruleset_rule import *
from .schedule import *
from .service import *
from .service_dependency import *
from .service_event_rule import *
from .service_integration import *
from .team import *
from .team_membership import *
from .user import *
from .user_contact_method import *
from .user_notification_rule import *
from ._inputs import *
from . import outputs

# Make subpackages available:
from . import (
    config,
)

def _register_module():
    import pulumi
    from . import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "pagerduty:index/addon:Addon":
                return Addon(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/businessService:BusinessService":
                return BusinessService(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/escalationPolicy:EscalationPolicy":
                return EscalationPolicy(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/eventRule:EventRule":
                return EventRule(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/extension:Extension":
                return Extension(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/maintenanceWindow:MaintenanceWindow":
                return MaintenanceWindow(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/responsePlay:ResponsePlay":
                return ResponsePlay(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/ruleset:Ruleset":
                return Ruleset(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/rulesetRule:RulesetRule":
                return RulesetRule(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/schedule:Schedule":
                return Schedule(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/service:Service":
                return Service(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/serviceDependency:ServiceDependency":
                return ServiceDependency(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/serviceEventRule:ServiceEventRule":
                return ServiceEventRule(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/serviceIntegration:ServiceIntegration":
                return ServiceIntegration(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/team:Team":
                return Team(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/teamMembership:TeamMembership":
                return TeamMembership(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/user:User":
                return User(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/userContactMethod:UserContactMethod":
                return UserContactMethod(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "pagerduty:index/userNotificationRule:UserNotificationRule":
                return UserNotificationRule(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("pagerduty", "index/addon", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/businessService", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/escalationPolicy", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/eventRule", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/extension", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/maintenanceWindow", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/responsePlay", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/ruleset", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/rulesetRule", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/schedule", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/service", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/serviceDependency", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/serviceEventRule", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/serviceIntegration", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/team", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/teamMembership", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/user", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/userContactMethod", _module_instance)
    pulumi.runtime.register_resource_module("pagerduty", "index/userNotificationRule", _module_instance)


    class Package(pulumi.runtime.ResourcePackage):
        _version = _utilities.get_semver_version()

        def version(self):
            return Package._version

        def construct_provider(self, name: str, typ: str, urn: str) -> pulumi.ProviderResource:
            if typ != "pulumi:providers:pagerduty":
                raise Exception(f"unknown provider type {typ}")
            return Provider(name, pulumi.ResourceOptions(urn=urn))


    pulumi.runtime.register_resource_package("pagerduty", Package())

_register_module()
