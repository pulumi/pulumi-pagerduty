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

// An Automation Actions [action association with a service](https://developer.pagerduty.com/api-reference/5d2f051f3fb43-associate-an-automation-action-with-a-service) configures the relation of a specific Action with a Service.
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
//			exampleUser, err := pagerduty.NewUser(ctx, "exampleUser", &pagerduty.UserArgs{
//				Email: pulumi.String("125.greenholt.earline@graham.name"),
//			})
//			if err != nil {
//				return err
//			}
//			fooEscalationPolicy, err := pagerduty.NewEscalationPolicy(ctx, "fooEscalationPolicy", &pagerduty.EscalationPolicyArgs{
//				NumLoops: pulumi.Int(2),
//				Rules: pagerduty.EscalationPolicyRuleArray{
//					&pagerduty.EscalationPolicyRuleArgs{
//						EscalationDelayInMinutes: pulumi.Int(10),
//						Targets: pagerduty.EscalationPolicyRuleTargetArray{
//							&pagerduty.EscalationPolicyRuleTargetArgs{
//								Type: pulumi.String("user_reference"),
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
//				EscalationPolicy:       fooEscalationPolicy.ID(),
//				AlertCreation:          pulumi.String("create_alerts_and_incidents"),
//				AutoPauseNotificationsParameters: &pagerduty.ServiceAutoPauseNotificationsParametersArgs{
//					Enabled: pulumi.Bool(true),
//					Timeout: pulumi.Int(300),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			paActionExample, err := pagerduty.NewAutomationActionsAction(ctx, "paActionExample", &pagerduty.AutomationActionsActionArgs{
//				Description: pulumi.String("Description of the PA Action created via TF"),
//				ActionType:  pulumi.String("process_automation"),
//				ActionDataReference: &pagerduty.AutomationActionsActionActionDataReferenceArgs{
//					ProcessAutomationJobId: pulumi.String("P123456"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewAutomationActionsActionServiceAssociation(ctx, "fooAutomationActionsActionServiceAssociation", &pagerduty.AutomationActionsActionServiceAssociationArgs{
//				ActionId:  paActionExample.ID(),
//				ServiceId: exampleService.ID(),
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
// Action service association can be imported using the `action_id` and `service_id` separated by a colon, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
//
// ```
type AutomationActionsActionServiceAssociation struct {
	pulumi.CustomResourceState

	// Id of the action.
	ActionId pulumi.StringOutput `pulumi:"actionId"`
	// Id of the service associated to the action.
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
}

// NewAutomationActionsActionServiceAssociation registers a new resource with the given unique name, arguments, and options.
func NewAutomationActionsActionServiceAssociation(ctx *pulumi.Context,
	name string, args *AutomationActionsActionServiceAssociationArgs, opts ...pulumi.ResourceOption) (*AutomationActionsActionServiceAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionId == nil {
		return nil, errors.New("invalid value for required argument 'ActionId'")
	}
	if args.ServiceId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutomationActionsActionServiceAssociation
	err := ctx.RegisterResource("pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutomationActionsActionServiceAssociation gets an existing AutomationActionsActionServiceAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutomationActionsActionServiceAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutomationActionsActionServiceAssociationState, opts ...pulumi.ResourceOption) (*AutomationActionsActionServiceAssociation, error) {
	var resource AutomationActionsActionServiceAssociation
	err := ctx.ReadResource("pagerduty:index/automationActionsActionServiceAssociation:AutomationActionsActionServiceAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutomationActionsActionServiceAssociation resources.
type automationActionsActionServiceAssociationState struct {
	// Id of the action.
	ActionId *string `pulumi:"actionId"`
	// Id of the service associated to the action.
	ServiceId *string `pulumi:"serviceId"`
}

type AutomationActionsActionServiceAssociationState struct {
	// Id of the action.
	ActionId pulumi.StringPtrInput
	// Id of the service associated to the action.
	ServiceId pulumi.StringPtrInput
}

func (AutomationActionsActionServiceAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsActionServiceAssociationState)(nil)).Elem()
}

type automationActionsActionServiceAssociationArgs struct {
	// Id of the action.
	ActionId string `pulumi:"actionId"`
	// Id of the service associated to the action.
	ServiceId string `pulumi:"serviceId"`
}

// The set of arguments for constructing a AutomationActionsActionServiceAssociation resource.
type AutomationActionsActionServiceAssociationArgs struct {
	// Id of the action.
	ActionId pulumi.StringInput
	// Id of the service associated to the action.
	ServiceId pulumi.StringInput
}

func (AutomationActionsActionServiceAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsActionServiceAssociationArgs)(nil)).Elem()
}

