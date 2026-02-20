package com.jpa.jpa_part_two.repository;

import com.jpa.jpa_part_two.model.Trainee3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableWithClassRepo extends JpaRepository<Trainee3,Long> {
}
