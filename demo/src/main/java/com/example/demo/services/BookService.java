package com.example.demo.services;

import com.example.demo.models.BookRepository;
import org.springframework.stereotype.Service;
import com.example.demo.models.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private final BookRepository booksRepository;

    public BookService(BookRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Book saveBook(Book book)
    {
        book = booksRepository.save(book);
        return book;
    }

    public String deleteBook(Long id)
    {
        if (booksRepository.existsById(id)) {
            booksRepository.deleteById(id);
            return "Book deleted!";
        } else {
            return "Book not found with ID: " + id;
        }
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Book updateBook(Long id, Book updateBook) {
        if (booksRepository.existsById(id)) {
            Book existingBook = booksRepository.findById(id).get();
            existingBook.setTitle(updateBook.getTitle());
            booksRepository.save(existingBook);
            return existingBook;
        } else {
            return null;
        }
    }
    public Book getBookById(Long id) {
        return booksRepository.getReferenceById(id);
    }
}
