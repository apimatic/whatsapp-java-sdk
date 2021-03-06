/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Component type.
 */
public class Component {
    private ComponentTypeEnum type;
    private SubTypeEnum subType;
    private List<Object> parameters;
    private String index;

    /**
     * Default constructor.
     */
    public Component() {
    }

    /**
     * Initialization constructor.
     * @param  type  ComponentTypeEnum value for type.
     * @param  parameters  List of Object value for parameters.
     * @param  subType  SubTypeEnum value for subType.
     * @param  index  String value for index.
     */
    public Component(
            ComponentTypeEnum type,
            List<Object> parameters,
            SubTypeEnum subType,
            String index) {
        this.type = type;
        this.subType = subType;
        this.parameters = parameters;
        this.index = index;
    }

    /**
     * Getter for Type.
     * Describes the component type. For text-based templates, we only support the type=body.
     * @return Returns the ComponentTypeEnum
     */
    @JsonGetter("type")
    public ComponentTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Describes the component type. For text-based templates, we only support the type=body.
     * @param type Value for ComponentTypeEnum
     */
    @JsonSetter("type")
    public void setType(ComponentTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for SubType.
     * Required when type=button. Not used for the other types. Type of button to create.
     * @return Returns the SubTypeEnum
     */
    @JsonGetter("sub_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubTypeEnum getSubType() {
        return subType;
    }

    /**
     * Setter for SubType.
     * Required when type=button. Not used for the other types. Type of button to create.
     * @param subType Value for SubTypeEnum
     */
    @JsonSetter("sub_type")
    public void setSubType(SubTypeEnum subType) {
        this.subType = subType;
    }

    /**
     * Getter for Parameters.
     * Required when type=button. Array of parameter objects with the content of the message. For
     * components of type=button, see the button parameter object.
     * @return Returns the List of Object
     */
    @JsonGetter("parameters")
    public List<Object> getParameters() {
        return parameters;
    }

    /**
     * Setter for Parameters.
     * Required when type=button. Array of parameter objects with the content of the message. For
     * components of type=button, see the button parameter object.
     * @param parameters Value for List of Object
     */
    @JsonSetter("parameters")
    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    /**
     * Getter for Index.
     * Required when type=button. Not used for the other types. Position index of the button. You
     * can have up to 3 buttons using index values of 0 to 2.
     * @return Returns the String
     */
    @JsonGetter("index")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIndex() {
        return index;
    }

    /**
     * Setter for Index.
     * Required when type=button. Not used for the other types. Position index of the button. You
     * can have up to 3 buttons using index values of 0 to 2.
     * @param index Value for String
     */
    @JsonSetter("index")
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * Converts this Component into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Component [" + "type=" + type + ", parameters=" + parameters + ", subType="
                + subType + ", index=" + index + "]";
    }

    /**
     * Builds a new {@link Component.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Component.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, parameters)
                .subType(getSubType())
                .index(getIndex());
        return builder;
    }

    /**
     * Class to build instances of {@link Component}.
     */
    public static class Builder {
        private ComponentTypeEnum type;
        private List<Object> parameters;
        private SubTypeEnum subType;
        private String index;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  ComponentTypeEnum value for type.
         * @param  parameters  List of Object value for parameters.
         */
        public Builder(ComponentTypeEnum type, List<Object> parameters) {
            this.type = type;
            this.parameters = parameters;
        }

        /**
         * Setter for type.
         * @param  type  ComponentTypeEnum value for type.
         * @return Builder
         */
        public Builder type(ComponentTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for parameters.
         * @param  parameters  List of Object value for parameters.
         * @return Builder
         */
        public Builder parameters(List<Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Setter for subType.
         * @param  subType  SubTypeEnum value for subType.
         * @return Builder
         */
        public Builder subType(SubTypeEnum subType) {
            this.subType = subType;
            return this;
        }

        /**
         * Setter for index.
         * @param  index  String value for index.
         * @return Builder
         */
        public Builder index(String index) {
            this.index = index;
            return this;
        }

        /**
         * Builds a new {@link Component} object using the set fields.
         * @return {@link Component}
         */
        public Component build() {
            return new Component(type, parameters, subType, index);
        }
    }
}
