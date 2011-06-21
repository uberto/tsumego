package com.tsumego.longMethod;

public class Client {

    private String firstName;

    private String middleName;

    private String lastName;


    public Client(String fullName) {
        int firstSep = -1;
        int secondSep = -1;

        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ') {
                if (firstSep == -1) {
                    firstSep = i;
                } else {
                    secondSep = i;
                }
            }
        }

        if (secondSep == -1) {
            this.firstName = fullName.substring(0, firstSep);
            this.lastName = fullName.substring(firstSep + 1);
        } else {
            this.firstName = fullName.substring(0, firstSep);
            this.middleName = fullName.substring(firstSep + 1, secondSep);
            this.lastName = fullName.substring(secondSep + 1);
        }
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
