// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [schedule](https://developer.pagerduty.com/api-reference/reference/REST/openapiv3.json/paths/~1schedules~1%7Bid%7D~1users/get) determines the time periods that users are on call. Only on-call users are eligible to receive notifications from incidents.
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
// 		exampleUser, err := pagerduty.NewUser(ctx, "exampleUser", &pagerduty.UserArgs{
// 			Email: pulumi.String("125.greenholt.earline@graham.name"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleTeam, err := pagerduty.NewTeam(ctx, "exampleTeam", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewSchedule(ctx, "foo", &pagerduty.ScheduleArgs{
// 			TimeZone: pulumi.String("America/New_York"),
// 			Layers: pagerduty.ScheduleLayerArray{
// 				&pagerduty.ScheduleLayerArgs{
// 					Name:                      pulumi.String("Night Shift"),
// 					Start:                     pulumi.String("2015-11-06T20:00:00-05:00"),
// 					RotationVirtualStart:      pulumi.String("2015-11-06T20:00:00-05:00"),
// 					RotationTurnLengthSeconds: pulumi.Int(86400),
// 					Users: pulumi.StringArray{
// 						exampleUser.ID(),
// 					},
// 					Restrictions: pagerduty.ScheduleLayerRestrictionArray{
// 						&pagerduty.ScheduleLayerRestrictionArgs{
// 							Type:            pulumi.String("daily_restriction"),
// 							StartTimeOfDay:  pulumi.String("08:00:00"),
// 							DurationSeconds: pulumi.Int(32400),
// 						},
// 					},
// 				},
// 			},
// 			Teams: pulumi.StringArray{
// 				exampleTeam.ID(),
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
// Schedules can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/schedule:Schedule main PLBP09X
// ```
type Schedule struct {
	pulumi.CustomResourceState

	// The description of the schedule
	Description pulumi.StringOutput `pulumi:"description"`
	// A schedule layer block. Schedule layers documented below.
	Layers ScheduleLayerArrayOutput `pulumi:"layers"`
	// The name of the schedule.
	Name pulumi.StringOutput `pulumi:"name"`
	// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
	// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
	// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
	Overflow pulumi.BoolPtrOutput `pulumi:"overflow"`
	// Teams associated with the schedule.
	Teams pulumi.StringArrayOutput `pulumi:"teams"`
	// The time zone of the schedule (e.g Europe/Berlin).
	TimeZone pulumi.StringOutput `pulumi:"timeZone"`
}

// NewSchedule registers a new resource with the given unique name, arguments, and options.
func NewSchedule(ctx *pulumi.Context,
	name string, args *ScheduleArgs, opts ...pulumi.ResourceOption) (*Schedule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Layers == nil {
		return nil, errors.New("invalid value for required argument 'Layers'")
	}
	if args.TimeZone == nil {
		return nil, errors.New("invalid value for required argument 'TimeZone'")
	}
	if args.Description == nil {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	var resource Schedule
	err := ctx.RegisterResource("pagerduty:index/schedule:Schedule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchedule gets an existing Schedule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchedule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScheduleState, opts ...pulumi.ResourceOption) (*Schedule, error) {
	var resource Schedule
	err := ctx.ReadResource("pagerduty:index/schedule:Schedule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Schedule resources.
type scheduleState struct {
	// The description of the schedule
	Description *string `pulumi:"description"`
	// A schedule layer block. Schedule layers documented below.
	Layers []ScheduleLayer `pulumi:"layers"`
	// The name of the schedule.
	Name *string `pulumi:"name"`
	// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
	// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
	// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
	Overflow *bool `pulumi:"overflow"`
	// Teams associated with the schedule.
	Teams []string `pulumi:"teams"`
	// The time zone of the schedule (e.g Europe/Berlin).
	TimeZone *string `pulumi:"timeZone"`
}

type ScheduleState struct {
	// The description of the schedule
	Description pulumi.StringPtrInput
	// A schedule layer block. Schedule layers documented below.
	Layers ScheduleLayerArrayInput
	// The name of the schedule.
	Name pulumi.StringPtrInput
	// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
	// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
	// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
	Overflow pulumi.BoolPtrInput
	// Teams associated with the schedule.
	Teams pulumi.StringArrayInput
	// The time zone of the schedule (e.g Europe/Berlin).
	TimeZone pulumi.StringPtrInput
}

func (ScheduleState) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleState)(nil)).Elem()
}

type scheduleArgs struct {
	// The description of the schedule
	Description *string `pulumi:"description"`
	// A schedule layer block. Schedule layers documented below.
	Layers []ScheduleLayer `pulumi:"layers"`
	// The name of the schedule.
	Name *string `pulumi:"name"`
	// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
	// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
	// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
	Overflow *bool `pulumi:"overflow"`
	// Teams associated with the schedule.
	Teams []string `pulumi:"teams"`
	// The time zone of the schedule (e.g Europe/Berlin).
	TimeZone string `pulumi:"timeZone"`
}

// The set of arguments for constructing a Schedule resource.
type ScheduleArgs struct {
	// The description of the schedule
	Description pulumi.StringPtrInput
	// A schedule layer block. Schedule layers documented below.
	Layers ScheduleLayerArrayInput
	// The name of the schedule.
	Name pulumi.StringPtrInput
	// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
	// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
	// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
	Overflow pulumi.BoolPtrInput
	// Teams associated with the schedule.
	Teams pulumi.StringArrayInput
	// The time zone of the schedule (e.g Europe/Berlin).
	TimeZone pulumi.StringInput
}

func (ScheduleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleArgs)(nil)).Elem()
}

