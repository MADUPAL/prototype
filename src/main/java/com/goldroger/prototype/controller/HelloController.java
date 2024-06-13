package com.goldroger.prototype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goldroger.prototype.repository.BookRepository;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/")
public class HelloController {
	
	private final BookRepository bookRepository;

    @Autowired
    public HelloController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
	
	
}
