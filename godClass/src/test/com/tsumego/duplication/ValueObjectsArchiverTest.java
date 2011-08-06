package com.tsumego.duplication;

import com.tsumego.godClass.Client;
import com.tsumego.godClass.StorageService;
import com.tsumego.godClass.StorageType;
import com.tsumego.godClass.ValueObjectsArchiver;
import org.junit.Before;
import org.junit.Test;

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

        Client homer = new Client("Homer", "Simpson");

        archiver.storeClient("homer", homer);

        Client newHomer = archiver.retrieveClient("homer");
        assertThat(newHomer, is(homer));

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
