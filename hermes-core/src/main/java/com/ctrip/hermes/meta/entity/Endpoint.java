/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.meta.entity;


public class Endpoint {

    public static final String BROKER = "broker";
    
    public Endpoint() {
    }
    
    public Endpoint(String id) {
        super();
        this.id = id;
    }


    private String id;
    private String type;
    private String group;
    private String host;
    private Integer port;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    public String name() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    /**
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
        
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    

}
