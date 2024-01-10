package com.example.demo.controller;
import com.example.demo.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.models.*;
import com.example.demo.services.*;


import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/books")
public class BooksController {
    private List<Book> books = new ArrayList<>();
    private final GetBooks getBooks;
    private final GetBookById getBookById;
    private final UpdateBook updateBook;
    private final DeleteBooks deleteBooks;
    private final AddBooks addBooks;
    public BooksController(GetBooks getBooks, GetBookById getBookById, UpdateBook updateBook, DeleteBooks deleteBooks, AddBooks addBooks){
        this.getBooks = getBooks;
        this.getBookById = getBookById;
        this.updateBook = updateBook;
        this.deleteBooks = deleteBooks;
        this.addBooks = addBooks;
    }

    @GetMapping("/books")
    public List<Book> getBooks() {

        return List.of(new Book("Ion"));
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        System.out.println("Get id: " + id);
        return new Book("Fram ursul polar.");
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {

        return new Book(book.title);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable int id) {
        System.out.println("Update id: " + id);
        return new Book(book.title);
    }

    @DeleteMapping("/books/{id}")
    public HttpStatus deleteBook(@PathVariable int id) {
        System.out.println("Delete id: " + id);
        return HttpStatus.OK;

    }
}


