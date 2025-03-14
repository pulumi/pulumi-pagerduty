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

// An Automation Actions [action](https://developer.pagerduty.com/api-reference/d64584a4371d3-create-an-automation-action) invokes jobs and workflows that are staged in Runbook Automation or Process Automation. It may also execute a command line script run by a Process Automation runner installed in your infrastructure.
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
//			_, err := pagerduty.NewAutomationActionsAction(ctx, "pa_action_example", &pagerduty.AutomationActionsActionArgs{
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
//			_, err = pagerduty.NewAutomationActionsAction(ctx, "script_action_example", &pagerduty.AutomationActionsActionArgs{
//				Name:        pulumi.String("Script Action created via TF"),
//				Description: pulumi.String("Description of the Script Action created via TF"),
//				ActionType:  pulumi.String("script"),
//				ActionDataReference: &pagerduty.AutomationActionsActionActionDataReferenceArgs{
//					Script:            pulumi.String("print(\"Hello from a Python script!\")"),
//					InvocationCommand: pulumi.String("/usr/local/bin/python3"),
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
// Actions can be imported using the `id`, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/automationActionsAction:AutomationActionsAction example 01DER7CUUBF7TH4116K0M4WKPU
// ```
type AutomationActionsAction struct {
	pulumi.CustomResourceState

	// The category of the action. The only allowed values are `diagnostic` and `remediation`.
	ActionClassification pulumi.StringPtrOutput `pulumi:"actionClassification"`
	// Action Data block. Action Data is documented below.
	ActionDataReference AutomationActionsActionActionDataReferenceOutput `pulumi:"actionDataReference"`
	// The type of the action. The only allowed values are `processAutomation` and `script`. Cannot be changed once set.
	ActionType                            pulumi.StringOutput `pulumi:"actionType"`
	AllowInvocationFromEventOrchestration pulumi.StringOutput `pulumi:"allowInvocationFromEventOrchestration"`
	AllowInvocationManually               pulumi.StringOutput `pulumi:"allowInvocationManually"`
	// The time action was created. Represented as an ISO 8601 timestamp.
	CreationTime pulumi.StringOutput `pulumi:"creationTime"`
	// The description of the action. Max length is 1024 characters.
	Description      pulumi.StringPtrOutput `pulumi:"description"`
	MapToAllServices pulumi.BoolOutput      `pulumi:"mapToAllServices"`
	// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
	ModifyTime pulumi.StringOutput `pulumi:"modifyTime"`
	// The name of the action. Max length is 255 characters.
	Name                               pulumi.StringOutput `pulumi:"name"`
	OnlyInvocableOnUnresolvedIncidents pulumi.BoolOutput   `pulumi:"onlyInvocableOnUnresolvedIncidents"`
	// The Process Automation Actions runner to associate the action with. Cannot be changed for the `processAutomation` action type once set.
	RunnerId pulumi.StringPtrOutput `pulumi:"runnerId"`
	// (Optional) The type of the runner associated with the action.
	RunnerType pulumi.StringOutput `pulumi:"runnerType"`
	// The type of object. The value returned will be `action`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAutomationActionsAction registers a new resource with the given unique name, arguments, and options.
func NewAutomationActionsAction(ctx *pulumi.Context,
	name string, args *AutomationActionsActionArgs, opts ...pulumi.ResourceOption) (*AutomationActionsAction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionDataReference == nil {
		return nil, errors.New("invalid value for required argument 'ActionDataReference'")
	}
	if args.ActionType == nil {
		return nil, errors.New("invalid value for required argument 'ActionType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutomationActionsAction
	err := ctx.RegisterResource("pagerduty:index/automationActionsAction:AutomationActionsAction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutomationActionsAction gets an existing AutomationActionsAction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutomationActionsAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutomationActionsActionState, opts ...pulumi.ResourceOption) (*AutomationActionsAction, error) {
	var resource AutomationActionsAction
	err := ctx.ReadResource("pagerduty:index/automationActionsAction:AutomationActionsAction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutomationActionsAction resources.
type automationActionsActionState struct {
	// The category of the action. The only allowed values are `diagnostic` and `remediation`.
	ActionClassification *string `pulumi:"actionClassification"`
	// Action Data block. Action Data is documented below.
	ActionDataReference *AutomationActionsActionActionDataReference `pulumi:"actionDataReference"`
	// The type of the action. The only allowed values are `processAutomation` and `script`. Cannot be changed once set.
	ActionType                            *string `pulumi:"actionType"`
	AllowInvocationFromEventOrchestration *string `pulumi:"allowInvocationFromEventOrchestration"`
	AllowInvocationManually               *string `pulumi:"allowInvocationManually"`
	// The time action was created. Represented as an ISO 8601 timestamp.
	CreationTime *string `pulumi:"creationTime"`
	// The description of the action. Max length is 1024 characters.
	Description      *string `pulumi:"description"`
	MapToAllServices *bool   `pulumi:"mapToAllServices"`
	// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
	ModifyTime *string `pulumi:"modifyTime"`
	// The name of the action. Max length is 255 characters.
	Name                               *string `pulumi:"name"`
	OnlyInvocableOnUnresolvedIncidents *bool   `pulumi:"onlyInvocableOnUnresolvedIncidents"`
	// The Process Automation Actions runner to associate the action with. Cannot be changed for the `processAutomation` action type once set.
	RunnerId *string `pulumi:"runnerId"`
	// (Optional) The type of the runner associated with the action.
	RunnerType *string `pulumi:"runnerType"`
	// The type of object. The value returned will be `action`.
	Type *string `pulumi:"type"`
}

type AutomationActionsActionState struct {
	// The category of the action. The only allowed values are `diagnostic` and `remediation`.
	ActionClassification pulumi.StringPtrInput
	// Action Data block. Action Data is documented below.
	ActionDataReference AutomationActionsActionActionDataReferencePtrInput
	// The type of the action. The only allowed values are `processAutomation` and `script`. Cannot be changed once set.
	ActionType                            pulumi.StringPtrInput
	AllowInvocationFromEventOrchestration pulumi.StringPtrInput
	AllowInvocationManually               pulumi.StringPtrInput
	// The time action was created. Represented as an ISO 8601 timestamp.
	CreationTime pulumi.StringPtrInput
	// The description of the action. Max length is 1024 characters.
	Description      pulumi.StringPtrInput
	MapToAllServices pulumi.BoolPtrInput
	// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
	ModifyTime pulumi.StringPtrInput
	// The name of the action. Max length is 255 characters.
	Name                               pulumi.StringPtrInput
	OnlyInvocableOnUnresolvedIncidents pulumi.BoolPtrInput
	// The Process Automation Actions runner to associate the action with. Cannot be changed for the `processAutomation` action type once set.
	RunnerId pulumi.StringPtrInput
	// (Optional) The type of the runner associated with the action.
	RunnerType pulumi.StringPtrInput
	// The type of object. The value returned will be `action`.
	Type pulumi.StringPtrInput
}

func (AutomationActionsActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsActionState)(nil)).Elem()
}

type automationActionsActionArgs struct {
	// The category of the action. The only allowed values are `diagnostic` and `remediation`.
	ActionClassification *string `pulumi:"actionClassification"`
	// Action Data block. Action Data is documented below.
	ActionDataReference AutomationActionsActionActionDataReference `pulumi:"actionDataReference"`
	// The type of the action. The only allowed values are `processAutomation` and `script`. Cannot be changed once set.
	ActionType                            string  `pulumi:"actionType"`
	AllowInvocationFromEventOrchestration *string `pulumi:"allowInvocationFromEventOrchestration"`
	AllowInvocationManually               *string `pulumi:"allowInvocationManually"`
	// The time action was created. Represented as an ISO 8601 timestamp.
	CreationTime *string `pulumi:"creationTime"`
	// The description of the action. Max length is 1024 characters.
	Description      *string `pulumi:"description"`
	MapToAllServices *bool   `pulumi:"mapToAllServices"`
	// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
	ModifyTime *string `pulumi:"modifyTime"`
	// The name of the action. Max length is 255 characters.
	Name                               *string `pulumi:"name"`
	OnlyInvocableOnUnresolvedIncidents *bool   `pulumi:"onlyInvocableOnUnresolvedIncidents"`
	// The Process Automation Actions runner to associate the action with. Cannot be changed for the `processAutomation` action type once set.
	RunnerId *string `pulumi:"runnerId"`
	// (Optional) The type of the runner associated with the action.
	RunnerType *string `pulumi:"runnerType"`
	// The type of object. The value returned will be `action`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a AutomationActionsAction resource.
type AutomationActionsActionArgs struct {
	// The category of the action. The only allowed values are `diagnostic` and `remediation`.
	ActionClassification pulumi.StringPtrInput
	// Action Data block. Action Data is documented below.
	ActionDataReference AutomationActionsActionActionDataReferenceInput
	// The type of the action. The only allowed values are `processAutomation` and `script`. Cannot be changed once set.
	ActionType                            pulumi.StringInput
	AllowInvocationFromEventOrchestration pulumi.StringPtrInput
	AllowInvocationManually               pulumi.StringPtrInput
	// The time action was created. Represented as an ISO 8601 timestamp.
	CreationTime pulumi.StringPtrInput
	// The description of the action. Max length is 1024 characters.
	Description      pulumi.StringPtrInput
	MapToAllServices pulumi.BoolPtrInput
	// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
	ModifyTime pulumi.StringPtrInput
	// The name of the action. Max length is 255 characters.
	Name                               pulumi.StringPtrInput
	OnlyInvocableOnUnresolvedIncidents pulumi.BoolPtrInput
	// The Process Automation Actions runner to associate the action with. Cannot be changed for the `processAutomation` action type once set.
	RunnerId pulumi.StringPtrInput
	// (Optional) The type of the runner associated with the action.
	RunnerType pulumi.StringPtrInput
	// The type of object. The value returned will be `action`.
	Type pulumi.StringPtrInput
}

func (AutomationActionsActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsActionArgs)(nil)).Elem()
}

type AutomationActionsActionInput interface {
	pulumi.Input

	ToAutomationActionsActionOutput() AutomationActionsActionOutput
	ToAutomationActionsActionOutputWithContext(ctx context.Context) AutomationActionsActionOutput
}

func (*AutomationActionsAction) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsAction)(nil)).Elem()
}

