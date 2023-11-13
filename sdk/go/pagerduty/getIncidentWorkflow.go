// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) so that you can create a trigger for it.
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
//			myWorkflow, err := pagerduty.LookupIncidentWorkflow(ctx, &pagerduty.LookupIncidentWorkflowArgs{
//				Name: "Some Workflow Name",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			firstService, err := pagerduty.LookupService(ctx, &pagerduty.LookupServiceArgs{
//				Name: "My First Service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewIncidentWorkflowTrigger(ctx, "automaticTrigger", &pagerduty.IncidentWorkflowTriggerArgs{
//				Type:     pulumi.String("conditional"),
//				Workflow: *pulumi.String(myWorkflow.Id),
//				Services: pulumi.StringArray{
//					*pulumi.String(firstService.Id),
//				},
//				Condition: pulumi.String("incident.priority matches 'P1'"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupIncidentWorkflow(ctx *pulumi.Context, args *LookupIncidentWorkflowArgs, opts ...pulumi.InvokeOption) (*LookupIncidentWorkflowResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupIncidentWorkflowResult
	err := ctx.Invoke("pagerduty:index/getIncidentWorkflow:getIncidentWorkflow", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIncidentWorkflow.
type LookupIncidentWorkflowArgs struct {
	// The name of the workflow.
	Name string `pulumi:"name"`
}

// A collection of values returned by getIncidentWorkflow.
type LookupIncidentWorkflowResult struct {
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func LookupIncidentWorkflowOutput(ctx *pulumi.Context, args LookupIncidentWorkflowOutputArgs, opts ...pulumi.InvokeOption) LookupIncidentWorkflowResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupIncidentWorkflowResult, error) {
			args := v.(LookupIncidentWorkflowArgs)
			r, err := LookupIncidentWorkflow(ctx, &args, opts...)
			var s LookupIncidentWorkflowResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupIncidentWorkflowResultOutput)
}

// A collection of arguments for invoking getIncidentWorkflow.
type LookupIncidentWorkflowOutputArgs struct {
	// The name of the workflow.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupIncidentWorkflowOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIncidentWorkflowArgs)(nil)).Elem()
}

// A collection of values returned by getIncidentWorkflow.
type LookupIncidentWorkflowResultOutput struct{ *pulumi.OutputState }

func (LookupIncidentWorkflowResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIncidentWorkflowResult)(nil)).Elem()
}

func (o LookupIncidentWorkflowResultOutput) ToLookupIncidentWorkflowResultOutput() LookupIncidentWorkflowResultOutput {
	return o
}

func (o LookupIncidentWorkflowResultOutput) ToLookupIncidentWorkflowResultOutputWithContext(ctx context.Context) LookupIncidentWorkflowResultOutput {
	return o
}

func (o LookupIncidentWorkflowResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentWorkflowResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupIncidentWorkflowResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentWorkflowResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupIncidentWorkflowResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIncidentWorkflowResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIncidentWorkflowResultOutput{})
}
