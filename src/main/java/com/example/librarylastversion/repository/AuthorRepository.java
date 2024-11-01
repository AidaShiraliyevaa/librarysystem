package com.example.librarylastversion.repository;

import com.example.librarylastversion.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
