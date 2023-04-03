package com.example.BookAuthor.Service;

import com.example.mockAssignment.repository.PublishRepository;
import com.example.mockAssignment.service.interfaces.PublishServiceIntr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishService implements PublishServiceIntr {
    @Autowired
    PublishRepository publishRepository;
}
