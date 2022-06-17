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
 * This is a model class for Location type.
 */
public class Location {
    private String latitude;
    private String longitude;
    private String name;
    private String address;

    /**
     * Default constructor.
     */
    public Location() {
    }

    /**
     * Initialization constructor.
     * @param  latitude  String value for latitude.
     * @param  longitude  String value for longitude.
     * @param  name  String value for name.
     * @param  address  String value for address.
     */
    public Location(
            String latitude,
            String longitude,
            String name,
            String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
    }

    /**
     * Getter for Latitude.
     * Latitude of the location.
     * @return Returns the String
     */
    @JsonGetter("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * Setter for Latitude.
     * Latitude of the location.
     * @param latitude Value for String
     */
    @JsonSetter("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter for Longitude.
     * Longitude of the location.
     * @return Returns the String
     */
    @JsonGetter("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * Setter for Longitude.
     * Longitude of the location.
     * @param longitude Value for String
     */
    @JsonSetter("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Getter for Name.
     * Name of the location.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the location.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Address.
     * Address of the location. Only displayed if name is present.
     * @return Returns the String
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * Address of the location. Only displayed if name is present.
     * @param address Value for String
     */
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Converts this Location into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Location [" + "latitude=" + latitude + ", longitude=" + longitude + ", name=" + name
                + ", address=" + address + "]";
    }

    /**
     * Builds a new {@link Location.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Location.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(latitude, longitude)
                .name(getName())
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link Location}.
     */
    public static class Builder {
        private String latitude;
        private String longitude;
        private String name;
        private String address;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  latitude  String value for latitude.
         * @param  longitude  String value for longitude.
         */
        public Builder(String latitude, String longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        /**
         * Setter for latitude.
         * @param  latitude  String value for latitude.
         * @return Builder
         */
        public Builder latitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * Setter for longitude.
         * @param  longitude  String value for longitude.
         * @return Builder
         */
        public Builder longitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  String value for address.
         * @return Builder
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new {@link Location} object using the set fields.
         * @return {@link Location}
         */
        public Location build() {
            return new Location(latitude, longitude, name, address);
        }
    }
}