type AutomationActionsActionServiceAssociationInput interface {
	pulumi.Input

	ToAutomationActionsActionServiceAssociationOutput() AutomationActionsActionServiceAssociationOutput
	ToAutomationActionsActionServiceAssociationOutputWithContext(ctx context.Context) AutomationActionsActionServiceAssociationOutput
}

func (*AutomationActionsActionServiceAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsActionServiceAssociation)(nil)).Elem()
}

func (i *AutomationActionsActionServiceAssociation) ToAutomationActionsActionServiceAssociationOutput() AutomationActionsActionServiceAssociationOutput {
	return i.ToAutomationActionsActionServiceAssociationOutputWithContext(context.Background())
}

func (i *AutomationActionsActionServiceAssociation) ToAutomationActionsActionServiceAssociationOutputWithContext(ctx context.Context) AutomationActionsActionServiceAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionServiceAssociationOutput)
}

// AutomationActionsActionServiceAssociationArrayInput is an input type that accepts AutomationActionsActionServiceAssociationArray and AutomationActionsActionServiceAssociationArrayOutput values.
// You can construct a concrete instance of `AutomationActionsActionServiceAssociationArrayInput` via:
//
//	AutomationActionsActionServiceAssociationArray{ AutomationActionsActionServiceAssociationArgs{...} }
type AutomationActionsActionServiceAssociationArrayInput interface {
	pulumi.Input

	ToAutomationActionsActionServiceAssociationArrayOutput() AutomationActionsActionServiceAssociationArrayOutput
	ToAutomationActionsActionServiceAssociationArrayOutputWithContext(context.Context) AutomationActionsActionServiceAssociationArrayOutput
}

type AutomationActionsActionServiceAssociationArray []AutomationActionsActionServiceAssociationInput

func (AutomationActionsActionServiceAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsActionServiceAssociation)(nil)).Elem()
}

func (i AutomationActionsActionServiceAssociationArray) ToAutomationActionsActionServiceAssociationArrayOutput() AutomationActionsActionServiceAssociationArrayOutput {
	return i.ToAutomationActionsActionServiceAssociationArrayOutputWithContext(context.Background())
}

func (i AutomationActionsActionServiceAssociationArray) ToAutomationActionsActionServiceAssociationArrayOutputWithContext(ctx context.Context) AutomationActionsActionServiceAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionServiceAssociationArrayOutput)
}

// AutomationActionsActionServiceAssociationMapInput is an input type that accepts AutomationActionsActionServiceAssociationMap and AutomationActionsActionServiceAssociationMapOutput values.
// You can construct a concrete instance of `AutomationActionsActionServiceAssociationMapInput` via:
//
//	AutomationActionsActionServiceAssociationMap{ "key": AutomationActionsActionServiceAssociationArgs{...} }
type AutomationActionsActionServiceAssociationMapInput interface {
	pulumi.Input

	ToAutomationActionsActionServiceAssociationMapOutput() AutomationActionsActionServiceAssociationMapOutput
	ToAutomationActionsActionServiceAssociationMapOutputWithContext(context.Context) AutomationActionsActionServiceAssociationMapOutput
}

