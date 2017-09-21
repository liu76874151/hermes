/**
 * hermes-metaservice
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.metaservice.model;

import com.ctrip.hermes.meta.entity.Idc;

public class ZookeeperEnsemble {

    private Integer id;
    private String name;
    private String connectionString;
    private Idc idc;
    private boolean primary;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }
    /**
     * @param connectionString the connectionString to set
     */
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    /**
     * @return the idc
     */
    public Idc getIdc() {
        return idc;
    }
    /**
     * @param idc the idc to set
     */
    public void setIdc(Idc idc) {
        this.idc = idc;
    }
    /**
     * @return the primary
     */
    public boolean isPrimary() {
        return primary;
    }
    /**
     * @param primary the primary to set
     */
    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param zookeeperEnsembleId the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
}
