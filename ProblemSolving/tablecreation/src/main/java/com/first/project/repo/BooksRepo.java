package com.first.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.project.entity.Books;

public interface BooksRepo extends JpaRepository<Books, Integer> {

}
