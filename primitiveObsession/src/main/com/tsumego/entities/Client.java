package com.tsumego.entities;

public class Client {
    private String name;
    private String email;
    private String address;
    private String city;

    private String contactName;
    private String contactEmail;
    private String contactAddress;
    private String contactCity;

    public Client(String name, String email, String address, String city, String contactName, String contactEmail, String contactAddress, String contactCity) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactAddress = contactAddress;
        this.contactCity = contactCity;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getContactCity() {
        return contactCity;
    }
}
