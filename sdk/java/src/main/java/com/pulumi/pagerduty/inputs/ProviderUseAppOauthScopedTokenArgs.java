// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ProviderUseAppOauthScopedTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderUseAppOauthScopedTokenArgs Empty = new ProviderUseAppOauthScopedTokenArgs();

    @Import(name="pdClientId", required=true)
    private Output<String> pdClientId;

    public Output<String> pdClientId() {
        return this.pdClientId;
    }

    @Import(name="pdClientSecret", required=true)
    private Output<String> pdClientSecret;

    public Output<String> pdClientSecret() {
        return this.pdClientSecret;
    }

    @Import(name="pdSubdomain", required=true)
    private Output<String> pdSubdomain;

    public Output<String> pdSubdomain() {
        return this.pdSubdomain;
    }

    private ProviderUseAppOauthScopedTokenArgs() {}

    private ProviderUseAppOauthScopedTokenArgs(ProviderUseAppOauthScopedTokenArgs $) {
        this.pdClientId = $.pdClientId;
        this.pdClientSecret = $.pdClientSecret;
        this.pdSubdomain = $.pdSubdomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderUseAppOauthScopedTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderUseAppOauthScopedTokenArgs $;

        public Builder() {
            $ = new ProviderUseAppOauthScopedTokenArgs();
        }

        public Builder(ProviderUseAppOauthScopedTokenArgs defaults) {
            $ = new ProviderUseAppOauthScopedTokenArgs(Objects.requireNonNull(defaults));
        }

        public Builder pdClientId(Output<String> pdClientId) {
            $.pdClientId = pdClientId;
            return this;
        }

        public Builder pdClientId(String pdClientId) {
            return pdClientId(Output.of(pdClientId));
        }

        public Builder pdClientSecret(Output<String> pdClientSecret) {
            $.pdClientSecret = pdClientSecret;
            return this;
        }

        public Builder pdClientSecret(String pdClientSecret) {
            return pdClientSecret(Output.of(pdClientSecret));
        }

        public Builder pdSubdomain(Output<String> pdSubdomain) {
            $.pdSubdomain = pdSubdomain;
            return this;
        }

        public Builder pdSubdomain(String pdSubdomain) {
            return pdSubdomain(Output.of(pdSubdomain));
        }

        public ProviderUseAppOauthScopedTokenArgs build() {
            $.pdClientId = Objects.requireNonNull($.pdClientId, "expected parameter 'pdClientId' to be non-null");
            $.pdClientSecret = Objects.requireNonNull($.pdClientSecret, "expected parameter 'pdClientSecret' to be non-null");
            $.pdSubdomain = Objects.requireNonNull($.pdSubdomain, "expected parameter 'pdSubdomain' to be non-null");
            return $;
        }
    }

}