type ScheduleInput interface {
	pulumi.Input

	ToScheduleOutput() ScheduleOutput
	ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput
}

func (*Schedule) ElementType() reflect.Type {
	return reflect.TypeOf((*Schedule)(nil))
}

func (i *Schedule) ToScheduleOutput() ScheduleOutput {
	return i.ToScheduleOutputWithContext(context.Background())
}

func (i *Schedule) ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleOutput)
}

func (i *Schedule) ToSchedulePtrOutput() SchedulePtrOutput {
	return i.ToSchedulePtrOutputWithContext(context.Background())
}

func (i *Schedule) ToSchedulePtrOutputWithContext(ctx context.Context) SchedulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchedulePtrOutput)
}

type SchedulePtrInput interface {
	pulumi.Input

	ToSchedulePtrOutput() SchedulePtrOutput
	ToSchedulePtrOutputWithContext(ctx context.Context) SchedulePtrOutput
}

type schedulePtrType ScheduleArgs

func (*schedulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Schedule)(nil))
}

func (i *schedulePtrType) ToSchedulePtrOutput() SchedulePtrOutput {
	return i.ToSchedulePtrOutputWithContext(context.Background())
}

func (i *schedulePtrType) ToSchedulePtrOutputWithContext(ctx context.Context) SchedulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchedulePtrOutput)
}

// ScheduleArrayInput is an input type that accepts ScheduleArray and ScheduleArrayOutput values.
// You can construct a concrete instance of `ScheduleArrayInput` via:
//
//          ScheduleArray{ ScheduleArgs{...} }
type ScheduleArrayInput interface {
	pulumi.Input

	ToScheduleArrayOutput() ScheduleArrayOutput
	ToScheduleArrayOutputWithContext(context.Context) ScheduleArrayOutput
}

type ScheduleArray []ScheduleInput

func (ScheduleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Schedule)(nil))
}

func (i ScheduleArray) ToScheduleArrayOutput() ScheduleArrayOutput {
	return i.ToScheduleArrayOutputWithContext(context.Background())
}

func (i ScheduleArray) ToScheduleArrayOutputWithContext(ctx context.Context) ScheduleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleArrayOutput)
}

// ScheduleMapInput is an input type that accepts ScheduleMap and ScheduleMapOutput values.
// You can construct a concrete instance of `ScheduleMapInput` via:
//
//          ScheduleMap{ "key": ScheduleArgs{...} }
type ScheduleMapInput interface {
	pulumi.Input

	ToScheduleMapOutput() ScheduleMapOutput
	ToScheduleMapOutputWithContext(context.Context) ScheduleMapOutput
}

type ScheduleMap map[string]ScheduleInput

func (ScheduleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Schedule)(nil))
}

func (i ScheduleMap) ToScheduleMapOutput() ScheduleMapOutput {
	return i.ToScheduleMapOutputWithContext(context.Background())
}

func (i ScheduleMap) ToScheduleMapOutputWithContext(ctx context.Context) ScheduleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleMapOutput)
}

type ScheduleOutput struct {
	*pulumi.OutputState
}

func (ScheduleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Schedule)(nil))
}

func (o ScheduleOutput) ToScheduleOutput() ScheduleOutput {
	return o
}

func (o ScheduleOutput) ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput {
	return o
}

func (o ScheduleOutput) ToSchedulePtrOutput() SchedulePtrOutput {
	return o.ToSchedulePtrOutputWithContext(context.Background())
}

func (o ScheduleOutput) ToSchedulePtrOutputWithContext(ctx context.Context) SchedulePtrOutput {
	return o.ApplyT(func(v Schedule) *Schedule {
		return &v
	}).(SchedulePtrOutput)
}

type SchedulePtrOutput struct {
	*pulumi.OutputState
}

func (SchedulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Schedule)(nil))
}

func (o SchedulePtrOutput) ToSchedulePtrOutput() SchedulePtrOutput {
	return o
}

func (o SchedulePtrOutput) ToSchedulePtrOutputWithContext(ctx context.Context) SchedulePtrOutput {
	return o
}

type ScheduleArrayOutput struct{ *pulumi.OutputState }

func (ScheduleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Schedule)(nil))
}

func (o ScheduleArrayOutput) ToScheduleArrayOutput() ScheduleArrayOutput {
	return o
}

func (o ScheduleArrayOutput) ToScheduleArrayOutputWithContext(ctx context.Context) ScheduleArrayOutput {
	return o
}

func (o ScheduleArrayOutput) Index(i pulumi.IntInput) ScheduleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Schedule {
		return vs[0].([]Schedule)[vs[1].(int)]
	}).(ScheduleOutput)
}

type ScheduleMapOutput struct{ *pulumi.OutputState }

func (ScheduleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Schedule)(nil))
}

func (o ScheduleMapOutput) ToScheduleMapOutput() ScheduleMapOutput {
	return o
}

func (o ScheduleMapOutput) ToScheduleMapOutputWithContext(ctx context.Context) ScheduleMapOutput {
	return o
}

func (o ScheduleMapOutput) MapIndex(k pulumi.StringInput) ScheduleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Schedule {
		return vs[0].(map[string]Schedule)[vs[1].(string)]
	}).(ScheduleOutput)
}

func init() {
	pulumi.RegisterOutputType(ScheduleOutput{})
	pulumi.RegisterOutputType(SchedulePtrOutput{})
	pulumi.RegisterOutputType(ScheduleArrayOutput{})
	pulumi.RegisterOutputType(ScheduleMapOutput{})
}
