package com.tsumego.copyPaste;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClientTest {


    @Test
    public void shouldSayHello() throws Exception {
        Client client = new Client("Homer Simpson");
        assertThat(client.sayHello(), is("Hello Homer Simpson !"));

    }

        @Test
    public void shouldSayHelloHtml() throws Exception {
        Client client = new Client("Homer Simpson");
        assertThat(client.sayHelloHtml(), is("<html><body><h1>Hello Homer Simpson !</h1></body></html>"));

    }
}
