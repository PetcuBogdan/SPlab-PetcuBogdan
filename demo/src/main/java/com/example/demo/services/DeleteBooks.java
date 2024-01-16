package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.Book;

@Service
public class DeleteBooks implements Command<Void>{
    private Book book;
    private final BookService bookService;
    Long Id;

    public DeleteBooks(BookService bookService) {
        this.bookService = bookService;
    }


    @Override
    public Void execute() {
        bookService.deleteBook(Id);
        return null;
    }
    public void setAtribute(Long id){
        this.Id = id;
    }
}
