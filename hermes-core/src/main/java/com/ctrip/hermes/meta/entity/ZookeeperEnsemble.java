/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.meta.entity;


public class ZookeeperEnsemble {


    private String id;
    private String connectionString;
    private Idc idc;
    private boolean primary;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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

}
