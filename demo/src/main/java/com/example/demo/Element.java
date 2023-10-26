package com.example.demo;

public interface Element {
    void print();

    void add(Element el);

    Element get(int nr);

    void remove(Element el);
}
