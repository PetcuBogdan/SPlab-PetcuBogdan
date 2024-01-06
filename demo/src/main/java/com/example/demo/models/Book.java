package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.List;
import java.util.ArrayList;


public class Book extends Section {
    public  String title;
    public List<Author> authors = new ArrayList<>();
    @JsonCreator

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(title);

        for (Author author : this.authors) {
            author.Print();
        }

        for(Element el : elements) {
            el.print();
        }
    }

    void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Element el) {
         elements.add(el);
    }


    @Override
    public void acceptVisitor(Visitor v) {
        v.visitBook(this);
        for (Element el : elements) {
            el.acceptVisitor(v);
        }
    }
}
