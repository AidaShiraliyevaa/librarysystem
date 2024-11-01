package com.example.librarylastversion.controller;

import com.example.librarylastversion.entity.StockEntity;
import com.example.librarylastversion.service.StockService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{bookId}")
    public Optional<StockEntity> getStockByBookId(@PathVariable Long bookId) {
        return stockService.getStockByBookId(bookId);
    }

    @PutMapping
    public StockEntity updateStock(@RequestBody StockEntity stock) {
        return stockService.updateStock(stock);
    }
}
