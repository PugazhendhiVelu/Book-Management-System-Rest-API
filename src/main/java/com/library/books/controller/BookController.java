package com.library.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.books.entity.Book;
import com.library.books.exception.BookNotFoundException;
import com.library.books.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/")
	public Book saveBooks(@RequestBody Book book) {
		return bookservice.saveBooks(book);
	}
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookservice.getBooks();
	}
	
	@GetMapping("/book/{id}")
	public Book getBookbyId(@PathVariable("id") Long bookId) throws BookNotFoundException {
		return bookservice.getBookbyId(bookId);
	}
	
	@GetMapping("/books/name/{name}")
	public List<Book> getBooksbyName(@PathVariable("name") String bookName){
		return bookservice.getBooksbyName(bookName);
	}
	
	@GetMapping("/books/author/{author}")
	public List<Book> getBooksbyAuthor(@PathVariable("author") String author){
		return bookservice.getBooksbyAuthor(author);
	}
	
	@GetMapping("/book/isbn/{isbn}")
	public List<Book> getBookbyIsbn(@PathVariable("isbn") String isbn){
		return bookservice.getBookbyIsbn(isbn);
	}
	@PutMapping("/book/{id}")
	public Book editBookbyId(@PathVariable("id") Long bookId ,@RequestBody Book book) {
		return bookservice.editBookbyId(bookId,book);
	}
	
	@DeleteMapping("/book/{id}")
	public String deleteBookbyId(@PathVariable("id") Long bookId) {
		bookservice.deleteBookbyId(bookId);
		String result = "Book Id : "+bookId+" is deleted from our store successfully";
		return result;
	}
}
