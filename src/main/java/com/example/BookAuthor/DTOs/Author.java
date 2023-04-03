package com.example.BookAuthor.DTOs;

import lombok.Data;

@Data
public class AuthorDto {
    private String name;

    private int age;

    private String gender;

    private double rating;
}