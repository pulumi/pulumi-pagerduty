// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// A [schedule](https://v2.developer.pagerduty.com/v2/page/api-reference#!/Schedules/get_schedules) determines the time periods that users are on call. Only on-call users are eligible to receive notifications from incidents.
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
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A schedule layer block. Schedule layers documented below.
	Layers ScheduleLayerArrayOutput `pulumi:"layers"`
	// The name of the schedule.
	Name pulumi.StringOutput `pulumi:"name"`
	// Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter `overflow` is passed. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from `2011-06-01T10:00:00Z` to `2011-06-01T14:00:00Z`:
	// If you don't pass the overflow=true parameter, you will get one schedule entry returned with a start of `2011-06-01T10:00:00Z` and end of `2011-06-01T14:00:00Z`.
	// If you do pass the `overflow` parameter, you will get one schedule entry returned with a start of `2011-06-01T00:00:00Z` and end of `2011-06-02T00:00:00Z`.
	Overflow pulumi.BoolPtrOutput `pulumi:"overflow"`
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

func init() {
	pulumi.RegisterOutputType(ScheduleOutput{})
}
