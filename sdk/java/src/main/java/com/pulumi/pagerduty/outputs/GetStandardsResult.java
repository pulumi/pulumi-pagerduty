// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.GetStandardsStandard;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStandardsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Specifies the type of resource to which the standard applies.
     * 
     */
    private @Nullable String resourceType;
    /**
     * @return The list of standards defined.
     * 
     */
    private List<GetStandardsStandard> standards;

    private GetStandardsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies the type of resource to which the standard applies.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * @return The list of standards defined.
     * 
     */
    public List<GetStandardsStandard> standards() {
        return this.standards;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStandardsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String resourceType;
        private List<GetStandardsStandard> standards;
        public Builder() {}
        public Builder(GetStandardsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.resourceType = defaults.resourceType;
    	      this.standards = defaults.standards;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStandardsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(@Nullable String resourceType) {

            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder standards(List<GetStandardsStandard> standards) {
            if (standards == null) {
              throw new MissingRequiredPropertyException("GetStandardsResult", "standards");
            }
            this.standards = standards;
            return this;
        }
        public Builder standards(GetStandardsStandard... standards) {
            return standards(List.of(standards));
        }
        public GetStandardsResult build() {
            final var _resultValue = new GetStandardsResult();
            _resultValue.id = id;
            _resultValue.resourceType = resourceType;
            _resultValue.standards = standards;
            return _resultValue;
        }
    }
}