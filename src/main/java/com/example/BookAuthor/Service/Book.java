package com.example.BookAuthor.Service;


import com.example.BookAuthor.Convertor;
import com.example.BookAuthor.DTOs.BookDto;
import com.example.BookAuthor.Models.Author;
import com.example.BookAuthor.Models.Book;
import com.example.BookAuthor.Models.Publish;
import com.example.BookAuthor.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements BookServiceIntr {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addBook(BookDto bookDto) {
        Book book = Convertor.convertDtoToBook(bookDto);
        Author author = authorRepository.findById(bookDto.getAuthorId()).get();
        book.setAuthor(author);
        Publish publish =  new Publish();
        publish.setYear(bookDto.getYear());
        publish.setAuthor(author);
        publish.setBook(book);

        authorRepository.save(author);
        return "Book saved";

    }
}
