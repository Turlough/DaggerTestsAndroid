package com.example.app.objects;


public interface IStorage {
    void save (String s);
    String load();
    void setFile(String filename);
}
