package com.jpa.jpa_part_three.Service;

import com.jpa.jpa_part_three.Model.Author3;
import com.jpa.jpa_part_three.Model.Book3;
import com.jpa.jpa_part_three.Repository.AuthorRepo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorManyToMany {
    @Autowired
    AuthorRepo3 repo;

    public Author3 save(Author3 author) {
        for(Book3 b : author.getBooks()){
            if (b.getAuthors() == null) {
                b.setAuthors(new java.util.ArrayList<>());
            }

            b.getAuthors().add(author);
        }
        return repo.save(author);
    }
    public List<Author3> getAll()
    {
        return repo.findAll();
    }
}
