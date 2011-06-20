package com.tsumego.duplication;

public class Client {
    private String email;
    private String address;
    private String city;

    public Client(String email, String address, String city) {
        this.email = email;
        this.address = address;
        this.city = city;
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
}
