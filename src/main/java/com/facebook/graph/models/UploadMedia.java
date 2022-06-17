/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UploadMedia type.
 */
public class UploadMedia {
    private String id;

    /**
     * Default constructor.
     */
    public UploadMedia() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     */
    public UploadMedia(
            String id) {
        this.id = id;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this UploadMedia into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UploadMedia [" + "id=" + id + "]";
    }

    /**
     * Builds a new {@link UploadMedia.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UploadMedia.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id);
        return builder;
    }

    /**
     * Class to build instances of {@link UploadMedia}.
     */
    public static class Builder {
        private String id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         */
        public Builder(String id) {
            this.id = id;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link UploadMedia} object using the set fields.
         * @return {@link UploadMedia}
         */
        public UploadMedia build() {
            return new UploadMedia(id);
        }
    }
}