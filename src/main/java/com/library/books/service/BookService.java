package com.library.books.service;

import java.util.List;
import com.library.books.entity.Book;
import com.library.books.exception.BookNotFoundException;


public interface BookService {

	
	public Book saveBooks(Book book);

	public List<Book> getBooks();

	public Book getBookbyId(Long bookId) throws BookNotFoundException;

	public List<Book> getBooksbyName(String bookName);

	public List<Book> getBooksbyAuthor(String author);

	public Book editBookbyId(Long bookId, Book book);
	
	public void deleteBookbyId(Long bookId);

	public List<Book> getBookbyIsbn(String isbn);

	
}
