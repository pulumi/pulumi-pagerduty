// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pagerduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TagAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagAssignmentArgs Empty = new TagAssignmentArgs();

    @Import(name="entityId", required=true)
    private Output<String> entityId;

    public Output<String> entityId() {
        return this.entityId;
    }

    @Import(name="entityType", required=true)
    private Output<String> entityType;

    public Output<String> entityType() {
        return this.entityType;
    }

    @Import(name="tagId", required=true)
    private Output<String> tagId;

    public Output<String> tagId() {
        return this.tagId;
    }

    private TagAssignmentArgs() {}

    private TagAssignmentArgs(TagAssignmentArgs $) {
        this.entityId = $.entityId;
        this.entityType = $.entityType;
        this.tagId = $.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagAssignmentArgs $;

        public Builder() {
            $ = new TagAssignmentArgs();
        }

        public Builder(TagAssignmentArgs defaults) {
            $ = new TagAssignmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityId(Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        public Builder entityType(Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        public Builder tagId(Output<String> tagId) {
            $.tagId = tagId;
            return this;
        }

        public Builder tagId(String tagId) {
            return tagId(Output.of(tagId));
        }

        public TagAssignmentArgs build() {
            if ($.entityId == null) {
                throw new MissingRequiredPropertyException("TagAssignmentArgs", "entityId");
            }
            if ($.entityType == null) {
                throw new MissingRequiredPropertyException("TagAssignmentArgs", "entityType");
            }
            if ($.tagId == null) {
                throw new MissingRequiredPropertyException("TagAssignmentArgs", "tagId");
            }
            return $;
        }
    }

}
