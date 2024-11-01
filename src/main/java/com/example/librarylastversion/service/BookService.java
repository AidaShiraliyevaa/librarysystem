package com.example.librarylastversion.service;

import com.example.librarylastversion.dto.AuthorDTO;
import com.example.librarylastversion.dto.BookDTO;
import com.example.librarylastversion.entity.BookEntity;
import com.example.librarylastversion.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookEntity createBook(BookEntity book) {
        return bookRepository.save(book);
    }

    public List<BookEntity> searchBooksByTitleOrAuthor(String keyword) {
        return bookRepository.findByTitleContainingOrAuthor_NameContaining(keyword, keyword);
    }

    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(this::convertToBookDTO)
                .collect(Collectors.toList());
    }

    private BookDTO convertToBookDTO(BookEntity book) {
        return new BookDTO(
                book.getId(),
                book.getTitle(),
                new AuthorDTO(book.getAuthor().getId(), book.getAuthor().getName()),
                book.getStock()
        );
    }

    public BookEntity convertToBookEntity(BookDTO bookDTO) {
        BookEntity book = new BookEntity();
        book.setId(bookDTO.getId());
        book.setTitle(bookDTO.getTitle());
        book.setStock(bookDTO.getStock());
        return book;
    }
}
