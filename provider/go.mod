module github.com/pulumi/pulumi-pagerduty/provider/v2

go 1.16

replace (
	github.com/PagerDuty/terraform-provider-pagerduty => github.com/pulumi/terraform-provider-pagerduty v1.9.6-0.20210804133034-e8cc19c42ca5
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
)

require (
	github.com/PagerDuty/terraform-provider-pagerduty v0.0.0
	github.com/hashicorp/terraform-plugin-sdk v1.9.1
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
)
