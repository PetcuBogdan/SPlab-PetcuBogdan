package com.example.demo.services;

import org.springframework.stereotype.Component;
import com.example.demo.models.Book;
@Component
public class AddBooks implements Command<Book> {
    private final BookService contextbooks;

    private Book book;

    public AddBooks(BookService contextbooks) {
        this.contextbooks = contextbooks;
    }

    @Override
    public Book execute() {
        return contextbooks.saveBook(book);
    }

    public void setAtribute(Book newBook){
        this.book = newBook;
    }
}