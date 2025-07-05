package com.mabulela.books.management.system.service;

import java.util.List;

import com.mabulela.books.management.system.entity.BookEntity;

public interface BookService {
	
	BookEntity addBook(BookEntity book);
	List<BookEntity> findAllBooks();
	BookEntity findByBookId(Long bookId);
	List<BookEntity> findByBookName(String bookName);
	BookEntity updateByBookId(Long bookId, BookEntity book);
	String deleteById(Long bookId);
	
 
}
