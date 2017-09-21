/**
 * hermes-metaservice
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.metaservice.model;


public class Meta {

    private Integer version;
    private String value;

    /**
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
