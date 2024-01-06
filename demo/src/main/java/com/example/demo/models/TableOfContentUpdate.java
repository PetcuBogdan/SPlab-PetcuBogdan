package com.example.demo.models;

import com.example.demo.models.*;

public class TableOfContentUpdate implements Visitor{
    private int pagesCount=1;
    boolean first = true;
    TableOfContents table = new TableOfContents();

    public TableOfContents getToC() {
       return table;
    }

    @Override
    public void visitSection(Section section) {
        if (first) {
            first = false;
            System.out.println("TableOfContent");
        }
        System.out.println(section.title + "............." + pagesCount);
    }

    @Override
    public void visitTableOfContent(TableOfContents table) {
    }

    @Override
    public void visitBook(Book book) {
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        pagesCount++;
    }

    @Override
    public void visitImageProxy(ImageProxy imgProxy) {
        pagesCount++;
    }

    @Override
    public void visitImage(Image image) {
        pagesCount++;
    }

    @Override
    public void visitTable(Table table) {
        pagesCount++;
    }

    @Override
    public void saveToJson(String filename) {

    }
}
