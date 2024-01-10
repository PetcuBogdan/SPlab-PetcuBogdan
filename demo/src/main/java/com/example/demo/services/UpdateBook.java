package com.example.demo.services;

import org.springframework.stereotype.Component;

import com.example.demo.models.Book;
@Component
public class UpdateBook implements Command<Book>{

    private final BookService contextBooks;
    Long id;
    Book book;

    public UpdateBook(BookService contextBooks) {
        this.contextBooks = contextBooks;
    }

    @Override
    public Book execute() {
        contextBooks.update(id,book);
        return contextBooks.getBookById(id);
    }
}
