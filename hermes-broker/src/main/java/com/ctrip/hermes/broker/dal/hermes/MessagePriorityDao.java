/**
 * hermes-broker
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.broker.dal.hermes;

import java.util.Collection;
import java.util.List;

import org.unidal.dal.jdbc.DalException;

public class MessagePriorityDao {

    public List<MessagePriority> findIdAfter(String topic, int partition, int priorityInt, long startOffsetExclusive,
            int batchSize, String readsetFull) throws DalException {
        // TODO Auto-generated method stub
        return null;
    }

    public void insert(MessagePriority[] array) {
        // TODO Auto-generated method stub
        
    }

    public List<MessagePriority> top(String topic, int partition, int priority, String readsetFull) {
        // TODO Auto-generated method stub
        return null;
    }

    public Collection<? extends MessagePriority> findWithOffsets(String topic, int partition, int priorityInt,
            Long[] subOffsets, String readsetFull) {
        // TODO Auto-generated method stub
        return null;
    }

    public MessagePriority findOldestOffset(String topic, int partition, int priorityInt, String readsetOffset) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<MessagePriority> findLatestOffset(String topic, int partition, int priorityInt, String readsetOffset) {
        // TODO Auto-generated method stub
        return null;
    }

    public MessagePriority findOffsetGreaterOrEqual(String topic, int partition, int priorityInt, long midId,
            String readsetOffset) {
        // TODO Auto-generated method stub
        return null;
    }

    public MessagePriority findOffsetLessOrEqual(String topic, int partition, int priorityInt, long midId,
            String readsetOffset) {
        // TODO Auto-generated method stub
        return null;
    }

}
