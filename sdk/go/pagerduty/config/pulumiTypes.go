// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type UseAppOauthScopedToken struct {
	PdClientId     string `pulumi:"pdClientId"`
	PdClientSecret string `pulumi:"pdClientSecret"`
	PdSubdomain    string `pulumi:"pdSubdomain"`
}

// UseAppOauthScopedTokenInput is an input type that accepts UseAppOauthScopedTokenArgs and UseAppOauthScopedTokenOutput values.
// You can construct a concrete instance of `UseAppOauthScopedTokenInput` via:
//
//	UseAppOauthScopedTokenArgs{...}
type UseAppOauthScopedTokenInput interface {
	pulumi.Input

	ToUseAppOauthScopedTokenOutput() UseAppOauthScopedTokenOutput
	ToUseAppOauthScopedTokenOutputWithContext(context.Context) UseAppOauthScopedTokenOutput
}

type UseAppOauthScopedTokenArgs struct {
	PdClientId     pulumi.StringInput `pulumi:"pdClientId"`
	PdClientSecret pulumi.StringInput `pulumi:"pdClientSecret"`
	PdSubdomain    pulumi.StringInput `pulumi:"pdSubdomain"`
}

func (UseAppOauthScopedTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*UseAppOauthScopedToken)(nil)).Elem()
}

func (i UseAppOauthScopedTokenArgs) ToUseAppOauthScopedTokenOutput() UseAppOauthScopedTokenOutput {
	return i.ToUseAppOauthScopedTokenOutputWithContext(context.Background())
}

func (i UseAppOauthScopedTokenArgs) ToUseAppOauthScopedTokenOutputWithContext(ctx context.Context) UseAppOauthScopedTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UseAppOauthScopedTokenOutput)
}

type UseAppOauthScopedTokenOutput struct{ *pulumi.OutputState }

func (UseAppOauthScopedTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*UseAppOauthScopedToken)(nil)).Elem()
}

func (o UseAppOauthScopedTokenOutput) ToUseAppOauthScopedTokenOutput() UseAppOauthScopedTokenOutput {
	return o
}

func (o UseAppOauthScopedTokenOutput) ToUseAppOauthScopedTokenOutputWithContext(ctx context.Context) UseAppOauthScopedTokenOutput {
	return o
}

func (o UseAppOauthScopedTokenOutput) PdClientId() pulumi.StringOutput {
	return o.ApplyT(func(v UseAppOauthScopedToken) string { return v.PdClientId }).(pulumi.StringOutput)
}

func (o UseAppOauthScopedTokenOutput) PdClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v UseAppOauthScopedToken) string { return v.PdClientSecret }).(pulumi.StringOutput)
}

func (o UseAppOauthScopedTokenOutput) PdSubdomain() pulumi.StringOutput {
	return o.ApplyT(func(v UseAppOauthScopedToken) string { return v.PdSubdomain }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UseAppOauthScopedTokenInput)(nil)).Elem(), UseAppOauthScopedTokenArgs{})
	pulumi.RegisterOutputType(UseAppOauthScopedTokenOutput{})
}
