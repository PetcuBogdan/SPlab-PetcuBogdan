package com.example.demo;

import lombok.Getter;

public class Paragraph implements Element{
    AlignStrategy textAlignment;
    @Getter
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if (textAlignment != null)
            textAlignment.render(this);
        else
            System.out.println(text);
    }

    public void setAlignStrategy(AlignStrategy align) {
        textAlignment = align;
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
}
