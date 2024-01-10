package com.example.demo.services;

import com.example.demo.models.Book;
import org.springframework.stereotype.Component;

@Component
public class GetBookById implements Command<Book>{
    private final BookService contextBooks;
    Long id;

    public GetBookById(BookService contextBooks) {
        this.contextBooks = contextBooks;
    }

    @Override
    public Book execute() {
        return contextBooks.getBookById(id);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
