package com.vnbd.svc.config;

import javax.annotation.PostConstruct;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Dien Nguyen (DEE)
 **/
public class CustomObjectMapper extends ObjectMapper {

    private static final long serialVersionUID = 1L;

    @PostConstruct
    public void init() {
        super.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        super.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
    }

}
