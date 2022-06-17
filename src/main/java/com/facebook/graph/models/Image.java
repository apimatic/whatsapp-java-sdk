/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Image type.
 */
public class Image {
    private String id;
    private String link;
    private String caption;

    /**
     * Default constructor.
     */
    public Image() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  link  String value for link.
     * @param  caption  String value for caption.
     */
    public Image(
            String id,
            String link,
            String caption) {
        this.id = id;
        this.link = link;
        this.caption = caption;
    }

    /**
     * Getter for Id.
     * The media object ID. Required when you are not using a link.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The media object ID. Required when you are not using a link.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Link.
     * The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Required when
     * you are not using an uploaded media ID.
     * @return Returns the String
     */
    @JsonGetter("link")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLink() {
        return link;
    }

    /**
     * Setter for Link.
     * The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Required when
     * you are not using an uploaded media ID.
     * @param link Value for String
     */
    @JsonSetter("link")
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Getter for Caption.
     * Describes the specified image media.
     * @return Returns the String
     */
    @JsonGetter("caption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCaption() {
        return caption;
    }

    /**
     * Setter for Caption.
     * Describes the specified image media.
     * @param caption Value for String
     */
    @JsonSetter("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Converts this Image into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Image [" + "id=" + id + ", link=" + link + ", caption=" + caption + "]";
    }

    /**
     * Builds a new {@link Image.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Image.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .link(getLink())
                .caption(getCaption());
        return builder;
    }

    /**
     * Class to build instances of {@link Image}.
     */
    public static class Builder {
        private String id;
        private String link;
        private String caption;



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
         * Setter for link.
         * @param  link  String value for link.
         * @return Builder
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * Setter for caption.
         * @param  caption  String value for caption.
         * @return Builder
         */
        public Builder caption(String caption) {
            this.caption = caption;
            return this;
        }

        /**
         * Builds a new {@link Image} object using the set fields.
         * @return {@link Image}
         */
        public Image build() {
            return new Image(id, link, caption);
        }
    }
}
