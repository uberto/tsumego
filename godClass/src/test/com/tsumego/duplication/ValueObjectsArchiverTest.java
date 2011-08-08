package com.tsumego.duplication;

import com.tsumego.godClass.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ValueObjectsArchiverTest {

    ValueObjectsArchiver archiver;

    @Before
    public void setUp() throws Exception {
        archiver = new ValueObjectsArchiver(createSimpleStorage());
    }

    @Test
    public void shouldRetrieveSameClient() {

        assertNull(archiver.retrieveClient("homer"));

        archiver.storeClient("homer", createClient());

        Client newHomer = archiver.retrieveClient("homer");
        assertThat(newHomer, is(createClient()));

    }

    @Test
    public void shouldRetrieveSameItem() {

        assertNull(archiver.retrieveItem("batmobile"));

        archiver.storeItem("batmobile", createItem());

        Item newbatmobile = archiver.retrieveItem("batmobile");
        assertThat(newbatmobile, is(createItem()));

    }

    @Test
    public void shouldRetrieveClientAndItemSameItem() {

        archiver.storeClient("sameId", createClient());

        archiver.storeItem("sameId", createItem());

        Item newbatmobile = archiver.retrieveItem("sameId");

        Client newHomer = archiver.retrieveClient("sameId");

        assertThat(newbatmobile, is(createItem()));
        assertThat(newHomer, is(createClient()));

    }

    private Client createClient() {
        return new Client("Homer", "Simpson");
    }


    private Item createItem() {
        return new Item("Batmobile", "Advanced car for dark superheros", new BigDecimal(1234567.89));
    }

    private static StorageService createSimpleStorage() {
        return new StorageService() {
            Map<String, Object> map = new HashMap<String, Object>();

            public void putObjectForKey(StorageType type, String id, Object object) {
                map.put(composeKey(type, id), object);
            }

            public Object get(StorageType type, String id) {
                return map.get(composeKey(type, id));
            }

            private String composeKey(StorageType type, String id) {
                return type.name() + "_" + id;
            }
        };
    }

}
