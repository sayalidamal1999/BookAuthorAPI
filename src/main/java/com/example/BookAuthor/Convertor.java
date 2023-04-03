package com.example.BookAuthor;


import com.example.BookAuthor.DTOs.AuthorDto;
import com.example.BookAuthor.DTOs.BookDto;
import com.example.BookAuthor.Models.Author;
import com.example.BookAuthor.Models.Book;

public class Convertor {
    public static Book convertDtoToBook(BookDto bookDto){
        Book book = Book.builder().bookName(bookDto.getBookName()).pages(bookDto.getPages()).build();
        return book;
    }
    public static Author convertDtoToAuthor(AuthorDto authorDto){
        Author author = Author.builder().name(authorDto.getName()).gender(authorDto.getGender())
                .age(authorDto.getAge()).rating(authorDto.getRating()).build();
        return author;
    }
}
