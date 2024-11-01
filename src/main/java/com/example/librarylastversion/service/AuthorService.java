package com.example.librarylastversion.service;

import com.example.librarylastversion.entity.AuthorEntity;
import com.example.librarylastversion.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorEntity> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AuthorEntity createAuthor(AuthorEntity author) {
        return authorRepository.save(author);
    }
}
