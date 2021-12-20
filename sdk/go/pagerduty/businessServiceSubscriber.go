// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [business service subscriber](https://developer.pagerduty.com/api-reference/b3A6NDUwNDgxOQ-list-business-service-subscribers) allows you to subscribe users or teams to automatically receive updates about key business services.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleBusinessService, err := pagerduty.NewBusinessService(ctx, "exampleBusinessService", &pagerduty.BusinessServiceArgs{
// 			Description:    pulumi.String("A very descriptive description of this business service"),
// 			PointOfContact: pulumi.String("PagerDuty Admin"),
// 			Team:           pulumi.String("P37RSRS"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		engteam, err := pagerduty.NewTeam(ctx, "engteam", nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleUser, err := pagerduty.NewUser(ctx, "exampleUser", &pagerduty.UserArgs{
// 			Email: pulumi.String("125.greenholt.earline@graham.name"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewBusinessServiceSubscriber(ctx, "teamExample", &pagerduty.BusinessServiceSubscriberArgs{
// 			SubscriberId:      engteam.ID(),
// 			SubscriberType:    pulumi.String("team"),
// 			BusinessServiceId: exampleBusinessService.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pagerduty.NewBusinessServiceSubscriber(ctx, "userExample", &pagerduty.BusinessServiceSubscriberArgs{
// 			SubscriberId:      exampleUser.ID(),
// 			SubscriberType:    pulumi.String("user"),
// 			BusinessServiceId: exampleBusinessService.ID(),
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
// Services can be imported using the `id` using the related business service ID, the subscriber type and the subscriber ID separated by a dot, e.g.
//
// ```sh
//  $ pulumi import pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber main PLBP09X.team.PLBP09X
// ```
type BusinessServiceSubscriber struct {
	pulumi.CustomResourceState

	// The ID of the business service to subscribe to.
	BusinessServiceId pulumi.StringOutput `pulumi:"businessServiceId"`
	// The ID of the subscriber entity.
	SubscriberId pulumi.StringOutput `pulumi:"subscriberId"`
	// Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
	SubscriberType pulumi.StringOutput `pulumi:"subscriberType"`
}

// NewBusinessServiceSubscriber registers a new resource with the given unique name, arguments, and options.
func NewBusinessServiceSubscriber(ctx *pulumi.Context,
	name string, args *BusinessServiceSubscriberArgs, opts ...pulumi.ResourceOption) (*BusinessServiceSubscriber, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BusinessServiceId == nil {
		return nil, errors.New("invalid value for required argument 'BusinessServiceId'")
	}
	if args.SubscriberId == nil {
		return nil, errors.New("invalid value for required argument 'SubscriberId'")
	}
	if args.SubscriberType == nil {
		return nil, errors.New("invalid value for required argument 'SubscriberType'")
	}
	var resource BusinessServiceSubscriber
	err := ctx.RegisterResource("pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBusinessServiceSubscriber gets an existing BusinessServiceSubscriber resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBusinessServiceSubscriber(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BusinessServiceSubscriberState, opts ...pulumi.ResourceOption) (*BusinessServiceSubscriber, error) {
	var resource BusinessServiceSubscriber
	err := ctx.ReadResource("pagerduty:index/businessServiceSubscriber:BusinessServiceSubscriber", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BusinessServiceSubscriber resources.
type businessServiceSubscriberState struct {
	// The ID of the business service to subscribe to.
	BusinessServiceId *string `pulumi:"businessServiceId"`
	// The ID of the subscriber entity.
	SubscriberId *string `pulumi:"subscriberId"`
	// Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
	SubscriberType *string `pulumi:"subscriberType"`
}

type BusinessServiceSubscriberState struct {
	// The ID of the business service to subscribe to.
	BusinessServiceId pulumi.StringPtrInput
	// The ID of the subscriber entity.
	SubscriberId pulumi.StringPtrInput
	// Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
	SubscriberType pulumi.StringPtrInput
}

func (BusinessServiceSubscriberState) ElementType() reflect.Type {
	return reflect.TypeOf((*businessServiceSubscriberState)(nil)).Elem()
}

type businessServiceSubscriberArgs struct {
	// The ID of the business service to subscribe to.
	BusinessServiceId string `pulumi:"businessServiceId"`
	// The ID of the subscriber entity.
	SubscriberId string `pulumi:"subscriberId"`
	// Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
	SubscriberType string `pulumi:"subscriberType"`
}

// The set of arguments for constructing a BusinessServiceSubscriber resource.
type BusinessServiceSubscriberArgs struct {
	// The ID of the business service to subscribe to.
	BusinessServiceId pulumi.StringInput
	// The ID of the subscriber entity.
	SubscriberId pulumi.StringInput
	// Type of subscriber entity in the subscriber assignment. Possible values can be `user` and `team`.
	SubscriberType pulumi.StringInput
}

func (BusinessServiceSubscriberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*businessServiceSubscriberArgs)(nil)).Elem()
}

type BusinessServiceSubscriberInput interface {
	pulumi.Input

	ToBusinessServiceSubscriberOutput() BusinessServiceSubscriberOutput
	ToBusinessServiceSubscriberOutputWithContext(ctx context.Context) BusinessServiceSubscriberOutput
}

func (*BusinessServiceSubscriber) ElementType() reflect.Type {
	return reflect.TypeOf((*BusinessServiceSubscriber)(nil))
}

func (i *BusinessServiceSubscriber) ToBusinessServiceSubscriberOutput() BusinessServiceSubscriberOutput {
	return i.ToBusinessServiceSubscriberOutputWithContext(context.Background())
}

func (i *BusinessServiceSubscriber) ToBusinessServiceSubscriberOutputWithContext(ctx context.Context) BusinessServiceSubscriberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessServiceSubscriberOutput)
}

