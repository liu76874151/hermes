/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.meta.entity;

import java.util.HashMap;
import java.util.Map;

public class Datasource {

    private Integer id;
    private Map<String,Property> properties = new HashMap<>();
    
    public void addProperty(Property pp) {
        properties.put(pp.getName(),pp);
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the properties
     */
    public Map<String,Property> getProperties() {
        return properties;
    }
}
