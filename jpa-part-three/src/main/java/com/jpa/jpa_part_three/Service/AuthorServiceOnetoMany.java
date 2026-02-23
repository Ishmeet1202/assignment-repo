package com.jpa.jpa_part_three.Service;

import com.jpa.jpa_part_three.Model.Author2;
import com.jpa.jpa_part_three.Repository.AuthorRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceOnetoMany {
    @Autowired
    AuthorRepo2 repo;

    public Author2 save(Author2 author) {
        return repo.save(author);
    }
    public List<Author2> getAll()
    {
        return repo.findAll();
    }
}
