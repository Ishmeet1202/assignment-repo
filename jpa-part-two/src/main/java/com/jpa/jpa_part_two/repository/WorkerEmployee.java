package com.jpa.jpa_part_two.repository;

import com.jpa.jpa_part_two.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerEmployee extends JpaRepository<Worker,Long> {

}
