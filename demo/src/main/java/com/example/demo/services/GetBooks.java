package com.example.demo.services;

import org.springframework.stereotype.Component;
import com.example.demo.models.Book;

import java.util.List;
@Component
public class GetBooks implements Command<List<Book>>{
    private final BookService bookService;

    public GetBooks(BookService bookService, BookService bookService1) {
        this.bookService = bookService1;
    }

    @Override
    public List<Book> execute() {
        return bookService.getAllBooks();
    }
}
