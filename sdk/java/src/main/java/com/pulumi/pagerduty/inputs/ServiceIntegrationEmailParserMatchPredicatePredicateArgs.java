// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.pagerduty.inputs.ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationEmailParserMatchPredicatePredicateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationEmailParserMatchPredicatePredicateArgs Empty = new ServiceIntegrationEmailParserMatchPredicatePredicateArgs();

    /**
     * Predicate value or valid regex.
     * 
     */
    @Import(name="matcher")
    private @Nullable Output<String> matcher;

    /**
     * @return Predicate value or valid regex.
     * 
     */
    public Optional<Output<String>> matcher() {
        return Optional.ofNullable(this.matcher);
    }

    /**
     * Can be `subject`, `body` or `from_addresses`.
     * 
     */
    @Import(name="part")
    private @Nullable Output<String> part;

    /**
     * @return Can be `subject`, `body` or `from_addresses`.
     * 
     */
    public Optional<Output<String>> part() {
        return Optional.ofNullable(this.part);
    }

    @Import(name="predicates")
    private @Nullable Output<List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs>> predicates;

    public Optional<Output<List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs>>> predicates() {
        return Optional.ofNullable(this.predicates);
    }

    /**
     * Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ServiceIntegrationEmailParserMatchPredicatePredicateArgs() {}

    private ServiceIntegrationEmailParserMatchPredicatePredicateArgs(ServiceIntegrationEmailParserMatchPredicatePredicateArgs $) {
        this.matcher = $.matcher;
        this.part = $.part;
        this.predicates = $.predicates;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationEmailParserMatchPredicatePredicateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationEmailParserMatchPredicatePredicateArgs $;

        public Builder() {
            $ = new ServiceIntegrationEmailParserMatchPredicatePredicateArgs();
        }

        public Builder(ServiceIntegrationEmailParserMatchPredicatePredicateArgs defaults) {
            $ = new ServiceIntegrationEmailParserMatchPredicatePredicateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matcher Predicate value or valid regex.
         * 
         * @return builder
         * 
         */
        public Builder matcher(@Nullable Output<String> matcher) {
            $.matcher = matcher;
            return this;
        }

        /**
         * @param matcher Predicate value or valid regex.
         * 
         * @return builder
         * 
         */
        public Builder matcher(String matcher) {
            return matcher(Output.of(matcher));
        }

        /**
         * @param part Can be `subject`, `body` or `from_addresses`.
         * 
         * @return builder
         * 
         */
        public Builder part(@Nullable Output<String> part) {
            $.part = part;
            return this;
        }

        /**
         * @param part Can be `subject`, `body` or `from_addresses`.
         * 
         * @return builder
         * 
         */
        public Builder part(String part) {
            return part(Output.of(part));
        }

        public Builder predicates(@Nullable Output<List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs>> predicates) {
            $.predicates = predicates;
            return this;
        }

        public Builder predicates(List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs> predicates) {
            return predicates(Output.of(predicates));
        }

        public Builder predicates(ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs... predicates) {
            return predicates(List.of(predicates));
        }

        /**
         * @param type Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Can be `contains`, `exactly`, `regex` or `not`. If type is `not` predicate should contain child predicate with all parameters.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceIntegrationEmailParserMatchPredicatePredicateArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEmailParserMatchPredicatePredicateArgs", "type");
            }
            return $;
        }
    }

}
