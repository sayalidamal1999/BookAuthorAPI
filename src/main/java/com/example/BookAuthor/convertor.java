package com.example.BookAuthor;

import com.example.mockAssignment.models.Author;
import com.example.mockAssignment.models.Book;
import com.example.mockAssignment.requestDtos.AuthorDto;
import com.example.mockAssignment.requestDtos.BookDto;

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
