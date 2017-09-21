/**
 * hermes-broker
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.broker.dal.hermes;

import java.util.Date;
import java.util.List;

public class ResendGroupIdDao {

    public List<ResendGroupId> findByPKs(String topic, int partition, int intGroupId, Long[] pks, String readsetFull) {
        // TODO Auto-generated method stub
        return null;
    }

    public void insert(ResendGroupId[] array) {
        // TODO Auto-generated method stub
        
    }

    public void copyFromMessageTable(ResendGroupId proto) {
        // TODO Auto-generated method stub
        
    }

    public List<ResendGroupId> topId(String topic, int partition, int intGroupId, String readsetId) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<ResendGroupId> find(String topic, int partition, int groupId, int batchSize, Long value, Long maxId,
            String readsetFull) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<ResendGroupId> findMaxIdByScheduleDate(String topic, int partition, int groupId,
            Date maxDuedScheduleDate, String readsetId) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<ResendGroupId> findMaxDuedScheduleDate(String topic, int partition, int groupId, Date date,
            String readsetScheduleDate) {
        // TODO Auto-generated method stub
        return null;
    }

}
