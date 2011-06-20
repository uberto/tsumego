package com.tsumego.entities;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClientTest {



    @Test
    public void shouldSendEmail() throws Exception {
       Client client = new Client("acme", "client@acme.com", "High Street, 42", "Springfield", "Homer", "homer@acme.com", "Low Street, 24", "Springfield");
       assertThat(client.getName(), is("acme"));
       assertThat(client.getEmail(), is("client@acme.com"));
       assertThat(client.getAddress(), is("High Street, 42"));
       assertThat(client.getCity(), is("Springfield"));
       assertThat(client.getContactName(), is("Homer"));
       assertThat(client.getContactEmail(), is("homer@acme.com"));
       assertThat(client.getContactAddress(), is("Low Street, 24"));
       assertThat(client.getContactCity(), is("Springfield"));
    }
}
