package com.example.BookAuthor.Controller;

import com.example.mockAssignment.requestDtos.BookDto;
import com.example.mockAssignment.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/addbook")
    public ResponseEntity<String> addBook(@RequestBody BookDto bookDto) {
        String response = bookService.addBook(bookDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
