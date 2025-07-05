package com.mabulela.books.management.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Book Management Application",description = "SpringBoot app for Book Management",
		contact = @Contact(name = "Chester Mabulela",email = "chestermabulela@gmail.com")),servers = @Server(url = "http://localhost:8084"))
public class BooksManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksManagementSystemApplication.class, args);
	}

}
