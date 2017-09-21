/**
 * hermes-broker
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.broker.dal.hermes;

import java.io.InputStream;
import java.util.Date;

import com.ctrip.hermes.broker.queue.storage.mysql.dal.IdAware;

public class MessagePriority implements IdAware{

    
    private long id;
    private byte[] attributes;
    private Date creationDate;
    private Integer partition;
    private InputStream payload;
    private Integer priority;
    private Integer producerId;
    private String producerIp;
    private String refKey;
    private  String topic;
    private String codecType;
    /**
     * @return the id
     */
    @Override
    public long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
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

}
