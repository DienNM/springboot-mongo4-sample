package com.vnbd.svc.module.service;

import com.vnbd.svc.module.data.ContactData;

/**
* @author nguyendee
*/
public interface ContactService {
    
    ContactData getById(String id);
    void save(ContactData data);
    
    boolean deleteById(String id);
    
}

