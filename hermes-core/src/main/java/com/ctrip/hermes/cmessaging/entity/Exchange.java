/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.cmessaging.entity;


public class Exchange {

    String hermesTopic;
    Produce produce;
    Consume consume;

    /**
     * @return the hermesTopic
     */
    public String getHermesTopic() {
        return hermesTopic;
    }

    /**
     * @param hermesTopic the hermesTopic to set
     */
    public void setHermesTopic(String hermesTopic) {
        this.hermesTopic = hermesTopic;
    }

    public Produce getProduce() {
        return null;
    }

    public Consume getConsume() {
        return null;
    }
 

}
