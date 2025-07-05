package com.mabulela.books.management.system.service;

import java.util.List;

import com.mabulela.books.management.system.exception.BadRequestException;
import org.springframework.stereotype.Service;

import com.mabulela.books.management.system.entity.BookEntity;
import com.mabulela.books.management.system.exception.BookNotFoundException;
import com.mabulela.books.management.system.exception.GlobalExceptionHandler;
import com.mabulela.books.management.system.repository.BookRepository;

import jakarta.validation.Valid;

@Service
public class BookServiceImpl implements BookService {

    private final GlobalExceptionHandler globalExceptionHandler;
	
	final BookRepository bookRepository;
	

	public BookServiceImpl(BookRepository bookRepository, GlobalExceptionHandler globalExceptionHandler) {
	
		this.bookRepository = bookRepository;
	
		this.globalExceptionHandler = globalExceptionHandler;
	}

	@Override
	public BookEntity addBook(BookEntity book) {
		if (bookRepository.existsByBookName(book.getBookName())) {
	        throw new BadRequestException("A book with the name '" + book.getBookName() + "' already exists.");
	    }
		
		
		return bookRepository.save(book);
		
	}

	@Override
	public List<BookEntity> findAllBooks() {
	
		return bookRepository.findAll();
	}

	@Override
	public BookEntity findByBookId(Long bookId) {
		
		BookEntity existingBook = bookRepository.findById(bookId)
				.orElseThrow(()-> new BookNotFoundException("book with id: " + bookId + "not found"));
		
		return existingBook;
	}

	@Override
	public List<BookEntity> findByBookName(String bookName) {
		
		
	
		return bookRepository.findByBookName(bookName);
	}

	@Override
	public BookEntity updateByBookId(@Valid Long bookId, BookEntity book) {
		BookEntity existingBook = bookRepository.findById(bookId).orElseThrow(()-> new BookNotFoundException("Book with id:" + bookId + "not found"));
		existingBook.setBookDescription(book.getBookDescription());
		existingBook.setBookName(book.getBookName());
		existingBook.setIsAvailable(book.getIsAvailable());
		return bookRepository.save(existingBook);
	}

	@Override
	public String deleteById(Long bookId) {
		BookEntity existingBook = bookRepository.findById(bookId)
				.orElseThrow( ()-> new BookNotFoundException("book with id: " + bookId + "not found"));
		
		bookRepository.deleteById(bookId);
		
		return "book got deleted Successfully";
	}

}
