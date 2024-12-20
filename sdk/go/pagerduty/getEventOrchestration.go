// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific Global [Event Orchestration](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations)
func LookupEventOrchestration(ctx *pulumi.Context, args *LookupEventOrchestrationArgs, opts ...pulumi.InvokeOption) (*LookupEventOrchestrationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEventOrchestrationResult
	err := ctx.Invoke("pagerduty:index/getEventOrchestration:getEventOrchestration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventOrchestration.
type LookupEventOrchestrationArgs struct {
	// An integration for the Event Orchestration.
	IntegrationDetail []GetEventOrchestrationIntegrationDetail `pulumi:"integrationDetail"`
	// The name of the Global Event orchestration to find in the PagerDuty API.
	Name string `pulumi:"name"`
}

// A collection of values returned by getEventOrchestration.
type LookupEventOrchestrationResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An integration for the Event Orchestration.
	IntegrationDetail []GetEventOrchestrationIntegrationDetail `pulumi:"integrationDetail"`
	// The name of the found Event Orchestration.
	Name string `pulumi:"name"`
}

func LookupEventOrchestrationOutput(ctx *pulumi.Context, args LookupEventOrchestrationOutputArgs, opts ...pulumi.InvokeOption) LookupEventOrchestrationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupEventOrchestrationResultOutput, error) {
			args := v.(LookupEventOrchestrationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("pagerduty:index/getEventOrchestration:getEventOrchestration", args, LookupEventOrchestrationResultOutput{}, options).(LookupEventOrchestrationResultOutput), nil
		}).(LookupEventOrchestrationResultOutput)
}

// A collection of arguments for invoking getEventOrchestration.
type LookupEventOrchestrationOutputArgs struct {
	// An integration for the Event Orchestration.
	IntegrationDetail GetEventOrchestrationIntegrationDetailArrayInput `pulumi:"integrationDetail"`
	// The name of the Global Event orchestration to find in the PagerDuty API.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupEventOrchestrationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventOrchestrationArgs)(nil)).Elem()
}

// A collection of values returned by getEventOrchestration.
type LookupEventOrchestrationResultOutput struct{ *pulumi.OutputState }

func (LookupEventOrchestrationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventOrchestrationResult)(nil)).Elem()
}

func (o LookupEventOrchestrationResultOutput) ToLookupEventOrchestrationResultOutput() LookupEventOrchestrationResultOutput {
	return o
}

func (o LookupEventOrchestrationResultOutput) ToLookupEventOrchestrationResultOutputWithContext(ctx context.Context) LookupEventOrchestrationResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEventOrchestrationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventOrchestrationResult) string { return v.Id }).(pulumi.StringOutput)
}

// An integration for the Event Orchestration.
func (o LookupEventOrchestrationResultOutput) IntegrationDetail() GetEventOrchestrationIntegrationDetailArrayOutput {
	return o.ApplyT(func(v LookupEventOrchestrationResult) []GetEventOrchestrationIntegrationDetail {
		return v.IntegrationDetail
	}).(GetEventOrchestrationIntegrationDetailArrayOutput)
}

// The name of the found Event Orchestration.
func (o LookupEventOrchestrationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventOrchestrationResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEventOrchestrationResultOutput{})
}
