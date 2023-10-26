package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    public String title;
    public List<Element> elements = new ArrayList<Element>();


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
}
