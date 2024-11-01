package com.example.librarylastversion.entity;

import com.example.librarylastversion.entity.AuthorEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;

    private int stock;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

}
