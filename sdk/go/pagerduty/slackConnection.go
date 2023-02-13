// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pagerduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A [slack connection](https://developer.pagerduty.com/api-reference/YXBpOjExMjA5NTQ0-pager-duty-slack-integration-api) allows you to connect a workspace in Slack to a PagerDuty service or team which allows you to acknowledge and resolve PagerDuty incidents from the Slack user interface.
//
// **NOTES for using this resource:**
// * To first use this resource you will need to [map your PagerDuty account to a valid Slack Workspace](https://support.pagerduty.com/docs/slack-integration-guide#integration-walkthrough). *This can only be done through the PagerDuty UI.*
// * This resource requires a PagerDuty [user-level API key](https://support.pagerduty.com/docs/generating-api-keys#section-generating-a-personal-rest-api-key). This can be set as the `userToken` on the provider tag or as the `PAGERDUTY_USER_TOKEN` environment variable.
// * This resource is for configuring Slack V2 Next Generation connections. If you configured your Slack integration (V1 or V2) prior to August 10, 2021, you may migrate to the Slack V2 Next Generation update using this [migration instructions](https://support.pagerduty.com/docs/slack-integration-guide#migrate-to-slack-v2-next-generation), but if you configured your Slack integration after that date, you will have access to the update out of the box.
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			fooTeam, err := pagerduty.NewTeam(ctx, "fooTeam", nil)
//			if err != nil {
//				return err
//			}
//			p1, err := pagerduty.GetPriority(ctx, &pagerduty.GetPriorityArgs{
//				Name: "P1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = pagerduty.NewSlackConnection(ctx, "fooSlackConnection", &pagerduty.SlackConnectionArgs{
//				SourceId:         fooTeam.ID(),
//				SourceType:       pulumi.String("team_reference"),
//				WorkspaceId:      pulumi.String("T02A123LV1A"),
//				ChannelId:        pulumi.String("C02CABCDAC9"),
//				NotificationType: pulumi.String("responder"),
//				Configs: pagerduty.SlackConnectionConfigArray{
//					&pagerduty.SlackConnectionConfigArgs{
//						Events: pulumi.StringArray{
//							pulumi.String("incident.triggered"),
//							pulumi.String("incident.acknowledged"),
//							pulumi.String("incident.escalated"),
//							pulumi.String("incident.resolved"),
//							pulumi.String("incident.reassigned"),
//							pulumi.String("incident.annotated"),
//							pulumi.String("incident.unacknowledged"),
//							pulumi.String("incident.delegated"),
//							pulumi.String("incident.priority_updated"),
//							pulumi.String("incident.responder.added"),
//							pulumi.String("incident.responder.replied"),
//							pulumi.String("incident.status_update_published"),
//							pulumi.String("incident.reopened"),
//						},
//						Priorities: pulumi.StringArray{
//							*pulumi.String(p1.Id),
//						},
//					},
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
// Slack connections can be imported using the related `workspace` ID and the `slack_connection` ID separated by a dot, e.g.
//
// ```sh
//
//	$ pulumi import pagerduty:index/slackConnection:SlackConnection main T02A123LV1A.PUABCDL
//
// ```
type SlackConnection struct {
	pulumi.CustomResourceState

	// The ID of a Slack channel in the workspace.
	ChannelId pulumi.StringOutput `pulumi:"channelId"`
	// Name of the Slack channel in Slack connection.
	ChannelName pulumi.StringOutput `pulumi:"channelName"`
	// Configuration options for the Slack connection that provide options to filter events.
	Configs SlackConnectionConfigArrayOutput `pulumi:"configs"`
	// Type of notification. Either `responder` or `stakeholder`.
	NotificationType pulumi.StringOutput `pulumi:"notificationType"`
	// The ID of the source in PagerDuty. Valid sources are services or teams.
	SourceId pulumi.StringOutput `pulumi:"sourceId"`
	// Name of the source (team or service) in Slack connection.
	SourceName pulumi.StringOutput `pulumi:"sourceName"`
	// The type of the source. Either `teamReference` or `serviceReference`.
	SourceType pulumi.StringOutput `pulumi:"sourceType"`
	// The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
}

