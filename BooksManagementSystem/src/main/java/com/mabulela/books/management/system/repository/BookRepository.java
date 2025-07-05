package com.mabulela.books.management.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mabulela.books.management.system.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
	
	List<BookEntity> findByBookName(String bookName);
	boolean existsByBookName(String bookName);


}
