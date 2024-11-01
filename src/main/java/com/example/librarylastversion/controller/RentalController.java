package com.example.librarylastversion.controller;

import com.example.librarylastversion.entity.RentalEntity;
import com.example.librarylastversion.service.RentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {
    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping
    public List<RentalEntity> getAllRentals() {
        return rentalService.getAllRentals();
    }

    @PostMapping("/rent")
    public RentalEntity rentBook(@RequestBody RentalEntity rental) {
        return rentalService.rentBook(rental);
    }

    @PostMapping("/return")
    public RentalEntity returnBook(@RequestBody RentalEntity rental) {
        return rentalService.returnBook(rental);
    }
}
