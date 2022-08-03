// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pagerduty.outputs.ServiceIntegrationEmailParserMatchPredicatePredicate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIntegrationEmailParserMatchPredicate {
    private final @Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicate> predicates;
    /**
     * @return Can be `any` or `all`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ServiceIntegrationEmailParserMatchPredicate(
        @CustomType.Parameter("predicates") @Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicate> predicates,
        @CustomType.Parameter("type") String type) {
        this.predicates = predicates;
        this.type = type;
    }

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

    public static final class Builder {
        private @Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicate> predicates;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIntegrationEmailParserMatchPredicate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predicates = defaults.predicates;
    	      this.type = defaults.type;
        }

        public Builder predicates(@Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicate> predicates) {
            this.predicates = predicates;
            return this;
        }
        public Builder predicates(ServiceIntegrationEmailParserMatchPredicatePredicate... predicates) {
            return predicates(List.of(predicates));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ServiceIntegrationEmailParserMatchPredicate build() {
            return new ServiceIntegrationEmailParserMatchPredicate(predicates, type);
        }
    }
}
