package com.example.BookAuthor.Service;

import com.example.mockAssignment.Convertors.Convertor;
import com.example.mockAssignment.models.Author;
import com.example.mockAssignment.models.Book;
import com.example.mockAssignment.models.Publish;
import com.example.mockAssignment.repository.AuthorRepository;
import com.example.mockAssignment.repository.BookRepository;
import com.example.mockAssignment.requestDtos.BookDto;
import com.example.mockAssignment.service.interfaces.BookServiceIntr;
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
