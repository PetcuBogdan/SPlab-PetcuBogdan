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
    @GetMapping("/statistics")
    public ResponseEntity<?> printStatistics() {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.acceptVisitor(stats);
        stats.printStatistics();
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return getBooks.execute();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id) {
        this.getBookById.setId(id);
        return getBookById.execute();
    }

    @PostMapping("/books")
    public void createBook(@RequestBody Book book) {
        this.addBooks.setAtribute(book);
        addBooks.execute();
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
        this.updateBook.setId(id);
        return updateBook.execute();
    }

    @DeleteMapping("/books/{id}")
    public HttpStatus deleteBook(@PathVariable Long id) {
        this.deleteBook(id);
        this.deleteBooks.execute();
        return HttpStatus.OK;
    }
}