func (i *BusinessServiceSubscriber) ToBusinessServiceSubscriberPtrOutput() BusinessServiceSubscriberPtrOutput {
	return i.ToBusinessServiceSubscriberPtrOutputWithContext(context.Background())
}

func (i *BusinessServiceSubscriber) ToBusinessServiceSubscriberPtrOutputWithContext(ctx context.Context) BusinessServiceSubscriberPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessServiceSubscriberPtrOutput)
}

type BusinessServiceSubscriberPtrInput interface {
	pulumi.Input

	ToBusinessServiceSubscriberPtrOutput() BusinessServiceSubscriberPtrOutput
	ToBusinessServiceSubscriberPtrOutputWithContext(ctx context.Context) BusinessServiceSubscriberPtrOutput
}

type businessServiceSubscriberPtrType BusinessServiceSubscriberArgs

func (*businessServiceSubscriberPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessServiceSubscriber)(nil))
}

func (i *businessServiceSubscriberPtrType) ToBusinessServiceSubscriberPtrOutput() BusinessServiceSubscriberPtrOutput {
	return i.ToBusinessServiceSubscriberPtrOutputWithContext(context.Background())
}

func (i *businessServiceSubscriberPtrType) ToBusinessServiceSubscriberPtrOutputWithContext(ctx context.Context) BusinessServiceSubscriberPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessServiceSubscriberPtrOutput)
}

// BusinessServiceSubscriberArrayInput is an input type that accepts BusinessServiceSubscriberArray and BusinessServiceSubscriberArrayOutput values.
// You can construct a concrete instance of `BusinessServiceSubscriberArrayInput` via:
//
//          BusinessServiceSubscriberArray{ BusinessServiceSubscriberArgs{...} }
type BusinessServiceSubscriberArrayInput interface {
	pulumi.Input

	ToBusinessServiceSubscriberArrayOutput() BusinessServiceSubscriberArrayOutput
	ToBusinessServiceSubscriberArrayOutputWithContext(context.Context) BusinessServiceSubscriberArrayOutput
}

type BusinessServiceSubscriberArray []BusinessServiceSubscriberInput

func (BusinessServiceSubscriberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessServiceSubscriber)(nil)).Elem()
}

func (i BusinessServiceSubscriberArray) ToBusinessServiceSubscriberArrayOutput() BusinessServiceSubscriberArrayOutput {
	return i.ToBusinessServiceSubscriberArrayOutputWithContext(context.Background())
}

func (i BusinessServiceSubscriberArray) ToBusinessServiceSubscriberArrayOutputWithContext(ctx context.Context) BusinessServiceSubscriberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessServiceSubscriberArrayOutput)
}

// BusinessServiceSubscriberMapInput is an input type that accepts BusinessServiceSubscriberMap and BusinessServiceSubscriberMapOutput values.
// You can construct a concrete instance of `BusinessServiceSubscriberMapInput` via:
//
//          BusinessServiceSubscriberMap{ "key": BusinessServiceSubscriberArgs{...} }
type BusinessServiceSubscriberMapInput interface {
	pulumi.Input

	ToBusinessServiceSubscriberMapOutput() BusinessServiceSubscriberMapOutput
	ToBusinessServiceSubscriberMapOutputWithContext(context.Context) BusinessServiceSubscriberMapOutput
}

type BusinessServiceSubscriberMap map[string]BusinessServiceSubscriberInput

func (BusinessServiceSubscriberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessServiceSubscriber)(nil)).Elem()
}

func (i BusinessServiceSubscriberMap) ToBusinessServiceSubscriberMapOutput() BusinessServiceSubscriberMapOutput {
	return i.ToBusinessServiceSubscriberMapOutputWithContext(context.Background())
}

