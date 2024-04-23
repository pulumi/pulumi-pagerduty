// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific service_integration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pagerduty.LookupServiceIntegration(ctx, &pagerduty.LookupServiceIntegrationArgs{
//				ServiceName:        "My Service",
//				IntegrationSummary: "Datadog",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceIntegration(ctx *pulumi.Context, args *LookupServiceIntegrationArgs, opts ...pulumi.InvokeOption) (*LookupServiceIntegrationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceIntegrationResult
	err := ctx.Invoke("pagerduty:index/getServiceIntegration:getServiceIntegration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceIntegration.
type LookupServiceIntegrationArgs struct {
	// The integration summary used to find the desired integration on the service.
	IntegrationSummary string `pulumi:"integrationSummary"`
	// The service name to use to find a service in the PagerDuty API.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getServiceIntegration.
type LookupServiceIntegrationResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The integration key for the integration. This can be used to configure alerts.
	IntegrationKey     string `pulumi:"integrationKey"`
	IntegrationSummary string `pulumi:"integrationSummary"`
	ServiceName        string `pulumi:"serviceName"`
}

func LookupServiceIntegrationOutput(ctx *pulumi.Context, args LookupServiceIntegrationOutputArgs, opts ...pulumi.InvokeOption) LookupServiceIntegrationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceIntegrationResult, error) {
			args := v.(LookupServiceIntegrationArgs)
			r, err := LookupServiceIntegration(ctx, &args, opts...)
			var s LookupServiceIntegrationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceIntegrationResultOutput)
}

// A collection of arguments for invoking getServiceIntegration.
type LookupServiceIntegrationOutputArgs struct {
	// The integration summary used to find the desired integration on the service.
	IntegrationSummary pulumi.StringInput `pulumi:"integrationSummary"`
	// The service name to use to find a service in the PagerDuty API.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (LookupServiceIntegrationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceIntegrationArgs)(nil)).Elem()
}

// A collection of values returned by getServiceIntegration.
type LookupServiceIntegrationResultOutput struct{ *pulumi.OutputState }

func (LookupServiceIntegrationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceIntegrationResult)(nil)).Elem()
}

func (o LookupServiceIntegrationResultOutput) ToLookupServiceIntegrationResultOutput() LookupServiceIntegrationResultOutput {
	return o
}

func (o LookupServiceIntegrationResultOutput) ToLookupServiceIntegrationResultOutputWithContext(ctx context.Context) LookupServiceIntegrationResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceIntegrationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceIntegrationResult) string { return v.Id }).(pulumi.StringOutput)
}

// The integration key for the integration. This can be used to configure alerts.
func (o LookupServiceIntegrationResultOutput) IntegrationKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceIntegrationResult) string { return v.IntegrationKey }).(pulumi.StringOutput)
}

func (o LookupServiceIntegrationResultOutput) IntegrationSummary() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceIntegrationResult) string { return v.IntegrationSummary }).(pulumi.StringOutput)
}

func (o LookupServiceIntegrationResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceIntegrationResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceIntegrationResultOutput{})
}
