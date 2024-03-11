// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [business service](https://api-reference.pagerduty.com/#!/Business_Services/get_business_services).
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
//			_, err := pagerduty.LookupBusinessService(ctx, &pagerduty.LookupBusinessServiceArgs{
//				Name: "My Service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupBusinessService(ctx *pulumi.Context, args *LookupBusinessServiceArgs, opts ...pulumi.InvokeOption) (*LookupBusinessServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBusinessServiceResult
	err := ctx.Invoke("pagerduty:index/getBusinessService:getBusinessService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBusinessService.
type LookupBusinessServiceArgs struct {
	// The business service name to use to find a business service in the PagerDuty API.
	Name string `pulumi:"name"`
}

// A collection of values returned by getBusinessService.
type LookupBusinessServiceResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The short name of the found business service.
	Name string `pulumi:"name"`
	// The type of object. The value returned will be `businessService`. Can be used for passing to a service dependency.
	Type string `pulumi:"type"`
}

func LookupBusinessServiceOutput(ctx *pulumi.Context, args LookupBusinessServiceOutputArgs, opts ...pulumi.InvokeOption) LookupBusinessServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBusinessServiceResult, error) {
			args := v.(LookupBusinessServiceArgs)
			r, err := LookupBusinessService(ctx, &args, opts...)
			var s LookupBusinessServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBusinessServiceResultOutput)
}

// A collection of arguments for invoking getBusinessService.
type LookupBusinessServiceOutputArgs struct {
	// The business service name to use to find a business service in the PagerDuty API.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupBusinessServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBusinessServiceArgs)(nil)).Elem()
}

// A collection of values returned by getBusinessService.
type LookupBusinessServiceResultOutput struct{ *pulumi.OutputState }

func (LookupBusinessServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBusinessServiceResult)(nil)).Elem()
}

func (o LookupBusinessServiceResultOutput) ToLookupBusinessServiceResultOutput() LookupBusinessServiceResultOutput {
	return o
}

func (o LookupBusinessServiceResultOutput) ToLookupBusinessServiceResultOutputWithContext(ctx context.Context) LookupBusinessServiceResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBusinessServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The short name of the found business service.
func (o LookupBusinessServiceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessServiceResult) string { return v.Name }).(pulumi.StringOutput)
}

// The type of object. The value returned will be `businessService`. Can be used for passing to a service dependency.
func (o LookupBusinessServiceResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessServiceResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBusinessServiceResultOutput{})
}
