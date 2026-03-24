package com.ttn.bootcamp.spring_security_exercise.repository;


import com.ttn.bootcamp.spring_security_exercise.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findUserByUserName(String userName);
}
