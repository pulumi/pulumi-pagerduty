import pulumi
import pulumi_pagerduty as pagerduty

addon = pagerduty.Addon("demo-addon-py",
                      src="https://intranet.example.com/py-status")

pulumi.export("addon_name", addon.name)
