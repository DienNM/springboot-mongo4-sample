package com.vnbd.svc.module.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vnbd.svc.module.model.ContactModel;

/**
 * @author dee
 */
public interface ContactRepository extends MongoRepository<ContactModel, String> {

}
