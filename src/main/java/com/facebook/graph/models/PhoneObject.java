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
 * This is a model class for PhoneObject type.
 */
public class PhoneObject {
    private String phone;
    private String waId;
    private PhoneTypeEnum type;

    /**
     * Default constructor.
     */
    public PhoneObject() {
    }

    /**
     * Initialization constructor.
     * @param  phone  String value for phone.
     * @param  waId  String value for waId.
     * @param  type  PhoneTypeEnum value for type.
     */
    public PhoneObject(
            String phone,
            String waId,
            PhoneTypeEnum type) {
        this.phone = phone;
        this.waId = waId;
        this.type = type;
    }

    /**
     * Getter for Phone.
     * Automatically populated with the wa_id value as a formatted phone number.
     * @return Returns the String
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * Automatically populated with the wa_id value as a formatted phone number.
     * @param phone Value for String
     */
    @JsonSetter("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for WaId.
     * WhatsApp ID.
     * @return Returns the String
     */
    @JsonGetter("wa_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWaId() {
        return waId;
    }

    /**
     * Setter for WaId.
     * WhatsApp ID.
     * @param waId Value for String
     */
    @JsonSetter("wa_id")
    public void setWaId(String waId) {
        this.waId = waId;
    }

    /**
     * Getter for Type.
     * @return Returns the PhoneTypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PhoneTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for PhoneTypeEnum
     */
    @JsonSetter("type")
    public void setType(PhoneTypeEnum type) {
        this.type = type;
    }

    /**
     * Converts this PhoneObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PhoneObject [" + "phone=" + phone + ", waId=" + waId + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link PhoneObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PhoneObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .phone(getPhone())
                .waId(getWaId())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link PhoneObject}.
     */
    public static class Builder {
        private String phone;
        private String waId;
        private PhoneTypeEnum type;



        /**
         * Setter for phone.
         * @param  phone  String value for phone.
         * @return Builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter for waId.
         * @param  waId  String value for waId.
         * @return Builder
         */
        public Builder waId(String waId) {
            this.waId = waId;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  PhoneTypeEnum value for type.
         * @return Builder
         */
        public Builder type(PhoneTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link PhoneObject} object using the set fields.
         * @return {@link PhoneObject}
         */
        public PhoneObject build() {
            return new PhoneObject(phone, waId, type);
        }
    }
}
