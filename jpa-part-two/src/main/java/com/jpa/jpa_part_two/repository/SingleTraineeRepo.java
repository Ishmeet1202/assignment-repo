package com.jpa.jpa_part_two.repository;

import com.jpa.jpa_part_two.model.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingleTraineeRepo extends JpaRepository<Trainee,Long> {
}
