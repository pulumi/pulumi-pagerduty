// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [Cache Variable](https://support.pagerduty.com/docs/event-orchestration-variables) for a Service Event Orchestration.
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
//			engineering, err := pagerduty.NewTeam(ctx, "engineering", &pagerduty.TeamArgs{
//				Name: pulumi.String("Engineering"),
//			})
//			if err != nil {
//				return err
//			}
//			example, err := pagerduty.NewUser(ctx, "example", &pagerduty.UserArgs{
//				Name:  pulumi.String("Earline Greenholt"),
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//				Teams: pulumi.StringArray{
//					engineering.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleEscalationPolicy, err := pagerduty.NewEscalationPolicy(ctx, "example", &pagerduty.EscalationPolicyArgs{
//				Name:     pulumi.String("Engineering Escalation Policy"),
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("user"),
//								Id:   example.ID(),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			service, err := pagerduty.NewService(ctx, "service", &pagerduty.ServiceArgs{
//				Name:                   pulumi.String("My Web App"),
//				AutoResolveTimeout:     pulumi.String("14400"),
//				AcknowledgementTimeout: pulumi.String("600"),
//				EscalationPolicy:       exampleEscalationPolicy.ID(),
//				AlertCreation:          pulumi.String("create_alerts_and_incidents"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = pagerduty.LookupEventOrchestrationServiceCacheVariableOutput(ctx, pagerduty.GetEventOrchestrationServiceCacheVariableOutputArgs{
//				Service: service.ID(),
//				Name:    pulumi.String("example_cache_variable"),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupEventOrchestrationServiceCacheVariable(ctx *pulumi.Context, args *LookupEventOrchestrationServiceCacheVariableArgs, opts ...pulumi.InvokeOption) (*LookupEventOrchestrationServiceCacheVariableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEventOrchestrationServiceCacheVariableResult
	err := ctx.Invoke("pagerduty:index/getEventOrchestrationServiceCacheVariable:getEventOrchestrationServiceCacheVariable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventOrchestrationServiceCacheVariable.
type LookupEventOrchestrationServiceCacheVariableArgs struct {
	// ID of the Cache Variable associated with the Service Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
	Id *string `pulumi:"id"`
	// Name of the Cache Variable associated with the Service Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
	Name *string `pulumi:"name"`
	// ID of the Service Event Orchestration to which this Cache Variable belongs.
	Service string `pulumi:"service"`
}

// A collection of values returned by getEventOrchestrationServiceCacheVariable.
type LookupEventOrchestrationServiceCacheVariableResult struct {
	// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recentValue` or `triggerEventCount`.
	Conditions []GetEventOrchestrationServiceCacheVariableCondition `pulumi:"conditions"`
	// A configuration object to define what and how values will be stored in the Cache Variable.
	Configurations []GetEventOrchestrationServiceCacheVariableConfiguration `pulumi:"configurations"`
	// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
	Disabled bool    `pulumi:"disabled"`
	Id       *string `pulumi:"id"`
	Name     *string `pulumi:"name"`
	Service  string  `pulumi:"service"`
}

func LookupEventOrchestrationServiceCacheVariableOutput(ctx *pulumi.Context, args LookupEventOrchestrationServiceCacheVariableOutputArgs, opts ...pulumi.InvokeOption) LookupEventOrchestrationServiceCacheVariableResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupEventOrchestrationServiceCacheVariableResultOutput, error) {
			args := v.(LookupEventOrchestrationServiceCacheVariableArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("pagerduty:index/getEventOrchestrationServiceCacheVariable:getEventOrchestrationServiceCacheVariable", args, LookupEventOrchestrationServiceCacheVariableResultOutput{}, options).(LookupEventOrchestrationServiceCacheVariableResultOutput), nil
		}).(LookupEventOrchestrationServiceCacheVariableResultOutput)
}

// A collection of arguments for invoking getEventOrchestrationServiceCacheVariable.
type LookupEventOrchestrationServiceCacheVariableOutputArgs struct {
	// ID of the Cache Variable associated with the Service Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Name of the Cache Variable associated with the Service Event Orchestration. Specify either `id` or `name`. If both are specified `id` takes precedence.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// ID of the Service Event Orchestration to which this Cache Variable belongs.
	Service pulumi.StringInput `pulumi:"service"`
}

func (LookupEventOrchestrationServiceCacheVariableOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventOrchestrationServiceCacheVariableArgs)(nil)).Elem()
}

// A collection of values returned by getEventOrchestrationServiceCacheVariable.
type LookupEventOrchestrationServiceCacheVariableResultOutput struct{ *pulumi.OutputState }

func (LookupEventOrchestrationServiceCacheVariableResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventOrchestrationServiceCacheVariableResult)(nil)).Elem()
}

func (o LookupEventOrchestrationServiceCacheVariableResultOutput) ToLookupEventOrchestrationServiceCacheVariableResultOutput() LookupEventOrchestrationServiceCacheVariableResultOutput {
	return o
}

func (o LookupEventOrchestrationServiceCacheVariableResultOutput) ToLookupEventOrchestrationServiceCacheVariableResultOutputWithContext(ctx context.Context) LookupEventOrchestrationServiceCacheVariableResultOutput {
	return o
}

// Conditions to be evaluated in order to determine whether or not to update the Cache Variable's stored value. This attribute can only be used when `configuration.0.type` is `recentValue` or `triggerEventCount`.
func (o LookupEventOrchestrationServiceCacheVariableResultOutput) Conditions() GetEventOrchestrationServiceCacheVariableConditionArrayOutput {
	return o.ApplyT(func(v LookupEventOrchestrationServiceCacheVariableResult) []GetEventOrchestrationServiceCacheVariableCondition {
		return v.Conditions
	}).(GetEventOrchestrationServiceCacheVariableConditionArrayOutput)
}

// A configuration object to define what and how values will be stored in the Cache Variable.
func (o LookupEventOrchestrationServiceCacheVariableResultOutput) Configurations() GetEventOrchestrationServiceCacheVariableConfigurationArrayOutput {
	return o.ApplyT(func(v LookupEventOrchestrationServiceCacheVariableResult) []GetEventOrchestrationServiceCacheVariableConfiguration {
		return v.Configurations
	}).(GetEventOrchestrationServiceCacheVariableConfigurationArrayOutput)
}

// Indicates whether the Cache Variable is disabled and would therefore not be evaluated.
func (o LookupEventOrchestrationServiceCacheVariableResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEventOrchestrationServiceCacheVariableResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

func (o LookupEventOrchestrationServiceCacheVariableResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEventOrchestrationServiceCacheVariableResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

func (o LookupEventOrchestrationServiceCacheVariableResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEventOrchestrationServiceCacheVariableResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupEventOrchestrationServiceCacheVariableResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventOrchestrationServiceCacheVariableResult) string { return v.Service }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEventOrchestrationServiceCacheVariableResultOutput{})
}