func (i *AutomationActionsAction) ToAutomationActionsActionOutput() AutomationActionsActionOutput {
	return i.ToAutomationActionsActionOutputWithContext(context.Background())
}

func (i *AutomationActionsAction) ToAutomationActionsActionOutputWithContext(ctx context.Context) AutomationActionsActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionOutput)
}

// AutomationActionsActionArrayInput is an input type that accepts AutomationActionsActionArray and AutomationActionsActionArrayOutput values.
// You can construct a concrete instance of `AutomationActionsActionArrayInput` via:
//
//	AutomationActionsActionArray{ AutomationActionsActionArgs{...} }
type AutomationActionsActionArrayInput interface {
	pulumi.Input

	ToAutomationActionsActionArrayOutput() AutomationActionsActionArrayOutput
	ToAutomationActionsActionArrayOutputWithContext(context.Context) AutomationActionsActionArrayOutput
}

type AutomationActionsActionArray []AutomationActionsActionInput

func (AutomationActionsActionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsAction)(nil)).Elem()
}

func (i AutomationActionsActionArray) ToAutomationActionsActionArrayOutput() AutomationActionsActionArrayOutput {
	return i.ToAutomationActionsActionArrayOutputWithContext(context.Background())
}

func (i AutomationActionsActionArray) ToAutomationActionsActionArrayOutputWithContext(ctx context.Context) AutomationActionsActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionArrayOutput)
}

