// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package pagerduty

import (
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/PagerDuty/terraform-provider-pagerduty/pagerduty"
	"github.com/pulumi/pulumi-pagerduty/provider/v3/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "pagerduty"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// managedByPulumi is a default used for some managed resources, in the absence of something more meaningful.
var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(pagerduty.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "pagerduty",
		Description: "A Pulumi package for creating and managing pagerduty cloud resources.",
		Keywords:    []string{"pulumi", "pagerduty"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "PagerDuty",
		Repository:  "https://github.com/pulumi/pulumi-pagerduty",
		Config: map[string]*tfbridge.SchemaInfo{
			"skip_credentials_validation": {
				Type: "boolean",
				Default: &tfbridge.DefaultInfo{
					Value: false,
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"pagerduty_addon": {Tok: makeResource(mainMod, "Addon")},
			"pagerduty_business_service": {
				Tok: makeResource(mainMod, "BusinessService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_escalation_policy": {
				Tok: makeResource(mainMod, "EscalationPolicy"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_event_rule":           {Tok: makeResource(mainMod, "EventRule")},
			"pagerduty_extension":            {Tok: makeResource(mainMod, "Extension")},
			"pagerduty_extension_servicenow": {Tok: makeResource(mainMod, "ExtensionServiceNow")},
			"pagerduty_maintenance_window": {
				Tok: makeResource(mainMod, "MaintenanceWindow"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_ruleset":      {Tok: makeResource(mainMod, "Ruleset")},
			"pagerduty_ruleset_rule": {Tok: makeResource(mainMod, "RulesetRule")},
			"pagerduty_schedule": {
				Tok: makeResource(mainMod, "Schedule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_service": {
				Tok: makeResource(mainMod, "Service"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_service_dependency":  {Tok: makeResource(mainMod, "ServiceDependency")},
			"pagerduty_service_integration": {Tok: makeResource(mainMod, "ServiceIntegration")},
			"pagerduty_team": {
				Tok: makeResource(mainMod, "Team"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_team_membership": {Tok: makeResource(mainMod, "TeamMembership")},
			"pagerduty_user": {
				Tok: makeResource(mainMod, "User"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_user_contact_method":    {Tok: makeResource(mainMod, "UserContactMethod")},
			"pagerduty_user_notification_rule": {Tok: makeResource(mainMod, "UserNotificationRule")},
			"pagerduty_response_play": {
				Tok: makeResource(mainMod, "ResponsePlay"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_service_event_rule":           {Tok: makeResource(mainMod, "ServiceEventRule")},
			"pagerduty_slack_connection":             {Tok: makeResource(mainMod, "SlackConnection")},
			"pagerduty_tag":                          {Tok: makeResource(mainMod, "Tag")},
			"pagerduty_tag_assignment":               {Tok: makeResource(mainMod, "TagAssignment")},
			"pagerduty_business_service_subscriber":  {Tok: makeResource(mainMod, "BusinessServiceSubscriber")},
			"pagerduty_webhook_subscription":         {Tok: makeResource(mainMod, "WebhookSubscription")},
			"pagerduty_event_orchestration":          {Tok: makeResource(mainMod, "EventOrchestration")},
			"pagerduty_event_orchestration_router":   {Tok: makeResource(mainMod, "EventOrchestrationRouter")},
			"pagerduty_event_orchestration_service":  {Tok: makeResource(mainMod, "EventOrchestrationService")},
			"pagerduty_event_orchestration_unrouted": {Tok: makeResource(mainMod, "EventOrchestrationUnrouted")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"pagerduty_escalation_policy":   {Tok: makeDataSource(mainMod, "getEscalationPolicy")},
			"pagerduty_extension_schema":    {Tok: makeDataSource(mainMod, "getExtensionSchema")},
			"pagerduty_schedule":            {Tok: makeDataSource(mainMod, "getSchedule")},
			"pagerduty_service":             {Tok: makeDataSource(mainMod, "getService")},
			"pagerduty_user":                {Tok: makeDataSource(mainMod, "getUser")},
			"pagerduty_team":                {Tok: makeDataSource(mainMod, "getTeam")},
			"pagerduty_vendor":              {Tok: makeDataSource(mainMod, "getVendor")},
			"pagerduty_business_service":    {Tok: makeDataSource(mainMod, "getBusinessService")},
			"pagerduty_priority":            {Tok: makeDataSource(mainMod, "getPriority")},
			"pagerduty_ruleset":             {Tok: makeDataSource(mainMod, "getRuleset")},
			"pagerduty_user_contact_method": {Tok: makeDataSource(mainMod, "getUserContactMethod")},
			"pagerduty_service_integration": {Tok: makeDataSource(mainMod, "getServiceIntegration")},
			"pagerduty_tag":                 {Tok: makeDataSource(mainMod, "getTag")},
			"pagerduty_event_orchestration": {Tok: makeDataSource(mainMod, "getEventOrchestration")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
