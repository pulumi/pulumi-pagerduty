module github.com/pulumi/pulumi-pagerduty/provider/v3

go 1.16

replace (
	github.com/PagerDuty/terraform-provider-pagerduty => github.com/pulumi/terraform-provider-pagerduty v1.9.6-0.20211220151652-349f07a7428e
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210629210550-59d24255d71f
)

require (
	github.com/PagerDuty/terraform-provider-pagerduty v0.0.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.18.0
	github.com/pulumi/pulumi/sdk/v3 v3.23.2
)
