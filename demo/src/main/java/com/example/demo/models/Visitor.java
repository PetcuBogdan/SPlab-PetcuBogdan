package com.example.demo.models;


public interface Visitor {
    void visitBook(Book book);

    void visitSection(Section section);

    void visitTableOfContent(TableOfContents table);

    void visitParagraph(Paragraph paragraph);

    void visitImageProxy(ImageProxy imgProxy);

    void visitImage(Image image);

    void visitTable(Table table);

    void saveToJson(String filename);
}
