/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.cmessaging.entity;


public class ConsumeGroup {

    String hermesConsumerGroup;
    String state;

    /**
     * @return the hermesConsumerGroup
     */
    public String getHermesConsumerGroup() {
        return hermesConsumerGroup;
    }

    /**
     * @param hermesConsumerGroup the hermesConsumerGroup to set
     */
    public void setHermesConsumerGroup(String hermesConsumerGroup) {
        this.hermesConsumerGroup = hermesConsumerGroup;
    }

    public Node findNode(String ip) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    public ProduceGroup findProduceGroup(String identifier) {
        // TODO Auto-generated method stub
        return null;
    }
}
