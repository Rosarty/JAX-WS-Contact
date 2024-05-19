package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tom", "123-456-7890"));
        list.add(new Contact(2, "Bill", "234-567-8901"));
        list.add(new Contact(3, "Bob", "345-678-9012"));
        return list;
    }
}