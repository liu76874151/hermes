/**
 * hermes-core
 *
 * http://www.vipshop.com
 * Copyright (c) 2008-2017. All Rights Reserved.
 * */

package com.ctrip.hermes.meta.entity;

import java.util.Map;

import com.ctrip.hermes.meta.transform.BaseVisitor2;

public class Meta {

    private Long version;

    private Long id;

    private Map<String, Idc> idcs;// kafka topic cares primary idc;

    private Map<String, Endpoint> endpoints;
    private Map<String, Topic> topics;
    private Map<String, Storage> storages;
    private Map<String, ZookeeperEnsemble> zookeeperEnsembles;
    
    /**
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Long version) {
        this.version = version;
    }

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
     * @return the idcs
     */
    public Map<String, Idc> getIdcs() {
        return idcs;
    }

    /**
     * @param idcs the idcs to set
     */
    public void addIdc(Idc idcs) {
        this.idcs.put(idcs.toString(), idcs);
    }

    /**
     * @return the endpoints
     */
    public Map<String, Endpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * @param endpoints the endpoints to set
     */
    public void addEndpoint(Endpoint endpoints) {
        this.endpoints.put(endpoints.name(), endpoints);
    }

    /**
     * @param topics the topics to set
     */
    public void setTopics(Map<String, Topic> topics) {
        this.topics = topics;
    }

    /**
     * @return the topics
     */
    public Map<String, Topic> getTopics() {
        return topics;
    }

    /**
     * @return the storages
     */
    public Map<String, Storage> getStorages() {
        return storages;
    }

    /**
     * @param storages the storages to set
     */
    public void addStorage(Storage storages) {
        this.storages.put(storages.getType(), storages);
    }

    public void addTopic(Topic t) {
        topics.put(t.getName(), t);
        
    }

    public Topic findTopic(String topicName) {
        return topics.getOrDefault(topicName, null);
    }

    public Storage findStorage(String storageType) {
        // TODO Auto-generated method stub
        return null;
    }

    public Map<String,ZookeeperEnsemble> getZookeeperEnsembles() {
        return this.zookeeperEnsembles;
    }

    public void accept(BaseVisitor2 baseVisitor2) {
        // TODO Auto-generated method stub
        
    }

    public Endpoint findEndpoint(String endpoint) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
