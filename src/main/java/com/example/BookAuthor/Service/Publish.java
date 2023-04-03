package com.example.BookAuthor.Service;


import com.example.BookAuthor.Repositories.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishService implements PublishServiceIntr {
    @Autowired
    PublishRepository publishRepository;
}
