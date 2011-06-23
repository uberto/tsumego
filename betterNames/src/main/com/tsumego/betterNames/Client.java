package com.tsumego.betterNames;

import java.util.Date;

public class Client {

    private String name;
    private Date birthDate;

    public Client(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String sayHello(Date today) {
        if (today.getTime() > birthDate.getTime())  {
            return "Hello " + name + ", you are " + diff(today) / 86400000  + " days old!";
        } else {
            return "Hello " + name + ", you are due in " + -diff(today) / 86400000  + " days!";

        }
    }

    private long diff(Date today) {
        return today.getTime() - birthDate.getTime();
    }


}
