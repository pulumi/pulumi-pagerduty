// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An Automation Actions [runner association with a team](https://developer.pagerduty.com/api-reference/f662de6271a6e-associate-a-runner-with-a-team) configures the relation of a specific Runner with a Team.
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
//			teamEntEng, err := pagerduty.NewTeam(ctx, "team_ent_eng", &pagerduty.TeamArgs{
//				Name:        pulumi.String("Enterprise Engineering"),
//				Description: pulumi.String("Enterprise engineering"),
//			})
//			if err != nil {
//				return err
//			}
//			paRunbookRunner, err := pagerduty.NewAutomationActionsRunner(ctx, "pa_runbook_runner", &pagerduty.AutomationActionsRunnerArgs{
//				Name:           pulumi.String("Runner created via TF"),
//				Description:    pulumi.String("Description of the Runner created via TF"),
//				RunnerType:     pulumi.String("runbook"),
//				RunbookBaseUri: pulumi.String("cat-cat"),
//				RunbookApiKey:  pulumi.String("cat-secret"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewAutomationActionsRunnerTeamAssociation(ctx, "pa_runner_ent_eng_assoc", &pagerduty.AutomationActionsRunnerTeamAssociationArgs{
//				RunnerId: paRunbookRunner.ID(),
//				TeamId:   teamEntEng.ID(),
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
// Runner team association can be imported using the `runner_id` and `team_id` separated by a colon, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation example 01DER7CUUBF7TH4116K0M4WKPU:PLB09Z
// ```
type AutomationActionsRunnerTeamAssociation struct {
	pulumi.CustomResourceState

	// Id of the runner.
	RunnerId pulumi.StringOutput `pulumi:"runnerId"`
	// Id of the team associated with the runner.
	TeamId pulumi.StringOutput `pulumi:"teamId"`
}

// NewAutomationActionsRunnerTeamAssociation registers a new resource with the given unique name, arguments, and options.
func NewAutomationActionsRunnerTeamAssociation(ctx *pulumi.Context,
	name string, args *AutomationActionsRunnerTeamAssociationArgs, opts ...pulumi.ResourceOption) (*AutomationActionsRunnerTeamAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RunnerId == nil {
		return nil, errors.New("invalid value for required argument 'RunnerId'")
	}
	if args.TeamId == nil {
		return nil, errors.New("invalid value for required argument 'TeamId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutomationActionsRunnerTeamAssociation
	err := ctx.RegisterResource("pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutomationActionsRunnerTeamAssociation gets an existing AutomationActionsRunnerTeamAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutomationActionsRunnerTeamAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutomationActionsRunnerTeamAssociationState, opts ...pulumi.ResourceOption) (*AutomationActionsRunnerTeamAssociation, error) {
	var resource AutomationActionsRunnerTeamAssociation
	err := ctx.ReadResource("pagerduty:index/automationActionsRunnerTeamAssociation:AutomationActionsRunnerTeamAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutomationActionsRunnerTeamAssociation resources.
type automationActionsRunnerTeamAssociationState struct {
	// Id of the runner.
	RunnerId *string `pulumi:"runnerId"`
	// Id of the team associated with the runner.
	TeamId *string `pulumi:"teamId"`
}

type AutomationActionsRunnerTeamAssociationState struct {
	// Id of the runner.
	RunnerId pulumi.StringPtrInput
	// Id of the team associated with the runner.
	TeamId pulumi.StringPtrInput
}

func (AutomationActionsRunnerTeamAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsRunnerTeamAssociationState)(nil)).Elem()
}

type automationActionsRunnerTeamAssociationArgs struct {
	// Id of the runner.
	RunnerId string `pulumi:"runnerId"`
	// Id of the team associated with the runner.
	TeamId string `pulumi:"teamId"`
}

// The set of arguments for constructing a AutomationActionsRunnerTeamAssociation resource.
type AutomationActionsRunnerTeamAssociationArgs struct {
	// Id of the runner.
	RunnerId pulumi.StringInput
	// Id of the team associated with the runner.
	TeamId pulumi.StringInput
}

func (AutomationActionsRunnerTeamAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsRunnerTeamAssociationArgs)(nil)).Elem()
}

type AutomationActionsRunnerTeamAssociationInput interface {
	pulumi.Input

	ToAutomationActionsRunnerTeamAssociationOutput() AutomationActionsRunnerTeamAssociationOutput
	ToAutomationActionsRunnerTeamAssociationOutputWithContext(ctx context.Context) AutomationActionsRunnerTeamAssociationOutput
}

func (*AutomationActionsRunnerTeamAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsRunnerTeamAssociation)(nil)).Elem()
}

