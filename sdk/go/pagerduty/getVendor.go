// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [vendor](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODI1OQ-list-vendors) that you can use for a service integration (e.g. Amazon Cloudwatch, Splunk, Datadog).
//
// > For the case of vendors that rely on [Change Events](https://support.pagerduty.com/docs/change-events) (e.g. Jekings CI, Github, Gitlab, ...) is important to know that those vendors are only available with [PagerDuty AIOps](https://support.pagerduty.com/docs/aiops) add-on. Therefore, they won't be accessible as result of `getVendor` data source without the proper entitlements.
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
//			datadog, err := pagerduty.GetVendor(ctx, &pagerduty.GetVendorArgs{
//				Name: "Datadog",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleUser, err := pagerduty.NewUser(ctx, "exampleUser", &pagerduty.UserArgs{
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//				Teams: pulumi.StringArray{
//					pagerduty_team.Example.Id,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewEscalationPolicy(ctx, "foo", &pagerduty.EscalationPolicyArgs{
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("user"),
//								Id:   exampleUser.ID(),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleService, err := pagerduty.NewService(ctx, "exampleService", &pagerduty.ServiceArgs{
//				AutoResolveTimeout:     pulumi.String("14400"),
//				AcknowledgementTimeout: pulumi.String("600"),
//				EscalationPolicy:       pulumi.Any(pagerduty_escalation_policy.Example.Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewServiceIntegration(ctx, "exampleServiceIntegration", &pagerduty.ServiceIntegrationArgs{
//				Vendor:  pulumi.String(datadog.Id),
//				Service: exampleService.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetVendor(ctx *pulumi.Context, args *GetVendorArgs, opts ...pulumi.InvokeOption) (*GetVendorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVendorResult
	err := ctx.Invoke("pagerduty:index/getVendor:getVendor", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVendor.
type GetVendorArgs struct {
	// The vendor name to use to find a vendor in the PagerDuty API.
	Name string `pulumi:"name"`
}

// A collection of values returned by getVendor.
type GetVendorResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The short name of the found vendor.
	Name string `pulumi:"name"`
	// The generic service type for this vendor.
	Type string `pulumi:"type"`
}

func GetVendorOutput(ctx *pulumi.Context, args GetVendorOutputArgs, opts ...pulumi.InvokeOption) GetVendorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVendorResult, error) {
			args := v.(GetVendorArgs)
			r, err := GetVendor(ctx, &args, opts...)
			var s GetVendorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVendorResultOutput)
}

// A collection of arguments for invoking getVendor.
type GetVendorOutputArgs struct {
	// The vendor name to use to find a vendor in the PagerDuty API.
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetVendorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVendorArgs)(nil)).Elem()
}

// A collection of values returned by getVendor.
type GetVendorResultOutput struct{ *pulumi.OutputState }

func (GetVendorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVendorResult)(nil)).Elem()
}

func (o GetVendorResultOutput) ToGetVendorResultOutput() GetVendorResultOutput {
	return o
}

func (o GetVendorResultOutput) ToGetVendorResultOutputWithContext(ctx context.Context) GetVendorResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetVendorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVendorResult) string { return v.Id }).(pulumi.StringOutput)
}

// The short name of the found vendor.
func (o GetVendorResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetVendorResult) string { return v.Name }).(pulumi.StringOutput)
}

// The generic service type for this vendor.
func (o GetVendorResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetVendorResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVendorResultOutput{})
}
