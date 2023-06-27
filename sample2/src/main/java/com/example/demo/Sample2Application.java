package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Book;

@SpringBootApplication
@RestController
public class Sample2Application {
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks(){
		return Stream.of(new Book(101,"Java",999),new Book(102,"Spring",1199),new Book(103,"Hibernate",445),new Book(104,"Angular",888)).collect(Collectors.toList());
		
	
	
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample2Application.class, args);
	}

}