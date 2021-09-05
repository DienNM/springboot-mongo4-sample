package com.vnbd.svc.config;

import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.data.mongodb.core.WriteConcernResolver;

import com.mongodb.WriteConcern;

/**
 * @author deenguyen
 **/
public class AppWriteConcernResolver implements WriteConcernResolver {

    @Override
    public WriteConcern resolve(MongoAction action) {
        return WriteConcern.JOURNALED;
    }

}
