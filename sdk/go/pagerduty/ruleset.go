// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-pagerduty/sdk/v4/go/pagerduty/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Import
//
// Rulesets can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/ruleset:Ruleset main 19acac92-027a-4ea0-b06c-bbf516519601
//
// ```
type Ruleset struct {
	pulumi.CustomResourceState

	// Name of the ruleset.
	Name pulumi.StringOutput `pulumi:"name"`
	// Routing keys routed to this ruleset.
	RoutingKeys pulumi.StringArrayOutput `pulumi:"routingKeys"`
	// Reference to the team that owns the ruleset. If none is specified, only admins have access.
	Team RulesetTeamPtrOutput `pulumi:"team"`
	// Type of ruleset. Currently, only sets to `global`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewRuleset registers a new resource with the given unique name, arguments, and options.
func NewRuleset(ctx *pulumi.Context,
	name string, args *RulesetArgs, opts ...pulumi.ResourceOption) (*Ruleset, error) {
	if args == nil {
		args = &RulesetArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Ruleset
	err := ctx.RegisterResource("pagerduty:index/ruleset:Ruleset", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuleset gets an existing Ruleset resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuleset(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RulesetState, opts ...pulumi.ResourceOption) (*Ruleset, error) {
	var resource Ruleset
	err := ctx.ReadResource("pagerduty:index/ruleset:Ruleset", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ruleset resources.
type rulesetState struct {
	// Name of the ruleset.
	Name *string `pulumi:"name"`
	// Routing keys routed to this ruleset.
	RoutingKeys []string `pulumi:"routingKeys"`
	// Reference to the team that owns the ruleset. If none is specified, only admins have access.
	Team *RulesetTeam `pulumi:"team"`
	// Type of ruleset. Currently, only sets to `global`.
	Type *string `pulumi:"type"`
}

type RulesetState struct {
	// Name of the ruleset.
	Name pulumi.StringPtrInput
	// Routing keys routed to this ruleset.
	RoutingKeys pulumi.StringArrayInput
	// Reference to the team that owns the ruleset. If none is specified, only admins have access.
	Team RulesetTeamPtrInput
	// Type of ruleset. Currently, only sets to `global`.
	Type pulumi.StringPtrInput
}

func (RulesetState) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesetState)(nil)).Elem()
}

type rulesetArgs struct {
	// Name of the ruleset.
	Name *string `pulumi:"name"`
	// Reference to the team that owns the ruleset. If none is specified, only admins have access.
	Team *RulesetTeam `pulumi:"team"`
}

// The set of arguments for constructing a Ruleset resource.
type RulesetArgs struct {
	// Name of the ruleset.
	Name pulumi.StringPtrInput
	// Reference to the team that owns the ruleset. If none is specified, only admins have access.
	Team RulesetTeamPtrInput
}

func (RulesetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesetArgs)(nil)).Elem()
}

type RulesetInput interface {
	pulumi.Input

	ToRulesetOutput() RulesetOutput
	ToRulesetOutputWithContext(ctx context.Context) RulesetOutput
}

func (*Ruleset) ElementType() reflect.Type {
	return reflect.TypeOf((**Ruleset)(nil)).Elem()
}

func (i *Ruleset) ToRulesetOutput() RulesetOutput {
	return i.ToRulesetOutputWithContext(context.Background())
}

func (i *Ruleset) ToRulesetOutputWithContext(ctx context.Context) RulesetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetOutput)
}

func (i *Ruleset) ToOutput(ctx context.Context) pulumix.Output[*Ruleset] {
	return pulumix.Output[*Ruleset]{
		OutputState: i.ToRulesetOutputWithContext(ctx).OutputState,
	}
}

// RulesetArrayInput is an input type that accepts RulesetArray and RulesetArrayOutput values.
// You can construct a concrete instance of `RulesetArrayInput` via:
//
//	RulesetArray{ RulesetArgs{...} }
type RulesetArrayInput interface {
	pulumi.Input

	ToRulesetArrayOutput() RulesetArrayOutput
	ToRulesetArrayOutputWithContext(context.Context) RulesetArrayOutput
}

type RulesetArray []RulesetInput

func (RulesetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ruleset)(nil)).Elem()
}

func (i RulesetArray) ToRulesetArrayOutput() RulesetArrayOutput {
	return i.ToRulesetArrayOutputWithContext(context.Background())
}

