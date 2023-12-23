package models;

import services.Visitor;

import java.util.List;
import java.util.ArrayList;

public class Book extends Section {
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


    @Override
    public void acceptVisitor(Visitor v) {
        v.visitBook(this);
        for (Element el : elements) {
            el.acceptVisitor(v);
        }
    }
}
