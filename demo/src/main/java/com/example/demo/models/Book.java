package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;

@Getter
@Setter
@Entity(name = "Book")
public class Book extends Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;
    @ManyToMany
    private List<Author> authors;
    @JsonCreator

    public Book(String title) {
        this.title = title;
    }

    public Book() {}

    public void print() {
        System.out.println(title);

        for (Author author : this.authors) {
            author.Print();
        }

        for(Element el : getElements()) {
            el.print();
        }
    }

    void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Element el) {
         getElements().add(el);
    }


    @Override
    public void acceptVisitor(Visitor v) {
        v.visitBook(this);
        for (Element el : getElements()) {
            el.acceptVisitor(v);
        }
    }
}
