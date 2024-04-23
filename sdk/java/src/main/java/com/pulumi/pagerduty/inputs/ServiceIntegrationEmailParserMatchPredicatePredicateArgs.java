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

    @Import(name="matcher")
    private @Nullable Output<String> matcher;

    public Optional<Output<String>> matcher() {
        return Optional.ofNullable(this.matcher);
    }

    @Import(name="part")
    private @Nullable Output<String> part;

    public Optional<Output<String>> part() {
        return Optional.ofNullable(this.part);
    }

    @Import(name="predicates")
    private @Nullable Output<List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs>> predicates;

    public Optional<Output<List<ServiceIntegrationEmailParserMatchPredicatePredicatePredicateArgs>>> predicates() {
        return Optional.ofNullable(this.predicates);
    }

    @Import(name="type", required=true)
    private Output<String> type;

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

        public Builder matcher(@Nullable Output<String> matcher) {
            $.matcher = matcher;
            return this;
        }

        public Builder matcher(String matcher) {
            return matcher(Output.of(matcher));
        }

        public Builder part(@Nullable Output<String> part) {
            $.part = part;
            return this;
        }

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

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

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
