// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information as a list about specific Global [Event Orchestrations](https://developer.pagerduty.com/api-reference/7ba0fe7bdb26a-list-event-orchestrations) filtered by a Regular Expression provided.
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
//			_, err := pagerduty.NewEventOrchestration(ctx, "tf_orch_a", &pagerduty.EventOrchestrationArgs{
//				Name: pulumi.String("Test Event A Orchestration"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestration(ctx, "tf_orch_b", &pagerduty.EventOrchestrationArgs{
//				Name: pulumi.String("Test Event B Orchestration"),
//			})
//			if err != nil {
//				return err
//			}
//			tfMyMonitor, err := pagerduty.GetEventOrchestrations(ctx, &pagerduty.GetEventOrchestrationsArgs{
//				NameFilter: ".*Orchestration$",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestrationGlobalCacheVariable(ctx, "cache_var", &pagerduty.EventOrchestrationGlobalCacheVariableArgs{
//				EventOrchestration: pulumi.String(tfMyMonitor.EventOrchestrations[0].Id),
//				Name:               pulumi.String("recent_host"),
//				Conditions: pagerduty.EventOrchestrationGlobalCacheVariableConditionArray{
//					&pagerduty.EventOrchestrationGlobalCacheVariableConditionArgs{
//						Expression: pulumi.String("event.source exists"),
//					},
//				},
//				Configuration: &pagerduty.EventOrchestrationGlobalCacheVariableConfigurationArgs{
//					Type:   pulumi.String("recent_value"),
//					Source: pulumi.String("event.source"),
//					Regex:  pulumi.String(".*"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetEventOrchestrations(ctx *pulumi.Context, args *GetEventOrchestrationsArgs, opts ...pulumi.InvokeOption) (*GetEventOrchestrationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEventOrchestrationsResult
	err := ctx.Invoke("pagerduty:index/getEventOrchestrations:getEventOrchestrations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventOrchestrations.
type GetEventOrchestrationsArgs struct {
	// The regex name of Global Event Orchestrations to find in the PagerDuty API.
	NameFilter string `pulumi:"nameFilter"`
}

// A collection of values returned by getEventOrchestrations.
type GetEventOrchestrationsResult struct {
	// The list of the Event Orchestrations with a name that matches the `nameFilter` argument.
	EventOrchestrations []GetEventOrchestrationsEventOrchestration `pulumi:"eventOrchestrations"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The regex supplied to find the list of Global Event Orchestrations
	NameFilter string `pulumi:"nameFilter"`
}

func GetEventOrchestrationsOutput(ctx *pulumi.Context, args GetEventOrchestrationsOutputArgs, opts ...pulumi.InvokeOption) GetEventOrchestrationsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetEventOrchestrationsResultOutput, error) {
			args := v.(GetEventOrchestrationsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("pagerduty:index/getEventOrchestrations:getEventOrchestrations", args, GetEventOrchestrationsResultOutput{}, options).(GetEventOrchestrationsResultOutput), nil
		}).(GetEventOrchestrationsResultOutput)
}

// A collection of arguments for invoking getEventOrchestrations.
type GetEventOrchestrationsOutputArgs struct {
	// The regex name of Global Event Orchestrations to find in the PagerDuty API.
	NameFilter pulumi.StringInput `pulumi:"nameFilter"`
}

func (GetEventOrchestrationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventOrchestrationsArgs)(nil)).Elem()
}

// A collection of values returned by getEventOrchestrations.
type GetEventOrchestrationsResultOutput struct{ *pulumi.OutputState }

func (GetEventOrchestrationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventOrchestrationsResult)(nil)).Elem()
}

func (o GetEventOrchestrationsResultOutput) ToGetEventOrchestrationsResultOutput() GetEventOrchestrationsResultOutput {
	return o
}

func (o GetEventOrchestrationsResultOutput) ToGetEventOrchestrationsResultOutputWithContext(ctx context.Context) GetEventOrchestrationsResultOutput {
	return o
}

// The list of the Event Orchestrations with a name that matches the `nameFilter` argument.
func (o GetEventOrchestrationsResultOutput) EventOrchestrations() GetEventOrchestrationsEventOrchestrationArrayOutput {
	return o.ApplyT(func(v GetEventOrchestrationsResult) []GetEventOrchestrationsEventOrchestration {
		return v.EventOrchestrations
	}).(GetEventOrchestrationsEventOrchestrationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEventOrchestrationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventOrchestrationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The regex supplied to find the list of Global Event Orchestrations
func (o GetEventOrchestrationsResultOutput) NameFilter() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventOrchestrationsResult) string { return v.NameFilter }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEventOrchestrationsResultOutput{})
}
