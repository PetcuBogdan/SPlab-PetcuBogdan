package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> images = new ArrayList<>();
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("Subchapter: " + name);

        for (Paragraph paragraph : this.paragraphs){
            paragraph.print();
        }

        for (Image image : this.images){
            image.print();
        }

        for (Table table : this.tables){
            table.print();
        }
    }

    public void createNewParagraph(String name) {
        Paragraph paragraph = new Paragraph(name);
        paragraphs.add(paragraph);
    }

    public void createNewTable(String name) {
        Table table = new Table(name);
        tables.add(table);
    }
    public void createNewImage(String name) {
        Image image = new Image(name);
        images.add(image);
    }
}
