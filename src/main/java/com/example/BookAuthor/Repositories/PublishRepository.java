package com.example.BookAuthor.Repositories;


import com.example.BookAuthor.Models.Publish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishRepository extends JpaRepository<Publish,Integer> {

}
