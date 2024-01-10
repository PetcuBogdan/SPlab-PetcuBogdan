package com.example.demo.services;

import org.springframework.stereotype.Component;
import com.example.demo.models.Book;

public class PutBooks implements Command<Book> {
    Long id;
    private Book updatedBook;
    private BookService bookService;

    public PutBooks() {}

    public PutBooks(Book updatedBook, BookService bookService) {
        this.updatedBook = updatedBook;
        this.bookService = bookService;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Book execute() {
        return this.bookService.update(id, updatedBook);
    }
}
