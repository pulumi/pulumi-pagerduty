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

// With [add-ons](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODEwNQ-install-an-add-on), third-party developers can write their own add-ons to PagerDuty's UI. Given a configuration containing a src parameter, that URL will be embedded in an iframe on a page that's available to users from a drop-down menu.
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
//			_, err := pagerduty.NewAddon(ctx, "example", &pagerduty.AddonArgs{
//				Name: pulumi.String("Internal Status Page"),
//				Src:  pulumi.String("https://intranet.example.com/status"),
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
// Add-ons can be imported using the `id`, e.g.
//
// ```sh
// $ pulumi import pagerduty:index/addon:Addon example P3DH5M6
// ```
type Addon struct {
	pulumi.CustomResourceState

	// The name of the add-on.
	Name pulumi.StringOutput `pulumi:"name"`
	// The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
	Src pulumi.StringOutput `pulumi:"src"`
}

// NewAddon registers a new resource with the given unique name, arguments, and options.
func NewAddon(ctx *pulumi.Context,
	name string, args *AddonArgs, opts ...pulumi.ResourceOption) (*Addon, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Src == nil {
		return nil, errors.New("invalid value for required argument 'Src'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Addon
	err := ctx.RegisterResource("pagerduty:index/addon:Addon", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAddon gets an existing Addon resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAddon(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AddonState, opts ...pulumi.ResourceOption) (*Addon, error) {
	var resource Addon
	err := ctx.ReadResource("pagerduty:index/addon:Addon", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Addon resources.
type addonState struct {
	// The name of the add-on.
	Name *string `pulumi:"name"`
	// The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
	Src *string `pulumi:"src"`
}

type AddonState struct {
	// The name of the add-on.
	Name pulumi.StringPtrInput
	// The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
	Src pulumi.StringPtrInput
}

func (AddonState) ElementType() reflect.Type {
	return reflect.TypeOf((*addonState)(nil)).Elem()
}

type addonArgs struct {
	// The name of the add-on.
	Name *string `pulumi:"name"`
	// The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
	Src string `pulumi:"src"`
}

// The set of arguments for constructing a Addon resource.
type AddonArgs struct {
	// The name of the add-on.
	Name pulumi.StringPtrInput
	// The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
	Src pulumi.StringInput
}

func (AddonArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*addonArgs)(nil)).Elem()
}

type AddonInput interface {
	pulumi.Input

	ToAddonOutput() AddonOutput
	ToAddonOutputWithContext(ctx context.Context) AddonOutput
}

func (*Addon) ElementType() reflect.Type {
	return reflect.TypeOf((**Addon)(nil)).Elem()
}

func (i *Addon) ToAddonOutput() AddonOutput {
	return i.ToAddonOutputWithContext(context.Background())
}

func (i *Addon) ToAddonOutputWithContext(ctx context.Context) AddonOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddonOutput)
}

// AddonArrayInput is an input type that accepts AddonArray and AddonArrayOutput values.
// You can construct a concrete instance of `AddonArrayInput` via:
//
//	AddonArray{ AddonArgs{...} }
type AddonArrayInput interface {
	pulumi.Input

	ToAddonArrayOutput() AddonArrayOutput
	ToAddonArrayOutputWithContext(context.Context) AddonArrayOutput
}

type AddonArray []AddonInput

func (AddonArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Addon)(nil)).Elem()
}

func (i AddonArray) ToAddonArrayOutput() AddonArrayOutput {
	return i.ToAddonArrayOutputWithContext(context.Background())
}

func (i AddonArray) ToAddonArrayOutputWithContext(ctx context.Context) AddonArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddonArrayOutput)
}

// AddonMapInput is an input type that accepts AddonMap and AddonMapOutput values.
// You can construct a concrete instance of `AddonMapInput` via:
//
//	AddonMap{ "key": AddonArgs{...} }
type AddonMapInput interface {
	pulumi.Input

	ToAddonMapOutput() AddonMapOutput
	ToAddonMapOutputWithContext(context.Context) AddonMapOutput
}

type AddonMap map[string]AddonInput

func (AddonMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Addon)(nil)).Elem()
}

func (i AddonMap) ToAddonMapOutput() AddonMapOutput {
	return i.ToAddonMapOutputWithContext(context.Background())
}

func (i AddonMap) ToAddonMapOutputWithContext(ctx context.Context) AddonMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddonMapOutput)
}

type AddonOutput struct{ *pulumi.OutputState }

func (AddonOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Addon)(nil)).Elem()
}

func (o AddonOutput) ToAddonOutput() AddonOutput {
	return o
}

func (o AddonOutput) ToAddonOutputWithContext(ctx context.Context) AddonOutput {
	return o
}

// The name of the add-on.
func (o AddonOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The source URL to display in a frame in the PagerDuty UI. `HTTPS` is required.
func (o AddonOutput) Src() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.Src }).(pulumi.StringOutput)
}

type AddonArrayOutput struct{ *pulumi.OutputState }

func (AddonArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Addon)(nil)).Elem()
}

func (o AddonArrayOutput) ToAddonArrayOutput() AddonArrayOutput {
	return o
}

func (o AddonArrayOutput) ToAddonArrayOutputWithContext(ctx context.Context) AddonArrayOutput {
	return o
}

func (o AddonArrayOutput) Index(i pulumi.IntInput) AddonOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Addon {
		return vs[0].([]*Addon)[vs[1].(int)]
	}).(AddonOutput)
}

type AddonMapOutput struct{ *pulumi.OutputState }

func (AddonMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Addon)(nil)).Elem()
}

func (o AddonMapOutput) ToAddonMapOutput() AddonMapOutput {
	return o
}

func (o AddonMapOutput) ToAddonMapOutputWithContext(ctx context.Context) AddonMapOutput {
	return o
}

func (o AddonMapOutput) MapIndex(k pulumi.StringInput) AddonOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Addon {
		return vs[0].(map[string]*Addon)[vs[1].(string)]
	}).(AddonOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AddonInput)(nil)).Elem(), &Addon{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddonArrayInput)(nil)).Elem(), AddonArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddonMapInput)(nil)).Elem(), AddonMap{})
	pulumi.RegisterOutputType(AddonOutput{})
	pulumi.RegisterOutputType(AddonArrayOutput{})
	pulumi.RegisterOutputType(AddonMapOutput{})
}
