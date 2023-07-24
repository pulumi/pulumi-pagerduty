// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNA-list-escalation-policies) that you can use for other PagerDuty resources.
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
//			testEscalationPolicy, err := pagerduty.LookupEscalationPolicy(ctx, &pagerduty.LookupEscalationPolicyArgs{
//				Name: "Engineering Escalation Policy",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewService(ctx, "testService", &pagerduty.ServiceArgs{
//				AutoResolveTimeout:     pulumi.String("14400"),
//				AcknowledgementTimeout: pulumi.String("600"),
//				EscalationPolicy:       *pulumi.String(testEscalationPolicy.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEscalationPolicy(ctx *pulumi.Context, args *LookupEscalationPolicyArgs, opts ...pulumi.InvokeOption) (*LookupEscalationPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEscalationPolicyResult
	err := ctx.Invoke("pagerduty:index/getEscalationPolicy:getEscalationPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEscalationPolicy.
type LookupEscalationPolicyArgs struct {
	// The name to use to find an escalation policy in the PagerDuty API.
	Name string `pulumi:"name"`
}

// A collection of values returned by getEscalationPolicy.
type LookupEscalationPolicyResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The short name of the found escalation policy.
	Name string `pulumi:"name"`
}

func LookupEscalationPolicyOutput(ctx *pulumi.Context, args LookupEscalationPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupEscalationPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEscalationPolicyResult, error) {
			args := v.(LookupEscalationPolicyArgs)
			r, err := LookupEscalationPolicy(ctx, &args, opts...)
			var s LookupEscalationPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEscalationPolicyResultOutput)
}

// A collection of arguments for invoking getEscalationPolicy.
type LookupEscalationPolicyOutputArgs struct {
	// The name to use to find an escalation policy in the PagerDuty API.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupEscalationPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEscalationPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getEscalationPolicy.
type LookupEscalationPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupEscalationPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEscalationPolicyResult)(nil)).Elem()
}

func (o LookupEscalationPolicyResultOutput) ToLookupEscalationPolicyResultOutput() LookupEscalationPolicyResultOutput {
	return o
}

func (o LookupEscalationPolicyResultOutput) ToLookupEscalationPolicyResultOutputWithContext(ctx context.Context) LookupEscalationPolicyResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEscalationPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEscalationPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// The short name of the found escalation policy.
func (o LookupEscalationPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEscalationPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEscalationPolicyResultOutput{})
}
