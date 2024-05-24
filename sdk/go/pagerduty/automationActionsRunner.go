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

// An Automation Actions [runner](https://developer.pagerduty.com/api-reference/d78999fb7e863-create-an-automation-action-runner) is the method for how actions are executed. This can be done locally using an installed runner agent or as a connection to a PD Runbook Automation instance.
//
// > Only Runbook Automation (runbook) runners can be created.
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			RUNBOOK_API_KEY := cfg.Require("RUNBOOK_API_KEY")
//			_, err := pagerduty.NewAutomationActionsRunner(ctx, "example", &pagerduty.AutomationActionsRunnerArgs{
//				Name:           pulumi.String("Runner created via TF"),
//				Description:    pulumi.String("Description of the Runner created via TF"),
//				RunnerType:     pulumi.String("runbook"),
//				RunbookBaseUri: pulumi.String("rdcat.stg"),
//				RunbookApiKey:  pulumi.String(RUNBOOK_API_KEY),
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
// -> In the example below the `runbook_api_key` attribute has been omitted to avoid resource replacement after the import.
//
// Runners can be imported using the `id`, e.g.
//
// resource "pagerduty_automation_actions_runner" "example" {
//
//	name = "Runner created via TF"
//
//	description = "Description of the Runner created via TF"
//
//	runner_type = "runbook"
//
//	runbook_base_uri = "rdcat.stg"
//
// }
//
// ```sh
// $ pulumi import pagerduty:index/automationActionsRunner:AutomationActionsRunner example 01DER7CUUBF7TH4116K0M4WKPU
// ```
type AutomationActionsRunner struct {
	pulumi.CustomResourceState

	// The time runner was created. Represented as an ISO 8601 timestamp.
	CreationTime pulumi.StringOutput `pulumi:"creationTime"`
	// The description of the runner. Max length is 1024 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
	LastSeen pulumi.StringOutput `pulumi:"lastSeen"`
	// The name of the runner. Max length is 255 characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique User API Token created in Runbook Automation.
	RunbookApiKey pulumi.StringPtrOutput `pulumi:"runbookApiKey"`
	// The subdomain for your Runbook Automation Instance.
	RunbookBaseUri pulumi.StringPtrOutput `pulumi:"runbookBaseUri"`
	// The type of runner. The only allowed values is `runbook`.
	RunnerType pulumi.StringOutput `pulumi:"runnerType"`
	// The type of object. The value returned will be `runner`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAutomationActionsRunner registers a new resource with the given unique name, arguments, and options.
func NewAutomationActionsRunner(ctx *pulumi.Context,
	name string, args *AutomationActionsRunnerArgs, opts ...pulumi.ResourceOption) (*AutomationActionsRunner, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RunnerType == nil {
		return nil, errors.New("invalid value for required argument 'RunnerType'")
	}
	if args.RunbookApiKey != nil {
		args.RunbookApiKey = pulumi.ToSecret(args.RunbookApiKey).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"runbookApiKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutomationActionsRunner
	err := ctx.RegisterResource("pagerduty:index/automationActionsRunner:AutomationActionsRunner", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutomationActionsRunner gets an existing AutomationActionsRunner resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutomationActionsRunner(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutomationActionsRunnerState, opts ...pulumi.ResourceOption) (*AutomationActionsRunner, error) {
	var resource AutomationActionsRunner
	err := ctx.ReadResource("pagerduty:index/automationActionsRunner:AutomationActionsRunner", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutomationActionsRunner resources.
type automationActionsRunnerState struct {
	// The time runner was created. Represented as an ISO 8601 timestamp.
	CreationTime *string `pulumi:"creationTime"`
	// The description of the runner. Max length is 1024 characters.
	Description *string `pulumi:"description"`
	// (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
	LastSeen *string `pulumi:"lastSeen"`
	// The name of the runner. Max length is 255 characters.
	Name *string `pulumi:"name"`
	// The unique User API Token created in Runbook Automation.
	RunbookApiKey *string `pulumi:"runbookApiKey"`
	// The subdomain for your Runbook Automation Instance.
	RunbookBaseUri *string `pulumi:"runbookBaseUri"`
	// The type of runner. The only allowed values is `runbook`.
	RunnerType *string `pulumi:"runnerType"`
	// The type of object. The value returned will be `runner`.
	Type *string `pulumi:"type"`
}

type AutomationActionsRunnerState struct {
	// The time runner was created. Represented as an ISO 8601 timestamp.
	CreationTime pulumi.StringPtrInput
	// The description of the runner. Max length is 1024 characters.
	Description pulumi.StringPtrInput
	// (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
	LastSeen pulumi.StringPtrInput
	// The name of the runner. Max length is 255 characters.
	Name pulumi.StringPtrInput
	// The unique User API Token created in Runbook Automation.
	RunbookApiKey pulumi.StringPtrInput
	// The subdomain for your Runbook Automation Instance.
	RunbookBaseUri pulumi.StringPtrInput
	// The type of runner. The only allowed values is `runbook`.
	RunnerType pulumi.StringPtrInput
	// The type of object. The value returned will be `runner`.
	Type pulumi.StringPtrInput
}

func (AutomationActionsRunnerState) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsRunnerState)(nil)).Elem()
}

type automationActionsRunnerArgs struct {
	// The description of the runner. Max length is 1024 characters.
	Description *string `pulumi:"description"`
	// (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
	LastSeen *string `pulumi:"lastSeen"`
	// The name of the runner. Max length is 255 characters.
	Name *string `pulumi:"name"`
	// The unique User API Token created in Runbook Automation.
	RunbookApiKey *string `pulumi:"runbookApiKey"`
	// The subdomain for your Runbook Automation Instance.
	RunbookBaseUri *string `pulumi:"runbookBaseUri"`
	// The type of runner. The only allowed values is `runbook`.
	RunnerType string `pulumi:"runnerType"`
}

// The set of arguments for constructing a AutomationActionsRunner resource.
type AutomationActionsRunnerArgs struct {
	// The description of the runner. Max length is 1024 characters.
	Description pulumi.StringPtrInput
	// (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
	LastSeen pulumi.StringPtrInput
	// The name of the runner. Max length is 255 characters.
	Name pulumi.StringPtrInput
	// The unique User API Token created in Runbook Automation.
	RunbookApiKey pulumi.StringPtrInput
	// The subdomain for your Runbook Automation Instance.
	RunbookBaseUri pulumi.StringPtrInput
	// The type of runner. The only allowed values is `runbook`.
	RunnerType pulumi.StringInput
}

func (AutomationActionsRunnerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*automationActionsRunnerArgs)(nil)).Elem()
}

type AutomationActionsRunnerInput interface {
	pulumi.Input

	ToAutomationActionsRunnerOutput() AutomationActionsRunnerOutput
	ToAutomationActionsRunnerOutputWithContext(ctx context.Context) AutomationActionsRunnerOutput
}

func (*AutomationActionsRunner) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsRunner)(nil)).Elem()
}

