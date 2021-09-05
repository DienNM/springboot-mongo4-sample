package com.vnbd.svc.module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnbd.svc.module.data.ContactData;
import com.vnbd.svc.module.model.ContactModel;
import com.vnbd.svc.module.repository.ContactRepository;

/**
 * @author nguyendee
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public ContactData getById(String id) {
        ContactModel model = contactRepository.findById(id).orElse(null);
        if (model == null) {
            return null;
        }
        return ContactData.toData(model);
    }

    @Override
    public void save(ContactData data) {
        ContactModel model = ContactData.toModel(data);
        contactRepository.save(model);
    }

    @Override
    public boolean deleteById(String id) {
        ContactModel model = contactRepository.findById(id).orElse(null);
        if (model == null) {
            return false;
        }
        contactRepository.delete(model);
        return true;
    }

}
