package com.example.demo.models;

public interface Element {
    void print();

    void add(Element el);

    Element get(int nr);

    void remove(Element el);

    void acceptVisitor(Visitor v);
}
