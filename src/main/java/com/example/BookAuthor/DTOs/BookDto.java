package com.example.BookAuthor.DTOs;

import lombok.Data;

@Data
public class BookDto {

    private String bookName;

    private int pages;

    private int authorId;

    private int year;

}
