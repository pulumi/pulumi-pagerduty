CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to v1.10.0 of the PagerDuty Terraform Provider

---

## 2.0.2 (2021-06-28)
* Upgrade to v1.9.9 of the PagerDuty Terraform Provider

## 2.0.1 (2021-06-14)
* Upgrade to v1.9.7 of the PagerDuty Terraform Provider

## 2.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.
* Upgrade `description` of the following resources to be "Managed by Pulumi":
  - `pagerduty.BusinessService`
  - `pagerduty.EscalationPolicy`
  - `pagerduty.MaintenanceWindow`
  - `pagerduty.Schedule`
  - `pagerduty.Service`
  - `pagerduty.Team`
  - `pagerduty.User`
  - `pagerduty.ResponsePlay`

## 1.5.0 (2021-04-12)
* Upgrade to v1.9.6 of the PagerDuty Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.23.0

## 1.4.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 1.4.0 (2021-03-15)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 1.3.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 1.3.0 (2021-02-01)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 1.2.2 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 1.2.1 (2021-01-05)
* Upgrade to pulumi-terraform-bridge v2.13.2
  * This adds support for import specific examples in documentation

## 1.2.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 1.1.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 1.0.3 (2020-06-10)
* Switch to GitHub actions for build

## 1.0.2 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 1.0.1 (2020-05-26)
* Fixup python version number

## 1.0.0 (2020-05-26)
* Initial release of the provider against v1.7.1 of the Pagerduty Terraform Provider
