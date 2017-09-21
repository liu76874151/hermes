/**
 * hermes-broker
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.broker.dal.hermes;

import java.io.InputStream;
import java.util.Date;

public class ResendGroupId {
    
    private Long id;
    private Long originId;
    private Integer remainingRetries;
    private Date scheduleDate;
    private Date creationDate;
    private Integer priority;
    private byte[] attributes;
    private String refKey;
    private String codecType;
    private InputStream payload;
    private Integer partition;
    private  String topic;
    private  Integer groupId;
    private  Long[] messageIds;
    
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
     * @return the scheduleDate
     */
    public Date getScheduleDate() {
        return scheduleDate;
    }
    /**
     * @param scheduleDate the scheduleDate to set
     */
    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }
    /**
     * @return the originId
     */
    public Long getOriginId() {
        return originId;
    }
    /**
     * @param originId the originId to set
     */
    public void setOriginId(Long originId) {
        this.originId = originId;
    }
    /**
     * @return the remainingRetries
     */
    public Integer getRemainingRetries() {
        return remainingRetries;
    }
    /**
     * @param remainingRetries the remainingRetries to set
     */
    public void setRemainingRetries(Integer remainingRetries) {
        this.remainingRetries = remainingRetries;
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
     * @return the refKey
     */
    public String getRefKey() {
        return refKey;
    }
    /**
     * @param refKey the refKey to set
     */
    public void setRefKey(String refKey) {
        this.refKey = refKey;
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
     * @return the payload
     */
    public InputStream getPayload() {
        return payload;
    }
    /**
     * @param payload the payload to set
     */
    public void setPayload(InputStream payload) {
        this.payload = payload;
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

}
