// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * An Automation Actions [runner](https://developer.pagerduty.com/api-reference/d78999fb7e863-create-an-automation-action-runner) is the method for how actions are executed. This can be done locally using an installed runner agent or as a connection to a PD Runbook Automation instance.
 *
 * > Only Runbook Automation (runbook) runners can be created.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pagerduty from "@pulumi/pagerduty";
 *
 * const config = new pulumi.Config();
 * const RUNBOOK_API_KEY = config.require("RUNBOOK_API_KEY");
 * const example = new pagerduty.AutomationActionsRunner("example", {
 *     name: "Runner created via TF",
 *     description: "Description of the Runner created via TF",
 *     runnerType: "runbook",
 *     runbookBaseUri: "rdcat.stg",
 *     runbookApiKey: RUNBOOK_API_KEY,
 * });
 * ```
 *
 * ## Import
 *
 * -> In the example below the `runbook_api_key` attribute has been omitted to avoid resource replacement after the import.
 *
 * Runners can be imported using the `id`, e.g.
 *
 * resource "pagerduty_automation_actions_runner" "example" {
 *
 *   name = "Runner created via TF"
 *
 *   description = "Description of the Runner created via TF"
 *
 *   runner_type = "runbook"
 *
 *   runbook_base_uri = "rdcat.stg"
 *
 * }
 *
 * ```sh
 * $ pulumi import pagerduty:index/automationActionsRunner:AutomationActionsRunner example 01DER7CUUBF7TH4116K0M4WKPU
 * ```
 */
export class AutomationActionsRunner extends pulumi.CustomResource {
    /**
     * Get an existing AutomationActionsRunner resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AutomationActionsRunnerState, opts?: pulumi.CustomResourceOptions): AutomationActionsRunner {
        return new AutomationActionsRunner(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pagerduty:index/automationActionsRunner:AutomationActionsRunner';

    /**
     * Returns true if the given object is an instance of AutomationActionsRunner.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AutomationActionsRunner {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AutomationActionsRunner.__pulumiType;
    }

    /**
     * The time runner was created. Represented as an ISO 8601 timestamp.
     */
    public /*out*/ readonly creationTime!: pulumi.Output<string>;
    /**
     * The description of the runner. Max length is 1024 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     */
    public readonly lastSeen!: pulumi.Output<string>;
    /**
     * The name of the runner. Max length is 255 characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The unique User API Token created in Runbook Automation.
     */
    public readonly runbookApiKey!: pulumi.Output<string | undefined>;
    /**
     * The subdomain for your Runbook Automation Instance.
     */
    public readonly runbookBaseUri!: pulumi.Output<string | undefined>;
    /**
     * The type of runner. The only allowed values is `runbook`.
     */
    public readonly runnerType!: pulumi.Output<string>;
    /**
     * The type of object. The value returned will be `runner`.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a AutomationActionsRunner resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AutomationActionsRunnerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AutomationActionsRunnerArgs | AutomationActionsRunnerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AutomationActionsRunnerState | undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["lastSeen"] = state ? state.lastSeen : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["runbookApiKey"] = state ? state.runbookApiKey : undefined;
            resourceInputs["runbookBaseUri"] = state ? state.runbookBaseUri : undefined;
            resourceInputs["runnerType"] = state ? state.runnerType : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AutomationActionsRunnerArgs | undefined;
            if ((!args || args.runnerType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'runnerType'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["lastSeen"] = args ? args.lastSeen : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["runbookApiKey"] = args?.runbookApiKey ? pulumi.secret(args.runbookApiKey) : undefined;
            resourceInputs["runbookBaseUri"] = args ? args.runbookBaseUri : undefined;
            resourceInputs["runnerType"] = args ? args.runnerType : undefined;
            resourceInputs["creationTime"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["runbookApiKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AutomationActionsRunner.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AutomationActionsRunner resources.
 */
export interface AutomationActionsRunnerState {
    /**
     * The time runner was created. Represented as an ISO 8601 timestamp.
     */
    creationTime?: pulumi.Input<string>;
    /**
     * The description of the runner. Max length is 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     */
    lastSeen?: pulumi.Input<string>;
    /**
     * The name of the runner. Max length is 255 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique User API Token created in Runbook Automation.
     */
    runbookApiKey?: pulumi.Input<string>;
    /**
     * The subdomain for your Runbook Automation Instance.
     */
    runbookBaseUri?: pulumi.Input<string>;
    /**
     * The type of runner. The only allowed values is `runbook`.
     */
    runnerType?: pulumi.Input<string>;
    /**
     * The type of object. The value returned will be `runner`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AutomationActionsRunner resource.
 */
export interface AutomationActionsRunnerArgs {
    /**
     * The description of the runner. Max length is 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * (Optional) The last time runner has been seen. Represented as an ISO 8601 timestamp.
     */
    lastSeen?: pulumi.Input<string>;
    /**
     * The name of the runner. Max length is 255 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique User API Token created in Runbook Automation.
     */
    runbookApiKey?: pulumi.Input<string>;
    /**
     * The subdomain for your Runbook Automation Instance.
     */
    runbookBaseUri?: pulumi.Input<string>;
    /**
     * The type of runner. The only allowed values is `runbook`.
     */
    runnerType: pulumi.Input<string>;
}
