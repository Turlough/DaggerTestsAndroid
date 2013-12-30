package com.example.app.objects;

/**
 * Created by Turlough on 30/12/13.
 */
public class QuickStorage implements IStorage {
    String s = "";
    @Override
    public void save(String s) {
       this.s = s;
    }

    @Override
    public String load() {
        return s;
    }

    @Override
    public void setFile(String filename) {

    }
}
