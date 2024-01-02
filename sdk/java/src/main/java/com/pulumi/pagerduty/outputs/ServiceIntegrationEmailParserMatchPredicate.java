// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.ServiceIntegrationEmailParserMatchPredicatePredicate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIntegrationEmailParserMatchPredicate {
    private @Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicate> predicates;
    /**
     * @return Can be `any` or `all`.
     * 
     */
    private String type;

    private ServiceIntegrationEmailParserMatchPredicate() {}
    public List<ServiceIntegrationEmailParserMatchPredicatePredicate> predicates() {
        return this.predicates == null ? List.of() : this.predicates;
    }
    /**
     * @return Can be `any` or `all`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationEmailParserMatchPredicate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicate> predicates;
        private String type;
        public Builder() {}
        public Builder(ServiceIntegrationEmailParserMatchPredicate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predicates = defaults.predicates;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder predicates(@Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicate> predicates) {

            this.predicates = predicates;
            return this;
        }
        public Builder predicates(ServiceIntegrationEmailParserMatchPredicatePredicate... predicates) {
            return predicates(List.of(predicates));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEmailParserMatchPredicate", "type");
            }
            this.type = type;
            return this;
        }
        public ServiceIntegrationEmailParserMatchPredicate build() {
            final var _resultValue = new ServiceIntegrationEmailParserMatchPredicate();
            _resultValue.predicates = predicates;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
