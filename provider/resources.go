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
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/terraform-providers/terraform-provider-pagerduty/pagerduty"
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

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(pagerduty.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "pagerduty",
		Description: "A Pulumi package for creating and managing pagerduty cloud resources.",
		Keywords:    []string{"pulumi", "pagerduty"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-pagerduty",
		Config: map[string]*tfbridge.SchemaInfo{
			"token": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"PAGERDUTY_TOKEN"},
				},
			},
			"skip_credentials_validation": {
				Type: "boolean",
				Default: &tfbridge.DefaultInfo{
					Value: false,
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"pagerduty_addon":                  {Tok: makeResource(mainMod, "Addon")},
			"pagerduty_business_service":       {Tok: makeResource(mainMod, "BusinessService")},
			"pagerduty_escalation_policy":      {Tok: makeResource(mainMod, "EscalationPolicy")},
			"pagerduty_event_rule":             {Tok: makeResource(mainMod, "EventRule")},
			"pagerduty_extension":              {Tok: makeResource(mainMod, "Extension")},
			"pagerduty_maintenance_window":     {Tok: makeResource(mainMod, "MaintenanceWindow")},
			"pagerduty_ruleset":                {Tok: makeResource(mainMod, "Ruleset")},
			"pagerduty_ruleset_rule":           {Tok: makeResource(mainMod, "RulesetRule")},
			"pagerduty_schedule":               {Tok: makeResource(mainMod, "Schedule")},
			"pagerduty_service":                {Tok: makeResource(mainMod, "Service")},
			"pagerduty_service_dependency":     {Tok: makeResource(mainMod, "ServiceDependency")},
			"pagerduty_service_integration":    {Tok: makeResource(mainMod, "ServiceIntegration")},
			"pagerduty_team":                   {Tok: makeResource(mainMod, "Team")},
			"pagerduty_team_membership":        {Tok: makeResource(mainMod, "TeamMembership")},
			"pagerduty_user":                   {Tok: makeResource(mainMod, "User")},
			"pagerduty_user_contact_method":    {Tok: makeResource(mainMod, "UserContactMethod")},
			"pagerduty_user_notification_rule": {Tok: makeResource(mainMod, "UserNotificationRule")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"pagerduty_escalation_policy": {Tok: makeDataSource(mainMod, "getEscalationPolicy")},
			"pagerduty_extension_schema":  {Tok: makeDataSource(mainMod, "getExtensionSchema")},
			"pagerduty_schedule":          {Tok: makeDataSource(mainMod, "getSchedule")},
			"pagerduty_service":           {Tok: makeDataSource(mainMod, "getService")},
			"pagerduty_user":              {Tok: makeDataSource(mainMod, "getUser")},
			"pagerduty_team":              {Tok: makeDataSource(mainMod, "getTeam")},
			"pagerduty_vendor":            {Tok: makeDataSource(mainMod, "getVendor")},
			"pagerduty_business_service":  {Tok: makeDataSource(mainMod, "getBusinessService")},
			"pagerduty_priority":          {Tok: makeDataSource(mainMod, "getPriority")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=2.9.0,<3.0.0",
			},
			UsesIOClasses: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
