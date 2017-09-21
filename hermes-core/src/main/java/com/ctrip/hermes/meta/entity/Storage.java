/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.meta.entity;

import java.util.List;

public class Storage {

    public static final String MYSQL = "mysql";
    public static final String KAFKA = "kafka";
    
    
    public Storage(String type) {
        super();
        this.type = type;
    }

    public String type;
    private List<Datasource> datasources;
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the datasources
     */
    public List<Datasource> getDatasources() {
        return datasources;
    }

    /**
     * @param datasources the datasources to set
     */
    public void addDatasource(Datasource datasource) {
        this.datasources.add(datasource);
    }

}
