import * as pagerduty from "@pulumi/pagerduty";

const addon = new pagerduty.Addon("demo-addon-ts", {
    src: "https://intranet.example.com/status"
});

export const addonName = addon.name;
