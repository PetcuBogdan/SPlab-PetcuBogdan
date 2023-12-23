package models;

import models.Element;
import models.Image;
import models.Picture;
import services.Visitor;

import java.awt.*;

public class ImageProxy implements Picture, Element {
    private String url;
    private Dimension dim;
    models.Image realImage = null;

    public ImageProxy(String url) {
        this.url=url;
    }

    public models.Image loadImage(){
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element el) {

    }

    @Override
    public Element get(int nr) {
        return null;
    }

    @Override
    public void remove(Element el) {

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
        v.visitImageProxy(this);
    }
}
