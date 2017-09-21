/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.meta.entity;

import java.util.List;

public class Topic {

    private Long id;
    private List<Partition> partitions;
    private String codecType;
    private String consumerRetryPolicy;
    private String endpointType;
    private String storageType;
    private String idcPolicy;
    private String name;
    private boolean priorityMessageEnabled;
    private List<ConsumerGroup> consumerGroups;
    
    private Integer ackTimeoutSeconds;
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the partitions
     */
    public List<Partition> getPartitions() {
        return partitions;
    }
    /**
     * @param partitions the partitions to set
     */
    public void setPartitions(List<Partition> partitions) {
        this.partitions = partitions;
    }
    /**
     * @return the codecType
     */
    public String getCodecType() {
        return codecType;
    }
    /**
     * @param codecType the codecType to set
     */
    public void setCodecType(String codecType) {
        this.codecType = codecType;
    }
    /**
     * @return the consumerRetryPolicy
     */
    public String getConsumerRetryPolicy() {
        return consumerRetryPolicy;
    }
    /**
     * @param consumerRetryPolicy the consumerRetryPolicy to set
     */
    public void setConsumerRetryPolicy(String consumerRetryPolicy) {
        this.consumerRetryPolicy = consumerRetryPolicy;
    }
    /**
     * @return the endpointType
     */
    public String getEndpointType() {
        return endpointType;
    }
    /**
     * @param endpointType the endpointType to set
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
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
     * @return the consumerGroups
     */
    public List<ConsumerGroup> getConsumerGroups() {
        return consumerGroups;
    }
    /**
     * @param consumerGroups the consumerGroups to set
     */
    public void setConsumerGroups(List<ConsumerGroup> consumerGroups) {
        this.consumerGroups = consumerGroups;
    }
    /**
     * @return the priorityMessageEnabled
     */
    public boolean isPriorityMessageEnabled() {
        return priorityMessageEnabled;
    }
    /**
     * @param priorityMessageEnabled the priorityMessageEnabled to set
     */
    public void setPriorityMessageEnabled(boolean priorityMessageEnabled) {
        this.priorityMessageEnabled = priorityMessageEnabled;
    }
    /**
     * @return the storageType
     */
    public String getStorageType() {
        return storageType;
    }
    /**
     * @param storageType the storageType to set
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
    public void addPartition(Partition partition) {
        partitions.add(partition);
    }
    public void addConsumerGroup(ConsumerGroup c) {
       consumerGroups.add(c);
        
    }
    public Partition findPartition(int partition) {
        // TODO Auto-generated method stub
        return null;
    }
    public ConsumerGroup findConsumerGroup(String groupId) {
        // TODO Auto-generated method stub
        return null;
    }
    public Integer getAckTimeoutSeconds() {
        return this.ackTimeoutSeconds;
    }
    /**
     * @param ackTimeoutSeconds the ackTimeoutSeconds to set
     */
    public void setAckTimeoutSeconds(Integer ackTimeoutSeconds) {
        this.ackTimeoutSeconds = ackTimeoutSeconds;
    }
  

   
    
}
