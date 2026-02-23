package com.jpa.jpa_part_three.Repository;

import com.jpa.jpa_part_three.Model.Author3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo3 extends JpaRepository<Author3,Long> {
}
