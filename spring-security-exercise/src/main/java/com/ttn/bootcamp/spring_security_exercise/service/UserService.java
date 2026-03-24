package com.ttn.bootcamp.spring_security_exercise.service;

import com.ttn.bootcamp.spring_security_exercise.dto.request.UserRegisterDto;
import com.ttn.bootcamp.spring_security_exercise.dto.response.UserRegistrationResponseDto;
import com.ttn.bootcamp.spring_security_exercise.entity.UserEntity;
import com.ttn.bootcamp.spring_security_exercise.enums.Role;
import com.ttn.bootcamp.spring_security_exercise.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository=userRepository;
        this.passwordEncoder= passwordEncoder;
    }

    public UserRegistrationResponseDto register(UserRegisterDto userRegisterDto, Role role){

        if(userRepository.findUserByUserName(userRegisterDto.getUserName()).isPresent()){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Username already exists");
        }

        UserEntity user = new UserEntity();
        user.setUserName(userRegisterDto.getUserName());
        user.setPassword(passwordEncoder.encode(userRegisterDto.getPassword()));
        user.setRole(role);

        UserEntity savedUser = userRepository.save(user);
        return new UserRegistrationResponseDto(
                savedUser.getId(),
                savedUser.getUserName(),
                savedUser.getRole().name(),
                "User registered successfully"
        );
    }
}
