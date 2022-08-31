// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="apiUrlOverride")
    private @Nullable Output<String> apiUrlOverride;

    public Optional<Output<String>> apiUrlOverride() {
        return Optional.ofNullable(this.apiUrlOverride);
    }

    @Import(name="serviceRegion")
    private @Nullable Output<String> serviceRegion;

    public Optional<Output<String>> serviceRegion() {
        return Optional.ofNullable(this.serviceRegion);
    }

    @Import(name="skipCredentialsValidation", json=true)
    private @Nullable Output<Boolean> skipCredentialsValidation;

    public Optional<Output<Boolean>> skipCredentialsValidation() {
        return Optional.ofNullable(this.skipCredentialsValidation);
    }

    @Import(name="token", required=true)
    private Output<String> token;

    public Output<String> token() {
        return this.token;
    }

    @Import(name="userToken")
    private @Nullable Output<String> userToken;

    public Optional<Output<String>> userToken() {
        return Optional.ofNullable(this.userToken);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.apiUrlOverride = $.apiUrlOverride;
        this.serviceRegion = $.serviceRegion;
        this.skipCredentialsValidation = $.skipCredentialsValidation;
        this.token = $.token;
        this.userToken = $.userToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiUrlOverride(@Nullable Output<String> apiUrlOverride) {
            $.apiUrlOverride = apiUrlOverride;
            return this;
        }

        public Builder apiUrlOverride(String apiUrlOverride) {
            return apiUrlOverride(Output.of(apiUrlOverride));
        }

        public Builder serviceRegion(@Nullable Output<String> serviceRegion) {
            $.serviceRegion = serviceRegion;
            return this;
        }

        public Builder serviceRegion(String serviceRegion) {
            return serviceRegion(Output.of(serviceRegion));
        }

        public Builder skipCredentialsValidation(@Nullable Output<Boolean> skipCredentialsValidation) {
            $.skipCredentialsValidation = skipCredentialsValidation;
            return this;
        }

        public Builder skipCredentialsValidation(Boolean skipCredentialsValidation) {
            return skipCredentialsValidation(Output.of(skipCredentialsValidation));
        }

        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        public Builder token(String token) {
            return token(Output.of(token));
        }

        public Builder userToken(@Nullable Output<String> userToken) {
            $.userToken = userToken;
            return this;
        }

        public Builder userToken(String userToken) {
            return userToken(Output.of(userToken));
        }

        public ProviderArgs build() {
            $.skipCredentialsValidation = Codegen.booleanProp("skipCredentialsValidation").output().arg($.skipCredentialsValidation).def(false).getNullable();
            $.token = Objects.requireNonNull($.token, "expected parameter 'token' to be non-null");
            return $;
        }
    }

}