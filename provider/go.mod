module github.com/pulumi/pulumi-pagerduty/provider

go 1.16

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/PagerDuty/terraform-provider-pagerduty => github.com/pulumi/terraform-provider-pagerduty v1.9.6-0.20210330170452-e51991a8c208
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
)

require (
	github.com/PagerDuty/terraform-provider-pagerduty v0.0.0
	github.com/hashicorp/terraform-plugin-sdk v1.9.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.22.1
	github.com/pulumi/pulumi/sdk/v2 v2.22.1-0.20210310211618-1f16423ede4c
)
