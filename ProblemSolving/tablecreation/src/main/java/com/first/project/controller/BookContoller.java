package com.first.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.project.entity.Books;
import com.first.project.entity.Genres;
import com.first.project.service.BooksService;

@RestController
@RequestMapping("/books")
public class BookContoller {

	@Autowired
	BooksService bookService;

	@GetMapping("/get")
	public List<Books> getAll() {
		List<Books> bookDetails = bookService.getAll();
		return bookDetails;
	}

	@PostMapping("/insert")
	public String insertBook(@RequestBody Books book) {
		bookService.insertBook(book);
		return "Successfully Inserted";
	}

	@PostMapping("/insertGen")
	public String insertGenres(@RequestBody Genres gen) {

		bookService.insertGenrs(gen);
		return "SuccessFully inserted";
	}

}
