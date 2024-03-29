// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.GetStandardsResourcesScoresResource;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetStandardsResourcesScoresResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    /**
     * @return Specifies the type of resource to which the standard applies.
     * 
     */
    private String resourceType;
    /**
     * @return List of score results for each queried resource.
     * 
     */
    private List<GetStandardsResourcesScoresResource> resources;

    private GetStandardsResourcesScoresResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return Specifies the type of resource to which the standard applies.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return List of score results for each queried resource.
     * 
     */
    public List<GetStandardsResourcesScoresResource> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStandardsResourcesScoresResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private String resourceType;
        private List<GetStandardsResourcesScoresResource> resources;
        public Builder() {}
        public Builder(GetStandardsResourcesScoresResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.resourceType = defaults.resourceType;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourcesScoresResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourcesScoresResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            if (resourceType == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourcesScoresResult", "resourceType");
            }
            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<GetStandardsResourcesScoresResource> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("GetStandardsResourcesScoresResult", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(GetStandardsResourcesScoresResource... resources) {
            return resources(List.of(resources));
        }
        public GetStandardsResourcesScoresResult build() {
            final var _resultValue = new GetStandardsResourcesScoresResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.resourceType = resourceType;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}
