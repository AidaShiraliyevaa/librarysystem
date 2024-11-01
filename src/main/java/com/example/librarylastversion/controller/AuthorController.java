package com.example.librarylastversion.controller;

import com.example.librarylastversion.entity.AuthorEntity;
import com.example.librarylastversion.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<AuthorEntity> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public AuthorEntity createAuthor(@RequestBody AuthorEntity author) {
        return authorService.createAuthor(author);
    }
}
