package main

import (
	"github.com/pulumi/pulumi-pagerduty/sdk/v3/go/pagerduty"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		addon, err := pagerduty.NewAddon(ctx, "demo-addon-go", &pagerduty.AddonArgs{
			Src: pulumi.String("https://intranet.example.com/status-go"),
		})
		if err != nil {
			return err
		}

		ctx.Export("addonName", addon.Name)

		return nil
	})
}
