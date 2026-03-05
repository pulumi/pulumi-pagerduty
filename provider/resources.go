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
	"bytes"
	"context"
	"fmt"
	"path/filepath"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"
	// tzdata is used to ensure the provider works when deployed to OS-es that do not have it
	_ "time/tzdata"

	"github.com/PagerDuty/terraform-provider-pagerduty/pagerduty"
	pagerdutyplugin "github.com/PagerDuty/terraform-provider-pagerduty/pagerdutyplugin"

	pftfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-pagerduty/provider/v4/pkg/version"
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
	p := pftfbridge.MuxShimWithDisjointgPF(context.Background(),
		shimv2.NewProvider(pagerduty.Provider(pagerduty.IsMuxed)),
		pagerdutyplugin.New())

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
		Version:     version.Version,
		DocRules:    &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Config: map[string]*tfbridge.SchemaInfo{
			"skip_credentials_validation": {
				Type: "boolean",
				Default: &tfbridge.DefaultInfo{
					Value: false,
				},
			},
			"use_app_oauth_scoped_token": {
				MaxItemsOne: tfbridge.True(),
				Elem: &tfbridge.SchemaInfo{
					Fields: map[string]*tfbridge.SchemaInfo{
						"pd_client_id":     {Name: "pdClientId"},
						"pd_client_secret": {Name: "pdClientSecret"},
						"pd_subdomain":     {Name: "pdSubdomain"},
					},
				},
			},
		},
		UpstreamRepoPath: "./upstream",
		Resources: map[string]*tfbridge.ResourceInfo{
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
			"pagerduty_extension_servicenow": {Tok: makeResource(mainMod, "ExtensionServiceNow")},
			"pagerduty_maintenance_window": {
				Tok: makeResource(mainMod, "MaintenanceWindow"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
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
			"pagerduty_team": {
				Tok: makeResource(mainMod, "Team"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_user": {
				Tok: makeResource(mainMod, "User"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"pagerduty_response_play": {
				Tok: makeResource(mainMod, "ResponsePlay"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"pagerduty_event_orchestration": {
				Tok: tfbridge.MakeDataSource("pagerduty", mainMod, "getEventOrchestration"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"integration": {
						Name: "integrationDetail",
					},
				},
			},
			"pagerduty_incident_type":              {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"pagerduty_incident_type_custom_field": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tfbridgetokens.SingleModule("pagerduty_",
		mainMod, tfbridgetokens.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults, tfbridge.DocsEdit{
		Path: "service.html.markdown",
		Edit: func(_ string, content []byte) ([]byte, error) {
			content = bytes.Replace(content,
				[]byte("You may specify one optional `incident_urgency_rule` block configuring what urgencies to "+
					"use.\nYour PagerDuty account must have the `urgencies` ability to assign an incident urgency "+
					"rule.\nThe block contains the following arguments:"),
				[]byte("The `incident_urgency_rule` block contains the following arguments:"),
				1)
			content = bytes.Replace(content,
				[]byte("When using `type = \"use_support_hours\"` in `incident_urgency_rule` you must specify "+
					"exactly one (otherwise optional) `support_hours` block.\nYour PagerDuty account must have the "+
					"`service_support_hours` ability to assign support hours."),
				[]byte("The `support_hours` block contains the following arguments:"),
				1)
			content = bytes.Replace(content,
				[]byte("A `scheduled_actions` block is required when using `type = \"use_support_hours\"` in "+
					"`incident_urgency_rule`.\n\nThe block contains the following arguments:"),
				[]byte("The `scheduled_actions` block contains the following arguments:"),
				1)
			return content, nil
		},
	})
}

//go:embed cmd/pulumi-resource-pagerduty/bridge-metadata.json
var metadata []byte
