/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for SendMessageResponse type.
 */
public class SendMessageResponse {
    private String messagingProduct;
    private List<ResponseContact> contacts;
    private List<ResponseMessage> messages;

    /**
     * Default constructor.
     */
    public SendMessageResponse() {
    }

    /**
     * Initialization constructor.
     * @param  messagingProduct  String value for messagingProduct.
     * @param  contacts  List of ResponseContact value for contacts.
     * @param  messages  List of ResponseMessage value for messages.
     */
    public SendMessageResponse(
            String messagingProduct,
            List<ResponseContact> contacts,
            List<ResponseMessage> messages) {
        this.messagingProduct = messagingProduct;
        this.contacts = contacts;
        this.messages = messages;
    }

    /**
     * Getter for MessagingProduct.
     * @return Returns the String
     */
    @JsonGetter("messaging_product")
    public String getMessagingProduct() {
        return messagingProduct;
    }

    /**
     * Setter for MessagingProduct.
     * @param messagingProduct Value for String
     */
    @JsonSetter("messaging_product")
    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    /**
     * Getter for Contacts.
     * @return Returns the List of ResponseContact
     */
    @JsonGetter("contacts")
    public List<ResponseContact> getContacts() {
        return contacts;
    }

    /**
     * Setter for Contacts.
     * @param contacts Value for List of ResponseContact
     */
    @JsonSetter("contacts")
    public void setContacts(List<ResponseContact> contacts) {
        this.contacts = contacts;
    }

    /**
     * Getter for Messages.
     * @return Returns the List of ResponseMessage
     */
    @JsonGetter("messages")
    public List<ResponseMessage> getMessages() {
        return messages;
    }

    /**
     * Setter for Messages.
     * @param messages Value for List of ResponseMessage
     */
    @JsonSetter("messages")
    public void setMessages(List<ResponseMessage> messages) {
        this.messages = messages;
    }

    /**
     * Converts this SendMessageResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendMessageResponse [" + "messagingProduct=" + messagingProduct + ", contacts="
                + contacts + ", messages=" + messages + "]";
    }

    /**
     * Builds a new {@link SendMessageResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendMessageResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(messagingProduct, contacts, messages);
        return builder;
    }

    /**
     * Class to build instances of {@link SendMessageResponse}.
     */
    public static class Builder {
        private String messagingProduct;
        private List<ResponseContact> contacts;
        private List<ResponseMessage> messages;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  messagingProduct  String value for messagingProduct.
         * @param  contacts  List of ResponseContact value for contacts.
         * @param  messages  List of ResponseMessage value for messages.
         */
        public Builder(String messagingProduct, List<ResponseContact> contacts,
                List<ResponseMessage> messages) {
            this.messagingProduct = messagingProduct;
            this.contacts = contacts;
            this.messages = messages;
        }

        /**
         * Setter for messagingProduct.
         * @param  messagingProduct  String value for messagingProduct.
         * @return Builder
         */
        public Builder messagingProduct(String messagingProduct) {
            this.messagingProduct = messagingProduct;
            return this;
        }

        /**
         * Setter for contacts.
         * @param  contacts  List of ResponseContact value for contacts.
         * @return Builder
         */
        public Builder contacts(List<ResponseContact> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * Setter for messages.
         * @param  messages  List of ResponseMessage value for messages.
         * @return Builder
         */
        public Builder messages(List<ResponseMessage> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * Builds a new {@link SendMessageResponse} object using the set fields.
         * @return {@link SendMessageResponse}
         */
        public SendMessageResponse build() {
            return new SendMessageResponse(messagingProduct, contacts, messages);
        }
    }
}