// NewSlackConnection registers a new resource with the given unique name, arguments, and options.
func NewSlackConnection(ctx *pulumi.Context,
	name string, args *SlackConnectionArgs, opts ...pulumi.ResourceOption) (*SlackConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ChannelId == nil {
		return nil, errors.New("invalid value for required argument 'ChannelId'")
	}
	if args.Configs == nil {
		return nil, errors.New("invalid value for required argument 'Configs'")
	}
	if args.NotificationType == nil {
		return nil, errors.New("invalid value for required argument 'NotificationType'")
	}
	if args.SourceId == nil {
		return nil, errors.New("invalid value for required argument 'SourceId'")
	}
	if args.SourceType == nil {
		return nil, errors.New("invalid value for required argument 'SourceType'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	var resource SlackConnection
	err := ctx.RegisterResource("pagerduty:index/slackConnection:SlackConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSlackConnection gets an existing SlackConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSlackConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SlackConnectionState, opts ...pulumi.ResourceOption) (*SlackConnection, error) {
	var resource SlackConnection
	err := ctx.ReadResource("pagerduty:index/slackConnection:SlackConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SlackConnection resources.
type slackConnectionState struct {
	// The ID of a Slack channel in the workspace.
	ChannelId *string `pulumi:"channelId"`
	// Name of the Slack channel in Slack connection.
	ChannelName *string `pulumi:"channelName"`
	// Configuration options for the Slack connection that provide options to filter events.
	Configs []SlackConnectionConfig `pulumi:"configs"`
	// Type of notification. Either `responder` or `stakeholder`.
	NotificationType *string `pulumi:"notificationType"`
	// The ID of the source in PagerDuty. Valid sources are services or teams.
	SourceId *string `pulumi:"sourceId"`
	// Name of the source (team or service) in Slack connection.
	SourceName *string `pulumi:"sourceName"`
	// The type of the source. Either `teamReference` or `serviceReference`.
	SourceType *string `pulumi:"sourceType"`
	// The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
	WorkspaceId *string `pulumi:"workspaceId"`
}

type SlackConnectionState struct {
	// The ID of a Slack channel in the workspace.
	ChannelId pulumi.StringPtrInput
	// Name of the Slack channel in Slack connection.
	ChannelName pulumi.StringPtrInput
	// Configuration options for the Slack connection that provide options to filter events.
	Configs SlackConnectionConfigArrayInput
	// Type of notification. Either `responder` or `stakeholder`.
	NotificationType pulumi.StringPtrInput
	// The ID of the source in PagerDuty. Valid sources are services or teams.
	SourceId pulumi.StringPtrInput
	// Name of the source (team or service) in Slack connection.
	SourceName pulumi.StringPtrInput
	// The type of the source. Either `teamReference` or `serviceReference`.
	SourceType pulumi.StringPtrInput
	// The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
	WorkspaceId pulumi.StringPtrInput
}

func (SlackConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*slackConnectionState)(nil)).Elem()
}

type slackConnectionArgs struct {
	// The ID of a Slack channel in the workspace.
	ChannelId string `pulumi:"channelId"`
	// Configuration options for the Slack connection that provide options to filter events.
	Configs []SlackConnectionConfig `pulumi:"configs"`
	// Type of notification. Either `responder` or `stakeholder`.
	NotificationType string `pulumi:"notificationType"`
	// The ID of the source in PagerDuty. Valid sources are services or teams.
	SourceId string `pulumi:"sourceId"`
	// The type of the source. Either `teamReference` or `serviceReference`.
	SourceType string `pulumi:"sourceType"`
	// The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
	WorkspaceId string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a SlackConnection resource.
type SlackConnectionArgs struct {
	// The ID of a Slack channel in the workspace.
	ChannelId pulumi.StringInput
	// Configuration options for the Slack connection that provide options to filter events.
	Configs SlackConnectionConfigArrayInput
	// Type of notification. Either `responder` or `stakeholder`.
	NotificationType pulumi.StringInput
	// The ID of the source in PagerDuty. Valid sources are services or teams.
	SourceId pulumi.StringInput
	// The type of the source. Either `teamReference` or `serviceReference`.
	SourceType pulumi.StringInput
	// The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
	WorkspaceId pulumi.StringInput
}

func (SlackConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*slackConnectionArgs)(nil)).Elem()
}

type SlackConnectionInput interface {
	pulumi.Input

	ToSlackConnectionOutput() SlackConnectionOutput
	ToSlackConnectionOutputWithContext(ctx context.Context) SlackConnectionOutput
}

func (*SlackConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**SlackConnection)(nil)).Elem()
}

func (i *SlackConnection) ToSlackConnectionOutput() SlackConnectionOutput {
	return i.ToSlackConnectionOutputWithContext(context.Background())
}

func (i *SlackConnection) ToSlackConnectionOutputWithContext(ctx context.Context) SlackConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SlackConnectionOutput)
}

// SlackConnectionArrayInput is an input type that accepts SlackConnectionArray and SlackConnectionArrayOutput values.
// You can construct a concrete instance of `SlackConnectionArrayInput` via:
//
//	SlackConnectionArray{ SlackConnectionArgs{...} }
type SlackConnectionArrayInput interface {
	pulumi.Input

	ToSlackConnectionArrayOutput() SlackConnectionArrayOutput
	ToSlackConnectionArrayOutputWithContext(context.Context) SlackConnectionArrayOutput
}

type SlackConnectionArray []SlackConnectionInput

func (SlackConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SlackConnection)(nil)).Elem()
}

func (i SlackConnectionArray) ToSlackConnectionArrayOutput() SlackConnectionArrayOutput {
	return i.ToSlackConnectionArrayOutputWithContext(context.Background())
}

func (i SlackConnectionArray) ToSlackConnectionArrayOutputWithContext(ctx context.Context) SlackConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SlackConnectionArrayOutput)
}

