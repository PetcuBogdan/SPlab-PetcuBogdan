package com.example.demo;

import java.util.List;
import java.util.ArrayList;

public class Book extends Section{
    final private String title;
    private List<Author> authors = new ArrayList<>();

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
}
