package com.example.librarylastversion.repository;

import com.example.librarylastversion.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findByTitleContainingOrAuthor_NameContaining(String title, String authorName);

}
