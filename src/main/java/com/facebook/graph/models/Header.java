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
 * This is a model class for Header type.
 */
public class Header {
    private HeaderTypeEnum type;
    private String text;
    private Video video;
    private Image image;
    private Document document;

    /**
     * Default constructor.
     */
    public Header() {
    }

    /**
     * Initialization constructor.
     * @param  type  HeaderTypeEnum value for type.
     * @param  text  String value for text.
     * @param  video  Video value for video.
     * @param  image  Image value for image.
     * @param  document  Document value for document.
     */
    public Header(
            HeaderTypeEnum type,
            String text,
            Video video,
            Image image,
            Document document) {
        this.type = type;
        this.text = text;
        this.video = video;
        this.image = image;
        this.document = document;
    }

    /**
     * Getter for Type.
     * The header type you would like to use.
     * @return Returns the HeaderTypeEnum
     */
    @JsonGetter("type")
    public HeaderTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The header type you would like to use.
     * @param type Value for HeaderTypeEnum
     */
    @JsonSetter("type")
    public void setType(HeaderTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Text.
     * Required if type is set to text. Text for the header. Formatting allows emojis, but not
     * markdown.
     * @return Returns the String
     */
    @JsonGetter("text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Setter for Text.
     * Required if type is set to text. Text for the header. Formatting allows emojis, but not
     * markdown.
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for Video.
     * Required if type is set to video. Contains the media object for this video.
     * @return Returns the Video
     */
    @JsonGetter("video")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Video getVideo() {
        return video;
    }

    /**
     * Setter for Video.
     * Required if type is set to video. Contains the media object for this video.
     * @param video Value for Video
     */
    @JsonSetter("video")
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * Getter for Image.
     * Required if type is set to image. Contains the media object for this image.
     * @return Returns the Image
     */
    @JsonGetter("image")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Image getImage() {
        return image;
    }

    /**
     * Setter for Image.
     * Required if type is set to image. Contains the media object for this image.
     * @param image Value for Image
     */
    @JsonSetter("image")
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * Getter for Document.
     * Required if type is set to document. Contains the media object for this document.
     * @return Returns the Document
     */
    @JsonGetter("document")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Document getDocument() {
        return document;
    }

    /**
     * Setter for Document.
     * Required if type is set to document. Contains the media object for this document.
     * @param document Value for Document
     */
    @JsonSetter("document")
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * Converts this Header into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Header [" + "type=" + type + ", text=" + text + ", video=" + video + ", image="
                + image + ", document=" + document + "]";
    }

    /**
     * Builds a new {@link Header.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Header.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type)
                .text(getText())
                .video(getVideo())
                .image(getImage())
                .document(getDocument());
        return builder;
    }

    /**
     * Class to build instances of {@link Header}.
     */
    public static class Builder {
        private HeaderTypeEnum type;
        private String text;
        private Video video;
        private Image image;
        private Document document;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  HeaderTypeEnum value for type.
         */
        public Builder(HeaderTypeEnum type) {
            this.type = type;
        }

        /**
         * Setter for type.
         * @param  type  HeaderTypeEnum value for type.
         * @return Builder
         */
        public Builder type(HeaderTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for text.
         * @param  text  String value for text.
         * @return Builder
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Setter for video.
         * @param  video  Video value for video.
         * @return Builder
         */
        public Builder video(Video video) {
            this.video = video;
            return this;
        }

        /**
         * Setter for image.
         * @param  image  Image value for image.
         * @return Builder
         */
        public Builder image(Image image) {
            this.image = image;
            return this;
        }

        /**
         * Setter for document.
         * @param  document  Document value for document.
         * @return Builder
         */
        public Builder document(Document document) {
            this.document = document;
            return this;
        }

        /**
         * Builds a new {@link Header} object using the set fields.
         * @return {@link Header}
         */
        public Header build() {
            return new Header(type, text, video, image, document);
        }
    }
}
