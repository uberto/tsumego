package com.tsumego.longMethod;

import java.lang.String;

public class Client {

    private String firstName;

    private String middleName;

    private String lastName;


    public Client(String fullName) {

        for(int i = 0; i < fullName.length(); i++){

            if (fullName.charAt(i) == ' '){

            }
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
}