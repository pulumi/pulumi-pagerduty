import * as pagerduty from "@pulumi/pagerduty";

const team = new pagerduty.Team("demo-team-ts", {
    description: "Generated from examples"
});

export const teamName = team.name;
