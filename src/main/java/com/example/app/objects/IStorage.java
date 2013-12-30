package com.example.app.objects;

/**
 * Created by Turlough on 30/12/13.
 */
public interface IStorage {
    void save (String s);
    String load();
    void setFile(String filename);
}
