// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [service](https://api-reference.pagerduty.com/#!/Services/get_services).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleService, err := pagerduty.LookupService(ctx, &pagerduty.LookupServiceArgs{
//				Name: "My Service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			datadog, err := pagerduty.GetVendor(ctx, &pagerduty.GetVendorArgs{
//				Name: "Datadog",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceIntegration(ctx, "exampleServiceIntegration", &pagerduty.ServiceIntegrationArgs{
//				Vendor:  *pulumi.String(datadog.Id),
//				Service: *pulumi.String(exampleService.Id),
//				Type:    pulumi.String("generic_events_api_inbound_integration"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupService(ctx *pulumi.Context, args *LookupServiceArgs, opts ...pulumi.InvokeOption) (*LookupServiceResult, error) {
	var rv LookupServiceResult
	err := ctx.Invoke("pagerduty:index/getService:getService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getService.
type LookupServiceArgs struct {
	// The service name to use to find a service in the PagerDuty API.
	Name string `pulumi:"name"`
}

// A collection of values returned by getService.
type LookupServiceResult struct {
	// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Value is null if the feature is disabled. Value must not be negative. Setting this field to 0, null (or unset) will disable the feature.
	AcknowledgementTimeout int `pulumi:"acknowledgementTimeout"`
	// Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging.
	AlertCreation string `pulumi:"alertCreation"`
	// Time in seconds that an incident is automatically resolved if left open for that long. Value is null if the feature is disabled. Value must not be negative. Setting this field to 0, null (or unset) will disable the feature.
	AutoResolveTimeout int `pulumi:"autoResolveTimeout"`
	// The user-provided description of the service.
	Description string `pulumi:"description"`
	// The escalation policy associated with this service.
	EscalationPolicy string `pulumi:"escalationPolicy"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The short name of the found service.
	Name string `pulumi:"name"`
	// The set of teams associated with the service.
	Teams []GetServiceTeam `pulumi:"teams"`
	// The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
	Type string `pulumi:"type"`
}

func LookupServiceOutput(ctx *pulumi.Context, args LookupServiceOutputArgs, opts ...pulumi.InvokeOption) LookupServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceResult, error) {
			args := v.(LookupServiceArgs)
			r, err := LookupService(ctx, &args, opts...)
			var s LookupServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceResultOutput)
}

// A collection of arguments for invoking getService.
type LookupServiceOutputArgs struct {
	// The service name to use to find a service in the PagerDuty API.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceArgs)(nil)).Elem()
}

// A collection of values returned by getService.
type LookupServiceResultOutput struct{ *pulumi.OutputState }

func (LookupServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceResult)(nil)).Elem()
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutput() LookupServiceResultOutput {
	return o
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutputWithContext(ctx context.Context) LookupServiceResultOutput {
	return o
}

// Time in seconds that an incident changes to the Triggered State after being Acknowledged. Value is null if the feature is disabled. Value must not be negative. Setting this field to 0, null (or unset) will disable the feature.
func (o LookupServiceResultOutput) AcknowledgementTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceResult) int { return v.AcknowledgementTimeout }).(pulumi.IntOutput)
}

// Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging.
func (o LookupServiceResultOutput) AlertCreation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.AlertCreation }).(pulumi.StringOutput)
}

// Time in seconds that an incident is automatically resolved if left open for that long. Value is null if the feature is disabled. Value must not be negative. Setting this field to 0, null (or unset) will disable the feature.
func (o LookupServiceResultOutput) AutoResolveTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceResult) int { return v.AutoResolveTimeout }).(pulumi.IntOutput)
}

// The user-provided description of the service.
func (o LookupServiceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Description }).(pulumi.StringOutput)
}

// The escalation policy associated with this service.
func (o LookupServiceResultOutput) EscalationPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.EscalationPolicy }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The short name of the found service.
func (o LookupServiceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Name }).(pulumi.StringOutput)
}

// The set of teams associated with the service.
func (o LookupServiceResultOutput) Teams() GetServiceTeamArrayOutput {
	return o.ApplyT(func(v LookupServiceResult) []GetServiceTeam { return v.Teams }).(GetServiceTeamArrayOutput)
}

// The type of object. The value returned will be `service`. Can be used for passing to a service dependency.
func (o LookupServiceResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceResultOutput{})
}
