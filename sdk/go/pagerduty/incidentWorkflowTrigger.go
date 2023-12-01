// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An [Incident Workflow Trigger](https://support.pagerduty.com/docs/incident-workflows#triggers) defines when and if an [Incident Workflow](https://support.pagerduty.com/docs/incident-workflows) will be triggered.
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
//			myFirstWorkflow, err := pagerduty.NewIncidentWorkflow(ctx, "myFirstWorkflow", &pagerduty.IncidentWorkflowArgs{
//				Description: pulumi.String("This Incident Workflow is an example"),
//				Steps: pagerduty.IncidentWorkflowStepArray{
//					&pagerduty.IncidentWorkflowStepArgs{
//						Name:   pulumi.String("Send Status Update"),
//						Action: pulumi.String("pagerduty.com:incident-workflows:send-status-update:1"),
//						Inputs: pagerduty.IncidentWorkflowStepInputTypeArray{
//							&pagerduty.IncidentWorkflowStepInputTypeArgs{
//								Name:  pulumi.String("Message"),
//								Value: pulumi.String("Example status message sent on {{current_date}}"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.LookupService(ctx, &pagerduty.LookupServiceArgs{
//				Name: "My First Service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewIncidentWorkflowTrigger(ctx, "automaticTrigger", &pagerduty.IncidentWorkflowTriggerArgs{
//				Type:     pulumi.String("conditional"),
//				Workflow: myFirstWorkflow.ID(),
//				Services: pulumi.StringArray{
//					pagerduty_service.First_service.Id,
//				},
//				Condition:               pulumi.String("incident.priority matches 'P1'"),
//				SubscribedToAllServices: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.LookupTeam(ctx, &pagerduty.LookupTeamArgs{
//				Name: "devops",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewIncidentWorkflowTrigger(ctx, "manualTrigger", &pagerduty.IncidentWorkflowTriggerArgs{
//				Type:     pulumi.String("manual"),
//				Workflow: myFirstWorkflow.ID(),
//				Services: pulumi.StringArray{
//					pagerduty_service.First_service.Id,
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
//
// ## Import
//
// Incident workflows can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger pagerduty_incident_workflow_trigger PLBP09X
//
// ```
type IncidentWorkflowTrigger struct {
	pulumi.CustomResourceState

	// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
	Condition pulumi.StringPtrOutput `pulumi:"condition"`
	// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
	Services pulumi.StringArrayOutput `pulumi:"services"`
	// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
	SubscribedToAllServices pulumi.BoolOutput `pulumi:"subscribedToAllServices"`
	// [Updating causes resource replacement] May be either `manual` or `conditional`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The workflow ID for the workflow to trigger.
	Workflow pulumi.StringOutput `pulumi:"workflow"`
}

