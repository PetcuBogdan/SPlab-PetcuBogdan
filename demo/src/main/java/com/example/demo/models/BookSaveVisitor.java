package com.example.demo.models;

public interface BookSaveVisitor extends Visitor{
    void saveToJson(String filename);
}
