package com.example.BookAuthor.Controller;

import com.example.mockAssignment.requestDtos.AuthorDto;
import com.example.mockAssignment.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/addauthor")
    public ResponseEntity<String> addAuthor(@RequestBody AuthorDto authorDto) {
        String response = authorService.addAuthor(authorDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }