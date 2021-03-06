/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetPhoneNumberByIDResponse type.
 */
public class GetPhoneNumberByIDResponse {
    private String verifiedName;
    private String displayPhoneNumber;
    private String id;
    private QualityRatingEnum qualityRating;

    /**
     * Default constructor.
     */
    public GetPhoneNumberByIDResponse() {
    }

    /**
     * Initialization constructor.
     * @param  verifiedName  String value for verifiedName.
     * @param  displayPhoneNumber  String value for displayPhoneNumber.
     * @param  id  String value for id.
     * @param  qualityRating  QualityRatingEnum value for qualityRating.
     */
    public GetPhoneNumberByIDResponse(
            String verifiedName,
            String displayPhoneNumber,
            String id,
            QualityRatingEnum qualityRating) {
        this.verifiedName = verifiedName;
        this.displayPhoneNumber = displayPhoneNumber;
        this.id = id;
        this.qualityRating = qualityRating;
    }

    /**
     * Getter for VerifiedName.
     * The verified name associated with the phone number.
     * @return Returns the String
     */
    @JsonGetter("verified_name")
    public String getVerifiedName() {
        return verifiedName;
    }

    /**
     * Setter for VerifiedName.
     * The verified name associated with the phone number.
     * @param verifiedName Value for String
     */
    @JsonSetter("verified_name")
    public void setVerifiedName(String verifiedName) {
        this.verifiedName = verifiedName;
    }

    /**
     * Getter for DisplayPhoneNumber.
     * The string representation of the phone number.
     * @return Returns the String
     */
    @JsonGetter("display_phone_number")
    public String getDisplayPhoneNumber() {
        return displayPhoneNumber;
    }

    /**
     * Setter for DisplayPhoneNumber.
     * The string representation of the phone number.
     * @param displayPhoneNumber Value for String
     */
    @JsonSetter("display_phone_number")
    public void setDisplayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

    /**
     * Getter for Id.
     * The ID associated with the phone number.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID associated with the phone number.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for QualityRating.
     * The quality rating of the phone number based on how messages have been received by recipients
     * in recent days.
     * @return Returns the QualityRatingEnum
     */
    @JsonGetter("quality_rating")
    public QualityRatingEnum getQualityRating() {
        return qualityRating;
    }

    /**
     * Setter for QualityRating.
     * The quality rating of the phone number based on how messages have been received by recipients
     * in recent days.
     * @param qualityRating Value for QualityRatingEnum
     */
    @JsonSetter("quality_rating")
    public void setQualityRating(QualityRatingEnum qualityRating) {
        this.qualityRating = qualityRating;
    }

    /**
     * Converts this GetPhoneNumberByIDResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPhoneNumberByIDResponse [" + "verifiedName=" + verifiedName
                + ", displayPhoneNumber=" + displayPhoneNumber + ", id=" + id + ", qualityRating="
                + qualityRating + "]";
    }

    /**
     * Builds a new {@link GetPhoneNumberByIDResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPhoneNumberByIDResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(verifiedName, displayPhoneNumber, id, qualityRating);
        return builder;
    }

    /**
     * Class to build instances of {@link GetPhoneNumberByIDResponse}.
     */
    public static class Builder {
        private String verifiedName;
        private String displayPhoneNumber;
        private String id;
        private QualityRatingEnum qualityRating;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  verifiedName  String value for verifiedName.
         * @param  displayPhoneNumber  String value for displayPhoneNumber.
         * @param  id  String value for id.
         * @param  qualityRating  QualityRatingEnum value for qualityRating.
         */
        public Builder(String verifiedName, String displayPhoneNumber, String id,
                QualityRatingEnum qualityRating) {
            this.verifiedName = verifiedName;
            this.displayPhoneNumber = displayPhoneNumber;
            this.id = id;
            this.qualityRating = qualityRating;
        }

        /**
         * Setter for verifiedName.
         * @param  verifiedName  String value for verifiedName.
         * @return Builder
         */
        public Builder verifiedName(String verifiedName) {
            this.verifiedName = verifiedName;
            return this;
        }

        /**
         * Setter for displayPhoneNumber.
         * @param  displayPhoneNumber  String value for displayPhoneNumber.
         * @return Builder
         */
        public Builder displayPhoneNumber(String displayPhoneNumber) {
            this.displayPhoneNumber = displayPhoneNumber;
            return this;
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
         * Setter for qualityRating.
         * @param  qualityRating  QualityRatingEnum value for qualityRating.
         * @return Builder
         */
        public Builder qualityRating(QualityRatingEnum qualityRating) {
            this.qualityRating = qualityRating;
            return this;
        }

        /**
         * Builds a new {@link GetPhoneNumberByIDResponse} object using the set fields.
         * @return {@link GetPhoneNumberByIDResponse}
         */
        public GetPhoneNumberByIDResponse build() {
            return new GetPhoneNumberByIDResponse(verifiedName, displayPhoneNumber, id,
                    qualityRating);
        }
    }
}
