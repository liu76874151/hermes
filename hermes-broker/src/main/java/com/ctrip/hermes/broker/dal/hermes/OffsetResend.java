/**
 * hermes-broker
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.broker.dal.hermes;

import java.util.Date;

public class OffsetResend {

    private Integer id;
    private Integer partition;
    private Integer groupId;
    private String topic;
    private Long lastId;
    private Date lastScheduleDate;
    private Date creationDate;

    /**
     * @return the lastId
     */
    public Long getLastId() {
        return lastId;
    }

    /**
     * @param lastId the lastId to set
     */
    public void setLastId(Long lastId) {
        this.lastId = lastId;
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
     * @return the lastScheduleDate
     */
    public Date getLastScheduleDate() {
        return lastScheduleDate;
    }

    /**
     * @param lastScheduleDate the lastScheduleDate to set
     */
    public void setLastScheduleDate(Date lastScheduleDate) {
        this.lastScheduleDate = lastScheduleDate;
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
}
