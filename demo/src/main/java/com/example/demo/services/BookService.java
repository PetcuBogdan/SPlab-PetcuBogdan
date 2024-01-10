package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.models.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private Map<Long, Book> books = new HashMap<>();
    private long Id = 1;
    public Book save(Book book)
    {
        books.put(Id,book);
        return books.get(Id);
    }

    public void delete(Long bookId)
    {
        books.remove(bookId);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book update(Long bookId, Book updatedBook) {
        if (books.containsKey(bookId)) {
            books.put(bookId, updatedBook);
        }
        return updatedBook;
    }
    public Book getBookById(Long bookId) {
        return books.get(bookId);
    }
}
