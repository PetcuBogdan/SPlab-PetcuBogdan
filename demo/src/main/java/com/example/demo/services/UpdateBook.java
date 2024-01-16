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
        contextBooks.updateBook(id,book);
        return contextBooks.getBookById(id);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
