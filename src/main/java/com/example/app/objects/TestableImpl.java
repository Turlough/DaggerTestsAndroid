package com.example.app.objects;

import javax.inject.Inject;

/**
 * Created by Turlough on 18/12/13.
 */
public class TestableImpl implements ITestable {

    @Inject public TestableImpl(){}


    @Override
    public String getString() {
        return "test";
    }
}
