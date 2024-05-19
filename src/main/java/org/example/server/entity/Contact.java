package org.example.server.entity;

public class Contact {

    private final Integer id;
    private final String fullName;
    private final String phone;

    public Contact(Integer id, String fullName, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "id - " + this.getId() +
                ", " + this.getFullName() +
                ", phone: " + this.getPhone() + "\n";
    }
}
