package com.example.BookAuthor.Models;

package com.example.mockAssignment.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String bookName;

    private int pages;

    @ManyToOne
    @JoinColumn
    private Author author;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private Publish publish;
}