func (i *AutomationActionsRunner) ToAutomationActionsRunnerOutput() AutomationActionsRunnerOutput {
	return i.ToAutomationActionsRunnerOutputWithContext(context.Background())
}

func (i *AutomationActionsRunner) ToAutomationActionsRunnerOutputWithContext(ctx context.Context) AutomationActionsRunnerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsRunnerOutput)
}

// AutomationActionsRunnerArrayInput is an input type that accepts AutomationActionsRunnerArray and AutomationActionsRunnerArrayOutput values.
// You can construct a concrete instance of `AutomationActionsRunnerArrayInput` via:
//
//	AutomationActionsRunnerArray{ AutomationActionsRunnerArgs{...} }
type AutomationActionsRunnerArrayInput interface {
	pulumi.Input

	ToAutomationActionsRunnerArrayOutput() AutomationActionsRunnerArrayOutput
	ToAutomationActionsRunnerArrayOutputWithContext(context.Context) AutomationActionsRunnerArrayOutput
}

type AutomationActionsRunnerArray []AutomationActionsRunnerInput

func (AutomationActionsRunnerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsRunner)(nil)).Elem()
}

func (i AutomationActionsRunnerArray) ToAutomationActionsRunnerArrayOutput() AutomationActionsRunnerArrayOutput {
	return i.ToAutomationActionsRunnerArrayOutputWithContext(context.Background())
}

func (i AutomationActionsRunnerArray) ToAutomationActionsRunnerArrayOutputWithContext(ctx context.Context) AutomationActionsRunnerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsRunnerArrayOutput)
}

// AutomationActionsRunnerMapInput is an input type that accepts AutomationActionsRunnerMap and AutomationActionsRunnerMapOutput values.
// You can construct a concrete instance of `AutomationActionsRunnerMapInput` via:
//
//	AutomationActionsRunnerMap{ "key": AutomationActionsRunnerArgs{...} }
type AutomationActionsRunnerMapInput interface {
	pulumi.Input

	ToAutomationActionsRunnerMapOutput() AutomationActionsRunnerMapOutput
	ToAutomationActionsRunnerMapOutputWithContext(context.Context) AutomationActionsRunnerMapOutput
}

