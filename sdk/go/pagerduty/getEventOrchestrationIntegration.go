// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [Integration](https://developer.pagerduty.com/api-reference/1c6607db389a8-get-an-integration-for-an-event-orchestration) for an Event Orchestration.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			eventOrchestration, err := pagerduty.NewEventOrchestration(ctx, "event_orchestration", &pagerduty.EventOrchestrationArgs{
//				Name: pulumi.String("Test Event Orchestration"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = pagerduty.LookupEventOrchestrationIntegrationOutput(ctx, pagerduty.GetEventOrchestrationIntegrationOutputArgs{
//				EventOrchestration: eventOrchestration.ID(),
//				Label:              pulumi.String("Test Event Orchestration Default Integration"),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupEventOrchestrationIntegration(ctx *pulumi.Context, args *LookupEventOrchestrationIntegrationArgs, opts ...pulumi.InvokeOption) (*LookupEventOrchestrationIntegrationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEventOrchestrationIntegrationResult
	err := ctx.Invoke("pagerduty:index/getEventOrchestrationIntegration:getEventOrchestrationIntegration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventOrchestrationIntegration.
type LookupEventOrchestrationIntegrationArgs struct {
	// ID of the Event Orchestration to which this Integration belongs.
	EventOrchestration string `pulumi:"eventOrchestration"`
	// ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
	Id *string `pulumi:"id"`
	// Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
	Label *string `pulumi:"label"`
}

// A collection of values returned by getEventOrchestrationIntegration.
type LookupEventOrchestrationIntegrationResult struct {
	EventOrchestration string                                      `pulumi:"eventOrchestration"`
	Id                 *string                                     `pulumi:"id"`
	Label              *string                                     `pulumi:"label"`
	Parameters         []GetEventOrchestrationIntegrationParameter `pulumi:"parameters"`
}

func LookupEventOrchestrationIntegrationOutput(ctx *pulumi.Context, args LookupEventOrchestrationIntegrationOutputArgs, opts ...pulumi.InvokeOption) LookupEventOrchestrationIntegrationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEventOrchestrationIntegrationResult, error) {
			args := v.(LookupEventOrchestrationIntegrationArgs)
			r, err := LookupEventOrchestrationIntegration(ctx, &args, opts...)
			var s LookupEventOrchestrationIntegrationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEventOrchestrationIntegrationResultOutput)
}

// A collection of arguments for invoking getEventOrchestrationIntegration.
type LookupEventOrchestrationIntegrationOutputArgs struct {
	// ID of the Event Orchestration to which this Integration belongs.
	EventOrchestration pulumi.StringInput `pulumi:"eventOrchestration"`
	// ID of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Name/description of the Integration associated with the Event Orchestration. Specify either `id` or `label`. If both are specified `id` takes precedence. The value of `label` is not unique. Potentially there might be multiple Integrations with the same `label` value associated with the Event Orchestration and retrieving data by `label` attribute will result in an error during the planning step.
	Label pulumi.StringPtrInput `pulumi:"label"`
}

func (LookupEventOrchestrationIntegrationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventOrchestrationIntegrationArgs)(nil)).Elem()
}

// A collection of values returned by getEventOrchestrationIntegration.
type LookupEventOrchestrationIntegrationResultOutput struct{ *pulumi.OutputState }

func (LookupEventOrchestrationIntegrationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventOrchestrationIntegrationResult)(nil)).Elem()
}

func (o LookupEventOrchestrationIntegrationResultOutput) ToLookupEventOrchestrationIntegrationResultOutput() LookupEventOrchestrationIntegrationResultOutput {
	return o
}

func (o LookupEventOrchestrationIntegrationResultOutput) ToLookupEventOrchestrationIntegrationResultOutputWithContext(ctx context.Context) LookupEventOrchestrationIntegrationResultOutput {
	return o
}

func (o LookupEventOrchestrationIntegrationResultOutput) EventOrchestration() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventOrchestrationIntegrationResult) string { return v.EventOrchestration }).(pulumi.StringOutput)
}

func (o LookupEventOrchestrationIntegrationResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEventOrchestrationIntegrationResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

func (o LookupEventOrchestrationIntegrationResultOutput) Label() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEventOrchestrationIntegrationResult) *string { return v.Label }).(pulumi.StringPtrOutput)
}

func (o LookupEventOrchestrationIntegrationResultOutput) Parameters() GetEventOrchestrationIntegrationParameterArrayOutput {
	return o.ApplyT(func(v LookupEventOrchestrationIntegrationResult) []GetEventOrchestrationIntegrationParameter {
		return v.Parameters
	}).(GetEventOrchestrationIntegrationParameterArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEventOrchestrationIntegrationResultOutput{})
}
