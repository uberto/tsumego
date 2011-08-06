package com.tsumego.godClass;

public class ValueObjectsArchiver {

    private StorageService storageService;

    public ValueObjectsArchiver(StorageService storageService) {
        this.storageService = storageService;
    }

    public void storeClient(String id, Client client) {
        storageService.putObjectForKey(StorageType.client, id, client);
    }

    public Client retrieveClient(String id) {
        return (Client) storageService.get(StorageType.client, id);
    }

    public void storeItem(String id, Item item) {
        storageService.putObjectForKey(StorageType.item, id, item);
    }

    public Item retrieveItem(String id) {
        return (Item) storageService.get(StorageType.item, id);
    }

}
