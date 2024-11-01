package com.example.librarylastversion.controller;

import com.example.librarylastversion.dto.BookDTO;
import com.example.librarylastversion.entity.BookEntity;
import com.example.librarylastversion.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public BookEntity createBook(@RequestBody BookEntity book) {
        return bookService.createBook(book);
    }

    @GetMapping("/search")
    public List<BookEntity> searchBooks(@RequestParam String keyword) {
        return bookService.searchBooksByTitleOrAuthor(keyword);
    }
}