func (i *AutomationActionsRunnerTeamAssociation) ToAutomationActionsRunnerTeamAssociationOutput() AutomationActionsRunnerTeamAssociationOutput {
	return i.ToAutomationActionsRunnerTeamAssociationOutputWithContext(context.Background())
}

func (i *AutomationActionsRunnerTeamAssociation) ToAutomationActionsRunnerTeamAssociationOutputWithContext(ctx context.Context) AutomationActionsRunnerTeamAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsRunnerTeamAssociationOutput)
}

// AutomationActionsRunnerTeamAssociationArrayInput is an input type that accepts AutomationActionsRunnerTeamAssociationArray and AutomationActionsRunnerTeamAssociationArrayOutput values.
// You can construct a concrete instance of `AutomationActionsRunnerTeamAssociationArrayInput` via:
//
//	AutomationActionsRunnerTeamAssociationArray{ AutomationActionsRunnerTeamAssociationArgs{...} }
type AutomationActionsRunnerTeamAssociationArrayInput interface {
	pulumi.Input

	ToAutomationActionsRunnerTeamAssociationArrayOutput() AutomationActionsRunnerTeamAssociationArrayOutput
	ToAutomationActionsRunnerTeamAssociationArrayOutputWithContext(context.Context) AutomationActionsRunnerTeamAssociationArrayOutput
}

type AutomationActionsRunnerTeamAssociationArray []AutomationActionsRunnerTeamAssociationInput

func (AutomationActionsRunnerTeamAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsRunnerTeamAssociation)(nil)).Elem()
}

func (i AutomationActionsRunnerTeamAssociationArray) ToAutomationActionsRunnerTeamAssociationArrayOutput() AutomationActionsRunnerTeamAssociationArrayOutput {
	return i.ToAutomationActionsRunnerTeamAssociationArrayOutputWithContext(context.Background())
}

func (i AutomationActionsRunnerTeamAssociationArray) ToAutomationActionsRunnerTeamAssociationArrayOutputWithContext(ctx context.Context) AutomationActionsRunnerTeamAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsRunnerTeamAssociationArrayOutput)
}

// AutomationActionsRunnerTeamAssociationMapInput is an input type that accepts AutomationActionsRunnerTeamAssociationMap and AutomationActionsRunnerTeamAssociationMapOutput values.
// You can construct a concrete instance of `AutomationActionsRunnerTeamAssociationMapInput` via:
//
//	AutomationActionsRunnerTeamAssociationMap{ "key": AutomationActionsRunnerTeamAssociationArgs{...} }
type AutomationActionsRunnerTeamAssociationMapInput interface {
	pulumi.Input

	ToAutomationActionsRunnerTeamAssociationMapOutput() AutomationActionsRunnerTeamAssociationMapOutput
	ToAutomationActionsRunnerTeamAssociationMapOutputWithContext(context.Context) AutomationActionsRunnerTeamAssociationMapOutput
}

type AutomationActionsRunnerTeamAssociationMap map[string]AutomationActionsRunnerTeamAssociationInput

func (AutomationActionsRunnerTeamAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsRunnerTeamAssociation)(nil)).Elem()
}

func (i AutomationActionsRunnerTeamAssociationMap) ToAutomationActionsRunnerTeamAssociationMapOutput() AutomationActionsRunnerTeamAssociationMapOutput {
	return i.ToAutomationActionsRunnerTeamAssociationMapOutputWithContext(context.Background())
}

