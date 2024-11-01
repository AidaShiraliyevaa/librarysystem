package com.example.librarylastversion.repository;

import com.example.librarylastversion.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalEntity, Long> {
}
