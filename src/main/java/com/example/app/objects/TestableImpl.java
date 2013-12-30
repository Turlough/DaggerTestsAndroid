package com.example.app.objects;


import javax.inject.Inject;

/**
 * Created by Turlough on 18/12/13.
 */
public class TestableImpl implements ITestable {

    private final IStorage storage;

    public TestableImpl(IStorage storage){
        this.storage = storage;
        storage.save("TestableImpl saved text");
    }

    @Override
    public String getString() {
        return storage.load();
    }
}