func (i BusinessServiceSubscriberMap) ToBusinessServiceSubscriberMapOutputWithContext(ctx context.Context) BusinessServiceSubscriberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessServiceSubscriberMapOutput)
}

type BusinessServiceSubscriberOutput struct{ *pulumi.OutputState }

func (BusinessServiceSubscriberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*BusinessServiceSubscriber)(nil))
}

func (o BusinessServiceSubscriberOutput) ToBusinessServiceSubscriberOutput() BusinessServiceSubscriberOutput {
	return o
}

func (o BusinessServiceSubscriberOutput) ToBusinessServiceSubscriberOutputWithContext(ctx context.Context) BusinessServiceSubscriberOutput {
	return o
}

func (o BusinessServiceSubscriberOutput) ToBusinessServiceSubscriberPtrOutput() BusinessServiceSubscriberPtrOutput {
	return o.ToBusinessServiceSubscriberPtrOutputWithContext(context.Background())
}

func (o BusinessServiceSubscriberOutput) ToBusinessServiceSubscriberPtrOutputWithContext(ctx context.Context) BusinessServiceSubscriberPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v BusinessServiceSubscriber) *BusinessServiceSubscriber {
		return &v
	}).(BusinessServiceSubscriberPtrOutput)
}

type BusinessServiceSubscriberPtrOutput struct{ *pulumi.OutputState }

func (BusinessServiceSubscriberPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessServiceSubscriber)(nil))
}

func (o BusinessServiceSubscriberPtrOutput) ToBusinessServiceSubscriberPtrOutput() BusinessServiceSubscriberPtrOutput {
	return o
}

func (o BusinessServiceSubscriberPtrOutput) ToBusinessServiceSubscriberPtrOutputWithContext(ctx context.Context) BusinessServiceSubscriberPtrOutput {
	return o
}

func (o BusinessServiceSubscriberPtrOutput) Elem() BusinessServiceSubscriberOutput {
	return o.ApplyT(func(v *BusinessServiceSubscriber) BusinessServiceSubscriber {
		if v != nil {
			return *v
		}
		var ret BusinessServiceSubscriber
		return ret
	}).(BusinessServiceSubscriberOutput)
}

type BusinessServiceSubscriberArrayOutput struct{ *pulumi.OutputState }

func (BusinessServiceSubscriberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]BusinessServiceSubscriber)(nil))
}

func (o BusinessServiceSubscriberArrayOutput) ToBusinessServiceSubscriberArrayOutput() BusinessServiceSubscriberArrayOutput {
	return o
}

func (o BusinessServiceSubscriberArrayOutput) ToBusinessServiceSubscriberArrayOutputWithContext(ctx context.Context) BusinessServiceSubscriberArrayOutput {
	return o
}

func (o BusinessServiceSubscriberArrayOutput) Index(i pulumi.IntInput) BusinessServiceSubscriberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) BusinessServiceSubscriber {
		return vs[0].([]BusinessServiceSubscriber)[vs[1].(int)]
	}).(BusinessServiceSubscriberOutput)
}

type BusinessServiceSubscriberMapOutput struct{ *pulumi.OutputState }

func (BusinessServiceSubscriberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]BusinessServiceSubscriber)(nil))
}

func (o BusinessServiceSubscriberMapOutput) ToBusinessServiceSubscriberMapOutput() BusinessServiceSubscriberMapOutput {
	return o
}

func (o BusinessServiceSubscriberMapOutput) ToBusinessServiceSubscriberMapOutputWithContext(ctx context.Context) BusinessServiceSubscriberMapOutput {
	return o
}

func (o BusinessServiceSubscriberMapOutput) MapIndex(k pulumi.StringInput) BusinessServiceSubscriberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) BusinessServiceSubscriber {
		return vs[0].(map[string]BusinessServiceSubscriber)[vs[1].(string)]
	}).(BusinessServiceSubscriberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessServiceSubscriberInput)(nil)).Elem(), &BusinessServiceSubscriber{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessServiceSubscriberPtrInput)(nil)).Elem(), &BusinessServiceSubscriber{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessServiceSubscriberArrayInput)(nil)).Elem(), BusinessServiceSubscriberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessServiceSubscriberMapInput)(nil)).Elem(), BusinessServiceSubscriberMap{})
	pulumi.RegisterOutputType(BusinessServiceSubscriberOutput{})
	pulumi.RegisterOutputType(BusinessServiceSubscriberPtrOutput{})
	pulumi.RegisterOutputType(BusinessServiceSubscriberArrayOutput{})
	pulumi.RegisterOutputType(BusinessServiceSubscriberMapOutput{})
}
