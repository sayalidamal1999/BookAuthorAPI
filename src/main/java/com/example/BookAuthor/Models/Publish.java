package com.example.BookAuthor.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "publish")
public class Publish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int publishId;

    private int year;


    @ManyToOne
    @JoinColumn
    private Author author;

    @OneToOne
    @JoinColumn
    private Book book;

}
