package com.library.books.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.books.entity.Book;
import com.library.books.exception.BookNotFoundException;
import com.library.books.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookrepo;
	
	@Override
	public Book saveBooks(Book book) {
		return bookrepo.save(book);
	}
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}
	@Override
	public Book getBookbyId(Long bookId) throws BookNotFoundException{
		// TODO Auto-generated method stub
		Optional<Book> book =  bookrepo.findById(bookId);
		if(!book.isPresent()) {
			throw new BookNotFoundException("Book not found with this id : "+bookId);
		}
		return book.get();
	}
	@Override
	public List<Book> getBooksbyName(String bookName) {
		// TODO Auto-generated method stub
		return bookrepo.findByBookNameIgnoreCase(bookName);
	}
	@Override
	public List<Book> getBooksbyAuthor(String author) {
		// TODO Auto-generated method stub
		return bookrepo.findByAuthorIgnoreCase(author);		//ID name and this findBy"Id_name " should be same
	}
	
	@Override
	public List<Book> getBookbyIsbn(String isbn) {
		// TODO Auto-generated method stub
		return bookrepo.findByIsbn(isbn);
	}
	
	@Override
	public Book editBookbyId(Long bookId, Book book) {
		// TODO Auto-generated method stub
		Book bookdb = bookrepo.findById(bookId).get();
		String name = book.getBookName();
		String author = book.getAuthor();
		String isbn = book.getIsbn();
		Double price = book.getPrice();
		if(Objects.nonNull(name) && !"".equalsIgnoreCase(author)) {
			bookdb.setAuthor(author);
		}
		if(Objects.nonNull(name) && !"".equalsIgnoreCase(name)) {
			bookdb.setBookName(name);
		}
		if(Objects.nonNull(isbn) && !"".equalsIgnoreCase(isbn)) {
			bookdb.setIsbn(isbn);
		}
		if(price>0) {
			bookdb.setPrice(price);
		}
		return bookrepo.save(bookdb);
	}
	@Override
	public void deleteBookbyId(Long bookId) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(bookId);
		
	}
	
	

}
