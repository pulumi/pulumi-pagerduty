// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An [escalation policy](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEyNQ-create-an-escalation-policy) determines what user or schedule will be notified first, second, and so on when an incident is triggered. Escalation policies are used by one or more services.
//
// ## Import
//
// Escalation policies can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/escalationPolicy:EscalationPolicy main PLBP09X
//
// ```
type EscalationPolicy struct {
	pulumi.CustomResourceState

	Description pulumi.StringOutput `pulumi:"description"`
	// The name of the escalation policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// The number of times the escalation policy will repeat after reaching the end of its escalation.
	NumLoops pulumi.IntPtrOutput `pulumi:"numLoops"`
	// An Escalation rule block. Escalation rules documented below.
	Rules EscalationPolicyRuleArrayOutput `pulumi:"rules"`
	// Teams associated with the policy. Account must have the `teams` ability to use this parameter.
	Teams pulumi.StringPtrOutput `pulumi:"teams"`
}

// NewEscalationPolicy registers a new resource with the given unique name, arguments, and options.
func NewEscalationPolicy(ctx *pulumi.Context,
	name string, args *EscalationPolicyArgs, opts ...pulumi.ResourceOption) (*EscalationPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	if isZero(args.Description) {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	var resource EscalationPolicy
	err := ctx.RegisterResource("pagerduty:index/escalationPolicy:EscalationPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEscalationPolicy gets an existing EscalationPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEscalationPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EscalationPolicyState, opts ...pulumi.ResourceOption) (*EscalationPolicy, error) {
	var resource EscalationPolicy
	err := ctx.ReadResource("pagerduty:index/escalationPolicy:EscalationPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EscalationPolicy resources.
type escalationPolicyState struct {
	Description *string `pulumi:"description"`
	// The name of the escalation policy.
	Name *string `pulumi:"name"`
	// The number of times the escalation policy will repeat after reaching the end of its escalation.
	NumLoops *int `pulumi:"numLoops"`
	// An Escalation rule block. Escalation rules documented below.
	Rules []EscalationPolicyRule `pulumi:"rules"`
	// Teams associated with the policy. Account must have the `teams` ability to use this parameter.
	Teams *string `pulumi:"teams"`
}

type EscalationPolicyState struct {
	Description pulumi.StringPtrInput
	// The name of the escalation policy.
	Name pulumi.StringPtrInput
	// The number of times the escalation policy will repeat after reaching the end of its escalation.
	NumLoops pulumi.IntPtrInput
	// An Escalation rule block. Escalation rules documented below.
	Rules EscalationPolicyRuleArrayInput
	// Teams associated with the policy. Account must have the `teams` ability to use this parameter.
	Teams pulumi.StringPtrInput
}

func (EscalationPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*escalationPolicyState)(nil)).Elem()
}

type escalationPolicyArgs struct {
	Description *string `pulumi:"description"`
	// The name of the escalation policy.
	Name *string `pulumi:"name"`
	// The number of times the escalation policy will repeat after reaching the end of its escalation.
	NumLoops *int `pulumi:"numLoops"`
	// An Escalation rule block. Escalation rules documented below.
	Rules []EscalationPolicyRule `pulumi:"rules"`
	// Teams associated with the policy. Account must have the `teams` ability to use this parameter.
	Teams *string `pulumi:"teams"`
}

// The set of arguments for constructing a EscalationPolicy resource.
type EscalationPolicyArgs struct {
	Description pulumi.StringPtrInput
	// The name of the escalation policy.
	Name pulumi.StringPtrInput
	// The number of times the escalation policy will repeat after reaching the end of its escalation.
	NumLoops pulumi.IntPtrInput
	// An Escalation rule block. Escalation rules documented below.
	Rules EscalationPolicyRuleArrayInput
	// Teams associated with the policy. Account must have the `teams` ability to use this parameter.
	Teams pulumi.StringPtrInput
}

func (EscalationPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*escalationPolicyArgs)(nil)).Elem()
}

type EscalationPolicyInput interface {
	pulumi.Input

	ToEscalationPolicyOutput() EscalationPolicyOutput
	ToEscalationPolicyOutputWithContext(ctx context.Context) EscalationPolicyOutput
}

func (*EscalationPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**EscalationPolicy)(nil)).Elem()
}

func (i *EscalationPolicy) ToEscalationPolicyOutput() EscalationPolicyOutput {
	return i.ToEscalationPolicyOutputWithContext(context.Background())
}

func (i *EscalationPolicy) ToEscalationPolicyOutputWithContext(ctx context.Context) EscalationPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EscalationPolicyOutput)
}

// EscalationPolicyArrayInput is an input type that accepts EscalationPolicyArray and EscalationPolicyArrayOutput values.
// You can construct a concrete instance of `EscalationPolicyArrayInput` via:
//
//	EscalationPolicyArray{ EscalationPolicyArgs{...} }
type EscalationPolicyArrayInput interface {
	pulumi.Input

	ToEscalationPolicyArrayOutput() EscalationPolicyArrayOutput
	ToEscalationPolicyArrayOutputWithContext(context.Context) EscalationPolicyArrayOutput
}

