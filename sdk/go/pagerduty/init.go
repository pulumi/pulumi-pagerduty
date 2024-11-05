// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "pagerduty:index/addon:Addon":
		r = &Addon{}
	case "pagerduty:index/alertGroupingSetting:AlertGroupingSetting":
		r = &AlertGroupingSetting{}
	case "pagerduty:index/automationActionsAction:AutomationActionsAction":
		r = &AutomationActionsAction{}
	case "pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation":
		r = &AutomationActionsActionServiceAssociation{}
	case "pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation":
		r = &AutomationActionsActionTeamAssociation{}
	case "pagerduty:index/automationActionsRunner:AutomationActionsRunner":
		r = &AutomationActionsRunner{}
	case "pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation":
		r = &AutomationActionsRunnerTeamAssociation{}
	case "pagerduty:index/businessService:BusinessService":
		r = &BusinessService{}
	case "pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber":
		r = &BusinessServiceSubscriber{}
	case "pagerduty:index/escalationPolicy:EscalationPolicy":
		r = &EscalationPolicy{}
	case "pagerduty:index/eventOrchestration:EventOrchestration":
		r = &EventOrchestration{}
	case "pagerduty:index/eventOrchestrationGlobal:EventOrchestrationGlobal":
		r = &EventOrchestrationGlobal{}
	case "pagerduty:index/eventOrchestrationGlobalCacheVariable:EventOrchestrationGlobalCacheVariable":
		r = &EventOrchestrationGlobalCacheVariable{}
	case "pagerduty:index/eventOrchestrationIntegration:EventOrchestrationIntegration":
		r = &EventOrchestrationIntegration{}
	case "pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter":
		r = &EventOrchestrationRouter{}
	case "pagerduty:index/eventOrchestrationService:EventOrchestrationService":
		r = &EventOrchestrationService{}
	case "pagerduty:index/eventOrchestrationServiceCacheVariable:EventOrchestrationServiceCacheVariable":
		r = &EventOrchestrationServiceCacheVariable{}
	case "pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted":
		r = &EventOrchestrationUnrouted{}
	case "pagerduty:index/eventRule:EventRule":
		r = &EventRule{}
	case "pagerduty:index/extension:Extension":
		r = &Extension{}
	case "pagerduty:index/extensionServiceNow:ExtensionServiceNow":
		r = &ExtensionServiceNow{}
	case "pagerduty:index/incidentCustomField:IncidentCustomField":
		r = &IncidentCustomField{}
	case "pagerduty:index/incidentCustomFieldOption:IncidentCustomFieldOption":
		r = &IncidentCustomFieldOption{}
	case "pagerduty:index/incidentWorkflow:IncidentWorkflow":
		r = &IncidentWorkflow{}
	case "pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger":
		r = &IncidentWorkflowTrigger{}
	case "pagerduty:index/jiraCloudAccountMappingRule:JiraCloudAccountMappingRule":
		r = &JiraCloudAccountMappingRule{}
	case "pagerduty:index/maintenanceWindow:MaintenanceWindow":
		r = &MaintenanceWindow{}
	case "pagerduty:index/responsePlay:ResponsePlay":
		r = &ResponsePlay{}
	case "pagerduty:index/ruleset:Ruleset":
		r = &Ruleset{}
	case "pagerduty:index/rulesetRule:RulesetRule":
		r = &RulesetRule{}
	case "pagerduty:index/schedule:Schedule":
		r = &Schedule{}
	case "pagerduty:index/service:Service":
		r = &Service{}
	case "pagerduty:index/serviceDependency:ServiceDependency":
		r = &ServiceDependency{}
	case "pagerduty:index/serviceEventRule:ServiceEventRule":
		r = &ServiceEventRule{}
	case "pagerduty:index/serviceIntegration:ServiceIntegration":
		r = &ServiceIntegration{}
	case "pagerduty:index/slackConnection:SlackConnection":
		r = &SlackConnection{}
	case "pagerduty:index/tag:Tag":
		r = &Tag{}
	case "pagerduty:index/tagAssignment:TagAssignment":
		r = &TagAssignment{}
	case "pagerduty:index/team:Team":
		r = &Team{}
	case "pagerduty:index/teamMembership:TeamMembership":
		r = &TeamMembership{}
	case "pagerduty:index/user:User":
		r = &User{}
	case "pagerduty:index/userContactMethod:UserContactMethod":
		r = &UserContactMethod{}
	case "pagerduty:index/userHandoffNotificationRule:UserHandoffNotificationRule":
		r = &UserHandoffNotificationRule{}
	case "pagerduty:index/userNotificationRule:UserNotificationRule":
		r = &UserNotificationRule{}
	case "pagerduty:index/webhookSubscription:WebhookSubscription":
		r = &WebhookSubscription{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:pagerduty" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/addon",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/alertGroupingSetting",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/automationActionsAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/automationActionsActionServiceAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/automationActionsActionTeamAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/automationActionsRunner",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/automationActionsRunnerTeamAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/businessService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/businessServiceSubscriber",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/escalationPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventOrchestration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventOrchestrationGlobal",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventOrchestrationGlobalCacheVariable",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventOrchestrationIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventOrchestrationRouter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventOrchestrationService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventOrchestrationServiceCacheVariable",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventOrchestrationUnrouted",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/eventRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/extension",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/extensionServiceNow",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/incidentCustomField",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/incidentCustomFieldOption",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/incidentWorkflow",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/incidentWorkflowTrigger",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/jiraCloudAccountMappingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/maintenanceWindow",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/responsePlay",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/ruleset",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/rulesetRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/schedule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/service",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/serviceDependency",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/serviceEventRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/serviceIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/slackConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/tag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/tagAssignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/team",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/teamMembership",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/userContactMethod",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/userHandoffNotificationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/userNotificationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pagerduty",
		"index/webhookSubscription",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"pagerduty",
		&pkg{version},
	)
}