// SlackConnectionMapInput is an input type that accepts SlackConnectionMap and SlackConnectionMapOutput values.
// You can construct a concrete instance of `SlackConnectionMapInput` via:
//
//	SlackConnectionMap{ "key": SlackConnectionArgs{...} }
type SlackConnectionMapInput interface {
	pulumi.Input

	ToSlackConnectionMapOutput() SlackConnectionMapOutput
	ToSlackConnectionMapOutputWithContext(context.Context) SlackConnectionMapOutput
}

type SlackConnectionMap map[string]SlackConnectionInput

func (SlackConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SlackConnection)(nil)).Elem()
}

func (i SlackConnectionMap) ToSlackConnectionMapOutput() SlackConnectionMapOutput {
	return i.ToSlackConnectionMapOutputWithContext(context.Background())
}

func (i SlackConnectionMap) ToSlackConnectionMapOutputWithContext(ctx context.Context) SlackConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SlackConnectionMapOutput)
}

type SlackConnectionOutput struct{ *pulumi.OutputState }

func (SlackConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SlackConnection)(nil)).Elem()
}

func (o SlackConnectionOutput) ToSlackConnectionOutput() SlackConnectionOutput {
	return o
}

func (o SlackConnectionOutput) ToSlackConnectionOutputWithContext(ctx context.Context) SlackConnectionOutput {
	return o
}

// The ID of a Slack channel in the workspace.
func (o SlackConnectionOutput) ChannelId() pulumi.StringOutput {
	return o.ApplyT(func(v *SlackConnection) pulumi.StringOutput { return v.ChannelId }).(pulumi.StringOutput)
}

// Name of the Slack channel in Slack connection.
func (o SlackConnectionOutput) ChannelName() pulumi.StringOutput {
	return o.ApplyT(func(v *SlackConnection) pulumi.StringOutput { return v.ChannelName }).(pulumi.StringOutput)
}

// Configuration options for the Slack connection that provide options to filter events.
func (o SlackConnectionOutput) Configs() SlackConnectionConfigArrayOutput {
	return o.ApplyT(func(v *SlackConnection) SlackConnectionConfigArrayOutput { return v.Configs }).(SlackConnectionConfigArrayOutput)
}

// Type of notification. Either `responder` or `stakeholder`.
func (o SlackConnectionOutput) NotificationType() pulumi.StringOutput {
	return o.ApplyT(func(v *SlackConnection) pulumi.StringOutput { return v.NotificationType }).(pulumi.StringOutput)
}

// The ID of the source in PagerDuty. Valid sources are services or teams.
func (o SlackConnectionOutput) SourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SlackConnection) pulumi.StringOutput { return v.SourceId }).(pulumi.StringOutput)
}

// Name of the source (team or service) in Slack connection.
func (o SlackConnectionOutput) SourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *SlackConnection) pulumi.StringOutput { return v.SourceName }).(pulumi.StringOutput)
}

// The type of the source. Either `teamReference` or `serviceReference`.
func (o SlackConnectionOutput) SourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *SlackConnection) pulumi.StringOutput { return v.SourceType }).(pulumi.StringOutput)
}

// The ID of the connected Slack workspace. Can also be defined by the `SLACK_CONNECTION_WORKSPACE_ID` environment variable.
func (o SlackConnectionOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SlackConnection) pulumi.StringOutput { return v.WorkspaceId }).(pulumi.StringOutput)
}

type SlackConnectionArrayOutput struct{ *pulumi.OutputState }

func (SlackConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SlackConnection)(nil)).Elem()
}

func (o SlackConnectionArrayOutput) ToSlackConnectionArrayOutput() SlackConnectionArrayOutput {
	return o
}

func (o SlackConnectionArrayOutput) ToSlackConnectionArrayOutputWithContext(ctx context.Context) SlackConnectionArrayOutput {
	return o
}

func (o SlackConnectionArrayOutput) Index(i pulumi.IntInput) SlackConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SlackConnection {
		return vs[0].([]*SlackConnection)[vs[1].(int)]
	}).(SlackConnectionOutput)
}

type SlackConnectionMapOutput struct{ *pulumi.OutputState }

func (SlackConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SlackConnection)(nil)).Elem()
}

func (o SlackConnectionMapOutput) ToSlackConnectionMapOutput() SlackConnectionMapOutput {
	return o
}

func (o SlackConnectionMapOutput) ToSlackConnectionMapOutputWithContext(ctx context.Context) SlackConnectionMapOutput {
	return o
}

func (o SlackConnectionMapOutput) MapIndex(k pulumi.StringInput) SlackConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SlackConnection {
		return vs[0].(map[string]*SlackConnection)[vs[1].(string)]
	}).(SlackConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SlackConnectionInput)(nil)).Elem(), &SlackConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*SlackConnectionArrayInput)(nil)).Elem(), SlackConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SlackConnectionMapInput)(nil)).Elem(), SlackConnectionMap{})
	pulumi.RegisterOutputType(SlackConnectionOutput{})
	pulumi.RegisterOutputType(SlackConnectionArrayOutput{})
	pulumi.RegisterOutputType(SlackConnectionMapOutput{})
}
