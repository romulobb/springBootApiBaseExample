package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
