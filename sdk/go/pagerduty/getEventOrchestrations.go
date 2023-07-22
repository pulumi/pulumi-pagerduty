// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty/internal"
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
//	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pagerduty.NewEventOrchestration(ctx, "tfOrchA", nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEventOrchestration(ctx, "tfOrchB", nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.GetEventOrchestrations(ctx, &pagerduty.GetEventOrchestrationsArgs{
//				NameFilter: ".*Orchestration$",
//			}, nil)
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
	// The regex name of Global Event orchestrations to find in the PagerDuty API.
	NameFilter string `pulumi:"nameFilter"`
}

// A collection of values returned by getEventOrchestrations.
type GetEventOrchestrationsResult struct {
	EventOrchestrations []GetEventOrchestrationsEventOrchestration `pulumi:"eventOrchestrations"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The list of the Event Orchestrations which name match `nameFilter` argument.
	NameFilter string `pulumi:"nameFilter"`
}

func GetEventOrchestrationsOutput(ctx *pulumi.Context, args GetEventOrchestrationsOutputArgs, opts ...pulumi.InvokeOption) GetEventOrchestrationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEventOrchestrationsResult, error) {
			args := v.(GetEventOrchestrationsArgs)
			r, err := GetEventOrchestrations(ctx, &args, opts...)
			var s GetEventOrchestrationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEventOrchestrationsResultOutput)
}

// A collection of arguments for invoking getEventOrchestrations.
type GetEventOrchestrationsOutputArgs struct {
	// The regex name of Global Event orchestrations to find in the PagerDuty API.
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

func (o GetEventOrchestrationsResultOutput) EventOrchestrations() GetEventOrchestrationsEventOrchestrationArrayOutput {
	return o.ApplyT(func(v GetEventOrchestrationsResult) []GetEventOrchestrationsEventOrchestration {
		return v.EventOrchestrations
	}).(GetEventOrchestrationsEventOrchestrationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEventOrchestrationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventOrchestrationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The list of the Event Orchestrations which name match `nameFilter` argument.
func (o GetEventOrchestrationsResultOutput) NameFilter() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventOrchestrationsResult) string { return v.NameFilter }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEventOrchestrationsResultOutput{})
}
