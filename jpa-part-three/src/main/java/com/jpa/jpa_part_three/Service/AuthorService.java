package com.jpa.jpa_part_three.Service;

import com.jpa.jpa_part_three.Model.Author;
import com.jpa.jpa_part_three.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo repo;

    public Author save(Author author) {
        return repo.save(author);
    }
    public List<Author> getAll()
    {
        return repo.findAll();
    }
}