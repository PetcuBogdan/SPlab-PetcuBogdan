package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import com.example.demo.services.AlignStrategy;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Paragraph extends BaseElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    AlignStrategy textAlignment;
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph() {}

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

    public AlignStrategy getTextAlignment() {
        return textAlignment;
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitParagraph(this);
    }

}