type EscalationPolicyArray []EscalationPolicyInput

func (EscalationPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EscalationPolicy)(nil)).Elem()
}

func (i EscalationPolicyArray) ToEscalationPolicyArrayOutput() EscalationPolicyArrayOutput {
	return i.ToEscalationPolicyArrayOutputWithContext(context.Background())
}

func (i EscalationPolicyArray) ToEscalationPolicyArrayOutputWithContext(ctx context.Context) EscalationPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EscalationPolicyArrayOutput)
}

// EscalationPolicyMapInput is an input type that accepts EscalationPolicyMap and EscalationPolicyMapOutput values.
// You can construct a concrete instance of `EscalationPolicyMapInput` via:
//
//	EscalationPolicyMap{ "key": EscalationPolicyArgs{...} }
type EscalationPolicyMapInput interface {
	pulumi.Input

	ToEscalationPolicyMapOutput() EscalationPolicyMapOutput
	ToEscalationPolicyMapOutputWithContext(context.Context) EscalationPolicyMapOutput
}

type EscalationPolicyMap map[string]EscalationPolicyInput

func (EscalationPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EscalationPolicy)(nil)).Elem()
}

func (i EscalationPolicyMap) ToEscalationPolicyMapOutput() EscalationPolicyMapOutput {
	return i.ToEscalationPolicyMapOutputWithContext(context.Background())
}

func (i EscalationPolicyMap) ToEscalationPolicyMapOutputWithContext(ctx context.Context) EscalationPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EscalationPolicyMapOutput)
}

type EscalationPolicyOutput struct{ *pulumi.OutputState }

func (EscalationPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EscalationPolicy)(nil)).Elem()
}

func (o EscalationPolicyOutput) ToEscalationPolicyOutput() EscalationPolicyOutput {
	return o
}

func (o EscalationPolicyOutput) ToEscalationPolicyOutputWithContext(ctx context.Context) EscalationPolicyOutput {
	return o
}

func (o EscalationPolicyOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *EscalationPolicy) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The name of the escalation policy.
func (o EscalationPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EscalationPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The number of times the escalation policy will repeat after reaching the end of its escalation.
func (o EscalationPolicyOutput) NumLoops() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EscalationPolicy) pulumi.IntPtrOutput { return v.NumLoops }).(pulumi.IntPtrOutput)
}

// An Escalation rule block. Escalation rules documented below.
func (o EscalationPolicyOutput) Rules() EscalationPolicyRuleArrayOutput {
	return o.ApplyT(func(v *EscalationPolicy) EscalationPolicyRuleArrayOutput { return v.Rules }).(EscalationPolicyRuleArrayOutput)
}

// Teams associated with the policy. Account must have the `teams` ability to use this parameter.
func (o EscalationPolicyOutput) Teams() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EscalationPolicy) pulumi.StringPtrOutput { return v.Teams }).(pulumi.StringPtrOutput)
}

type EscalationPolicyArrayOutput struct{ *pulumi.OutputState }

func (EscalationPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EscalationPolicy)(nil)).Elem()
}

func (o EscalationPolicyArrayOutput) ToEscalationPolicyArrayOutput() EscalationPolicyArrayOutput {
	return o
}

func (o EscalationPolicyArrayOutput) ToEscalationPolicyArrayOutputWithContext(ctx context.Context) EscalationPolicyArrayOutput {
	return o
}

func (o EscalationPolicyArrayOutput) Index(i pulumi.IntInput) EscalationPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EscalationPolicy {
		return vs[0].([]*EscalationPolicy)[vs[1].(int)]
	}).(EscalationPolicyOutput)
}

type EscalationPolicyMapOutput struct{ *pulumi.OutputState }

func (EscalationPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EscalationPolicy)(nil)).Elem()
}

func (o EscalationPolicyMapOutput) ToEscalationPolicyMapOutput() EscalationPolicyMapOutput {
	return o
}

func (o EscalationPolicyMapOutput) ToEscalationPolicyMapOutputWithContext(ctx context.Context) EscalationPolicyMapOutput {
	return o
}

func (o EscalationPolicyMapOutput) MapIndex(k pulumi.StringInput) EscalationPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EscalationPolicy {
		return vs[0].(map[string]*EscalationPolicy)[vs[1].(string)]
	}).(EscalationPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EscalationPolicyInput)(nil)).Elem(), &EscalationPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*EscalationPolicyArrayInput)(nil)).Elem(), EscalationPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EscalationPolicyMapInput)(nil)).Elem(), EscalationPolicyMap{})
	pulumi.RegisterOutputType(EscalationPolicyOutput{})
	pulumi.RegisterOutputType(EscalationPolicyArrayOutput{})
	pulumi.RegisterOutputType(EscalationPolicyMapOutput{})
}
