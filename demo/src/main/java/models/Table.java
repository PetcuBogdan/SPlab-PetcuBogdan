package models;

import models.Element;
import services.Visitor;

public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table with name: " + title);
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
        v.visitTable(this);
    }
}
