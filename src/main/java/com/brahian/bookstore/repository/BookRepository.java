package com.brahian.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brahian.bookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
    
}
