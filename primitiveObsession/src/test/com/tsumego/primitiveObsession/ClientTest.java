package com.tsumego.primitiveObsession;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClientTest {



    @Test
    public void shouldGetContactDetails() throws Exception {
       com.tsumego.primitiveObsession.Client client = new com.tsumego.primitiveObsession.Client("acme", "client@acme.com", "High Street, 42", "Springfield", "Homer", "homer@acme.com", "Low Street, 24", "Springfield");
       assertThat(client.getName(), is("acme"));
       assertThat(client.getEmail(), is("client@acme.com"));
       assertThat(client.getStreet(), is("High Street, 42"));
       assertThat(client.getCity(), is("Springfield"));
       assertThat(client.getContactName(), is("Homer"));
       assertThat(client.getContactEmail(), is("homer@acme.com"));
       assertThat(client.getContactStreet(), is("Low Street, 24"));
       assertThat(client.getContactCity(), is("Springfield"));
    }
}