func (i RulesetArray) ToRulesetArrayOutputWithContext(ctx context.Context) RulesetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetArrayOutput)
}

func (i RulesetArray) ToOutput(ctx context.Context) pulumix.Output[[]*Ruleset] {
	return pulumix.Output[[]*Ruleset]{
		OutputState: i.ToRulesetArrayOutputWithContext(ctx).OutputState,
	}
}

// RulesetMapInput is an input type that accepts RulesetMap and RulesetMapOutput values.
// You can construct a concrete instance of `RulesetMapInput` via:
//
//	RulesetMap{ "key": RulesetArgs{...} }
type RulesetMapInput interface {
	pulumi.Input

	ToRulesetMapOutput() RulesetMapOutput
	ToRulesetMapOutputWithContext(context.Context) RulesetMapOutput
}

type RulesetMap map[string]RulesetInput

func (RulesetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ruleset)(nil)).Elem()
}

func (i RulesetMap) ToRulesetMapOutput() RulesetMapOutput {
	return i.ToRulesetMapOutputWithContext(context.Background())
}

func (i RulesetMap) ToRulesetMapOutputWithContext(ctx context.Context) RulesetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetMapOutput)
}

func (i RulesetMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Ruleset] {
	return pulumix.Output[map[string]*Ruleset]{
		OutputState: i.ToRulesetMapOutputWithContext(ctx).OutputState,
	}
}

type RulesetOutput struct{ *pulumi.OutputState }

func (RulesetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ruleset)(nil)).Elem()
}

func (o RulesetOutput) ToRulesetOutput() RulesetOutput {
	return o
}

func (o RulesetOutput) ToRulesetOutputWithContext(ctx context.Context) RulesetOutput {
	return o
}

func (o RulesetOutput) ToOutput(ctx context.Context) pulumix.Output[*Ruleset] {
	return pulumix.Output[*Ruleset]{
		OutputState: o.OutputState,
	}
}

// Name of the ruleset.
func (o RulesetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Routing keys routed to this ruleset.
func (o RulesetOutput) RoutingKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringArrayOutput { return v.RoutingKeys }).(pulumi.StringArrayOutput)
}

// Reference to the team that owns the ruleset. If none is specified, only admins have access.
func (o RulesetOutput) Team() RulesetTeamPtrOutput {
	return o.ApplyT(func(v *Ruleset) RulesetTeamPtrOutput { return v.Team }).(RulesetTeamPtrOutput)
}

// Type of ruleset. Currently, only sets to `global`.
func (o RulesetOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type RulesetArrayOutput struct{ *pulumi.OutputState }

func (RulesetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ruleset)(nil)).Elem()
}

func (o RulesetArrayOutput) ToRulesetArrayOutput() RulesetArrayOutput {
	return o
}

func (o RulesetArrayOutput) ToRulesetArrayOutputWithContext(ctx context.Context) RulesetArrayOutput {
	return o
}

func (o RulesetArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Ruleset] {
	return pulumix.Output[[]*Ruleset]{
		OutputState: o.OutputState,
	}
}

func (o RulesetArrayOutput) Index(i pulumi.IntInput) RulesetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ruleset {
		return vs[0].([]*Ruleset)[vs[1].(int)]
	}).(RulesetOutput)
}

type RulesetMapOutput struct{ *pulumi.OutputState }

func (RulesetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ruleset)(nil)).Elem()
}

func (o RulesetMapOutput) ToRulesetMapOutput() RulesetMapOutput {
	return o
}

func (o RulesetMapOutput) ToRulesetMapOutputWithContext(ctx context.Context) RulesetMapOutput {
	return o
}

func (o RulesetMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Ruleset] {
	return pulumix.Output[map[string]*Ruleset]{
		OutputState: o.OutputState,
	}
}

func (o RulesetMapOutput) MapIndex(k pulumi.StringInput) RulesetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ruleset {
		return vs[0].(map[string]*Ruleset)[vs[1].(string)]
	}).(RulesetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetInput)(nil)).Elem(), &Ruleset{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetArrayInput)(nil)).Elem(), RulesetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetMapInput)(nil)).Elem(), RulesetMap{})
	pulumi.RegisterOutputType(RulesetOutput{})
	pulumi.RegisterOutputType(RulesetArrayOutput{})
	pulumi.RegisterOutputType(RulesetMapOutput{})
}
