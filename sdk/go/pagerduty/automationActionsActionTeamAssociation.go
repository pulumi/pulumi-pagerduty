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

// An Automation Actions [action association with a team](https://developer.pagerduty.com/api-reference/8f722dd91a4ba-associate-an-automation-action-with-a-team) configures the relation of a specific Action with a Team.
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
//			example, err := pagerduty.NewTeam(ctx, "example", &pagerduty.TeamArgs{
//				Name:        pulumi.String("Engineering"),
//				Description: pulumi.String("All engineering"),
//			})
//			if err != nil {
//				return err
//			}
//			paActionExample, err := pagerduty.NewAutomationActionsAction(ctx, "pa_action_example", &pagerduty.AutomationActionsActionArgs{
//				Name:        pulumi.String("PA Action created via TF"),
//				Description: pulumi.String("Description of the PA Action created via TF"),
//				ActionType:  pulumi.String("process_automation"),
//				ActionDataReference: &pagerduty.AutomationActionsActionActionDataReferenceArgs{
//					ProcessAutomationJobId: pulumi.String("P123456"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewAutomationActionsActionTeamAssociation(ctx, "foo", &pagerduty.AutomationActionsActionTeamAssociationArgs{
//				ActionId: paActionExample.ID(),
//				TeamId:   example.ID(),
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
// Action team association can be imported using the `action_id` and `team_id` separated by a colon, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
// ```
type AutomationActionsActionTeamAssociation struct {
	pulumi.CustomResourceState

	// Id of the action.
	ActionId pulumi.StringOutput `pulumi:"actionId"`
	// Id of the team associated to the action.
	TeamId pulumi.StringOutput `pulumi:"teamId"`
}

// NewAutomationActionsActionTeamAssociation registers a new resource with the given unique name, arguments, and options.
func NewAutomationActionsActionTeamAssociation(ctx *pulumi.Context,
	name string, args *AutomationActionsActionTeamAssociationArgs, opts ...pulumi.ResourceOption) (*AutomationActionsActionTeamAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionId == nil {
		return nil, errors.New("invalid value for required argument 'ActionId'")
	}
	if args.TeamId == nil {
		return nil, errors.New("invalid value for required argument 'TeamId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutomationActionsActionTeamAssociation
	err := ctx.RegisterResource("pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutomationActionsActionTeamAssociation gets an existing AutomationActionsActionTeamAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutomationActionsActionTeamAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutomationActionsActionTeamAssociationState, opts ...pulumi.ResourceOption) (*AutomationActionsActionTeamAssociation, error) {
	var resource AutomationActionsActionTeamAssociation
	err := ctx.ReadResource("pagerduty:index/automationActionsActionTeamAssociation:AutomationActionsActionTeamAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutomationActionsActionTeamAssociation resources.
type automationActionsActionTeamAssociationState struct {
	// Id of the action.
	ActionId *string `pulumi:"actionId"`
	// Id of the team associated to the action.
	TeamId *string `pulumi:"teamId"`
}

type AutomationActionsActionTeamAssociationState struct {
	// Id of the action.
	ActionId pulumi.StringPtrInput
	// Id of the team associated to the action.
	TeamId pulumi.StringPtrInput
}

func (AutomationActionsActionTeamAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsActionTeamAssociationState)(nil)).Elem()
}

type automationActionsActionTeamAssociationArgs struct {
	// Id of the action.
	ActionId string `pulumi:"actionId"`
	// Id of the team associated to the action.
	TeamId string `pulumi:"teamId"`
}

// The set of arguments for constructing a AutomationActionsActionTeamAssociation resource.
type AutomationActionsActionTeamAssociationArgs struct {
	// Id of the action.
	ActionId pulumi.StringInput
	// Id of the team associated to the action.
	TeamId pulumi.StringInput
}

func (AutomationActionsActionTeamAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsActionTeamAssociationArgs)(nil)).Elem()
}

type AutomationActionsActionTeamAssociationInput interface {
	pulumi.Input

	ToAutomationActionsActionTeamAssociationOutput() AutomationActionsActionTeamAssociationOutput
	ToAutomationActionsActionTeamAssociationOutputWithContext(ctx context.Context) AutomationActionsActionTeamAssociationOutput
}

func (*AutomationActionsActionTeamAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsActionTeamAssociation)(nil)).Elem()
}

func (i *AutomationActionsActionTeamAssociation) ToAutomationActionsActionTeamAssociationOutput() AutomationActionsActionTeamAssociationOutput {
	return i.ToAutomationActionsActionTeamAssociationOutputWithContext(context.Background())
}

func (i *AutomationActionsActionTeamAssociation) ToAutomationActionsActionTeamAssociationOutputWithContext(ctx context.Context) AutomationActionsActionTeamAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionTeamAssociationOutput)
}

// AutomationActionsActionTeamAssociationArrayInput is an input type that accepts AutomationActionsActionTeamAssociationArray and AutomationActionsActionTeamAssociationArrayOutput values.
// You can construct a concrete instance of `AutomationActionsActionTeamAssociationArrayInput` via:
//
//	AutomationActionsActionTeamAssociationArray{ AutomationActionsActionTeamAssociationArgs{...} }
type AutomationActionsActionTeamAssociationArrayInput interface {
	pulumi.Input

	ToAutomationActionsActionTeamAssociationArrayOutput() AutomationActionsActionTeamAssociationArrayOutput
	ToAutomationActionsActionTeamAssociationArrayOutputWithContext(context.Context) AutomationActionsActionTeamAssociationArrayOutput
}

