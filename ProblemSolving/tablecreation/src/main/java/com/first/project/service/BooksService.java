package com.first.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.project.entity.Books;
import com.first.project.entity.Genres;
import com.first.project.repo.BooksRepo;
import com.first.project.repo.GenresRepo;

@Service
public class BooksService {

	@Autowired
	BooksRepo bookRepo;

	@Autowired
	GenresRepo genRepo;

	public List<Books> getAll() {
		List<Books> allBooks = bookRepo.findAll();
		return allBooks;
	}

	public void insertBook(Books book) {

		bookRepo.save(book);
	}

	public void insertGenrs(Genres gen) {
		genRepo.save(gen);
	}
}
