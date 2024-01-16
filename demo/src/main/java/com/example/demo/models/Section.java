package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Section extends BaseElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToMany(targetEntity = BaseElement.class)
    private List<Element> elements = new ArrayList<Element>();
    @OneToMany(targetEntity = BaseElement.class)
    private List<Element> vis = new ArrayList<>();

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