func (i AutomationActionsRunnerTeamAssociationMap) ToAutomationActionsRunnerTeamAssociationMapOutputWithContext(ctx context.Context) AutomationActionsRunnerTeamAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsRunnerTeamAssociationMapOutput)
}

type AutomationActionsRunnerTeamAssociationOutput struct{ *pulumi.OutputState }

func (AutomationActionsRunnerTeamAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsRunnerTeamAssociation)(nil)).Elem()
}

func (o AutomationActionsRunnerTeamAssociationOutput) ToAutomationActionsRunnerTeamAssociationOutput() AutomationActionsRunnerTeamAssociationOutput {
	return o
}

func (o AutomationActionsRunnerTeamAssociationOutput) ToAutomationActionsRunnerTeamAssociationOutputWithContext(ctx context.Context) AutomationActionsRunnerTeamAssociationOutput {
	return o
}

// Id of the runner.
func (o AutomationActionsRunnerTeamAssociationOutput) RunnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsRunnerTeamAssociation) pulumi.StringOutput { return v.RunnerId }).(pulumi.StringOutput)
}

// Id of the team associated with the runner.
func (o AutomationActionsRunnerTeamAssociationOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsRunnerTeamAssociation) pulumi.StringOutput { return v.TeamId }).(pulumi.StringOutput)
}

type AutomationActionsRunnerTeamAssociationArrayOutput struct{ *pulumi.OutputState }

func (AutomationActionsRunnerTeamAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsRunnerTeamAssociation)(nil)).Elem()
}

func (o AutomationActionsRunnerTeamAssociationArrayOutput) ToAutomationActionsRunnerTeamAssociationArrayOutput() AutomationActionsRunnerTeamAssociationArrayOutput {
	return o
}

func (o AutomationActionsRunnerTeamAssociationArrayOutput) ToAutomationActionsRunnerTeamAssociationArrayOutputWithContext(ctx context.Context) AutomationActionsRunnerTeamAssociationArrayOutput {
	return o
}

func (o AutomationActionsRunnerTeamAssociationArrayOutput) Index(i pulumi.IntInput) AutomationActionsRunnerTeamAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutomationActionsRunnerTeamAssociation {
		return vs[0].([]*AutomationActionsRunnerTeamAssociation)[vs[1].(int)]
	}).(AutomationActionsRunnerTeamAssociationOutput)
}

type AutomationActionsRunnerTeamAssociationMapOutput struct{ *pulumi.OutputState }

func (AutomationActionsRunnerTeamAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsRunnerTeamAssociation)(nil)).Elem()
}

func (o AutomationActionsRunnerTeamAssociationMapOutput) ToAutomationActionsRunnerTeamAssociationMapOutput() AutomationActionsRunnerTeamAssociationMapOutput {
	return o
}

func (o AutomationActionsRunnerTeamAssociationMapOutput) ToAutomationActionsRunnerTeamAssociationMapOutputWithContext(ctx context.Context) AutomationActionsRunnerTeamAssociationMapOutput {
	return o
}

func (o AutomationActionsRunnerTeamAssociationMapOutput) MapIndex(k pulumi.StringInput) AutomationActionsRunnerTeamAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutomationActionsRunnerTeamAssociation {
		return vs[0].(map[string]*AutomationActionsRunnerTeamAssociation)[vs[1].(string)]
	}).(AutomationActionsRunnerTeamAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsRunnerTeamAssociationInput)(nil)).Elem(), &AutomationActionsRunnerTeamAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsRunnerTeamAssociationArrayInput)(nil)).Elem(), AutomationActionsRunnerTeamAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsRunnerTeamAssociationMapInput)(nil)).Elem(), AutomationActionsRunnerTeamAssociationMap{})
	pulumi.RegisterOutputType(AutomationActionsRunnerTeamAssociationOutput{})
	pulumi.RegisterOutputType(AutomationActionsRunnerTeamAssociationArrayOutput{})
	pulumi.RegisterOutputType(AutomationActionsRunnerTeamAssociationMapOutput{})
}
