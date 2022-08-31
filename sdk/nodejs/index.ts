// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./addon";
export * from "./businessService";
export * from "./businessServiceSubscriber";
export * from "./escalationPolicy";
export * from "./eventOrchestration";
export * from "./eventOrchestrationRouter";
export * from "./eventOrchestrationService";
export * from "./eventOrchestrationUnrouted";
export * from "./eventRule";
export * from "./extension";
export * from "./extensionServiceNow";
export * from "./getBusinessService";
export * from "./getEscalationPolicy";
export * from "./getEventOrchestration";
export * from "./getExtensionSchema";
export * from "./getPriority";
export * from "./getRuleset";
export * from "./getSchedule";
export * from "./getService";
export * from "./getServiceIntegration";
export * from "./getTag";
export * from "./getTeam";
export * from "./getUser";
export * from "./getUserContactMethod";
export * from "./getUsers";
export * from "./getVendor";
export * from "./maintenanceWindow";
export * from "./provider";
export * from "./responsePlay";
export * from "./ruleset";
export * from "./rulesetRule";
export * from "./schedule";
export * from "./service";
export * from "./serviceDependency";
export * from "./serviceEventRule";
export * from "./serviceIntegration";
export * from "./slackConnection";
export * from "./tag";
export * from "./tagAssignment";
export * from "./team";
export * from "./teamMembership";
export * from "./user";
export * from "./userContactMethod";
export * from "./userNotificationRule";
export * from "./webhookSubscription";

// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

// Import resources to register:
import { Addon } from "./addon";
import { BusinessService } from "./businessService";
import { BusinessServiceSubscriber } from "./businessServiceSubscriber";
import { EscalationPolicy } from "./escalationPolicy";
import { EventOrchestration } from "./eventOrchestration";
import { EventOrchestrationRouter } from "./eventOrchestrationRouter";
import { EventOrchestrationService } from "./eventOrchestrationService";
import { EventOrchestrationUnrouted } from "./eventOrchestrationUnrouted";
import { EventRule } from "./eventRule";
import { Extension } from "./extension";
import { ExtensionServiceNow } from "./extensionServiceNow";
import { MaintenanceWindow } from "./maintenanceWindow";
import { ResponsePlay } from "./responsePlay";
import { Ruleset } from "./ruleset";
import { RulesetRule } from "./rulesetRule";
import { Schedule } from "./schedule";
import { Service } from "./service";
import { ServiceDependency } from "./serviceDependency";
import { ServiceEventRule } from "./serviceEventRule";
import { ServiceIntegration } from "./serviceIntegration";
import { SlackConnection } from "./slackConnection";
import { Tag } from "./tag";
import { TagAssignment } from "./tagAssignment";
import { Team } from "./team";
import { TeamMembership } from "./teamMembership";
import { User } from "./user";
import { UserContactMethod } from "./userContactMethod";
import { UserNotificationRule } from "./userNotificationRule";
import { WebhookSubscription } from "./webhookSubscription";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "pagerduty:index/addon:Addon":
                return new Addon(name, <any>undefined, { urn })
            case "pagerduty:index/businessService:BusinessService":
                return new BusinessService(name, <any>undefined, { urn })
            case "pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber":
                return new BusinessServiceSubscriber(name, <any>undefined, { urn })
            case "pagerduty:index/escalationPolicy:EscalationPolicy":
                return new EscalationPolicy(name, <any>undefined, { urn })
            case "pagerduty:index/eventOrchestration:EventOrchestration":
                return new EventOrchestration(name, <any>undefined, { urn })
            case "pagerduty:index/eventOrchestrationRouter:EventOrchestrationRouter":
                return new EventOrchestrationRouter(name, <any>undefined, { urn })
            case "pagerduty:index/eventOrchestrationService:EventOrchestrationService":
                return new EventOrchestrationService(name, <any>undefined, { urn })
            case "pagerduty:index/eventOrchestrationUnrouted:EventOrchestrationUnrouted":
                return new EventOrchestrationUnrouted(name, <any>undefined, { urn })
            case "pagerduty:index/eventRule:EventRule":
                return new EventRule(name, <any>undefined, { urn })
            case "pagerduty:index/extension:Extension":
                return new Extension(name, <any>undefined, { urn })
            case "pagerduty:index/extensionServiceNow:ExtensionServiceNow":
                return new ExtensionServiceNow(name, <any>undefined, { urn })
            case "pagerduty:index/maintenanceWindow:MaintenanceWindow":
                return new MaintenanceWindow(name, <any>undefined, { urn })
            case "pagerduty:index/responsePlay:ResponsePlay":
                return new ResponsePlay(name, <any>undefined, { urn })
            case "pagerduty:index/ruleset:Ruleset":
                return new Ruleset(name, <any>undefined, { urn })
            case "pagerduty:index/rulesetRule:RulesetRule":
                return new RulesetRule(name, <any>undefined, { urn })
            case "pagerduty:index/schedule:Schedule":
                return new Schedule(name, <any>undefined, { urn })
            case "pagerduty:index/service:Service":
                return new Service(name, <any>undefined, { urn })
            case "pagerduty:index/serviceDependency:ServiceDependency":
                return new ServiceDependency(name, <any>undefined, { urn })
            case "pagerduty:index/serviceEventRule:ServiceEventRule":
                return new ServiceEventRule(name, <any>undefined, { urn })
            case "pagerduty:index/serviceIntegration:ServiceIntegration":
                return new ServiceIntegration(name, <any>undefined, { urn })
            case "pagerduty:index/slackConnection:SlackConnection":
                return new SlackConnection(name, <any>undefined, { urn })
            case "pagerduty:index/tag:Tag":
                return new Tag(name, <any>undefined, { urn })
            case "pagerduty:index/tagAssignment:TagAssignment":
                return new TagAssignment(name, <any>undefined, { urn })
            case "pagerduty:index/team:Team":
                return new Team(name, <any>undefined, { urn })
            case "pagerduty:index/teamMembership:TeamMembership":
                return new TeamMembership(name, <any>undefined, { urn })
            case "pagerduty:index/user:User":
                return new User(name, <any>undefined, { urn })
            case "pagerduty:index/userContactMethod:UserContactMethod":
                return new UserContactMethod(name, <any>undefined, { urn })
            case "pagerduty:index/userNotificationRule:UserNotificationRule":
                return new UserNotificationRule(name, <any>undefined, { urn })
            case "pagerduty:index/webhookSubscription:WebhookSubscription":
                return new WebhookSubscription(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("pagerduty", "index/addon", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/businessService", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/businessServiceSubscriber", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/escalationPolicy", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/eventOrchestration", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/eventOrchestrationRouter", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/eventOrchestrationService", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/eventOrchestrationUnrouted", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/eventRule", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/extension", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/extensionServiceNow", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/maintenanceWindow", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/responsePlay", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/ruleset", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/rulesetRule", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/schedule", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/service", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/serviceDependency", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/serviceEventRule", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/serviceIntegration", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/slackConnection", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/tag", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/tagAssignment", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/team", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/teamMembership", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/user", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/userContactMethod", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/userNotificationRule", _module)
pulumi.runtime.registerResourceModule("pagerduty", "index/webhookSubscription", _module)

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("pagerduty", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:pagerduty") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
