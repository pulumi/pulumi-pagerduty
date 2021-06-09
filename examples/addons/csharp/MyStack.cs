using Pulumi;
using Pagerduty = Pulumi.Pagerduty;

class MyStack : Stack
{
    public MyStack()
    {
        var addon = new Pagerduty.Addon("example", new Pagerduty.AddonArgs
        {
            Src = "https://intranet.example.com/status-dotnet",
        });

        this.AddonName = addon.Name;
    }

    [Output] public Output<string> AddonName { get; set; }
}
