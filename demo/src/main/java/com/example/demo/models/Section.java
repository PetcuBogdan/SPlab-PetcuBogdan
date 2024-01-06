package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    public String title;
    public List<Element> elements = new ArrayList<Element>();
    public List<Element> vis = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public Section() {
    }

    public void print() {
        System.out.println("Capitol: " + title);
        for (Element el : elements) {
            el.print();
        }
    }

    @Override
    public void add(Element el) {
        elements.add(el);
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
        v.visitSection(this);
        for (Element el : elements) {
            el.acceptVisitor(v);
        }
    }
}
