/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Body type.
 */
public class Body {
    private String text;

    /**
     * Default constructor.
     */
    public Body() {
    }

    /**
     * Initialization constructor.
     * @param  text  String value for text.
     */
    public Body(
            String text) {
        this.text = text;
    }

    /**
     * Getter for Text.
     * The body content of the message. Emojis and markdown are supported. Links are supported.
     * @return Returns the String
     */
    @JsonGetter("text")
    public String getText() {
        return text;
    }

    /**
     * Setter for Text.
     * The body content of the message. Emojis and markdown are supported. Links are supported.
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Converts this Body into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Body [" + "text=" + text + "]";
    }

    /**
     * Builds a new {@link Body.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Body.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(text);
        return builder;
    }

    /**
     * Class to build instances of {@link Body}.
     */
    public static class Builder {
        private String text;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  text  String value for text.
         */
        public Builder(String text) {
            this.text = text;
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
         * Builds a new {@link Body} object using the set fields.
         * @return {@link Body}
         */
        public Body build() {
            return new Body(text);
        }
    }
}