type AutomationActionsActionServiceAssociationMap map[string]AutomationActionsActionServiceAssociationInput

func (AutomationActionsActionServiceAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsActionServiceAssociation)(nil)).Elem()
}

func (i AutomationActionsActionServiceAssociationMap) ToAutomationActionsActionServiceAssociationMapOutput() AutomationActionsActionServiceAssociationMapOutput {
	return i.ToAutomationActionsActionServiceAssociationMapOutputWithContext(context.Background())
}

func (i AutomationActionsActionServiceAssociationMap) ToAutomationActionsActionServiceAssociationMapOutputWithContext(ctx context.Context) AutomationActionsActionServiceAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionServiceAssociationMapOutput)
}

type AutomationActionsActionServiceAssociationOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionServiceAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsActionServiceAssociation)(nil)).Elem()
}

func (o AutomationActionsActionServiceAssociationOutput) ToAutomationActionsActionServiceAssociationOutput() AutomationActionsActionServiceAssociationOutput {
	return o
}

func (o AutomationActionsActionServiceAssociationOutput) ToAutomationActionsActionServiceAssociationOutputWithContext(ctx context.Context) AutomationActionsActionServiceAssociationOutput {
	return o
}

// Id of the action.
func (o AutomationActionsActionServiceAssociationOutput) ActionId() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsActionServiceAssociation) pulumi.StringOutput { return v.ActionId }).(pulumi.StringOutput)
}

// Id of the service associated to the action.
func (o AutomationActionsActionServiceAssociationOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsActionServiceAssociation) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

type AutomationActionsActionServiceAssociationArrayOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionServiceAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsActionServiceAssociation)(nil)).Elem()
}

func (o AutomationActionsActionServiceAssociationArrayOutput) ToAutomationActionsActionServiceAssociationArrayOutput() AutomationActionsActionServiceAssociationArrayOutput {
	return o
}

func (o AutomationActionsActionServiceAssociationArrayOutput) ToAutomationActionsActionServiceAssociationArrayOutputWithContext(ctx context.Context) AutomationActionsActionServiceAssociationArrayOutput {
	return o
}

func (o AutomationActionsActionServiceAssociationArrayOutput) Index(i pulumi.IntInput) AutomationActionsActionServiceAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutomationActionsActionServiceAssociation {
		return vs[0].([]*AutomationActionsActionServiceAssociation)[vs[1].(int)]
	}).(AutomationActionsActionServiceAssociationOutput)
}

type AutomationActionsActionServiceAssociationMapOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionServiceAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsActionServiceAssociation)(nil)).Elem()
}

func (o AutomationActionsActionServiceAssociationMapOutput) ToAutomationActionsActionServiceAssociationMapOutput() AutomationActionsActionServiceAssociationMapOutput {
	return o
}

func (o AutomationActionsActionServiceAssociationMapOutput) ToAutomationActionsActionServiceAssociationMapOutputWithContext(ctx context.Context) AutomationActionsActionServiceAssociationMapOutput {
	return o
}

func (o AutomationActionsActionServiceAssociationMapOutput) MapIndex(k pulumi.StringInput) AutomationActionsActionServiceAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutomationActionsActionServiceAssociation {
		return vs[0].(map[string]*AutomationActionsActionServiceAssociation)[vs[1].(string)]
	}).(AutomationActionsActionServiceAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionServiceAssociationInput)(nil)).Elem(), &AutomationActionsActionServiceAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionServiceAssociationArrayInput)(nil)).Elem(), AutomationActionsActionServiceAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionServiceAssociationMapInput)(nil)).Elem(), AutomationActionsActionServiceAssociationMap{})
	pulumi.RegisterOutputType(AutomationActionsActionServiceAssociationOutput{})
	pulumi.RegisterOutputType(AutomationActionsActionServiceAssociationArrayOutput{})
	pulumi.RegisterOutputType(AutomationActionsActionServiceAssociationMapOutput{})
}
