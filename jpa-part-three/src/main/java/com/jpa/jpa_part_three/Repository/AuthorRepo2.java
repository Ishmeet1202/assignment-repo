package com.jpa.jpa_part_three.Repository;

import com.jpa.jpa_part_three.Model.Author2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo2 extends JpaRepository<Author2,Long> {
}
