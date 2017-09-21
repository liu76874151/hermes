/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.meta.entity;


public class Partition {

    private Integer id;
    private Integer partitions;
    private String endpoint;
    private String readDatasource;
    private String writeDatasource;

    public Partition(Integer partitions) {
        super();
        this.partitions = partitions;
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
     * @param endpoint the endpoint to set
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @return the endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * @return the partitions
     */
    public Integer getPartitions() {
        return partitions;
    }

    /**
     * @param partitions the partitions to set
     */
    public void setPartitions(Integer partitions) {
        this.partitions = partitions;
    }

    /**
     * @return the readDatasource
     */
    public String getReadDatasource() {
        return readDatasource;
    }

    /**
     * @param readDatasource the readDatasource to set
     */
    public void setReadDatasource(String readDatasource) {
        this.readDatasource = readDatasource;
    }

    /**
     * @return the writeDatasource
     */
    public String getWriteDatasource() {
        return writeDatasource;
    }

    /**
     * @param writeDatasource the writeDatasource to set
     */
    public void setWriteDatasource(String writeDatasource) {
        this.writeDatasource = writeDatasource;
    }
    
}
