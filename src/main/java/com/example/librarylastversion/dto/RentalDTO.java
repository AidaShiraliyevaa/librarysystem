package com.example.librarylastversion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalDTO {
    private Long id;
    private UserDTO user;
    private BookDTO book;
    private LocalDate rentalDate;
    private LocalDate returnDate;
}
