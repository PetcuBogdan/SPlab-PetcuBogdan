package com.example.demo.models;

public class TableOfContents extends BaseElement {
    @Override
    public void print() {
    }

    @Override
    public void add(Element el) {

    }

    @Override
    public Element get(int nr) {
        return null;
    }

    @Override
    public void remove(Element el){

    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitTableOfContent(this);
    }
}
