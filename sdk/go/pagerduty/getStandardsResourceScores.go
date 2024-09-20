// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about the [scores for the standards of a
// resource][1].
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
//			example, err := pagerduty.LookupService(ctx, &pagerduty.LookupServiceArgs{
//				Name: "My Service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.GetStandardsResourceScores(ctx, &pagerduty.GetStandardsResourceScoresArgs{
//				ResourceType: "technical_services",
//				Id:           example.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetStandardsResourceScores(ctx *pulumi.Context, args *GetStandardsResourceScoresArgs, opts ...pulumi.InvokeOption) (*GetStandardsResourceScoresResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStandardsResourceScoresResult
	err := ctx.Invoke("pagerduty:index/getStandardsResourceScores:getStandardsResourceScores", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStandardsResourceScores.
type GetStandardsResourceScoresArgs struct {
	// Identifier of said resource.
	Id string `pulumi:"id"`
	// Type of the object the standards are associated to. Allowed values are `technicalServices`.
	ResourceType string `pulumi:"resourceType"`
}

// A collection of values returned by getStandardsResourceScores.
type GetStandardsResourceScoresResult struct {
	// A unique identifier for the standard.
	Id string `pulumi:"id"`
	// Specifies the type of resource to which the standard applies.
	ResourceType string `pulumi:"resourceType"`
	// Summary of the scores for standards associated with this resource.
	Score GetStandardsResourceScoresScore `pulumi:"score"`
	// The list of standards evaluated against.
	Standards []GetStandardsResourceScoresStandard `pulumi:"standards"`
}

func GetStandardsResourceScoresOutput(ctx *pulumi.Context, args GetStandardsResourceScoresOutputArgs, opts ...pulumi.InvokeOption) GetStandardsResourceScoresResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStandardsResourceScoresResultOutput, error) {
			args := v.(GetStandardsResourceScoresArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetStandardsResourceScoresResult
			secret, err := ctx.InvokePackageRaw("pagerduty:index/getStandardsResourceScores:getStandardsResourceScores", args, &rv, "", opts...)
			if err != nil {
				return GetStandardsResourceScoresResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetStandardsResourceScoresResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetStandardsResourceScoresResultOutput), nil
			}
			return output, nil
		}).(GetStandardsResourceScoresResultOutput)
}

// A collection of arguments for invoking getStandardsResourceScores.
type GetStandardsResourceScoresOutputArgs struct {
	// Identifier of said resource.
	Id pulumi.StringInput `pulumi:"id"`
	// Type of the object the standards are associated to. Allowed values are `technicalServices`.
	ResourceType pulumi.StringInput `pulumi:"resourceType"`
}

func (GetStandardsResourceScoresOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStandardsResourceScoresArgs)(nil)).Elem()
}

// A collection of values returned by getStandardsResourceScores.
type GetStandardsResourceScoresResultOutput struct{ *pulumi.OutputState }

func (GetStandardsResourceScoresResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStandardsResourceScoresResult)(nil)).Elem()
}

func (o GetStandardsResourceScoresResultOutput) ToGetStandardsResourceScoresResultOutput() GetStandardsResourceScoresResultOutput {
	return o
}

func (o GetStandardsResourceScoresResultOutput) ToGetStandardsResourceScoresResultOutputWithContext(ctx context.Context) GetStandardsResourceScoresResultOutput {
	return o
}

// A unique identifier for the standard.
func (o GetStandardsResourceScoresResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStandardsResourceScoresResult) string { return v.Id }).(pulumi.StringOutput)
}

// Specifies the type of resource to which the standard applies.
func (o GetStandardsResourceScoresResultOutput) ResourceType() pulumi.StringOutput {
	return o.ApplyT(func(v GetStandardsResourceScoresResult) string { return v.ResourceType }).(pulumi.StringOutput)
}

// Summary of the scores for standards associated with this resource.
func (o GetStandardsResourceScoresResultOutput) Score() GetStandardsResourceScoresScoreOutput {
	return o.ApplyT(func(v GetStandardsResourceScoresResult) GetStandardsResourceScoresScore { return v.Score }).(GetStandardsResourceScoresScoreOutput)
}

// The list of standards evaluated against.
func (o GetStandardsResourceScoresResultOutput) Standards() GetStandardsResourceScoresStandardArrayOutput {
	return o.ApplyT(func(v GetStandardsResourceScoresResult) []GetStandardsResourceScoresStandard { return v.Standards }).(GetStandardsResourceScoresStandardArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStandardsResourceScoresResultOutput{})
}
