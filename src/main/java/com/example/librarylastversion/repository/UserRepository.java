package com.example.librarylastversion.repository;

import com.example.librarylastversion.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
