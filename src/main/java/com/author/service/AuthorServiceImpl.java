package com.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.Author;

@Service
public class AuthorServiceImpl implements IAuthorService {
	
	@Autowired
	IAuthorRepository authorRepository;

	@Override
	public Integer saveAuthor(Author author) {
		Author savedAuthor = authorRepository.save(author);
		return savedAuthor.getId();
	}

}
