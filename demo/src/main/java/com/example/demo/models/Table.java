package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Table extends BaseElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String title;

    public Table(String title) {
        this.title = title;
    }

    public Table() {}

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
    public void remove(Element el){}

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitTable(this);
    }
}