// AutomationActionsActionMapInput is an input type that accepts AutomationActionsActionMap and AutomationActionsActionMapOutput values.
// You can construct a concrete instance of `AutomationActionsActionMapInput` via:
//
//	AutomationActionsActionMap{ "key": AutomationActionsActionArgs{...} }
type AutomationActionsActionMapInput interface {
	pulumi.Input

	ToAutomationActionsActionMapOutput() AutomationActionsActionMapOutput
	ToAutomationActionsActionMapOutputWithContext(context.Context) AutomationActionsActionMapOutput
}

type AutomationActionsActionMap map[string]AutomationActionsActionInput

func (AutomationActionsActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsAction)(nil)).Elem()
}

func (i AutomationActionsActionMap) ToAutomationActionsActionMapOutput() AutomationActionsActionMapOutput {
	return i.ToAutomationActionsActionMapOutputWithContext(context.Background())
}

func (i AutomationActionsActionMap) ToAutomationActionsActionMapOutputWithContext(ctx context.Context) AutomationActionsActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsActionMapOutput)
}

type AutomationActionsActionOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsAction)(nil)).Elem()
}

func (o AutomationActionsActionOutput) ToAutomationActionsActionOutput() AutomationActionsActionOutput {
	return o
}

func (o AutomationActionsActionOutput) ToAutomationActionsActionOutputWithContext(ctx context.Context) AutomationActionsActionOutput {
	return o
}

