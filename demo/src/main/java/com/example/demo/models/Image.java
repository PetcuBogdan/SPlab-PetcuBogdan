package com.example.demo.models;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    public String imageName;
    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //private ImageContent content;
    }

    public void print() {
        System.out.println("Image with name: " + imageName);
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
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }


    @Override
    public void acceptVisitor(Visitor v) {
        v.visitImage(this);
    }
}
