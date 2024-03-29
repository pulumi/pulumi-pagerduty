// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.outputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIntegrationEmailParserMatchPredicatePredicate {
    /**
     * @return Predicate value or valid regex.
     * 
     */
    private @Nullable String matcher;
    /**
     * @return Can be `subject`, `body` or `from_addresses`.
     * 
     */
    private @Nullable String part;
    private @Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicate> predicates;
    /**
     * @return Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
     * 
     */
    private String type;

    private ServiceIntegrationEmailParserMatchPredicatePredicate() {}
    /**
     * @return Predicate value or valid regex.
     * 
     */
    public Optional<String> matcher() {
        return Optional.ofNullable(this.matcher);
    }
    /**
     * @return Can be `subject`, `body` or `from_addresses`.
     * 
     */
    public Optional<String> part() {
        return Optional.ofNullable(this.part);
    }
    public List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicate> predicates() {
        return this.predicates == null ? List.of() : this.predicates;
    }
    /**
     * @return Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationEmailParserMatchPredicatePredicate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String matcher;
        private @Nullable String part;
        private @Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicate> predicates;
        private String type;
        public Builder() {}
        public Builder(ServiceIntegrationEmailParserMatchPredicatePredicate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matcher = defaults.matcher;
    	      this.part = defaults.part;
    	      this.predicates = defaults.predicates;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder matcher(@Nullable String matcher) {

            this.matcher = matcher;
            return this;
        }
        @CustomType.Setter
        public Builder part(@Nullable String part) {

            this.part = part;
            return this;
        }
        @CustomType.Setter
        public Builder predicates(@Nullable List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicate> predicates) {

            this.predicates = predicates;
            return this;
        }
        public Builder predicates(ServiceIntegrationEmailParserMatchPredicatePredicatePredicate... predicates) {
            return predicates(List.of(predicates));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEmailParserMatchPredicatePredicate", "type");
            }
            this.type = type;
            return this;
        }
        public ServiceIntegrationEmailParserMatchPredicatePredicate build() {
            final var _resultValue = new ServiceIntegrationEmailParserMatchPredicatePredicate();
            _resultValue.matcher = matcher;
            _resultValue.part = part;
            _resultValue.predicates = predicates;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
