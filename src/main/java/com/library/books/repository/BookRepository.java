package com.library.books.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.books.entity.Book;
@Repository
public interface BookRepository  extends JpaRepository<Book, Long>{


	public List<Book> findByBookNameIgnoreCase(String bookName);

	public List<Book> findByAuthorIgnoreCase(String author);

	public List<Book> findByIsbn(String isbn);
	

}
