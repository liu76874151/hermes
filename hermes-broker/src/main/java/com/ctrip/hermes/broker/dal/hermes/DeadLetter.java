/**
 * hermes-broker
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.broker.dal.hermes;

import java.util.Date;

public class DeadLetter {

    private byte[] attributes;
    private Date creationDate;
    private Date deadDate;
    private byte[] payload;
    private Integer producerId;
    private String producerIp;
    private Integer partition;
    private String topic;
    private  Integer groupId;
    private  Long[] messageIds;
    private Integer priority;
    
    /**
     * @return the attributes
     */
    public byte[] getAttributes() {
        return attributes;
    }
    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(byte[] attributes) {
        this.attributes = attributes;
    }
    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }
    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    /**
     * @return the payload
     */
    public byte[] getPayload() {
        return payload;
    }
    /**
     * @param payload the payload to set
     */
    public void setPayload(byte[] payload) {
        this.payload = payload;
    }
    /**
     * @return the producerId
     */
    public Integer getProducerId() {
        return producerId;
    }
    /**
     * @param producerId the producerId to set
     */
    public void setProducerId(Integer producerId) {
        this.producerId = producerId;
    }
    /**
     * @return the producerIp
     */
    public String getProducerIp() {
        return producerIp;
    }
    /**
     * @param producerIp the producerIp to set
     */
    public void setProducerIp(String producerIp) {
        this.producerIp = producerIp;
    }
    /**
     * @return the partition
     */
    public Integer getPartition() {
        return partition;
    }
    /**
     * @param partition the partition to set
     */
    public void setPartition(Integer partition) {
        this.partition = partition;
    }
    /**
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }
    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }
    /**
     * @return the deadDate
     */
    public Date getDeadDate() {
        return deadDate;
    }
    /**
     * @param deadDate the deadDate to set
     */
    public void setDeadDate(Date deadDate) {
        this.deadDate = deadDate;
    }
    /**
     * @return the groupId
     */
    public Integer getGroupId() {
        return groupId;
    }
    /**
     * @param groupId the groupId to set
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
    /**
     * @return the messageIds
     */
    public Long[] getMessageIds() {
        return messageIds;
    }
    /**
     * @param messageIds the messageIds to set
     */
    public void setMessageIds(Long[] messageIds) {
        this.messageIds = messageIds;
    }
    /**
     * @return the priority
     */
    public Integer getPriority() {
        return priority;
    }
    /**
     * @param priority the priority to set
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
