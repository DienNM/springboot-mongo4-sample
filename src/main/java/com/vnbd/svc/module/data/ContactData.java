package com.vnbd.svc.module.data;

import java.util.ArrayList;
import java.util.List;

import com.vnbd.svc.module.model.ContactModel;

/**
 * @author nguyendee
 */
public class ContactData {

    private String id;
    private String name;
    private String phone;
    private String address;

    public static ContactData toData(ContactModel source) {
        ContactData dest = new ContactData();
        dest.setId(source.getId());
        dest.setName(source.getName());
        dest.setPhone(source.getPhone());
        dest.setAddress(source.getAddress());
        return dest;
    }

    public static List<ContactData> toDatas(List<ContactModel> sources) {
        List<ContactData> dests = new ArrayList<ContactData>();
        for (ContactModel source : sources) {
            ContactData dest = toData(source);
            dests.add(dest);
        }
        return dests;
    }

    public static ContactModel toModel(ContactData source) {
        ContactModel dest = new ContactModel();
        dest.setId(source.getId());
        dest.setName(source.getName());
        dest.setPhone(source.getPhone());
        dest.setAddress(source.getAddress());
        return dest;
    }

    public static List<ContactModel> toModels(List<ContactData> sources) {
        List<ContactModel> dests = new ArrayList<ContactModel>();
        for (ContactData source : sources) {
            ContactModel dest = toModel(source);
            dests.add(dest);
        }
        return dests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