// NewIncidentWorkflowTrigger registers a new resource with the given unique name, arguments, and options.
func NewIncidentWorkflowTrigger(ctx *pulumi.Context,
	name string, args *IncidentWorkflowTriggerArgs, opts ...pulumi.ResourceOption) (*IncidentWorkflowTrigger, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SubscribedToAllServices == nil {
		return nil, errors.New("invalid value for required argument 'SubscribedToAllServices'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.Workflow == nil {
		return nil, errors.New("invalid value for required argument 'Workflow'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IncidentWorkflowTrigger
	err := ctx.RegisterResource("pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIncidentWorkflowTrigger gets an existing IncidentWorkflowTrigger resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIncidentWorkflowTrigger(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IncidentWorkflowTriggerState, opts ...pulumi.ResourceOption) (*IncidentWorkflowTrigger, error) {
	var resource IncidentWorkflowTrigger
	err := ctx.ReadResource("pagerduty:index/incidentWorkflowTrigger:IncidentWorkflowTrigger", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IncidentWorkflowTrigger resources.
type incidentWorkflowTriggerState struct {
	// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
	Condition *string `pulumi:"condition"`
	// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
	Services []string `pulumi:"services"`
	// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
	SubscribedToAllServices *bool `pulumi:"subscribedToAllServices"`
	// [Updating causes resource replacement] May be either `manual` or `conditional`.
	Type *string `pulumi:"type"`
	// The workflow ID for the workflow to trigger.
	Workflow *string `pulumi:"workflow"`
}

type IncidentWorkflowTriggerState struct {
	// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
	Condition pulumi.StringPtrInput
	// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
	Services pulumi.StringArrayInput
	// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
	SubscribedToAllServices pulumi.BoolPtrInput
	// [Updating causes resource replacement] May be either `manual` or `conditional`.
	Type pulumi.StringPtrInput
	// The workflow ID for the workflow to trigger.
	Workflow pulumi.StringPtrInput
}

func (IncidentWorkflowTriggerState) ElementType() reflect.Type {
	return reflect.TypeOf((*incidentWorkflowTriggerState)(nil)).Elem()
}

type incidentWorkflowTriggerArgs struct {
	// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
	Condition *string `pulumi:"condition"`
	// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
	Services []string `pulumi:"services"`
	// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
	SubscribedToAllServices bool `pulumi:"subscribedToAllServices"`
	// [Updating causes resource replacement] May be either `manual` or `conditional`.
	Type string `pulumi:"type"`
	// The workflow ID for the workflow to trigger.
	Workflow string `pulumi:"workflow"`
}

// The set of arguments for constructing a IncidentWorkflowTrigger resource.
type IncidentWorkflowTriggerArgs struct {
	// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
	Condition pulumi.StringPtrInput
	// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
	Services pulumi.StringArrayInput
	// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
	SubscribedToAllServices pulumi.BoolInput
	// [Updating causes resource replacement] May be either `manual` or `conditional`.
	Type pulumi.StringInput
	// The workflow ID for the workflow to trigger.
	Workflow pulumi.StringInput
}

func (IncidentWorkflowTriggerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*incidentWorkflowTriggerArgs)(nil)).Elem()
}

type IncidentWorkflowTriggerInput interface {
	pulumi.Input

	ToIncidentWorkflowTriggerOutput() IncidentWorkflowTriggerOutput
	ToIncidentWorkflowTriggerOutputWithContext(ctx context.Context) IncidentWorkflowTriggerOutput
}

func (*IncidentWorkflowTrigger) ElementType() reflect.Type {
	return reflect.TypeOf((**IncidentWorkflowTrigger)(nil)).Elem()
}

func (i *IncidentWorkflowTrigger) ToIncidentWorkflowTriggerOutput() IncidentWorkflowTriggerOutput {
	return i.ToIncidentWorkflowTriggerOutputWithContext(context.Background())
}

func (i *IncidentWorkflowTrigger) ToIncidentWorkflowTriggerOutputWithContext(ctx context.Context) IncidentWorkflowTriggerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentWorkflowTriggerOutput)
}

// IncidentWorkflowTriggerArrayInput is an input type that accepts IncidentWorkflowTriggerArray and IncidentWorkflowTriggerArrayOutput values.
// You can construct a concrete instance of `IncidentWorkflowTriggerArrayInput` via:
//
//	IncidentWorkflowTriggerArray{ IncidentWorkflowTriggerArgs{...} }
type IncidentWorkflowTriggerArrayInput interface {
	pulumi.Input

	ToIncidentWorkflowTriggerArrayOutput() IncidentWorkflowTriggerArrayOutput
	ToIncidentWorkflowTriggerArrayOutputWithContext(context.Context) IncidentWorkflowTriggerArrayOutput
}

type IncidentWorkflowTriggerArray []IncidentWorkflowTriggerInput

func (IncidentWorkflowTriggerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IncidentWorkflowTrigger)(nil)).Elem()
}

func (i IncidentWorkflowTriggerArray) ToIncidentWorkflowTriggerArrayOutput() IncidentWorkflowTriggerArrayOutput {
	return i.ToIncidentWorkflowTriggerArrayOutputWithContext(context.Background())
}

func (i IncidentWorkflowTriggerArray) ToIncidentWorkflowTriggerArrayOutputWithContext(ctx context.Context) IncidentWorkflowTriggerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentWorkflowTriggerArrayOutput)
}

// IncidentWorkflowTriggerMapInput is an input type that accepts IncidentWorkflowTriggerMap and IncidentWorkflowTriggerMapOutput values.
// You can construct a concrete instance of `IncidentWorkflowTriggerMapInput` via:
//
//	IncidentWorkflowTriggerMap{ "key": IncidentWorkflowTriggerArgs{...} }
type IncidentWorkflowTriggerMapInput interface {
	pulumi.Input

	ToIncidentWorkflowTriggerMapOutput() IncidentWorkflowTriggerMapOutput
	ToIncidentWorkflowTriggerMapOutputWithContext(context.Context) IncidentWorkflowTriggerMapOutput
}

type IncidentWorkflowTriggerMap map[string]IncidentWorkflowTriggerInput

func (IncidentWorkflowTriggerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IncidentWorkflowTrigger)(nil)).Elem()
}

func (i IncidentWorkflowTriggerMap) ToIncidentWorkflowTriggerMapOutput() IncidentWorkflowTriggerMapOutput {
	return i.ToIncidentWorkflowTriggerMapOutputWithContext(context.Background())
}

