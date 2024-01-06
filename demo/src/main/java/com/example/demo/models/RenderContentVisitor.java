package com.example.demo.models;

import com.example.demo.models.*;

public class RenderContentVisitor implements Visitor{

    @Override
    public void visitBook(Book book) {
        book.print();
    }

    @Override
    public void visitSection(Section section) {
        section.print();
    }

    @Override
    public void visitTableOfContent(TableOfContents table) {
        table.print();
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void visitImageProxy(ImageProxy imgProxy) {

    }

    @Override
    public void visitImage(Image image) {
        image.print();
    }

    @Override
    public void visitTable(Table table) {
        table.print();
    }

    @Override
    public void saveToJson(String filename) {

    }
}
