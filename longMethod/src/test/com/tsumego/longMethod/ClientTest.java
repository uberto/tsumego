package com.tsumego.longMethod;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClientTest {


    @Test
    public void shouldDecomposeLongName() throws Exception {
        Client client = new Client("John Long Silver");
        assertThat(client.getFirstName(), is("John"));
        assertThat(client.getMiddleName(), is("Long"));
        assertThat(client.getLastName(), is("Silver"));

    }

        @Test
    public void shouldDecomposeShortName() throws Exception {
        Client client = new Client("Homer Simpson");
        assertThat(client.getFirstName(), is("Homer"));
        assertThat(client.getLastName(), is("Simpson"));

    }
}
