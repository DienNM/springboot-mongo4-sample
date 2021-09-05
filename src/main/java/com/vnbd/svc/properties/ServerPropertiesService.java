package com.vnbd.svc.properties;

/**
 * @author nguyendee
 *
 */
public interface ServerPropertiesService {
    
    String dbHost();
    int dbPort();
    String dbName();
    
    int dbConnectTimeout();
    int dbMaxWaitTime();
    
    int dbThreadsAllowedToBlockForConnectionMultiplier();
    int dbConnectionsPerHost();
    
}
