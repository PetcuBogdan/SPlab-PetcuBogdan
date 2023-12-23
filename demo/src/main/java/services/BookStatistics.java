package services;

import models.*;

public class BookStatistics implements Visitor{
    private int books=0;
    private int images=0;
    private int sections=0;
    private int tablesOfContent=0;
    private int paragraphs=0;
    private int tables=0;

    public void printStatistics() {
        if (books!=0) {
            System.out.println("books: " + books);
        }
        if (images!=0) {
            System.out.println("images: " + images);
        }
        if (sections!=0) {
            System.out.println("sections: " + sections);
        }
        if (tablesOfContent!=0) {
            System.out.println("tablesOfContent: " + tablesOfContent);
        }
        if (paragraphs!=0) {
            System.out.println("paragraphs: " + paragraphs);
        }
        if (tables!=0) {
            System.out.println("tables: " + tables);
        }

    }

    @Override
    public void visitBook(Book book) {
       books++;
    }

    @Override
    public void visitSection(Section section) {
        sections++;
    }

    @Override
    public void visitTableOfContent(TableOfContents table) {
        tables++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy imgProxy) {
        images++;
    }

    @Override
    public void visitImage(Image image) {
        images++;
    }

    @Override
    public void visitTable(Table table) {
        tables++;
    }
}