type AutomationActionsRunnerMap map[string]AutomationActionsRunnerInput

func (AutomationActionsRunnerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsRunner)(nil)).Elem()
}

func (i AutomationActionsRunnerMap) ToAutomationActionsRunnerMapOutput() AutomationActionsRunnerMapOutput {
	return i.ToAutomationActionsRunnerMapOutputWithContext(context.Background())
}

func (i AutomationActionsRunnerMap) ToAutomationActionsRunnerMapOutputWithContext(ctx context.Context) AutomationActionsRunnerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutomationActionsRunnerMapOutput)
}

type AutomationActionsRunnerOutput struct{ *pulumi.OutputState }

func (AutomationActionsRunnerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutomationActionsRunner)(nil)).Elem()
}

func (o AutomationActionsRunnerOutput) ToAutomationActionsRunnerOutput() AutomationActionsRunnerOutput {
	return o
}

func (o AutomationActionsRunnerOutput) ToAutomationActionsRunnerOutputWithContext(ctx context.Context) AutomationActionsRunnerOutput {
	return o
}

// The time runner was created. Represented as an ISO 8601 timestamp.
func (o AutomationActionsRunnerOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsRunner) pulumi.StringOutput { return v.CreationTime }).(pulumi.StringOutput)
}

// The description of the runner. Max length is 1024 characters.
func (o AutomationActionsRunnerOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutomationActionsRunner) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
func (o AutomationActionsRunnerOutput) LastSeen() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsRunner) pulumi.StringOutput { return v.LastSeen }).(pulumi.StringOutput)
}

// The name of the runner. Max length is 255 characters.
func (o AutomationActionsRunnerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsRunner) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The unique User API Token created in Runbook Automation.
func (o AutomationActionsRunnerOutput) RunbookApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutomationActionsRunner) pulumi.StringPtrOutput { return v.RunbookApiKey }).(pulumi.StringPtrOutput)
}

// The subdomain for your Runbook Automation Instance.
func (o AutomationActionsRunnerOutput) RunbookBaseUri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AutomationActionsRunner) pulumi.StringPtrOutput { return v.RunbookBaseUri }).(pulumi.StringPtrOutput)
}

// The type of runner. The only allowed values is `runbook`.
func (o AutomationActionsRunnerOutput) RunnerType() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsRunner) pulumi.StringOutput { return v.RunnerType }).(pulumi.StringOutput)
}

// The type of object. The value returned will be `runner`.
func (o AutomationActionsRunnerOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AutomationActionsRunner) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type AutomationActionsRunnerArrayOutput struct{ *pulumi.OutputState }

func (AutomationActionsRunnerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutomationActionsRunner)(nil)).Elem()
}

func (o AutomationActionsRunnerArrayOutput) ToAutomationActionsRunnerArrayOutput() AutomationActionsRunnerArrayOutput {
	return o
}

func (o AutomationActionsRunnerArrayOutput) ToAutomationActionsRunnerArrayOutputWithContext(ctx context.Context) AutomationActionsRunnerArrayOutput {
	return o
}

func (o AutomationActionsRunnerArrayOutput) Index(i pulumi.IntInput) AutomationActionsRunnerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutomationActionsRunner {
		return vs[0].([]*AutomationActionsRunner)[vs[1].(int)]
	}).(AutomationActionsRunnerOutput)
}

type AutomationActionsRunnerMapOutput struct{ *pulumi.OutputState }

func (AutomationActionsRunnerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutomationActionsRunner)(nil)).Elem()
}

func (o AutomationActionsRunnerMapOutput) ToAutomationActionsRunnerMapOutput() AutomationActionsRunnerMapOutput {
	return o
}

func (o AutomationActionsRunnerMapOutput) ToAutomationActionsRunnerMapOutputWithContext(ctx context.Context) AutomationActionsRunnerMapOutput {
	return o
}

func (o AutomationActionsRunnerMapOutput) MapIndex(k pulumi.StringInput) AutomationActionsRunnerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutomationActionsRunner {
		return vs[0].(map[string]*AutomationActionsRunner)[vs[1].(string)]
	}).(AutomationActionsRunnerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsRunnerInput)(nil)).Elem(), &AutomationActionsRunner{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsRunnerArrayInput)(nil)).Elem(), AutomationActionsRunnerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutomationActionsRunnerMapInput)(nil)).Elem(), AutomationActionsRunnerMap{})
	pulumi.RegisterOutputType(AutomationActionsRunnerOutput{})
	pulumi.RegisterOutputType(AutomationActionsRunnerArrayOutput{})
	pulumi.RegisterOutputType(AutomationActionsRunnerMapOutput{})
}
