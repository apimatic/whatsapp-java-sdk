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
 * This is a model class for DateTimeObject type.
 */
public class DateTimeObject {
    private String fallbackValue;
    private Integer dayOfWeek;
    private Integer year;
    private Integer month;
    private Integer dayOfMonth;
    private Integer hour;
    private Integer minute;
    private String calendar;

    /**
     * Default constructor.
     */
    public DateTimeObject() {
    }

    /**
     * Initialization constructor.
     * @param  fallbackValue  String value for fallbackValue.
     * @param  dayOfWeek  Integer value for dayOfWeek.
     * @param  year  Integer value for year.
     * @param  month  Integer value for month.
     * @param  dayOfMonth  Integer value for dayOfMonth.
     * @param  hour  Integer value for hour.
     * @param  minute  Integer value for minute.
     * @param  calendar  String value for calendar.
     */
    public DateTimeObject(
            String fallbackValue,
            Integer dayOfWeek,
            Integer year,
            Integer month,
            Integer dayOfMonth,
            Integer hour,
            Integer minute,
            String calendar) {
        this.fallbackValue = fallbackValue;
        this.dayOfWeek = dayOfWeek;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.hour = hour;
        this.minute = minute;
        this.calendar = calendar;
    }

    /**
     * Getter for FallbackValue.
     * Default text. For Cloud API, we always use the fallback value, and we do not attempt to
     * localize using other optional fields.
     * @return Returns the String
     */
    @JsonGetter("fallback_value")
    public String getFallbackValue() {
        return fallbackValue;
    }

    /**
     * Setter for FallbackValue.
     * Default text. For Cloud API, we always use the fallback value, and we do not attempt to
     * localize using other optional fields.
     * @param fallbackValue Value for String
     */
    @JsonSetter("fallback_value")
    public void setFallbackValue(String fallbackValue) {
        this.fallbackValue = fallbackValue;
    }

    /**
     * Getter for DayOfWeek.
     * @return Returns the Integer
     */
    @JsonGetter("day_of_week")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Setter for DayOfWeek.
     * @param dayOfWeek Value for Integer
     */
    @JsonSetter("day_of_week")
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * Getter for Year.
     * @return Returns the Integer
     */
    @JsonGetter("year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getYear() {
        return year;
    }

    /**
     * Setter for Year.
     * @param year Value for Integer
     */
    @JsonSetter("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Getter for Month.
     * @return Returns the Integer
     */
    @JsonGetter("month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMonth() {
        return month;
    }

    /**
     * Setter for Month.
     * @param month Value for Integer
     */
    @JsonSetter("month")
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * Getter for DayOfMonth.
     * @return Returns the Integer
     */
    @JsonGetter("day_of_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Setter for DayOfMonth.
     * @param dayOfMonth Value for Integer
     */
    @JsonSetter("day_of_month")
    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * Getter for Hour.
     * @return Returns the Integer
     */
    @JsonGetter("hour")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getHour() {
        return hour;
    }

    /**
     * Setter for Hour.
     * @param hour Value for Integer
     */
    @JsonSetter("hour")
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * Getter for Minute.
     * @return Returns the Integer
     */
    @JsonGetter("minute")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMinute() {
        return minute;
    }

    /**
     * Setter for Minute.
     * @param minute Value for Integer
     */
    @JsonSetter("minute")
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    /**
     * Getter for Calendar.
     * @return Returns the String
     */
    @JsonGetter("calendar")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCalendar() {
        return calendar;
    }

    /**
     * Setter for Calendar.
     * @param calendar Value for String
     */
    @JsonSetter("calendar")
    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    /**
     * Converts this DateTimeObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DateTimeObject [" + "fallbackValue=" + fallbackValue + ", dayOfWeek=" + dayOfWeek
                + ", year=" + year + ", month=" + month + ", dayOfMonth=" + dayOfMonth + ", hour="
                + hour + ", minute=" + minute + ", calendar=" + calendar + "]";
    }

    /**
     * Builds a new {@link DateTimeObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DateTimeObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(fallbackValue)
                .dayOfWeek(getDayOfWeek())
                .year(getYear())
                .month(getMonth())
                .dayOfMonth(getDayOfMonth())
                .hour(getHour())
                .minute(getMinute())
                .calendar(getCalendar());
        return builder;
    }

    /**
     * Class to build instances of {@link DateTimeObject}.
     */
    public static class Builder {
        private String fallbackValue;
        private Integer dayOfWeek;
        private Integer year;
        private Integer month;
        private Integer dayOfMonth;
        private Integer hour;
        private Integer minute;
        private String calendar;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  fallbackValue  String value for fallbackValue.
         */
        public Builder(String fallbackValue) {
            this.fallbackValue = fallbackValue;
        }

        /**
         * Setter for fallbackValue.
         * @param  fallbackValue  String value for fallbackValue.
         * @return Builder
         */
        public Builder fallbackValue(String fallbackValue) {
            this.fallbackValue = fallbackValue;
            return this;
        }

        /**
         * Setter for dayOfWeek.
         * @param  dayOfWeek  Integer value for dayOfWeek.
         * @return Builder
         */
        public Builder dayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * Setter for year.
         * @param  year  Integer value for year.
         * @return Builder
         */
        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        /**
         * Setter for month.
         * @param  month  Integer value for month.
         * @return Builder
         */
        public Builder month(Integer month) {
            this.month = month;
            return this;
        }

        /**
         * Setter for dayOfMonth.
         * @param  dayOfMonth  Integer value for dayOfMonth.
         * @return Builder
         */
        public Builder dayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }

        /**
         * Setter for hour.
         * @param  hour  Integer value for hour.
         * @return Builder
         */
        public Builder hour(Integer hour) {
            this.hour = hour;
            return this;
        }

        /**
         * Setter for minute.
         * @param  minute  Integer value for minute.
         * @return Builder
         */
        public Builder minute(Integer minute) {
            this.minute = minute;
            return this;
        }

        /**
         * Setter for calendar.
         * @param  calendar  String value for calendar.
         * @return Builder
         */
        public Builder calendar(String calendar) {
            this.calendar = calendar;
            return this;
        }

        /**
         * Builds a new {@link DateTimeObject} object using the set fields.
         * @return {@link DateTimeObject}
         */
        public DateTimeObject build() {
            return new DateTimeObject(fallbackValue, dayOfWeek, year, month, dayOfMonth, hour,
                    minute, calendar);
        }
    }
}
