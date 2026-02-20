package com.jpa.jpa_part_two.repository;

import com.jpa.jpa_part_two.model.Trainee2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinedTraineeRepo extends JpaRepository<Trainee2,Long> {
}
