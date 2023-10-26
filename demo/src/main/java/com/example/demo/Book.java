package com.example.demo;

import java.util.List;
import java.util.ArrayList;

public class Book {
    final private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    void print() {
        System.out.println(title);

        for (Author author : this.authors){
            author.Print();
        }

        for (Chapter chapter : this.chapters){
            System.out.println(chapter.getName());
        }
    }

    void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int createChapter(String name) {
        Chapter chapter = new Chapter(name);
        chapters.add(chapter);

        return chapters.size()-1;
    }

    public Chapter getChapter(int chapterIndex) {
        if (chapterIndex >= 0 && chapterIndex < chapters.size()) {
            return chapters.get(chapterIndex);
        } else {
            return null;
        }
    }
}
