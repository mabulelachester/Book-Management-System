package com.mabulela.books.management.system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tblbook", schema = "bookdb")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	@NotBlank(message = "Book Name is required")
	private String bookName;
	private String bookDescription;
	private Boolean isAvailable;
	public BookEntity(String bookName, String bookDescription, Boolean isAvailable) {
		
		this.bookName = bookName;
		this.bookDescription = bookDescription;
		this.isAvailable = isAvailable;
	}
	public BookEntity() {
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	
	
}
