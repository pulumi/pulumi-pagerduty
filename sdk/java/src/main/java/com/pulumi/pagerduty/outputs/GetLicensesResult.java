// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.GetLicensesLicense;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLicensesResult {
    /**
     * @return ID of the license
     * 
     */
    private @Nullable String id;
    /**
     * @return The list of purchased licenses.
     * 
     */
    private List<GetLicensesLicense> licenses;

    private GetLicensesResult() {}
    /**
     * @return ID of the license
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The list of purchased licenses.
     * 
     */
    public List<GetLicensesLicense> licenses() {
        return this.licenses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private List<GetLicensesLicense> licenses;
        public Builder() {}
        public Builder(GetLicensesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.licenses = defaults.licenses;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder licenses(List<GetLicensesLicense> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(GetLicensesLicense... licenses) {
            return licenses(List.of(licenses));
        }
        public GetLicensesResult build() {
            final var o = new GetLicensesResult();
            o.id = id;
            o.licenses = licenses;
            return o;
        }
    }
}