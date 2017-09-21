/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.meta.entity;

public class ConsumerGroup {

    private Integer id;

    private String name;

    private String retryPolicy;

    private String idcPolicy = "primary";
    
    private Integer ackTimeoutSeconds;

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
     * @return the retryPolicy
     */
    public String getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * @param retryPolicy the retryPolicy to set
     */
    public void setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    /**
     * @return the idcPolicy
     */
    public String getIdcPolicy() {
        return idcPolicy;
    }

    /**
     * @param idcPolicy the idcPolicy to set
     */
    public void setIdcPolicy(String idcPolicy) {
        this.idcPolicy = idcPolicy;
    }

    /**
     * @return the ackTimeoutSeconds
     */
    public Integer getAckTimeoutSeconds() {
        return ackTimeoutSeconds;
    }

    /**
     * @param ackTimeoutSeconds the ackTimeoutSeconds to set
     */
    public void setAckTimeoutSeconds(Integer ackTimeoutSeconds) {
        this.ackTimeoutSeconds = ackTimeoutSeconds;
    }

    
}
