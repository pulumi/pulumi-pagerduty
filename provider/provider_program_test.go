//go:build !go && !nodejs && !python && !dotnet

package pagerduty

import (
	"os"
	"path/filepath"
	"slices"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const providerName = "pagerduty"
const defaultBaselineVersion = "4.11.1"

var programs = []string{
	"test-programs/index_usercontactmethod",
	"test-programs/index_service",
	"test-programs/index_schedule",
	"test-programs/index_usernotificationrule",
	"test-programs/index_escalationpolicy",
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func testProviderUpgrade(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, defaultBaselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.DownloadProviderVersion("random", "4.16.0"),
	)
	result := providertest.PreviewProviderUpgrade(t, test, providerName, defaultBaselineVersion,
		optproviderupgrade.DisableAttach())
	assertpreview.HasNoReplacements(t, result)
}

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	// Skipping due to known flakes - see https://github.com/pulumi/pulumi-pagerduty/issues/541
	if slices.Contains([]string{
		"test-programs/index_service",
		"test-programs/index_schedule",
		"test-programs/index_usernotificationrule",
		"test-programs/index_escalationpolicy",
		"test-programs/index_usercontactmethod",
	}, dir) {
		t.Skipf("pulumi-pagerduty#541: Skipping test due to flakiness")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
		opttest.DownloadProviderVersion("random", "4.16.0"),
	)
	test.Up(t)
}

func TestPrograms(t *testing.T) {
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}

func TestProgramsUpgrade(t *testing.T) {
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProviderUpgrade(t, p)
		})
	}
}
