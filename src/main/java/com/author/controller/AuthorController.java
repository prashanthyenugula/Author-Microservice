package com.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.author.model.Author;
import com.author.service.IAuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	IAuthorService authorService;
	
	@PostMapping("/author")
	Integer createAuthor(@RequestBody Author author) {
		Integer id = authorService.saveAuthor(author);
		System.out.println(id);
		return id;
	}

}
