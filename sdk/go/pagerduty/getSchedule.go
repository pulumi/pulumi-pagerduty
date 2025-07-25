// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [schedule](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODE4MQ-list-schedules) that you can use for other PagerDuty resources.
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
//			test, err := pagerduty.LookupSchedule(ctx, &pagerduty.LookupScheduleArgs{
//				Name: "Daily Engineering Rotation",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEscalationPolicy(ctx, "foo", &pagerduty.EscalationPolicyArgs{
//				Name:     pulumi.String("Engineering Escalation Policy"),
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("schedule"),
//								Id:   pulumi.String(test.Id),
//							},
//						},
//					},
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
func LookupSchedule(ctx *pulumi.Context, args *LookupScheduleArgs, opts ...pulumi.InvokeOption) (*LookupScheduleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupScheduleResult
	err := ctx.Invoke("pagerduty:index/getSchedule:getSchedule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchedule.
type LookupScheduleArgs struct {
	// The name to use to find a schedule in the PagerDuty API.
	Name string `pulumi:"name"`
}

// A collection of values returned by getSchedule.
type LookupScheduleResult struct {
	// The ID of the found schedule.
	Id string `pulumi:"id"`
	// The short name of the found schedule.
	Name string `pulumi:"name"`
}

func LookupScheduleOutput(ctx *pulumi.Context, args LookupScheduleOutputArgs, opts ...pulumi.InvokeOption) LookupScheduleResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupScheduleResultOutput, error) {
			args := v.(LookupScheduleArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("pagerduty:index/getSchedule:getSchedule", args, LookupScheduleResultOutput{}, options).(LookupScheduleResultOutput), nil
		}).(LookupScheduleResultOutput)
}

// A collection of arguments for invoking getSchedule.
type LookupScheduleOutputArgs struct {
	// The name to use to find a schedule in the PagerDuty API.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupScheduleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupScheduleArgs)(nil)).Elem()
}

// A collection of values returned by getSchedule.
type LookupScheduleResultOutput struct{ *pulumi.OutputState }

func (LookupScheduleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupScheduleResult)(nil)).Elem()
}

func (o LookupScheduleResultOutput) ToLookupScheduleResultOutput() LookupScheduleResultOutput {
	return o
}

func (o LookupScheduleResultOutput) ToLookupScheduleResultOutputWithContext(ctx context.Context) LookupScheduleResultOutput {
	return o
}

// The ID of the found schedule.
func (o LookupScheduleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupScheduleResult) string { return v.Id }).(pulumi.StringOutput)
}

// The short name of the found schedule.
func (o LookupScheduleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupScheduleResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupScheduleResultOutput{})
}
