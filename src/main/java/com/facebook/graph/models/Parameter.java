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
 * This is a model class for Parameter type.
 */
public class Parameter {
    private ParameterTypeEnum type;
    private String text;
    private Currency currency;
    private DateTimeObject dateTime;
    private Image image;
    private Document document;
    private Video video;

    /**
     * Default constructor.
     */
    public Parameter() {
    }

    /**
     * Initialization constructor.
     * @param  type  ParameterTypeEnum value for type.
     * @param  text  String value for text.
     * @param  currency  Currency value for currency.
     * @param  dateTime  DateTimeObject value for dateTime.
     * @param  image  Image value for image.
     * @param  document  Document value for document.
     * @param  video  Video value for video.
     */
    public Parameter(
            ParameterTypeEnum type,
            String text,
            Currency currency,
            DateTimeObject dateTime,
            Image image,
            Document document,
            Video video) {
        this.type = type;
        this.text = text;
        this.currency = currency;
        this.dateTime = dateTime;
        this.image = image;
        this.document = document;
        this.video = video;
    }

    /**
     * Getter for Type.
     * Describes the parameter type. For text-based templates, the only supported parameter types
     * are text, currency, date_time.
     * @return Returns the ParameterTypeEnum
     */
    @JsonGetter("type")
    public ParameterTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Describes the parameter type. For text-based templates, the only supported parameter types
     * are text, currency, date_time.
     * @param type Value for ParameterTypeEnum
     */
    @JsonSetter("type")
    public void setType(ParameterTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Text.
     * Required when type=text. The message’s text. For the header component, the character limit is
     * 60 characters. For the body component, the character limit is 1024 characters.
     * @return Returns the String
     */
    @JsonGetter("text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Setter for Text.
     * Required when type=text. The message’s text. For the header component, the character limit is
     * 60 characters. For the body component, the character limit is 1024 characters.
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for Currency.
     * Required when type=currency.
     * @return Returns the Currency
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Required when type=currency.
     * @param currency Value for Currency
     */
    @JsonSetter("currency")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * Getter for DateTime.
     * Required when type=date_time.
     * @return Returns the DateTimeObject
     */
    @JsonGetter("date_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DateTimeObject getDateTime() {
        return dateTime;
    }

    /**
     * Setter for DateTime.
     * Required when type=date_time.
     * @param dateTime Value for DateTimeObject
     */
    @JsonSetter("date_time")
    public void setDateTime(DateTimeObject dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Getter for Image.
     * Required when type=image.
     * @return Returns the Image
     */
    @JsonGetter("image")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Image getImage() {
        return image;
    }

    /**
     * Setter for Image.
     * Required when type=image.
     * @param image Value for Image
     */
    @JsonSetter("image")
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * Getter for Document.
     * Required when type=document. Only PDF documents are supported for media-based message
     * templates.
     * @return Returns the Document
     */
    @JsonGetter("document")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Document getDocument() {
        return document;
    }

    /**
     * Setter for Document.
     * Required when type=document. Only PDF documents are supported for media-based message
     * templates.
     * @param document Value for Document
     */
    @JsonSetter("document")
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * Getter for Video.
     * Required when type=video.
     * @return Returns the Video
     */
    @JsonGetter("video")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Video getVideo() {
        return video;
    }

    /**
     * Setter for Video.
     * Required when type=video.
     * @param video Value for Video
     */
    @JsonSetter("video")
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * Converts this Parameter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Parameter [" + "type=" + type + ", text=" + text + ", currency=" + currency
                + ", dateTime=" + dateTime + ", image=" + image + ", document=" + document
                + ", video=" + video + "]";
    }

    /**
     * Builds a new {@link Parameter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Parameter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type)
                .text(getText())
                .currency(getCurrency())
                .dateTime(getDateTime())
                .image(getImage())
                .document(getDocument())
                .video(getVideo());
        return builder;
    }

    /**
     * Class to build instances of {@link Parameter}.
     */
    public static class Builder {
        private ParameterTypeEnum type;
        private String text;
        private Currency currency;
        private DateTimeObject dateTime;
        private Image image;
        private Document document;
        private Video video;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  ParameterTypeEnum value for type.
         */
        public Builder(ParameterTypeEnum type) {
            this.type = type;
        }

        /**
         * Setter for type.
         * @param  type  ParameterTypeEnum value for type.
         * @return Builder
         */
        public Builder type(ParameterTypeEnum type) {
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
         * Setter for currency.
         * @param  currency  Currency value for currency.
         * @return Builder
         */
        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for dateTime.
         * @param  dateTime  DateTimeObject value for dateTime.
         * @return Builder
         */
        public Builder dateTime(DateTimeObject dateTime) {
            this.dateTime = dateTime;
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
         * Setter for video.
         * @param  video  Video value for video.
         * @return Builder
         */
        public Builder video(Video video) {
            this.video = video;
            return this;
        }

        /**
         * Builds a new {@link Parameter} object using the set fields.
         * @return {@link Parameter}
         */
        public Parameter build() {
            return new Parameter(type, text, currency, dateTime, image, document, video);
        }
    }
}