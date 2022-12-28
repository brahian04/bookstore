package com.brahian.bookstore.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brahian.bookstore.entity.Book;
import com.brahian.bookstore.repository.BookRepository;

@Service
public class BookServiceImplementation implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public boolean deleteBookById(int id) {
        return getBookById(id).map(book ->{
            bookRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
    
}
