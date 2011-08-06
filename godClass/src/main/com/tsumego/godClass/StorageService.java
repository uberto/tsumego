package com.tsumego.godClass;

public interface StorageService {

    public void putObjectForKey(StorageType type, String id, Object object);

    public Object get(StorageType type, String id);

}
