package com.example.demo;

public class Table {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    void print() {
        System.out.println("Table with name: " + title);
    }
}
