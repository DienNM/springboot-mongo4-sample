package com.vnbd.svc.properties.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vnbd.svc.properties.ServerPropertiesService;

/**
 * @author nguyendee
 *
 */
@Service
public class ServerPropertiesServiceImpl implements ServerPropertiesService {

    @Value("${db.host:localhost}")
    private String dbHost;

    @Value("${db.port:4000}")
    private int dbPort;

    @Value("${db.name:4000}")
    private String dbName;

    @Value("${db.conn-timeout:4000}")
    private int dbConnectTimeout;

    @Value("${db.conn-max-wait-time:3000}")
    private int dbMaxWaitTime;

    @Value("${db.threads-block-connection-multi:4}")
    private int dbThreadsAllowedToBlockForConnectionMultiplier;

    @Value("${db.conn-max:200}")
    private int dbConnectionsPerHost;

    @Value("${es.servers:localhost}")
    private String esServers;

    @Value("${es.servers.scheme:http}")
    private String esSchema;

    @Value("${es.servers.security.emable:false}")
    private boolean esEnabledSecurity;

    @Value("${es.servers.security.usr:elastic}")
    private String esUsername;

    @Value("${es.servers.security.pwd:NONE}")
    private String esPassword;

    @Override
    public String dbHost() {
        return dbHost;
    }

    @Override
    public int dbPort() {
        return dbPort;
    }

    @Override
    public String dbName() {
        return dbName;
    }

    @Override
    public int dbConnectTimeout() {
        return dbConnectTimeout;
    }

    @Override
    public int dbMaxWaitTime() {
        return dbMaxWaitTime;
    }

    @Override
    public int dbThreadsAllowedToBlockForConnectionMultiplier() {
        return dbThreadsAllowedToBlockForConnectionMultiplier;
    }

    @Override
    public int dbConnectionsPerHost() {
        return dbConnectionsPerHost;
    }

}
