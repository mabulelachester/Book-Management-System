package com.mabulela.books.management.system.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mabulela.books.management.system.entity.BookEntity;
import com.mabulela.books.management.system.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class BookController {
	
	final BookService bookService;

	public BookController(BookService bookService) {
	
		this.bookService = bookService;
	}
	
	@PostMapping("/addBook")
	
	public ResponseEntity<BookEntity> addBook(@Valid @RequestBody BookEntity book){
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.addBook(book));
	}
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<BookEntity>> findAllBooks(){
		 return ResponseEntity.ok(bookService.findAllBooks());
	}
	@GetMapping("/findByBookName/{bookName}")
	public ResponseEntity<List<BookEntity>> findByBookName(@PathVariable String bookName){
		return ResponseEntity.ok(bookService.findByBookName(bookName));
	}
	@GetMapping("/findByBookId/{bookId}")
	public ResponseEntity<BookEntity> findByBookId(@PathVariable Long bookId){
		return ResponseEntity.ok(bookService.findByBookId(bookId));
	}
	@PutMapping("/updateById/{bookId}")
	public ResponseEntity<BookEntity> updateByBookId(@PathVariable Long bookId,@Valid @RequestBody BookEntity book){
		return ResponseEntity.ok(bookService.updateByBookId(bookId, book));
	}
	
	@DeleteMapping("/deleteByBookId/{bookId}")
	
	public ResponseEntity<?> deleteByBookId(@PathVariable Long bookId){
		bookService.deleteById(bookId);
		return ResponseEntity.noContent().build();
	}
	

}
