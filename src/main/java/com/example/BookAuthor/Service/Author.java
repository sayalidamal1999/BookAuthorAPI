package com.example.BookAuthor.Service;


import com.example.BookAuthor.Convertor;
import com.example.BookAuthor.DTOs.AuthorDto;
import com.example.BookAuthor.Models.Author;
import com.example.BookAuthor.Models.Book;
import com.example.BookAuthor.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements AuthorServiceIntr {
    @Autowired
    AuthorRepository authorRepository;
    @Override
    public String addAuthor(AuthorDto authorDto) {
        Author author = Convertor.convertDtoToAuthor(authorDto);
        authorRepository.save(author);
        return "Author added";
    }

    @Override
    public String authorWithMaxPages() {
        String authorName = "";
        int noOfPages = 0;
        List<Author> authorList = authorRepository.findAll();
        for(Author author : authorList){
            List<Book> bookList = author.getBookList();
            int countPage = 0;
            for(Book book : bookList){
                countPage += book.getPages();
            }
            if(countPage>noOfPages){
                noOfPages = countPage;
                authorName = author.getName();
            }
        }
        return authorName;
    }

    @Override
    public int booksPublishedByAuthorY(int authorId, int year) {
        int countOfBook = 0;
        Author author = authorRepository.findById(authorId).get();
        List<Book> bookList = author.getBookList();
        for(Book book : bookList){
            if(book.getPublish().getYear()==year){
                countOfBook++;
            }
        }
        return countOfBook;
    }
}
