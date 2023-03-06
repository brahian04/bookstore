package com.brahian.bookstore.service;

import java.util.List;
import java.util.Optional;

import com.brahian.bookstore.entity.Book;

public interface BookService {
    
    public Book createBook(Book book);
    public boolean updateBook(int id, Book bookDetail);
    public List<Book> getAllBooks();
    public Optional<Book> getBookById(int id);
    public boolean deleteBookById(int id);
}
