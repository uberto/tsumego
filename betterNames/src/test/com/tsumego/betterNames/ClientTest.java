package com.tsumego.betterNames;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClientTest {


    @Test
    public void shouldCalculateAgeInDays() throws Exception {
        Client homer = new Client("Homer Simpson", yyyymmdd("19700502"));
        assertThat(homer.sayHello(yyyymmdd("20110623")), is("Hello Homer Simpson, you are 15026 days old!"));

        Client bart = new Client("Bart Simpson", yyyymmdd("20100623"));
        assertThat(bart.sayHello(yyyymmdd("20110623")), is("Hello Bart Simpson, you are 365 days old!"));
    }

    @Test
    public void shouldCalculateWhenYouAreDue() throws Exception {
        Client homer = new Client("Maggie Simpson", yyyymmdd("20110630"));
        assertThat(homer.sayHello(yyyymmdd("20110623")), is("Hello Maggie Simpson, you are due in 7 days!"));
    }


    private Date yyyymmdd(String date) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd").parse(date);
    }


}
