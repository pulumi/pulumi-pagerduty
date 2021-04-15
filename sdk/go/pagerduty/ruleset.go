// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [Rulesets](https://support.pagerduty.com/docs/rulesets) allow you to route events to an endpoint and create collections of event rules, which define sets of actions to take based on event content.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/v2/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooTeam, err := pagerduty.NewTeam(ctx, "fooTeam", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewRuleset(ctx, "fooRuleset", &pagerduty.RulesetArgs{
// 			Team: &pagerduty.RulesetTeamArgs{
// 				Id: fooTeam.ID(),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Rulesets can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/ruleset:Ruleset main 19acac92-027a-4ea0-b06c-bbf516519601
// ```
type Ruleset struct {
	pulumi.CustomResourceState

	// Name of the ruleset.
	Name pulumi.StringOutput `pulumi:"name"`
	// Routing keys routed to this ruleset.
	RoutingKeys pulumi.StringArrayOutput `pulumi:"routingKeys"`
	// Reference to the team that owns the ruleset. If none is specified, only admins have access.
	Team RulesetTeamPtrOutput `pulumi:"team"`
	// Type of ruleset. Currently only sets to `global`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewRuleset registers a new resource with the given unique name, arguments, and options.
func NewRuleset(ctx *pulumi.Context,
	name string, args *RulesetArgs, opts ...pulumi.ResourceOption) (*Ruleset, error) {
	if args == nil {
		args = &RulesetArgs{}
	}

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
	// Type of ruleset. Currently only sets to `global`.
	Type *string `pulumi:"type"`
}

type RulesetState struct {
	// Name of the ruleset.
	Name pulumi.StringPtrInput
	// Routing keys routed to this ruleset.
	RoutingKeys pulumi.StringArrayInput
	// Reference to the team that owns the ruleset. If none is specified, only admins have access.
	Team RulesetTeamPtrInput
	// Type of ruleset. Currently only sets to `global`.
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
	return reflect.TypeOf((*Ruleset)(nil))
}

func (i *Ruleset) ToRulesetOutput() RulesetOutput {
	return i.ToRulesetOutputWithContext(context.Background())
}

func (i *Ruleset) ToRulesetOutputWithContext(ctx context.Context) RulesetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetOutput)
}

func (i *Ruleset) ToRulesetPtrOutput() RulesetPtrOutput {
	return i.ToRulesetPtrOutputWithContext(context.Background())
}

func (i *Ruleset) ToRulesetPtrOutputWithContext(ctx context.Context) RulesetPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetPtrOutput)
}

type RulesetPtrInput interface {
	pulumi.Input

	ToRulesetPtrOutput() RulesetPtrOutput
	ToRulesetPtrOutputWithContext(ctx context.Context) RulesetPtrOutput
}

type rulesetPtrType RulesetArgs

func (*rulesetPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Ruleset)(nil))
}

func (i *rulesetPtrType) ToRulesetPtrOutput() RulesetPtrOutput {
	return i.ToRulesetPtrOutputWithContext(context.Background())
}

func (i *rulesetPtrType) ToRulesetPtrOutputWithContext(ctx context.Context) RulesetPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetPtrOutput)
}

// RulesetArrayInput is an input type that accepts RulesetArray and RulesetArrayOutput values.
// You can construct a concrete instance of `RulesetArrayInput` via:
//
//          RulesetArray{ RulesetArgs{...} }
type RulesetArrayInput interface {
	pulumi.Input

	ToRulesetArrayOutput() RulesetArrayOutput
	ToRulesetArrayOutputWithContext(context.Context) RulesetArrayOutput
}

type RulesetArray []RulesetInput

func (RulesetArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Ruleset)(nil))
}

func (i RulesetArray) ToRulesetArrayOutput() RulesetArrayOutput {
	return i.ToRulesetArrayOutputWithContext(context.Background())
}

func (i RulesetArray) ToRulesetArrayOutputWithContext(ctx context.Context) RulesetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetArrayOutput)
}

// RulesetMapInput is an input type that accepts RulesetMap and RulesetMapOutput values.
// You can construct a concrete instance of `RulesetMapInput` via:
//
//          RulesetMap{ "key": RulesetArgs{...} }
type RulesetMapInput interface {
	pulumi.Input

	ToRulesetMapOutput() RulesetMapOutput
	ToRulesetMapOutputWithContext(context.Context) RulesetMapOutput
}

type RulesetMap map[string]RulesetInput

func (RulesetMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Ruleset)(nil))
}

func (i RulesetMap) ToRulesetMapOutput() RulesetMapOutput {
	return i.ToRulesetMapOutputWithContext(context.Background())
}

func (i RulesetMap) ToRulesetMapOutputWithContext(ctx context.Context) RulesetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetMapOutput)
}

type RulesetOutput struct {
	*pulumi.OutputState
}

func (RulesetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Ruleset)(nil))
}

func (o RulesetOutput) ToRulesetOutput() RulesetOutput {
	return o
}

func (o RulesetOutput) ToRulesetOutputWithContext(ctx context.Context) RulesetOutput {
	return o
}

func (o RulesetOutput) ToRulesetPtrOutput() RulesetPtrOutput {
	return o.ToRulesetPtrOutputWithContext(context.Background())
}

func (o RulesetOutput) ToRulesetPtrOutputWithContext(ctx context.Context) RulesetPtrOutput {
	return o.ApplyT(func(v Ruleset) *Ruleset {
		return &v
	}).(RulesetPtrOutput)
}

type RulesetPtrOutput struct {
	*pulumi.OutputState
}

func (RulesetPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ruleset)(nil))
}

func (o RulesetPtrOutput) ToRulesetPtrOutput() RulesetPtrOutput {
	return o
}

func (o RulesetPtrOutput) ToRulesetPtrOutputWithContext(ctx context.Context) RulesetPtrOutput {
	return o
}

type RulesetArrayOutput struct{ *pulumi.OutputState }

func (RulesetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Ruleset)(nil))
}

func (o RulesetArrayOutput) ToRulesetArrayOutput() RulesetArrayOutput {
	return o
}

func (o RulesetArrayOutput) ToRulesetArrayOutputWithContext(ctx context.Context) RulesetArrayOutput {
	return o
}

func (o RulesetArrayOutput) Index(i pulumi.IntInput) RulesetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Ruleset {
		return vs[0].([]Ruleset)[vs[1].(int)]
	}).(RulesetOutput)
}

type RulesetMapOutput struct{ *pulumi.OutputState }

func (RulesetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Ruleset)(nil))
}

func (o RulesetMapOutput) ToRulesetMapOutput() RulesetMapOutput {
	return o
}

func (o RulesetMapOutput) ToRulesetMapOutputWithContext(ctx context.Context) RulesetMapOutput {
	return o
}

func (o RulesetMapOutput) MapIndex(k pulumi.StringInput) RulesetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Ruleset {
		return vs[0].(map[string]Ruleset)[vs[1].(string)]
	}).(RulesetOutput)
}

func init() {
	pulumi.RegisterOutputType(RulesetOutput{})
	pulumi.RegisterOutputType(RulesetPtrOutput{})
	pulumi.RegisterOutputType(RulesetArrayOutput{})
	pulumi.RegisterOutputType(RulesetMapOutput{})
}
