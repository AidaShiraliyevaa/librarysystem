package com.example.librarylastversion.service;

import com.example.librarylastversion.entity.StockEntity;
import com.example.librarylastversion.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Optional<StockEntity> getStockByBookId(Long bookId) {
        return stockRepository.findById(bookId);
    }

    public StockEntity updateStock(StockEntity stock) {
        return stockRepository.save(stock);
    }
}
