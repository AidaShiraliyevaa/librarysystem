package com.example.librarylastversion.service;

import com.example.librarylastversion.entity.RentalEntity;
import com.example.librarylastversion.repository.RentalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RentalService {
    private final RentalRepository rentalRepository;

    public RentalService(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    public List<RentalEntity> getAllRentals() {
        return rentalRepository.findAll();
    }

    public RentalEntity rentBook(RentalEntity rental) {
        rental.setRentalDate(LocalDate.now());
        return rentalRepository.save(rental);
    }

    public RentalEntity returnBook(RentalEntity rental) {
        rental.setReturnDate(LocalDate.now());
        return rentalRepository.save(rental);
    }
}