// The category of the action. The only allowed values are `diagnostic` and `remediation`.
func (o AutomationActionsActionOutput) ActionClassification() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringPtrOutput { return v.ActionClassification }).(pulumi.StringPtrOutput)
}

// Action Data block. Action Data is documented below.
func (o AutomationActionsActionOutput) ActionDataReference() AutomationActionsActionActionDataReferenceOutput {
	return o.ApplyT(func(v *AutomationActionsAction) AutomationActionsActionActionDataReferenceOutput {
		return v.ActionDataReference
	}).(AutomationActionsActionActionDataReferenceOutput)
}

// The type of the action. The only allowed values are `processAutomation` and `script`. Cannot be changed once set.
func (o AutomationActionsActionOutput) ActionType() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringOutput { return v.ActionType }).(pulumi.StringOutput)
}

func (o AutomationActionsActionOutput) AllowInvocationFromEventOrchestration() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringOutput { return v.AllowInvocationFromEventOrchestration }).(pulumi.StringOutput)
}

func (o AutomationActionsActionOutput) AllowInvocationManually() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringOutput { return v.AllowInvocationManually }).(pulumi.StringOutput)
}

// The time action was created. Represented as an ISO 8601 timestamp.
func (o AutomationActionsActionOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringOutput { return v.CreationTime }).(pulumi.StringOutput)
}

// The description of the action. Max length is 1024 characters.
func (o AutomationActionsActionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o AutomationActionsActionOutput) MapToAllServices() pulumi.BoolOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.BoolOutput { return v.MapToAllServices }).(pulumi.BoolOutput)
}

// (Optional) The last time action has been modified. Represented as an ISO 8601 timestamp.
func (o AutomationActionsActionOutput) ModifyTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringOutput { return v.ModifyTime }).(pulumi.StringOutput)
}

// The name of the action. Max length is 255 characters.
func (o AutomationActionsActionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o AutomationActionsActionOutput) OnlyInvocableOnUnresolvedIncidents() pulumi.BoolOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.BoolOutput { return v.OnlyInvocableOnUnresolvedIncidents }).(pulumi.BoolOutput)
}

// The Process Automation Actions runner to associate the action with. Cannot be changed for the `processAutomation` action type once set.
func (o AutomationActionsActionOutput) RunnerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringPtrOutput { return v.RunnerId }).(pulumi.StringPtrOutput)
}

// (Optional) The type of the runner associated with the action.
func (o AutomationActionsActionOutput) RunnerType() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringOutput { return v.RunnerType }).(pulumi.StringOutput)
}

// The type of object. The value returned will be `action`.
func (o AutomationActionsActionOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsAction) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type AutomationActionsActionArrayOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsAction)(nil)).Elem()
}

func (o AutomationActionsActionArrayOutput) ToAutomationActionsActionArrayOutput() AutomationActionsActionArrayOutput {
	return o
}

func (o AutomationActionsActionArrayOutput) ToAutomationActionsActionArrayOutputWithContext(ctx context.Context) AutomationActionsActionArrayOutput {
	return o
}

func (o AutomationActionsActionArrayOutput) Index(i pulumi.IntInput) AutomationActionsActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutomationActionsAction {
		return vs[0].([]*AutomationActionsAction)[vs[1].(int)]
	}).(AutomationActionsActionOutput)
}

type AutomationActionsActionMapOutput struct{ *pulumi.OutputState }

func (AutomationActionsActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsAction)(nil)).Elem()
}

func (o AutomationActionsActionMapOutput) ToAutomationActionsActionMapOutput() AutomationActionsActionMapOutput {
	return o
}

func (o AutomationActionsActionMapOutput) ToAutomationActionsActionMapOutputWithContext(ctx context.Context) AutomationActionsActionMapOutput {
	return o
}

func (o AutomationActionsActionMapOutput) MapIndex(k pulumi.StringInput) AutomationActionsActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutomationActionsAction {
		return vs[0].(map[string]*AutomationActionsAction)[vs[1].(string)]
	}).(AutomationActionsActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionInput)(nil)).Elem(), &AutomationActionsAction{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionArrayInput)(nil)).Elem(), AutomationActionsActionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsActionMapInput)(nil)).Elem(), AutomationActionsActionMap{})
	pulumi.RegisterOutputType(AutomationActionsActionOutput{})
	pulumi.RegisterOutputType(AutomationActionsActionArrayOutput{})
	pulumi.RegisterOutputType(AutomationActionsActionMapOutput{})
}
