package com.tsumego.removeIfAndNull;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClientTest {


    @Test
    public void shouldComposeLongName() throws Exception {
        Client client = new Client("John", "Long", "Silver");
        assertThat(client.getFirstName(), is("John"));
        assertThat(client.getMiddleName(), is("Long"));
        assertThat(client.getLastName(), is("Silver"));

        assertThat(client.getFullName(), is("John Long Silver"));

    }

    @Test
    public void shouldComposeShortName() throws Exception {
        Client client = new Client("Homer", null, "Simpson");
        assertThat(client.getFullName(), is("Homer Simpson"));

    }
}
