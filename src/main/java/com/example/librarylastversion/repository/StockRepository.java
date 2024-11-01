package com.example.librarylastversion.repository;

import com.example.librarylastversion.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<StockEntity, Long> {
}
