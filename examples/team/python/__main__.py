import pulumi
import pulumi_pagerduty as pagerduty

team = pagerduty.Team("demo-team-py",
                      description="Generated from examples")

pulumi.export("name", team.name)
