package com.tsumego.duplication;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClientTest {



    @Test
    public void shouldSendEmail() throws Exception {
       Client client = new Client("client@acme.com", "High Street, 42", "Springfield");
       assertThat(client.getEmail(), is("client@acme.com"));
       assertThat(client.getAddress(), is("High Street, 42"));
       assertThat(client.getCity(), is("Springfield"));
    }
}
