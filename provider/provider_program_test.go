//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package pagerduty

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
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

type UpgradeTestOpts struct {
	baselineVersion string
	assertFunc      func(*testing.T, auto.PreviewResult)
	config          map[string]string
}

func WithBaselineVersion(baselineVersion string) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.baselineVersion = baselineVersion
	}
}

func WithAssertFunc(assertFunc func(*testing.T, auto.PreviewResult)) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.assertFunc = assertFunc
	}
}

func WithConfig(config map[string]string) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.config = config
	}
}
func testProviderUpgrade(t *testing.T, dir string, opts ...func(*UpgradeTestOpts)) {
	options := &UpgradeTestOpts{}
	for _, o := range opts {
		o(options)
	}
	testProviderUpgradeWithOpts(t, dir, options.baselineVersion, options.config, options.assertFunc)
}

func testProviderUpgradeWithOpts(
	t *testing.T, dir, baselineVersion string, config map[string]string,
	assertFunction func(*testing.T, auto.PreviewResult),
) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	if baselineVersion == "" {
		baselineVersion = defaultBaselineVersion
	}
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, baselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.DownloadProviderVersion("random", "4.16.0"),
	)
	for k, v := range config {
		test.SetConfig(k, v)
	}
	result := providertest.PreviewProviderUpgrade(test, providerName, baselineVersion, optproviderupgrade.DisableAttach())
	if assertFunction != nil {
		assertFunction(t, result)
	} else {
		assertpreview.HasNoReplacements(t, result)
	}
}

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	// Skipping due to known flakes - see https://github.com/pulumi/pulumi-pagerduty/issues/541
	if !(dir == "test-programs/index_usercontactmethod") {
		t.Skipf("Skipping test due to flakiness")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
		opttest.DownloadProviderVersion("random", "4.16.0"),
	)
	test.Up()
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
