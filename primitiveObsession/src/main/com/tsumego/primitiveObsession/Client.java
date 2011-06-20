package com.tsumego.primitiveObsession;

public class Client {
    private String name;
    private String email;
    private String street;
    private String city;

    private String contactName;
    private String contactEmail;
    private String contactStreet;
    private String contactCity;

    public Client(String name, String email, String street, String city, String contactName, String contactEmail, String contactStreet, String contactCity) {
        this.name = name;
        this.email = email;
        this.street = street;
        this.city = city;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactStreet = contactStreet;
        this.contactCity = contactCity;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getStreet() {
        return street;
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

    public String getContactStreet() {
        return contactStreet;
    }

    public String getContactCity() {
        return contactCity;
    }
}