type AutomationActionsActionTeamAssociationArray []AutomationActionsActionTeamAssociationInput

func (AutomationActionsActionTeamAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsActionTeamAssociation)(nil)).Elem()
}

func (i AutomationActionsActionTeamAssociationArray) ToAutomationActionsActionTeamAssociationArrayOutput() AutomationActionsActionTeamAssociationArrayOutput {
	return i.ToAutomationActionsActionTeamAssociationArrayOutputWithContext(context.Background())
}

func (i AutomationActionsActionTeamAssociationArray) ToAutomationActionsActionTeamAssociationArrayOutputWithContext(ctx context.Context) AutomationActionsActionTeamAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionTeamAssociationArrayOutput)
}

// AutomationActionsActionTeamAssociationMapInput is an input type that accepts AutomationActionsActionTeamAssociationMap and AutomationActionsActionTeamAssociationMapOutput values.
// You can construct a concrete instance of `AutomationActionsActionTeamAssociationMapInput` via:
//
//	AutomationActionsActionTeamAssociationMap{ "key": AutomationActionsActionTeamAssociationArgs{...} }
type AutomationActionsActionTeamAssociationMapInput interface {
	pulumi.Input

	ToAutomationActionsActionTeamAssociationMapOutput() AutomationActionsActionTeamAssociationMapOutput
	ToAutomationActionsActionTeamAssociationMapOutputWithContext(context.Context) AutomationActionsActionTeamAssociationMapOutput
}

type AutomationActionsActionTeamAssociationMap map[string]AutomationActionsActionTeamAssociationInput

func (AutomationActionsActionTeamAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsActionTeamAssociation)(nil)).Elem()
}

func (i AutomationActionsActionTeamAssociationMap) ToAutomationActionsActionTeamAssociationMapOutput() AutomationActionsActionTeamAssociationMapOutput {
	return i.ToAutomationActionsActionTeamAssociationMapOutputWithContext(context.Background())
}

func (i AutomationActionsActionTeamAssociationMap) ToAutomationActionsActionTeamAssociationMapOutputWithContext(ctx context.Context) AutomationActionsActionTeamAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionTeamAssociationMapOutput)
}

type AutomationActionsActionTeamAssociationOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionTeamAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsActionTeamAssociation)(nil)).Elem()
}

func (o AutomationActionsActionTeamAssociationOutput) ToAutomationActionsActionTeamAssociationOutput() AutomationActionsActionTeamAssociationOutput {
	return o
}

func (o AutomationActionsActionTeamAssociationOutput) ToAutomationActionsActionTeamAssociationOutputWithContext(ctx context.Context) AutomationActionsActionTeamAssociationOutput {
	return o
}

// Id of the action.
func (o AutomationActionsActionTeamAssociationOutput) ActionId() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsActionTeamAssociation) pulumi.StringOutput { return v.ActionId }).(pulumi.StringOutput)
}

// Id of the team associated to the action.
func (o AutomationActionsActionTeamAssociationOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsActionTeamAssociation) pulumi.StringOutput { return v.TeamId }).(pulumi.StringOutput)
}

type AutomationActionsActionTeamAssociationArrayOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionTeamAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsActionTeamAssociation)(nil)).Elem()
}

func (o AutomationActionsActionTeamAssociationArrayOutput) ToAutomationActionsActionTeamAssociationArrayOutput() AutomationActionsActionTeamAssociationArrayOutput {
	return o
}

func (o AutomationActionsActionTeamAssociationArrayOutput) ToAutomationActionsActionTeamAssociationArrayOutputWithContext(ctx context.Context) AutomationActionsActionTeamAssociationArrayOutput {
	return o
}

func (o AutomationActionsActionTeamAssociationArrayOutput) Index(i pulumi.IntInput) AutomationActionsActionTeamAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutomationActionsActionTeamAssociation {
		return vs[0].([]*AutomationActionsActionTeamAssociation)[vs[1].(int)]
	}).(AutomationActionsActionTeamAssociationOutput)
}

type AutomationActionsActionTeamAssociationMapOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionTeamAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsActionTeamAssociation)(nil)).Elem()
}

func (o AutomationActionsActionTeamAssociationMapOutput) ToAutomationActionsActionTeamAssociationMapOutput() AutomationActionsActionTeamAssociationMapOutput {
	return o
}

func (o AutomationActionsActionTeamAssociationMapOutput) ToAutomationActionsActionTeamAssociationMapOutputWithContext(ctx context.Context) AutomationActionsActionTeamAssociationMapOutput {
	return o
}

func (o AutomationActionsActionTeamAssociationMapOutput) MapIndex(k pulumi.StringInput) AutomationActionsActionTeamAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutomationActionsActionTeamAssociation {
		return vs[0].(map[string]*AutomationActionsActionTeamAssociation)[vs[1].(string)]
	}).(AutomationActionsActionTeamAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionTeamAssociationInput)(nil)).Elem(), &AutomationActionsActionTeamAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionTeamAssociationArrayInput)(nil)).Elem(), AutomationActionsActionTeamAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionTeamAssociationMapInput)(nil)).Elem(), AutomationActionsActionTeamAssociationMap{})
	pulumi.RegisterOutputType(AutomationActionsActionTeamAssociationOutput{})
	pulumi.RegisterOutputType(AutomationActionsActionTeamAssociationArrayOutput{})
	pulumi.RegisterOutputType(AutomationActionsActionTeamAssociationMapOutput{})
}
