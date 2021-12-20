// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func GetApiUrlOverride(ctx *pulumi.Context) string {
	return config.Get(ctx, "pagerduty:apiUrlOverride")
}
func GetServiceRegion(ctx *pulumi.Context) string {
	return config.Get(ctx, "pagerduty:serviceRegion")
}
func GetSkipCredentialsValidation(ctx *pulumi.Context) bool {
	v, err := config.TryBool(ctx, "pagerduty:skipCredentialsValidation")
	if err == nil {
		return v
	}
	return false
}
func GetToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "pagerduty:token")
}
func GetUserToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "pagerduty:userToken")
}
