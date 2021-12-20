// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("pagerduty");

export declare const apiUrlOverride: string | undefined;
Object.defineProperty(exports, "apiUrlOverride", {
    get() {
        return __config.get("apiUrlOverride");
    },
    enumerable: true,
});

export declare const serviceRegion: string | undefined;
Object.defineProperty(exports, "serviceRegion", {
    get() {
        return __config.get("serviceRegion");
    },
    enumerable: true,
});

export declare const skipCredentialsValidation: boolean;
Object.defineProperty(exports, "skipCredentialsValidation", {
    get() {
        return __config.getObject<boolean>("skipCredentialsValidation") ?? false;
    },
    enumerable: true,
});

export declare const token: string | undefined;
Object.defineProperty(exports, "token", {
    get() {
        return __config.get("token");
    },
    enumerable: true,
});

export declare const userToken: string | undefined;
Object.defineProperty(exports, "userToken", {
    get() {
        return __config.get("userToken");
    },
    enumerable: true,
});