func (i IncidentWorkflowTriggerMap) ToIncidentWorkflowTriggerMapOutputWithContext(ctx context.Context) IncidentWorkflowTriggerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentWorkflowTriggerMapOutput)
}

type IncidentWorkflowTriggerOutput struct{ *pulumi.OutputState }

func (IncidentWorkflowTriggerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IncidentWorkflowTrigger)(nil)).Elem()
}

func (o IncidentWorkflowTriggerOutput) ToIncidentWorkflowTriggerOutput() IncidentWorkflowTriggerOutput {
	return o
}

func (o IncidentWorkflowTriggerOutput) ToIncidentWorkflowTriggerOutputWithContext(ctx context.Context) IncidentWorkflowTriggerOutput {
	return o
}

// A [PCL](https://developer.pagerduty.com/docs/ZG9jOjM1NTE0MDc0-pcl-overview) condition string which must be satisfied for the trigger to fire.
func (o IncidentWorkflowTriggerOutput) Condition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IncidentWorkflowTrigger) pulumi.StringPtrOutput { return v.Condition }).(pulumi.StringPtrOutput)
}

// A list of service IDs. Incidents in any of the listed services are eligible to fire this trigger.
func (o IncidentWorkflowTriggerOutput) Services() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IncidentWorkflowTrigger) pulumi.StringArrayOutput { return v.Services }).(pulumi.StringArrayOutput)
}

// Set to `true` if the trigger should be eligible for firing on all services. Only allowed to be `true` if the services list is not defined or empty.
func (o IncidentWorkflowTriggerOutput) SubscribedToAllServices() pulumi.BoolOutput {
	return o.ApplyT(func(v *IncidentWorkflowTrigger) pulumi.BoolOutput { return v.SubscribedToAllServices }).(pulumi.BoolOutput)
}

// [Updating causes resource replacement] May be either `manual` or `conditional`.
func (o IncidentWorkflowTriggerOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentWorkflowTrigger) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The workflow ID for the workflow to trigger.
func (o IncidentWorkflowTriggerOutput) Workflow() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentWorkflowTrigger) pulumi.StringOutput { return v.Workflow }).(pulumi.StringOutput)
}

type IncidentWorkflowTriggerArrayOutput struct{ *pulumi.OutputState }

func (IncidentWorkflowTriggerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IncidentWorkflowTrigger)(nil)).Elem()
}

func (o IncidentWorkflowTriggerArrayOutput) ToIncidentWorkflowTriggerArrayOutput() IncidentWorkflowTriggerArrayOutput {
	return o
}

func (o IncidentWorkflowTriggerArrayOutput) ToIncidentWorkflowTriggerArrayOutputWithContext(ctx context.Context) IncidentWorkflowTriggerArrayOutput {
	return o
}

func (o IncidentWorkflowTriggerArrayOutput) Index(i pulumi.IntInput) IncidentWorkflowTriggerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IncidentWorkflowTrigger {
		return vs[0].([]*IncidentWorkflowTrigger)[vs[1].(int)]
	}).(IncidentWorkflowTriggerOutput)
}

type IncidentWorkflowTriggerMapOutput struct{ *pulumi.OutputState }

func (IncidentWorkflowTriggerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IncidentWorkflowTrigger)(nil)).Elem()
}

func (o IncidentWorkflowTriggerMapOutput) ToIncidentWorkflowTriggerMapOutput() IncidentWorkflowTriggerMapOutput {
	return o
}

func (o IncidentWorkflowTriggerMapOutput) ToIncidentWorkflowTriggerMapOutputWithContext(ctx context.Context) IncidentWorkflowTriggerMapOutput {
	return o
}

func (o IncidentWorkflowTriggerMapOutput) MapIndex(k pulumi.StringInput) IncidentWorkflowTriggerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IncidentWorkflowTrigger {
		return vs[0].(map[string]*IncidentWorkflowTrigger)[vs[1].(string)]
	}).(IncidentWorkflowTriggerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentWorkflowTriggerInput)(nil)).Elem(), &IncidentWorkflowTrigger{})
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentWorkflowTriggerArrayInput)(nil)).Elem(), IncidentWorkflowTriggerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentWorkflowTriggerMapInput)(nil)).Elem(), IncidentWorkflowTriggerMap{})
	pulumi.RegisterOutputType(IncidentWorkflowTriggerOutput{})
	pulumi.RegisterOutputType(IncidentWorkflowTriggerArrayOutput{})
	pulumi.RegisterOutputType(IncidentWorkflowTriggerMapOutput{})
}
