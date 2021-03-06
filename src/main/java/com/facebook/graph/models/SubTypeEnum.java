/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * SubTypeEnum to be used.
 */
public enum SubTypeEnum {
    /**
     * Refers to a previously created quick reply button that allows for the customer to return a predefined message.
     */
    QUICKREPLY,

    /**
     * Refers to a previously created button that allows the customer to visit the URL generated by appending the text parameter to the predefined prefix URL in the template.
     */
    URL;


    private static TreeMap<String, SubTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        QUICKREPLY.value = "quick_reply";
        URL.value = "url";

        valueMap.put("quick_reply", QUICKREPLY);
        valueMap.put("url", URL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SubTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of SubTypeEnum values to list of string values.
     * @param toConvert The list of SubTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 